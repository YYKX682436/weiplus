package rk4;

/* loaded from: classes.dex */
public final class q2 implements com.tencent.mm.ui.da {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f396925a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.ting.TingSelectContactsConfig f396926d;

    public q2(yz5.l lVar, com.tencent.pigeon.ting.TingSelectContactsConfig tingSelectContactsConfig) {
        this.f396925a = lVar;
        this.f396926d = tingSelectContactsConfig;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        android.os.Bundle extras;
        java.lang.String string = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.getString("Select_Conv_User");
        yz5.l lVar = this.f396925a;
        if (i18 == -1) {
            if (!(string == null || string.length() == 0)) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(r26.n0.f0(string, new java.lang.String[]{","}, false, 0, 6, null))));
                return;
            }
        }
        java.lang.Object obj = kz5.p0.f313996d;
        if (i18 != 0) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(obj)));
            return;
        }
        kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
        java.util.List<java.lang.String> presetUsername = this.f396926d.getPresetUsername();
        if (presetUsername != null) {
            obj = kz5.n0.V(presetUsername);
        }
        lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(obj)));
    }
}
