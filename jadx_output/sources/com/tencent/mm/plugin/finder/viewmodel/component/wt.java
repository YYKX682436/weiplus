package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes3.dex */
public final class wt extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.du f136367d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt(com.tencent.mm.plugin.finder.viewmodel.component.du duVar) {
        super(0);
        this.f136367d = duVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f136367d.getIntent().getBooleanExtra("EXTRA_FROM_GUIDE", false));
    }
}
