package i70;

/* loaded from: classes12.dex */
public final class f extends com.tencent.mm.network.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i70.g f289402d;

    public f(i70.g gVar) {
        this.f289402d = gVar;
    }

    @Override // com.tencent.mm.network.s0
    public void onNetworkChange(int i17) {
        rk0.c.c("MicroMsg.IILinkStreamFeatureService", "process: %s on network changed: %d", bm5.f1.a(), java.lang.Integer.valueOf(i17));
        com.tencent.wechat.aff.ilink_stream.p.f217294b.c(this.f289402d.Ai());
    }
}
