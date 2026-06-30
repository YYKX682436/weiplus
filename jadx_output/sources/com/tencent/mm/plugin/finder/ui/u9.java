package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class u9 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderLiveShareProductUI f129907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.zc4 f129908e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f129909f;

    public u9(com.tencent.mm.plugin.finder.ui.FinderLiveShareProductUI finderLiveShareProductUI, r45.zc4 zc4Var, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f129907d = finderLiveShareProductUI;
        this.f129908e = zc4Var;
        this.f129909f = k0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        com.tencent.mm.plugin.finder.ui.FinderLiveShareProductUI finderLiveShareProductUI = this.f129907d;
        if (valueOf == null || valueOf.intValue() != 0) {
            if (valueOf != null && valueOf.intValue() == 1) {
                finderLiveShareProductUI.setResult(1);
                finderLiveShareProductUI.finish();
            } else {
                r45.zc4 zc4Var = this.f129908e;
                if (valueOf != null && valueOf.intValue() == 2) {
                    az2.f a17 = az2.c.a(az2.f.f16125d, this.f129907d, null, 0L, null, 14, null);
                    a17.a();
                    r45.zm4 zm4Var = new r45.zm4();
                    zm4Var.set(1, zc4Var.getString(0));
                    zm4Var.set(2, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.b8.c(zc4Var.getString(2))));
                    zm4Var.set(3, zc4Var.getString(8));
                    zm4Var.set(5, zc4Var.getString(27));
                    pq5.g l17 = zm4Var.d().l();
                    kotlin.jvm.internal.o.f(l17, "run(...)");
                    pm0.v.T(l17, new com.tencent.mm.plugin.finder.ui.t9(a17, finderLiveShareProductUI));
                } else if (valueOf != null && valueOf.intValue() == 3) {
                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                    ya2.e1 e1Var = ya2.e1.f460472a;
                    androidx.appcompat.app.AppCompatActivity context = finderLiveShareProductUI.getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    java.lang.String string = zc4Var.getString(12);
                    java.lang.String str = string == null ? "" : string;
                    java.lang.String string2 = zc4Var.getString(13);
                    e1Var.K(context, str, "", string2 == null ? "" : string2, "");
                }
            }
        }
        this.f129909f.u();
        finderLiveShareProductUI.finish();
    }
}
