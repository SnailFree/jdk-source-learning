package org.omg.IOP;

/**
* org/omg/IOP/ServiceContextHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from d:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u40/2855/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Tuesday, February 10, 2015 9:55:25 PM PST
*/

public final class ServiceContextHolder implements org.omg.CORBA.portable.Streamable
{
  public ServiceContext value = null;

  public ServiceContextHolder ()
  {
  }

  public ServiceContextHolder (ServiceContext initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ServiceContextHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ServiceContextHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ServiceContextHelper.type ();
  }

}