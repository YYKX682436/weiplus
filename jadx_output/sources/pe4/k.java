package pe4;

/* loaded from: classes15.dex */
public class k implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f353705a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pe4.m f353706b;

    public k(pe4.m mVar, java.lang.CharSequence charSequence) {
        this.f353706b = mVar;
        this.f353705a = charSequence;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        pe4.m mVar = this.f353706b;
        mVar.f353712n.post(mVar.f353716r);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        pe4.m mVar = this.f353706b;
        mVar.f353711m.setImageResource(com.tencent.mm.R.drawable.c5p);
        mVar.f353712n.setText(this.f353705a);
        android.widget.TextView textView = mVar.f353712n;
        textView.setTextColor(textView.getResources().getColor(com.tencent.mm.R.color.aa9));
        mVar.f353712n.removeCallbacks(mVar.f353716r);
    }
}
