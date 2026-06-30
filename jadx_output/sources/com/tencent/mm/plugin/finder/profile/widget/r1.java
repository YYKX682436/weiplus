package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class r1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f124700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.s1 f124701e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124702f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f124703g;

    public r1(r45.h32 h32Var, com.tencent.mm.plugin.finder.profile.widget.s1 s1Var, java.lang.String str, yz5.a aVar) {
        this.f124700d = h32Var;
        this.f124701e = s1Var;
        this.f124702f = str;
        this.f124703g = aVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 4) {
            r45.h32 h32Var = this.f124700d;
            h32Var.set(1, 1);
            cl0.g gVar = new cl0.g();
            gVar.s("source_type", 0);
            gVar.o("notice_type", 1);
            com.tencent.mm.plugin.finder.profile.widget.s1 s1Var = this.f124701e;
            gVar.s("ref_page_type", s1Var.H);
            c50.c1 c1Var = (c50.c1) i95.n0.c(c50.c1.class);
            ml2.i5 i5Var = ml2.i5.f327572g;
            java.lang.String str = s1Var.f124722f;
            java.lang.String string = h32Var.getString(3);
            if (string == null) {
                string = "";
            }
            java.lang.String string2 = h32Var.getString(4);
            java.lang.String gVar2 = gVar.toString();
            long e17 = s1Var.e();
            int d17 = s1Var.d();
            kotlin.jvm.internal.o.d(c1Var);
            c50.c1.l9(c1Var, i5Var, this.f124702f, 0L, 0, str, null, null, null, null, string, gVar2, string2, null, e17, d17, null, 37344, null);
            this.f124703g.invoke();
            androidx.appcompat.app.AppCompatActivity appCompatActivity = s1Var.f124718b;
            db5.t7.i(appCompatActivity, appCompatActivity.getString(com.tencent.mm.R.string.cn8), com.tencent.mm.R.raw.icons_filled_done);
        }
    }
}
