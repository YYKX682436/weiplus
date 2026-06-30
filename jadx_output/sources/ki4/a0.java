package ki4;

@j95.b
/* loaded from: classes9.dex */
public final class a0 extends i95.w implements bi4.x0 {
    public int wi(java.lang.String sessionId) {
        int i17 = 0;
        if (sessionId == null || sessionId.length() == 0) {
            return 0;
        }
        li4.a h17 = ni4.x.f337776d.h();
        h17.getClass();
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        android.os.SystemClock.uptimeMillis();
        android.database.Cursor B = h17.f318785d.B("select unReadCount, sum(unReadCount) from TextStatusConversation WHERE sessionId=".concat(sessionId), null);
        try {
            if (B.moveToFirst() && !B.isAfterLast()) {
                i17 = B.getInt(1);
            }
            vz5.b.a(B, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusConversationStorage", "[getUnreadCount] sessionId=" + sessionId + ' ' + i17);
            return i17;
        } finally {
        }
    }
}
