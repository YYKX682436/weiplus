package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes10.dex */
public final class u implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.b0 f154600a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f154601b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f154602c;

    public u(com.tencent.mm.plugin.profile.ui.tab.b0 b0Var, boolean z17, java.lang.String str) {
        this.f154600a = b0Var;
        this.f154601b = z17;
        this.f154602c = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.profile.ui.tab.b0 b0Var = this.f154600a;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = b0Var.f154246o;
        if (u3Var != null && u3Var.isShowing()) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var2 = b0Var.f154246o;
            kotlin.jvm.internal.o.d(u3Var2);
            u3Var2.dismiss();
        }
        if (b0Var.f154232a.isFinishing()) {
            com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogic", "activity.isFinishing");
            return java.lang.Boolean.TRUE;
        }
        com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogic", "reserve: cgi result: type = %s, code = %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        int i17 = fVar.f70615a;
        android.content.Context context = b0Var.f154244m;
        boolean z17 = this.f154601b;
        if (i17 != 0 || fVar.f70616b != 0) {
            java.lang.String string = z17 ? context.getString(com.tencent.mm.R.string.e1o) : context.getString(com.tencent.mm.R.string.e07);
            kotlin.jvm.internal.o.d(string);
            android.widget.Toast makeText = db5.t7.makeText(context, string, 0);
            makeText.setGravity(17, 0, 0);
            makeText.show();
            return java.lang.Boolean.TRUE;
        }
        com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogic", "cgi ok,  " + z17);
        java.lang.String finderUserName = this.f154602c;
        if (z17) {
            com.tencent.mm.plugin.finder.feed.model.i1 i1Var = com.tencent.mm.plugin.finder.feed.model.i1.f107930a;
            kotlin.jvm.internal.o.f(finderUserName, "$finderUserName");
            r45.mk mkVar = b0Var.f154245n;
            kotlin.jvm.internal.o.d(mkVar);
            java.lang.String notice_id = mkVar.f380599g;
            kotlin.jvm.internal.o.f(notice_id, "notice_id");
            r45.h32 e17 = i1Var.e(finderUserName, notice_id);
            if (e17 != null) {
                e17.set(1, 0);
            }
            android.widget.Toast makeText2 = db5.t7.makeText(context, context.getString(com.tencent.mm.R.string.e0j), 0);
            makeText2.setGravity(17, 0, 0);
            makeText2.show();
        } else {
            com.tencent.mm.plugin.finder.feed.model.i1 i1Var2 = com.tencent.mm.plugin.finder.feed.model.i1.f107930a;
            kotlin.jvm.internal.o.f(finderUserName, "$finderUserName");
            r45.mk mkVar2 = b0Var.f154245n;
            kotlin.jvm.internal.o.d(mkVar2);
            java.lang.String notice_id2 = mkVar2.f380599g;
            kotlin.jvm.internal.o.f(notice_id2, "notice_id");
            r45.h32 e18 = i1Var2.e(finderUserName, notice_id2);
            if (e18 != null) {
                e18.set(1, 1);
            }
            db5.t7.i(context, context.getResources().getString(com.tencent.mm.R.string.cn8), com.tencent.mm.R.raw.icons_filled_done);
        }
        b0Var.e(z17);
        return java.lang.Boolean.TRUE;
    }
}
