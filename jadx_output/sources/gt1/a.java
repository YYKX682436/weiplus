package gt1;

/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final gt1.a f275370a = new gt1.a();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f275371b = false;

    /* renamed from: c, reason: collision with root package name */
    public static int f275372c = 2;

    public final java.lang.String a(long j17, java.lang.String str, java.lang.String str2) {
        return "msg_" + j17 + '|' + str + '|' + str2;
    }

    public final java.lang.String b(com.tencent.mm.storage.f9 f9Var, oi3.g gVar, java.lang.String str, c01.h7 h7Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgTraceHelper", "tryInsertMessageTracebackInfo :" + h7Var);
        if (h7Var == null) {
            return str == null ? "" : str;
        }
        p15.e eVar = new p15.e();
        if (!(str == null || str.length() == 0)) {
            eVar.fromXml(str);
        }
        p15.v r17 = eVar.r();
        if (r17 == null) {
            r17 = new p15.v();
            eVar.E(r17);
        }
        long j17 = h7Var.f37227b;
        com.tencent.mm.storage.f9 f9Var2 = null;
        if (j17 != 0) {
            try {
                f9Var2 = pt0.f0.f358209b1.n(h7Var.f37229d, j17);
            } catch (java.lang.AssertionError unused) {
            }
            if (f9Var2 != null && f9Var2.G != null) {
                r17.k(a(f9Var2.I0(), g95.e0.d(f9Var2), g95.e0.c(f9Var2)));
                p15.e eVar2 = new p15.e();
                java.lang.String str2 = f9Var2.G;
                kotlin.jvm.internal.o.f(str2, "getMsgSource(...)");
                eVar2.fromXml(str2);
                eVar.A(eVar2.p());
            }
            if (f9Var != null && f9Var2 != null) {
                dh3.c.f232489a.d(f9Var, new com.tencent.mm.plugin.msg.MsgIdTalker(f9Var2.getMsgId(), f9Var2.Q0()));
            } else if (gVar != null && f9Var2 != null) {
                dh3.c.f232489a.e(gVar, new com.tencent.mm.plugin.msg.MsgIdTalker(f9Var2.getMsgId(), f9Var2.Q0()));
            }
        } else {
            java.lang.String str3 = h7Var.f37228c;
            if (!(str3 == null || str3.length() == 0)) {
                try {
                    f9Var2 = pt0.f0.f358209b1.l(h7Var.f37229d, com.tencent.mm.sdk.platformtools.b8.c(h7Var.f37228c));
                } catch (java.lang.AssertionError unused2) {
                }
                if (f9Var2 != null && f9Var2.G != null) {
                    r17.k(a(f9Var2.I0(), g95.e0.d(f9Var2), g95.e0.c(f9Var2)));
                    p15.e eVar3 = new p15.e();
                    java.lang.String str4 = f9Var2.G;
                    kotlin.jvm.internal.o.f(str4, "getMsgSource(...)");
                    eVar3.fromXml(str4);
                    eVar.A(eVar3.p());
                }
                if (f9Var != null && f9Var2 != null) {
                    dh3.c.f232489a.d(f9Var, new com.tencent.mm.plugin.msg.MsgIdTalker(f9Var2.getMsgId(), f9Var2.Q0()));
                } else if (gVar != null && f9Var2 != null) {
                    dh3.c.f232489a.e(gVar, new com.tencent.mm.plugin.msg.MsgIdTalker(f9Var2.getMsgId(), f9Var2.Q0()));
                }
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(h7Var.f37230e)) {
                java.lang.String Bi = ((ee0.v4) ((fe0.o4) i95.n0.c(fe0.o4.class))).Bi(h7Var.f37230e);
                kotlin.jvm.internal.o.f(Bi, "getSnsAuthor(...)");
                java.lang.String Di = ((ee0.v4) ((fe0.o4) i95.n0.c(fe0.o4.class))).Di(h7Var.f37230e);
                kotlin.jvm.internal.o.f(Di, "getSnsPublishId(...)");
                if (!com.tencent.mm.sdk.platformtools.t8.N0(Bi, Di)) {
                    r17.k(Di + '|' + Bi);
                }
            }
        }
        if (eVar.j() == null) {
            eVar.u(new p15.f());
        }
        if (f275372c != 2) {
            p15.f j18 = eVar.j();
            kotlin.jvm.internal.o.d(j18);
            j18.j(f275372c);
        } else {
            p15.f j19 = eVar.j();
            kotlin.jvm.internal.o.d(j19);
            j19.j(2);
        }
        if (!f275371b) {
            eVar.E(new p15.v());
        }
        java.lang.String xml = eVar.toXml();
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgTraceHelper", xml);
        return xml;
    }
}
