package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class oo extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.po f135480d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo(com.tencent.mm.plugin.finder.viewmodel.component.po poVar) {
        super(0);
        this.f135480d = poVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.xj xjVar = this.f135480d.f135573e;
        if (xjVar != null) {
            xjVar.a();
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }
}
