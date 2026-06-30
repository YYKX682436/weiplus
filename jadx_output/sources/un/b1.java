package un;

/* loaded from: classes9.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f429238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ un.g1 f429239e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(androidx.appcompat.app.AppCompatActivity appCompatActivity, un.g1 g1Var) {
        super(0);
        this.f429238d = appCompatActivity;
        this.f429239e = g1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f429238d;
        final un.g1 g1Var = this.f429239e;
        return new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RecordMsgNetSceneEvent>(appCompatActivity) { // from class: com.tencent.mm.chatroom.ui.uic.SelectWxChatRoomAddMemberUIC$recordMsgNetSceneEventIListener$2$1
            {
                this.__eventId = 1734631819;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.RecordMsgNetSceneEvent recordMsgNetSceneEvent) {
                com.tencent.mm.autogen.events.RecordMsgNetSceneEvent event = recordMsgNetSceneEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.dq dqVar = event.f54662g;
                long j17 = dqVar.f6488a;
                if (j17 != 0) {
                    java.lang.Long valueOf = java.lang.Long.valueOf(j17);
                    un.g1 g1Var2 = g1Var;
                    com.tencent.mars.xlog.Log.i("MicroMsg.SelectWxChatRoomAddMemberUIC", "RecordMsgNetSceneEvent msgId:%s netSceneMsgId:%s isSucc:%s", valueOf, java.lang.Long.valueOf(((com.tencent.mm.plugin.msg.MsgIdTalker) g1Var2.f429263n.first).f149480d), java.lang.Boolean.valueOf(dqVar.f6489b));
                    if (dqVar.f6488a == ((com.tencent.mm.plugin.msg.MsgIdTalker) g1Var2.f429263n.first).f149480d) {
                        if (dqVar.f6489b) {
                            g1Var2.Y6();
                        } else {
                            java.lang.String errMsg = dqVar.f6490c;
                            kotlin.jvm.internal.o.f(errMsg, "errMsg");
                            g1Var2.W6(0, "send record error", errMsg);
                        }
                    }
                }
                return false;
            }
        };
    }
}
