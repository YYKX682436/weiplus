package pk2;

/* loaded from: classes3.dex */
public final class m7 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f356007d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f356008e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f356009f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f356010g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f356011h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewPropertyAnimator f356012i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Runnable f356013m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f356007d = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.obc);
        this.f356008e = (com.tencent.mm.ui.widget.imageview.WeImageView) itemView.findViewById(com.tencent.mm.R.id.h5n);
        this.f356009f = (android.widget.ImageView) itemView.findViewById(com.tencent.mm.R.id.f485288h62);
        this.f356010g = itemView.findViewById(com.tencent.mm.R.id.k_2);
        this.f356011h = itemView.findViewById(com.tencent.mm.R.id.lqk);
    }

    public final void i() {
        android.widget.ImageView imageView;
        android.view.ViewPropertyAnimator viewPropertyAnimator = this.f356012i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.f356012i = null;
        java.lang.Runnable runnable = this.f356013m;
        if (runnable != null && (imageView = this.f356009f) != null) {
            imageView.removeCallbacks(runnable);
        }
        this.f356013m = null;
    }
}
