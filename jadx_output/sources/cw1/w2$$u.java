package cw1;

/* loaded from: classes12.dex */
public final /* synthetic */ class w2$$u implements cw1.r5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI f223446a;

    public final void a(int[] iArr, long[] jArr) {
        long[] jArr2 = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI.H;
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI cleanChattingBaseUI = this.f223446a;
        cleanChattingBaseUI.getClass();
        java.util.HashSet hashSet = new java.util.HashSet();
        int[] iArr2 = cleanChattingBaseUI.G;
        int i17 = iArr2[0];
        int i18 = iArr[0];
        if (i17 != i18) {
            cleanChattingBaseUI.f95717y = i18;
            cleanChattingBaseUI.E = true;
            hashSet.add(0);
        }
        int i19 = iArr[1];
        long j17 = (i19 < 0 || i19 >= 4) ? -2L : com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI.H[i19];
        if (j17 != cleanChattingBaseUI.f95715w) {
            cleanChattingBaseUI.f95715w = j17;
            cleanChattingBaseUI.D = true;
            hashSet.add(1);
        }
        if (j17 == -1 && !java.util.Arrays.equals(jArr, cleanChattingBaseUI.f95716x)) {
            cleanChattingBaseUI.f95716x = jArr;
            cleanChattingBaseUI.D = true;
            hashSet.add(1);
        }
        int i27 = iArr2[2];
        int i28 = iArr[2];
        if (i27 != i28) {
            cleanChattingBaseUI.f95714v = i28;
            if (cleanChattingBaseUI.d7()) {
                cleanChattingBaseUI.B = cleanChattingBaseUI.f95714v > 2;
            } else {
                cleanChattingBaseUI.B = cleanChattingBaseUI.f95714v > 3;
            }
            cleanChattingBaseUI.C = true;
            hashSet.add(2);
        }
        int i29 = iArr2[3];
        int i37 = iArr[3];
        if (i29 != i37) {
            if (i37 == 1) {
                cleanChattingBaseUI.f95718z = java.lang.Boolean.TRUE;
            } else if (i37 == 2) {
                cleanChattingBaseUI.f95718z = java.lang.Boolean.FALSE;
            } else {
                cleanChattingBaseUI.f95718z = null;
            }
            hashSet.add(3);
        }
        int i38 = iArr2[4];
        int i39 = iArr[4];
        if (i38 != i39) {
            cleanChattingBaseUI.A = i39;
            hashSet.add(4);
        }
        if (hashSet.isEmpty()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanChattingBaseUI", "NewFilter changed: " + hashSet);
        int[] iArr3 = new int[hashSet.size()];
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            iArr3[0] = ((java.lang.Integer) it.next()).intValue();
        }
        java.lang.System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        cleanChattingBaseUI.e7(iArr3);
    }
}
