package zd5;

/* loaded from: classes9.dex */
public final class s extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f471710d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.base.EllipsizeTextView f471711e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f471712f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f471713g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f471714h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.a_4);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f471710d = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.kbq);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f471711e = (com.tencent.mm.ui.base.EllipsizeTextView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.jue);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f471712f = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.tencent.mm.R.id.o7z);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f471713g = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = itemView.findViewById(com.tencent.mm.R.id.d0v);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f471714h = findViewById5;
    }
}
