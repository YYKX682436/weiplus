package ea3;

/* loaded from: classes10.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ea3.y f250679d;

    public x(ea3.y yVar) {
        this.f250679d = yVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ea3.y yVar = this.f250679d;
        yVar.f250681b.f250663v.startAnimation(android.view.animation.AnimationUtils.loadAnimation(yVar.f250681b.getContext(), com.tencent.mm.R.anim.f477784bd));
        yVar.f250681b.f250663v.setVisibility(8);
    }
}
