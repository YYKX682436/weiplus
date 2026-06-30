package e23;

/* loaded from: classes12.dex */
public class o1 extends e23.o0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.p1 f246923c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(e23.p1 p1Var) {
        super(p1Var);
        this.f246923c = p1Var;
    }

    @Override // e23.o0, u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate;
        e23.n0 n0Var = this.f246923c.f246934z;
        if (e23.p0.A) {
            com.tencent.mars.xlog.Log.i("FTSTalkerMessageDataItem", "fts multi_msg_show_details enabled");
            inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.efh, viewGroup, false);
            n0Var.f246908b = inflate.findViewById(com.tencent.mm.R.id.mem);
            n0Var.f246912f = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.rte);
        } else {
            com.tencent.mars.xlog.Log.i("FTSTalkerMessageDataItem", "fts multi_msg_show_details disabled");
            inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bcg, viewGroup, false);
        }
        n0Var.f246909c = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a_4);
        n0Var.f246910d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kbq);
        n0Var.f246911e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.jue);
        n0Var.f246907a = inflate.findViewById(com.tencent.mm.R.id.d0v);
        n0Var.f246914h = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.o7z);
        n0Var.f246909c.getLayoutParams().width = i65.a.h(context, com.tencent.mm.R.dimen.it);
        n0Var.f246909c.getLayoutParams().height = i65.a.h(context, com.tencent.mm.R.dimen.it);
        n0Var.f246913g = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.hhi);
        n0Var.f246915i = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.hhr);
        inflate.setTag(n0Var);
        return inflate;
    }

    @Override // e23.o0, u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        return ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).hj(this.f246923c.f423758a).b(context, view, gVar, objArr);
    }
}
