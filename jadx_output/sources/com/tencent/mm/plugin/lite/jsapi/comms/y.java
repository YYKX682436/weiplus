package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public class y implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f143828a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f143829b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.a0 f143830c;

    public y(com.tencent.mm.plugin.lite.jsapi.comms.a0 a0Var, android.app.Activity activity, android.content.Intent intent) {
        this.f143830c = a0Var;
        this.f143828a = activity;
        this.f143829b = intent;
    }

    @Override // j35.b0
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        com.tencent.mm.plugin.lite.jsapi.comms.a0 a0Var = this.f143830c;
        if (i17 != 64) {
            a0Var.f143443f.a("wrong request code");
            return;
        }
        if (strArr.length != 1 || !strArr[0].equals("android.permission.ACCESS_FINE_LOCATION")) {
            a0Var.f143443f.a("wrong permission");
            return;
        }
        if (iArr.length != 1) {
            a0Var.f143443f.a("wrong grant results");
            return;
        }
        int i18 = iArr[0];
        final android.app.Activity activity = this.f143828a;
        if (i18 != 0) {
            a0Var.f143443f.a("permission not granted");
            db5.e1.C(activity, activity.getString(com.tencent.mm.R.string.mta), activity.getString(com.tencent.mm.R.string.mt_), activity.getString(com.tencent.mm.R.string.mbp), activity.getString(com.tencent.mm.R.string.mbl), false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.lite.jsapi.comms.y$$a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i19) {
                    dialogInterface.dismiss();
                    ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                    j35.u.g(activity);
                }
            }, new com.tencent.mm.plugin.lite.jsapi.comms.y$$b());
        } else {
            a0Var.getClass();
            nf.g.a(activity).f(new com.tencent.mm.plugin.lite.jsapi.comms.z(a0Var));
            j45.l.n(activity, ya.b.LOCATION, ".ui.RedirectUI", this.f143829b, a0Var.f143496g);
        }
    }
}
