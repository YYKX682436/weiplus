package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.GameMsgNoticeFragment f141263d;

    public e0(com.tencent.mm.plugin.game.ui.chat_tab.GameMsgNoticeFragment gameMsgNoticeFragment) {
        this.f141263d = gameMsgNoticeFragment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        if (r0.moveToFirst() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        r6 = new com.tencent.mm.plugin.game.model.e1();
        r6.convertFrom(r0);
        r7 = r6.field_quickResponseContentId;
        kotlin.jvm.internal.o.f(r7, "field_quickResponseContentId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if (r7.length() <= 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        if (r7 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        r7 = r9.f141263d.f141135h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        if (r7 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (r7.getQuickReplyList().contains(r6.field_quickResponseContentId) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        r7 = r9.f141263d.f141135h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        if (r7 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        r7.getQuickReplyList().add(r6.field_quickResponseContentId);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
    
        kotlin.jvm.internal.o.o("gameInteractiveMsgView");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        kotlin.jvm.internal.o.o("gameInteractiveMsgView");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0084, code lost:
    
        r5.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
    
        if (r0.moveToNext() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0057, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008d, code lost:
    
        r0.close();
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.game.ui.message.e0(r1, r5));
        r0 = r9.f141263d;
        r0.f141140p += r0.f141141q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a5, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r9 = this;
            java.lang.Class<m33.s1> r0 = m33.s1.class
            i95.m r0 = i95.n0.c(r0)
            m33.s1 r0 = (m33.s1) r0
            com.tencent.mm.plugin.game.s1 r0 = (com.tencent.mm.plugin.game.s1) r0
            com.tencent.mm.plugin.game.model.o1 r0 = r0.Di()
            com.tencent.mm.plugin.game.ui.chat_tab.GameMsgNoticeFragment r1 = r9.f141263d
            int r2 = r1.f141140p
            int r1 = r1.f141141q
            r3 = 1
            android.database.Cursor r0 = r0.k1(r3, r2, r1)
            if (r0 != 0) goto L1c
            return
        L1c:
            int r1 = r0.getCount()
            if (r1 != 0) goto L23
            return
        L23:
            com.tencent.mm.plugin.game.ui.chat_tab.GameMsgNoticeFragment r1 = r9.f141263d
            com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView r1 = r1.f141135h
            r2 = 0
            java.lang.String r4 = "gameInteractiveMsgView"
            if (r1 == 0) goto La6
            com.tencent.mm.plugin.game.ui.message.f0 r1 = r1.getmAdapter()
            java.lang.String r5 = "null cannot be cast to non-null type com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView.InteractiveMsgAdapter"
            kotlin.jvm.internal.o.e(r1, r5)
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            boolean r6 = r0.moveToFirst()
            if (r6 == 0) goto L8d
        L40:
            com.tencent.mm.plugin.game.model.e1 r6 = new com.tencent.mm.plugin.game.model.e1
            r6.<init>()
            r6.convertFrom(r0)
            java.lang.String r7 = r6.field_quickResponseContentId
            java.lang.String r8 = "field_quickResponseContentId"
            kotlin.jvm.internal.o.f(r7, r8)
            int r7 = r7.length()
            if (r7 <= 0) goto L57
            r7 = r3
            goto L58
        L57:
            r7 = 0
        L58:
            if (r7 == 0) goto L84
            com.tencent.mm.plugin.game.ui.chat_tab.GameMsgNoticeFragment r7 = r9.f141263d
            com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView r7 = r7.f141135h
            if (r7 == 0) goto L80
            java.util.LinkedList r7 = r7.getQuickReplyList()
            java.lang.String r8 = r6.field_quickResponseContentId
            boolean r7 = r7.contains(r8)
            if (r7 != 0) goto L84
            com.tencent.mm.plugin.game.ui.chat_tab.GameMsgNoticeFragment r7 = r9.f141263d
            com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView r7 = r7.f141135h
            if (r7 == 0) goto L7c
            java.util.LinkedList r7 = r7.getQuickReplyList()
            java.lang.String r8 = r6.field_quickResponseContentId
            r7.add(r8)
            goto L84
        L7c:
            kotlin.jvm.internal.o.o(r4)
            throw r2
        L80:
            kotlin.jvm.internal.o.o(r4)
            throw r2
        L84:
            r5.add(r6)
            boolean r6 = r0.moveToNext()
            if (r6 != 0) goto L40
        L8d:
            r0.close()
            ku5.u0 r0 = ku5.t0.f312615d
            com.tencent.mm.plugin.game.ui.message.e0 r2 = new com.tencent.mm.plugin.game.ui.message.e0
            r2.<init>(r1, r5)
            ku5.t0 r0 = (ku5.t0) r0
            r0.B(r2)
            com.tencent.mm.plugin.game.ui.chat_tab.GameMsgNoticeFragment r0 = r9.f141263d
            int r1 = r0.f141140p
            int r2 = r0.f141141q
            int r1 = r1 + r2
            r0.f141140p = r1
            return
        La6:
            kotlin.jvm.internal.o.o(r4)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.ui.chat_tab.e0.run():void");
    }
}
