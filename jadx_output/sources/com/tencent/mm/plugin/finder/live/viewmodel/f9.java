package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes.dex */
public final class f9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.v9 f117097d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9(com.tencent.mm.plugin.finder.live.viewmodel.v9 v9Var) {
        super(0);
        this.f117097d = v9Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.viewmodel.v9 v9Var = this.f117097d;
        v9Var.S6();
        v9Var.getActivity().finish();
        v9Var.getActivity().overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477877e1);
        return jz5.f0.f302826a;
    }
}
