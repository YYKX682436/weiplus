package com.tencent.mm.plugin.profile;

/* loaded from: classes11.dex */
public class b1 implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f153390a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.r f153391b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.e0 f153392c;

    public b1(com.tencent.mm.plugin.profile.e0 e0Var, boolean z17, com.tencent.mm.ui.base.preference.r rVar) {
        this.f153392c = e0Var;
        this.f153390a = z17;
        this.f153391b = rVar;
    }

    @Override // zy2.i5
    public void a(java.lang.Object obj) {
        boolean z17 = this.f153390a;
        com.tencent.mm.ui.base.preference.r rVar = this.f153391b;
        com.tencent.mm.plugin.profile.e0 e0Var = this.f153392c;
        if (z17) {
            e0Var.v(rVar, null);
        }
        e0Var.w(rVar, null);
    }
}
