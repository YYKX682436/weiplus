package com.tencent.mm.plugin.music.ui;

/* loaded from: classes11.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f150769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f150770e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.music.ui.u f150771f;

    public o(com.tencent.mm.plugin.music.ui.u uVar, int i17, long j17) {
        this.f150771f = uVar;
        this.f150769d = i17;
        this.f150770e = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = (android.view.View) this.f150771f.f150802m.get(java.lang.Integer.valueOf(this.f150769d));
        if (view != null) {
            ((com.tencent.mm.plugin.music.ui.t) view.getTag()).f150787i.setCurrentTime(this.f150770e);
        }
    }
}
