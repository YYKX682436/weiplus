package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.s1 f124788d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f124789e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124790f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.tencent.mm.plugin.finder.profile.widget.s1 s1Var, r45.h32 h32Var, java.lang.String str) {
        super(0);
        this.f124788d = s1Var;
        this.f124789e = h32Var;
        this.f124790f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.profile.widget.s1 s1Var = this.f124788d;
        boolean z17 = s1Var.f124720d;
        r45.h32 h32Var = this.f124789e;
        if (z17 && zl2.t.d(h32Var, this.f124790f)) {
            androidx.appcompat.app.AppCompatActivity appCompatActivity = s1Var.f124718b;
            db5.t7.m(appCompatActivity, appCompatActivity.getString(com.tencent.mm.R.string.dzx));
        } else if (!zl2.t.e(h32Var)) {
            s1Var.f124728l.performClick();
        }
        return jz5.f0.f302826a;
    }
}
