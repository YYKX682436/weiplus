package yr3;

/* loaded from: classes11.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr3.a f464972d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.s5 f464973e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.o5 f464974f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wr3.n0 f464975g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f464976h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f464977i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(sr3.a aVar, r45.s5 s5Var, r45.o5 o5Var, wr3.n0 n0Var, int i17, android.content.Context context) {
        super(1);
        this.f464972d = aVar;
        this.f464973e = s5Var;
        this.f464974f = o5Var;
        this.f464975g = n0Var;
        this.f464976h = i17;
        this.f464977i = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        r45.y5 y5Var;
        r45.y5 y5Var2;
        r45.p5 p5Var;
        r45.l5 l5Var;
        int intValue = ((java.lang.Number) obj).intValue();
        sr3.a aVar = sr3.a.f411829e;
        com.tencent.mm.plugin.profile.ui.tab.s sVar = (com.tencent.mm.plugin.profile.ui.tab.s) i95.n0.c(com.tencent.mm.plugin.profile.ui.tab.s.class);
        sr3.a aVar2 = this.f464972d;
        java.lang.String Bi = aVar2 == aVar ? sVar.Bi() : sVar.Di();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(Bi);
        sb6.append('_');
        r45.s5 s5Var = this.f464973e;
        sb6.append((s5Var == null || (p5Var = s5Var.f385514i) == null || (l5Var = p5Var.f382753d) == null) ? 0 : l5Var.f379138d);
        sb6.append('_');
        r45.o5 o5Var = this.f464974f;
        sb6.append(o5Var.f381916g);
        java.lang.String sb7 = sb6.toString();
        int i17 = o5Var.f381923p;
        if (i17 == 10 || i17 == 8) {
            str = "pages/image_editor/image_editor.html?biz=" + android.net.Uri.encode(Bi) + "&msginfo=" + android.net.Uri.encode(sb7);
        } else {
            str = "pages/appmsg_editor/appmsg_editor.html?biz=" + android.net.Uri.encode(Bi) + "&msginfo=" + android.net.Uri.encode(sb7);
        }
        gr3.b bVar = gr3.b.f274847a;
        java.lang.Long valueOf = (s5Var == null || (y5Var2 = s5Var.f385509d) == null) ? null : java.lang.Long.valueOf(y5Var2.f390790d);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(o5Var.f381916g);
        wr3.n0 n0Var = this.f464975g;
        bVar.b(valueOf, valueOf2, 105L, bVar.a(n0Var), (r29 & 16) != 0 ? 0L : 0L, (r29 & 32) != 0 ? "" : null, this.f464976h, (r29 & 128) != 0 ? 0 : aVar2 == aVar ? 0 : 5, (r29 & 256) != 0 ? 0 : 0);
        l81.b1 b1Var = new l81.b1();
        b1Var.f317032k = aVar2 == aVar ? 1338 : 1414;
        b1Var.f317016c = intValue;
        b1Var.f317034l = "3";
        b1Var.f317014b = "wx0b2ec076ec39c786";
        b1Var.f317022f = str;
        b1Var.f317028i = ((r01.l1) i95.n0.c(r01.l1.class)).Bi(aVar2.f411832d, Bi);
        if (((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Bi()) {
            b1Var.f317018d = 447;
        }
        java.lang.String str2 = b1Var.f317022f;
        b1Var.f317022f = str2 + "&from=publish_bar_fail";
        i95.m c17 = i95.n0.c(tk.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        if (tk.r.Wf((tk.r) c17, this.f464977i, b1Var, null, 4, null)) {
            com.tencent.mars.xlog.Log.i("FeatureMsgUtil", "handleFailedClick: use new editor");
        } else {
            b1Var.f317022f = str2;
            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(this.f464977i, b1Var);
            bVar.b((s5Var == null || (y5Var = s5Var.f385509d) == null) ? null : java.lang.Long.valueOf(y5Var.f390790d), java.lang.Long.valueOf(o5Var.f381916g), 102L, bVar.a(n0Var), (r29 & 16) != 0 ? 0L : 0L, (r29 & 32) != 0 ? "" : null, this.f464976h, (r29 & 128) != 0 ? 0 : aVar2 == aVar ? 0 : 5, (r29 & 256) != 0 ? 0 : 0);
        }
        return jz5.f0.f302826a;
    }
}
