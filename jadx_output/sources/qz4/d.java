package qz4;

/* loaded from: classes12.dex */
public final class d {
    public static final boolean a(am.sn snVar) {
        com.tencent.mm.storage.f9 k17;
        if (snVar == null) {
            return false;
        }
        java.lang.String str = snVar.f7909f;
        long j17 = snVar.f7904a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || j17 <= 0 || !((k17 = pt0.f0.f358209b1.k(str, j17)) == null || k17.getMsgId() <= 0 || k17.V2() || k17.W2())) {
            return false;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WNNoteUtilKt", "checkNoteSourceMsgInfo deleted, talker:%s, msgId:%d", str, java.lang.Long.valueOf(j17));
        db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.h_s, 0).show();
        return true;
    }

    public static final boolean b(am.zl zlVar) {
        if (zlVar == null) {
            return false;
        }
        android.os.Bundle bundle = zlVar.f8585h;
        java.lang.String string = bundle != null ? bundle.getString("snslocalid") : null;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(string);
            if (k17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WNNoteUtilKt", "checkNoteAttachSnsInfo deleted snsInfo %s", string);
                db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.h_s, 0).show();
                return true;
            }
            if (!kotlin.jvm.internal.o.b(k17.field_userName, gm0.j1.b().k()) && !k17.isSourceExist(2) && !k17.isSourceExist(8)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WNNoteUtilKt", "checkNoteAttachSnsInfo deleted, other user=" + k17.field_userName + ", localId=%s", string);
                db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.h_s, 0).show();
                return true;
            }
        }
        return false;
    }
}
