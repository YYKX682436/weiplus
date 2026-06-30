package te2;

/* loaded from: classes3.dex */
public final class f4 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f417997d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f417998e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(te2.h4 h4Var, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.vah);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f417997d = findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.vag);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f417998e = (android.widget.ImageView) findViewById2;
    }
}
