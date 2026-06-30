package x92;

/* loaded from: classes3.dex */
public class o extends x92.r {

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f452714g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ProgressBar f452715h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f452716i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f452717m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f452714g = jz5.h.b(new x92.n(activity));
    }

    @Override // x92.r
    public void O6(int i17, java.lang.String str) {
        android.widget.FrameLayout V6 = V6();
        if (V6 != null) {
            V6.setVisibility(8);
        }
        android.widget.ProgressBar progressBar = this.f452715h;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) activity).getController().O0(com.tencent.mm.ui.bk.C());
    }

    @Override // x92.r
    public void P6(int i17, java.lang.String str) {
        android.widget.FrameLayout V6 = V6();
        if (V6 != null) {
            V6.setVisibility(0);
        }
        android.widget.ProgressBar progressBar = this.f452715h;
        if (progressBar == null) {
            return;
        }
        progressBar.setVisibility(8);
    }

    @Override // x92.r
    public void S6(com.tencent.mm.protobuf.f fVar) {
        super.S6(fVar);
        this.f452717m = true;
        android.widget.FrameLayout V6 = V6();
        if (V6 == null) {
            return;
        }
        V6.setVisibility(8);
    }

    public final android.widget.FrameLayout V6() {
        return (android.widget.FrameLayout) ((jz5.n) this.f452714g).getValue();
    }

    public void W6() {
        android.widget.FrameLayout V6 = V6();
        this.f452715h = V6 != null ? (android.widget.ProgressBar) V6.findViewById(com.tencent.mm.R.id.f482619ji) : null;
        android.widget.FrameLayout V62 = V6();
        this.f452716i = V62 != null ? (android.widget.TextView) V62.findViewById(com.tencent.mm.R.id.dft) : null;
    }

    @Override // x92.r, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        W6();
        if (this.f452717m) {
            return;
        }
        android.widget.FrameLayout V6 = V6();
        if (V6 != null) {
            V6.setVisibility(0);
        }
        android.widget.ProgressBar progressBar = this.f452715h;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        android.widget.TextView textView = this.f452716i;
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }
}
