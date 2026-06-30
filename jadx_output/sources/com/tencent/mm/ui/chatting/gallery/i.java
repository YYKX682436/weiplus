package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class i implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f201011e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f201012f;

    public i(java.lang.String str, com.tencent.mm.storage.f9 f9Var, long j17) {
        this.f201010d = str;
        this.f201011e = f9Var;
        this.f201012f = j17;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).getClass();
        boolean z17 = false;
        if (t21.d3.h(this.f201010d) != null) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.lang.Long l17 = com.tencent.mm.ui.chatting.gallery.l.f201166d;
            if (l17 != null && l17.longValue() == this.f201012f) {
                z17 = true;
            }
            z17 = com.tencent.mm.ui.chatting.gallery.k1.l(context, this.f201011e, z17);
        }
        return z17 ? "Success" : "Fail";
    }
}
