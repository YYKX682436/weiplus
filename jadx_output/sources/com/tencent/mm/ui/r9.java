package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class r9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.s9 f209603d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f209604e;

    public r9(com.tencent.mm.ui.s9 s9Var, java.lang.String str) {
        this.f209603d = s9Var;
        this.f209604e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f209603d.j(this.f209604e);
    }
}
