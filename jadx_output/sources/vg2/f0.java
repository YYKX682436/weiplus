package vg2;

/* loaded from: classes3.dex */
public final class f0 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f436506d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f436507e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f436508f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(vg2.h0 h0Var, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.ql_);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f436506d = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.qla);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f436507e = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.qlb);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f436508f = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById3;
    }
}
