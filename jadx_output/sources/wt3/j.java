package wt3;

/* loaded from: classes10.dex */
public final class j implements im5.a {

    /* renamed from: d, reason: collision with root package name */
    public final im5.b f449427d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f449428e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f449429f;

    /* renamed from: g, reason: collision with root package name */
    public final dn.m f449430g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f449431h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f449432i;

    public j(im5.b bVar, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        this.f449427d = bVar;
        this.f449428e = info;
        this.f449429f = "MicroMsg.AudioDownloadTask";
        this.f449432i = java.util.Collections.synchronizedList(new java.util.ArrayList());
        java.lang.String str = info.f155715i + "_temp";
        java.lang.String str2 = info.f155715i;
        dw3.c0 c0Var = dw3.c0.f244182a;
        c0Var.g(str, true);
        if (str2 != null) {
            c0Var.g(str2, true);
        }
        java.lang.String str3 = "downaudio_" + info.f155711e;
        this.f449431h = str3;
        dn.m mVar = new dn.m();
        this.f449430g = mVar;
        mVar.f241785d = "task_AudioDownloadTask";
        mVar.A = 60;
        mVar.B = 60;
        mVar.field_mediaId = str3;
        mVar.f241811z = info.f155712f;
        mVar.field_fileType = 40001;
        mVar.field_fullpath = str;
        mVar.field_aesKey = info.f155724u;
        mVar.f241787f = new wt3.i(this, str2, str);
    }

    public final void a(boolean z17, java.lang.String str) {
        java.util.List callbacks = this.f449432i;
        kotlin.jvm.internal.o.f(callbacks, "callbacks");
        synchronized (callbacks) {
            java.util.Iterator it = callbacks.iterator();
            while (it.hasNext()) {
                ((yz5.p) it.next()).invoke(java.lang.Boolean.valueOf(z17), str);
            }
        }
        this.f449432i.clear();
    }

    @Override // im5.a
    public void dead() {
        wt3.c1 c1Var = wt3.c1.f449387b;
        wt3.c1.f449387b.f(this.f449428e);
    }
}
