package s12;

/* loaded from: classes7.dex */
public final class e extends wp0.c {

    /* renamed from: h, reason: collision with root package name */
    public final xp0.e f402128h;

    public e(xp0.e emojiDelegate) {
        kotlin.jvm.internal.o.g(emojiDelegate, "emojiDelegate");
        this.f402128h = emojiDelegate;
    }

    @Override // wp0.c
    public com.tencent.mm.magicbrush.plugin.emoji.ui.MEHolderView K0() {
        com.tencent.mm.magicbrush.plugin.emoji.ui.MEHolderView mEHolderView = ((com.tencent.mm.plugin.finder.viewmodel.component.uo) this.f402128h).f136154m;
        kotlin.jvm.internal.o.d(mEHolderView);
        return mEHolderView;
    }

    @Override // wp0.c
    public wp0.b M0(java.lang.String msgTalker, java.lang.String id6, boolean z17) {
        kotlin.jvm.internal.o.g(msgTalker, "msgTalker");
        kotlin.jvm.internal.o.g(id6, "id");
        com.tencent.mm.plugin.finder.viewmodel.component.uo uoVar = (com.tencent.mm.plugin.finder.viewmodel.component.uo) this.f402128h;
        uoVar.getClass();
        com.tencent.mm.plugin.finder.viewmodel.component.qo qoVar = (com.tencent.mm.plugin.finder.viewmodel.component.qo) uoVar.f136148d.get(id6);
        if (qoVar != null) {
            return qoVar.f135725b;
        }
        return null;
    }

    @Override // wp0.c
    public java.util.Map N0(boolean z17) {
        return new java.util.HashMap();
    }

    @Override // wp0.c
    public void S0(com.tencent.mm.plugin.magicbrush.MBBuildConfig config) {
        kotlin.jvm.internal.o.g(config, "config");
        java.lang.String name = t12.a.class.getName();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        config.f147818e.add(name);
    }
}
