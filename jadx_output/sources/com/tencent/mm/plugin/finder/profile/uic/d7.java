package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class d7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f123614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.s13 f123615e;

    public d7(com.tencent.mm.plugin.finder.profile.uic.ob obVar, r45.s13 s13Var) {
        this.f123614d = obVar;
        this.f123615e = s13Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f123614d;
        r45.s13 s13Var = this.f123615e;
        obVar.H7(s13Var, false);
        obVar.Q6(s13Var);
    }
}
