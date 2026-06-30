package gg1;

/* loaded from: classes7.dex */
public final class k extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f271580d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.FrameLayout f271581e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ProgressBar f271582f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f271583g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f271584h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(gg1.p pVar, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.omb);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.f271580d = textView;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.g7o);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f271581e = (android.widget.FrameLayout) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.f486289kt1);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f271582f = (android.widget.ProgressBar) findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.tencent.mm.R.id.hkz);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById4;
        this.f271583g = imageView;
        android.view.View findViewById5 = itemView.findViewById(com.tencent.mm.R.id.olh);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById5;
        this.f271584h = textView2;
        imageView.setImageResource(com.tencent.mm.R.raw.cast_successful);
        zk1.m.f473414l.a(itemView, (r27 & 2) != 0 ? null : null, (r27 & 4) != 0 ? null : null, (r27 & 8) != 0 ? false : true, (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? null : null, (r27 & 128) != 0 ? null : null, (r27 & 256) != 0 ? null : null, (r27 & 512) != 0 ? null : null, (r27 & 1024) != 0 ? null : null, (r27 & 2048) != 0 ? null : null, (r27 & 4096) == 0 ? null : null);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.s(textView, 1);
        n3.u0.s(textView2, 1);
    }
}
