package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class p8 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f135534d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f135535e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f135536f;

    public p8(java.util.LinkedList linkedList, in5.s0 s0Var, kotlin.jvm.internal.h0 h0Var) {
        this.f135534d = linkedList;
        this.f135535e = s0Var;
        this.f135536f = h0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.Object obj = this.f135534d.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderDebugUIC", "onClickOk spec:".concat(str));
        com.tencent.mm.plugin.finder.assist.e9.f102132a.a();
        cu2.x.f222449a.a();
        yr2.k ek6 = ((c61.l7) i95.n0.c(c61.l7.class)).ek();
        ek6.getClass();
        ek6.E = str;
        in5.s0 s0Var = this.f135535e;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.itemView.findViewById(com.tencent.mm.R.id.e_k);
        if (finderVideoLayout.getPlayInfo() == null) {
            com.tencent.mars.xlog.Log.w(finderVideoLayout.getFTPPTag(), "retryFindSpecPlay return for playInfo null");
        } else {
            cw2.h8 playInfo = finderVideoLayout.getPlayInfo();
            kotlin.jvm.internal.o.d(playInfo);
            cw2.h8 playInfo2 = finderVideoLayout.getPlayInfo();
            kotlin.jvm.internal.o.d(playInfo2);
            java.lang.Object obj2 = playInfo.f223749e.get(playInfo2.f223748d);
            kotlin.jvm.internal.o.f(obj2, "get(...)");
            r45.mb4 mb4Var = (r45.mb4) obj2;
            cw2.h8 playInfo3 = finderVideoLayout.getPlayInfo();
            kotlin.jvm.internal.o.d(playInfo3);
            long id6 = playInfo3.f223745a.getId();
            java.lang.String string = mb4Var.getString(9);
            if (string == null) {
                string = "";
            }
            mn2.g4 A = finderVideoLayout.A(id6, string, mb4Var);
            cw2.h8 playInfo4 = finderVideoLayout.getPlayInfo();
            kotlin.jvm.internal.o.d(playInfo4);
            com.tencent.mm.plugin.finder.storage.FeedData feedData = playInfo4.f223745a;
            java.lang.String n17 = A.n();
            cw2.h8 playInfo5 = finderVideoLayout.getPlayInfo();
            kotlin.jvm.internal.o.d(playInfo5);
            int i18 = playInfo5.f223748d;
            java.util.LinkedList linkedList = finderVideoLayout.f130726z;
            cw2.h8 playInfo6 = finderVideoLayout.getPlayInfo();
            kotlin.jvm.internal.o.d(playInfo6);
            boolean z17 = playInfo6.f223750f;
            r45.mb4 mb4Var2 = A.f330002e;
            finderVideoLayout.setPlayInfo(new cw2.h8(feedData, n17, A, i18, linkedList, z17, true, false, false, mb4Var2.getBoolean(13) ? (r45.dd4) mb4Var2.getCustom(14) : null, false, 1408, null));
            finderVideoLayout.getRetryBtn().performClick();
        }
        com.tencent.mm.ui.widget.dialog.j0 j0Var = (com.tencent.mm.ui.widget.dialog.j0) this.f135536f.f310123d;
        if (j0Var != null) {
            j0Var.setTitle(com.tencent.mm.plugin.finder.viewmodel.component.q8.Q6(s0Var));
        }
        yr2.k ek7 = ((c61.l7) i95.n0.c(c61.l7.class)).ek();
        ek7.getClass();
        ek7.E = "";
    }
}
