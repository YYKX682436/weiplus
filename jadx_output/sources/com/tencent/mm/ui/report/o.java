package com.tencent.mm.ui.report;

/* loaded from: classes12.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f209706a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f209707b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f209708c;

    /* renamed from: d, reason: collision with root package name */
    public final long f209709d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.report.g f209710e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.report.m f209711f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.report.l f209712g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.report.n f209713h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.report.h f209714i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.ui.report.c f209715j;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.mm.ui.report.j f209716k;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.ui.report.e f209717l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f209718m;

    public o(com.tencent.mm.storage.f9 msgInfo, java.lang.String fileExt, java.lang.String dataId, long j17) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        kotlin.jvm.internal.o.g(fileExt, "fileExt");
        kotlin.jvm.internal.o.g(dataId, "dataId");
        this.f209706a = msgInfo;
        this.f209707b = fileExt;
        this.f209708c = dataId;
        this.f209709d = j17;
        this.f209710e = com.tencent.mm.ui.report.g.f209640f;
        this.f209711f = com.tencent.mm.ui.report.m.f209695h;
        this.f209712g = com.tencent.mm.ui.report.l.f209686g;
        this.f209713h = com.tencent.mm.ui.report.n.f209701e;
        this.f209714i = com.tencent.mm.ui.report.h.f209643e;
        this.f209715j = com.tencent.mm.ui.report.c.f209621e;
        this.f209716k = com.tencent.mm.ui.report.j.f209675g;
        this.f209717l = com.tencent.mm.ui.report.e.f209630g;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ui.report.o)) {
            return false;
        }
        com.tencent.mm.ui.report.o oVar = (com.tencent.mm.ui.report.o) obj;
        return kotlin.jvm.internal.o.b(this.f209706a, oVar.f209706a) && kotlin.jvm.internal.o.b(this.f209707b, oVar.f209707b) && kotlin.jvm.internal.o.b(this.f209708c, oVar.f209708c) && this.f209709d == oVar.f209709d;
    }

    public int hashCode() {
        return (((((this.f209706a.hashCode() * 31) + this.f209707b.hashCode()) * 31) + this.f209708c.hashCode()) * 31) + java.lang.Long.hashCode(this.f209709d);
    }

    public java.lang.String toString() {
        return "FilePreviewReportParams(msgInfo=" + this.f209706a + ", fileExt=" + this.f209707b + ", dataId=" + this.f209708c + ", fileSize=" + this.f209709d + ')';
    }

    public /* synthetic */ o(com.tencent.mm.storage.f9 f9Var, java.lang.String str, java.lang.String str2, long j17, int i17, kotlin.jvm.internal.i iVar) {
        this(f9Var, str, (i17 & 4) != 0 ? "" : str2, (i17 & 8) != 0 ? 0L : j17);
    }
}
