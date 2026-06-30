package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes5.dex */
public final class md extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.nd f174104d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f174105e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md(com.tencent.mm.plugin.textstatus.ui.nd ndVar, android.widget.FrameLayout frameLayout) {
        super(1);
        this.f174104d = ndVar;
        this.f174105e = frameLayout;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        kk4.b it = (kk4.b) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.textstatus.ui.nd ndVar = this.f174104d;
        boolean z17 = ndVar.f174130b;
        android.widget.FrameLayout frameLayout = this.f174105e;
        if (frameLayout != null) {
            ndVar.a(frameLayout);
        }
        return jz5.f0.f302826a;
    }
}
