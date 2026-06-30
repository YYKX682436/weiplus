package com.tencent.mm.plugin.game;

/* loaded from: classes8.dex */
public class w0 implements l53.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f141916a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m33.i1 f141917b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f141918c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m33.k1 f141919d;

    public w0(com.tencent.mm.plugin.game.p0 p0Var, com.tencent.mm.ui.widget.dialog.u3 u3Var, m33.i1 i1Var, int i17, m33.k1 k1Var) {
        this.f141916a = u3Var;
        this.f141917b = i1Var;
        this.f141918c = i17;
        this.f141919d = k1Var;
    }

    @Override // l53.a
    public void a(java.lang.String str) {
        m33.i1 i1Var = this.f141917b;
        if (i1Var != null) {
            i1Var.a(str);
        }
        final com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f141916a;
        com.tencent.mm.plugin.appbrand.utils.d5.b(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.game.w0$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.ui.widget.dialog.u3.this.dismiss();
            }
        });
        int i17 = this.f141918c;
        m33.k1 k1Var = this.f141919d;
        if (i17 == 2) {
            n53.b.b(k1Var.f323303a, 3L, 102, 10, 1, k1Var.f323306d, k1Var.f323310h, k1Var.f323309g);
        } else {
            n53.b.b(k1Var.f323303a, 3L, 101, 10, 1, k1Var.f323306d, k1Var.f323310h, k1Var.f323309g);
        }
    }

    @Override // l53.a
    public void b(java.lang.String str, java.lang.String str2) {
    }

    @Override // l53.a
    public void c() {
        final com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f141916a;
        com.tencent.mm.plugin.appbrand.utils.d5.b(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.game.w0$$b
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.ui.widget.dialog.u3.this.dismiss();
            }
        });
    }

    @Override // l53.a
    public void onCancel() {
        m33.i1 i1Var = this.f141917b;
        if (i1Var != null) {
            i1Var.onCancel();
        }
    }

    @Override // l53.a
    public void onSuccess() {
        m33.i1 i1Var = this.f141917b;
        if (i1Var != null) {
            i1Var.onSuccess();
        }
        int i17 = this.f141918c;
        m33.k1 k1Var = this.f141919d;
        if (i17 == 2) {
            n53.b.b(k1Var.f323303a, 3L, 102, 10, 0, k1Var.f323306d, k1Var.f323310h, k1Var.f323309g);
        } else {
            n53.b.b(k1Var.f323303a, 3L, 101, 10, 0, k1Var.f323306d, k1Var.f323310h, k1Var.f323309g);
        }
    }
}
