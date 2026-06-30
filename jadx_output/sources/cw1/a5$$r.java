package cw1;

/* loaded from: classes12.dex */
public final /* synthetic */ class a5$$r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI f222773d;

    public /* synthetic */ a5$$r(com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI cleanChattingOldUI) {
        this.f222773d = cleanChattingOldUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long[] jArr = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI.B;
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI cleanChattingOldUI = this.f222773d;
        long[] T6 = cleanChattingOldUI.T6();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long[] jArr2 = new long[3];
        java.util.Map a17 = cw1.i.a(new int[][]{null, ot1.h.Q, ot1.h.T, ot1.h.Z, ot1.h.f348841x1}, 0, T6[0], T6[1], false, jArr2, null);
        if (a17 == null) {
            a17 = java.util.Collections.emptyMap();
        } else {
            mt1.b0.s(5, java.lang.System.currentTimeMillis() - currentTimeMillis, java.lang.Long.valueOf(jArr2[0] + jArr2[1]), java.lang.Long.valueOf(jArr2[0]), java.lang.Long.valueOf(jArr2[2]), java.lang.Long.valueOf(((java.util.HashMap) a17).size()));
        }
        cleanChattingOldUI.f95750r = a17;
        cleanChattingOldUI.W6();
    }
}
