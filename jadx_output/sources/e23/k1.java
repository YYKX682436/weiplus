package e23;

/* loaded from: classes12.dex */
public class k1 extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l1 f246886b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(e23.l1 l1Var) {
        super(l1Var);
        this.f246886b = l1Var;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        e23.i1 i1Var = (e23.i1) eVar;
        e23.l1 l1Var = this.f246886b;
        java.lang.String string = context.getString(com.tencent.mm.R.string.idw, l1Var.f423762e.f351129a);
        android.widget.TextView textView = i1Var.f246873a;
        p13.r rVar = l1Var.f423762e;
        p13.i iVar = new p13.i();
        iVar.f351093a = string;
        iVar.f351094b = rVar;
        iVar.f351095c = false;
        iVar.f351096d = false;
        iVar.f351100h = textView.getPaint();
        com.tencent.mm.plugin.fts.ui.n3.a(o13.q.e(iVar).f351105a, i1Var.f246873a);
        if (((e23.l1) gVar).f246890v > 3) {
            i1Var.f246874b.setVisibility(0);
            i1Var.f246874b.setOnClickListener(new e23.j1(this, context));
        } else {
            i1Var.f246874b.setVisibility(8);
            i1Var.f246874b.setOnClickListener(null);
        }
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489125bd4, viewGroup, false);
        e23.i1 i1Var = this.f246886b.f246892x;
        i1Var.f246873a = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf);
        i1Var.f246874b = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.jrw);
        inflate.setTag(i1Var);
        return inflate;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        return false;
    }
}
