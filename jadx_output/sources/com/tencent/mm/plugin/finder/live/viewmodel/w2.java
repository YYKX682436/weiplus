package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class w2 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.z2 f117508a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.l2 f117509b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.x2 f117510c;

    public w2(com.tencent.mm.plugin.finder.live.viewmodel.z2 z2Var, com.tencent.mm.plugin.finder.live.viewmodel.l2 l2Var, com.tencent.mm.plugin.finder.live.viewmodel.x2 x2Var) {
        this.f117508a = z2Var;
        this.f117509b = l2Var;
        this.f117510c = x2Var;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        com.tencent.mm.plugin.finder.live.viewmodel.z2 z2Var = this.f117508a;
        z2Var.f117566p = true;
        this.f117509b.f117214d = z17;
        if (z2Var.f117561h) {
            kotlinx.coroutines.l.d(z2Var.f117565o, null, null, new com.tencent.mm.plugin.finder.live.viewmodel.v2(z2Var, null), 3, null);
        }
        this.f117510c.notifyDataSetChanged();
    }
}
