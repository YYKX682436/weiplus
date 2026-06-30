package k23;

/* loaded from: classes12.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k23.q f303582d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k23.q qVar) {
        super(0);
        this.f303582d = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        kotlin.jvm.internal.o.d(ofFloat);
        k23.q qVar = this.f303582d;
        ofFloat.addListener(new k23.h(qVar));
        ofFloat.addUpdateListener(new k23.e(ofFloat, qVar));
        ofFloat.setDuration(300L);
        arrayList.add(ofFloat);
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new k23.f(qVar, ofFloat2));
        ofFloat2.setDuration(160L);
        arrayList.add(ofFloat2);
        android.animation.ValueAnimator ofFloat3 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat3.addUpdateListener(new k23.g(qVar, ofFloat3));
        ofFloat3.setDuration(200L);
        ofFloat3.setStartDelay(100L);
        arrayList.add(ofFloat3);
        qVar.b(arrayList);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((android.animation.ValueAnimator) it.next()).setInterpolator(ta5.h.f416879a.a());
        }
        return arrayList;
    }
}
