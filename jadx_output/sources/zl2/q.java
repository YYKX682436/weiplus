package zl2;

/* loaded from: classes8.dex */
public final class q implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f473924d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f473925e;

    public q(java.util.LinkedList linkedList, yz5.p pVar, float f17) {
        this.f473924d = linkedList;
        this.f473925e = pVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        java.util.LinkedList<zl2.n> linkedList = this.f473924d;
        java.util.Iterator it6 = linkedList.iterator();
        while (true) {
            boolean z17 = false;
            if (!it6.hasNext()) {
                break;
            }
            zl2.n nVar = (zl2.n) it6.next();
            zl2.o oVar = nVar.f473896c;
            boolean z18 = oVar.f473905b != oVar.f473906c;
            android.view.View view = nVar.f473894a;
            if (z18) {
                view.getLayoutParams().height = (int) (nVar.f473896c.f473905b + ((r5.f473906c - r7) * floatValue));
                z17 = true;
            }
            nVar.f473897d.getClass();
            if (z17) {
                view.requestLayout();
            }
        }
        yz5.p pVar = this.f473925e;
        if (pVar != null) {
            pVar.invoke(java.lang.Float.valueOf(floatValue), java.lang.Boolean.valueOf(floatValue == 1.0f));
        }
        if (floatValue == 1.0f) {
            for (zl2.n nVar2 : linkedList) {
                if (nVar2.f473895b) {
                    zl2.o oVar2 = nVar2.f473896c;
                    if (oVar2.f473905b != oVar2.f473906c) {
                        nVar2.f473894a.post(new zl2.p(nVar2));
                    }
                    nVar2.f473897d.getClass();
                }
            }
        }
    }
}
