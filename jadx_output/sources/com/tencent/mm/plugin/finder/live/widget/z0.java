package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class z0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f120488d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.b1 f120489e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(android.content.Context context, com.tencent.mm.plugin.finder.live.widget.b1 b1Var) {
        super(0);
        this.f120488d = context;
        this.f120489e = b1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f120488d;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        com.tencent.mm.ui.tools.f5 f5Var = new com.tencent.mm.ui.tools.f5((android.app.Activity) context);
        f5Var.f210400e = new com.tencent.mm.plugin.finder.live.widget.y0(this.f120489e);
        return f5Var;
    }
}
