package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes8.dex */
public interface q0 extends android.os.IInterface {

    /* loaded from: classes8.dex */
    public static abstract class a extends android.os.Binder implements com.tencent.tmsqmsp.oaid2.q0 {
        public static com.tencent.tmsqmsp.oaid2.q0 a(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.samsung.android.deviceidservice.IDeviceIdService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof com.tencent.tmsqmsp.oaid2.q0)) ? new com.tencent.tmsqmsp.oaid2.s1(iBinder) : (com.tencent.tmsqmsp.oaid2.q0) queryLocalInterface;
        }
    }

    java.lang.String a();

    java.lang.String a(java.lang.String str);
}
