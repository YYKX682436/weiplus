package xq;

/* loaded from: classes7.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xq.m f455979d;

    public h(xq.m mVar) {
        this.f455979d = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xq.f fVar;
        xq.m mVar = this.f455979d;
        xq.c cVar = mVar.f455999k;
        if (cVar == null || cVar.f455973d == null || (fVar = mVar.f456006r) == null) {
            return;
        }
        java.lang.String msgTalker = mVar.f455990b;
        long j17 = mVar.f455991c;
        java.lang.String animKey = mVar.f455989a;
        kotlin.jvm.internal.o.g(msgTalker, "msgTalker");
        kotlin.jvm.internal.o.g(animKey, "animKey");
        xq.p pVar = ((xq.o) fVar).f456008a.f456014f;
        if (pVar != null) {
            com.tencent.mm.ui.chatting.component.ta taVar = ((com.tencent.mm.ui.chatting.component.ma) pVar).f199495a;
            java.lang.String str = taVar.f199973e;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPlayScreenEffect: msgTalker:");
            sb6.append(msgTalker);
            sb6.append(" msg:");
            sb6.append(j17);
            sb6.append(", ");
            xq.d dVar = cVar.f455973d;
            jz5.f0 f0Var = null;
            sb6.append(dVar != null ? java.lang.Integer.valueOf(dVar.f455974b) : null);
            sb6.append(", ");
            xq.d dVar2 = cVar.f455973d;
            sb6.append(dVar2 != null ? java.lang.Integer.valueOf(dVar2.f455975c) : null);
            sb6.append(", ");
            sb6.append(animKey);
            sb6.append(' ');
            sb6.append(cVar.f455971b);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            if (taVar.f199974f) {
                return;
            }
            kh5.h m07 = taVar.m0();
            java.lang.String emojiKey = cVar.f455971b;
            m07.getClass();
            kotlin.jvm.internal.o.g(emojiKey, "emojiKey");
            com.tencent.mars.xlog.Log.i("MicroMsg.MEChattingMgr", "[ME] playEmojiEffect msgId = " + j17 + ", emoji = (" + animKey + ", " + emojiKey + ')');
            wp0.b b17 = mh5.a.b(msgTalker, j17, animKey, emojiKey, true, true, m07.f308071h, m07.f308072i);
            if (b17 != null) {
                java.lang.String r17 = m07.f308071h.r();
                kotlin.jvm.internal.o.f(r17, "getReportSessionId(...)");
                java.lang.String a17 = b17.a(1, r17);
                jc3.j0 j0Var = m07.f448375f;
                if (j0Var != null) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    com.tencent.mm.autogen.mmdata.rpt.MagicEmojiTriggerStruct magicEmojiTriggerStruct = new com.tencent.mm.autogen.mmdata.rpt.MagicEmojiTriggerStruct();
                    magicEmojiTriggerStruct.f59095f = currentTimeMillis;
                    magicEmojiTriggerStruct.f59094e = 7;
                    magicEmojiTriggerStruct.k();
                    rc3.w0 w0Var = (rc3.w0) j0Var;
                    w0Var.A();
                    w0Var.k("MagicEmojiSent", a17);
                    m07.g1();
                    f0Var = jz5.f0.f302826a;
                }
                if (f0Var == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MEChattingMgr", "[ME] playEmojiEffect without biz...");
                }
            }
        }
    }
}
