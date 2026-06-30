package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class x9 {

    /* renamed from: a, reason: collision with root package name */
    public android.widget.ListView f208239a;

    /* renamed from: b, reason: collision with root package name */
    public yf5.j0 f208240b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.conversation.o5 f208241c;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f208243e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Runnable f208244f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f208242d = false;

    /* renamed from: g, reason: collision with root package name */
    public int f208245g = -1;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.b0 f208246h = new com.tencent.mm.pluginsdk.ui.b0(new com.tencent.mm.ui.conversation.u9(this));

    public static void a(com.tencent.mm.ui.conversation.x9 x9Var, int i17) {
        x9Var.getClass();
        if (i17 < 0) {
            i17 = 300;
        }
        x9Var.b();
        if (x9Var.f208243e == null) {
            x9Var.f208243e = new com.tencent.mm.sdk.platformtools.n3("pre load mainui avatar");
        }
        x9Var.f208242d = false;
        com.tencent.mm.sdk.platformtools.n3 n3Var = x9Var.f208243e;
        com.tencent.mm.ui.conversation.w9 w9Var = new com.tencent.mm.ui.conversation.w9(x9Var);
        x9Var.f208244f = w9Var;
        n3Var.postDelayed(w9Var, i17);
    }

    public final void b() {
        java.lang.Runnable runnable;
        if (!this.f208242d) {
            this.f208242d = true;
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f208243e;
        if (n3Var != null && (runnable = this.f208244f) != null) {
            n3Var.removeCallbacks(runnable);
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var2 = this.f208243e;
        if (n3Var2 != null) {
            n3Var2.quit();
            this.f208243e = null;
        }
    }
}
