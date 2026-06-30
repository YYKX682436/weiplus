package vf0;

@j95.b
/* loaded from: classes10.dex */
public class y1 extends i95.w implements wf0.x1, wf0.k1 {
    public android.database.Cursor Ai(java.lang.String str, java.lang.String[] strArr) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        t21.w2 Ui = t21.o2.Ui();
        Ui.getClass();
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(t21.w2.r(t21.b3.a(str), strArr));
            sb6.append(" where ");
            sb6.append(t21.b3.a(str));
            sb6.append(".filename = '");
            java.lang.String str2 = "" + str;
            com.tencent.mm.sdk.platformtools.t8.n(str2);
            sb6.append(str2);
            sb6.append("'");
            return Ui.f415057a.f(sb6.toString(), null, 2);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VideoInfoStorage", e17, "getByFileName error[%s]", e17.toString());
            return null;
        }
    }

    public boolean Bi(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, java.lang.String str5, int i19, r45.uf6 uf6Var, java.lang.String str6, long j17, java.lang.String str7, java.lang.String str8, java.lang.String str9, boolean z17, long j18, r45.xz6 xz6Var, java.lang.String str10) {
        return t21.d3.p(str, str2, i17, str3, str4, i18, str5, i19, uf6Var, str6, new com.tencent.mm.plugin.msg.MsgIdTalker(j17, str7), str8, str9, z17, j18, xz6Var, str10);
    }

    public boolean Di(java.lang.String str) {
        d11.s.fj().xj(str);
        return false;
    }

    public boolean wi(java.lang.String str, com.tencent.mm.pointers.PInt pInt, com.tencent.mm.pointers.PInt pInt2) {
        return t21.d3.k(str, pInt, pInt2);
    }
}
