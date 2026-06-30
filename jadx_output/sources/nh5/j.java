package nh5;

/* loaded from: classes10.dex */
public final class j implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.matrix.MatrixBaseLeakResultUI f337153d;

    public j(com.tencent.mm.ui.matrix.MatrixBaseLeakResultUI matrixBaseLeakResultUI) {
        this.f337153d = matrixBaseLeakResultUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(");
        com.tencent.mm.ui.matrix.MatrixBaseLeakResultUI matrixBaseLeakResultUI = this.f337153d;
        sb6.append(matrixBaseLeakResultUI.d);
        sb6.append(')');
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.ui.matrix.MatrixBaseLeakResultUI matrixBaseLeakResultUI2 = this.f337153d;
        if (matrixBaseLeakResultUI2.d <= 0) {
            sb7 = "";
        }
        matrixBaseLeakResultUI2.addTextOptionMenu(1, matrixBaseLeakResultUI.getString(com.tencent.mm.R.string.f490441v5) + sb7, new nh5.i(matrixBaseLeakResultUI), null, matrixBaseLeakResultUI.d <= 0 ? com.tencent.mm.ui.fb.GREEN : com.tencent.mm.ui.fb.NORMAL);
        int i17 = matrixBaseLeakResultUI.d - 1;
        matrixBaseLeakResultUI.d = i17;
        return i17 >= 0;
    }
}
