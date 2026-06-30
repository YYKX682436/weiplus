package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class hf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f134624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.qf f134625e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f134626f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f134627g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f134628h;

    public hf(int i17, com.tencent.mm.plugin.finder.viewmodel.component.qf qfVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, java.lang.String str, com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        this.f134624d = i17;
        this.f134625e = qfVar;
        this.f134626f = baseFinderFeed;
        this.f134627g = str;
        this.f134628h = finderItem;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        jz5.f0 f0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedShareDescToCommentUIC$showPostOkTipsBubble$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.viewmodel.component.qf qfVar = this.f134625e;
        int i17 = this.f134624d;
        if (i17 == 1) {
            qfVar.getClass();
            com.tencent.mars.xlog.Log.i("FinderFeedShareDescToCommentUIC", "[gotoMakeRedPacketCoverUI] exportId:exportId");
            java.lang.String str = "pages/index/index.html?channel=202401&exportId=" + this.f134627g;
            l81.b1 b1Var = new l81.b1();
            b1Var.f317014b = "wxb8f2d39684e3fe62";
            b1Var.f317022f = str;
            b1Var.f317016c = 0;
            b1Var.f317032k = 1000;
            b1Var.M = true;
            com.tencent.mars.xlog.Log.i("FinderFeedShareDescToCommentUIC", "appId: " + b1Var.f317014b + ", enterPath: " + b1Var.f317022f);
            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(qfVar.getContext(), b1Var);
        } else if (i17 == 2) {
            qfVar.getClass();
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f134628h;
            long id6 = finderItem.getId();
            java.lang.String nonceId = finderItem.getObjectNonceId();
            com.tencent.mars.xlog.Log.i("FinderFeedShareDescToCommentUIC", "[gotoMakeEmotionUI] feedId:" + pm0.v.u(id6) + " nonceId:" + nonceId);
            if (((com.tencent.mm.feature.emoji.api.l6) i95.n0.c(com.tencent.mm.feature.emoji.api.l6.class)) != null) {
                android.app.Activity context = qfVar.getContext();
                kotlin.jvm.internal.o.g(context, "context");
                kotlin.jvm.internal.o.g(nonceId, "nonceId");
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.emoji.ui.EmoticonCustomCreateDirectFinderUI.class);
                intent.putExtra("feedId", id6);
                intent.putExtra("nonceId", nonceId);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/feature/emoji/EmoticonCustomCreateFeatureService", "openCustomCreateEmoticonDirectFromFinder", "(Landroid/content/Context;JLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(context, "com/tencent/mm/feature/emoji/EmoticonCustomCreateFeatureService", "openCustomCreateEmoticonDirectFromFinder", "(Landroid/content/Context;JLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.e("FinderFeedShareDescToCommentUIC", "unable to get emoticon custom create service for starting editing");
            }
        } else if (i17 == 3) {
            com.tencent.mm.plugin.finder.assist.y4.f102714a.Q(qfVar.getContext(), this.f134626f);
        }
        qfVar.O6();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedShareDescToCommentUIC$showPostOkTipsBubble$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
