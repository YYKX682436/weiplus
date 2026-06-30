package sc3;

/* loaded from: classes7.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f406505d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(sc3.k1 k1Var) {
        super(0);
        this.f406505d = k1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sc3.k1 k1Var = this.f406505d;
        com.tencent.mm.libwxaudio.WxAudioNative wxAudioNative = k1Var.f406493y;
        if (wxAudioNative != null) {
            wxAudioNative.forcePauseAllPlayer();
        }
        com.tencent.mm.wemedia.WeMediaBinding weMediaBinding = k1Var.f406494z;
        if (weMediaBinding != null) {
            weMediaBinding.onBackground();
        }
        return jz5.f0.f302826a;
    }
}
