package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class e00 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.w00 f112357d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e00(com.tencent.mm.plugin.finder.live.plugin.w00 w00Var) {
        super(1);
        this.f112357d = w00Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.live.plugin.w00 w00Var = this.f112357d;
        if (w00Var.F == null) {
            com.tencent.mm.plugin.finder.live.widget.lo loVar = new com.tencent.mm.plugin.finder.live.widget.lo(it, w00Var);
            w00Var.F = loVar;
            loVar.f118967k = new com.tencent.mm.plugin.finder.live.plugin.d00(w00Var);
        }
        return jz5.f0.f302826a;
    }
}
