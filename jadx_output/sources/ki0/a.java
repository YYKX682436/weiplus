package ki0;

/* loaded from: classes9.dex */
public abstract class a {
    public static final java.lang.String a(com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        if (msg.A0() == 1) {
            java.lang.String r17 = c01.z1.r();
            kotlin.jvm.internal.o.d(r17);
            return r17;
        }
        if (com.tencent.mm.storage.z3.R4(msg.Q0())) {
            java.lang.String s17 = c01.w9.s(msg.j());
            kotlin.jvm.internal.o.d(s17);
            return s17;
        }
        java.lang.String Q0 = msg.Q0();
        kotlin.jvm.internal.o.d(Q0);
        return Q0;
    }

    public static final java.lang.String b(com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        if (msg.A0() == 1) {
            java.lang.String Q0 = msg.Q0();
            kotlin.jvm.internal.o.f(Q0, "getTalker(...)");
            return Q0;
        }
        if (com.tencent.mm.storage.z3.R4(msg.Q0())) {
            java.lang.String Q02 = msg.Q0();
            kotlin.jvm.internal.o.f(Q02, "getTalker(...)");
            return Q02;
        }
        java.lang.String r17 = c01.z1.r();
        kotlin.jvm.internal.o.f(r17, "getUsernameFromUserInfo(...)");
        return r17;
    }
}
