package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes.dex */
public final class u2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f124248d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.j3 f124249e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f124250f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.ss4 f124251g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(kotlin.jvm.internal.c0 c0Var, com.tencent.mm.plugin.finder.profile.uic.j3 j3Var, yz5.l lVar, r45.ss4 ss4Var) {
        super(0);
        this.f124248d = c0Var;
        this.f124249e = j3Var;
        this.f124250f = lVar;
        this.f124251g = ss4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (this.f124248d.f310112d) {
            this.f124250f.invoke(this.f124251g);
        } else {
            com.tencent.mars.xlog.Log.e("Finder.FinderProfileDraftUIC", "getDetail failed.");
            com.tencent.mm.plugin.finder.profile.uic.j3 j3Var = this.f124249e;
            db5.t7.makeText(j3Var.getContext(), j3Var.getString(com.tencent.mm.R.string.dgq), 0).show();
        }
        return jz5.f0.f302826a;
    }
}
