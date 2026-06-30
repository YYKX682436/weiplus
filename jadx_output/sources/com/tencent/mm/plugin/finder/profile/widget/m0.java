package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.s1 f124620d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.tencent.mm.plugin.finder.profile.widget.s1 s1Var) {
        super(0);
        this.f124620d = s1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Long.valueOf(this.f124620d.f124718b.getIntent().getLongExtra("finder_read_feed_id", 0L));
    }
}
