package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes.dex */
public final class k9 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.v9 f117204d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9(com.tencent.mm.plugin.finder.live.viewmodel.v9 v9Var) {
        super(2);
        this.f117204d = v9Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        r45.of1 aliasInfo = (r45.of1) obj;
        android.view.View itemView = (android.view.View) obj2;
        kotlin.jvm.internal.o.g(aliasInfo, "aliasInfo");
        kotlin.jvm.internal.o.g(itemView, "itemView");
        if (aliasInfo.getInteger(2) == 2) {
            com.tencent.mm.plugin.finder.live.viewmodel.v9 v9Var = this.f117204d;
            if (v9Var.f117499u) {
                int[] iArr = v9Var.f117493o;
                if (iArr[0] == 0 || iArr[1] == 0) {
                    java.lang.String str = "onItemLongClickCallback before change x:" + iArr[0] + ", original y:" + iArr[1];
                    java.lang.String str2 = v9Var.f117485d;
                    com.tencent.mars.xlog.Log.i(str2, str);
                    itemView.getLocationOnScreen(iArr);
                    com.tencent.mars.xlog.Log.i(str2, "onItemLongClickCallback after change x:" + iArr[0] + ", original y:" + iArr[1]);
                }
                int i17 = iArr[0];
                int i18 = iArr[1];
                if (v9Var.f117490i == null) {
                    v9Var.f117490i = new rl5.r(v9Var.getContext());
                }
                rl5.r rVar = v9Var.f117490i;
                if (rVar != null) {
                    rVar.a();
                }
                rl5.r rVar2 = v9Var.f117490i;
                if (rVar2 != null) {
                    rVar2.h(itemView, new com.tencent.mm.plugin.finder.live.viewmodel.s9(v9Var), new com.tencent.mm.plugin.finder.live.viewmodel.t9(v9Var, aliasInfo), i17, i18);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
