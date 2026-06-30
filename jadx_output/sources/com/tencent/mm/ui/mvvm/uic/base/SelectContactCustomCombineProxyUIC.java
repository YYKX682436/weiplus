package com.tencent.mm.ui.mvvm.uic.base;

/* loaded from: classes16.dex */
public final class SelectContactCustomCombineProxyUIC extends wm3.a {
    public final com.tencent.mm.ui.mvvm.uic.base.SelectContactCustomCombineProxyUIC$contactListChangeByOutsideListener$1 A6;
    public final jz5.g B6;

    /* renamed from: z6, reason: collision with root package name */
    public java.util.List f209257z6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.mm.ui.mvvm.uic.base.SelectContactCustomCombineProxyUIC$contactListChangeByOutsideListener$1] */
    public SelectContactCustomCombineProxyUIC(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f209257z6 = kz5.p0.f313996d;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.A6 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SelectContactListAndExcludeToInsideEvent>(a0Var) { // from class: com.tencent.mm.ui.mvvm.uic.base.SelectContactCustomCombineProxyUIC$contactListChangeByOutsideListener$1
            {
                this.__eventId = 1324291278;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SelectContactListAndExcludeToInsideEvent selectContactListAndExcludeToInsideEvent) {
                j75.f stateCenter;
                com.tencent.mm.autogen.events.SelectContactListAndExcludeToInsideEvent event = selectContactListAndExcludeToInsideEvent;
                kotlin.jvm.internal.o.g(event, "event");
                h.i iVar = event.f54745m;
                java.util.ArrayList arrayList = iVar.f277768a;
                java.util.ArrayList arrayList2 = iVar.f277769b;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("contactListChangeByOutsideListener: selectList:");
                sb6.append(arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null);
                sb6.append(" excludeList: ");
                sb6.append(arrayList2 != null ? java.lang.Integer.valueOf(arrayList2.size()) : null);
                sb6.append(" selectContactList: ");
                com.tencent.mm.ui.mvvm.uic.base.SelectContactCustomCombineProxyUIC selectContactCustomCombineProxyUIC = com.tencent.mm.ui.mvvm.uic.base.SelectContactCustomCombineProxyUIC.this;
                sb6.append(selectContactCustomCombineProxyUIC.f209257z6.size());
                com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactCustomCombineProxyUIC", sb6.toString());
                com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = selectContactCustomCombineProxyUIC.P6();
                if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
                    return true;
                }
                java.util.List list = arrayList2;
                if (arrayList2 == null) {
                    list = kz5.p0.f313996d;
                }
                stateCenter.B3(new p0.h(list));
                for (java.lang.String str : selectContactCustomCombineProxyUIC.f209257z6) {
                    if (!arrayList.contains(str)) {
                        stateCenter.B3(new wi5.t0(new ri5.j("", 0, str, "", new vi5.b(0L, 0L), 0), 0, 7));
                    }
                }
                return true;
            }
        };
        this.B6 = jz5.h.b(new q0.o(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null && (stateCenter = P6.getStateCenter()) != null) {
            stateCenter.L2(getActivity(), new q0.n(this));
        }
        alive();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        dead();
    }
}
