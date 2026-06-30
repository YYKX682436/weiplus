package k23;

/* loaded from: classes12.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k23.q f303623d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(k23.q qVar) {
        super(0);
        this.f303623d = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        k23.q qVar = this.f303623d;
        ofFloat.addUpdateListener(new k23.m(ofFloat, qVar));
        ofFloat.setDuration(150L);
        arrayList.add(ofFloat);
        k23.x xVar = (k23.x) qVar;
        xVar.getClass();
        k23.d0 params = xVar.getParams();
        params.getClass();
        k23.w0 w0Var = k23.w0.f303736f;
        k23.w0 w0Var2 = params.f303548e;
        if ((w0Var2 == w0Var || w0Var2 == k23.w0.f303735e) ? false : true) {
            android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(xVar.f303745q.getAlpha(), 0.0f);
            ofFloat2.addUpdateListener(new k23.v(xVar, ofFloat2));
            ofFloat2.setDuration(150L);
            arrayList.add(ofFloat2);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((android.animation.ValueAnimator) it.next()).setInterpolator(ta5.h.f416879a.a());
        }
        return arrayList;
    }
}
