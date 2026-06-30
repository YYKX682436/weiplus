package jy;

/* loaded from: classes14.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.chatbot.d0 f302470a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.wechat.aff.chatbot.w f302471b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.wechat.aff.chatbot.n0 f302472c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.wechat.aff.chatbot.w1 f302473d;

    public m(com.tencent.wechat.aff.chatbot.d0 roomInfo, com.tencent.wechat.aff.chatbot.w openScreen, com.tencent.wechat.aff.chatbot.n0 roomScene, com.tencent.wechat.aff.chatbot.w1 reportAiChatExtInfo) {
        kotlin.jvm.internal.o.g(roomInfo, "roomInfo");
        kotlin.jvm.internal.o.g(openScreen, "openScreen");
        kotlin.jvm.internal.o.g(roomScene, "roomScene");
        kotlin.jvm.internal.o.g(reportAiChatExtInfo, "reportAiChatExtInfo");
        this.f302470a = roomInfo;
        this.f302471b = openScreen;
        this.f302472c = roomScene;
        this.f302473d = reportAiChatExtInfo;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jy.m)) {
            return false;
        }
        jy.m mVar = (jy.m) obj;
        return kotlin.jvm.internal.o.b(this.f302470a, mVar.f302470a) && this.f302471b == mVar.f302471b && this.f302472c == mVar.f302472c && kotlin.jvm.internal.o.b(this.f302473d, mVar.f302473d);
    }

    public int hashCode() {
        return (((((this.f302470a.hashCode() * 31) + this.f302471b.hashCode()) * 31) + this.f302472c.hashCode()) * 31) + this.f302473d.hashCode();
    }

    public java.lang.String toString() {
        return "ScreenInfo(roomInfo=" + this.f302470a + ", openScreen=" + this.f302471b + ", roomScene=" + this.f302472c + ", reportAiChatExtInfo=" + this.f302473d + ')';
    }
}
