package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class k0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.x0 f118793d;

    public k0(com.tencent.mm.plugin.finder.live.widget.x0 x0Var) {
        this.f118793d = x0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        fn2.s1 s1Var = (fn2.s1) this.f118793d;
        kotlinx.coroutines.y0 y0Var = s1Var.C;
        if (y0Var != null) {
            kotlinx.coroutines.z0.d(y0Var, "onCancel", null, 2, null);
        }
        s1Var.x();
    }
}
