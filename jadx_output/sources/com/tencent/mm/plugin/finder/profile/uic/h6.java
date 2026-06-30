package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class h6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.i6 f123757d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(com.tencent.mm.plugin.finder.profile.uic.i6 i6Var) {
        super(0);
        this.f123757d = i6Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f123757d.getIntent().getStringExtra("from_user");
    }
}
