package tj4;

/* loaded from: classes11.dex */
public final class c extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f419821d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f419822e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.textstatus.ui.TextStatusCircleIconLayout f419823f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f419824g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f419821d = itemView;
        this.f419822e = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.qdk);
        this.f419823f = (com.tencent.mm.plugin.textstatus.ui.TextStatusCircleIconLayout) itemView.findViewById(com.tencent.mm.R.id.qdj);
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.qdl);
        this.f419824g = findViewById;
        android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
        ej4.d0 d0Var = ej4.e0.f253344c;
        int i17 = ej4.e0.f253345d;
        if (i17 != 0) {
            layoutParams2.width = i17;
        }
        findViewById.setLayoutParams(layoutParams2);
    }
}
