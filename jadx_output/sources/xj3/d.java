package xj3;

/* loaded from: classes3.dex */
public final class d extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f454872d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f454873e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        float b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 2);
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.jwz);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById;
        this.f454873e = imageView;
        imageView.setClipToOutline(true);
        imageView.setOutlineProvider(new com.tencent.mm.plugin.voip.ui.f1(b17));
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.f486024jx0);
        kotlin.jvm.internal.o.e(findViewById2, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2;
        this.f454872d = weImageView;
        weImageView.setClipToOutline(true);
        weImageView.setOutlineProvider(new com.tencent.mm.plugin.voip.ui.f1(b17));
    }
}
