package tk5;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.fragment.app.FragmentManager f420022a;

    /* renamed from: b, reason: collision with root package name */
    public final int f420023b;

    public c(androidx.fragment.app.FragmentManager fragmentManager, int i17) {
        kotlin.jvm.internal.o.g(fragmentManager, "fragmentManager");
        this.f420022a = fragmentManager;
        this.f420023b = i17;
    }

    public final void a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("closeAll() called backCount:");
        androidx.fragment.app.FragmentManager fragmentManager = this.f420022a;
        sb6.append(fragmentManager.getBackStackEntryCount());
        com.tencent.mars.xlog.Log.i("MicroMsg.VAS.VASReplaceController", sb6.toString());
        while (fragmentManager.getBackStackEntryCount() > 0 && b() != null) {
            fragmentManager.popBackStackImmediate();
        }
        tk5.a b17 = b();
        if (b17 != null) {
            b17.G();
        }
        vk5.a.f437771a = 0;
        vk5.a.f437772b = null;
        vk5.a.f437773c = -1;
        vk5.a.f437774d = false;
    }

    public final tk5.a b() {
        tk5.a aVar;
        java.util.List<androidx.fragment.app.Fragment> fragments = this.f420022a.getFragments();
        kotlin.jvm.internal.o.f(fragments, "getFragments(...)");
        java.util.Iterator<T> it = fragments.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            androidx.lifecycle.m1 m1Var = (androidx.fragment.app.Fragment) it.next();
            aVar = m1Var instanceof tk5.a ? (tk5.a) m1Var : null;
            if (aVar != null && kotlin.jvm.internal.o.b(aVar.getG(), this)) {
                break;
            }
        }
        return aVar;
    }

    public final void c(tk5.a fragment, int i17) {
        kotlin.jvm.internal.o.g(fragment, "fragment");
        boolean z17 = !(b() != null);
        if (i17 != -1) {
            fragment.u().setTargetFragment(null, i17);
        }
        androidx.fragment.app.i2 beginTransaction = this.f420022a.beginTransaction();
        if (!z17) {
            beginTransaction.l(com.tencent.mm.R.anim.f477950g2, com.tencent.mm.R.anim.f477949g1, com.tencent.mm.R.anim.f477948g0, com.tencent.mm.R.anim.f477951g3);
        }
        beginTransaction.k(this.f420023b, fragment.u(), null);
        if (!z17) {
            beginTransaction.c(null);
            beginTransaction.f11359p = true;
        }
        beginTransaction.e();
        fragment.M(this);
    }
}
