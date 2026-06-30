package com.tencent.mm.smiley;

/* loaded from: classes12.dex */
public final class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f193369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.smiley.t1 f193370e;

    public s1(java.util.ArrayList arrayList, com.tencent.mm.smiley.t1 t1Var) {
        this.f193369d = arrayList;
        this.f193370e = t1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.smiley.n1 n1Var = com.tencent.mm.smiley.t1.f193375m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = com.tencent.mm.smiley.t1.f193378p;
        sb6.append(str);
        java.lang.String str2 = com.tencent.mm.smiley.t1.f193383u;
        sb6.append(str2);
        java.lang.String sb7 = sb6.toString();
        if (com.tencent.mm.vfs.w6.j(sb7)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.QQSmileyManager", "saveSmileyResFile localNewSmileyConfig exists");
        } else {
            if (!com.tencent.mm.vfs.w6.j(str)) {
                com.tencent.mm.vfs.w6.u(str);
            }
            com.tencent.mm.vfs.w6.c(com.tencent.mm.smiley.t1.f193380r + str2, sb7);
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("saveSmileyResFile success, localNewSmileyConfig:");
            sb8.append(sb7);
            com.tencent.mars.xlog.Log.i("MicroMsg.QQSmileyManager", sb8.toString());
        }
        for (com.tencent.mm.storage.emotion.SmileyInfo smileyInfo : this.f193369d) {
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            java.lang.String str3 = com.tencent.mm.smiley.t1.f193378p;
            sb9.append(str3);
            sb9.append(smileyInfo.field_fileName);
            if (!com.tencent.mm.vfs.w6.j(sb9.toString())) {
                com.tencent.mm.vfs.w6.c(com.tencent.mm.smiley.t1.f193380r + smileyInfo.field_fileName, str3 + smileyInfo.field_fileName);
            }
        }
        com.tencent.mm.smiley.t1 t1Var = this.f193370e;
        if (t1Var.f193384a.length != t1Var.f193386c.length) {
            com.tencent.mars.xlog.Log.i("MicroMsg.QQSmileyManager", "saveSmileyResFile read smiley array failed.");
            return;
        }
        java.lang.String str4 = com.tencent.mm.smiley.t1.f193379q;
        if (com.tencent.mm.vfs.w6.u(str4)) {
            com.tencent.mm.vfs.w6.b(com.tencent.mm.smiley.t1.f193381s, str4);
            com.tencent.mars.xlog.Log.i("MicroMsg.QQSmileyManager", "saveSmileyResFile success, localQQSmileyDir:" + str4);
        }
    }
}
