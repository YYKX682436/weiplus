package qr4;

/* loaded from: classes9.dex */
public class b extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qr4.h f366126c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(qr4.h hVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f366126c = hVar;
    }

    @Override // np5.g
    public boolean c(java.lang.Object... objArr) {
        qr4.h hVar = this.f366126c;
        hVar.f213801c.putParcelable("key_history_bankcard", vr4.f1.wi().Ai().f13998g);
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = (com.tencent.mm.pluginsdk.wallet.PayInfo) hVar.f213801c.get("key_pay_info");
        this.f338834b.a(new ss4.b0(payInfo == null ? null : payInfo.f192114m, 4), true);
        return false;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        qr4.h hVar = this.f366126c;
        hVar.o(this.f338833a, 0, hVar.f213801c);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }
}
