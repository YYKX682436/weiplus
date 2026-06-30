package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes8.dex */
public interface g extends android.os.IInterface {

    /* loaded from: classes8.dex */
    public static abstract class a extends android.os.Binder implements com.tencent.tmsqmsp.oaid2.g {
        public static com.tencent.tmsqmsp.oaid2.g a(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.coolpad.deviceidsupport.IDeviceIdManager");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof com.tencent.tmsqmsp.oaid2.g)) ? new com.tencent.tmsqmsp.oaid2.l1(iBinder) : (com.tencent.tmsqmsp.oaid2.g) queryLocalInterface;
        }
    }

    java.lang.String a(java.lang.String str);

    java.lang.String b(java.lang.String str);
}
