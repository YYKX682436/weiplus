package pr;

/* loaded from: classes4.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f357719d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(java.lang.String str, yz5.l lVar) {
        super(0);
        this.f357719d = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.v75 v75Var;
        int i17;
        z85.t d17 = com.tencent.mm.storage.n5.f().d();
        java.lang.String str = this.f357719d;
        z85.s y07 = d17.y0(str);
        r45.se3 se3Var = new r45.se3();
        if ((y07 != null ? y07.field_content : null) != null) {
            try {
                se3Var.parseFrom(y07.field_content);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EmojiPackSyncManager", e17, "", new java.lang.Object[0]);
            }
        }
        r45.qj0 qj0Var = se3Var.f385652d;
        if (qj0Var == null || (v75Var = qj0Var.E) == null || (i17 = v75Var.f387964d) == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPackSyncManager", "checkPack: getEmojiDetail");
            new gr.e(str).l().K(new pr.i(str, pr.k.f357722d));
        } else {
            int intValue = java.lang.Integer.valueOf(i17).intValue();
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
        return jz5.f0.f302826a;
    }
}
