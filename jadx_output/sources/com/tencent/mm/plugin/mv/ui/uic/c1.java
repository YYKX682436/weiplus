package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class c1 implements pk4.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.e1 f151071a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f151072b;

    public c1(com.tencent.mm.plugin.mv.ui.uic.e1 e1Var, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        this.f151071a = e1Var;
        this.f151072b = appCompatActivity;
    }

    @Override // pk4.u
    public void a(int i17, dk4.a targetMedia) {
        kotlin.jvm.internal.o.g(targetMedia, "targetMedia");
        pm0.v.X(new com.tencent.mm.plugin.mv.ui.uic.b1(this.f151071a, targetMedia, this, this.f151072b));
    }
}
