package com.tencent.mm.pluginsdk.model;

/* loaded from: classes12.dex */
public class g3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f189320d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.h3 f189321e;

    public g3(com.tencent.mm.pluginsdk.model.h3 h3Var, java.lang.Object obj) {
        this.f189321e = h3Var;
        this.f189320d = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f189321e.f189336e.c(this.f189320d);
    }
}
