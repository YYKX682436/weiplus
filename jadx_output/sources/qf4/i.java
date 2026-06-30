package qf4;

/* loaded from: classes4.dex */
public final class i extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f362703d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f362704e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f362705f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qf4.k f362706g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(qf4.k kVar, android.view.View view) {
        super(view);
        kotlin.jvm.internal.o.g(view, "view");
        this.f362706g = kVar;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f482907rg);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f362703d = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.f482908rh);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f362704e = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.ra);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f362705f = (android.widget.TextView) findViewById3;
    }
}
