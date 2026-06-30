package di2;

/* loaded from: classes10.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ di2.j f232646d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(di2.j jVar) {
        super(1);
        this.f232646d = jVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = this.f232646d.W;
        if (ripperAnimateView != null) {
            ripperAnimateView.setColor(intValue);
        }
        return jz5.f0.f302826a;
    }
}
