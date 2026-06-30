package s82;

/* loaded from: classes9.dex */
public class u extends s82.c {
    @Override // s82.c
    public android.view.View e(android.view.View view, android.view.ViewGroup viewGroup, o72.r2 r2Var) {
        android.view.View view2;
        s82.t tVar;
        android.content.Context context = viewGroup.getContext();
        if (view == null) {
            tVar = new s82.t();
            view2 = android.view.View.inflate(context, com.tencent.mm.R.layout.abc, null);
            a(view2, tVar, r2Var);
            tVar.f404838q = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.dum);
            tVar.f404839r = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.dwp);
            tVar.f404840s = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.f484315du3);
            s82.c.j(tVar.f404839r, r2Var);
        } else {
            view2 = view;
            tVar = (s82.t) view.getTag();
        }
        g(tVar, r2Var);
        tVar.f404838q.setImageResource(com.tencent.mm.R.drawable.f481475bi4);
        r45.bq0 bq0Var = r2Var.field_favProto;
        r45.pp0 pp0Var = bq0Var.f370966h;
        java.lang.String str = bq0Var.f370970o;
        java.lang.String str2 = "";
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            android.widget.TextView textView = tVar.f404839r;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context2 = tVar.f404839r.getContext();
            float textSize = tVar.f404839r.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context2, str, textSize));
            if (com.tencent.mm.plugin.fav.ui.qa.c(l(pp0Var))) {
                tVar.f404840s.setText(l(pp0Var));
            } else {
                android.widget.TextView textView2 = tVar.f404840s;
                if (pp0Var == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FavBaseListItem", "getLabel but locItem is null");
                } else {
                    str2 = pp0Var.f383272m;
                }
                textView2.setText(str2);
            }
        } else if (com.tencent.mm.plugin.fav.ui.qa.c(l(pp0Var))) {
            tVar.f404839r.setText(l(pp0Var));
            android.widget.TextView textView3 = tVar.f404840s;
            if (pp0Var == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FavBaseListItem", "getLabel but locItem is null");
            } else {
                str2 = pp0Var.f383272m;
            }
            textView3.setText(str2);
        } else {
            android.widget.TextView textView4 = tVar.f404839r;
            if (pp0Var == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FavBaseListItem", "getLabel but locItem is null");
            } else {
                str2 = pp0Var.f383272m;
            }
            textView4.setText(str2);
            tVar.f404840s.setVisibility(8);
        }
        return view2;
    }

    @Override // s82.c
    public void f(android.view.View view, r45.dq0 dq0Var) {
        if (com.tencent.mm.sdk.platformtools.f9.SessionLocation.k(view.getContext(), null)) {
            s82.t tVar = (s82.t) view.getTag();
            android.content.Context context = view.getContext();
            ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(context, tVar.f404774a, dq0Var);
        }
    }

    public final java.lang.String l(r45.pp0 pp0Var) {
        if (pp0Var != null) {
            return pp0Var.f383274o;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FavBaseListItem", "getPoiname but locItem is null");
        return "";
    }
}
