package com.tencent.mm.plugin.wepkg.version;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public final class WepkgVersionUpdater$WepkgNetSceneProcessTask extends com.tencent.mm.plugin.wepkg.model.BaseWepkgProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wepkg.version.WepkgVersionUpdater$WepkgNetSceneProcessTask> CREATOR = new com.tencent.mm.plugin.wepkg.version.d();

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f188504h;

    /* renamed from: i, reason: collision with root package name */
    public int f188505i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f188506m;

    /* loaded from: classes8.dex */
    public static class WepkgCheckReq implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wepkg.version.WepkgVersionUpdater$WepkgNetSceneProcessTask.WepkgCheckReq> CREATOR = new com.tencent.mm.plugin.wepkg.version.e();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f188507d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f188508e;

        /* renamed from: f, reason: collision with root package name */
        public int f188509f;

        public WepkgCheckReq(com.tencent.mm.plugin.wepkg.version.a aVar) {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f188507d);
            parcel.writeString(this.f188508e);
            parcel.writeInt(this.f188509f);
        }

        public WepkgCheckReq(android.os.Parcel parcel, com.tencent.mm.plugin.wepkg.version.a aVar) {
            this.f188507d = parcel.readString();
            this.f188508e = parcel.readString();
            this.f188509f = parcel.readInt();
        }
    }

    public /* synthetic */ WepkgVersionUpdater$WepkgNetSceneProcessTask(android.os.Parcel parcel, com.tencent.mm.plugin.wepkg.version.a aVar) {
        this(parcel);
    }

    @Override // com.tencent.mm.plugin.wepkg.model.BaseWepkgProcessTask
    public void B(android.os.Parcel parcel) {
        if (this.f188504h == null) {
            this.f188504h = new java.util.ArrayList();
        }
        parcel.readList(this.f188504h, com.tencent.mm.plugin.wepkg.version.WepkgVersionUpdater$WepkgNetSceneProcessTask.WepkgCheckReq.class.getClassLoader());
        this.f188505i = parcel.readInt();
        this.f188506m = parcel.readByte() != 0;
    }

    @Override // com.tencent.mm.plugin.wepkg.model.BaseWepkgProcessTask
    public void C(android.os.Parcel parcel, int i17) {
        parcel.writeList(this.f188504h);
        parcel.writeInt(this.f188505i);
        parcel.writeByte(this.f188506m ? (byte) 1 : (byte) 0);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        if (com.tencent.mm.sdk.platformtools.t8.L0(this.f188504h)) {
            return;
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 1313;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70666c = "/cgi-bin/mmgame-bin/checkwepkgversion";
        r45.c30 c30Var = new r45.c30();
        java.util.Iterator it = ((java.util.ArrayList) this.f188504h).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.wepkg.version.WepkgVersionUpdater$WepkgNetSceneProcessTask.WepkgCheckReq wepkgCheckReq = (com.tencent.mm.plugin.wepkg.version.WepkgVersionUpdater$WepkgNetSceneProcessTask.WepkgCheckReq) it.next();
            r45.m40 m40Var = new r45.m40();
            m40Var.f380136d = wepkgCheckReq.f188507d;
            m40Var.f380137e = wepkgCheckReq.f188508e;
            m40Var.f380138f = wepkgCheckReq.f188509f;
            c30Var.f371253d.add(m40Var);
        }
        lVar.f70664a = c30Var;
        lVar.f70665b = new r45.d30();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(859L, 15L, 1L, false);
        com.tencent.mm.plugin.wepkg.utils.k.c(lVar.a(), new com.tencent.mm.plugin.wepkg.version.c(this));
    }

    public WepkgVersionUpdater$WepkgNetSceneProcessTask() {
        this.f188504h = new java.util.ArrayList();
    }

    private WepkgVersionUpdater$WepkgNetSceneProcessTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
