package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes8.dex */
public interface u extends android.os.IInterface {

    /* loaded from: classes8.dex */
    public static abstract class a extends android.os.Binder implements com.tencent.tmsqmsp.oaid2.u {
        public static com.tencent.tmsqmsp.oaid2.u a(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof com.tencent.tmsqmsp.oaid2.u)) ? new com.tencent.tmsqmsp.oaid2.v1(iBinder) : (com.tencent.tmsqmsp.oaid2.u) queryLocalInterface;
        }
    }

    boolean h();

    java.lang.String m();
}
