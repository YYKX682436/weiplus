package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f131686d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.c1 f131687e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(android.app.Activity activity, com.tencent.mm.plugin.finder.view.c1 c1Var) {
        super(0);
        this.f131686d = activity;
        this.f131687e = c1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.tools.f5 f5Var = new com.tencent.mm.ui.tools.f5(this.f131686d);
        f5Var.f210400e = new com.tencent.mm.plugin.finder.view.a1(this.f131687e);
        return f5Var;
    }
}
