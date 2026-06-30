package mz0;

/* loaded from: classes5.dex */
public final class r2 implements com.tencent.mm.mj_template.sns.compose.widget.t0 {

    /* renamed from: a, reason: collision with root package name */
    public int f333036a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f333037b = "";

    @Override // com.tencent.mm.mj_template.sns.compose.widget.t0
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplate.TemplateControlUIC", "onPanelShow: ");
        dx1.f.n(dx1.g.f244489a, "SnsTemplate", "editdetail", "musicSearchFlag", 1, null, false, null, null, 240, null);
        this.f333037b = "";
        this.f333036a = 0;
    }

    @Override // com.tencent.mm.mj_template.sns.compose.widget.t0
    public void b(java.lang.String keyword) {
        kotlin.jvm.internal.o.g(keyword, "keyword");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplate.TemplateControlUIC", "onSearch: ");
        if (this.f333037b.length() > 0) {
            dx1.f.n(dx1.g.f244489a, "SnsTemplate", "editdetail", "musicSearchClk", java.lang.String.valueOf(this.f333036a), bx1.u.f36310e, false, null, null, 224, null);
        }
        this.f333036a = 0;
        this.f333037b = keyword;
        dx1.f.n(dx1.g.f244489a, "SnsTemplate", "editdetail", "musicSearchKw", keyword, bx1.u.f36310e, false, null, null, 224, null);
    }

    @Override // com.tencent.mm.mj_template.sns.compose.widget.t0
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplate.TemplateControlUIC", "onPanelClose: ");
        if (this.f333037b.length() > 0) {
            dx1.f.n(dx1.g.f244489a, "SnsTemplate", "editdetail", "musicSearchClk", java.lang.String.valueOf(this.f333036a), bx1.u.f36310e, false, null, null, 224, null);
        }
        this.f333037b = "";
        this.f333036a = 0;
    }

    @Override // com.tencent.mm.mj_template.sns.compose.widget.t0
    public void d(java.lang.String musicId) {
        kotlin.jvm.internal.o.g(musicId, "musicId");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplate.TemplateControlUIC", "onMusicSelected: ");
        this.f333036a++;
    }
}
