package or1;

/* loaded from: classes12.dex */
public class c0 extends fb5.c {

    /* renamed from: e, reason: collision with root package name */
    public static fb5.b f347467e;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f347468d;

    public c0(java.lang.Object obj) {
        super(1, obj);
    }

    @Override // fb5.c
    public void a(android.content.Context context, fb5.a aVar, java.lang.Object... objArr) {
        java.lang.Object obj = this.f260882b;
        if (obj instanceof java.lang.String) {
            this.f347468d = (java.lang.String) obj;
        }
    }

    @Override // fb5.c
    public fb5.a b() {
        return new or1.b0();
    }

    @Override // fb5.c
    public fb5.b c() {
        if (f347467e == null) {
            f347467e = new or1.a0(this);
        }
        return f347467e;
    }
}
