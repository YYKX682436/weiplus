package com.tencent.mm.storage;

/* loaded from: classes12.dex */
public class l5 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.n5 f195087d;

    public l5(com.tencent.mm.storage.n5 n5Var) {
        this.f195087d = n5Var;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        if (str == null || !gm0.j1.a()) {
            return;
        }
        com.tencent.mm.storage.n5 n5Var = this.f195087d;
        n5Var.f195180r.l(true);
        n5Var.f195180r.n(true);
        n5Var.f195180r.m(true);
    }
}
