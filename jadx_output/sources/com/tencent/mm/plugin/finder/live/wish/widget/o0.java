package com.tencent.mm.plugin.finder.live.wish.widget;

/* loaded from: classes.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.wish.widget.t0 f120746d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.tencent.mm.plugin.finder.live.wish.widget.t0 t0Var) {
        super(3);
        this.f120746d = t0Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mars.xlog.Log.w("WishEditPanelWidget", "deleteInteractionWish fail errCode: " + ((java.lang.Integer) obj2) + " errType: " + ((java.lang.Integer) obj3) + " errMsg: " + str);
        com.tencent.mm.plugin.finder.live.wish.widget.t0 t0Var = this.f120746d;
        if (str == null) {
            str = t0Var.f118381d.getResources().getString(com.tencent.mm.R.string.oss);
            kotlin.jvm.internal.o.f(str, "getString(...)");
        }
        android.content.Context context = t0Var.f118381d;
        db5.t7.g(context, context.getResources().getString(com.tencent.mm.R.string.f493746ow2, str));
        return jz5.f0.f302826a;
    }
}
