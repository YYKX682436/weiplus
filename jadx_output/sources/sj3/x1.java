package sj3;

/* loaded from: classes13.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f408797a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.TextView f408798b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f408799c;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f408800d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f408801e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f408802f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f408803g;

    public x1(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.f408797a = rootView;
        float b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8);
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.jw7);
        this.f408801e = findViewById;
        if (findViewById != null) {
            findViewById.setClipToOutline(true);
        }
        if (findViewById != null) {
            findViewById.setOutlineProvider(new sj3.f5(b17));
        }
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.pm8);
        this.f408803g = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setClipToOutline(true);
        }
        if (findViewById2 != null) {
            findViewById2.setOutlineProvider(new sj3.f5(b17));
        }
        this.f408798b = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.jxh);
        this.f408799c = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.jxi);
        android.content.Context context = rootView.getContext();
        this.f408800d = context;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) rootView.findViewById(com.tencent.mm.R.id.jwi);
        this.f408802f = weImageView;
        if (weImageView != null) {
            weImageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icon_filled_voice_call, android.graphics.Color.parseColor("#07C160")));
        }
        if (weImageView != null) {
            weImageView.setIconColor(android.graphics.Color.parseColor("#07C160"));
        }
        if (weImageView == null) {
            return;
        }
        weImageView.setVisibility(0);
    }
}
