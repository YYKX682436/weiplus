package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class az extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.SpringBackLayout f133813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.iz f133814e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az(com.tencent.mm.plugin.finder.view.SpringBackLayout springBackLayout, com.tencent.mm.plugin.finder.viewmodel.component.iz izVar) {
        super(0);
        this.f133813d = springBackLayout;
        this.f133814e = izVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.viewmodel.component.iz izVar = this.f133814e;
        com.tencent.mm.plugin.finder.view.SpringBackLayout springBackLayout = this.f133813d;
        springBackLayout.post(new com.tencent.mm.plugin.finder.viewmodel.component.zy(izVar, springBackLayout));
        return jz5.f0.f302826a;
    }
}
