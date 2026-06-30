package fq5;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wedrop.ui.code.TransferFileUIC f265670d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.wedrop.ui.code.TransferFileUIC transferFileUIC) {
        super(0);
        this.f265670d = transferFileUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f265670d.getIntent().getIntExtra("key_enter_scene", 0));
    }
}
