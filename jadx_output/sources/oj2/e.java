package oj2;

/* loaded from: classes10.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f345761d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oj2.f f345762e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z17, oj2.f fVar) {
        super(0);
        this.f345761d = z17;
        this.f345762e = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f345761d;
        oj2.f fVar = this.f345762e;
        if (z17) {
            fVar.getMicAudioWaveViewCallback().a();
        } else {
            fVar.getMicAudioWaveViewCallback().b();
        }
        return jz5.f0.f302826a;
    }
}
