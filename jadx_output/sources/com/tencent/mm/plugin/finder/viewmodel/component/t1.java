package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f2 f135956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitask.model.MultiTaskInfo f135957e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(com.tencent.mm.plugin.finder.viewmodel.component.f2 f2Var, com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        super(0);
        this.f135956d = f2Var;
        this.f135957e = multiTaskInfo;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.megavideo.multitask.h hVar = this.f135956d.f134316d;
        if (hVar == null) {
            kotlin.jvm.internal.o.o("multiTaskHelper");
            throw null;
        }
        hVar.f300077a = this.f135957e;
        hVar.D();
        return jz5.f0.f302826a;
    }
}
