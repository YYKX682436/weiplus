package com.tencent.mm.plugin.webview.stub;

/* loaded from: classes8.dex */
public abstract class g extends android.os.Binder implements com.tencent.mm.plugin.webview.stub.h {
    public g() {
        attachInterface(this, "com.tencent.mm.plugin.webview.stub.OnSceneEnd_AIDL");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.mm.plugin.webview.stub.OnSceneEnd_AIDL");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.mm.plugin.webview.stub.OnSceneEnd_AIDL");
            return true;
        }
        if (i17 == 1) {
            int i19 = ((com.tencent.mm.plugin.webview.stub.n0) this).f183552d;
            parcel2.writeNoException();
            parcel2.writeInt(i19);
        } else if (i17 == 2) {
            int i27 = ((com.tencent.mm.plugin.webview.stub.n0) this).f183553e;
            parcel2.writeNoException();
            parcel2.writeInt(i27);
        } else if (i17 == 3) {
            int i28 = ((com.tencent.mm.plugin.webview.stub.n0) this).f183554f;
            parcel2.writeNoException();
            parcel2.writeInt(i28);
        } else if (i17 == 4) {
            java.lang.String str = ((com.tencent.mm.plugin.webview.stub.n0) this).f183555g;
            parcel2.writeNoException();
            parcel2.writeString(str);
        } else {
            if (i17 != 5) {
                return super.onTransact(i17, parcel, parcel2, i18);
            }
            android.os.Bundle bundle = ((com.tencent.mm.plugin.webview.stub.n0) this).f183556h;
            parcel2.writeNoException();
            if (bundle != null) {
                parcel2.writeInt(1);
                bundle.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
        }
        return true;
    }
}
