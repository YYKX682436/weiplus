package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes2.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.d0 f124485d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.mm.plugin.finder.profile.widget.d0 d0Var) {
        super(0);
        this.f124485d = d0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f124485d.f124504a.getIntent().getBooleanExtra("KEY_FINDER_SELF_FLAG", false));
    }
}
