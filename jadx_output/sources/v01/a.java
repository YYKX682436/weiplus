package v01;

/* loaded from: classes10.dex */
public final class a implements l81.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.a f432195a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f432196b;

    public a(com.tencent.mm.modelbiz.ui.BizProfileCardFragment fragment, yz5.a callBack) {
        kotlin.jvm.internal.o.g(fragment, "fragment");
        kotlin.jvm.internal.o.g(callBack, "callBack");
        this.f432195a = callBack;
        this.f432196b = new java.lang.ref.WeakReference(fragment);
    }

    @Override // l81.e1
    public void a() {
    }

    @Override // l81.e1
    public void b() {
        com.tencent.mm.modelbiz.ui.BizProfileCardFragment bizProfileCardFragment = (com.tencent.mm.modelbiz.ui.BizProfileCardFragment) this.f432196b.get();
        if (bizProfileCardFragment != null) {
            int i17 = com.tencent.mm.modelbiz.ui.BizProfileCardFragment.f70865q;
            if (bizProfileCardFragment.u0()) {
                bizProfileCardFragment = null;
            }
            if (bizProfileCardFragment != null) {
                this.f432195a.invoke();
            }
        }
    }

    @Override // l81.e1
    public void d(java.lang.String str) {
    }

    @Override // l81.e1
    public void e() {
        com.tencent.mm.modelbiz.ui.BizProfileCardFragment bizProfileCardFragment = (com.tencent.mm.modelbiz.ui.BizProfileCardFragment) this.f432196b.get();
        if (bizProfileCardFragment != null) {
            int i17 = com.tencent.mm.modelbiz.ui.BizProfileCardFragment.f70865q;
            if (bizProfileCardFragment.u0()) {
                bizProfileCardFragment = null;
            }
            if (bizProfileCardFragment != null) {
                this.f432195a.invoke();
            }
        }
    }

    @Override // l81.e1
    public void f(boolean z17) {
    }
}
