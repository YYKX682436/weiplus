package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class l0 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.o0 f132535d;

    public l0(com.tencent.mm.plugin.finder.view.o0 o0Var) {
        this.f132535d = o0Var;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.kh2 req = (r45.kh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        int integer = ret.getInteger(1);
        com.tencent.mm.plugin.finder.view.o0 o0Var = this.f132535d;
        if (integer == 0) {
            o0Var.f132755f.f410703d.u0().setBlacklist_flag(0);
            com.tencent.mars.xlog.Log.i("CommentMenuItemSelectListener", "comment black list succ");
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            android.content.Context context = o0Var.f132753d;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.b(com.tencent.mm.R.raw.icons_filled_check_mark);
            e4Var.f211776c = context.getString(com.tencent.mm.R.string.f1s);
            e4Var.c();
            return;
        }
        o0Var.f132755f.f410703d.u0().setBlacklist_flag(1);
        com.tencent.mars.xlog.Log.i("CommentMenuItemSelectListener", "comment black list failed:" + ret.getInteger(1));
        int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        android.content.Context context2 = o0Var.f132753d;
        com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context2);
        e4Var2.b(com.tencent.mm.R.raw.icons_filled_check_mark);
        e4Var2.f211776c = context2.getString(com.tencent.mm.R.string.f1t);
        e4Var2.c();
    }
}
