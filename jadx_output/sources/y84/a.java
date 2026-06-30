package y84;

/* loaded from: classes4.dex */
public final class a extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.FrameLayout f460006d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.RoundCornerFrameLayout f460007e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f460008f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.view.View rootView, int i17) {
        super(rootView);
        kotlin.jvm.internal.o.g(rootView, "rootView");
        if (i17 == 0) {
            this.f460006d = (android.widget.FrameLayout) rootView.findViewById(com.tencent.mm.R.id.hjb);
            this.f460007e = (com.tencent.mm.ui.widget.RoundCornerFrameLayout) rootView.findViewById(com.tencent.mm.R.id.jdk);
            this.f460008f = (android.widget.ImageView) rootView.findViewById(com.tencent.mm.R.id.b6y);
        }
    }
}
