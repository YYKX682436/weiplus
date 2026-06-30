package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes8.dex */
public class IPCInstallApp implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.pluginsdk.model.app.IPCInstallApp.IPCInstallAppParam iPCInstallAppParam = (com.tencent.mm.pluginsdk.model.app.IPCInstallApp.IPCInstallAppParam) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCInstallApp", "invoke()");
        int i17 = iPCInstallAppParam.f188780d;
        boolean z17 = iPCInstallAppParam.f188783g;
        if (i17 == 1) {
            com.tencent.mm.pluginsdk.model.app.n1.e(com.tencent.mm.sdk.platformtools.x2.f193071a, iPCInstallAppParam.f188781e, new com.tencent.mm.pluginsdk.model.app.i3(this, rVar), z17);
        } else if (i17 == 2) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            com.tencent.mm.pluginsdk.model.app.j3 j3Var = new com.tencent.mm.pluginsdk.model.app.j3(this, rVar);
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
            com.tencent.mm.sdk.platformtools.i1.d(context, intent, iPCInstallAppParam.f188782f, "application/vnd.android.package-archive", false);
            intent.addFlags(268435456);
            com.tencent.mm.pluginsdk.model.app.n1.c(context, intent, j3Var, z17);
        }
    }

    /* loaded from: classes8.dex */
    public static final class IPCInstallAppParam implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.pluginsdk.model.app.IPCInstallApp.IPCInstallAppParam> CREATOR = new com.tencent.mm.pluginsdk.model.app.k3();

        /* renamed from: d, reason: collision with root package name */
        public final int f188780d;

        /* renamed from: e, reason: collision with root package name */
        public final java.lang.String f188781e;

        /* renamed from: f, reason: collision with root package name */
        public final android.net.Uri f188782f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f188783g;

        public IPCInstallAppParam(int i17, java.lang.String str, android.net.Uri uri, boolean z17) {
            this.f188780d = i17;
            this.f188781e = str;
            this.f188782f = uri;
            this.f188783g = z17;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeInt(this.f188780d);
            parcel.writeString(this.f188781e);
            parcel.writeParcelable(this.f188782f, i17);
            parcel.writeByte(this.f188783g ? (byte) 1 : (byte) 0);
        }

        public IPCInstallAppParam(android.os.Parcel parcel) {
            this.f188780d = parcel.readInt();
            this.f188781e = parcel.readString();
            this.f188782f = (android.net.Uri) parcel.readParcelable(android.net.Uri.class.getClassLoader());
            this.f188783g = parcel.readByte() != 0;
        }
    }
}
