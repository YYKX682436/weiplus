package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class pf extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.rf f132837d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf(com.tencent.mm.plugin.finder.view.rf rfVar) {
        super(0);
        this.f132837d = rfVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.view.rf rfVar = this.f132837d;
        if (rfVar.isShowing()) {
            rfVar.dismiss();
        }
        return jz5.f0.f302826a;
    }
}
