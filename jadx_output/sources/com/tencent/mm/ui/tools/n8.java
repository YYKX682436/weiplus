package com.tencent.mm.ui.tools;

/* loaded from: classes12.dex */
public class n8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.c9 f210604d;

    public n8(com.tencent.mm.ui.tools.c9 c9Var) {
        this.f210604d = c9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.tools.b9 b9Var = this.f210604d.f210324i;
        if (b9Var != null) {
            b9Var.Z2();
        }
    }
}
