package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class q20 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.t20 f113953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f113954e;

    public q20(com.tencent.mm.plugin.finder.live.plugin.t20 t20Var, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        this.f113953d = t20Var;
        this.f113954e = finderJumpInfo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveOneClickGameTipsPlugin$setClickJump3DDirect$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.t20 t20Var = this.f113953d;
        t20Var.v1();
        t20Var.getClass();
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f113954e;
        if (finderJumpInfo != null) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            android.view.ViewGroup viewGroup = t20Var.f365323d;
            android.content.Context context = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            r45.l34 l34Var = new r45.l34();
            bf3.x0 x0Var = bf3.x0.f19674a;
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            int i18 = x0Var.a(context2).y;
            android.content.Context context3 = viewGroup.getContext();
            kotlin.jvm.internal.o.e(context3, "null cannot be cast to non-null type android.app.Activity");
            int i19 = i18 - com.tencent.mm.ui.bk.m((android.app.Activity) context3).bottom;
            com.tencent.mm.protocal.protobuf.MiniAppInfo mini_app_info = finderJumpInfo.getMini_app_info();
            int half_page_custom_height = mini_app_info != null ? mini_app_info.getHalf_page_custom_height() : 0;
            boolean k17 = com.tencent.mm.ui.bk.k(viewGroup.getContext());
            if (half_page_custom_height > 0) {
                i17 = i65.a.b(viewGroup.getContext(), half_page_custom_height) + (k17 ? i19 : 0);
            } else {
                i17 = 544;
            }
            com.tencent.mars.xlog.Log.i(t20Var.f114332q, "half_page_custom_height=" + half_page_custom_height + " navHeight=" + i19 + " isNavigationBarVisibility=" + k17);
            r45.m34 m34Var = new r45.m34();
            m34Var.set(3, java.lang.Integer.valueOf(i17));
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            m34Var.set(0, bool);
            m34Var.set(1, bool);
            m34Var.set(2, java.lang.Boolean.TRUE);
            l34Var.set(2, m34Var);
            xc2.y2 y2Var = xc2.y2.f453343a;
            xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
            p0Var.f453238c = l34Var;
            xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveOneClickGameTipsPlugin$setClickJump3DDirect$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
