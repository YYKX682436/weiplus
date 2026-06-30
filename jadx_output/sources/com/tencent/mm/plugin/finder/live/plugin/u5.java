package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class u5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v5 f114522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f114523e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(com.tencent.mm.plugin.finder.live.plugin.v5 v5Var, java.lang.String str) {
        super(1);
        this.f114522d = v5Var;
        this.f114523e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.finder.live.plugin.v5 v5Var = this.f114522d;
        if (booleanValue) {
            v5Var.f114664t.alive();
            android.content.Intent intent = new android.content.Intent();
            android.view.ViewGroup viewGroup = v5Var.f365323d;
            intent.setClass(viewGroup.getContext(), com.tencent.mm.plugin.finder.feed.ui.FinderLiveRealNameVerifyJumpUI.class);
            intent.putExtra("enterRealnameVerifyUI", true);
            android.content.Context context = viewGroup.getContext();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorExceptionPlugin$showFaceVerify$1", "invoke", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorExceptionPlugin$showFaceVerify$1", "invoke", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            ((ml2.j0) i95.n0.c(ml2.j0.class)).Jj(ml2.d3.f327356f, this.f114523e);
        } else {
            qo0.c.a(v5Var.f114660p, qo0.b.f365363i, null, 2, null);
        }
        return jz5.f0.f302826a;
    }
}
