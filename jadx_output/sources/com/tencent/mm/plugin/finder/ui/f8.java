package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class f8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderLiveExceptionUI f129125d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8(com.tencent.mm.plugin.finder.ui.FinderLiveExceptionUI finderLiveExceptionUI) {
        super(1);
        this.f129125d = finderLiveExceptionUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ((java.lang.Boolean) obj).booleanValue();
        this.f129125d.onBackPressed();
        return jz5.f0.f302826a;
    }
}
