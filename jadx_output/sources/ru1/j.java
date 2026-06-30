package ru1;

/* loaded from: classes13.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ru1.t f399720d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ru1.t tVar) {
        super(1);
        this.f399720d = tVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        gs0.b $receiver = (gs0.b) obj;
        kotlin.jvm.internal.o.g($receiver, "$this$$receiver");
        ru1.t tVar = this.f399720d;
        ru1.t.a(tVar, $receiver);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        tVar.f399733d = android.os.SystemClock.elapsedRealtime();
        $receiver.f274973c = new ru1.h(tVar);
        $receiver.f274974d = new ru1.i(tVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.CastReportHelper", "markVideoEncodingUseAsync");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1634L, 13L, 1L);
        return jz5.f0.f302826a;
    }
}
