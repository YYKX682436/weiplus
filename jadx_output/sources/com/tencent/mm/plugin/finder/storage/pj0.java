package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes2.dex */
public final class pj0 extends com.tencent.mm.plugin.finder.storage.jj0 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f127378d;

    /* renamed from: e, reason: collision with root package name */
    public final int f127379e;

    /* renamed from: f, reason: collision with root package name */
    public int f127380f;

    public pj0(boolean z17) {
        super(0, null, 3, null);
        this.f127378d = z17;
        this.f127379e = z17 ? 3 : 2;
    }

    @Override // com.tencent.mm.plugin.finder.storage.jj0, com.tencent.mm.plugin.finder.storage.vj0
    public androidx.recyclerview.widget.p2 c() {
        return new com.tencent.mm.plugin.finder.storage.oj0(this);
    }

    @Override // com.tencent.mm.plugin.finder.storage.jj0
    public int f() {
        return this.f127379e;
    }
}
