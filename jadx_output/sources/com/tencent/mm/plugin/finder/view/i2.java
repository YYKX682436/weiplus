package com.tencent.mm.plugin.finder.view;

/* loaded from: classes.dex */
public final class i2 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f132281a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f132282b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f132283c;

    public i2(android.content.Context context, java.lang.String str, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f132281a = context;
        this.f132282b = str;
        this.f132283c = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        com.tencent.mm.plugin.finder.view.l2.f132537a.a(this.f132281a, this.f132282b, "complete_copy_videoid", "view_clk");
        this.f132283c.B();
    }
}
