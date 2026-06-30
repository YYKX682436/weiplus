package sj3;

/* loaded from: classes8.dex */
public final class r5 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f408730d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f408731e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.a9m);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f408730d = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.gz8);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f408731e = findViewById2;
    }
}
