package j5;

/* loaded from: classes13.dex */
public abstract class l0 {
    public static a5.h a(byte[] bArr) {
        java.io.ObjectInputStream objectInputStream;
        java.lang.Throwable th6;
        a5.h hVar = new a5.h();
        if (bArr == null) {
            return hVar;
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
        java.io.ObjectInputStream objectInputStream2 = null;
        try {
            try {
                objectInputStream = new java.io.ObjectInputStream(byteArrayInputStream);
            } catch (java.io.IOException unused) {
            }
            try {
                for (int readInt = objectInputStream.readInt(); readInt > 0; readInt--) {
                    ((java.util.HashSet) hVar.f1396a).add(new a5.g(android.net.Uri.parse(objectInputStream.readUTF()), objectInputStream.readBoolean()));
                }
                objectInputStream.close();
            } catch (java.io.IOException unused2) {
                objectInputStream2 = objectInputStream;
                if (objectInputStream2 != null) {
                    objectInputStream2.close();
                }
                byteArrayInputStream.close();
            } catch (java.lang.Throwable th7) {
                th6 = th7;
                if (objectInputStream != null) {
                    try {
                        objectInputStream.close();
                    } catch (java.io.IOException unused3) {
                    }
                }
                try {
                    byteArrayInputStream.close();
                    throw th6;
                } catch (java.io.IOException unused4) {
                    throw th6;
                }
            }
        } catch (java.io.IOException unused5) {
        } catch (java.lang.Throwable th8) {
            objectInputStream = null;
            th6 = th8;
        }
        try {
            byteArrayInputStream.close();
        } catch (java.io.IOException unused6) {
            return hVar;
        }
    }

    public static a5.a b(int i17) {
        if (i17 == 0) {
            return a5.a.EXPONENTIAL;
        }
        if (i17 == 1) {
            return a5.a.LINEAR;
        }
        throw new java.lang.IllegalArgumentException("Could not convert " + i17 + " to BackoffPolicy");
    }

    public static a5.b0 c(int i17) {
        if (i17 == 0) {
            return a5.b0.NOT_REQUIRED;
        }
        if (i17 == 1) {
            return a5.b0.CONNECTED;
        }
        if (i17 == 2) {
            return a5.b0.UNMETERED;
        }
        if (i17 == 3) {
            return a5.b0.NOT_ROAMING;
        }
        if (i17 == 4) {
            return a5.b0.METERED;
        }
        if (android.os.Build.VERSION.SDK_INT >= 30 && i17 == 5) {
            return a5.b0.TEMPORARILY_UNMETERED;
        }
        throw new java.lang.IllegalArgumentException("Could not convert " + i17 + " to NetworkType");
    }

    public static a5.k0 d(int i17) {
        if (i17 == 0) {
            return a5.k0.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i17 == 1) {
            return a5.k0.DROP_WORK_REQUEST;
        }
        throw new java.lang.IllegalArgumentException("Could not convert " + i17 + " to OutOfQuotaPolicy");
    }

    public static a5.q0 e(int i17) {
        if (i17 == 0) {
            return a5.q0.ENQUEUED;
        }
        if (i17 == 1) {
            return a5.q0.RUNNING;
        }
        if (i17 == 2) {
            return a5.q0.SUCCEEDED;
        }
        if (i17 == 3) {
            return a5.q0.FAILED;
        }
        if (i17 == 4) {
            return a5.q0.BLOCKED;
        }
        if (i17 == 5) {
            return a5.q0.CANCELLED;
        }
        throw new java.lang.IllegalArgumentException("Could not convert " + i17 + " to State");
    }

    public static int f(a5.q0 q0Var) {
        int ordinal = q0Var.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i17 = 1;
        if (ordinal != 1) {
            i17 = 2;
            if (ordinal != 2) {
                i17 = 3;
                if (ordinal != 3) {
                    i17 = 4;
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return 5;
                        }
                        throw new java.lang.IllegalArgumentException("Could not convert " + q0Var + " to int");
                    }
                }
            }
        }
        return i17;
    }
}
