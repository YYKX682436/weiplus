package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class g5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.k5 f112634d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f112635e;

    public g5(com.tencent.mm.plugin.finder.live.plugin.k5 k5Var, android.view.ViewGroup viewGroup) {
        this.f112634d = k5Var;
        this.f112635e = viewGroup;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.live.plugin.k5 k5Var = this.f112634d;
        if (itemId == 0) {
            if (!k5Var.f113194s) {
                k5Var.t1();
                return;
            }
            android.view.ViewGroup viewGroup = k5Var.f365323d;
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(viewGroup.getContext());
            u1Var.g(viewGroup.getContext().getString(com.tencent.mm.R.string.ceb));
            u1Var.a(true);
            u1Var.m(com.tencent.mm.R.string.gdu);
            u1Var.k(android.graphics.Color.parseColor("#FF6146"));
            u1Var.j(viewGroup.getContext().getString(com.tencent.mm.R.string.ecb));
            u1Var.b(new com.tencent.mm.plugin.finder.live.plugin.h5(k5Var));
            u1Var.q(false);
            return;
        }
        if (itemId == 2) {
            if (!((mm2.c1) k5Var.P0(mm2.c1.class)).Y4) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("PARAM_FINDER_LIVE_LIVE_FINISH_MANUAL", true);
                bundle.putBoolean("PARAM_FINDER_LIVE_LIVE_FINISH_IF_CLOSE_LIVE", false);
                k5Var.f113191p.statusChange(qo0.b.H, bundle);
                return;
            }
            h63.s1 s1Var = (h63.s1) i95.n0.c(h63.s1.class);
            android.view.ViewGroup viewGroup2 = this.f112635e;
            android.content.Context context = viewGroup2.getContext();
            java.lang.String str = ((mm2.c1) k5Var.P0(mm2.c1.class)).f328783b5;
            if (str == null && (str = ((mm2.e1) k5Var.P0(mm2.e1.class)).f328988r.getString(22)) == null) {
                str = "";
            }
            int i18 = ((mm2.c1) k5Var.P0(mm2.c1.class)).f328788c5;
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            ((h63.g1) s1Var).Di(context, str, i18, bool, bool, java.lang.Long.valueOf(((mm2.e1) k5Var.P0(mm2.e1.class)).f328988r.getLong(0)));
            android.content.Context context2 = viewGroup2.getContext();
            androidx.appcompat.app.AppCompatActivity appCompatActivity = context2 instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) context2 : null;
            if (appCompatActivity != null) {
                appCompatActivity.finish();
            }
        }
    }
}
