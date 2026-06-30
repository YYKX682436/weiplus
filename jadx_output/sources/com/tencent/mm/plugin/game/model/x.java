package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f140508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f140509e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f140510f;

    public x(com.tencent.mm.plugin.game.model.b0 b0Var, int i17, java.lang.String str, boolean z17) {
        this.f140508d = i17;
        this.f140509e = str;
        this.f140510f = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Set set = com.tencent.mm.plugin.game.model.b0.f140225b;
        synchronized (set) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.game.model.z) it.next()).a(this.f140508d, this.f140509e, this.f140510f);
            }
        }
    }
}
