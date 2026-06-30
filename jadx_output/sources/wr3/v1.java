package wr3;

/* loaded from: classes11.dex */
public final class v1 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f448902d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f448903e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f448904f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f448905g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.ViewGroup f448906h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMNeat7extView f448907i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f448908m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.f483408an2);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f448902d = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.f483407an1);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f448903e = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.f483406an0);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f448904f = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.tencent.mm.R.id.amz);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f448905g = findViewById4;
        android.view.View findViewById5 = itemView.findViewById(com.tencent.mm.R.id.f483410an4);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f448906h = (android.view.ViewGroup) findViewById5;
        android.view.View findViewById6 = itemView.findViewById(com.tencent.mm.R.id.f483411an5);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f448907i = (com.tencent.mm.ui.widget.MMNeat7extView) findViewById6;
        this.f448908m = jz5.h.b(new wr3.u1(itemView));
    }
}
