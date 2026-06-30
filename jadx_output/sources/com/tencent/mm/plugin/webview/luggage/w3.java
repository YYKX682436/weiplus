package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class w3 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f182660a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f182661b;

    /* renamed from: c, reason: collision with root package name */
    public int f182662c;

    /* renamed from: d, reason: collision with root package name */
    public int f182663d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.xweb.d1 f182664e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.xweb.d1 f182665f;

    /* renamed from: g, reason: collision with root package name */
    public hy4.s f182666g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f182667h;

    /* renamed from: i, reason: collision with root package name */
    public final kd0.p2 f182668i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.luggage.e0 f182669j;

    /* renamed from: k, reason: collision with root package name */
    public final hy4.r f182670k = new com.tencent.mm.plugin.webview.luggage.g3(this);

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.snackbar.g f182671l = new com.tencent.mm.plugin.webview.luggage.i3(this);

    public w3(com.tencent.mm.plugin.webview.luggage.e0 e0Var) {
        this.f182669j = e0Var;
        e0Var.f182180p.setOnLongClickListener(new com.tencent.mm.plugin.webview.luggage.m3(this));
        kd0.x2 x2Var = (kd0.x2) i95.n0.c(kd0.x2.class);
        android.content.Context context = e0Var.f406610d;
        com.tencent.mm.plugin.webview.luggage.j3 j3Var = new com.tencent.mm.plugin.webview.luggage.j3(this);
        ((jd0.q2) x2Var).getClass();
        this.f182668i = new com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic(context, j3Var);
    }

    public final boolean a() {
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean;
        com.tencent.mm.plugin.webview.luggage.e0 e0Var = this.f182669j;
        return e0Var.f182178J.e(e0Var.u()).a() && (iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, null, com.tencent.mm.plugin.webview.luggage.q3.class)) != null && iPCBoolean.f68400d;
    }

    public final boolean b(java.lang.String str) {
        if (this.f182667h == null) {
            this.f182667h = new com.tencent.mm.ui.widget.dialog.k0(this.f182669j.f406610d, 1, false);
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f182667h;
        k0Var.f211872n = new com.tencent.mm.plugin.webview.luggage.n3(this);
        k0Var.f211881s = new com.tencent.mm.plugin.webview.luggage.o3(this, str);
        k0Var.p(new com.tencent.mm.plugin.webview.luggage.a3(this));
        if (!((android.app.Activity) this.f182669j.f406610d).isFinishing()) {
            this.f182667h.v();
        }
        return this.f182667h.i();
    }

    public final boolean c(com.tencent.xweb.d1 d1Var) {
        boolean b17 = b(d1Var.f220240b);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f182660a) && a()) {
            this.f182665f = d1Var;
            hy4.s sVar = new hy4.s();
            this.f182666g = sVar;
            sVar.a(this.f182669j.f182180p, this.f182670k);
        }
        return b17;
    }

    public final boolean d(com.tencent.xweb.d1 d1Var) {
        boolean b17 = b(d1Var.f220240b);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f182660a) && a()) {
            this.f182664e = d1Var;
            hy4.s sVar = new hy4.s();
            this.f182666g = sVar;
            sVar.a(this.f182669j.f182180p, this.f182670k);
        }
        return b17;
    }
}
