package u63;

@j95.b
/* loaded from: classes5.dex */
public class e extends i95.w implements vg3.v3 {
    public boolean Ai(java.lang.String str) {
        return com.tencent.mm.storage.z3.N4(str);
    }

    public void Bi(java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, long j18, java.lang.String str4) {
        java.lang.String str5;
        java.lang.String str6;
        android.util.Pair j19;
        java.lang.Object obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.groupsolitaire.GroupSolitaireService", "processGroupSolitatireMessage()3 fromUserName:%s toUserName:%s msgId:%s ", str, str2, java.lang.Long.valueOf(j17));
        try {
            str5 = str3;
        } catch (java.lang.Exception e17) {
            e = e17;
            str5 = str3;
        }
        try {
            try {
                str6 = ((h12.b) ((k12.r) i95.n0.c(k12.r.class))).wi(str5);
            } catch (java.lang.Exception e18) {
                e = e18;
                com.tencent.mars.xlog.Log.e("MicroMsg.groupsolitaire.GroupSolitaireService", "processGroupSolitatireMessage() emojiSoftBank2Unicode %s %s", e.getClass().getSimpleName(), e.getMessage());
                str6 = str5;
                java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                j19 = ((t63.e) i95.n0.c(t63.e.class)).wi().j(str6, 2, str);
                if (((java.lang.Integer) j19.first).intValue() > 0) {
                    return;
                } else {
                    return;
                }
            }
            j19 = ((t63.e) i95.n0.c(t63.e.class)).wi().j(str6, 2, str);
            if (((java.lang.Integer) j19.first).intValue() > 0 || (obj = j19.second) == null) {
                return;
            }
            y63.a aVar = (y63.a) obj;
            x63.g.g(str, str2, aVar, j17, false, str4);
            x63.g.H(aVar, x63.g.A(aVar, ((t63.e) i95.n0.c(t63.e.class)).Bi().L0(str, aVar.field_key, true), str2, 1), j17, true, str2, false, false, j18, str4);
            x63.g.L(j17, str2, aVar, str4);
            return;
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.groupsolitaire.GroupSolitaireService", "processGroupSolitatireMessage2() Exception:%s %s", e19.getClass().getSimpleName(), e19.getMessage());
            return;
        }
        java.lang.String str72 = com.tencent.mm.sdk.platformtools.z.f193105a;
    }

    public boolean wi(java.lang.String str) {
        return com.tencent.mm.storage.z3.N4(str);
    }
}
