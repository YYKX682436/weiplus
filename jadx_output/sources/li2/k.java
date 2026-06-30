package li2;

/* loaded from: classes10.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ li2.o f318767d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(li2.o oVar) {
        super(1);
        this.f318767d = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = this.f318767d.W;
        if (ripperAnimateView != null) {
            ripperAnimateView.setColor(intValue);
        }
        return jz5.f0.f302826a;
    }
}
