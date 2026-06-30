package g30;

@j95.b(dependencies = {com.tencent.mm.feature.emoji.b0.class})
/* loaded from: classes9.dex */
public class e extends i95.w implements com.tencent.mm.feature.emoji.api.l5, com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f268031d = false;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f268032e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f268033f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.modelbase.m1 f268034g;

    public void Ai(java.lang.String str, com.tencent.mm.storage.emotion.EmojiInfo emojiInfo, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker) {
        long j17;
        int i17;
        com.tencent.mm.storage.f9 f9Var2 = f9Var;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || emojiInfo == null) {
            return;
        }
        if (msgIdTalker != null && msgIdTalker.f149480d > 0) {
            if (((px.a) ((qx.d0) i95.n0.c(qx.d0.class))).Ni(str, msgIdTalker.a(), msgIdTalker.f149480d, null)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiBypService", "checkEmojiExist: claw user forwarding emoji, converted to text summary");
                return;
            }
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (f9Var2 == null) {
            f9Var2 = new com.tencent.mm.storage.f9();
            int i18 = emojiInfo.field_type;
            if (i18 > 3 || i18 < 1) {
                g30.a aVar = new g30.a(this);
                if (java.lang.Thread.currentThread() != android.os.Looper.getMainLooper().getThread()) {
                    com.tencent.mm.sdk.platformtools.u3.h(aVar);
                } else {
                    aVar.run();
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiBypService", "gamelife fobidden image: wrong format: emoji Type:%d", java.lang.Integer.valueOf(emojiInfo.field_type));
                return;
            }
            f9Var2.setType(47);
            f9Var2.u1(str);
            f9Var2.j1(1);
            f9Var2.d1(com.tencent.mm.storage.y4.e("", currentTimeMillis, (emojiInfo.k() || emojiInfo.B1()) ? false : true, emojiInfo.getMd5(), false, ""));
            ((com.tencent.mm.feature.emoji.b0) ((com.tencent.mm.feature.emoji.api.s5) i95.n0.c(com.tencent.mm.feature.emoji.api.s5.class))).fj(f9Var2, emojiInfo.getMd5());
            f9Var2.e1(c01.w9.o(f9Var2.Q0()));
            j17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var2);
        } else {
            long msgId = f9Var.getMsgId();
            long j18 = new com.tencent.mm.storage.y4(f9Var.j()).f196354b;
            if (j18 == 0) {
                f9Var2.r1(5);
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(msgId, f9Var2, true);
                return;
            } else {
                j17 = msgId;
                currentTimeMillis = j18;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiBypService", "add Emoji: msgId = %s, md5 %s, len %s", java.lang.Long.valueOf(j17), emojiInfo.getMd5(), java.lang.Integer.valueOf(emojiInfo.field_size));
        c01.h7 h7Var = new c01.h7();
        if (msgIdTalker != null) {
            h7Var.f37227b = msgIdTalker.f149480d;
            h7Var.f37229d = msgIdTalker.a();
        }
        java.util.List list = this.f268032e;
        java.util.LinkedList linkedList = (java.util.LinkedList) list;
        linkedList.add(new g30.d(this, f9Var2.Q0(), j17, str, emojiInfo, "" + currentTimeMillis, h7Var));
        if (!this.f268031d || linkedList.size() == 1) {
            this.f268031d = true;
            int i19 = emojiInfo.field_catalog;
            l75.e0 e0Var = com.tencent.mm.storage.emotion.EmojiInfo.L2;
            if (i19 == 50 || i19 == 49) {
                wi();
                return;
            }
            if (msgIdTalker.f149480d > 0) {
                java.lang.Long valueOf = java.lang.Long.valueOf(j17);
                com.tencent.mm.autogen.events.UpdateForwardMsgIdEvent updateForwardMsgIdEvent = new com.tencent.mm.autogen.events.UpdateForwardMsgIdEvent();
                long longValue = valueOf.longValue();
                am.xz xzVar = updateForwardMsgIdEvent.f54918g;
                xzVar.f8409a = longValue;
                xzVar.f8410b = 0;
                i17 = 0;
                xzVar.f8411c = str;
                updateForwardMsgIdEvent.e();
            } else {
                i17 = 0;
            }
            java.util.List list2 = this.f268033f;
            java.util.LinkedList linkedList2 = (java.util.LinkedList) list2;
            linkedList2.clear();
            linkedList2.add(((g30.d) linkedList.get(i17)).f268028d.field_md5);
            gm0.j1.n().f273288b.g(new z12.i((java.util.LinkedList) list2));
        }
    }

    public final void Bi(int i17) {
        java.util.LinkedList linkedList = (java.util.LinkedList) this.f268032e;
        if (linkedList.size() < 1) {
            this.f268031d = false;
            return;
        }
        g30.d dVar = (g30.d) linkedList.remove(0);
        java.lang.String str = dVar.f268027c;
        long j17 = dVar.f268025a;
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(str, j17);
        Li.r1(i17);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(j17, Li, true);
        if (linkedList.size() <= 0) {
            this.f268031d = false;
            return;
        }
        java.util.List list = this.f268033f;
        java.util.LinkedList linkedList2 = (java.util.LinkedList) list;
        linkedList2.clear();
        linkedList2.add(((g30.d) linkedList.get(0)).f268028d.field_md5);
        gm0.j1.n().f273288b.g(new z12.i((java.util.LinkedList) list));
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        gm0.j1.n().f273288b.a(3862, this);
        gm0.j1.n().f273288b.a(697, this);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        gm0.j1.n().f273288b.q(3862, this);
        gm0.j1.n().f273288b.q(697, this);
        ((java.util.LinkedList) this.f268032e).clear();
        ((java.util.LinkedList) this.f268033f).clear();
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiBypService", "errType %d,errCode %d,errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        int i19 = 5;
        if (m1Var instanceof z12.i) {
            java.util.List list = this.f268032e;
            if (!list.isEmpty()) {
                if (i17 != 0 || i18 != 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiBypService", "handleDownloadResult errType:%d, errCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                    Bi(5);
                    return;
                }
                com.tencent.mm.modelbase.o oVar = ((z12.i) m1Var).f469310e;
                r45.ye yeVar = oVar == null ? null : (r45.ye) oVar.f70711b.f70700a;
                if (yeVar.f391008g.isEmpty()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiBypService", "handleDownloadResult: BatchEmojiDownLoadResponse resp EmojiList empty ");
                } else {
                    r45.ri0 ri0Var = (r45.ri0) yeVar.f391008g.getFirst();
                    if (ri0Var.f384886d.equals(((java.util.LinkedList) this.f268033f).get(0)) && ri0Var.f384887e != null) {
                        wi();
                        return;
                    }
                }
                if (list.isEmpty()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiBypService", "no emoji to upload");
                    return;
                } else {
                    new qr.r(((g30.d) ((java.util.LinkedList) list).get(0)).f268028d, false, new g30.b(this));
                    return;
                }
            }
        }
        com.tencent.mm.modelbase.m1 m1Var2 = this.f268034g;
        if (m1Var2 == null || !m1Var2.getClass().isInstance(m1Var)) {
            return;
        }
        if (i17 == 0 && i18 == 0) {
            i19 = 2;
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiBypService", "handleBypSendResult errType:%d, errCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
        Bi(i19);
    }

    public void wi() {
        java.util.List list = this.f268032e;
        if (list.isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiBypService", "no emoji to upload");
            return;
        }
        g30.d dVar = (g30.d) ((java.util.LinkedList) list).get(0);
        java.lang.String str = dVar.f268027c;
        java.lang.Long valueOf = java.lang.Long.valueOf(dVar.f268025a);
        h12.a aVar = new h12.a();
        aVar.f442137l = w11.p1.f442106h;
        aVar.f278077q = dVar.f268028d;
        aVar.g(str);
        java.lang.String str2 = dVar.f268026b;
        if (str2 == null) {
            str2 = "";
        }
        aVar.f442126a = str2;
        aVar.f(dVar.f268029e);
        aVar.f442132g = valueOf.longValue();
        w11.n1 a17 = aVar.a();
        this.f268034g = a17.f442095a;
        a17.a();
    }
}
