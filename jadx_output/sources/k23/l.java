package k23;

/* loaded from: classes12.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k23.q f303612d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k23.q qVar) {
        super(0);
        this.f303612d = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        k23.q qVar = this.f303612d;
        ofFloat.addUpdateListener(new k23.j(ofFloat, qVar));
        ofFloat.setDuration(300L);
        arrayList.add(ofFloat);
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new k23.k(ofFloat2, qVar));
        ofFloat2.setDuration(300L);
        arrayList.add(ofFloat2);
        qVar.b(arrayList);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((android.animation.ValueAnimator) it.next()).setInterpolator(ta5.h.f416879a.a());
        }
        return arrayList;
    }
}
