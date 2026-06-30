package l0;

/* loaded from: classes16.dex */
public final class m5 implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f314383a;

    public m5(yz5.l lVar) {
        this.f314383a = lVar;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        android.os.Bundle extras;
        java.lang.String string = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.getString("Select_Conv_User");
        yz5.l lVar = this.f314383a;
        if (i17 == -1) {
            if (!(string == null || string.length() == 0)) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(r26.n0.f0(string, new java.lang.String[]{","}, false, 0, 6, null))));
                return;
            }
        }
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kz5.p0.f313996d)));
    }
}
