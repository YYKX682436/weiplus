package qr4;

/* loaded from: classes9.dex */
public class g extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qr4.h f366131c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(qr4.h hVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f366131c = hVar;
    }

    @Override // np5.g
    public java.lang.CharSequence a(int i17) {
        return this.f338833a.getString(com.tencent.mm.R.string.kzs);
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        this.f338834b.d(new es4.j((at4.z0) objArr[0], (com.tencent.mm.plugin.wallet_core.model.Orders) this.f366131c.f213801c.getParcelable("key_orders")), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 || i18 != 0 || !(m1Var instanceof es4.j)) {
            return false;
        }
        es4.j jVar = (es4.j) m1Var;
        boolean z17 = jVar.isPaySuccess;
        qr4.h hVar = this.f366131c;
        if (z17) {
            hVar.f213801c.putParcelable("key_orders", jVar.f256425x);
        }
        hVar.o(this.f338833a, 0, hVar.f213801c);
        return true;
    }
}
