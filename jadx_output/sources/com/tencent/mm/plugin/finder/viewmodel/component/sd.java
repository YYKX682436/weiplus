package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class sd implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.yd f135890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f135891e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f135892f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f135893g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f135894h;

    public sd(com.tencent.mm.plugin.finder.viewmodel.component.yd ydVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, xc2.p0 p0Var, java.lang.String str, java.lang.String str2) {
        this.f135890d = ydVar;
        this.f135891e = baseFinderFeed;
        this.f135892f = p0Var;
        this.f135893g = str;
        this.f135894h = str2;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        if (!((java.lang.Boolean) obj2).booleanValue()) {
            this.f135890d.i7(this.f135891e, this.f135892f, this.f135893g, this.f135894h, (r18 & 16) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null);
        }
        return jz5.f0.f302826a;
    }
}
