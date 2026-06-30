package fc3;

/* loaded from: classes9.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f261067d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fc3.s f261068e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fc3.k f261069f;

    public o(android.widget.TextView textView, fc3.s sVar, fc3.k kVar) {
        this.f261067d = textView;
        this.f261068e = sVar;
        this.f261069f = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fc3.s sVar = this.f261068e;
        float f17 = sVar.f261080e.x;
        android.widget.TextView textView = this.f261067d;
        textView.setX(f17 - (textView.getWidth() / 2));
        textView.setY(sVar.f261080e.y - (textView.getHeight() / 2));
        textView.setAlpha(sVar.f261082g);
        java.util.ArrayList arrayList = (java.util.ArrayList) sVar.f261078c;
        fc3.k kVar = this.f261069f;
        arrayList.add(kVar);
        float f18 = kVar.f261053d - sVar.f261082g;
        float f19 = kVar.f261052c - sVar.f261081f;
        android.graphics.PointF pointF = kVar.f261051b;
        android.graphics.PointF pointF2 = sVar.f261080e;
        android.graphics.PointF pointF3 = new android.graphics.PointF(pointF.x, pointF.y);
        pointF3.offset(-pointF2.x, -pointF2.y);
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        android.widget.TextView textView2 = this.f261067d;
        ofFloat.setDuration(sVar.f261079d);
        ofFloat.setInterpolator(sVar.f261084i);
        ofFloat.addUpdateListener(new fc3.m(f19, textView2, sVar, f18, pointF3));
        ofFloat.addListener(new fc3.n(sVar, kVar));
        ofFloat.start();
    }
}
