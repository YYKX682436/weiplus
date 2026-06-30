package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes15.dex */
public interface v extends android.os.IInterface {

    /* loaded from: classes8.dex */
    public static abstract class a extends android.os.Binder implements com.tencent.tmsqmsp.oaid2.v {
        public static com.tencent.tmsqmsp.oaid2.v a(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.zui.deviceidservice.IDeviceidInterface");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof com.tencent.tmsqmsp.oaid2.v)) ? new com.tencent.tmsqmsp.oaid2.w1(iBinder) : (com.tencent.tmsqmsp.oaid2.v) queryLocalInterface;
        }
    }

    java.lang.String b();

    java.lang.String c(java.lang.String str);

    boolean c();
}
