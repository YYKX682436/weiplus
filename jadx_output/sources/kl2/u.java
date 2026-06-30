package kl2;

/* loaded from: classes3.dex */
public final class u extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f308816d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f308817e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f308818f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.view.View view) {
        super(view);
        kotlin.jvm.internal.o.g(view, "view");
        this.f308816d = view;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.lgw);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f308817e = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.bub);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f308818f = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2;
    }
}
