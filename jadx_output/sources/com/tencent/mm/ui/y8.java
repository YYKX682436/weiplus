package com.tencent.mm.ui;

/* loaded from: classes.dex */
public class y8 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f212579d;

    public y8(com.tencent.mm.ui.z8 z8Var, int i17) {
        this.f212579d = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = this.f212579d;
        if (i18 == 33) {
            jx3.f.INSTANCE.idkeyStat(462L, 15L, 1L, true);
        } else if (i18 == 97) {
            jx3.f.INSTANCE.idkeyStat(462L, 16L, 1L, true);
        } else {
            jx3.f.INSTANCE.idkeyStat(462L, 17L, 1L, true);
        }
        dialogInterface.dismiss();
    }
}
