package u4;

/* loaded from: classes13.dex */
public abstract class g1 {

    /* renamed from: a, reason: collision with root package name */
    public static final androidx.transition.Transition f424478a = new androidx.transition.AutoTransition();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.ThreadLocal f424479b = new java.lang.ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.ArrayList f424480c = new java.util.ArrayList();

    public static void a(android.view.ViewGroup viewGroup, androidx.transition.Transition transition) {
        java.util.ArrayList arrayList = f424480c;
        if (arrayList.contains(viewGroup)) {
            return;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (n3.x0.c(viewGroup)) {
            arrayList.add(viewGroup);
            if (transition == null) {
                transition = f424478a;
            }
            androidx.transition.Transition clone = transition.clone();
            d(viewGroup, clone);
            viewGroup.setTag(com.tencent.mm.R.id.f487395oj2, null);
            if (clone != null) {
                u4.f1 f1Var = new u4.f1(clone, viewGroup);
                viewGroup.addOnAttachStateChangeListener(f1Var);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(f1Var);
            }
        }
    }

    public static x.b b() {
        x.b bVar;
        java.lang.ThreadLocal threadLocal = f424479b;
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) threadLocal.get();
        if (weakReference != null && (bVar = (x.b) weakReference.get()) != null) {
            return bVar;
        }
        x.b bVar2 = new x.b();
        threadLocal.set(new java.lang.ref.WeakReference(bVar2));
        return bVar2;
    }

    public static void c(u4.j0 j0Var, androidx.transition.Transition transition) {
        android.view.ViewGroup viewGroup = j0Var.f424501c;
        java.util.ArrayList arrayList = f424480c;
        if (arrayList.contains(viewGroup)) {
            return;
        }
        if (transition == null) {
            j0Var.a();
            return;
        }
        arrayList.add(viewGroup);
        androidx.transition.Transition clone = transition.clone();
        clone.P(viewGroup);
        u4.j0 j0Var2 = (u4.j0) viewGroup.getTag(com.tencent.mm.R.id.f487395oj2);
        if (j0Var2 != null) {
            if (j0Var2.f424500b > 0) {
                clone.I(true);
            }
        }
        d(viewGroup, clone);
        j0Var.a();
        u4.f1 f1Var = new u4.f1(clone, viewGroup);
        viewGroup.addOnAttachStateChangeListener(f1Var);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(f1Var);
    }

    public static void d(android.view.ViewGroup viewGroup, androidx.transition.Transition transition) {
        java.lang.Runnable runnable;
        java.util.ArrayList arrayList = (java.util.ArrayList) b().getOrDefault(viewGroup, null);
        if (arrayList != null && arrayList.size() > 0) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((androidx.transition.Transition) it.next()).C(viewGroup);
            }
        }
        if (transition != null) {
            transition.k(viewGroup, true);
        }
        u4.j0 j0Var = (u4.j0) viewGroup.getTag(com.tencent.mm.R.id.f487395oj2);
        if (j0Var == null || ((u4.j0) j0Var.f424501c.getTag(com.tencent.mm.R.id.f487395oj2)) != j0Var || (runnable = j0Var.f424504f) == null) {
            return;
        }
        runnable.run();
    }
}
