package e23;

/* loaded from: classes12.dex */
public class r0 extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.s0 f246953b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(e23.s0 s0Var) {
        super(s0Var);
        this.f246953b = s0Var;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        e23.q0 q0Var = (e23.q0) eVar;
        com.tencent.mm.plugin.fts.ui.n3.i(q0Var.f246942a, this.f246953b.f423761d);
        q0Var.f246943b.setText(((e23.s0) gVar).f246956q);
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bch, viewGroup, false);
        e23.q0 q0Var = new e23.q0(this.f246953b);
        q0Var.f246943b = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.o_q);
        q0Var.f246942a = inflate.findViewById(com.tencent.mm.R.id.mem);
        inflate.setTag(q0Var);
        return inflate;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(z13.f.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        k23.r2 r2Var = ((z13.f) a17).f469406o;
        kotlin.jvm.internal.o.g(r2Var, "<this>");
        boolean z17 = r2Var == k23.r2.f303685g;
        java.lang.Object[] objArr2 = new java.lang.Object[2];
        objArr2[0] = z17 ? "yes" : "no";
        e23.s0 s0Var = this.f246953b;
        objArr2[1] = s0Var.i();
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSMoreDataItem", "onItemClick: isFloatingVoiceText=%s, query: %s", objArr2);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Floating_VoiceText", z17);
        intent.putExtra("detail_query", s0Var.i());
        intent.putExtra("detail_type", s0Var.f423764g);
        intent.putExtra("Search_Scene", s0Var.f423765h);
        intent.putExtra("home_page_search_id", o13.p.f342251d);
        o13.n.q(context, ".ui.FTSDetailUI", intent);
        return true;
    }
}
