package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class q extends androidx.recyclerview.widget.f2 implements zy2.m5 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f125818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderContactSearchUI f125819e;

    public q(com.tencent.mm.plugin.finder.search.FinderContactSearchUI finderContactSearchUI, boolean z17) {
        this.f125819e = finderContactSearchUI;
        this.f125818d = z17;
    }

    public static void x(com.tencent.mm.plugin.finder.search.q qVar, androidx.recyclerview.widget.k3 k3Var, int i17, boolean z17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.finder.search.FinderContactSearchUI finderContactSearchUI = qVar.f125819e;
        java.lang.Object obj2 = finderContactSearchUI.f125534z.get(i17);
        kotlin.jvm.internal.o.f(obj2, "get(...)");
        r45.mu2 mu2Var = (r45.mu2) obj2;
        com.tencent.mm.plugin.finder.search.FinderContactSearchUI finderContactSearchUI2 = qVar.f125819e;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) mu2Var.getCustom(0);
        com.tencent.mm.plugin.finder.search.FinderContactSearchUI.c7(finderContactSearchUI2, finderContact != null ? finderContact.getUsername() : null, i17, 0, 4, null);
        kotlin.jvm.internal.o.e(k3Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.search.FinderMixSearchContactItemHolder");
        ((com.tencent.mm.plugin.finder.search.v2) k3Var).k(mu2Var, new com.tencent.mm.plugin.finder.search.n(finderContactSearchUI, i17), new com.tencent.mm.plugin.finder.search.o(finderContactSearchUI), i17 != 0);
        android.view.View view = k3Var.itemView;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.ffc);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget finderLiveOnliveWidget = (com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget) findViewById;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(finderLiveOnliveWidget, "living_label");
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        java.lang.Object tag = view.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSearchInfo");
        r45.mu2 mu2Var2 = (r45.mu2) tag;
        h0Var.f310123d = mu2Var2;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) mu2Var2.getCustom(0);
        if (finderContact2 != null && finderContact2.getLiveStatus() == 1) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(finderLiveOnliveWidget, 40, 26236);
            ml2.q1 q1Var = ml2.q1.f327812e;
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[5];
            lVarArr[0] = new jz5.l("feed_id", "0");
            lVarArr[1] = new jz5.l("live_id", "");
            lVarArr[2] = new jz5.l("comment_scene", "temp_3");
            com.tencent.mm.protocal.protobuf.FinderContact finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) ((r45.mu2) h0Var.f310123d).getCustom(0);
            lVarArr[3] = new jz5.l("finder_username", finderContact3 != null ? finderContact3.getUsername() : null);
            lVarArr[4] = new jz5.l("session_buffer", " ");
            ((cy1.a) rVar).gk(finderLiveOnliveWidget, kz5.c1.k(lVarArr));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(finderLiveOnliveWidget, new com.tencent.mm.plugin.finder.search.p(h0Var));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f125819e.f125534z.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17, java.util.List payloads) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        x(this, holder, i17, false, 4, null);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        androidx.appcompat.app.AppCompatActivity context = this.f125819e.getContext();
        kotlin.jvm.internal.o.d(context);
        android.view.LayoutInflater layoutInflater = context.getLayoutInflater();
        boolean z17 = this.f125818d;
        android.view.View inflate = layoutInflater.inflate(z17 ? com.tencent.mm.R.layout.afj : com.tencent.mm.R.layout.afi, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new com.tencent.mm.plugin.finder.search.v2(inflate, true, !z17, false, 8, null);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        x(this, holder, i17, false, 4, null);
    }
}
