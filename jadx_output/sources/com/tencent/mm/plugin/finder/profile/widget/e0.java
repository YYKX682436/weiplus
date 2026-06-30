package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes2.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.k0 f124521d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.plugin.finder.profile.widget.k0 k0Var) {
        super(0);
        this.f124521d = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f124521d.f124591a.getIntent().getBooleanExtra(com.tencent.mm.ui.vas.VASActivity.KEY_IS_FRAGMENT_MODE, false));
    }
}
