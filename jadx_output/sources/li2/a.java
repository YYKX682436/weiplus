package li2;

/* loaded from: classes10.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f318756d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ li2.b f318757e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(boolean z17, li2.b bVar) {
        super(0);
        this.f318756d = z17;
        this.f318757e = bVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f318756d;
        li2.b bVar = this.f318757e;
        if (z17) {
            bVar.getMicAudioWaveViewCallback().a();
        } else {
            bVar.getMicAudioWaveViewCallback().b();
        }
        return jz5.f0.f302826a;
    }
}
