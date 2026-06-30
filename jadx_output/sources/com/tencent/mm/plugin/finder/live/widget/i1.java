package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes15.dex */
public final class i1 implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f118612a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.t1 f118613b;

    public i1(com.tencent.mm.plugin.finder.live.widget.t1 t1Var) {
        this.f118613b = t1Var;
    }

    @Override // d85.k0
    public void onOp(java.lang.Boolean bool) {
        if (this.f118612a) {
            return;
        }
        this.f118612a = true;
        this.f118613b.l0(bool != null ? bool.booleanValue() : false);
    }
}
