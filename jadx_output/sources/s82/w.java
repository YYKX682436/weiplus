package s82;

/* loaded from: classes9.dex */
public class w extends s82.c {

    /* renamed from: f, reason: collision with root package name */
    public final int f404849f;

    public w(com.tencent.mm.plugin.fav.ui.ra raVar) {
        super(raVar);
        this.f404849f = i65.a.h(raVar.f101384a, com.tencent.mm.R.dimen.f479775ew);
    }

    @Override // s82.c
    public android.view.View e(android.view.View view, android.view.ViewGroup viewGroup, o72.r2 r2Var) {
        android.view.View view2;
        s82.v vVar;
        android.content.Context context = viewGroup.getContext();
        if (view == null) {
            vVar = new s82.v();
            view2 = android.view.View.inflate(context, com.tencent.mm.R.layout.abb, null);
            a(view2, vVar, r2Var);
            vVar.f404845q = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.dum);
            vVar.f404846r = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.dwp);
            vVar.f404847s = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.f484314du0);
            ((android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.dvy)).setVisibility(8);
            s82.c.h(vVar.f404845q, 11);
        } else {
            view2 = view;
            vVar = (s82.v) view.getTag();
        }
        g(vVar, r2Var);
        r45.aq0 aq0Var = r2Var.field_favProto.f370980y;
        android.widget.TextView textView = vVar.f404846r;
        java.lang.String str = aq0Var.f370188d;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        android.widget.TextView textView2 = vVar.f404847s;
        java.lang.String str2 = aq0Var.f370190f;
        textView2.setText(str2 != null ? str2 : "");
        vVar.f404846r.setSingleLine(false);
        vVar.f404846r.setMaxLines(2);
        com.tencent.mm.plugin.fav.ui.ra raVar = this.f404739c;
        android.widget.ImageView imageView = vVar.f404845q;
        int bj6 = ((ot.g) ((pt.m0) i95.n0.c(pt.m0.class))).bj();
        int i17 = this.f404849f;
        raVar.c(imageView, null, r2Var, bj6, i17, i17);
        return view2;
    }

    @Override // s82.c
    public void f(android.view.View view, r45.dq0 dq0Var) {
        s82.v vVar = (s82.v) view.getTag();
        android.content.Context context = view.getContext();
        ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(context, vVar.f404774a, dq0Var);
    }
}
