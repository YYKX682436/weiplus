package com.tencent.mm.plugin.lite.api;

/* loaded from: classes14.dex */
public class LiteAppHalfScreenStatusChangeListener implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener> CREATOR = new com.tencent.mm.plugin.lite.api.l();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Boolean f143418d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.ResultReceiver f143419e;

    public LiteAppHalfScreenStatusChangeListener(java.lang.Boolean bool) {
        this.f143418d = bool;
        this.f143419e = new android.os.ResultReceiver(new android.os.Handler(android.os.Looper.getMainLooper())) { // from class: com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener.1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i17, android.os.Bundle bundle) {
                if (bundle != null) {
                    int ordinal = com.tencent.mm.plugin.lite.api.m.values()[bundle.getInt("KEY_ACTION", 0)].ordinal();
                    com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener liteAppHalfScreenStatusChangeListener = com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener.this;
                    switch (ordinal) {
                        case 1:
                            liteAppHalfScreenStatusChangeListener.h();
                            return;
                        case 2:
                            liteAppHalfScreenStatusChangeListener.g();
                            return;
                        case 3:
                            liteAppHalfScreenStatusChangeListener.c();
                            return;
                        case 4:
                            liteAppHalfScreenStatusChangeListener.b();
                            return;
                        case 5:
                            liteAppHalfScreenStatusChangeListener.getClass();
                            return;
                        case 6:
                            liteAppHalfScreenStatusChangeListener.e();
                            return;
                        case 7:
                            liteAppHalfScreenStatusChangeListener.n();
                            return;
                        case 8:
                            liteAppHalfScreenStatusChangeListener.getClass();
                            return;
                        case 9:
                            liteAppHalfScreenStatusChangeListener.getClass();
                            return;
                        case 10:
                            liteAppHalfScreenStatusChangeListener.getClass();
                            return;
                        case 11:
                            liteAppHalfScreenStatusChangeListener.m();
                            return;
                        case 12:
                            liteAppHalfScreenStatusChangeListener.i();
                            return;
                        case 13:
                            liteAppHalfScreenStatusChangeListener.getClass();
                            return;
                        case 14:
                            liteAppHalfScreenStatusChangeListener.d();
                            return;
                        case 15:
                            liteAppHalfScreenStatusChangeListener.f(bundle.getInt("KEY_CUR_HEIGHT", 0), bundle.getInt("BASE_HEIGHT", 0));
                            return;
                        default:
                            return;
                    }
                }
            }
        };
    }

    public final void a(com.tencent.mm.plugin.lite.api.m mVar) {
        if (mVar == com.tencent.mm.plugin.lite.api.m.HEIGHT_CHANGED) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("KEY_ACTION", mVar.ordinal());
        this.f143419e.send(0, bundle);
    }

    public void b() {
    }

    public void c() {
    }

    public void d() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void e() {
    }

    public void f(int i17, int i18) {
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }

    public void m() {
    }

    public void n() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        this.f143419e.writeToParcel(parcel, i17);
        parcel.writeInt(this.f143418d.booleanValue() ? 1 : 0);
    }

    public LiteAppHalfScreenStatusChangeListener(android.os.Parcel parcel) {
        this.f143419e = (android.os.ResultReceiver) android.os.ResultReceiver.CREATOR.createFromParcel(parcel);
        this.f143418d = java.lang.Boolean.valueOf(parcel.readInt() == 1);
    }
}
