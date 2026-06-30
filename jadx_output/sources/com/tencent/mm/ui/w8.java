package com.tencent.mm.ui;

/* loaded from: classes.dex */
public class w8 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f211212d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f211213e;

    public w8(com.tencent.mm.ui.z8 z8Var, int i17, android.app.Activity activity) {
        this.f211212d = i17;
        this.f211213e = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = this.f211212d;
        if (i18 == 32) {
            jx3.f.INSTANCE.idkeyStat(462L, 6L, 1L, true);
        } else if (i18 == 96) {
            jx3.f.INSTANCE.idkeyStat(462L, 7L, 1L, true);
        } else {
            jx3.f.INSTANCE.idkeyStat(462L, 8L, 1L, true);
        }
        dialogInterface.dismiss();
        this.f211213e.finish();
    }
}
