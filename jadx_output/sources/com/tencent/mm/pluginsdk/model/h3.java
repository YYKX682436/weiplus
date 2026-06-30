package com.tencent.mm.pluginsdk.model;

/* loaded from: classes12.dex */
public class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f189335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.j3 f189336e;

    public h3(com.tencent.mm.pluginsdk.model.j3 j3Var, java.lang.Object[] objArr) {
        this.f189336e = j3Var;
        this.f189335d = objArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Object[] objArr = this.f189335d;
        com.tencent.mm.pluginsdk.model.j3 j3Var = this.f189336e;
        j3Var.f189349b.post(new com.tencent.mm.pluginsdk.model.g3(this, j3Var.a(objArr)));
    }
}
