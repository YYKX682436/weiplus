package jm0;

/* loaded from: classes5.dex */
public abstract class o extends i95.w implements androidx.lifecycle.m1, androidx.lifecycle.y {

    /* renamed from: f, reason: collision with root package name */
    public jm0.p f300278f;

    /* renamed from: g, reason: collision with root package name */
    public jm0.r f300279g;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f300276d = jz5.h.b(jm0.n.f300275d);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f300277e = jz5.h.b(new jm0.m(this));

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashSet f300280h = new java.util.HashSet();

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Boolean[] f300281i = {java.lang.Boolean.FALSE};

    public final j75.f Ai() {
        requireAccountInitialized();
        jm0.p pVar = this.f300278f;
        j75.f fVar = pVar != null ? pVar.f300282f : null;
        if (fVar instanceof j75.f) {
            return fVar;
        }
        return null;
    }

    public final com.tencent.mm.sdk.coroutines.LifecycleScope Bi() {
        requireAccountInitialized();
        jm0.r rVar = this.f300279g;
        if (rVar != null) {
            return (com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) rVar.f300285f).getValue();
        }
        return null;
    }

    public void Di(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
    }

    public void Ni(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
    }

    public void Ri(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
    }

    public void Ui(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
    }

    public void Vi() {
    }

    @Override // androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public final androidx.lifecycle.o mo133getLifecycle() {
        return (jm0.s) ((jz5.n) this.f300277e).getValue();
    }

    @Override // androidx.lifecycle.m1
    /* renamed from: getViewModelStore */
    public final androidx.lifecycle.l1 getViewModel() {
        return (androidx.lifecycle.l1) ((jz5.n) this.f300276d).getValue();
    }

    @Override // i95.w
    public final void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i(wi(), "onAccountInitialized start");
        Ui(context);
        java.util.HashSet hashSet = this.f300280h;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((jm0.g) it.next()).R6(context);
        }
        com.tencent.mars.xlog.Log.i(wi(), "onAccountInitialized before end");
        Ni(context);
        java.util.Iterator it6 = hashSet.iterator();
        while (it6.hasNext()) {
            ((jm0.g) it6.next()).P6(context);
        }
        com.tencent.mars.xlog.Log.i(wi(), "onAccountInitialized init end");
        ((jm0.s) ((jz5.n) this.f300277e).getValue()).d();
        Ri(context);
        java.util.Iterator it7 = hashSet.iterator();
        while (it7.hasNext()) {
            ((jm0.g) it7.next()).Q6(context);
        }
        com.tencent.mars.xlog.Log.i(wi(), "onAccountInitialized after end");
    }

    @Override // i95.w
    public final void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (this.f300281i[0].booleanValue()) {
            synchronized (this.f300281i) {
                if (this.f300281i[0].booleanValue()) {
                    java.util.Iterator it = this.f300280h.iterator();
                    while (it.hasNext()) {
                        ((jm0.g) it.next()).S6();
                    }
                    this.f300280h.clear();
                    Vi();
                    getViewModel().a();
                    ((jm0.s) ((jz5.n) this.f300277e).getValue()).e();
                    com.tencent.mars.xlog.Log.i(wi(), "onAccountRelease");
                    this.f300281i[0] = java.lang.Boolean.FALSE;
                }
            }
        }
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (!this.f300281i[0].booleanValue()) {
            synchronized (this.f300281i) {
                if (!this.f300281i[0].booleanValue()) {
                    java.util.HashSet<java.lang.Class> hashSet = new java.util.HashSet();
                    Di(hashSet);
                    java.lang.String wi6 = wi();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append("create component:");
                    java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(hashSet, 10));
                    java.util.Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((java.lang.Class) it.next()).getName());
                    }
                    sb6.append(arrayList);
                    com.tencent.mars.xlog.Log.i(wi6, sb6.toString());
                    for (java.lang.Class modelClass : hashSet) {
                        kotlin.jvm.internal.o.g(modelClass, "modelClass");
                        if (!jm0.g.class.isAssignableFrom(modelClass)) {
                            throw new java.lang.IllegalArgumentException(getClass().getName().concat(" must extends FeatureServiceComponent"));
                        }
                        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(getViewModel(), new jm0.e(this)).a(modelClass);
                        kotlin.jvm.internal.o.f(a17, "get(...)");
                        jm0.g gVar = (jm0.g) a17;
                        this.f300280h.add(gVar);
                        if (gVar instanceof jm0.p) {
                            this.f300278f = (jm0.p) gVar;
                        }
                        if (gVar instanceof jm0.r) {
                            this.f300279g = (jm0.r) gVar;
                        }
                    }
                    this.f300281i[0] = java.lang.Boolean.TRUE;
                }
            }
        }
        com.tencent.mars.xlog.Log.i(wi(), "doCreate start");
        java.util.Iterator it6 = this.f300280h.iterator();
        while (it6.hasNext()) {
            ((jm0.g) it6.next()).getClass();
        }
        com.tencent.mars.xlog.Log.i(wi(), "doCreate before end");
        java.util.Iterator it7 = this.f300280h.iterator();
        while (it7.hasNext()) {
            ((jm0.g) it7.next()).N6(context);
        }
        com.tencent.mars.xlog.Log.i(wi(), "doCreate end");
        java.util.Iterator it8 = this.f300280h.iterator();
        while (it8.hasNext()) {
            ((jm0.g) it8.next()).getClass();
        }
        com.tencent.mars.xlog.Log.i(wi(), "doCreate after end");
    }

    public java.lang.String wi() {
        return "MicroMsg.Mvvm.MvvmPlugin";
    }
}
