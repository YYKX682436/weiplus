package ox;

@j95.b
/* loaded from: classes7.dex */
public final class g extends i95.w implements tk.o {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.o4 f349471d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f349472e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f349473f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f349474g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f349475h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.w4 f349476i;

    public g() {
        com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
        this.f349471d = L;
        this.f349472e = L.getBoolean("meStrategySwitch", false);
        this.f349473f = L.getBoolean("meStrategyOpenWithoutAcct", false);
        this.f349474g = L.getBoolean("canRegisterPhotoAccount", false);
        this.f349475h = kz5.p0.f313996d;
        com.tencent.wechat.mm.biz.w4 w4Var = new com.tencent.wechat.mm.biz.w4();
        w4Var.f218757d = L.getBoolean("bizOriginPublishSwitch", false);
        w4Var.f218758e = L.getInt("bizOriginPublishSizeLimit", 0);
        this.f349476i = w4Var;
    }

    public boolean Ai() {
        boolean z17 = hj("support_photo_acct_new_logo", 0) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPublishApiFeatureService", "canBizPhotoNewLogoFromNativeMMKV: " + z17);
        return z17;
    }

    public boolean Bi() {
        boolean c17 = com.tencent.wechat.iam.biz.t1.f217792c.c();
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPublishApiFeatureService", "canCreateBizPhoto: " + c17);
        return c17;
    }

    public boolean Di() {
        boolean z17 = hj("support_oper_photo_acct", 0) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPublishApiFeatureService", "canCreateBizPhotoFromNativeMMKV: " + z17);
        return z17;
    }

    public boolean Ni() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPublishApiFeatureService", "enableCanRegisterPhotoAccount, canRegisterPhotoAccount=" + this.f349474g + '}');
        return this.f349474g;
    }

    public boolean Ri() {
        return com.tencent.wechat.iam.biz.t1.f217792c.d();
    }

    public boolean Ui() {
        boolean z17 = (hj("support_view_photo_acct", 0) == 1) || Di();
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPublishApiFeatureService", "canViewBizPhotoFromNativeMMKV: " + z17);
        return z17;
    }

    public java.lang.String Vi() {
        return Ui() ? "1" : "0";
    }

    public void Zi(android.content.Context context, tk.p publishCallback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(publishCallback, "publishCallback");
        com.tencent.wechat.mm.biz.b bVar = ((r01.l1) i95.n0.c(r01.l1.class)).f368147i.f368154b;
        com.tencent.wechat.mm.biz.b bVar2 = ((r01.l1) i95.n0.c(r01.l1.class)).f368148m.f368154b;
        if (bVar != null && bVar2 != null) {
            publishCallback.a(true, "", null);
            return;
        }
        r01.l1 l1Var = (r01.l1) i95.n0.c(r01.l1.class);
        ox.a aVar = new ox.a(publishCallback, this, context);
        l1Var.getClass();
        kotlinx.coroutines.l.d(l1Var.f368143e, null, null, new r01.u0(l1Var, aVar, null), 3, null);
    }

    public boolean aj() {
        com.tencent.wechat.mm.biz.b bVar = ((r01.l1) i95.n0.c(r01.l1.class)).f368147i.f368154b;
        boolean z17 = (bVar == null || com.tencent.mm.sdk.platformtools.t8.K0(bVar.f217889e) || !bVar.f217894m) ? false : true;
        boolean isTeenMode = ((vh4.f) ((bx1.q) i95.n0.c(bx1.q.class))).isTeenMode();
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPublishApiFeatureService", "checkShowBiz, showBiz=" + z17 + ", teenMode=" + isTeenMode + ", meStrategySwitch=" + this.f349472e);
        return z17 && !isTeenMode && this.f349472e;
    }

    public java.lang.String bj(java.lang.String srcPath, java.lang.String dstPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(dstPath, "dstPath");
        android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(srcPath);
        java.lang.String str = n07 != null ? n07.outMimeType : null;
        boolean z17 = false;
        if (str != null && (r26.i0.n(str, "jpeg", false) || r26.i0.n(str, "jpg", false) || r26.i0.n(str, "bmp", false) || r26.i0.n(str, "png", false) || r26.i0.n(str, "gif", false))) {
            z17 = true;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizPublishApiFeatureService", "clearExif: skip, mime=" + str + " path=" + srcPath);
            com.tencent.mm.vfs.w6.c(srcPath, dstPath);
            return dstPath;
        }
        int wi6 = ((ub0.p) ((ub0.o) i95.n0.c(ub0.o.class))).wi(srcPath, dstPath);
        ub0.n[] nVarArr = ub0.n.f426002d;
        if (wi6 != 0) {
            ub0.n[] nVarArr2 = ub0.n.f426002d;
            if (wi6 == -4) {
                com.tencent.mm.vfs.w6.c(srcPath, dstPath);
            } else {
                try {
                    com.tencent.mm.sdk.platformtools.t8.c(dstPath);
                } catch (java.lang.Throwable unused) {
                    com.tencent.mm.vfs.w6.c(srcPath, dstPath);
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPublishApiFeatureService", "clearExif: path=" + srcPath + ", returnPath=" + dstPath + " exit: " + com.tencent.mm.vfs.w6.j(dstPath) + " clearResult: " + wi6);
        return dstPath;
    }

    public final l81.b1 cj(l81.b1 b1Var) {
        b1Var.f317014b = "wx0b2ec076ec39c786";
        java.lang.String enterPath = b1Var.f317022f;
        kotlin.jvm.internal.o.f(enterPath, "enterPath");
        if (!r26.i0.y(enterPath, "pages/creator-center/creator-center.html", false)) {
            k91.y3 y3Var = k91.y3.POPUP;
            b1Var.S = y3Var;
            b1Var.T = y3Var;
        }
        b1Var.f317018d = 447;
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPublishApiFeatureService", "EDITOR_WE_APP_VERSION: 447");
        return b1Var;
    }

    public boolean fj() {
        boolean z17;
        if (!((vh4.f) ((bx1.q) i95.n0.c(bx1.q.class))).isTeenMode()) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Gc).getValue()).r()).booleanValue()) {
                z17 = true;
                com.tencent.mars.xlog.Log.i("MicroMsg.BizPublishApiFeatureService", "getCanOpen: " + z17);
                return z17;
            }
        }
        z17 = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPublishApiFeatureService", "getCanOpen: " + z17);
        return z17;
    }

    public final int hj(java.lang.String itemKey, int i17) {
        kotlin.jvm.internal.o.g(itemKey, "itemKey");
        return this.f349471d.o("clientExpItemValue_".concat(itemKey), i17);
    }

    public java.lang.String ij(tk.w mpPublishActionStr) {
        kotlin.jvm.internal.o.g(mpPublishActionStr, "mpPublishActionStr");
        java.lang.String str = ((r01.l1) i95.n0.c(r01.l1.class)).f368147i.f368153a;
        int ordinal = mpPublishActionStr.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return "pages/image_editor/image_editor.html";
        }
        if (ordinal == 2) {
            return "pages/appmsg_editor/appmsg_editor.html?biz=" + android.net.Uri.encode(str);
        }
        if (ordinal == 3) {
            return "pages/register/register.html";
        }
        if (ordinal == 4) {
            return "";
        }
        throw new jz5.j();
    }

    public boolean mj() {
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        boolean b17 = com.tencent.mm.plugin.finder.assist.s7.f102538a.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPublishApiFeatureService", "getFinderOpen: " + b17);
        return b17;
    }

    public boolean nj() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPublishApiFeatureService", "getMeTabOpenWithoutAcctSwitch, meStrategyOpenWithoutAcct=" + this.f349473f + ", finderOpen=" + mj());
        return this.f349473f && mj();
    }

    public com.tencent.wechat.mm.biz.w4 oj() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getOriginalPictureStrategy originalPictureStrategy: ");
        com.tencent.wechat.mm.biz.w4 w4Var = this.f349476i;
        sb6.append(w4Var != null ? java.lang.Boolean.valueOf(w4Var.f218757d) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPublishApiFeatureService", sb6.toString());
        return this.f349476i;
    }

    public java.lang.String pj(java.lang.String mediaId, java.lang.String originPath) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(originPath, "originPath");
        zw.a aVar = zw.a.f476485a;
        return aVar.b(aVar.c(mediaId + '_' + originPath.hashCode()), originPath);
    }

    public boolean qj() {
        boolean z17;
        java.lang.String str;
        com.tencent.wechat.mm.biz.b bVar = ((r01.l1) i95.n0.c(r01.l1.class)).f368147i.f368154b;
        if (bVar != null && (str = bVar.f217889e) != null) {
            if (str.length() > 0) {
                z17 = true;
                return !z17 && bVar.f217894m;
            }
        }
        z17 = false;
        if (z17) {
        }
    }

    public void rj(boolean z17, android.content.Context context, l81.b1 weAppOpenBundle, tk.p publishCallback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(weAppOpenBundle, "weAppOpenBundle");
        kotlin.jvm.internal.o.g(publishCallback, "publishCallback");
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPublishApiFeatureService", "jumpMediaTabPicker, useDraft: " + z17);
        if (z17) {
            sj(context, weAppOpenBundle, publishCallback);
        } else {
            zw.o.f476536a.a(context, 45, 20, true, true, 1, new ox.c(publishCallback, this, weAppOpenBundle, context), false);
        }
    }

    public void sj(android.content.Context context, l81.b1 weAppOpenBundle, tk.p publishCallback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(weAppOpenBundle, "weAppOpenBundle");
        kotlin.jvm.internal.o.g(publishCallback, "publishCallback");
        cj(weAppOpenBundle);
        i95.m c17 = i95.n0.c(tk.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        if (tk.r.Wf((tk.r) c17, context, weAppOpenBundle, null, 4, null)) {
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.s9.f192975c && !z65.c.a()) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            com.tencent.mars.xlog.Log.i("MicroMsg.BizPublishApiFeatureService", "openPublishMiniProgram");
            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(context, weAppOpenBundle);
            publishCallback.a(true, "", null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPublishApiFeatureService", "openPublishMiniProgram debug env");
        rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
        ox.d dVar = new ox.d(weAppOpenBundle, context, publishCallback);
        ((ox.r) d0Var).getClass();
        ((r01.l1) i95.n0.c(r01.l1.class)).Ui(dVar);
    }

    public void tj(android.content.Context context, java.lang.String url) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPublishApiFeatureService", "openWebPage");
        if (url.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizPublishApiFeatureService", "openWebPage: url isEmpty");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", url);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public final void uj(java.lang.String itemKey, java.lang.Integer num) {
        kotlin.jvm.internal.o.g(itemKey, "itemKey");
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPublishApiFeatureService", "putClientExpItemValue: " + itemKey + ", " + num);
        java.lang.String concat = "clientExpItemValue_".concat(itemKey);
        com.tencent.mm.sdk.platformtools.o4 o4Var = this.f349471d;
        if (num == null) {
            o4Var.W(concat);
        } else {
            o4Var.A(concat, num.intValue());
        }
    }

    public boolean vj() {
        boolean Bi = Bi();
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_biz_metab_full_rollout_android, false)) {
            return Bi;
        }
        return Bi || ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).vk() || qj();
    }

    public boolean wi() {
        return com.tencent.wechat.iam.biz.t1.f217792c.b();
    }

    public boolean wj() {
        boolean z17 = hj("metab_interactive", 0) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPublishApiFeatureService", "worksEntryRedDotEnabled: " + z17);
        return z17;
    }
}
