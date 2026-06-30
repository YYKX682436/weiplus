package com.tencent.mm.plugin.luckymoney.ui;

@db5.a(7)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneySpareActivityEight;", "Lcom/tencent/mm/ui/vas/VASActivity;", "<init>", "()V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class LuckyMoneySpareActivityEight extends com.tencent.mm.ui.vas.VASActivity {
    public static void W6(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneySpareActivityEight luckyMoneySpareActivityEight, java.lang.String str, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = "";
        }
        if (luckyMoneySpareActivityEight.isFinishing()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneySpareActivityEight", "[showAlert] this.isFinishing");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = luckyMoneySpareActivityEight.getContext().getString(com.tencent.mm.R.string.g39);
        }
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(luckyMoneySpareActivityEight.getContext());
        u1Var.a(false);
        u1Var.g(str);
        u1Var.l(new com.tencent.mm.plugin.luckymoney.ui.fp(luckyMoneySpareActivityEight, str));
        u1Var.n(luckyMoneySpareActivityEight.getContext().getString(com.tencent.mm.R.string.f490454vi));
        u1Var.q(false);
    }

    public final void U6(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneySpareActivityEight", "[doFinish] " + str);
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0336  */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43, types: [android.util.ArrayMap] */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r9v18, types: [android.app.Activity] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V6(java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 1134
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneySpareActivityEight.V6(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneySpareActivityEight", "[onBackPressed] finish " + this);
        super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        androidx.appcompat.app.b supportActionBar;
        super.onCreate(bundle);
        setTheme(com.tencent.mm.R.style.f494400m2);
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        getWindow().getDecorView().setSystemUiVisibility(1792);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        if (getSupportActionBar() != null && (supportActionBar = getSupportActionBar()) != null) {
            supportActionBar.o();
        }
        android.content.Intent intent = getIntent();
        android.net.Uri data = intent != null ? intent.getData() : null;
        if (data == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneySpareActivityEight", "[onCreate] callbackUri == null");
            W6(this, null, 1, null);
            return;
        }
        try {
            java.lang.String queryParameter = data.getQueryParameter("token");
            java.lang.String str = "";
            if (queryParameter == null) {
                queryParameter = "";
            }
            java.lang.String queryParameter2 = data.getQueryParameter("image_url");
            if (queryParameter2 == null) {
                queryParameter2 = "";
            }
            try {
                android.content.ComponentName componentName = getComponentName();
                if (componentName != null) {
                    android.content.pm.ActivityInfo activityInfo = getPackageManager().getActivityInfo(componentName, 0);
                    kotlin.jvm.internal.o.f(activityInfo, "getActivityInfo(...)");
                    java.lang.String str2 = activityInfo.taskAffinity;
                    if (str2 != null) {
                        str = str2;
                    }
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneySpareActivityEight", "[onCreate] " + this + "，taskAffinity: " + str + "、tokenData: " + queryParameter + "、imageUrl: " + queryParameter2);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(queryParameter) && !com.tencent.mm.sdk.platformtools.t8.K0(queryParameter2)) {
                java.lang.String decode = java.net.URLDecoder.decode(queryParameter2, com.tencent.mapsdk.internal.rv.f51270c);
                kotlin.jvm.internal.o.f(decode, "decode(...)");
                r45.qg7 b17 = hc3.c.f280356a.b(queryParameter);
                if (b17 != null) {
                    V6(b17.f383977d, decode, b17.f383981h, b17.f383982i);
                    return;
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneySpareActivityEight", "[onCreate] cacheData is InValid");
                    W6(this, null, 1, null);
                    return;
                }
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneySpareActivityEight", "[onCreate] tokenData.isEmpty() || imageUrl.isEmpty()");
            W6(this, null, 1, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneySpareActivityEight", "[onCreate] try-catch :%s", e17.toString());
            W6(this, null, 1, null);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneySpareActivityEight", "[onDestroy] " + this);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneySpareActivityEight", "[onPause] " + this);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneySpareActivityEight", "[onResume] " + this);
    }
}
