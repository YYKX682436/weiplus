package vm1;

/* loaded from: classes.dex */
public final class y implements r35.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f438078a;

    public y(yz5.l lVar) {
        this.f438078a = lVar;
    }

    @Override // r35.n3
    public final void a(int i17) {
        try {
            com.tencent.mars.xlog.Log.i("FlutterBizAudioInteractPlugin", "showAddContactDialog, res:" + i17);
            yz5.l lVar = this.f438078a;
            if (i17 == 1) {
                com.tencent.mars.xlog.Log.i("FlutterBizAudioInteractPlugin", "add OK, result send success");
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE)));
            } else {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE)));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FlutterBizAudioInteractPlugin", "showAddContactDialog, tingResult send exception e:" + e17.getMessage());
        }
    }
}
