package mb2;

/* loaded from: classes5.dex */
public class a implements mb2.e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f325333a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f325334b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f325335c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f325336d;

    public a(java.lang.Object obj, java.lang.String name, yz5.a aVar) {
        kotlin.jvm.internal.o.g(name, "name");
        this.f325333a = obj;
        this.f325334b = name;
        this.f325335c = aVar;
    }

    @Override // mb2.e
    public void a() {
    }

    public void b() {
    }

    public java.lang.Object c() {
        java.lang.Object obj = this.f325336d;
        return obj == null ? this.f325333a : obj;
    }

    public java.lang.String toString() {
        return "name " + this.f325334b + " value " + this.f325336d + " dummyValue " + this.f325333a;
    }

    public /* synthetic */ a(java.lang.Object obj, java.lang.String str, yz5.a aVar, int i17, kotlin.jvm.internal.i iVar) {
        this(obj, str, (i17 & 4) != 0 ? null : aVar);
    }
}
