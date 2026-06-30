package s82;

/* loaded from: classes9.dex */
public class m extends s82.c {
    @Override // s82.c
    public android.view.View e(android.view.View view, android.view.ViewGroup viewGroup, o72.r2 r2Var) {
        android.view.View view2;
        s82.l lVar;
        java.lang.String O;
        android.content.Context context = viewGroup.getContext();
        if (view == null) {
            lVar = new s82.l();
            view2 = android.view.View.inflate(context, com.tencent.mm.R.layout.abc, null);
            a(view2, lVar, r2Var);
            lVar.f404809q = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.dum);
            lVar.f404810r = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.dwp);
            lVar.f404811s = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.f484315du3);
        } else {
            view2 = view;
            lVar = (s82.l) view.getTag();
        }
        g(lVar, r2Var);
        r45.gp0 J2 = o72.x1.J(r2Var);
        java.lang.String str = r2Var.field_favProto.f370972q;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || (r2Var.B1 && J2 != null)) {
            str = J2.f375404d;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            lVar.f404810r.setText("");
            lVar.f404811s.setText(o72.x1.O((float) J2.R));
        } else {
            int lastIndexOf = str.lastIndexOf(".");
            if (lastIndexOf != -1) {
                java.lang.String upperCase = str.substring(lastIndexOf + 1).toUpperCase();
                str = str.substring(0, lastIndexOf);
                O = upperCase + " " + o72.x1.O((float) J2.R);
            } else {
                O = o72.x1.O((float) J2.R);
            }
            lVar.f404810r.setText(str);
            lVar.f404811s.setText(O);
        }
        if (J2.X1 == 2) {
            lVar.f404811s.setText(">" + ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).vj() + "MB");
        }
        s82.c.j(lVar.f404810r, r2Var);
        android.widget.ImageView imageView = lVar.f404809q;
        java.lang.String str2 = J2.K;
        kk.j jVar = com.tencent.mm.plugin.fav.ui.u1.f101464a;
        imageView.setImageResource(o25.y.a(str2));
        return view2;
    }

    @Override // s82.c
    public void f(android.view.View view, r45.dq0 dq0Var) {
        o72.r2 r2Var = ((s82.l) view.getTag()).f404774a;
        ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(view.getContext(), r2Var, dq0Var);
    }
}
