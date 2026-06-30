package com.tencent.mm.ui.chatting.component;

/* loaded from: classes8.dex */
public final class vp extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.wp f200144d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp(com.tencent.mm.ui.chatting.component.wp wpVar) {
        super(1);
        this.f200144d = wpVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        xj.m mVar = (xj.m) obj;
        if (mVar != null) {
            this.f200144d.f200190c = mVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoCopyAdReportHelper", "prefetchAdInfo: ad info fetched, aid=" + mVar.f454753a);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoCopyAdReportHelper", "prefetchAdInfo: no ad info available");
        }
        return jz5.f0.f302826a;
    }
}
