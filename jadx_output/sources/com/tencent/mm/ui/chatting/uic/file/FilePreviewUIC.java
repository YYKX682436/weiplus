package com.tencent.mm.ui.chatting.uic.file;

/* loaded from: classes12.dex */
public final class FilePreviewUIC extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f202747d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f202748e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f202749f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f202750g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f202751h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f202752i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilePreviewUIC(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f202747d = jz5.h.b(qe5.o1.f362164d);
        this.f202748e = jz5.h.b(new qe5.u1(this));
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f202752i = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LiteAppLifeCycleEvent>(a0Var) { // from class: com.tencent.mm.ui.chatting.uic.file.FilePreviewUIC$liteAppDestroyListener$1
            {
                this.__eventId = 1907495603;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.LiteAppLifeCycleEvent liteAppLifeCycleEvent) {
                j75.f Q6;
                com.tencent.mm.autogen.events.LiteAppLifeCycleEvent event = liteAppLifeCycleEvent;
                kotlin.jvm.internal.o.g(event, "event");
                if (event.f54468g.f7817a != 3) {
                    return false;
                }
                com.tencent.mm.ui.chatting.uic.file.FilePreviewUIC filePreviewUIC = com.tencent.mm.ui.chatting.uic.file.FilePreviewUIC.this;
                if (filePreviewUIC.Z6().o().getVisibility() != 0 || (Q6 = filePreviewUIC.Q6()) == null) {
                    return false;
                }
                kd5.n nVar = new kd5.n(com.tencent.mm.ui.report.p.f209724i);
                nVar.f306904c = true;
                Q6.B3(nVar);
                return false;
            }
        };
    }

    public static final void T6(com.tencent.mm.ui.chatting.uic.file.FilePreviewUIC filePreviewUIC) {
        filePreviewUIC.getClass();
        try {
            kd5.e Y6 = filePreviewUIC.Y6();
            if ((Y6 != null ? Y6.f306881i : null) == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.File.FilePreviewUIC", "simpleMsgInfo is null");
                return;
            }
            java.lang.String V6 = filePreviewUIC.V6();
            com.tencent.mars.xlog.Log.i("MicroMsg.File.FilePreviewUIC", "previewFile query: ".concat(V6));
            filePreviewUIC.b7(V6);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.File.FilePreviewUIC", "Preview file error", e17);
        }
    }

    public final java.lang.String U6() {
        java.lang.String str;
        java.lang.String str2;
        kd5.e Y6 = Y6();
        if (Y6 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.File.FilePreviewUIC", "buildLocalCompressedFileQueryParams state is null");
            return "";
        }
        if (!Y6.f306884o || (str = Y6.f306885p) == null) {
            str = "";
        }
        cl0.g gVar = new cl0.g();
        gVar.h("fileSize", java.lang.String.valueOf(Y6.f306894y));
        gVar.h("fileExt", Y6.f306893x);
        gVar.h(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, com.tencent.mm.vfs.w6.i(Y6.F, false));
        gVar.h(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME, Y6.f306892w);
        oi3.g gVar2 = Y6.f306881i;
        if (gVar2 == null || (str2 = java.lang.Long.valueOf(gVar2.getLong(gVar2.f345617d + 1)).toString()) == null) {
            str2 = "";
        }
        gVar.h("msgSvrId", str2);
        java.lang.String str3 = Y6.f306880h;
        if (str3 == null) {
            str3 = "";
        }
        gVar.h("chatName", str3);
        gVar.h("extInfo", str);
        com.tencent.mm.storage.f9 f9Var = Y6.f306877e;
        gVar.h("senderUsername", f9Var != null ? g95.e0.f(f9Var) : "");
        sc5.g gVar3 = sc5.g.f406572a;
        kd5.e Y62 = Y6();
        if (gVar3.e(Y62 != null ? Y62.f306893x : null)) {
            gVar.h("minVersion", "1.2.0");
        }
        java.lang.String gVar4 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar4, "toString(...)");
        return gVar4;
    }

    public final java.lang.String V6() {
        java.lang.String str;
        java.lang.String str2;
        oi3.g gVar;
        kd5.e Y6 = Y6();
        if (Y6 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.File.FilePreviewUIC", "");
            return "";
        }
        java.lang.String str3 = Y6.B;
        boolean z17 = false;
        if (str3 == null || str3.length() == 0) {
            str3 = null;
        }
        if (str3 == null) {
            str3 = Y6.C;
        }
        kd5.e Y62 = Y6();
        int floor = (Y62 == null || (gVar = Y62.f306881i) == null) ? 0 : (int) java.lang.Math.floor((1209600 - c01.id.f(gVar.getLong(gVar.f345617d + 2) / 1000)) / 86400.0d);
        if (!Y6.f306884o || (str = Y6.f306885p) == null) {
            str = "";
        }
        com.tencent.mm.storage.f9 f9Var = Y6.f306877e;
        if (f9Var != null && f9Var.A0() == 1) {
            z17 = true;
        }
        int i17 = z17 ? 1 : 2;
        cl0.g gVar2 = new cl0.g();
        gVar2.h("fileId", str3);
        gVar2.h("aesKey", Y6.D);
        gVar2.h("fileSize", java.lang.String.valueOf(Y6.f306894y));
        gVar2.h("fileExt", Y6.f306893x);
        gVar2.h("expiredIn", java.lang.String.valueOf(floor));
        gVar2.h(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME, Y6.f306892w);
        gVar2.o("sendSource", i17);
        oi3.g gVar3 = Y6.f306881i;
        if (gVar3 == null || (str2 = java.lang.Long.valueOf(gVar3.getLong(gVar3.f345617d + 1)).toString()) == null) {
            str2 = "";
        }
        gVar2.h("msgSvrId", str2);
        java.lang.String str4 = Y6.f306880h;
        if (str4 == null) {
            str4 = "";
        }
        gVar2.h("chatName", str4);
        gVar2.h("extInfo", str);
        com.tencent.mm.storage.f9 f9Var2 = Y6.f306877e;
        gVar2.h("senderUsername", f9Var2 != null ? g95.e0.f(f9Var2) : "");
        java.lang.String gVar4 = gVar2.toString();
        kotlin.jvm.internal.o.f(gVar4, "toString(...)");
        return gVar4;
    }

    public final boolean W6() {
        java.lang.Object m521constructorimpl;
        sc5.g gVar = sc5.g.f406572a;
        kd5.e Y6 = Y6();
        if (!gVar.a(Y6 != null ? Y6.f306893x : null)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkAndPreviewLocalFile fileExt: ");
            kd5.e Y62 = Y6();
            sb6.append(Y62 != null ? Y62.f306893x : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.File.FilePreviewUIC", sb6.toString());
            return false;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.String U6 = U6();
            kd5.e Y63 = Y6();
            a7(U6, gVar.e(Y63 != null ? Y63.f306893x : null) ? "pages/markdown" : "pages/archiveLocal");
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl == null) {
            return true;
        }
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.File.FilePreviewUIC", m524exceptionOrNullimpl, "", new java.lang.Object[0]);
        return false;
    }

    public final boolean X6() {
        com.tencent.mm.storage.f9 f9Var;
        boolean b17;
        kd5.e Y6 = Y6();
        if (Y6 != null && (f9Var = Y6.f306877e) != null) {
            kd5.e Y62 = Y6();
            if (Y62 != null && Y62.f306884o) {
                te5.h hVar = te5.h.f418649a;
                kd5.e Y63 = Y6();
                b17 = com.tencent.mm.ui.chatting.component.z4.d(f9Var, Y63 != null ? Y63.F : null, new com.tencent.mm.ui.chatting.component.z4$$b());
            } else {
                b17 = te5.h.f418649a.b(f9Var);
            }
            this.f202749f = b17;
            this.f202750g = te5.h.f418649a.d(f9Var) == 7;
        }
        kd5.e Y64 = Y6();
        boolean z17 = Y64 != null ? Y64.P : false;
        if ((!this.f202749f && !this.f202750g) || z17) {
            return false;
        }
        em.d0 Z6 = Z6();
        Z6.c().setVisibility(8);
        Z6.h().setVisibility(8);
        Z6.g().setVisibility(8);
        Z6.t().setVisibility(8);
        Z6.r().setVisibility(8);
        Z6.s().setVisibility(8);
        Z6.u().setVisibility(8);
        Z6.a().setVisibility(8);
        Z6.b().setVisibility(8);
        Z6.p().setVisibility(8);
        Z6.k().setVisibility(8);
        Z6.f().setVisibility(8);
        Z6.q().setVisibility(8);
        Z6.x().setVisibility(8);
        Z6.l().setVisibility(0);
        Z6.l().setText(com.tencent.mm.R.string.nhq);
        if (this.f202749f) {
            Z6.l().setText(com.tencent.mm.R.string.nhq);
        } else if (this.f202750g) {
            Z6.l().setText(com.tencent.mm.R.string.n_y);
        }
        return true;
    }

    public final kd5.e Y6() {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            return (kd5.e) Q6.getState();
        }
        return null;
    }

    public final em.d0 Z6() {
        return (em.d0) ((jz5.n) this.f202748e).getValue();
    }

    public final void a7(java.lang.String str, java.lang.String str2) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", "wxalite1bb2f5d7cc00eda04a5fa173bf6643b8");
        bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, str2);
        bundle.putString("query", str);
        bundle.putBoolean("isHalfScreen", false);
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(getContext(), bundle, true, false, new qe5.s1(this));
    }

    public final void b7(java.lang.String str) {
        int intValue = ((java.lang.Number) ((jz5.n) this.f202747d).getValue()).intValue();
        float intValue2 = 1 <= intValue && intValue < 101 ? ((java.lang.Number) ((jz5.n) r0).getValue()).intValue() / 100.0f : 0.85f;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", "wxalite1bb2f5d7cc00eda04a5fa173bf6643b8");
        bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "pages/home");
        bundle.putString("query", str);
        bundle.putBoolean("isHalfScreen", true);
        com.tencent.mm.plugin.lite.api.LiteAppHalfScreenConfig liteAppHalfScreenConfig = new com.tencent.mm.plugin.lite.api.LiteAppHalfScreenConfig();
        liteAppHalfScreenConfig.f143414h = true;
        liteAppHalfScreenConfig.f143411e = intValue2;
        liteAppHalfScreenConfig.f143413g = 1.0d;
        liteAppHalfScreenConfig.f143412f = 1.0d;
        bundle.putParcelable("halfScreenConfig", liteAppHalfScreenConfig);
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(getContext(), bundle, true, false, new qe5.t1(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        this.f202752i.alive();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        this.f202752i.dead();
    }
}
