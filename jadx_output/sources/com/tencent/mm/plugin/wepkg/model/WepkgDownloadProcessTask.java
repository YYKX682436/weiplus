package com.tencent.mm.plugin.wepkg.model;

/* loaded from: classes8.dex */
public class WepkgDownloadProcessTask extends com.tencent.mm.plugin.wepkg.model.BaseWepkgProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wepkg.model.WepkgDownloadProcessTask> CREATOR = new com.tencent.mm.plugin.wepkg.model.r();

    /* renamed from: h, reason: collision with root package name */
    public int f188351h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f188352i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f188353m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f188354n;

    /* renamed from: o, reason: collision with root package name */
    public long f188355o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f188356p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f188357q;

    /* renamed from: r, reason: collision with root package name */
    public int f188358r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f188359s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$IWepkgUpdateCallback$RetCode f188360t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.Runnable f188361u;

    public /* synthetic */ WepkgDownloadProcessTask(android.os.Parcel parcel, com.tencent.mm.plugin.wepkg.model.q qVar) {
        this(parcel);
    }

    @Override // com.tencent.mm.plugin.wepkg.model.BaseWepkgProcessTask
    public void B(android.os.Parcel parcel) {
        this.f188351h = parcel.readInt();
        this.f188352i = parcel.readString();
        this.f188353m = parcel.readString();
        this.f188354n = parcel.readString();
        this.f188355o = parcel.readLong();
        this.f188356p = parcel.readString();
        this.f188357q = parcel.readString();
        this.f188358r = parcel.readInt();
        this.f188359s = parcel.readString();
        this.f188360t = (com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$IWepkgUpdateCallback$RetCode) parcel.readParcelable(com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$IWepkgUpdateCallback$RetCode.class.getClassLoader());
    }

    @Override // com.tencent.mm.plugin.wepkg.model.BaseWepkgProcessTask
    public void C(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f188351h);
        parcel.writeString(this.f188352i);
        parcel.writeString(this.f188353m);
        parcel.writeString(this.f188354n);
        parcel.writeLong(this.f188355o);
        parcel.writeString(this.f188356p);
        parcel.writeString(this.f188357q);
        parcel.writeInt(this.f188358r);
        parcel.writeString(this.f188359s);
        parcel.writeParcelable(this.f188360t, i17);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        java.lang.Runnable runnable = this.f188361u;
        if (runnable != null) {
            ((com.tencent.mm.plugin.wepkg.model.d0) runnable).run();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.mm.plugin.wepkg.model.q qVar = new com.tencent.mm.plugin.wepkg.model.q(this);
        if (this.f188351h == 1) {
            xz4.i.a().c(this.f188352i, qVar);
            return;
        }
        xz4.i a17 = xz4.i.a();
        int i17 = this.f188351h;
        java.lang.String str = this.f188352i;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = this.f188353m;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = this.f188354n;
        if (str3 == null) {
            str3 = "";
        }
        long j17 = this.f188355o;
        java.lang.String str4 = this.f188356p;
        if (str4 == null) {
            str4 = "";
        }
        java.lang.String str5 = this.f188357q;
        if (str5 == null) {
            str5 = "";
        }
        a17.f(i17, str, "", str2, str3, j17, str4, "", str5, this.f188358r, qVar);
    }

    public WepkgDownloadProcessTask() {
    }

    private WepkgDownloadProcessTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
