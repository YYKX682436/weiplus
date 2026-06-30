package xk0;

/* loaded from: classes10.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xk0.b f454920d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(xk0.b bVar) {
        super(0);
        this.f454920d = bVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        xk0.b bVar = this.f454920d;
        return com.tencent.mm.sdk.platformtools.x.m(bVar.M.getWidth(), bVar.M.getHeight(), android.graphics.Bitmap.Config.ARGB_8888, false);
    }
}
