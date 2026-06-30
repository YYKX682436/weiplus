package com.tencent.mm.plugin.finder.view;

/* loaded from: classes.dex */
public final class gp extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.kp f132184d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gp(com.tencent.mm.plugin.finder.view.kp kpVar) {
        super(1);
        this.f132184d = kpVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return java.lang.Boolean.valueOf(this.f132184d.f132525g.size() - 1 == ((java.lang.Number) obj).intValue());
    }
}
