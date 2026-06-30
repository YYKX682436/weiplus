package com.tencent.mm.plugin.transvoice.model;

/* loaded from: classes5.dex */
public class c implements com.tencent.mm.modelbase.u0 {

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String f175367o = com.tencent.mm.storage.v3.f196273a + "voice_temp.silk";

    /* renamed from: d, reason: collision with root package name */
    public final z21.v f175368d;

    /* renamed from: e, reason: collision with root package name */
    public z21.j0 f175369e;

    /* renamed from: f, reason: collision with root package name */
    public final e70.a0 f175370f;

    /* renamed from: g, reason: collision with root package name */
    public final int f175371g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f175372h;

    /* renamed from: i, reason: collision with root package name */
    public final z21.a0 f175373i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f175374m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f175375n;

    public c(z21.a0 a0Var, int i17, z21.v vVar) {
        this.f175370f = null;
        this.f175371g = 0;
        this.f175372h = "";
        this.f175374m = false;
        this.f175375n = false;
        this.f175373i = a0Var;
        this.f175368d = vVar;
    }

    public void a(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoiceInputAddr2", "continuable: %s, cancel fromUI = %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        c(z17, z18);
    }

    public void b() {
        if (this.f175375n) {
            z21.j0 j0Var = this.f175369e;
            if (j0Var == null || !j0Var.e()) {
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.transvoice.model.b(this, 13, 131, -1));
            } else {
                this.f175369e.k();
            }
        }
    }

    public final void c(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoiceInputAddr2", "reset continuable = %s, sendLastScene = %s.", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        if (z17) {
            this.f175375n = true;
            return;
        }
        this.f175375n = false;
        z21.j0 j0Var = this.f175369e;
        if (j0Var != null) {
            j0Var.f469633p = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoiceInputAddr2", "reset call stop, sendLastScene: %s.", java.lang.Boolean.valueOf(z18));
            if (z18) {
                this.f175369e.c();
            }
        }
        this.f175369e = null;
    }

    public void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoiceInputAddr2", "start trans, time: %s.", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        z21.j0 j0Var = new z21.j0(null, this.f175368d, f175367o, this.f175373i, this.f175370f, 20, this.f175371g);
        this.f175369e = j0Var;
        j0Var.f469639v = java.lang.System.currentTimeMillis();
        java.lang.String str = this.f175372h;
        if (com.tencent.mm.storage.z3.i4(str)) {
            this.f175369e.f469641x = str;
        }
        if (this.f175369e.e()) {
            this.f175369e.k();
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.transvoice.model.b(this, 13, 131, -1));
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        z21.a aVar = (z21.a) m1Var;
        aVar.J();
        aVar.K();
        aVar.L();
        java.lang.System.currentTimeMillis();
        m1Var.hashCode();
    }

    public c(z21.a0 a0Var, int i17, int i18, java.lang.String str, e70.a0 a0Var2, z21.v vVar) {
        this.f175370f = null;
        this.f175371g = 0;
        this.f175372h = "";
        this.f175374m = false;
        this.f175375n = false;
        this.f175373i = a0Var;
        this.f175371g = i18;
        this.f175372h = str;
        this.f175370f = a0Var2;
        this.f175368d = vVar;
    }
}
