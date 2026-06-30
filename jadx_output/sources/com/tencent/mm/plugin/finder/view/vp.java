package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class vp extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.zp f133267d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp(com.tencent.mm.plugin.finder.view.zp zpVar) {
        super(1);
        this.f133267d = zpVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return java.lang.Boolean.valueOf(this.f133267d.f133487d.size() - 1 == ((java.lang.Number) obj).intValue());
    }
}
