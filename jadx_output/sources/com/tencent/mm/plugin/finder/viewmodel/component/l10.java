package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class l10 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.g4 f135012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f135013e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.t10 f135014f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l10(db5.g4 g4Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.viewmodel.component.t10 t10Var) {
        super(1);
        this.f135012d = g4Var;
        this.f135013e = baseFinderFeed;
        this.f135014f = t10Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jz5.o it = (jz5.o) obj;
        kotlin.jvm.internal.o.g(it, "it");
        ((java.util.ArrayList) this.f135012d.f228344d).clear();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f135013e;
        boolean checkIsEnableShare = baseFinderFeed.getFeedObject().checkIsEnableShare(103);
        if (!baseFinderFeed.getFeedObject().isPrivate()) {
            if (checkIsEnableShare) {
                this.f135012d.j(103, (java.lang.CharSequence) it.f302842e, com.tencent.mm.R.raw.bottomsheet_icon_moment, 0, checkIsEnableShare);
            } else {
                this.f135012d.j(103, this.f135014f.getContext().getString(com.tencent.mm.R.string.f492075f54), com.tencent.mm.R.raw.bottomsheet_icon_moment, 0, checkIsEnableShare);
            }
        }
        return jz5.f0.f302826a;
    }
}
