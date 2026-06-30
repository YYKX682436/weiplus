package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes11.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.s f154322d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.plugin.profile.ui.tab.s sVar) {
        super(0);
        this.f154322d = sVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i(this.f154322d.f154535d, "bobkw BizProfileDataUtil set bizManager");
        return com.tencent.wechat.iam.biz.t1.f217792c.a().b();
    }
}
