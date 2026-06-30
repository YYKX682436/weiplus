package m34;

/* loaded from: classes4.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m34.j f323354d;

    public i(m34.j jVar) {
        this.f323354d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        m34.j jVar = this.f323354d;
        jVar.f323355d.f323360e.setVisibility(0);
        m34.n nVar = jVar.f323355d;
        nVar.f323360e.startAnimation(android.view.animation.AnimationUtils.loadAnimation(nVar.getContext(), com.tencent.mm.R.anim.f477783bc));
    }
}
