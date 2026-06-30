package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class a5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.r5 f116897d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.c6 f116898e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var, com.tencent.mm.plugin.finder.live.viewmodel.c6 c6Var) {
        super(0);
        this.f116897d = r5Var;
        this.f116898e = c6Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var = this.f116897d;
        yz5.p pVar = r5Var.f117361p;
        if (pVar != null) {
            ((com.tencent.mm.plugin.finder.live.viewmodel.i5) pVar).invoke(this.f116898e, java.lang.Boolean.TRUE);
        }
        com.tencent.mm.plugin.finder.live.widget.sl slVar = r5Var.f117363r;
        if (slVar != null) {
            slVar.dismiss();
        }
        r5Var.f117363r = null;
        return jz5.f0.f302826a;
    }
}
