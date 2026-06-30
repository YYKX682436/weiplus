package y75;

/* loaded from: classes15.dex */
public final class d extends lr.p {
    public d(int i17) {
        super(i17, null, null, 6, null);
    }

    @Override // lr.p, lr.k0
    public void b(android.view.View view, android.content.Context context, int i17, ir.u0 u0Var) {
        kotlin.jvm.internal.o.g(context, "context");
        if (u0Var == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick: ");
        sb6.append(i17);
        sb6.append(", ");
        ir.g gVar = (ir.g) u0Var;
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = gVar.f293836b;
        sb6.append(iEmojiInfo.getMd5());
        com.tencent.mars.xlog.Log.i("MicroMsg.SimilarEmoji", sb6.toString());
        if (gVar.f293837c == 103) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1257L, 5L);
            if (com.tencent.mm.storage.n5.f().c().u1(iEmojiInfo.getMd5()) == null) {
                com.tencent.mm.storage.n5.f().c().insert((com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo);
            }
        }
    }
}
