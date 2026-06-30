package zv;

/* loaded from: classes9.dex */
public final class b3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f475914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f475915e;

    public b3(yz5.l lVar, java.lang.String str) {
        this.f475914d = lVar;
        this.f475915e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        java.lang.String userName = this.f475915e;
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.pigeon.biz_base.OftenReadAccountInfo oftenReadAccountInfo = new com.tencent.pigeon.biz_base.OftenReadAccountInfo(yw.h1.f466332a.h(userName), null, null, 6, null);
        com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(userName);
        if ((p17 != null ? p17.d1() : 0) > 0) {
            oftenReadAccountInfo = com.tencent.pigeon.biz_base.OftenReadAccountInfo.copy$default(oftenReadAccountInfo, null, java.lang.Boolean.TRUE, null, 5, null);
        }
        this.f475914d.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(oftenReadAccountInfo)));
    }
}
