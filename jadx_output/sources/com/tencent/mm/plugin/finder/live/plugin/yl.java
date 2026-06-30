package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class yl extends androidx.recyclerview.widget.t0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bm2.a4 f115212c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f115213d;

    public yl(bm2.a4 a4Var, kotlin.jvm.internal.f0 f0Var) {
        this.f115212c = a4Var;
        this.f115213d = f0Var;
    }

    @Override // androidx.recyclerview.widget.t0
    public int c(int i17) {
        if (this.f115212c.getItemViewType(i17) == 0) {
            return 1;
        }
        return this.f115213d.f310116d;
    }
}
