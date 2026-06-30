package un;

/* loaded from: classes11.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.p f429308d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(un.p pVar) {
        super(0);
        this.f429308d = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.autogen.mmdata.rpt.ChatSpecialAttentionLogStruct chatSpecialAttentionLogStruct = new com.tencent.mm.autogen.mmdata.rpt.ChatSpecialAttentionLogStruct();
        chatSpecialAttentionLogStruct.f55663d = 1;
        chatSpecialAttentionLogStruct.f55664e = chatSpecialAttentionLogStruct.b("roomUsername", this.f429308d.d7(), true);
        chatSpecialAttentionLogStruct.k();
        return java.lang.Boolean.TRUE;
    }
}
