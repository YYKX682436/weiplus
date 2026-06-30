package os2;

/* loaded from: classes2.dex */
public final class a extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.b6n;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.protocal.protobuf.FinderAuthInfo authInfo;
        java.lang.String authProfession;
        com.tencent.mm.plugin.finder.viewmodel.component.t item = (com.tencent.mm.plugin.finder.viewmodel.component.t) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.gax);
        com.tencent.mm.ui.bk.s0(textView.getPaint());
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = item.f135948d;
        java.lang.String nickname = finderContact.getNickname();
        ((ke0.e) xVar).getClass();
        android.content.Context context = holder.f293121e;
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, nickname));
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.gau);
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d a17 = g1Var.a();
        mn2.n nVar = new mn2.n(finderContact.getHeadUrl(), com.tencent.mm.plugin.finder.storage.y90.W);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.gaw);
        kotlin.jvm.internal.o.f(p17, "getView(...)");
        a17.c(nVar, (android.widget.ImageView) p17, g1Var.h(mn2.f1.f329957h));
        com.tencent.mm.protocal.protobuf.FinderAuthInfo authInfo2 = finderContact.getAuthInfo();
        java.lang.Integer valueOf = authInfo2 != null ? java.lang.Integer.valueOf(authInfo2.getAuthIconType()) : null;
        if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 2)) {
            r45.xk a18 = ya2.d.a(finderContact, false);
            if (a18 == null || (authInfo = ya2.d.e(a18)) == null) {
                authInfo = finderContact.getAuthInfo();
            }
            com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo = authInfo;
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.m1 m1Var = ya2.m1.f460511a;
            android.view.View p18 = holder.p(com.tencent.mm.R.id.gav);
            kotlin.jvm.internal.o.f(p18, "getView(...)");
            zy2.tb.a(m1Var, (android.widget.ImageView) p18, finderAuthInfo, 0, 4, null);
            com.tencent.mm.protocal.protobuf.FinderAuthInfo authInfo3 = finderContact.getAuthInfo();
            if (authInfo3 != null && (authProfession = authInfo3.getAuthProfession()) != null) {
                textView2.setText(context.getResources().getString(com.tencent.mm.R.string.cq8, authProfession));
            }
        } else {
            textView2.setText(item.f135949e);
        }
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context;
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view = holder.itemView;
        jz5.l[] lVarArr = new jz5.l[8];
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(mMActivity);
        lVarArr[0] = new jz5.l("finder_tab_context_id", e17 != null ? e17.f135386r : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(mMActivity);
        lVarArr[1] = new jz5.l("finder_context_id", e18 != null ? e18.f135382p : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e19 = iyVar.e(mMActivity);
        lVarArr[2] = new jz5.l("behaviour_session_id", e19 != null ? e19.f135385q : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e27 = iyVar.e(mMActivity);
        lVarArr[3] = new jz5.l("comment_scene", e27 != null ? java.lang.Integer.valueOf(e27.f135380n) : null);
        lVarArr[4] = new jz5.l("finder_username", xy2.c.e(context));
        lVarArr[5] = new jz5.l("recommend_source_finder_username", finderContact.getUsername());
        lVarArr[6] = new jz5.l("recommended_reason", textView2.getText().toString());
        lVarArr[7] = new jz5.l("recommended_finder_index", java.lang.Integer.valueOf(i17 + 1));
        java.util.Map k17 = kz5.c1.k(lVarArr);
        cy1.a aVar = (cy1.a) rVar;
        aVar.pk(view, "recommend_account");
        aVar.gk(view, k17);
        aVar.ik(view, 40, 25496);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
    }
}
