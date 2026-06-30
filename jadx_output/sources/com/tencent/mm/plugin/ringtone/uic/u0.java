package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class u0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f158493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.v0 f158494e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ox3.a f158495f;

    public u0(java.lang.String str, com.tencent.mm.plugin.ringtone.uic.v0 v0Var, ox3.a aVar) {
        this.f158493d = str;
        this.f158494e = v0Var;
        this.f158495f = aVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        cy3.f[] fVarArr = cy3.f.f224774d;
        com.tencent.mm.plugin.ringtone.uic.v0 v0Var = this.f158494e;
        if (itemId == 0) {
            java.lang.String str = this.f158493d;
            vx3.i a17 = qx3.b.a(this.f158495f.getItemId());
            boolean z17 = (a17 == null || a17.f441301r == null || a17.i().f257604b == null || !co4.c.b(a17.i())) ? false : true;
            androidx.appcompat.app.AppCompatActivity activity = v0Var.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((com.tencent.mm.plugin.ringtone.uic.d3) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.d3.class)).R6(a17, str, z17);
            androidx.appcompat.app.AppCompatActivity activity2 = v0Var.getActivity();
            kotlin.jvm.internal.o.g(activity2, "activity");
            mx3.s.a(mx3.u.f332620f, v0Var.getActivity(), 2, str, ((com.tencent.mm.plugin.ringtone.uic.v) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.ringtone.uic.v.class)).f158499e, false, null, 48, null);
            return;
        }
        cy3.f[] fVarArr2 = cy3.f.f224774d;
        if (itemId == 1) {
            java.lang.String str2 = this.f158493d;
            if (str2 == null) {
                v0Var.getClass();
                return;
            }
            androidx.appcompat.app.AppCompatActivity activity3 = v0Var.getActivity();
            kotlin.jvm.internal.o.g(activity3, "activity");
            com.tencent.mm.plugin.ringtone.uic.b0 b0Var = (com.tencent.mm.plugin.ringtone.uic.b0) pf5.z.f353948a.a(activity3).a(com.tencent.mm.plugin.ringtone.uic.b0.class);
            b0Var.getClass();
            com.tencent.mm.ui.widget.dialog.u3 f17 = com.tencent.mm.ui.widget.dialog.u3.f(b0Var.getContext(), b0Var.getContext().getResources().getString(com.tencent.mm.R.string.bon), false, 3, null);
            f17.show();
            kotlinx.coroutines.l.d(b0Var.getLifecycleScope(), null, null, new com.tencent.mm.plugin.ringtone.uic.z(str2, b0Var, f17, null), 3, null);
        }
    }
}
