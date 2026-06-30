package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class a2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean[] f173709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.j2 f173710e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f173711f;

    public a2(boolean[] zArr, com.tencent.mm.plugin.textstatus.ui.j2 j2Var, yz5.a aVar) {
        this.f173709d = zArr;
        this.f173710e = j2Var;
        this.f173711f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean[] zArr = this.f173709d;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        com.tencent.mars.xlog.Log.w("MicroMsg.TextStatus.MultipleTextStatusCardDialog", "dismissWithCompletion: fallback timer triggered");
        com.tencent.mm.plugin.textstatus.ui.j2.b(this.f173710e, this.f173711f);
    }
}
