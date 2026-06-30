package com.tencent.mm.plugin.websearch;

/* loaded from: classes.dex */
public class m0 implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f181566d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.q0 f181567e;

    public m0(com.tencent.mm.plugin.websearch.q0 q0Var, int i17) {
        this.f181567e = q0Var;
        this.f181566d = i17;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        if (com.tencent.mm.sdk.platformtools.s9.f192975c) {
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.websearch.l0(this));
        }
        r45.e64 i18 = su4.r2.i();
        if (i18 != null) {
            ((jw4.e) ((zg0.l3) i95.n0.c(zg0.l3.class))).Ai(this.f181566d, this.f181567e.h(i18).toString());
            return false;
        }
        ((jw4.e) ((zg0.l3) i95.n0.c(zg0.l3.class))).Ai(this.f181566d, "");
        return false;
    }
}
