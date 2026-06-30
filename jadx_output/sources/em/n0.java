package em;

/* loaded from: classes14.dex */
public class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254624a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.LinearLayout f254625b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.LinearLayout f254626c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.FrameLayout f254627d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.constraintlayout.widget.ConstraintLayout f254628e;

    public n0(android.view.View view) {
        this.f254624a = view;
    }

    public android.widget.FrameLayout a() {
        if (this.f254627d == null) {
            this.f254627d = (android.widget.FrameLayout) this.f254624a.findViewById(com.tencent.mm.R.id.cgz);
        }
        return this.f254627d;
    }

    public android.widget.LinearLayout b() {
        if (this.f254626c == null) {
            this.f254626c = (android.widget.LinearLayout) this.f254624a.findViewById(com.tencent.mm.R.id.gbm);
        }
        return this.f254626c;
    }

    public android.widget.LinearLayout c() {
        if (this.f254625b == null) {
            this.f254625b = (android.widget.LinearLayout) this.f254624a.findViewById(com.tencent.mm.R.id.gyb);
        }
        return this.f254625b;
    }

    public androidx.constraintlayout.widget.ConstraintLayout d() {
        if (this.f254628e == null) {
            this.f254628e = (androidx.constraintlayout.widget.ConstraintLayout) this.f254624a.findViewById(com.tencent.mm.R.id.u4f);
        }
        return this.f254628e;
    }
}
