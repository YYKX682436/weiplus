package op4;

/* loaded from: classes2.dex */
public class g extends op4.k {

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f347274e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f347275f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f347276g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f347277h;

    /* renamed from: i, reason: collision with root package name */
    public int f347278i;

    /* renamed from: m, reason: collision with root package name */
    public long f347279m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f347280n;

    public g(com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f347274e = jz5.h.b(op4.f.f347273d);
        this.f347275f = "";
        this.f347276g = "";
        this.f347277h = "";
        this.f347278i = -1;
        new org.json.JSONObject();
        this.f347280n = "";
    }

    @Override // op4.k
    public void a(android.content.Intent intent) {
        kotlin.jvm.internal.o.g(intent, "intent");
        java.lang.String stringExtra = intent.getStringExtra("key_finder_context_id");
        if (stringExtra == null && (stringExtra = intent.getStringExtra("key_context_id")) == null) {
            stringExtra = "";
        }
        this.f347275f = stringExtra;
        java.lang.String stringExtra2 = intent.getStringExtra("key_jump_id");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f347276g = stringExtra2;
        java.lang.String stringExtra3 = intent.getStringExtra("key_click_tab_context_id");
        this.f347277h = stringExtra3 != null ? stringExtra3 : "";
        this.f347278i = intent.getIntExtra("key_from_comment_scene", 0);
    }

    @Override // op4.k
    public void b() {
        if (this.f347279m <= 0) {
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.FinderPageExposeStruct finderPageExposeStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderPageExposeStruct();
        finderPageExposeStruct.w((java.lang.String) ((jz5.n) this.f347274e).getValue());
        finderPageExposeStruct.s(this.f347275f);
        finderPageExposeStruct.p(this.f347277h);
        finderPageExposeStruct.t(((k40.f) ((l40.e) i95.n0.c(l40.e.class))).aj());
        finderPageExposeStruct.q("101");
        finderPageExposeStruct.v(java.lang.String.valueOf(this.f347278i));
        finderPageExposeStruct.f57465g = 1;
        finderPageExposeStruct.r(java.lang.String.valueOf(c01.id.c()));
        finderPageExposeStruct.f57471m = c01.id.c() - this.f347279m;
        finderPageExposeStruct.x(this.f347280n);
        finderPageExposeStruct.u(r26.i0.v(this.f347276g, ",", ";", false, 4, null));
        finderPageExposeStruct.k();
    }

    @Override // op4.k
    public void c() {
        this.f347279m = c01.id.c();
        new org.json.JSONObject();
    }

    @Override // op4.k
    public java.lang.String g() {
        return "21874";
    }

    @Override // ju3.d0
    public void w(ju3.c0 status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
    }
}
