package s82;

/* loaded from: classes9.dex */
public class k extends s82.c {
    @Override // s82.c
    public android.view.View e(android.view.View view, android.view.ViewGroup viewGroup, o72.r2 r2Var) {
        android.view.View view2;
        s82.j jVar;
        android.content.Context context = viewGroup.getContext();
        if (view == null) {
            jVar = new s82.j();
            view2 = android.view.View.inflate(context, com.tencent.mm.R.layout.abb, null);
            a(view2, jVar, r2Var);
            jVar.f404802q = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.dum);
            android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.dwp);
            jVar.f404803r = textView;
            textView.setSingleLine(false);
            jVar.f404803r.setMaxLines(2);
            jVar.f404804s = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.f484314du0);
            jVar.f404805t = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.dvy);
        } else {
            view2 = view;
            jVar = (s82.j) view.getTag();
        }
        g(jVar, r2Var);
        com.tencent.mm.storage.y8 D3 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().D3(o72.x1.J(r2Var).f375408f);
        java.lang.String str = D3.f196358a;
        if (str == null || str.length() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavCardListItem", "parse possible friend msg failed");
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(l(D3))) {
            jVar.f404804s.setVisibility(8);
        } else {
            jVar.f404804s.setText(l(D3));
        }
        jVar.f404805t.setText(com.tencent.mm.R.string.cay);
        jVar.f404805t.setVisibility(0);
        android.widget.ImageView imageView = jVar.f404802q;
        java.lang.String str2 = D3.f196358a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            imageView.setImageResource(com.tencent.mm.R.drawable.bhm);
        } else {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, str2, null);
        }
        return view2;
    }

    @Override // s82.c
    public void f(android.view.View view, r45.dq0 dq0Var) {
        s82.j jVar = (s82.j) view.getTag();
        android.content.Context context = view.getContext();
        ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(context, jVar.f404774a, dq0Var);
    }

    public java.lang.String l(com.tencent.mm.storage.y8 y8Var) {
        java.lang.String str = y8Var.f196360c;
        boolean z17 = false;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = y8Var.f196358a;
            if (com.tencent.mm.storage.z3.y3(str) || com.tencent.mm.storage.z3.E4(str)) {
                z17 = true;
            }
        }
        boolean z18 = (z17 || ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().h(str)) ? z17 : true;
        int i17 = y8Var.f196374q;
        java.util.Set set = c01.e2.f37117a;
        return (z18 || com.tencent.mm.storage.z3.D3(i17)) ? "" : str;
    }
}
