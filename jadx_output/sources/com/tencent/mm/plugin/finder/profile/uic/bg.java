package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class bg extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC f123570d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC) {
        super(0);
        this.f123570d = finderProfileTabUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC = this.f123570d;
        android.app.Activity context = finderProfileTabUIC.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (((com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).isSelf()) {
            android.app.Activity context2 = finderProfileTabUIC.getContext();
            kotlin.jvm.internal.o.g(context2, "context");
            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            if (((com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).isSelfFlag()) {
                z17 = true;
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
