package com.tencent.mm.plugin.vlog.model;

/* loaded from: classes10.dex */
public final class i1 implements com.tencent.mm.plugin.vlog.model.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f175616a;

    /* renamed from: b, reason: collision with root package name */
    public final int f175617b;

    /* renamed from: c, reason: collision with root package name */
    public final int f175618c;

    /* renamed from: d, reason: collision with root package name */
    public final int f175619d;

    /* renamed from: e, reason: collision with root package name */
    public final bv3.d f175620e;

    /* renamed from: f, reason: collision with root package name */
    public int f175621f;

    /* renamed from: g, reason: collision with root package name */
    public int f175622g;

    /* renamed from: h, reason: collision with root package name */
    public float f175623h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.vlog.model.y f175624i;

    /* renamed from: j, reason: collision with root package name */
    public int f175625j;

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem f175626k;

    /* renamed from: l, reason: collision with root package name */
    public final rm5.j f175627l;

    static {
        com.tencent.tav.decoder.logger.Logger.setLogProxy(new p05.f2());
        com.tencent.tav.decoder.logger.Logger.setLevel(2);
        xm5.b.f455398a = new p05.g2();
        rm5.l lVar = rm5.l.f397520a;
        rm5.l.f397522c = 4000L;
    }

    public i1(java.lang.String path, int i17, int i18) {
        kotlin.jvm.internal.o.g(path, "path");
        this.f175616a = path;
        this.f175617b = i17;
        this.f175618c = i18;
        int hashCode = hashCode();
        this.f175619d = hashCode;
        this.f175620e = new bv3.d(0L, false, 3, null);
        this.f175623h = 1.0f;
        this.f175624i = new com.tencent.mm.plugin.vlog.model.y();
        this.f175625j = -1;
        this.f175626k = new com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem();
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogCompositionTrack", "create VLogCompositionTrack path:" + path + ", type:" + i17 + ", id:" + hashCode);
        java.lang.String i19 = com.tencent.mm.vfs.w6.i(path, false);
        this.f175627l = new rm5.j(i19 == null ? "" : i19, i17);
    }

    public void a(long j17) {
        this.f175627l.b(j17);
    }

    public void b(float f17) {
        rm5.j jVar = this.f175627l;
        if (f17 > 0.0f) {
            jVar.f397506h = f17;
        } else {
            jVar.getClass();
        }
    }

    public void c(long j17) {
        this.f175627l.d(j17);
    }

    public void d(long j17) {
        this.f175627l.e(j17);
    }

    public void e(long j17) {
        this.f175627l.c(j17);
    }

    public /* synthetic */ i1(java.lang.String str, int i17, int i18, int i19, kotlin.jvm.internal.i iVar) {
        this(str, i17, (i19 & 4) != 0 ? 0 : i18);
    }
}
