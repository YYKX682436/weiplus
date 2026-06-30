package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public class v1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f196270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.b2 f196271b;

    public v1(com.tencent.mm.storage.b2 b2Var, long j17) {
        this.f196271b = b2Var;
        this.f196270a = j17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.System.currentTimeMillis();
        com.tencent.mm.storage.b2 b2Var = this.f196271b;
        long j17 = this.f196270a;
        if (b2Var.i1(j17) <= 0) {
            return null;
        }
        b2Var.f193763d.A("BizTimeLineInfo", "update BizTimeLineInfo set hasShow = 1 where orderFlag >= " + (j17 & (-4294967296L)) + " and hasShow < 1 ");
        java.lang.System.currentTimeMillis();
        return null;
    }
}
