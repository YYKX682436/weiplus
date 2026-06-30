package xk0;

/* loaded from: classes10.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xk0.n f454994d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(xk0.n nVar) {
        super(0);
        this.f454994d = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        xk0.n nVar = this.f454994d;
        return com.tencent.mm.sdk.platformtools.x.m(nVar.I().getWidth(), nVar.I().getHeight(), android.graphics.Bitmap.Config.ARGB_8888, false);
    }
}
