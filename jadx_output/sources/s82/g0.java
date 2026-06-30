package s82;

/* loaded from: classes9.dex */
public class g0 extends s82.c {

    /* renamed from: f, reason: collision with root package name */
    public final int f404790f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f404791g;

    public g0(com.tencent.mm.plugin.fav.ui.ra raVar) {
        super(raVar);
        this.f404790f = i65.a.h(raVar.f101384a, com.tencent.mm.R.dimen.f479775ew);
        this.f404791g = raVar.f101384a.getString(com.tencent.mm.R.string.cbz);
    }

    @Override // s82.c
    public android.view.View e(android.view.View view, android.view.ViewGroup viewGroup, o72.r2 r2Var) {
        android.view.View view2;
        s82.f0 f0Var;
        android.content.Context context = viewGroup.getContext();
        if (view == null) {
            f0Var = new s82.f0();
            view2 = android.view.View.inflate(context, com.tencent.mm.R.layout.abb, null);
            a(view2, f0Var, r2Var);
            f0Var.f404771q = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.dum);
            f0Var.f404772r = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.dwp);
            ((android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.f484314du0)).setVisibility(8);
            android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.dvy);
            f0Var.f404773s = textView;
            textView.setVisibility(0);
            s82.c.h(f0Var.f404771q, 11);
        } else {
            view2 = view;
            f0Var = (s82.f0) view.getTag();
        }
        g(f0Var, r2Var);
        r45.aq0 aq0Var = r2Var.field_favProto.f370980y;
        android.widget.TextView textView2 = f0Var.f404772r;
        java.lang.String str = aq0Var.f370188d;
        if (str == null) {
            str = "";
        }
        textView2.setText(str);
        android.widget.TextView textView3 = f0Var.f404773s;
        java.lang.String v17 = o72.x1.v(context, r2Var.field_favProto.f370962d.f378050w);
        if (v17 == null) {
            v17 = this.f404791g;
        }
        textView3.setText(v17);
        com.tencent.mm.plugin.fav.ui.ra raVar = this.f404739c;
        android.widget.ImageView imageView = f0Var.f404771q;
        int bj6 = ((ot.g) ((pt.m0) i95.n0.c(pt.m0.class))).bj();
        int i17 = this.f404790f;
        raVar.c(imageView, null, r2Var, bj6, i17, i17);
        return view2;
    }

    @Override // s82.c
    public void f(android.view.View view, r45.dq0 dq0Var) {
        s82.f0 f0Var = (s82.f0) view.getTag();
        android.content.Context context = view.getContext();
        ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(context, f0Var.f404774a, dq0Var);
    }
}
