package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class b80 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.i80 f111985d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b80(com.tencent.mm.plugin.finder.live.plugin.i80 i80Var) {
        super(0);
        this.f111985d = i80Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.i80 i80Var = this.f111985d;
        android.content.Context context = i80Var.f112937d;
        i80Var.f112944n = com.tencent.mm.ui.widget.dialog.u3.f(context, context.getString(com.tencent.mm.R.string.ggd), true, 3, null);
        return jz5.f0.f302826a;
    }
}
