package sc3;

/* loaded from: classes7.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f406428d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f406429e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(sc3.k1 k1Var, boolean z17) {
        super(0);
        this.f406428d = k1Var;
        this.f406429e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.libwxaudio.WxAudioNative wxAudioNative = this.f406428d.f406493y;
        if (wxAudioNative != null) {
            wxAudioNative.setMute(this.f406429e);
        }
        return jz5.f0.f302826a;
    }
}
