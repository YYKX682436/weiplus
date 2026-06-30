package p81;

/* loaded from: classes7.dex */
public class a implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f352711a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f352712b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ km5.b f352713c;

    public a(p81.e eVar, boolean z17, int i17, km5.b bVar) {
        this.f352711a = z17;
        this.f352712b = i17;
        this.f352713c = bVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        boolean booleanValue = bool.booleanValue();
        boolean z17 = this.f352711a;
        r81.f.INSTANCE.b(this.f352712b, booleanValue ? z17 ? 52 : 47 : z17 ? 53 : 48);
        this.f352713c.c(bool);
        return null;
    }
}
