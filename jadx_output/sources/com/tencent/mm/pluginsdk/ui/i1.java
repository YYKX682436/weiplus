package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes11.dex */
public class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.n1 f190874d;

    public i1(com.tencent.mm.pluginsdk.ui.n1 n1Var) {
        this.f190874d = n1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f190874d.invalidateSelf();
    }
}
