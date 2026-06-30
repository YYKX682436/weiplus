package qr;

/* loaded from: classes12.dex */
public class o extends qr.l {
    public o(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo, boolean z17, java.util.List list, int i17, r45.uu6 uu6Var, r45.sj0 sj0Var, java.util.List list2, boolean z18, qr.i iVar) {
        super(emojiInfo, z17, iVar);
        new qr.r(emojiInfo, z17, list, i17, uu6Var, sj0Var, list2, z18, new qr.m(this));
    }

    public static void e(qr.o oVar, r45.ri0 ri0Var) {
        oVar.getClass();
        if (ri0Var == null) {
            return;
        }
        java.lang.String str = ri0Var.f384895p;
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = oVar.f366019a;
        emojiInfo.field_activityid = str;
        emojiInfo.field_linkId = ri0Var.f384900u;
        ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().c().G2(emojiInfo);
    }
}
