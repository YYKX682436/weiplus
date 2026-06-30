package q12;

/* loaded from: classes12.dex */
public class a implements com.tencent.mm.app.a3 {
    @Override // com.tencent.mm.app.a3
    public android.os.Handler getHandler() {
        return null;
    }

    @Override // com.tencent.mm.app.a3
    public void onAppBackground(java.lang.String str) {
        if (gm0.j1.a() && gm0.j1.b().f273254q) {
            gm0.j1.b();
            if (gm0.m.r()) {
                return;
            }
            com.tencent.mm.autogen.events.EmojiFileCleanTaskEvent emojiFileCleanTaskEvent = new com.tencent.mm.autogen.events.EmojiFileCleanTaskEvent();
            emojiFileCleanTaskEvent.f54102g.f7511a = 0;
            emojiFileCleanTaskEvent.e();
        }
    }

    @Override // com.tencent.mm.app.a3
    public void onAppForeground(java.lang.String str) {
        if (gm0.j1.a() && gm0.j1.b().f273254q) {
            gm0.j1.b();
            if (gm0.m.r()) {
                return;
            }
            com.tencent.mm.autogen.events.EmojiFileCleanTaskEvent emojiFileCleanTaskEvent = new com.tencent.mm.autogen.events.EmojiFileCleanTaskEvent();
            emojiFileCleanTaskEvent.f54102g.f7511a = 1;
            emojiFileCleanTaskEvent.e();
        }
    }
}
