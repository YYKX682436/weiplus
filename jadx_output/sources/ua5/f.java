package ua5;

/* loaded from: classes13.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Handler f425986a = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f425987b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f425988c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f425989d = new java.util.ArrayList();

    public final u3.u a(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/anim/stream/StreamFadeAnimator", "fadeInView", "(Landroid/view/View;)Landroidx/dynamicanimation/animation/SpringAnimation;", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/anim/stream/StreamFadeAnimator", "fadeInView", "(Landroid/view/View;)Landroidx/dynamicanimation/animation/SpringAnimation;", "android/view/View_EXEC_", "setAlpha", "(F)V");
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        pa5.q[] qVarArr = pa5.q.f353109d;
        ua5.d dVar = new ua5.d(this, h0Var);
        pa5.h hVar = new pa5.h(null);
        pa5.i iVar = new pa5.i(dVar);
        u3.v vVar = new u3.v(1.0f);
        vVar.a(1.0f);
        vVar.b(400.0f);
        u3.u uVar = new u3.u(view, u3.s.f424224s);
        uVar.f424236t = vVar;
        uVar.f424225a = 0.0f;
        boolean z17 = uVar.f424230f;
        if (!z17) {
            if (z17) {
                throw new java.lang.UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
            }
            java.util.ArrayList arrayList2 = uVar.f424235k;
            if (!arrayList2.contains(hVar)) {
                arrayList2.add(hVar);
            }
            uVar.a(iVar);
        }
        uVar.e();
        h0Var.f310123d = uVar;
        ((java.util.ArrayList) this.f425988c).add(uVar);
        return (u3.u) h0Var.f310123d;
    }

    public final boolean b() {
        return (this.f425987b.isEmpty() ^ true) || (this.f425988c.isEmpty() ^ true) || (this.f425989d.isEmpty() ^ true);
    }
}
