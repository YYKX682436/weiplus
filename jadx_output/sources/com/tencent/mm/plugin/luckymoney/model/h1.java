package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f145307d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.i1 f145308e;

    public h1(com.tencent.mm.plugin.luckymoney.model.i1 i1Var, android.graphics.Bitmap bitmap) {
        this.f145308e = i1Var;
        this.f145307d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f145308e.f145330a.setImageBitmap(this.f145307d);
    }
}
