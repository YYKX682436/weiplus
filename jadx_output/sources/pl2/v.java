package pl2;

/* loaded from: classes3.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f356666d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f356667e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pl2.w f356668f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f356669g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f356670h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(int i17, int i18, pl2.w wVar, java.util.ArrayList arrayList, yz5.a aVar) {
        super(0);
        this.f356666d = i17;
        this.f356667e = i18;
        this.f356668f = wVar;
        this.f356669g = arrayList;
        this.f356670h = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        int i18 = this.f356666d;
        if (i18 >= 0 && (i17 = this.f356667e) >= 0 && i18 <= i17) {
            while (true) {
                pl2.a aVar = (pl2.a) kz5.n0.a0(this.f356669g, i18);
                pl2.w wVar = this.f356668f;
                wVar.d(i18, aVar, wVar.f356677g != 1 ? 2 : 1);
                wVar.f356679i.add(java.lang.Integer.valueOf(i18));
                if (i18 == i17) {
                    break;
                }
                i18++;
            }
        }
        pm0.v.X(new pl2.u(this.f356670h));
        return jz5.f0.f302826a;
    }
}
