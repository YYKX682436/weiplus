package w30;

/* loaded from: classes11.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.UpdateChatRoomSpamStatusEvent f442662d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.autogen.events.UpdateChatRoomSpamStatusEvent updateChatRoomSpamStatusEvent) {
        super(0);
        this.f442662d = updateChatRoomSpamStatusEvent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.autogen.events.UpdateChatRoomSpamStatusEvent updateChatRoomSpamStatusEvent = this.f442662d;
        if ((updateChatRoomSpamStatusEvent.f54913g.f7949b & 1) != 1) {
            e01.f o17 = c01.d9.b().o();
            am.sz szVar = updateChatRoomSpamStatusEvent.f54913g;
            java.lang.String str = szVar.f7948a;
            if (str == null) {
                str = "";
            }
            if (kotlin.jvm.internal.o.b(o17.c(str, "showtype"), "2")) {
                e01.f o18 = c01.d9.b().o();
                java.lang.String str2 = szVar.f7948a;
                o18.b(str2 != null ? str2 : "");
            }
        }
        return jz5.f0.f302826a;
    }
}
