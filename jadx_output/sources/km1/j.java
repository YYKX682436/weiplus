package km1;

/* loaded from: classes7.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f309004d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.util.Size f309005e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ km1.s f309006f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(boolean z17, android.util.Size size, km1.s sVar) {
        super(1);
        this.f309004d = z17;
        this.f309005e = size;
        this.f309006f = sVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue() && this.f309004d) {
            android.util.Size size = km1.s.G;
            android.util.Size size2 = this.f309005e;
            if (!kotlin.jvm.internal.o.b(size, size2)) {
                this.f309006f.p(size2);
            }
        }
        return jz5.f0.f302826a;
    }
}
