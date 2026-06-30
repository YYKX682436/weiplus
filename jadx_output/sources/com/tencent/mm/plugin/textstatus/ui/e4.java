package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class e4 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f173827a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f173828b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f173829c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f173830d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f173831e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f173832f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f173833g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f173834h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f173835i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f173836j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f173837k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f173838l;

    /* renamed from: m, reason: collision with root package name */
    public yz5.l f173839m;

    public e4(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f173827a = context;
        this.f173828b = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.z3(this));
        this.f173829c = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.y3(this));
        this.f173830d = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.d4(this));
        this.f173831e = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.v3(this));
        this.f173832f = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.x3(this));
        this.f173833g = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.a4(this));
        this.f173834h = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.b4(this));
        this.f173837k = true;
    }

    public static final android.graphics.drawable.Drawable a(com.tencent.mm.plugin.textstatus.ui.e4 e4Var, int i17) {
        e4Var.getClass();
        try {
            android.graphics.drawable.Drawable drawable = e4Var.f173827a.getResources().getDrawable(i17);
            com.tencent.mm.ui.uk.f(drawable, -1);
            return drawable;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TextStatus.StatusMuteButtonHelper", th6, "loadIcon failed: " + i17, new java.lang.Object[0]);
            return null;
        }
    }

    public final int b() {
        return ((java.lang.Number) ((jz5.n) this.f173829c).getValue()).intValue();
    }

    public final void c(boolean z17) {
        android.widget.ImageView imageView = this.f173835i;
        if (imageView == null) {
            return;
        }
        this.f173837k = z17;
        imageView.setImageDrawable(z17 ? (android.graphics.drawable.Drawable) ((jz5.n) this.f173833g).getValue() : (android.graphics.drawable.Drawable) ((jz5.n) this.f173834h).getValue());
    }
}
