package qz2;

/* loaded from: classes8.dex */
public final class k1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fingerprint.ui.WalletOpenTouchPayApi31UI f367884d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(com.tencent.mm.plugin.fingerprint.ui.WalletOpenTouchPayApi31UI walletOpenTouchPayApi31UI) {
        super(0);
        this.f367884d = walletOpenTouchPayApi31UI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f367884d.getIntent().getIntExtra("key_enter_scene", 0));
    }
}
