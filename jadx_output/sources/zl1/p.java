package zl1;

/* loaded from: classes7.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.ObjectAnimator f473603d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zl1.t f473604e;

    public p(zl1.t tVar, android.animation.ObjectAnimator objectAnimator) {
        this.f473604e = tVar;
        this.f473603d = objectAnimator;
    }

    @Override // java.lang.Runnable
    public void run() {
        zl1.t tVar = this.f473604e;
        tVar.setVisibility(0);
        zl1.o oVar = new zl1.o(this);
        int i17 = zl1.t.f473614q;
        tVar.a();
        java.util.LinkedList linkedList = tVar.f473624p;
        android.animation.ObjectAnimator objectAnimator = this.f473603d;
        linkedList.add(objectAnimator);
        objectAnimator.addListener(new zl1.a(tVar, oVar, objectAnimator));
        objectAnimator.start();
    }
}
