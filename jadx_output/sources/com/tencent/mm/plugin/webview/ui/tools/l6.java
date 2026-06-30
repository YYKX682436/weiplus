package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class l6 implements hx4.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ db5.g4 f185635a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185636b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f185637c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f185638d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.c6 f185639e;

    public l6(com.tencent.mm.plugin.webview.ui.tools.c6 c6Var, db5.g4 g4Var, java.lang.String str, boolean z17, boolean z18) {
        this.f185639e = c6Var;
        this.f185635a = g4Var;
        this.f185636b = str;
        this.f185637c = z17;
        this.f185638d = z18;
    }

    @Override // hx4.v
    public void a(android.graphics.drawable.Drawable drawable) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var;
        com.tencent.mm.plugin.webview.ui.tools.c6 c6Var = this.f185639e;
        c6Var.f184049f.f285702c = drawable;
        if (drawable == null || (k0Var = c6Var.f184044J) == null || !k0Var.i()) {
            return;
        }
        this.f185639e.i(this.f185635a, this.f185636b, drawable, null, this.f185637c, this.f185638d);
    }
}
