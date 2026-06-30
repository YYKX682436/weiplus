package rk4;

/* loaded from: classes10.dex */
public final class l1 implements r35.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f396812a;

    public l1(yz5.l lVar) {
        this.f396812a = lVar;
    }

    @Override // r35.n3
    public final void a(int i17) {
        try {
            rk4.k5.e("showAddContactDialog, res:" + i17, "FlutterTingInteractPlugin");
            yz5.l lVar = this.f396812a;
            if (i17 == 1) {
                rk4.k5.e("add OK, result send success", "FlutterTingInteractPlugin");
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE)));
            } else {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE)));
            }
        } catch (java.lang.Exception e17) {
            rk4.k5.d("showAddContactDialog, tingResult send exception e:" + e17.getMessage(), "FlutterTingInteractPlugin");
        }
    }
}
