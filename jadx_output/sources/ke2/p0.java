package ke2;

/* loaded from: classes3.dex */
public final class p0 {
    public p0(kotlin.jvm.internal.i iVar) {
    }

    public final r45.ch1 a(dk2.zf msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        r45.ch1 ch1Var = new r45.ch1();
        ch1Var.set(3, java.lang.Long.valueOf(msg.m()));
        ch1Var.set(1, 20008);
        ch1Var.set(2, zl2.q4.f473933a.m());
        return ch1Var;
    }

    public final r45.ch1 b(gk2.e liveData, com.tencent.mm.api.IEmojiInfo emojiInfo, boolean z17) {
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        r45.ch1 ch1Var = new r45.ch1();
        r45.ei1 ei1Var = new r45.ei1();
        ei1Var.set(0, emojiInfo.getMd5());
        if (z17) {
            ei1Var.set(1, ((com.tencent.mm.feature.emoji.t2) ((com.tencent.mm.feature.emoji.api.n6) i95.n0.c(com.tencent.mm.feature.emoji.api.n6.class))).Ai(emojiInfo));
        }
        ch1Var.set(4, com.tencent.mm.protobuf.g.b(ei1Var.toByteArray()));
        ch1Var.set(1, 20124);
        ch1Var.set(2, c01.z1.r() + java.lang.System.currentTimeMillis());
        r45.xn1 xn1Var = new r45.xn1();
        zl2.r4 r4Var = zl2.r4.f473950a;
        xn1Var.set(0, r4Var.m0(liveData));
        xn1Var.set(11, ((mm2.c1) liveData.a(mm2.c1.class)).f328812h);
        xn1Var.set(7, java.lang.Integer.valueOf(r4Var.g0()));
        ch1Var.set(13, xn1Var);
        return ch1Var;
    }

    public final r45.ch1 c(gk2.e liveData, r45.xn1 atUser, long j17, int i17, java.lang.String replyContent, java.lang.String str, int i18) {
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(atUser, "atUser");
        kotlin.jvm.internal.o.g(replyContent, "replyContent");
        r45.ch1 ch1Var = new r45.ch1();
        ch1Var.set(0, atUser);
        r45.xn1 xn1Var = new r45.xn1();
        zl2.r4 r4Var = zl2.r4.f473950a;
        xn1Var.set(0, r4Var.m0(liveData));
        xn1Var.set(11, ((mm2.c1) liveData.a(mm2.c1.class)).f328812h);
        xn1Var.set(7, java.lang.Integer.valueOf(r4Var.g0()));
        ch1Var.set(13, xn1Var);
        r45.xj1 xj1Var = new r45.xj1();
        xj1Var.set(0, replyContent);
        r45.up2 up2Var = new r45.up2();
        up2Var.set(0, str);
        xj1Var.set(1, up2Var);
        xj1Var.set(8, java.lang.Integer.valueOf(i17));
        ch1Var.set(4, com.tencent.mm.protobuf.g.b(xj1Var.toByteArray()));
        ch1Var.set(1, 20002);
        ch1Var.set(10, java.lang.Integer.valueOf(i18));
        ch1Var.set(9, java.lang.Integer.valueOf(i18 > 0 ? 1 : 0));
        ch1Var.set(2, zl2.q4.f473933a.m());
        ch1Var.set(3, java.lang.Long.valueOf(j17));
        return ch1Var;
    }
}
