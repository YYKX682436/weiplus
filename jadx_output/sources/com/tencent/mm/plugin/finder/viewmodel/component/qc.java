package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class qc extends com.tencent.mm.plugin.finder.viewmodel.component.mb0 implements zy2.z6 {

    /* renamed from: f, reason: collision with root package name */
    public final so2.c f135690f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f135690f = so2.c.f410277d;
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    public android.view.View R6(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        return holder.p(com.tencent.mm.R.id.f484483ee0);
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    public so2.c S6() {
        return this.f135690f;
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    public void V6(in5.s0 holder, com.tencent.mm.plugin.finder.viewmodel.component.db0 animationType, int i17) {
        boolean z17;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(animationType, "animationType");
        super.V6(holder, animationType, i17);
        boolean z18 = true;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (!z17 && !z65.c.a()) {
            kb2.b bVar = kb2.b.f306225a;
            z18 = false;
        }
        if (z18) {
            com.tencent.mm.sdk.platformtools.Log.c("FinderFeedDescriptionUIC", "hideWithAnimation", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    public void W6(in5.s0 holder) {
        boolean z17;
        kotlin.jvm.internal.o.g(holder, "holder");
        super.W6(holder);
        boolean z18 = true;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (!z17 && !z65.c.a()) {
            kb2.b bVar = kb2.b.f306225a;
            z18 = false;
        }
        if (z18) {
            com.tencent.mm.sdk.platformtools.Log.c("FinderFeedDescriptionUIC", "hideWithoutAnimate", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    public boolean X6(in5.s0 holder, boolean z17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        return true;
    }
}
