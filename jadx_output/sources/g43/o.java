package g43;

/* loaded from: classes5.dex */
public final class o extends oz5.a implements kotlinx.coroutines.r0 {
    public o(kotlinx.coroutines.q0 q0Var) {
        super(q0Var);
    }

    @Override // kotlinx.coroutines.r0
    public void handleException(oz5.l lVar, java.lang.Throwable th6) {
        com.tencent.stubs.logger.Log.e("GameChatRoom.ChatroomMemberViewModel", th6, th6.getMessage());
    }
}
