package ct;

/* loaded from: classes5.dex */
public interface q2 extends i95.m {
    static void k5(ct.q2 q2Var, boolean z17, int i17, boolean z18, boolean z19, boolean z27, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: asyncPrepareChatRecordPlainTexts");
        }
        boolean z28 = (i18 & 1) != 0 ? true : z17;
        int i19 = (i18 & 2) != 0 ? 1 : i17;
        boolean z29 = (i18 & 4) != 0 ? true : z18;
        boolean z37 = (i18 & 8) != 0 ? true : z19;
        boolean z38 = (i18 & 16) != 0 ? false : z27;
        qg5.l0 l0Var = (qg5.l0) q2Var;
        qg5.r rVar = (qg5.r) l0Var.f363058t.get();
        if (rVar == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = rVar.f363152c.iterator();
        while (it.hasNext()) {
            com.tencent.mm.storage.f9 f9Var = ((c01.ob) it.next()).f37373a;
            if (f9Var != null) {
                arrayList.add(f9Var);
            }
        }
        if (arrayList.isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChatRecordsStagingFeatureService", "asyncPrepareChatRecordPlainTexts: no messages");
        } else {
            v65.i.b(l0Var.f363057s, null, new qg5.t(l0Var, arrayList, rVar, z28, z29, z37, z38, i19, null), 1, null);
        }
    }
}
