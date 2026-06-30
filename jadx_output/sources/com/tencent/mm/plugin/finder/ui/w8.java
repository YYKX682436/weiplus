package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class w8 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v65.n f129980d;

    public w8(v65.n nVar) {
        this.f129980d = nVar;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelperUI", "[checkRealName] requestCode:" + i17 + ", resultCode:" + i18);
        if (i17 == 40001) {
            v65.n nVar = this.f129980d;
            if (i18 == -1) {
                java.lang.String stringExtra = intent != null ? intent.getStringExtra("intent_auth_token") : null;
                com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelperUI", "checkPwdToken:" + stringExtra);
                nVar.a(stringExtra);
            }
            nVar.a("");
        }
    }
}
