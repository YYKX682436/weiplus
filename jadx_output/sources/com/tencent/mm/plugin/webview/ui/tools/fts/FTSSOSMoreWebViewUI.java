package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class FTSSOSMoreWebViewUI extends com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI {
    public int Z4;

    /* renamed from: a5, reason: collision with root package name */
    public android.view.View f184320a5;

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI, tj5.n
    public boolean G0() {
        this.J4.f();
        android.view.View view = this.f184320a5;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSMoreWebViewUI", "onSearchKeyDown", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSMoreWebViewUI", "onSearchKeyDown", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        va(true);
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int S6() {
        if (!fp.h.c(23)) {
            return getActionbarColor();
        }
        u75.d.g();
        return getResources().getColor(com.tencent.mm.R.color.aaw);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI, tj5.n
    public void U1(boolean z17) {
        super.U1(z17);
        if (!z17) {
            android.view.View view = this.F4;
            view.setPadding(this.Z4, 0, view.getPaddingRight(), 0);
            this.J4.g();
        }
        this.J4.f();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cv9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b7, code lost:
    
        r3 = r5.optString("hotword");
     */
    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String ia() {
        /*
            r7 = this;
            int r0 = r7.f184244a4
            r1 = 2
            r2 = 8
            if (r0 != r2) goto Lf
            boolean r3 = r7.S3
            if (r3 == 0) goto Lf
            r0 = 2131768623(0x7f10352f, float:1.9168498E38)
            goto L57
        Lf:
            r3 = 1
            if (r0 == r3) goto L54
            if (r0 == r1) goto L50
            if (r0 == r2) goto L4c
            r2 = 16
            if (r0 == r2) goto L48
            r2 = 64
            if (r0 == r2) goto L44
            r2 = 128(0x80, float:1.8E-43)
            if (r0 == r2) goto L40
            r2 = 256(0x100, float:3.59E-43)
            if (r0 == r2) goto L3c
            r2 = 384(0x180, float:5.38E-43)
            if (r0 == r2) goto L3c
            r2 = 512(0x200, float:7.17E-43)
            if (r0 == r2) goto L38
            r2 = 1024(0x400, float:1.435E-42)
            if (r0 == r2) goto L34
            r0 = -1
            goto L57
        L34:
            r0 = 2131768619(0x7f10352b, float:1.916849E38)
            goto L57
        L38:
            r0 = 2131768618(0x7f10352a, float:1.9168487E38)
            goto L57
        L3c:
            r0 = 2131768607(0x7f10351f, float:1.9168465E38)
            goto L57
        L40:
            r0 = 2131768608(0x7f103520, float:1.9168467E38)
            goto L57
        L44:
            r0 = 2131755635(0x7f100273, float:1.9142155E38)
            goto L57
        L48:
            r0 = 2131768620(0x7f10352c, float:1.9168492E38)
            goto L57
        L4c:
            r0 = 2131768622(0x7f10352e, float:1.9168496E38)
            goto L57
        L50:
            r0 = 2131774955(0x7f104deb, float:1.918134E38)
            goto L57
        L54:
            r0 = 2131774956(0x7f104dec, float:1.9181342E38)
        L57:
            if (r0 >= 0) goto Lc9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.Context r2 = com.tencent.mm.sdk.platformtools.x2.f193071a
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131756275(0x7f1004f3, float:1.9143453E38)
            java.lang.String r2 = r2.getString(r3)
            r0.append(r2)
            int r2 = r7.f184244a4
            java.lang.String r3 = ""
            android.os.Bundle r4 = new android.os.Bundle     // Catch: java.lang.Exception -> Lc1
            r4.<init>()     // Catch: java.lang.Exception -> Lc1
            java.lang.String r5 = "key"
            java.lang.String r6 = "educationTab"
            r4.putString(r5, r6)     // Catch: java.lang.Exception -> Lc1
            com.tencent.mm.plugin.webview.stub.v0 r5 = r7.K1     // Catch: java.lang.Exception -> Lc1
            android.os.Bundle r1 = r5.tb(r1, r4)     // Catch: java.lang.Exception -> Lc1
            java.lang.String r4 = "result"
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Exception -> Lc1
            java.lang.String r5 = "result_1"
            java.lang.String r1 = r1.getString(r5)     // Catch: java.lang.Exception -> Lc1
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lc1
            if (r1 != 0) goto L97
            goto L98
        L97:
            r4 = r1
        L98:
            r5.<init>(r4)     // Catch: java.lang.Exception -> Lc1
            java.lang.String r1 = "items"
            org.json.JSONArray r1 = r5.optJSONArray(r1)     // Catch: java.lang.Exception -> Lc1
            if (r1 != 0) goto La4
            goto Lc1
        La4:
            r4 = 0
        La5:
            int r5 = r1.length()     // Catch: java.lang.Exception -> Lc1
            if (r4 >= r5) goto Lc1
            org.json.JSONObject r5 = r1.optJSONObject(r4)     // Catch: java.lang.Exception -> Lc1
            java.lang.String r6 = "businessType"
            int r6 = r5.optInt(r6)     // Catch: java.lang.Exception -> Lc1
            if (r6 != r2) goto Lbe
            java.lang.String r1 = "hotword"
            java.lang.String r3 = r5.optString(r1)     // Catch: java.lang.Exception -> Lc1
            goto Lc1
        Lbe:
            int r4 = r4 + 1
            goto La5
        Lc1:
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            return r0
        Lc9:
            android.content.Context r1 = com.tencent.mm.sdk.platformtools.x2.f193071a
            android.content.res.Resources r1 = r1.getResources()
            android.content.Context r2 = com.tencent.mm.sdk.platformtools.x2.f193071a
            android.content.res.Resources r2 = r2.getResources()
            java.lang.String r0 = r2.getString(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r2 = 2131774954(0x7f104dea, float:1.9181338E38)
            java.lang.String r0 = r1.getString(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSMoreWebViewUI.ia():java.lang.String");
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI
    public void oa() {
        finish();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f184320a5 = findViewById(com.tencent.mm.R.id.pil);
        com.tencent.mm.plugin.websearch.widget.SOSEditTextView sOSEditTextView = this.J4;
        sOSEditTextView.getEditText().setOnFocusChangeListener(sOSEditTextView.H);
        this.J4.f();
        this.J4.g();
        this.Z4 = i65.a.b(this, 48);
        if (this.Y3 == 24) {
            android.view.View view = this.f184320a5;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSMoreWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSMoreWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        findViewById(com.tencent.mm.R.id.m7g).setOnTouchListener(new com.tencent.mm.plugin.webview.ui.tools.fts.p2(this));
        if (getIntent() != null && getIntent().getBooleanExtra("ftsneedkeyboard", false)) {
            getContentView().postDelayed(new com.tencent.mm.plugin.webview.ui.tools.fts.q2(this), 128L);
        }
        Q8(getResources().getColor(com.tencent.mm.R.color.aaw), !com.tencent.mm.ui.bk.C());
        android.widget.ImageButton clearBtn = this.J4.getClearBtn();
        if (clearBtn != null) {
            clearBtn.getDrawable().setColorFilter(-16777216, android.graphics.PorterDuff.Mode.SRC_ATOP);
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI
    public void sa() {
        super.sa();
        android.view.View view = this.f184320a5;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSMoreWebViewUI", "onWebViewPageLoaded", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSMoreWebViewUI", "onWebViewPageLoaded", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
