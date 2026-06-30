package z63;

/* loaded from: classes5.dex */
public class a1 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z63.f1 f470365d;

    public a1(z63.f1 f1Var) {
        this.f470365d = f1Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f470365d.f470385f.postDelayed(new z63.z0(this), 175L);
    }
}
