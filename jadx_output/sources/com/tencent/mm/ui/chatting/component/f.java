package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.b.class)
/* loaded from: classes9.dex */
public class f extends com.tencent.mm.ui.chatting.component.a implements sb5.b {

    /* renamed from: e, reason: collision with root package name */
    public nr4.a f198995e = null;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.qe f198996f = null;

    /* renamed from: g, reason: collision with root package name */
    public final l75.q0 f198997g = new com.tencent.mm.ui.chatting.component.b(this);

    /* renamed from: h, reason: collision with root package name */
    public final l75.q0 f198998h = new com.tencent.mm.ui.chatting.component.c(this);

    /* renamed from: i, reason: collision with root package name */
    public final qi3.a0 f198999i = new com.tencent.mm.ui.chatting.component.d(this);

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        nr4.a c17 = nr4.a.c(this.f198580d.u().d1(), 1);
        this.f198995e = c17;
        c17.a(1, this.f198580d.u().d1());
        ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).Zi(this.f198999i);
        com.tencent.mm.pluginsdk.model.app.u5.wi().add(this.f198997g);
        com.tencent.mm.pluginsdk.model.app.u5.Di().add(this.f198998h);
        if (this.f198996f == null) {
            this.f198996f = new com.tencent.mm.ui.chatting.qe(this.f198580d);
        }
        com.tencent.mm.ui.chatting.qe.f202628d.a(this.f198996f, null);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        o0();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        o0();
    }

    @Override // yn.d
    public void N(int i17, int i18, android.content.Intent intent) {
        if (i17 == 210) {
            if (i18 == -1) {
                n0(pt0.f0.Li(intent.getStringExtra("App_MsgTalker"), intent.getLongExtra("App_MsgId", 0L)), null);
                return;
            }
            return;
        }
        if (i17 == 222 && i18 == -1 && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("service_app_package_name");
            java.lang.String stringExtra2 = intent.getStringExtra("service_app_openid");
            java.lang.String stringExtra3 = intent.getStringExtra("service_app_appid");
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = java.lang.Boolean.valueOf(this.f198996f != null);
            objArr[1] = stringExtra;
            objArr[2] = stringExtra3;
            objArr[3] = stringExtra2;
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.AppMsgComponent", "request send wx msg, wxmessage[%b], package[%s], appId[%s], openId[%s]", objArr);
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra3)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.AppMsgComponent", "REQUEST_CODE_SERVICE_APP openId is null");
                return;
            }
            if (this.f198996f == null || com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
                m0(com.tencent.mm.pluginsdk.model.app.w.h(stringExtra3));
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                com.tencent.mm.pluginsdk.model.app.u5.Ui().b(stringExtra3);
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.AppMsgComponent", "request send wx msg fail, openId is null, go get it");
            } else {
                if (this.f198996f.c(stringExtra, stringExtra2)) {
                    return;
                }
                ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
                m0(com.tencent.mm.pluginsdk.model.app.w.h(stringExtra3));
            }
        }
    }

    public final void m0(com.tencent.mm.pluginsdk.model.app.m mVar) {
        int i17;
        if (mVar == null || com.tencent.mm.sdk.platformtools.t8.K0(mVar.field_appId)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.AppMsgComponent", "jumpServiceH5 error args");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(mVar.f238381p1)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.AppMsgComponent", "ForwardUrl is null");
            return;
        }
        java.lang.String o17 = com.tencent.mm.sdk.platformtools.m2.o(this.f198580d.g().getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0), this.f198580d.g());
        if ("language_default".equalsIgnoreCase(o17) && java.util.Locale.getDefault() != null) {
            o17 = java.util.Locale.getDefault().toString();
        }
        if (com.tencent.mm.storage.z3.R4(this.f198580d.x())) {
            com.tencent.mm.storage.a3 z07 = ((com.tencent.mm.storage.b3) c01.d9.b().l()).z0(this.f198580d.x());
            if (z07 != null) {
                i17 = z07.A0().size();
                android.content.Intent intent = new android.content.Intent();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("jsapi_args_appid", mVar.field_appId);
                bundle.putBoolean("isFromService", true);
                intent.putExtra("forceHideShare", true);
                bundle.putString("sendAppMsgToUserName", this.f198580d.u().d1());
                intent.putExtra("jsapiargs", bundle);
                intent.putExtra("show_bottom", false);
                intent.putExtra("rawUrl", java.lang.String.format("%s&wxchatmembers=%s&lang=%s", mVar.f238381p1, java.lang.Integer.valueOf(i17), o17));
                j45.l.j(this.f198580d.g(), "webview", ".ui.tools.WebViewUI", intent, null);
            }
        }
        i17 = 1;
        android.content.Intent intent2 = new android.content.Intent();
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("jsapi_args_appid", mVar.field_appId);
        bundle2.putBoolean("isFromService", true);
        intent2.putExtra("forceHideShare", true);
        bundle2.putString("sendAppMsgToUserName", this.f198580d.u().d1());
        intent2.putExtra("jsapiargs", bundle2);
        intent2.putExtra("show_bottom", false);
        intent2.putExtra("rawUrl", java.lang.String.format("%s&wxchatmembers=%s&lang=%s", mVar.f238381p1, java.lang.Integer.valueOf(i17), o17));
        j45.l.j(this.f198580d.g(), "webview", ".ui.tools.WebViewUI", intent2, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:27|(2:28|29)|(7:31|32|(1:72)(1:36)|(5:59|60|(2:62|(2:65|66)(1:64))|69|67)|38|39|40)|74|32|(1:34)|72|(0)|38|39|40) */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0157 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n0(com.tencent.mm.storage.f9 r21, com.tencent.mm.pluginsdk.model.app.a5 r22) {
        /*
            Method dump skipped, instructions count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.f.n0(com.tencent.mm.storage.f9, com.tencent.mm.pluginsdk.model.app.a5):void");
    }

    public final void o0() {
        com.tencent.mm.ui.chatting.qe qeVar = this.f198996f;
        if (qeVar != null) {
            com.tencent.mm.ui.chatting.qe.f202628d.j(qeVar);
            ((java.util.HashSet) qeVar.f202631c).clear();
            com.tencent.mm.ui.chatting.qe.d(qeVar.f202629a.getContext(), null);
        }
        if (gm0.j1.a()) {
            com.tencent.mm.pluginsdk.model.app.u5.wi().remove(this.f198997g);
            com.tencent.mm.pluginsdk.model.app.u5.Di().remove(this.f198998h);
            ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).fj(this.f198999i);
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
        com.tencent.mm.ui.chatting.me.f201987a.clear();
        com.tencent.mm.ui.chatting.me.f201988b.clear();
        com.tencent.mm.ui.chatting.me.f201989c.clear();
    }
}
