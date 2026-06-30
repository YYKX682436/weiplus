package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class a2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f190170d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f190171e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f190172f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190173g;

    public a2(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter, java.lang.String str, java.lang.String str2, long j17) {
        this.f190173g = chatFooter;
        this.f190170d = str;
        this.f190171e = str2;
        this.f190172f = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.regex.Matcher matcher = com.tencent.mm.pluginsdk.ui.span.b0.f191186u.matcher(this.f190170d);
        while (matcher.find()) {
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190173g;
            gv4.b.a(chatFooter.f190021m.j(), com.tencent.mm.storage.z3.R4(chatFooter.f189969d) ? 2 : 1, chatFooter.f189969d, this.f190171e, 3, matcher.group(), chatFooter.G2, 1, this.f190172f);
        }
    }
}
