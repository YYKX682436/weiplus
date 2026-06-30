package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class y3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.f4 f124378d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(com.tencent.mm.plugin.finder.profile.uic.f4 f4Var) {
        super(0);
        this.f124378d = f4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Long.valueOf(this.f124378d.getIntent().getLongExtra("finder_read_feed_id", 0L));
    }
}
