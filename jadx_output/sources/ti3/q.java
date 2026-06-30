package ti3;

@j95.b
/* loaded from: classes5.dex */
public final class q extends i95.w implements ty.k0 {
    public void Ai(ty.p0 action, ty.r0 refOccasion, com.tencent.mm.storage.f9 quotedMsg, r15.g gVar, long j17, java.lang.String str) {
        com.tencent.mm.storage.f9 l17;
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(refOccasion, "refOccasion");
        kotlin.jvm.internal.o.g(quotedMsg, "quotedMsg");
        if ((str == null || str.length() == 0) || (l17 = pt0.f0.f358209b1.l(str, j17)) == null) {
            return;
        }
        Bi(action, ty.r0.f422754f, quotedMsg, gVar, java.lang.Integer.valueOf(g95.e0.b(quotedMsg)), g95.e0.e(l17), g95.e0.b(l17), j17, str);
    }

    public final void Bi(ty.p0 action, ty.r0 refOccasion, com.tencent.mm.storage.f9 f9Var, r15.g gVar, java.lang.Integer num, long j17, long j18, long j19, java.lang.String talkerName) {
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(refOccasion, "refOccasion");
        kotlin.jvm.internal.o.g(talkerName, "talkerName");
        ((ku5.t0) ku5.t0.f312615d).b(new ti3.o(action, talkerName, f9Var, num, gVar, j19, j17, j18, refOccasion), "MicroMsg.msgquote.MsgReportManager");
    }

    public void Di(ty.p0 action, ty.r0 refOccasion, com.tencent.mm.storage.f9 quotedMsg, r15.g gVar, java.lang.String str) {
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(refOccasion, "refOccasion");
        kotlin.jvm.internal.o.g(quotedMsg, "quotedMsg");
        Bi(action, refOccasion, quotedMsg, gVar, java.lang.Integer.valueOf(g95.e0.b(quotedMsg)), 0L, 0L, 0L, str == null ? "" : str);
    }

    public void Ni(ty.p0 action, com.tencent.mm.plugin.msgquote.model.MsgQuoteItem msgQuoteItem, java.lang.Integer num, java.lang.String str) {
        kotlin.jvm.internal.o.g(action, "action");
        Ri(action, ty.r0.f422754f, msgQuoteItem, str);
    }

    public void Ri(ty.p0 action, ty.r0 refOccasion, com.tencent.mm.plugin.msgquote.model.MsgQuoteItem msgQuoteItem, java.lang.String str) {
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(refOccasion, "refOccasion");
        if ((str == null || str.length() == 0) || msgQuoteItem == null) {
            return;
        }
        com.tencent.mm.storage.f9 l17 = pt0.f0.f358209b1.l(str, msgQuoteItem.f149483e);
        Bi(action, refOccasion, l17, msgQuoteItem.f149493r, java.lang.Integer.valueOf(l17 != null ? g95.e0.b(l17) : 0), 0L, 0L, 0L, str);
    }

    public void Ui(com.tencent.mm.plugin.msgquote.model.MsgQuoteItem msgQuoteItem, java.lang.Integer num, long j17, java.lang.String str) {
        pt0.e0 e0Var;
        com.tencent.mm.storage.f9 l17;
        if ((str == null || str.length() == 0) || msgQuoteItem == null || (l17 = (e0Var = pt0.f0.f358209b1).l(str, msgQuoteItem.f149483e)) == null) {
            return;
        }
        com.tencent.mm.storage.f9 l18 = e0Var.l(str, j17);
        Bi(ty.p0.f422737f, ty.r0.f422754f, l17, msgQuoteItem.f149493r, num, l18 != null ? g95.e0.e(l18) : 0L, l18 != null ? g95.e0.b(l18) : 0L, j17, str);
    }

    public void Vi(r15.b bVar, com.tencent.mm.storage.f9 quoteMsg) {
        com.tencent.mm.storage.f9 l17;
        r15.i n17;
        kotlin.jvm.internal.o.g(quoteMsg, "quoteMsg");
        java.lang.Long valueOf = (bVar == null || (n17 = bVar.n()) == null) ? null : java.lang.Long.valueOf(n17.l());
        if (valueOf != null) {
            valueOf.longValue();
            java.lang.String Q0 = quoteMsg.Q0();
            if ((Q0 == null || Q0.length() == 0) || (l17 = pt0.f0.f358209b1.l(quoteMsg.Q0(), valueOf.longValue())) == null) {
                return;
            }
            ty.k0 k0Var = (ty.k0) i95.n0.c(ty.k0.class);
            ty.p0 p0Var = ty.p0.f422737f;
            ty.r0 r0Var = ty.r0.f422754f;
            r15.i n18 = bVar.n();
            ((ti3.q) k0Var).wi(p0Var, r0Var, l17, n18 != null ? n18.j() : null, g95.e0.e(quoteMsg), 0L, quoteMsg.I0(), quoteMsg.Q0());
        }
    }

    public void wi(ty.p0 action, ty.r0 refOccasion, com.tencent.mm.storage.f9 quotedMsg, r15.g gVar, long j17, long j18, long j19, java.lang.String str) {
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(refOccasion, "refOccasion");
        kotlin.jvm.internal.o.g(quotedMsg, "quotedMsg");
        Bi(action, refOccasion, quotedMsg, gVar, java.lang.Integer.valueOf(g95.e0.b(quotedMsg)), j17, j18, j19, str == null ? "" : str);
    }
}
