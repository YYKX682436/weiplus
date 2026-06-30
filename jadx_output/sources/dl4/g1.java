package dl4;

/* loaded from: classes3.dex */
public final class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235402d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ff0.z f235403e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.w1 f235404f;

    public g1(java.lang.String str, ff0.z zVar, com.tencent.mm.sdk.platformtools.w1 w1Var) {
        this.f235402d = str;
        this.f235403e = zVar;
        this.f235404f = w1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList = (java.util.ArrayList) dl4.m1.f235436a.remove(this.f235402d);
        if (arrayList != null) {
            arrayList.size();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                final dl4.f1 f1Var = new dl4.f1((ff0.x) it.next(), this.f235403e);
                com.tencent.mm.sdk.platformtools.w1 w1Var = this.f235404f;
                if (w1Var != null) {
                    ((com.tencent.mm.sdk.platformtools.c4) w1Var).a(new java.lang.Runnable(f1Var) { // from class: dl4.l1

                        /* renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ yz5.a f235432d;

                        {
                            kotlin.jvm.internal.o.g(f1Var, "function");
                            this.f235432d = f1Var;
                        }

                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.f235432d.invoke();
                        }
                    });
                } else {
                    pm0.v.X(f1Var);
                }
            }
        }
    }
}
