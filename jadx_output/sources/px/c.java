package px;

@j95.b
/* loaded from: classes11.dex */
public final class c extends i95.w implements qx.e0 {
    public com.tencent.mm.modelbase.m1 Ai(int i17, java.lang.String session_id, java.lang.String from_username, java.lang.String to_username, java.lang.String text, long j17) {
        kotlin.jvm.internal.o.g(session_id, "session_id");
        kotlin.jvm.internal.o.g(from_username, "from_username");
        kotlin.jvm.internal.o.g(to_username, "to_username");
        kotlin.jvm.internal.o.g(text, "text");
        return new dt1.f(i17, session_id, from_username, to_username, text, j17);
    }

    public com.tencent.mm.modelbase.m1 wi(int i17, java.lang.String session_id, java.lang.String from_username, java.lang.String to_username, com.tencent.mm.api.IEmojiInfo emoji, long j17, java.lang.String talker) {
        kotlin.jvm.internal.o.g(session_id, "session_id");
        kotlin.jvm.internal.o.g(from_username, "from_username");
        kotlin.jvm.internal.o.g(to_username, "to_username");
        kotlin.jvm.internal.o.g(emoji, "emoji");
        kotlin.jvm.internal.o.g(talker, "talker");
        return new dt1.b(i17, session_id, from_username, to_username, emoji, j17, talker);
    }
}
