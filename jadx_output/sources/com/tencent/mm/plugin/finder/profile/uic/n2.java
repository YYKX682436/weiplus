package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class n2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.p2 f123996d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(com.tencent.mm.plugin.finder.profile.uic.p2 p2Var) {
        super(0);
        this.f123996d = p2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f123996d.getIntent().getBooleanExtra("KEY_FINDER_SELF_FLAG", false));
    }
}
