package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public class k extends android.os.CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.model.m f213924a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.wallet_core.model.m mVar, long j17, long j18) {
        super(j17, j18);
        this.f213924a = mVar;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        com.tencent.mm.wallet_core.model.l lVar = this.f213924a.f213936c;
        if (lVar != null) {
            com.tencent.mm.plugin.offline.ui.k kVar = (com.tencent.mm.plugin.offline.ui.k) lVar;
            android.widget.Button button = kVar.f152657a;
            button.setText(com.tencent.mm.R.string.f490454vi);
            button.setEnabled(true);
            kVar.f152658b.f152478i = null;
        }
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j17) {
        com.tencent.mm.wallet_core.model.l lVar = this.f213924a.f213936c;
        if (lVar != null) {
            com.tencent.mm.plugin.offline.ui.k kVar = (com.tencent.mm.plugin.offline.ui.k) lVar;
            kVar.getClass();
            int round = (int) java.lang.Math.round(j17 / 1000.0d);
            android.widget.Button button = kVar.f152657a;
            if (round == 0) {
                button.setText(com.tencent.mm.R.string.f490454vi);
            } else {
                button.setText(java.lang.String.format("%s(%ss)", com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490454vi), java.lang.Integer.valueOf(round)));
            }
        }
    }
}
