package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.i0 f161624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f161625e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.plugin.setting.ui.setting.i0 i0Var, android.graphics.Bitmap bitmap) {
        super(0);
        this.f161624d = i0Var;
        this.f161625e = bitmap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.setting.ui.setting.i0 i0Var = this.f161624d;
        android.app.Activity context = i0Var.getContext();
        android.app.Activity context2 = i0Var.getContext();
        ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
        dp.a.makeText(context, context2.getString(com.tencent.mm.R.string.f492304g00, q75.c.e()), 1).show();
        this.f161625e.recycle();
        return jz5.f0.f302826a;
    }
}
