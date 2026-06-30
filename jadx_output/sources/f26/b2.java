package f26;

/* loaded from: classes16.dex */
public class b2 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f259129a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f259130b;

    /* renamed from: c, reason: collision with root package name */
    public final i26.o f259131c;

    /* renamed from: d, reason: collision with root package name */
    public final f26.m f259132d;

    /* renamed from: e, reason: collision with root package name */
    public final f26.n f259133e;

    /* renamed from: f, reason: collision with root package name */
    public int f259134f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayDeque f259135g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.Set f259136h;

    public b2(boolean z17, boolean z18, boolean z19, i26.o typeSystemContext, f26.m kotlinTypePreparator, f26.n kotlinTypeRefiner) {
        kotlin.jvm.internal.o.g(typeSystemContext, "typeSystemContext");
        kotlin.jvm.internal.o.g(kotlinTypePreparator, "kotlinTypePreparator");
        kotlin.jvm.internal.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.f259129a = z17;
        this.f259130b = z18;
        this.f259131c = typeSystemContext;
        this.f259132d = kotlinTypePreparator;
        this.f259133e = kotlinTypeRefiner;
    }

    public final void a() {
        java.util.ArrayDeque arrayDeque = this.f259135g;
        kotlin.jvm.internal.o.d(arrayDeque);
        arrayDeque.clear();
        java.util.Set set = this.f259136h;
        kotlin.jvm.internal.o.d(set);
        ((o26.u) set).clear();
    }

    public boolean b(i26.i subType, i26.i superType) {
        kotlin.jvm.internal.o.g(subType, "subType");
        kotlin.jvm.internal.o.g(superType, "superType");
        return true;
    }

    public final void c() {
        if (this.f259135g == null) {
            this.f259135g = new java.util.ArrayDeque(4);
        }
        if (this.f259136h == null) {
            this.f259136h = o26.u.f342614f.a();
        }
    }

    public final i26.i d(i26.i type) {
        kotlin.jvm.internal.o.g(type, "type");
        return ((g26.j) this.f259132d).a(type);
    }

    public final i26.i e(i26.i type) {
        kotlin.jvm.internal.o.g(type, "type");
        ((g26.k) this.f259133e).getClass();
        return (f26.o0) type;
    }
}
