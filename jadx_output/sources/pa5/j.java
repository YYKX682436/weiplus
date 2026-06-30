package pa5;

/* loaded from: classes3.dex */
public abstract class j {
    public static u3.u a(int i17, int i18, pa5.l lVar, pa5.k kVar, float f17, float f18, float f19, int i19, java.lang.Object obj) {
        if ((i19 & 4) != 0) {
            lVar = null;
        }
        if ((i19 & 8) != 0) {
            kVar = null;
        }
        if ((i19 & 16) != 0) {
            f17 = 0.85f;
        }
        if ((i19 & 32) != 0) {
            f18 = 500.0f;
        }
        if ((i19 & 64) != 0) {
            f19 = 0.0f;
        }
        pa5.b bVar = new pa5.b(new kotlin.jvm.internal.e0(), i17, i18, lVar);
        u3.v vVar = new u3.v(1.0f);
        vVar.a(f17);
        vVar.b(f18);
        u3.u uVar = new u3.u(new java.lang.Object(), bVar);
        uVar.f424236t = vVar;
        uVar.f424226b = 0.0f;
        uVar.f424227c = true;
        uVar.f424225a = f19;
        uVar.f424233i = 0.00390625f;
        uVar.a(new pa5.a(lVar, i18, kVar));
        return uVar;
    }

    public static void b(android.view.View view, e06.f range, boolean z17, final yz5.a aVar, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        if ((i17 & 4) != 0) {
            aVar = null;
        }
        kotlin.jvm.internal.o.g(view, "<this>");
        kotlin.jvm.internal.o.g(range, "range");
        float doubleValue = (float) ((java.lang.Number) range.h()).doubleValue();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(doubleValue));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/anim/basic/AnimBasicKt", "fade", "(Landroid/view/View;Lkotlin/ranges/ClosedFloatingPointRange;ZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/anim/basic/AnimBasicKt", "fade", "(Landroid/view/View;Lkotlin/ranges/ClosedFloatingPointRange;ZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        if (!z17) {
            view.animate().alpha((float) ((java.lang.Number) range.g()).doubleValue()).setInterpolator(ta5.h.f416879a.a()).withEndAction(aVar != null ? new java.lang.Runnable(aVar) { // from class: pa5.g

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ yz5.a f353106d;

                {
                    kotlin.jvm.internal.o.g(aVar, "function");
                    this.f353106d = aVar;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f353106d.invoke();
                }
            } : null).start();
            return;
        }
        float doubleValue2 = (float) ((java.lang.Number) range.g()).doubleValue();
        android.view.ViewPropertyAnimator animate = view.animate();
        animate.setInterpolator(ta5.h.f416879a.a()).setUpdateListener(new pa5.e(view, doubleValue2)).withEndAction(new pa5.f(animate, aVar)).start();
    }

    public static void c(android.view.View view, pa5.m property, float f17, float f18, float f19, float f27, u3.p pVar, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            f18 = 1.0f;
        }
        if ((i17 & 8) != 0) {
            f19 = 0.5f;
        }
        if ((i17 & 16) != 0) {
            f27 = 200.0f;
        }
        if ((i17 & 32) != 0) {
            pVar = null;
        }
        kotlin.jvm.internal.o.g(view, "<this>");
        kotlin.jvm.internal.o.g(property, "property");
        u3.v vVar = new u3.v(f18);
        vVar.a(f19);
        vVar.b(f27);
        int a17 = com.tencent.mm.ui.zk.a(view.getContext(), (int) f17);
        u3.u uVar = new u3.u(view, new pa5.n());
        uVar.f424233i = 0.002f;
        uVar.f424236t = vVar;
        uVar.f424225a = a17;
        if (pVar != null) {
            uVar.a(pVar);
        }
        uVar.e();
    }
}
