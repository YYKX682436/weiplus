package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class uf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f114557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f114558e;

    public uf(int i17, com.tencent.mm.plugin.finder.live.plugin.mg mgVar) {
        this.f114557d = i17;
        this.f114558e = mgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f114557d;
        if (i17 >= 0) {
            com.tencent.mm.plugin.finder.live.plugin.mg mgVar = this.f114558e;
            if (i17 < mgVar.D.f22180m.size()) {
                mgVar.D.notifyItemChanged(i17);
            }
        }
    }
}
