package com.tencent.mm.ui.chatting.component;

/* loaded from: classes.dex */
public final class yp extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.zp f200350d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp(com.tencent.mm.ui.chatting.component.zp zpVar) {
        super(1);
        this.f200350d = zpVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        xj.m mVar = (xj.m) obj;
        if (mVar != null) {
            this.f200350d.f200400a = mVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoForwardAdReportHelper", "prefetchAdInfo: ad info fetched, aid=" + mVar.f454753a);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoForwardAdReportHelper", "prefetchAdInfo: no ad info available");
        }
        return jz5.f0.f302826a;
    }
}
