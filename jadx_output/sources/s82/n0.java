package s82;

/* loaded from: classes9.dex */
public class n0 extends s82.c {

    /* renamed from: f, reason: collision with root package name */
    public final int f404820f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f404821g;

    public n0(com.tencent.mm.plugin.fav.ui.ra raVar) {
        super(raVar);
        this.f404820f = i65.a.h(raVar.f101384a, com.tencent.mm.R.dimen.f479775ew);
        this.f404821g = "";
    }

    @Override // s82.c
    public android.view.View e(android.view.View view, android.view.ViewGroup viewGroup, o72.r2 r2Var) {
        android.view.View view2;
        s82.m0 m0Var;
        android.content.Context context = viewGroup.getContext();
        if (view == null) {
            m0Var = new s82.m0();
            view2 = android.view.View.inflate(context, com.tencent.mm.R.layout.abb, null);
            a(view2, m0Var, r2Var);
            m0Var.f404813q = (com.tencent.mm.ui.MMImageView) view2.findViewById(com.tencent.mm.R.id.dum);
            m0Var.f404814r = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.dwp);
            m0Var.f404815s = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.f484314du0);
            android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.dvy);
            m0Var.f404816t = textView;
            textView.setVisibility(0);
            s82.c.j(m0Var.f404814r, r2Var);
        } else {
            view2 = view;
            m0Var = (s82.m0) view.getTag();
        }
        g(m0Var, r2Var);
        r45.mq0 mq0Var = r2Var.field_favProto.C;
        if (mq0Var != null) {
            android.widget.TextView textView2 = m0Var.f404814r;
            java.lang.String str = mq0Var.f380735d;
            if (str == null) {
                str = "";
            }
            textView2.setText(str);
            android.widget.TextView textView3 = m0Var.f404815s;
            java.lang.String str2 = mq0Var.f380737f;
            textView3.setText(str2 != null ? str2 : "");
        } else {
            m0Var.f404814r.setText("");
            m0Var.f404815s.setText("");
        }
        android.widget.TextView textView4 = m0Var.f404816t;
        java.lang.String v17 = o72.x1.v(context, r2Var.field_favProto.f370962d.f378050w);
        if (v17 == null) {
            v17 = this.f404821g;
        }
        textView4.setText(v17);
        com.tencent.mm.plugin.fav.ui.ra raVar = this.f404739c;
        com.tencent.mm.ui.MMImageView mMImageView = m0Var.f404813q;
        int bj6 = ((ot.g) ((pt.m0) i95.n0.c(pt.m0.class))).bj();
        int i17 = this.f404820f;
        raVar.c(mMImageView, null, r2Var, bj6, i17, i17);
        return view2;
    }

    @Override // s82.c
    public void f(android.view.View view, r45.dq0 dq0Var) {
        s82.m0 m0Var = (s82.m0) view.getTag();
        android.content.Context context = view.getContext();
        ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(context, m0Var.f404774a, dq0Var);
    }
}
