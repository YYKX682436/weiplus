package sr2;

/* loaded from: classes5.dex */
public final class l4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.post.PostMainUIC f411623d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC) {
        super(0);
        this.f411623d = postMainUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f411623d.getIntent().getStringExtra("key_jump_id");
        return stringExtra != null ? r26.i0.t(stringExtra, ",", ";", false) : "";
    }
}
