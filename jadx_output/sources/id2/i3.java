package id2;

/* loaded from: classes2.dex */
public final class i3 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f290614a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f290615b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.lo1 f290616c;

    public i3(java.lang.String str, id2.u3 u3Var, r45.lo1 lo1Var) {
        this.f290614a = str;
        this.f290615b = u3Var;
        this.f290616c = lo1Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            java.lang.String str2 = this.f290614a;
            int i17 = ((str2.length() > 0) && ll2.e.f319133a.h(str2)) ? 1 : 0;
            com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
            android.app.Activity context = this.f290615b.getContext();
            com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = context instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) context : null;
            if (mMFinderUI == null || (str = java.lang.Integer.valueOf(mMFinderUI.getD()).toString()) == null) {
                str = "";
            }
            java.lang.String str3 = str;
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            java.lang.String b17 = b52.b.b();
            ml2.u1 u1Var = ml2.u1.f328040e;
            a4Var.a(str3, "", b17, "person_page_ext_entrance", "{\"entrance_id\":\"" + this.f290616c.getInteger(2) + "\";\"is_reddot\":\"" + i17 + "\"}");
        }
    }
}
