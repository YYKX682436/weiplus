package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes.dex */
public final class i2 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.k2 f117137d;

    public i2(com.tencent.mm.plugin.finder.live.viewmodel.k2 k2Var) {
        this.f117137d = k2Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.finder.live.viewmodel.k2 k2Var = this.f117137d;
        int i17 = k2Var.f117177e - 1;
        k2Var.f117177e = i17;
        android.widget.Button button = k2Var.f117181i;
        if (button != null) {
            button.setText(i17 <= 0 ? k2Var.getResources().getString(com.tencent.mm.R.string.e5q) : k2Var.getResources().getString(com.tencent.mm.R.string.e5p, java.lang.Integer.valueOf(k2Var.f117177e)));
        }
        if (k2Var.f117177e > 0) {
            return true;
        }
        android.widget.Button button2 = k2Var.f117181i;
        if (button2 == null) {
            return false;
        }
        button2.setEnabled(true);
        return false;
    }
}
