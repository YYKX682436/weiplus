package ut;

/* loaded from: classes9.dex */
public final class k {
    public k(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a() {
        if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ri(1)) {
            return true;
        }
        ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).Bi(oq1.b.I);
        return false;
    }

    public final java.lang.String b(oi3.g fileMsgInfo) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(fileMsgInfo, "fileMsgInfo");
        int i17 = fileMsgInfo.f345617d;
        byte[] bytes = (fileMsgInfo.getLong(i17 + 0) + '-' + fileMsgInfo.getString(i17 + 3)).getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            messageDigest.update(bytes);
            byte[] digest = messageDigest.digest();
            char[] cArr2 = new char[32];
            int i18 = 0;
            for (int i19 = 0; i19 < 16; i19++) {
                byte b17 = digest[i19];
                int i27 = i18 + 1;
                cArr2[i18] = cArr[(b17 >>> 4) & 15];
                i18 = i27 + 1;
                cArr2[i27] = cArr[b17 & 15];
            }
            str = new java.lang.String(cArr2);
        } catch (java.lang.Exception unused) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        ((ot.i) ((pt.h0) i95.n0.c(pt.h0.class))).getClass();
        return new com.tencent.mm.vfs.r6(lp0.b.h0(gm0.j1.b().j() + "_AppMsgFileFeatureService"), str).o();
    }
}
