package e23;

/* loaded from: classes11.dex */
public class m extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.o f246893b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(e23.o oVar) {
        super(oVar);
        this.f246893b = oVar;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        e23.n nVar = (e23.n) eVar;
        e23.o oVar = this.f246893b;
        com.tencent.mm.plugin.fts.ui.n3.b(oVar.f246853q, nVar.f246903b);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(nVar.f246904c, oVar.f246917v, null);
        xe0.l0 l0Var = (xe0.l0) i95.n0.c(xe0.l0.class);
        java.lang.String str = oVar.f246917v;
        java.lang.CharSequence displayName = oVar.f246918w;
        float h17 = i65.a.h(context, com.tencent.mm.R.dimen.f479704cz);
        we0.j1 j1Var = (we0.j1) l0Var;
        j1Var.getClass();
        kotlin.jvm.internal.o.g(displayName, "displayName");
        com.tencent.mm.plugin.fts.ui.n3.a(j1Var.Bi(null, str, displayName, bi4.c.DEFAULT, h17, new xe0.v0()), nVar.f246906e);
        nVar.f246902a.setBackgroundResource(com.tencent.mm.R.drawable.f481306q2);
        nVar.f246902a.setOnClickListener(new e23.l(this, context));
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bby, viewGroup, false);
        e23.n nVar = this.f246893b.f246921z;
        nVar.f246902a = inflate.findViewById(com.tencent.mm.R.id.gzi);
        nVar.f246903b = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.gzf);
        nVar.f246905d = inflate.findViewById(com.tencent.mm.R.id.knz);
        nVar.f246904c = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a_4);
        nVar.f246906e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kbq);
        inflate.setTag(nVar);
        return inflate;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        return false;
    }
}
