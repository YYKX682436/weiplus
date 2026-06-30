package km3;

/* loaded from: classes10.dex */
public final class g extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f309243d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f309244e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.CheckBox f309245f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.jec);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f309243d = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.ors);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f309244e = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.jdh);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f309245f = (android.widget.CheckBox) findViewById3;
    }
}
