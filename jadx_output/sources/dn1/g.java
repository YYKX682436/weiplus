package dn1;

/* loaded from: classes12.dex */
public class g implements pq5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o45.ug f241864a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o45.vg f241865b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f241866c;

    public g(dn1.f fVar, o45.ug ugVar, o45.vg vgVar, boolean z17) {
        this.f241864a = ugVar;
        this.f241865b = vgVar;
        this.f241866c = z17;
    }

    @Override // pq5.b
    public void a(java.lang.Object obj) {
        ((en1.j) obj).onAuthResponse(this.f241864a, this.f241865b, this.f241866c);
    }
}
