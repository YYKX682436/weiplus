package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.i0 f161769d;

    public y(com.tencent.mm.plugin.setting.ui.setting.i0 i0Var) {
        this.f161769d = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dp.a.makeText(this.f161769d.getContext(), com.tencent.mm.R.string.i87, 1).show();
    }
}
