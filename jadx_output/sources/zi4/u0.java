package zi4;

/* loaded from: classes11.dex */
public final class u0 extends zi4.a implements com.tencent.mm.modelbase.u0 {

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f473266g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(java.lang.String cmdId, java.lang.ref.WeakReference weakReference, zi4.g0 host) {
        super(cmdId, weakReference, host);
        kotlin.jvm.internal.o.g(cmdId, "cmdId");
        kotlin.jvm.internal.o.g(host, "host");
    }

    @Override // zi4.a
    public void a(byte[] bArr, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        bw5.ob obVar = new bw5.ob();
        obVar.parseFrom(bArr);
        pm0.v.X(new zi4.s0(this, obVar));
    }

    public final void b(java.lang.String str, mj4.h hVar, java.lang.String str2) {
        android.content.Context context;
        jz5.f0 f0Var;
        android.content.Context context2;
        java.lang.ref.WeakReference weakReference = this.f473181e;
        if (str2 != null) {
            if (weakReference == null || (context2 = (android.content.Context) weakReference.get()) == null) {
                f0Var = null;
            } else {
                com.tencent.mm.plugin.textstatus.ui.TextStatusShowStatusCardUI.f173693f.a(context2, str, hVar, str2);
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var != null) {
                return;
            }
        }
        if (weakReference == null || (context = (android.content.Context) weakReference.get()) == null) {
            return;
        }
        com.tencent.mm.plugin.textstatus.ui.TextStatusShowStatusCardUI.f173693f.b(context, str, hVar);
    }

    public final void c() {
        java.lang.ref.WeakReference weakReference = this.f473181e;
        android.content.Context context = weakReference != null ? (android.content.Context) weakReference.get() : null;
        if (context != null) {
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.textstatus.ui.TextStatusShowExpireStatusUI.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/flutter/action/FLTStatusMessagePageOpenCardListPageHandler", "goToStatusExpiredTipsPage", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/textstatus/flutter/action/FLTStatusMessagePageOpenCardListPageHandler", "goToStatusExpiredTipsPage", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        pj4.g1 g1Var;
        gm0.j1.d().q(4245, this);
        com.tencent.mars.xlog.Log.i("MicroMsg.FLTStatusMessagePageOpenCardListPageHandler", "onSceneEnd() called with: errType = " + i17 + ", errCode = " + i18 + ", errMsg = " + str + ", scene = " + m1Var);
        if (i17 != 0 || i18 != 0) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f473266g;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            this.f473266g = null;
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            db5.t7.m(context, context.getString(com.tencent.mm.R.string.jwt));
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var2 = this.f473266g;
        if (u3Var2 != null) {
            u3Var2.dismiss();
        }
        this.f473266g = null;
        ej4.f fVar = m1Var instanceof ej4.f ? (ej4.f) m1Var : null;
        if (fVar == null || (g1Var = fVar.f253353f) == null) {
            return;
        }
        java.util.LinkedList linkedList = g1Var.f355059d;
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            db5.t7.m(context2, context2.getString(com.tencent.mm.R.string.jwt));
            com.tencent.mars.xlog.Log.w("MicroMsg.FLTStatusMessagePageOpenCardListPageHandler", "onSceneEnd: histories isNullOrNil");
            return;
        }
        pj4.n1 n1Var = (pj4.n1) linkedList.get(0);
        mj4.h a17 = n1Var != null ? fj4.b.a(n1Var) : null;
        if (a17 == null) {
            c();
            return;
        }
        java.lang.String a18 = en1.a.a();
        kotlin.jvm.internal.o.f(a18, "username(...)");
        b(a18, a17, fVar.f253356i);
    }
}
