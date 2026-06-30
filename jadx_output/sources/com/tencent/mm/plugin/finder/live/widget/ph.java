package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ph implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.qa0 f119383a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ce2.i f119384b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.xh f119385c;

    public ph(r45.qa0 qa0Var, ce2.i iVar, com.tencent.mm.plugin.finder.live.widget.xh xhVar) {
        this.f119383a = qa0Var;
        this.f119384b = iVar;
        this.f119385c = xhVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.util.LinkedList list;
        java.util.LinkedList list2;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        boolean z17 = true;
        com.tencent.mm.plugin.finder.live.widget.xh xhVar = this.f119385c;
        if (i17 == 0 && fVar.f70616b == 0) {
            mm2.n2 n2Var = (mm2.n2) dk2.ef.f233372a.i(mm2.n2.class);
            if (n2Var != null) {
                r45.qa0 customItem = this.f119383a;
                kotlin.jvm.internal.o.g(customItem, "customItem");
                r45.gg1 gg1Var = n2Var.f329284o;
                if (gg1Var != null && (list2 = gg1Var.getList(0)) != null) {
                    pm0.v.d0(list2, new mm2.m2(customItem));
                }
                r45.gg1 gg1Var2 = n2Var.f329284o;
                if (gg1Var2 != null && (list = gg1Var2.getList(0)) != null) {
                    list.add(customItem);
                }
            }
            ce2.i iVar = this.f119384b;
            if (iVar != null) {
                dk2.u7 u7Var = dk2.u7.f234181a;
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftLoader", "addOrReplaceGift " + iVar);
                java.lang.String str = iVar.field_rewardProductId;
                if (str != null && str.length() != 0) {
                    z17 = false;
                }
                if (!z17) {
                    java.util.Map map = dk2.u7.f234185e;
                    kotlin.jvm.internal.o.d(map);
                    map.put(str, iVar);
                    u7Var.l(iVar, str);
                }
            }
            xhVar.e();
            xhVar.postDelayed(new com.tencent.mm.plugin.finder.live.widget.hh(xhVar), 300L);
            yz5.a aVar = xhVar.f120325h;
            if (aVar != null) {
                aVar.invoke();
            }
            xhVar.i();
        } else {
            int i18 = fVar.f70616b;
            if (i18 == -200189) {
                java.lang.String str2 = fVar.f70617c;
                if (str2 != null && str2.length() != 0) {
                    z17 = false;
                }
                db5.t7.g(xhVar.getContext(), z17 ? xhVar.getContext().getResources().getString(com.tencent.mm.R.string.de7) : fVar.f70617c);
            } else if (i18 == -200190) {
                java.lang.String str3 = fVar.f70617c;
                if (str3 != null && str3.length() != 0) {
                    z17 = false;
                }
                db5.t7.g(xhVar.getContext(), z17 ? xhVar.getContext().getResources().getString(com.tencent.mm.R.string.de6) : fVar.f70617c);
            } else {
                java.lang.String string = xhVar.getContext().getResources().getString(com.tencent.mm.R.string.de6);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                db5.t7.g(xhVar.getContext(), string);
            }
        }
        return jz5.f0.f302826a;
    }
}
