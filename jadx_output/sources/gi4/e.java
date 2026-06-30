package gi4;

/* loaded from: classes11.dex */
public final class e extends et1.a implements et1.n {
    @Override // et1.l
    public boolean k(w11.r1 r1Var) {
        kotlin.jvm.internal.o.d(r1Var);
        return com.tencent.mm.storage.z3.H4(r1Var.f442127b) || o(r1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // et1.a, et1.l
    public w11.m1 l(w11.r1 r1Var) {
        w11.m1 m1Var = new w11.m1();
        if (r1Var instanceof k12.q) {
            java.lang.String str = r1Var.f442127b;
            r1Var.f442127b = t(str);
            r1Var.f442128c = s(str);
            java.lang.String str2 = r1Var.f442128c;
            java.lang.String str3 = r1Var.f442127b;
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = ((h12.a) ((k12.q) r1Var)).f278077q;
            kotlin.jvm.internal.o.f(emojiInfo, "getEmojiInfo(...)");
            m1Var.f442088a = new dt1.b(4, str, str2, str3, emojiInfo, r1Var.f442132g, r1Var.f442126a);
        }
        return m1Var;
    }

    @Override // et1.a
    public boolean o(w11.r1 params) {
        kotlin.jvm.internal.o.g(params, "params");
        if (!(params instanceof m11.m1)) {
            return false;
        }
        java.lang.String str = params.f442141p;
        java.lang.String str2 = com.tencent.mm.storage.v3.f196273a;
        return str != null && str.endsWith("statussquaremsg");
    }

    @Override // et1.a
    public int r() {
        return 4;
    }

    @Override // et1.a
    public java.lang.String s(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        ((ki4.i0) ((bi4.y0) i95.n0.c(bi4.y0.class))).getClass();
        java.lang.String a17 = en1.a.a();
        kotlin.jvm.internal.o.f(a17, "username(...)");
        return a17;
    }

    @Override // et1.a
    public java.lang.String t(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        return ((ki4.i0) ((bi4.y0) i95.n0.c(bi4.y0.class))).wi(sessionId);
    }
}
