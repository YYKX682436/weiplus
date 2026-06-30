package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class rh extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSettingPersonalizedUI f129780d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh(com.tencent.mm.plugin.finder.ui.FinderSettingPersonalizedUI finderSettingPersonalizedUI) {
        super(0);
        this.f129780d = finderSettingPersonalizedUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        final com.tencent.mm.plugin.finder.ui.FinderSettingPersonalizedUI finderSettingPersonalizedUI = this.f129780d;
        return new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LiteAppLifeCycleEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.ui.FinderSettingPersonalizedUI$recommendCategoryLiteAppDestroyListener$2$1
            {
                this.__eventId = 1907495603;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.LiteAppLifeCycleEvent liteAppLifeCycleEvent) {
                com.tencent.mm.autogen.events.LiteAppLifeCycleEvent event = liteAppLifeCycleEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.finder.ui.FinderSettingPersonalizedUI finderSettingPersonalizedUI2 = com.tencent.mm.plugin.finder.ui.FinderSettingPersonalizedUI.this;
                java.lang.String str = finderSettingPersonalizedUI2.f128745m;
                if (str == null) {
                    return false;
                }
                am.ri riVar = event.f54468g;
                if (riVar.f7817a != 3 || !riVar.f7819c.equals(str)) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i("FinderSettingPersonalizedUI", "[recommendCategoryLiteAppDestroyListener] liteapp destroyed, appId=".concat(str));
                finderSettingPersonalizedUI2.V6();
                return false;
            }
        };
    }
}
