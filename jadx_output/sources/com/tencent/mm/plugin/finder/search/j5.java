package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class j5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.k5 f125735d;

    public j5(com.tencent.mm.plugin.finder.search.k5 k5Var) {
        this.f125735d = k5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArr;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.plugin.finder.assist.e9 e9Var = com.tencent.mm.plugin.finder.assist.e9.f102132a;
        sb6.append(com.tencent.mm.plugin.finder.assist.e9.f102145n);
        sb6.append("ringtone-search-history.info");
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(sb7);
        synchronized (this.f125735d) {
            try {
                com.tencent.mm.plugin.finder.search.k5 k5Var = com.tencent.mm.plugin.finder.search.k5.f125747a;
                bArr = com.tencent.mm.plugin.finder.search.k5.f125748b.toByteArray();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FinderSearchHistoryLogic", e17, "", new java.lang.Object[0]);
                bArr = null;
            }
        }
        if (bArr == null) {
            return;
        }
        if (!com.tencent.mm.vfs.w6.j(java.lang.String.valueOf(r6Var.s()))) {
            com.tencent.mm.vfs.w6.u(java.lang.String.valueOf(r6Var.s()));
        }
        com.tencent.mm.vfs.w6.S(sb7, bArr, 0, bArr.length);
    }
}
