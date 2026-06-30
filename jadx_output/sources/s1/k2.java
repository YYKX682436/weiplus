package s1;

/* loaded from: classes14.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public final s1.n2 f402026a;

    /* renamed from: b, reason: collision with root package name */
    public s1.q0 f402027b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.p f402028c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.p f402029d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.p f402030e;

    public k2(s1.n2 slotReusePolicy) {
        kotlin.jvm.internal.o.g(slotReusePolicy, "slotReusePolicy");
        this.f402026a = slotReusePolicy;
        this.f402028c = new s1.j2(this);
        this.f402029d = new s1.h2(this);
        this.f402030e = new s1.i2(this);
    }

    public final s1.q0 a() {
        s1.q0 q0Var = this.f402027b;
        if (q0Var != null) {
            return q0Var;
        }
        throw new java.lang.IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout".toString());
    }

    public final s1.g2 b(java.lang.Object obj, yz5.p content) {
        kotlin.jvm.internal.o.g(content, "content");
        s1.q0 a17 = a();
        a17.b();
        if (!a17.f402066f.containsKey(obj)) {
            java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) a17.f402068h;
            java.lang.Object obj2 = linkedHashMap.get(obj);
            if (obj2 == null) {
                obj2 = a17.d(obj);
                u1.w wVar = a17.f402061a;
                if (obj2 != null) {
                    int indexOf = ((o0.f) wVar.o()).indexOf(obj2);
                    int i17 = ((o0.f) wVar.o()).f341844d.f341852f;
                    wVar.f423693q = true;
                    wVar.B(indexOf, i17, 1);
                    wVar.f423693q = false;
                    a17.f402071k++;
                } else {
                    int i18 = ((o0.f) wVar.o()).f341844d.f341852f;
                    u1.w wVar2 = new u1.w(true);
                    wVar.f423693q = true;
                    wVar.t(i18, wVar2);
                    wVar.f423693q = false;
                    a17.f402071k++;
                    obj2 = wVar2;
                }
                linkedHashMap.put(obj, obj2);
            }
            a17.c((u1.w) obj2, obj, content);
        }
        return new s1.o0(a17, obj);
    }
}
