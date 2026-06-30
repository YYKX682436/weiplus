package com.tencent.mm.plugin.finder.live.wish.widget;

/* loaded from: classes10.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.wish.widget.e f120695d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.plugin.finder.live.wish.widget.e eVar) {
        super(3);
        this.f120695d = eVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str = (java.lang.String) obj;
        java.lang.Integer num = (java.lang.Integer) obj2;
        com.tencent.mm.plugin.finder.live.wish.widget.e eVar = this.f120695d;
        ((az2.f) ((jz5.n) eVar.f120701o).getValue()).b();
        com.tencent.mars.xlog.Log.w("InteractionWishPanelWidget", "createInteractionWish fail errCode: " + num + " errType: " + ((java.lang.Integer) obj3) + " errMsg: " + str);
        if (num != null && num.intValue() == -200462) {
            com.tencent.mm.plugin.finder.live.wish.widget.i iVar = eVar.f120700n;
            if (iVar == null) {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
            com.tencent.mm.plugin.finder.live.wish.widget.f[] fVarArr = com.tencent.mm.plugin.finder.live.wish.widget.f.f120703d;
            com.tencent.mm.plugin.finder.live.wish.widget.m mVar = iVar.f120715n;
            if (mVar != null && com.tencent.mm.plugin.finder.live.wish.widget.j.f120718a[0] == 1) {
                android.widget.TextView textView = mVar.f120740p;
                if (textView == null) {
                    kotlin.jvm.internal.o.o("performanceNameInvalidDesc");
                    throw null;
                }
                textView.setVisibility(0);
            }
        }
        android.content.Context context = eVar.f118381d;
        if (str == null) {
            str = context.getResources().getString(com.tencent.mm.R.string.oss);
            kotlin.jvm.internal.o.f(str, "getString(...)");
        }
        db5.t7.g(context, context.getResources().getString(com.tencent.mm.R.string.f493746ow2, str));
        return jz5.f0.f302826a;
    }
}
