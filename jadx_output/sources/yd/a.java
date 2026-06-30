package yd;

/* loaded from: classes7.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yd.e f460915d;

    public a(yd.e eVar) {
        this.f460915d = eVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        yd.e eVar = this.f460915d;
        if (eVar.f460944f) {
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new yd.c(eVar));
            ofFloat.start();
            eVar.f460944f = false;
            return;
        }
        eVar.f460939a.setTranslationY(eVar.a());
        eVar.f460939a.setVisibility(0);
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.addUpdateListener(new yd.d(eVar));
        ofFloat2.start();
        eVar.f460944f = true;
    }
}
