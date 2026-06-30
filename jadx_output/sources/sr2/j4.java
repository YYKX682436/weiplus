package sr2;

/* loaded from: classes10.dex */
public final class j4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.post.PostMainUIC f411605d;

    public j4(com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC) {
        this.f411605d = postMainUIC;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/post/PostMainUIC$initPostBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click post btn, isFromAd: ");
        com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC = this.f411605d;
        sb6.append(postMainUIC.k7().Y);
        com.tencent.mars.xlog.Log.i("Finder.FinderPostUI", sb6.toString());
        if (postMainUIC.k7().Y) {
            com.tencent.mm.plugin.finder.storage.x80 c76 = postMainUIC.c7();
            c76.field_localId = ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).cj();
            c76.field_createTime = c01.id.e();
            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = c76.t0().getFinderObject().getObjectDesc();
            r45.zw0 client_draft_ext_info = objectDesc != null ? objectDesc.getClient_draft_ext_info() : null;
            if (client_draft_ext_info != null) {
                com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
                client_draft_ext_info.set(14, java.lang.Integer.valueOf(finderFeedReportObject != null ? finderFeedReportObject.getEnterScene() : 0));
            }
            com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject2 = com.tencent.mm.plugin.finder.report.p2.f125238b;
            if (finderFeedReportObject2 != null) {
                finderFeedReportObject2.setSourceEnterScene(finderFeedReportObject2.getEnterScene());
            }
            r45.qb4 postInfo = c76.getPostInfo();
            r45.ip2 ip2Var = new r45.ip2();
            ip2Var.set(0, java.lang.Integer.valueOf(postMainUIC.k7().U));
            ip2Var.set(1, postMainUIC.k7().f401415b0);
            postInfo.set(29, ip2Var);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("doPostAdDraft:");
            sb7.append(c76.field_localId);
            sb7.append(" des:");
            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2 = c76.t0().getFeedObject().getObjectDesc();
            sb7.append(objectDesc2 != null ? objectDesc2.getDescription() : null);
            sb7.append(" showOrigin:");
            sb7.append(c76.t0().getFeedObject().getShowOriginal());
            sb7.append(" localId:");
            sb7.append(c76.field_localId);
            com.tencent.mars.xlog.Log.i("Finder.FinderPostUI", sb7.toString());
            mv2.f0 f0Var = mv2.f0.f331561a;
            ov2.c cVar = mv2.f0.f331563c;
            cVar.getClass();
            ((java.util.ArrayList) cVar.f349173f).add(c76);
            f0Var.c();
            com.tencent.mars.xlog.Log.i("LogPost.FinderPostManager", "doPostDraft " + c76.field_localId);
            pm0.v.X(new sr2.x3(postMainUIC));
            postMainUIC.t7(false, 2);
        } else {
            boolean[] zArr = postMainUIC.Z;
            if (zArr[0]) {
                zArr[0] = false;
            } else {
                fo3.s sVar = fo3.s.INSTANCE;
                sVar.Z7("ce_feed_publish", "<FeedPublish>");
                sVar.H2("ce_feed_publish", android.view.MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 65535));
                sVar.Qa("ce_feed_publish");
            }
            if (postMainUIC.B7()) {
                java.lang.String string = postMainUIC.getActivity().getResources().getString(com.tencent.mm.R.string.nlw);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                java.lang.String string2 = postMainUIC.getActivity().getResources().getString(com.tencent.mm.R.string.nlv);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                java.lang.String string3 = postMainUIC.getActivity().getResources().getString(com.tencent.mm.R.string.f490347sg);
                kotlin.jvm.internal.o.f(string3, "getString(...)");
                db5.e1.D(postMainUIC.getActivity(), string, "", string2, string3, true, new sr2.y3(postMainUIC), sr2.z3.f411827d, com.tencent.mm.R.color.f478621cg);
            } else {
                postMainUIC.r7();
                com.tencent.mm.plugin.finder.report.p2 p2Var2 = com.tencent.mm.plugin.finder.report.p2.f125237a;
                com.tencent.mm.plugin.finder.report.p2.L(p2Var2, postMainUIC.getContext(), 66, postMainUIC.k7().P, 0L, 0, 24, null);
                postMainUIC.K7(postMainUIC.n7(), "post_icon");
                java.util.Map Ai = ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Ai();
                Ai.put("view_id", "post_click");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("post_click", null, Ai, 6, false);
                long c17 = c01.id.c();
                com.tencent.mm.plugin.finder.report.p2.z(p2Var2, "FirstToPostAction", "PostPage", null, 0, c17, 12, null);
                com.tencent.mm.plugin.finder.report.p2.z(p2Var2, "RealWait", null, null, 0, c17, 14, null);
                p2Var2.G("andr_Post_Page_Click", null);
                com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
                android.app.Activity context = postMainUIC.getContext();
                kotlin.jvm.internal.o.g(context, "context");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                com.tencent.mm.plugin.finder.report.b6.d(b6Var, nyVar != null ? nyVar.V6() : null, "song_finish_publish", 1, (org.json.JSONObject) ((jz5.n) postMainUIC.S).getValue(), false, null, 48, null);
                postMainUIC.I7().b7();
                com.tencent.mm.plugin.finder.storage.ad0 ad0Var = com.tencent.mm.plugin.finder.storage.ad0.f126402a;
                ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.f126401J).getValue()).l();
                ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.K).getValue()).l();
                ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.L).getValue()).l();
                ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.M).getValue()).l();
                ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.N).getValue()).l();
                ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.O).getValue()).l();
                mv2.f0.f331561a.p(mv2.g0.f331570e);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/post/PostMainUIC$initPostBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
