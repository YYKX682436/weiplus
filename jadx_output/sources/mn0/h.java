package mn0;

/* loaded from: classes10.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn0.y f329734d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(mn0.y yVar) {
        super(0);
        this.f329734d = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(((android.media.AudioManager) ((jz5.n) this.f329734d.A).getValue()).getStreamMaxVolume(3));
    }
}
