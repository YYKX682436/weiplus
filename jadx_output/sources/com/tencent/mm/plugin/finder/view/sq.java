package com.tencent.mm.plugin.finder.view;

/* loaded from: classes.dex */
public final class sq implements ek2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f133074a;

    public sq(android.content.Context context) {
        this.f133074a = context;
    }

    @Override // ek2.f
    public void a(r45.ng1 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        android.content.Context context = this.f133074a;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = context.getString(com.tencent.mm.R.string.lyx);
        e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
        e4Var.c();
    }

    @Override // ek2.f
    public void b(int i17, int i18, java.lang.String str) {
        boolean z17 = str == null || str.length() == 0;
        android.content.Context context = this.f133074a;
        if (z17) {
            str = context.getResources().getString(com.tencent.mm.R.string.dq_);
        }
        int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = str;
        e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
        e4Var.c();
    }
}
