package sn1;

/* loaded from: classes12.dex */
public class b0 implements ln1.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sn1.f0 f409986a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sn1.e0 f409987b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f409988c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sn1.d0 f409989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f409990e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f409991f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f409992g;

    public b0(sn1.f0 f0Var, sn1.e0 e0Var, java.lang.String str, sn1.d0 d0Var, byte[] bArr, byte[] bArr2, int i17) {
        this.f409986a = f0Var;
        this.f409987b = e0Var;
        this.f409988c = str;
        this.f409989d = d0Var;
        this.f409990e = bArr;
        this.f409991f = bArr2;
        this.f409992g = i17;
    }

    @Override // ln1.z
    public void a(java.lang.Object obj) {
        ((ln1.e0) this.f409986a).a((sn1.a0) obj);
    }

    @Override // ln1.z
    public java.lang.Object run() {
        return new sn1.a0(this.f409987b, this.f409988c, this.f409989d, this.f409990e, this.f409991f, this.f409992g, null);
    }
}
