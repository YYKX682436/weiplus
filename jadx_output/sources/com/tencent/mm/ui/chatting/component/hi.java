package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.j1.class)
/* loaded from: classes4.dex */
public final class hi extends com.tencent.mm.ui.chatting.component.a implements sb5.j1, l75.q0 {

    /* renamed from: e, reason: collision with root package name */
    public boolean f199167e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.z2 f199168f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.component.OpenIMArchiveComponent$OpenIMArchiveSpanHandler f199169g = new com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler(this) { // from class: com.tencent.mm.ui.chatting.component.OpenIMArchiveComponent$OpenIMArchiveSpanHandler

        /* renamed from: a, reason: collision with root package name */
        public final java.lang.ref.WeakReference f198565a;

        {
            kotlin.jvm.internal.o.g(this, "component");
            this.f198565a = new java.lang.ref.WeakReference(this);
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{65};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            kotlin.jvm.internal.o.d(str);
            if (r26.i0.A(r26.n0.u0(str).toString(), "wxwork://jump?target=archivepopup", false, 2, null)) {
                return new r35.m3(str, 65, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            kotlin.jvm.internal.o.d(m3Var);
            if (m3Var.f369195d != 65) {
                return false;
            }
            java.lang.ref.WeakReference weakReference = this.f198565a;
            com.tencent.mm.ui.chatting.component.hi hiVar = (com.tencent.mm.ui.chatting.component.hi) weakReference.get();
            if (hiVar == null || hiVar.f199167e) {
                return false;
            }
            java.lang.String queryParameter = android.net.Uri.parse(m3Var.e()).getQueryParameter("url");
            if (queryParameter == null) {
                return true;
            }
            hiVar.n0(queryParameter, false);
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    };

    public static final void m0(com.tencent.mm.ui.chatting.component.hi hiVar, r45.tz4 tz4Var, int i17) {
        yb5.d dVar = hiVar.f198580d;
        java.lang.String x17 = dVar != null ? dVar.x() : null;
        if (x17 == null) {
            x17 = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMArchiveComponent", "doubleBtnClick username:%s url:%s status:%s", x17, tz4Var.f386888m, java.lang.Integer.valueOf(i17));
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(hiVar.f198580d.g(), "", hiVar.f198580d.g().getString(com.tencent.mm.R.string.ggc), true, false, null);
        java.lang.String privacy_agreement_url = tz4Var.f386888m;
        kotlin.jvm.internal.o.f(privacy_agreement_url, "privacy_agreement_url");
        pq5.g l17 = new com.tencent.mm.ui.chatting.component.ci(x17, privacy_agreement_url, i17).l();
        android.app.Activity g17 = hiVar.f198580d.g();
        kotlin.jvm.internal.o.e(g17, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        l17.f((com.tencent.mm.ui.MMFragmentActivity) g17);
        l17.h(new com.tencent.mm.ui.chatting.component.ei(Q, x17, hiVar));
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMArchiveComponent", "onChattingExitAnimEnd() called " + hashCode());
        com.tencent.mm.app.plugin.s.f().f53682h.remove(this.f199169g);
        com.tencent.mm.ui.widget.dialog.z2 z2Var = this.f199168f;
        if (z2Var != null) {
            z2Var.B();
        }
        this.f199168f = null;
    }

    public final void n0(java.lang.String str, boolean z17) {
        yb5.d dVar = this.f198580d;
        java.lang.String x17 = dVar != null ? dVar.x() : null;
        if (x17 == null) {
            x17 = "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(hashCode());
        sb6.append(" checkArchiveDlg() called with: url = ");
        sb6.append(str);
        sb6.append(", fromNewXml = ");
        sb6.append(z17);
        sb6.append(" reqUserName = ");
        sb6.append(x17);
        sb6.append(" isfinish:");
        android.app.Activity g17 = this.f198580d.g();
        sb6.append(g17 != null ? java.lang.Boolean.valueOf(g17.isFinishing()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMArchiveComponent", sb6.toString());
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        if (!z17) {
            h0Var.f310123d = db5.e1.Q(this.f198580d.g(), "", this.f198580d.g().getString(com.tencent.mm.R.string.ggc), true, false, null);
        }
        pq5.g l17 = new com.tencent.mm.ui.chatting.component.ai(x17, str).l();
        android.app.Activity g18 = this.f198580d.g();
        kotlin.jvm.internal.o.e(g18, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        l17.f((com.tencent.mm.ui.MMFragmentActivity) g18);
        l17.h(new com.tencent.mm.ui.chatting.component.di(this, x17, h0Var, z17));
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        yb5.d dVar = this.f198580d;
        java.lang.String x17 = dVar != null ? dVar.x() : null;
        if (x17 == null) {
            x17 = "";
        }
        if (r26.n0.N(x17)) {
            return;
        }
        if (w0Var != null && w0Var.f316974b == 4) {
            java.lang.Object obj = w0Var != null ? w0Var.f316976d : null;
            dm.s8 s8Var = obj instanceof dm.s8 ? (dm.s8) obj : null;
            if (kotlin.jvm.internal.o.b(x17, s8Var != null ? s8Var.field_username : null)) {
                java.lang.Object obj2 = w0Var != null ? w0Var.f316976d : null;
                dm.s8 s8Var2 = obj2 instanceof dm.s8 ? (dm.s8) obj2 : null;
                java.lang.String str2 = s8Var2 != null ? s8Var2.field_content : null;
                if (str2 == null || r26.n0.N(str2)) {
                    return;
                }
                n0(str2, true);
            }
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        this.f199167e = false;
        yb5.d dVar = this.f198580d;
        java.lang.String x17 = dVar != null ? dVar.x() : null;
        if (x17 == null) {
            x17 = "";
        }
        if (r26.n0.N(x17)) {
            return;
        }
        if (com.tencent.mm.storage.z3.m4(x17) || com.tencent.mm.storage.z3.n4(x17) || c01.e2.R(x17)) {
            i41.l lVar = (i41.l) ((j41.c0) i95.n0.c(j41.c0.class));
            lVar.getClass();
            u41.e eVar = new u41.e(x17, null);
            lVar.Bi().get(eVar, new java.lang.String[0]);
            java.lang.String str = eVar.field_content;
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMArchiveComponent", hashCode() + " onChattingResume talker:%s url:%s", x17, str);
            if (!(str == null || r26.n0.N(str))) {
                kotlin.jvm.internal.o.d(str);
                n0(str, true);
            }
            ((i41.l) ((j41.c0) i95.n0.c(j41.c0.class))).Bi().add(this);
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
        this.f199167e = true;
        ((i41.l) ((j41.c0) i95.n0.c(j41.c0.class))).Bi().remove(this);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMArchiveComponent", "onChattingEnterAnimStart() called " + hashCode());
        com.tencent.mm.app.plugin.s.f().f53682h.add(this.f199169g);
    }
}
