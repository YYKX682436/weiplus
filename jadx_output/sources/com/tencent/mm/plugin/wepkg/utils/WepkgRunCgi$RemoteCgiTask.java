package com.tencent.mm.plugin.wepkg.utils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public final class WepkgRunCgi$RemoteCgiTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask implements com.tencent.mm.modelbase.e3 {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wepkg.utils.WepkgRunCgi$RemoteCgiTask> CREATOR = new com.tencent.mm.plugin.wepkg.utils.j();

    /* renamed from: f, reason: collision with root package name */
    public int f188484f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f188485g;

    /* renamed from: h, reason: collision with root package name */
    public int f188486h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f188487i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f188488m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f188489n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.wepkg.utils.i f188490o;

    public WepkgRunCgi$RemoteCgiTask() {
    }

    public void B(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        this.f188485g = i17;
        this.f188486h = i18;
        this.f188487i = str;
        this.f188488m = oVar;
        this.f188484f = 2;
        c();
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        B(i17, i18, str, oVar);
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        super.v(parcel);
        int readInt = parcel.readInt();
        this.f188484f = readInt;
        if (readInt == 1) {
            this.f188489n = com.tencent.mm.plugin.wepkg.utils.k.b(parcel);
        } else {
            if (readInt != 2) {
                return;
            }
            this.f188485g = parcel.readInt();
            this.f188486h = parcel.readInt();
            this.f188487i = parcel.readString();
            this.f188488m = com.tencent.mm.plugin.wepkg.utils.k.b(parcel);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeInt(this.f188484f);
        int i18 = this.f188484f;
        if (i18 == 1) {
            com.tencent.mm.plugin.wepkg.utils.k.a(this.f188489n, parcel);
        } else {
            if (i18 != 2) {
                return;
            }
            parcel.writeInt(this.f188485g);
            parcel.writeInt(this.f188486h);
            parcel.writeString(this.f188487i);
            com.tencent.mm.plugin.wepkg.utils.k.a(this.f188488m, parcel);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        ((java.util.HashSet) com.tencent.mm.plugin.wepkg.utils.n.f188503c).remove(this);
        com.tencent.mm.plugin.wepkg.utils.i iVar = this.f188490o;
        if (iVar != null) {
            iVar.a(this.f188485g, this.f188486h, this.f188487i, this.f188488m);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.mm.modelbase.z2.d(this.f188489n, this, true);
    }

    public WepkgRunCgi$RemoteCgiTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
