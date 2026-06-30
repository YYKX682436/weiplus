package ud;

/* loaded from: classes7.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ud.g f426565d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ud.g gVar) {
        super(0);
        this.f426565d = gVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ud.g gVar = this.f426565d;
        synchronized (gVar) {
            if (gVar.f426569c == null) {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
            com.tencent.magicbrush.MagicBrush magicBrush = gVar.f426569c;
            kotlin.jvm.internal.o.d(magicBrush);
            magicBrush.r();
            gVar.f426569c = null;
        }
        return jz5.f0.f302826a;
    }
}
