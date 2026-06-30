package vr5;

/* loaded from: classes13.dex */
public abstract class c {
    public static byte[] a(tr5.g0 g0Var) {
        java.io.ObjectOutputStream objectOutputStream;
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        java.io.ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            try {
                objectOutputStream = new java.io.ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream.writeObject(g0Var);
                    objectOutputStream.flush();
                    try {
                        byteArrayOutputStream.close();
                        objectOutputStream.close();
                    } catch (java.io.IOException unused) {
                    }
                } catch (java.io.IOException unused2) {
                    byteArrayOutputStream2 = byteArrayOutputStream;
                    if (byteArrayOutputStream2 != null) {
                        try {
                            byteArrayOutputStream2.close();
                        } catch (java.io.IOException unused3) {
                            byteArrayOutputStream = byteArrayOutputStream2;
                            return byteArrayOutputStream.toByteArray();
                        }
                    }
                    if (objectOutputStream != null) {
                        objectOutputStream.close();
                    }
                    byteArrayOutputStream = byteArrayOutputStream2;
                    return byteArrayOutputStream.toByteArray();
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    byteArrayOutputStream2 = byteArrayOutputStream;
                    if (byteArrayOutputStream2 != null) {
                        try {
                            byteArrayOutputStream2.close();
                        } catch (java.io.IOException unused4) {
                            throw th;
                        }
                    }
                    if (objectOutputStream != null) {
                        objectOutputStream.close();
                    }
                    throw th;
                }
            } catch (java.io.IOException unused5) {
                objectOutputStream = null;
            } catch (java.lang.Throwable th7) {
                th = th7;
                objectOutputStream = null;
            }
        } catch (java.io.IOException unused6) {
            objectOutputStream = null;
        } catch (java.lang.Throwable th8) {
            th = th8;
            objectOutputStream = null;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static tr5.g0 b(byte[] bArr) {
        java.lang.Throwable th6;
        java.io.ObjectInputStream objectInputStream;
        java.io.ByteArrayInputStream byteArrayInputStream;
        java.io.ByteArrayInputStream byteArrayInputStream2;
        java.io.ByteArrayInputStream byteArrayInputStream3 = null;
        try {
            try {
                byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
                try {
                    objectInputStream = new java.io.ObjectInputStream(byteArrayInputStream);
                    try {
                        tr5.g0 g0Var = (tr5.g0) objectInputStream.readObject();
                        try {
                            byteArrayInputStream.close();
                            objectInputStream.close();
                        } catch (java.io.IOException unused) {
                        }
                        return g0Var;
                    } catch (java.io.IOException unused2) {
                        if (byteArrayInputStream != null) {
                            byteArrayInputStream.close();
                        }
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                        return null;
                    } catch (java.lang.ClassNotFoundException unused3) {
                        if (byteArrayInputStream != null) {
                            byteArrayInputStream.close();
                        }
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                        return null;
                    } catch (java.lang.Throwable th7) {
                        byteArrayInputStream2 = byteArrayInputStream;
                        th6 = th7;
                        byteArrayInputStream3 = byteArrayInputStream2;
                        if (byteArrayInputStream3 != null) {
                            try {
                                byteArrayInputStream3.close();
                            } catch (java.io.IOException unused4) {
                                throw th6;
                            }
                        }
                        if (objectInputStream == null) {
                            throw th6;
                        }
                        objectInputStream.close();
                        throw th6;
                    }
                } catch (java.io.IOException unused5) {
                    objectInputStream = null;
                } catch (java.lang.ClassNotFoundException unused6) {
                    objectInputStream = null;
                } catch (java.lang.Throwable th8) {
                    byteArrayInputStream2 = byteArrayInputStream;
                    th6 = th8;
                    objectInputStream = null;
                }
            } catch (java.io.IOException unused7) {
                return null;
            }
        } catch (java.io.IOException unused8) {
            objectInputStream = null;
            byteArrayInputStream = null;
        } catch (java.lang.ClassNotFoundException unused9) {
            objectInputStream = null;
            byteArrayInputStream = null;
        } catch (java.lang.Throwable th9) {
            th6 = th9;
            objectInputStream = null;
        }
    }
}
