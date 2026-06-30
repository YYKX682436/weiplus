package com.tencent.mm.pluginsdk.model;

/* loaded from: classes8.dex */
public class i3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f189343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.j3 f189344e;

    public i3(com.tencent.mm.pluginsdk.model.j3 j3Var, java.lang.Object[] objArr) {
        this.f189344e = j3Var;
        this.f189343d = objArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f189344e.e(this.f189343d);
    }
}
