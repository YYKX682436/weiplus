package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class gd extends android.widget.RelativeLayout {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f118419n = 0;

    /* renamed from: d, reason: collision with root package name */
    public final int f118420d;

    /* renamed from: e, reason: collision with root package name */
    public final int f118421e;

    /* renamed from: f, reason: collision with root package name */
    public int f118422f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f118423g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f118424h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f118425i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.a f118426m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f118420d = 3;
        this.f118421e = 1;
        this.f118422f = 3;
        this.f118425i = new com.tencent.mm.sdk.platformtools.b4("FinderLiveCountDownLoadingViewTimer", (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.finder.live.widget.ed(this), true);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.e9z, (android.view.ViewGroup) this, true);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.cjk);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f118423g = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.cut);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f118424h = (android.widget.TextView) findViewById2;
        setVisibility(8);
    }
}
