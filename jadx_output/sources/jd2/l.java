package jd2;

/* loaded from: classes10.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.widget.FinderLiveMentionTitleView f299158d;

    public l(com.tencent.mm.plugin.finder.feed.widget.FinderLiveMentionTitleView finderLiveMentionTitleView) {
        this.f299158d = finderLiveMentionTitleView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/widget/FinderLiveMentionTitleView$updateData$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        jd2.m mVar = this.f299158d.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String();
        if (mVar != null) {
            kotlin.jvm.internal.o.d(view);
            com.tencent.mm.plugin.finder.convert.dm dmVar = (com.tencent.mm.plugin.finder.convert.dm) mVar;
            cd2.c cVar = dmVar.f103166c.f40655d;
            com.tencent.mm.plugin.finder.convert.em emVar = dmVar.f103164a;
            emVar.getClass();
            ya2.b2 b17 = ya2.h.f460484a.b(cVar.q());
            in5.s0 s0Var = dmVar.f103165b;
            if (b17 != null) {
                com.tencent.mars.xlog.Log.i("FinderLiveMsgConvert", "onClickFollowBtn: " + emVar.getClass() + ", username: " + b17.D0() + ", nickname: " + b17.w0(), "isPrivate: " + hc2.s.f(b17));
                android.content.Context context = s0Var.f293121e;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6();
                i95.m c17 = i95.n0.c(c61.yb.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                c61.yb.R8((c61.yb) c17, V6, b17.D0(), 1, 0L, false, null, null, 25, 61, null, null, null, null, 7800, null);
                android.content.Context context2 = s0Var.f293121e;
                db5.t7.h(context2, context2.getString(com.tencent.mm.R.string.f491653ns2));
                com.tencent.mm.autogen.events.FollowUserEvent followUserEvent = new com.tencent.mm.autogen.events.FollowUserEvent();
                java.lang.String D0 = b17.D0();
                am.zd zdVar = followUserEvent.f54346g;
                zdVar.f8551a = D0;
                zdVar.f8552b = 4;
                zdVar.f8553c = true;
                followUserEvent.e();
            }
            android.content.Context context3 = s0Var.f293121e;
            com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = context3 instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) context3 : null;
            if (mMFinderUI == null || (str = java.lang.Integer.valueOf(mMFinderUI.getD()).toString()) == null) {
                str = "";
            }
            com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            java.lang.String b18 = b52.b.b();
            long l17 = cVar.l();
            java.lang.String q17 = cVar.q();
            java.lang.String str2 = q17 != null ? q17 : "";
            cl0.g gVar = new cl0.g();
            gVar.h("feedid", pm0.v.u(l17));
            gVar.h("finder_username", str2);
            java.lang.String gVar2 = gVar.toString();
            kotlin.jvm.internal.o.f(gVar2, "toString(...)");
            a4Var.b(str, b18, "person_page_message_page_message_focus", gVar2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/widget/FinderLiveMentionTitleView$updateData$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
