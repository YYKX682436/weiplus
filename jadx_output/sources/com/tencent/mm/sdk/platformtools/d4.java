package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class d4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.l4 f192523d;

    public d4(com.tencent.mm.sdk.platformtools.l4 l4Var) {
        this.f192523d = l4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f192523d) {
            com.tencent.mm.sdk.platformtools.l4.a(this.f192523d);
        }
    }
}
