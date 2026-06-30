package pr;

/* loaded from: classes4.dex */
public final class i implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f357716a;

    public i(java.lang.String str, yz5.l lVar) {
        this.f357716a = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.v75 v75Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPackSyncManager", "CgiGetEmotionDetail end: " + i17 + ", " + i18);
        r45.se3 se3Var = (r45.se3) fVar.f70618d;
        if (i17 == 0 && i18 == 0) {
            ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().d().z0(this.f357716a, se3Var, com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a));
            r45.qj0 qj0Var = se3Var.f385652d;
            if (qj0Var != null && (v75Var = qj0Var.E) != null) {
                int intValue = java.lang.Integer.valueOf(v75Var.f387964d).intValue();
                com.tencent.mm.storage.e5 a17 = com.tencent.mm.storage.d5.f193836a.a(intValue);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkPack: checkDesigner ");
                sb6.append(intValue);
                sb6.append(' ');
                java.util.LinkedList linkedList = a17.f193858b;
                sb6.append(linkedList.size());
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPackSyncManager", sb6.toString());
                if (linkedList.isEmpty()) {
                    new pr.d(intValue, null).b();
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
