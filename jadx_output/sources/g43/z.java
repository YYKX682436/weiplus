package g43;

/* loaded from: classes5.dex */
public final class z extends oz5.a implements kotlinx.coroutines.r0 {
    public z(kotlinx.coroutines.q0 q0Var) {
        super(q0Var);
    }

    @Override // kotlinx.coroutines.r0
    public void handleException(oz5.l lVar, java.lang.Throwable th6) {
        com.tencent.mars.xlog.Log.e("GameChatRoom.ChatroomViewModel", th6.getMessage());
    }
}
