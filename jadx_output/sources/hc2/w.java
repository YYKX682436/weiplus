package hc2;

/* loaded from: classes2.dex */
public abstract class w {
    public static final com.tencent.mm.api.IEmojiInfo a(r45.t11 t11Var) {
        com.tencent.mm.api.IEmojiInfo Di;
        kotlin.jvm.internal.o.g(t11Var, "<this>");
        java.lang.String string = t11Var.getString(0);
        r45.ri0 ri0Var = (r45.ri0) t11Var.getCustom(1);
        if (string == null || ri0Var == null) {
            return null;
        }
        if (kotlin.jvm.internal.o.b(string, ri0Var.f384886d)) {
            i95.m c17 = i95.n0.c(com.tencent.mm.feature.emoji.api.n6.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            Di = ((com.tencent.mm.feature.emoji.t2) ((com.tencent.mm.feature.emoji.api.n6) c17)).Di(ri0Var);
        } else {
            com.tencent.mars.xlog.Log.w("FinderEmojiInfo.toIEmojiInfo", "md5 not match: md5=" + string + ", protoEmoji.Md5=" + ri0Var.f384886d);
            i95.m c18 = i95.n0.c(com.tencent.mm.feature.emoji.api.n6.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            Di = ((com.tencent.mm.feature.emoji.t2) ((com.tencent.mm.feature.emoji.api.n6) c18)).Bi(string, null);
        }
        return Di;
    }
}
