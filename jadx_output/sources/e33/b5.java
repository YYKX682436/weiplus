package e33;

/* loaded from: classes10.dex */
public class b5 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f247160a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f247161b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e33.d5 f247162c;

    public b5(e33.d5 d5Var, int i17, androidx.recyclerview.widget.k3 k3Var) {
        this.f247162c = d5Var;
        this.f247160a = i17;
        this.f247161b = k3Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        if (this.f247160a == 2) {
            e33.d5 d5Var = this.f247162c;
            e33.h5 h5Var = d5Var.f247201b;
            int adapterPosition = this.f247161b.getAdapterPosition();
            h5Var.f247266q = adapterPosition;
            h5Var.f247265p = adapterPosition;
            int i17 = d5Var.f247201b.f247268s;
            d5Var.f247200a = i17;
            com.tencent.mars.xlog.Log.i("MicroMsg.PreviewSelectedImageAdapter", "lastVisiblePos:%s", java.lang.Integer.valueOf(i17));
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
