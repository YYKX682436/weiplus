package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class IPCallShareCouponUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {
    public final q83.b A = new q83.b();
    public java.lang.String B = null;
    public java.lang.String C = null;
    public java.lang.String D = null;
    public java.util.LinkedList E = null;
    public final com.tencent.mm.sdk.event.IListener F = new com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI.AnonymousClass1(com.tencent.mm.app.a0.f53288d);
    public boolean G = false;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.RelativeLayout f142690d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f142691e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f142692f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.RelativeLayout f142693g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f142694h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f142695i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f142696m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f142697n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.LinearLayout f142698o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f142699p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.LinearLayout f142700q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f142701r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f142702s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f142703t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.ImageView f142704u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f142705v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f142706w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f142707x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.ipcall.ui.IPCallDynamicTextView f142708y;

    /* renamed from: z, reason: collision with root package name */
    public android.app.ProgressDialog f142709z;

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI$1, reason: invalid class name */
    /* loaded from: classes8.dex */
    public class AnonymousClass1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.IPCallNewXmlInfoChangeEvent> {
        public AnonymousClass1(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = 682820784;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.IPCallNewXmlInfoChangeEvent iPCallNewXmlInfoChangeEvent) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.ipcall.ui.r4(this));
            return true;
        }
    }

    public static void T6(com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI iPCallShareCouponUI) {
        iPCallShareCouponUI.A.f360752e++;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(257L, 2L, 1L, true);
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492339g42);
        try {
            string = string + "&version=" + o45.wf.f343029g + "&lang=" + com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a) + ("&uin=" + gm0.j1.b().h() + "&deviceName=" + java.net.URLEncoder.encode(o45.wf.f343026d, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding) + "&timeZone=" + java.net.URLEncoder.encode("" + com.tencent.mm.sdk.platformtools.t8.k0(), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding) + "&imei=" + java.net.URLEncoder.encode(wo.w0.g(true), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding) + "&deviceBrand=" + java.net.URLEncoder.encode(o45.wf.f343024b, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding) + "&deviceModel=" + java.net.URLEncoder.encode(o45.wf.f343025c, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding) + "&ostype=" + java.net.URLEncoder.encode(wo.q.f447784e, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding) + "&clientSeqID=" + java.net.URLEncoder.encode(gm0.m.e(), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding) + "&signature=" + java.net.URLEncoder.encode(com.tencent.mm.sdk.platformtools.t8.j0(com.tencent.mm.sdk.platformtools.x2.f193071a), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding) + "&scene=0");
        } catch (java.io.UnsupportedEncodingException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IPCallShareCouponUI", "[royle]UnsupportedEncodingException:%s", e17.getMessage());
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", string);
        intent.putExtra("showShare", false);
        j45.l.j(iPCallShareCouponUI, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public static void U6(com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI iPCallShareCouponUI) {
        iPCallShareCouponUI.A.f360753f++;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(257L, 3L, 1L, true);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", iPCallShareCouponUI.getString(com.tencent.mm.R.string.g3f));
        intent.putExtra("showShare", false);
        j45.l.j(iPCallShareCouponUI, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public void V6() {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.C)) {
            java.lang.String str = this.B;
            if (str == null) {
                com.tencent.mm.plugin.ipcall.ui.IPCallDynamicTextView iPCallDynamicTextView = this.f142708y;
                java.lang.String str2 = this.C;
                iPCallDynamicTextView.b(str2, str2);
            } else {
                this.f142708y.b(str, this.C);
            }
            this.B = this.C;
        }
        this.f142705v.getText();
        this.f142705v.setText(this.D);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.D)) {
            this.f142705v.setVisibility(8);
        } else {
            this.f142705v.setVisibility(0);
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("");
        java.util.LinkedList linkedList = this.E;
        if (linkedList != null && linkedList.size() > 0) {
            java.util.Iterator it = this.E.iterator();
            while (it.hasNext()) {
                r45.o57 o57Var = (r45.o57) it.next();
                if (o57Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(o57Var.f381966d)) {
                    stringBuffer.append(o57Var.f381966d);
                    stringBuffer.append('\n');
                }
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringBuffer.toString())) {
            this.f142706w.setText("");
            this.f142706w.setVisibility(8);
        } else {
            if (stringBuffer.charAt(stringBuffer.length() - 1) == '\n') {
                stringBuffer.deleteCharAt(stringBuffer.length() - 1);
            }
            this.f142706w.setText(stringBuffer.toString());
            this.f142706w.setVisibility(0);
        }
        if (this.f142705v.getVisibility() == 0 && this.f142706w.getVisibility() == 0) {
            android.view.View view = this.f142707x;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f142707x;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.blq;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e6  */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c01.d9.e().q(257, this);
        this.F.dead();
        q83.b bVar = this.A;
        bVar.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        bVar.f360750c = java.lang.System.currentTimeMillis();
        bVar.b();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (r83.b.f393311b == null) {
            r83.b.f393311b = new r83.b();
        }
        r83.b.f393311b.a(false);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof p83.g) {
            if (i17 != 0 || i18 != 0) {
                android.app.ProgressDialog progressDialog = this.f142709z;
                if (progressDialog == null || !progressDialog.isShowing()) {
                    return;
                }
                this.f142709z.dismiss();
                db5.e1.t(getContext(), getString(com.tencent.mm.R.string.g3x), getString(com.tencent.mm.R.string.g3s), new com.tencent.mm.plugin.ipcall.ui.y4(this));
                return;
            }
            r45.zr3 zr3Var = ((p83.g) m1Var).f352748e;
            java.lang.String str2 = zr3Var.f392317d;
            this.C = zr3Var.f392323m;
            this.D = zr3Var.f392324n;
            this.E = zr3Var.f392333w;
            V6();
            android.app.ProgressDialog progressDialog2 = this.f142709z;
            if (progressDialog2 == null || !progressDialog2.isShowing()) {
                return;
            }
            this.f142709z.dismiss();
        }
    }
}
