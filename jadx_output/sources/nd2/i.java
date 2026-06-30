package nd2;

/* loaded from: classes10.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nd2.o f336441d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.live_cdn_player.LiveCDNPlayerEvent f336442e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(nd2.o oVar, com.tencent.pigeon.live_cdn_player.LiveCDNPlayerEvent liveCDNPlayerEvent) {
        super(0);
        this.f336441d = oVar;
        this.f336442e = liveCDNPlayerEvent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f336441d.f336450f.onEvent(this.f336442e, nd2.h.f336440d);
        return jz5.f0.f302826a;
    }
}
