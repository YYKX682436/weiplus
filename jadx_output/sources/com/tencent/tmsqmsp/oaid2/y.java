package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes15.dex */
public interface y extends android.os.IInterface {

    /* loaded from: classes8.dex */
    public static abstract class a extends android.os.Binder implements com.tencent.tmsqmsp.oaid2.y {
        public static com.tencent.tmsqmsp.oaid2.y a(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bun.lib.MsaIdInterface");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof com.tencent.tmsqmsp.oaid2.y)) ? new com.tencent.tmsqmsp.oaid2.y1(iBinder) : (com.tencent.tmsqmsp.oaid2.y) queryLocalInterface;
        }
    }

    java.lang.String a();

    boolean c();

    java.lang.String d();

    void f();

    boolean g();
}
