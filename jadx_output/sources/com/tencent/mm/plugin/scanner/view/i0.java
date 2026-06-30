package com.tencent.mm.plugin.scanner.view;

/* loaded from: classes13.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.view.t0 f159942d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.tencent.mm.plugin.scanner.view.t0 t0Var) {
        super(0);
        this.f159942d = t0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        if (this.f159942d.getContext() instanceof android.app.Activity) {
            android.content.Context context = this.f159942d.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            if (!((android.app.Activity) context).isFinishing() && !((qt5.c) this.f159942d.f215302e).f366657b) {
                z17 = false;
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = true;
        return java.lang.Boolean.valueOf(z17);
    }
}
