package dk2;

/* loaded from: classes3.dex */
public final class m8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f233766d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8(yz5.p pVar) {
        super(0);
        this.f233766d = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("Finder.LiveJumpChecker", "checkTingChatRoom conflict with ting chat room");
        this.f233766d.invoke(java.lang.Boolean.FALSE, "ting_chat_room");
        return jz5.f0.f302826a;
    }
}
