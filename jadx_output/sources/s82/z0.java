package s82;

/* loaded from: classes9.dex */
public class z0 extends s82.c {
    @Override // s82.c
    public android.view.View e(android.view.View view, android.view.ViewGroup viewGroup, o72.r2 r2Var) {
        android.view.View view2;
        s82.y0 y0Var;
        android.content.Context context = viewGroup.getContext();
        if (view == null) {
            y0Var = new s82.y0();
            view2 = android.view.View.inflate(context, com.tencent.mm.R.layout.abl, null);
            a(view2, y0Var, r2Var);
            y0Var.f404857q = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.dwp);
        } else {
            view2 = view;
            y0Var = (s82.y0) view.getTag();
        }
        g(y0Var, r2Var);
        float f17 = o72.x1.J(r2Var).f375448y / 1000.0f;
        if (f17 < 1.0f) {
            f17 = 1.0f;
        }
        if (f17 > 60.0f) {
            f17 = 60.0f;
        }
        android.widget.TextView textView = y0Var.f404857q;
        android.content.Context context2 = this.f404739c.f101384a;
        textView.setText(r0 <= 0 ? context2.getString(com.tencent.mm.R.string.f491219ce0, 0) : context2.getString(com.tencent.mm.R.string.f491219ce0, java.lang.Integer.valueOf(r0)));
        s82.c.j(y0Var.f404857q, r2Var);
        return view2;
    }

    @Override // s82.c
    public void f(android.view.View view, r45.dq0 dq0Var) {
        s82.y0 y0Var = (s82.y0) view.getTag();
        android.content.Context context = view.getContext();
        ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(context, y0Var.f404774a, dq0Var);
    }
}
