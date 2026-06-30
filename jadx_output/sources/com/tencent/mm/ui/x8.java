package com.tencent.mm.ui;

/* loaded from: classes.dex */
public class x8 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f212544d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f212545e;

    public x8(com.tencent.mm.ui.z8 z8Var, int i17, android.app.Activity activity) {
        this.f212544d = i17;
        this.f212545e = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = this.f212544d;
        if (i18 == 33) {
            jx3.f.INSTANCE.idkeyStat(462L, 12L, 1L, true);
        } else if (i18 == 97) {
            jx3.f.INSTANCE.idkeyStat(462L, 13L, 1L, true);
        } else {
            jx3.f.INSTANCE.idkeyStat(462L, 14L, 1L, true);
        }
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        j35.u.g(this.f212545e);
        dialogInterface.dismiss();
    }
}
