package hr3;

/* loaded from: classes5.dex */
public final class pf extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f283888d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f283889e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f283890f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f283891g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f283892h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f283893i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f283894m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f283895n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f283896o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f283897p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f283898q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f283899r;

    static {
        new hr3.zd(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f283888d = jz5.h.b(new hr3.we(this));
        this.f283889e = jz5.h.b(new hr3.ue(this));
        this.f283890f = jz5.h.b(new hr3.ff(this));
        this.f283891g = jz5.h.b(new hr3.ee(this));
        this.f283892h = jz5.h.b(new hr3.gf(this));
        this.f283893i = jz5.h.b(new hr3.of(this));
        this.f283894m = jz5.h.b(new hr3.ve(this));
        this.f283895n = jz5.h.b(hr3.hf.f283616d);
        this.f283896o = jz5.h.b(new hr3.Cif(this));
        this.f283897p = jz5.h.b(new hr3.fe(this));
        this.f283899r = "";
    }

    public static final java.lang.String O6(hr3.pf pfVar) {
        pfVar.getClass();
        i21.q.h().getClass();
        com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
        com.tencent.mm.vfs.r6 h07 = lp0.b.h0("sayhi");
        if (!h07.m()) {
            h07.J();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(h07.n());
        sb6.append("/");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(java.lang.System.currentTimeMillis());
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "getSayHiPicTempPath(...)");
        return sb7;
    }

    public static final void P6(hr3.pf pfVar, int i17, int i18) {
        pfVar.getClass();
        com.tencent.mm.autogen.mmdata.rpt.SavedHelloMsgReportStruct savedHelloMsgReportStruct = new com.tencent.mm.autogen.mmdata.rpt.SavedHelloMsgReportStruct();
        savedHelloMsgReportStruct.f60155d = i17;
        savedHelloMsgReportStruct.f60156e = i18;
        savedHelloMsgReportStruct.k();
        savedHelloMsgReportStruct.o();
    }

    public final void Q6(yz5.l afterUpload) {
        kotlin.jvm.internal.o.g(afterUpload, "afterUpload");
        java.lang.String str = this.f283898q;
        int i17 = (str == null || r26.n0.N(str)) ? 1 : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.SayHiPictureUIC", "checkUploadPicture() called with: localPath = " + str + " isSayHiPictureOpen:" + W6());
        pm0.v.K(null, new hr3.ze(kz5.c1.l(new jz5.l("view_id", "friend_request_send_btn"), new jz5.l("add_username", getUsername()), new jz5.l("friend_request_id", (java.lang.String) ((jz5.n) this.f283895n).getValue()), new jz5.l("friend_request_has_img", java.lang.Integer.valueOf(i17 ^ 1)))));
        if (W6()) {
            if (!(str == null || r26.n0.N(str))) {
                kotlinx.coroutines.l.d(androidx.lifecycle.z.a(getActivity()), kotlinx.coroutines.q1.f310568a, null, new hr3.de(str, afterUpload, null), 2, null);
                return;
            }
        }
        afterUpload.invoke(null);
    }

    public final java.lang.String R6(java.lang.String str, yz5.a aVar) {
        if (!com.tencent.mm.vfs.w6.j(str)) {
            return null;
        }
        int a17 = com.tencent.mm.sdk.platformtools.l.a(str);
        java.lang.String str2 = (java.lang.String) aVar.invoke();
        if (!com.tencent.mm.sdk.platformtools.x.v(str, 1080, 1080, android.graphics.Bitmap.CompressFormat.JPEG, 80, str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SayHiPictureUIC", "createThumbNail big pic fail");
            return null;
        }
        if (a17 == 0 || com.tencent.mm.sdk.platformtools.x.y0(str2, a17, android.graphics.Bitmap.CompressFormat.JPEG, 80, str2)) {
            return str2;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.SayHiPictureUIC", "rotate big pic fail");
        return null;
    }

    public final com.tencent.mm.ui.base.MMLimitedClearEditTextWithPhoto S6() {
        return (com.tencent.mm.ui.base.MMLimitedClearEditTextWithPhoto) ((jz5.n) this.f283890f).getValue();
    }

    public final android.widget.TextView T6() {
        return (android.widget.TextView) ((jz5.n) this.f283896o).getValue();
    }

    public final boolean U6(r45.dz3 dz3Var) {
        if (dz3Var == null) {
            return false;
        }
        java.util.LinkedList linkedList = dz3Var.f372869e;
        r45.v60 v60Var = linkedList != null ? (r45.v60) kz5.n0.Z(linkedList) : null;
        if (v60Var == null) {
            return false;
        }
        java.lang.String str = v60Var.f387932d;
        if (str == null || r26.n0.N(str)) {
            return false;
        }
        java.lang.String str2 = v60Var.f387933e;
        return !(str2 == null || r26.n0.N(str2));
    }

    public final void V6(yz5.a onSpanClickCallback) {
        r45.dz3 dz3Var;
        android.widget.TextView textView;
        kotlin.jvm.internal.o.g(onSpanClickCallback, "onSpanClickCallback");
        java.lang.String v17 = gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_COMMON_SAY_HI_STRING_SYNC, "");
        kotlin.jvm.internal.o.d(v17);
        this.f283899r = v17;
        java.lang.String v18 = gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_COMMON_SAY_HI_IMG_INFO_STRING_SYNC, "");
        if (android.text.TextUtils.isEmpty(v18)) {
            dz3Var = null;
        } else {
            r45.dz3 dz3Var2 = new r45.dz3();
            try {
                dz3Var2.parseFrom(j34.d.a(v18, 0));
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SayHiPictureUIC", th6, "parseImgInfo() err", new java.lang.Object[0]);
            }
            dz3Var = dz3Var2;
        }
        boolean U6 = U6(dz3Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.SayHiPictureUIC", "initCommonSayHi() called commonSayHiContent:%s hasPic:%s", java.lang.Integer.valueOf(v17.length()), java.lang.Boolean.valueOf(U6));
        if ((!com.tencent.mm.sdk.platformtools.t8.K0(v17) || U6) && (textView = (android.widget.TextView) ((jz5.n) this.f283897p).getValue()) != null) {
            textView.setVisibility(0);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            java.lang.String string = getActivity().getString(com.tencent.mm.R.string.f492734ho0, v17);
            java.lang.String str = string != null ? string : "";
            float textSize = textView.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(activity, str, textSize));
            androidx.lifecycle.q a17 = androidx.lifecycle.z.a(getActivity());
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(a17, kotlinx.coroutines.internal.b0.f310484a, null, new hr3.le(U6, this, textView, v17, onSpanClickCallback, dz3Var, null), 2, null);
        }
    }

    public final boolean W6() {
        return ((java.lang.Boolean) ((jz5.n) this.f283894m).getValue()).booleanValue();
    }

    public final void X6(java.lang.String str) {
        if ((getActivity() instanceof com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI) || (getActivity() instanceof com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3)) {
            java.lang.String str2 = this.f283898q;
            pm0.v.K(null, new hr3.af(kz5.c1.l(new jz5.l("view_id", "friend_request_usual_set"), new jz5.l("add_username", getUsername()), new jz5.l("friend_request_id", (java.lang.String) ((jz5.n) this.f283895n).getValue()), new jz5.l("friend_request_has_img", java.lang.Integer.valueOf(((str2 == null || r26.n0.N(str2)) ? 1 : 0) ^ 1)))));
        }
        if (str == null) {
            str = "";
        }
        java.lang.String str3 = this.f283898q;
        Y6(str, str3 != null ? str3 : "");
    }

    public final void Y6(java.lang.String str, java.lang.String str2) {
        boolean z17 = !android.text.TextUtils.isEmpty(str2) && com.tencent.mm.vfs.w6.j(str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.SayHiPictureUIC", "setCommonSayHi() called with: commonSayHi = [" + str + "], pictureLocalPath = [" + str2 + "] hasPic:" + z17);
        if (T6() == null) {
            return;
        }
        T6().setVisibility(8);
        kotlinx.coroutines.l.d(getLifecycleScope(), kotlinx.coroutines.q1.f310568a, null, new hr3.ef(z17, str2, str, this, null), 2, null);
    }

    public final void Z6(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SayHiPictureUIC", "showWithLocalPath() called with: localPath = " + str);
        if (str == null || r26.n0.N(str)) {
            return;
        }
        kotlinx.coroutines.l.d(androidx.lifecycle.w.a(getLifecycle()), kotlinx.coroutines.q1.f310568a, null, new hr3.nf(str, this, null), 2, null);
    }

    public final java.lang.String getUsername() {
        return (java.lang.String) ((jz5.n) this.f283893i).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        jz5.g gVar = this.f283897p;
        switch (i17) {
            case 101:
                vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
                androidx.appcompat.app.AppCompatActivity activity = getActivity();
                java.lang.String a17 = g83.a.a();
                ((ub0.r) oVar).getClass();
                java.lang.String b17 = com.tencent.mm.pluginsdk.ui.tools.l7.b(activity, intent, a17);
                if (b17 == null) {
                    return;
                }
                Z6(R6(b17, new hr3.xe(this)));
                T6().setVisibility(0);
                android.widget.TextView textView = (android.widget.TextView) ((jz5.n) gVar).getValue();
                if (textView == null) {
                    return;
                }
                textView.setVisibility(8);
                return;
            case 102:
                java.util.List stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("CropImage_OutputPath_List") : null;
                if (stringArrayListExtra == null) {
                    stringArrayListExtra = kz5.p0.f313996d;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.SayHiPictureUIC", "onResult selectImgList:" + stringArrayListExtra);
                if (!stringArrayListExtra.isEmpty()) {
                    java.lang.Object obj = stringArrayListExtra.get(0);
                    kotlin.jvm.internal.o.f(obj, "get(...)");
                    Z6(R6((java.lang.String) obj, new hr3.ye(this)));
                    T6().setVisibility(0);
                    android.widget.TextView textView2 = (android.widget.TextView) ((jz5.n) gVar).getValue();
                    if (textView2 == null) {
                        return;
                    }
                    textView2.setVisibility(8);
                    return;
                }
                return;
            case 103:
                if (intent != null ? intent.getBooleanExtra("response_delete", false) : false) {
                    S6().setShowAddPhotoLayout(true);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        if (!(getActivity() instanceof com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI) && !(getActivity() instanceof com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3)) {
            if (getActivity() instanceof com.tencent.mm.plugin.profile.ui.SayHiPictureUI) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SayHiPictureUIC", "onCreate() called by SayHiPictureUI");
                S6().getAddPhotoLayout().setOnClickListener(new hr3.oe(this));
                S6().setShowAddPhotoLayoutChangeListener(new hr3.pe(this));
                T6().setOnClickListener(new hr3.qe(this));
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SayHiPictureUIC", "onCreate() called by SayHiWithSnsPermissionUI");
        if (!((java.lang.Boolean) ((jz5.n) this.f283888d).getValue()).booleanValue()) {
            pm0.v.K(null, new hr3.be(this));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SayHiPictureUIC", "onCreate() called isOpenIm:" + ((java.lang.Boolean) ((jz5.n) this.f283889e).getValue()).booleanValue());
        if (W6()) {
            S6().getAddPhotoLayout().setOnClickListener(new hr3.re(this));
            S6().setShowAddPhotoLayoutChangeListener(new hr3.se(this));
        } else {
            S6().g();
        }
        T6().setOnClickListener(new hr3.te(this));
    }
}
