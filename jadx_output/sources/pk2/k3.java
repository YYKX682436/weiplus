package pk2;

/* loaded from: classes3.dex */
public final class k3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.t62 f355903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.LoadingSwitchBtn f355904e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pk2.q3 f355905f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355906g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f355907h;

    public k3(r45.t62 t62Var, com.tencent.mm.plugin.finder.view.LoadingSwitchBtn loadingSwitchBtn, pk2.q3 q3Var, pk2.o9 o9Var, com.tencent.mm.plugin.finder.view.e3 e3Var) {
        this.f355903d = t62Var;
        this.f355904e = loadingSwitchBtn;
        this.f355905f = q3Var;
        this.f355906g = o9Var;
        this.f355907h = e3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption$addItem$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.LoadingSwitchBtn loadingSwitchBtn = this.f355904e;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(!loadingSwitchBtn.f211363x ? 1 : 0);
        r45.t62 config = this.f355903d;
        config.set(0, valueOf);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", "2");
        jSONObject.put("switch_result", loadingSwitchBtn.f211363x ? "1" : "0");
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f327325e;
        zy2.zb.j5(zbVar, 33L, jSONObject.toString(), null, 4, null);
        kotlinx.coroutines.y0 j17 = this.f355905f.j();
        if (j17 != null) {
            kotlinx.coroutines.l.d(j17, null, null, new pk2.j3(this.f355906g, this.f355905f, this.f355903d, this.f355907h, null), 3, null);
        } else {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            kotlin.jvm.internal.o.g(config, "config");
            hb2.i iVar = hb2.i.f280054e;
            iVar.getClass();
            iVar.n(config, null);
            this.f355907h.h();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption$addItem$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
