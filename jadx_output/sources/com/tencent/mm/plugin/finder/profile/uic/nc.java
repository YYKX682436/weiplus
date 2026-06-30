package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class nc extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.xc f124008d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc(com.tencent.mm.plugin.finder.profile.uic.xc xcVar) {
        super(0);
        this.f124008d = xcVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f124008d.getIntent().getBooleanExtra("KEY_FINDER_SELF_FLAG", false));
    }
}
