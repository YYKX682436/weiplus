package com.tencent.mm.plugin.webview.model;

/* loaded from: classes7.dex */
public class d2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.l2 f182834d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f182835e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f182836f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f182837g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f182838h;

    public d2(com.tencent.mm.plugin.webview.model.l2 l2Var, android.content.Context context, android.os.Bundle bundle, int i17, android.app.Dialog dialog) {
        this.f182834d = l2Var;
        this.f182835e = context;
        this.f182836f = bundle;
        this.f182837g = i17;
        this.f182838h = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.model.l2 webviewDelegate = this.f182834d;
        if (((com.tencent.mm.plugin.webview.core.o2) webviewDelegate).f181903c != null) {
            com.tencent.mm.plugin.webview.model.f3 f3Var = ((com.tencent.mm.plugin.webview.core.o2) webviewDelegate).f181903c;
            f3Var.getClass();
            android.content.Context ct6 = this.f182835e;
            kotlin.jvm.internal.o.g(ct6, "ct");
            android.os.Bundle resp = this.f182836f;
            kotlin.jvm.internal.o.g(resp, "resp");
            kotlin.jvm.internal.o.g(webviewDelegate, "webviewDelegate");
            if (ct6 instanceof android.content.MutableContextWrapper) {
                ct6 = ((android.content.MutableContextWrapper) ct6).getBaseContext();
                kotlin.jvm.internal.o.f(ct6, "getBaseContext(...)");
            }
            if (ct6 instanceof android.app.Activity) {
                int i17 = f3Var.f182876b;
                int i18 = this.f182837g;
                if (i17 != i18 && f3Var.f182875a != null) {
                    f3Var.c();
                }
                f3Var.f182876b = i18;
                if (f3Var.f182875a == null) {
                    java.lang.String c17 = ((com.tencent.mm.plugin.webview.core.o2) webviewDelegate).c();
                    java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(ct6);
                    android.app.Dialog dialog = this.f182838h;
                    f3Var.f182875a = new com.tencent.mm.plugin.webview.model.e3(f3Var, weakReference, dialog != null ? new java.lang.ref.WeakReference(dialog) : null, c17);
                }
                com.tencent.mm.plugin.webview.model.e3 e3Var = f3Var.f182875a;
                kotlin.jvm.internal.o.d(e3Var);
                int i19 = 0;
                if (!(e3Var.f182855e == null)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.OauthMultiAccountMgr", "[showDialogQueue] repeat call");
                    return;
                }
                f3Var.f182877c = new java.lang.ref.WeakReference(webviewDelegate);
                com.tencent.mm.plugin.webview.model.e3 e3Var2 = f3Var.f182875a;
                if (e3Var2 != null) {
                    e3Var2.f182855e = resp;
                    java.io.Serializable serializable = resp.getSerializable("scope_list");
                    kotlin.jvm.internal.o.e(serializable, "null cannot be cast to non-null type java.util.ArrayList<kotlin.ByteArray>");
                    java.util.LinkedList a17 = com.tencent.mm.plugin.webview.model.m2.a((java.util.ArrayList) serializable);
                    e3Var2.f182853c = a17;
                    e3Var2.f182860j.getClass();
                    if (!com.tencent.mm.sdk.platformtools.t8.L0(a17) && a17.size() != 1) {
                        java.util.Iterator it = a17.iterator();
                        int i27 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            java.lang.Object next = it.next();
                            int i28 = i27 + 1;
                            if (i27 < 0) {
                                kz5.c0.p();
                                throw null;
                            }
                            if (kotlin.jvm.internal.o.b(((r45.jv5) next).f378131d, "snsapi_userinfo")) {
                                i19 = i27;
                                break;
                            }
                            i27 = i28;
                        }
                        if (i19 > 0) {
                            a17.addFirst(a17.remove(i19));
                        }
                    }
                    e3Var2.b();
                }
            }
        }
    }
}
