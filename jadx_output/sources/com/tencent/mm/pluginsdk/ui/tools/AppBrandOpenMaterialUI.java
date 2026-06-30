package com.tencent.mm.pluginsdk.ui.tools;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/pluginsdk/ui/tools/AppBrandOpenMaterialUI;", "Lcom/tencent/mm/pluginsdk/ui/AutoLoginActivity;", "<init>", "()V", "ui-appchooser_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class AppBrandOpenMaterialUI extends com.tencent.mm.pluginsdk.ui.AutoLoginActivity {
    /* JADX WARN: Removed duplicated region for block: B:21:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void X6(com.tencent.mm.pluginsdk.ui.p r13, android.content.Intent r14) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.ui.tools.AppBrandOpenMaterialUI.X6(com.tencent.mm.pluginsdk.ui.p, android.content.Intent):void");
    }

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity
    public boolean Y6(android.content.Intent intent) {
        return true;
    }

    public final boolean a7(java.lang.String str) {
        boolean z17;
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FLOAT_BALL_FILES_QB_VERIFY_STRING_SYNC, null);
        java.lang.String str2 = m17 instanceof java.lang.String ? (java.lang.String) m17 : null;
        if (str2 == null || str2.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandOpenMaterialUI", "verifyCaller, originVerifyKeys is empty");
            return false;
        }
        java.util.List f07 = r26.n0.f0(str2, new java.lang.String[]{","}, false, 0, 6, null);
        if (!f07.isEmpty()) {
            java.util.Iterator it = f07.iterator();
            while (it.hasNext()) {
                if (com.tencent.mm.sdk.platformtools.t8.D0((java.lang.String) it.next(), str)) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        if (z17) {
            return true;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandOpenMaterialUI", "verifyCaller, verify fail, verifyKey: " + str + ", originVerifyKeys: " + str2);
        return false;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public void initActivityCloseAnimation() {
        overridePendingTransition(0, 0);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public void initActivityOpenAnimation(android.content.Intent intent) {
        overridePendingTransition(0, 0);
    }

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        setTheme(com.tencent.mm.R.style.f494400m2);
        super.onCreate(bundle);
        com.tencent.mm.ui.bk.k0(getWindow());
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
    }
}
