package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/IORInterceptor_3_0Helper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/jenkins/workspace/8-2-build-windows-amd64-cygwin/jdk8u311/1894/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Monday, September 27, 2021 5:16:47 AM PDT
*/

abstract public class IORInterceptor_3_0Helper
{
  private static String  _id = "IDL:omg.org/PortableInterceptor/IORInterceptor_3_0:1.0";

  public static void insert (org.omg.CORBA.Any a, org.omg.PortableInterceptor.IORInterceptor_3_0 that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.omg.PortableInterceptor.IORInterceptor_3_0 extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (org.omg.PortableInterceptor.IORInterceptor_3_0Helper.id (), "IORInterceptor_3_0");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.omg.PortableInterceptor.IORInterceptor_3_0 read (org.omg.CORBA.portable.InputStream istream)
  {
      throw new org.omg.CORBA.MARSHAL ();
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.omg.PortableInterceptor.IORInterceptor_3_0 value)
  {
      throw new org.omg.CORBA.MARSHAL ();
  }

  public static org.omg.PortableInterceptor.IORInterceptor_3_0 narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof org.omg.PortableInterceptor.IORInterceptor_3_0)
      return (org.omg.PortableInterceptor.IORInterceptor_3_0)obj;
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  public static org.omg.PortableInterceptor.IORInterceptor_3_0 unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof org.omg.PortableInterceptor.IORInterceptor_3_0)
      return (org.omg.PortableInterceptor.IORInterceptor_3_0)obj;
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

}
