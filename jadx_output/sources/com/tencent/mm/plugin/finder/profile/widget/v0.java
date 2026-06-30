package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class v0 implements i50.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f124797a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.s1 f124798b;

    public v0(r45.h32 h32Var, com.tencent.mm.plugin.finder.profile.widget.s1 s1Var) {
        this.f124797a = h32Var;
        this.f124798b = s1Var;
    }

    @Override // i50.n
    public void a(boolean z17) {
        r45.h32 h32Var = this.f124797a;
        if (zl2.t.a(h32Var) != null) {
            return;
        }
        com.tencent.mm.plugin.finder.profile.widget.s1 s1Var = this.f124798b;
        boolean z18 = s1Var.B;
        r45.q65 q65Var = (r45.q65) h32Var.getCustom(10);
        boolean z19 = q65Var != null && q65Var.getBoolean(0);
        androidx.appcompat.app.AppCompatActivity appCompatActivity = s1Var.f124718b;
        if (z18) {
            db5.t7.m(appCompatActivity, appCompatActivity.getString(com.tencent.mm.R.string.e0o));
            return;
        }
        java.lang.String string = z19 ? appCompatActivity.getString(com.tencent.mm.R.string.e0k) : appCompatActivity.getString(com.tencent.mm.R.string.e0j);
        kotlin.jvm.internal.o.d(string);
        db5.t7.m(appCompatActivity, string);
    }
}
