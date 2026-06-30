package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class zg extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.Fragment f124429d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FinderTemplatePublishEvent f124430e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTemplateUIC f124431f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124432g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg(androidx.fragment.app.Fragment fragment, com.tencent.mm.autogen.events.FinderTemplatePublishEvent finderTemplatePublishEvent, com.tencent.mm.plugin.finder.profile.uic.FinderProfileTemplateUIC finderProfileTemplateUIC, java.lang.String str) {
        super(0);
        this.f124429d = fragment;
        this.f124430e = finderTemplatePublishEvent;
        this.f124431f = finderProfileTemplateUIC;
        this.f124432g = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        java.lang.Object obj;
        r45.r03 r03Var;
        r45.r23 r23Var;
        r45.rz6 rz6Var;
        if (!this.f124429d.isDetached()) {
            int i17 = this.f124430e.f54332g.f7242b;
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileTemplateUIC finderProfileTemplateUIC = this.f124431f;
            if (i17 == 1) {
                java.util.ArrayList dataListJustForAdapter = finderProfileTemplateUIC.R6().getDataListJustForAdapter();
                java.util.Iterator it = dataListJustForAdapter.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    str = this.f124432g;
                    obj = null;
                    if (!hasNext) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    so2.j5 j5Var = (so2.j5) next;
                    so2.d5 d5Var = j5Var instanceof so2.d5 ? (so2.d5) j5Var : null;
                    if (d5Var != null && (r03Var = d5Var.f410314d) != null && (r23Var = (r45.r23) r03Var.getCustom(23)) != null && (rz6Var = (r45.rz6) r23Var.getCustom(1)) != null) {
                        obj = rz6Var.f385320d;
                    }
                    if (kotlin.jvm.internal.o.b(obj, str)) {
                        obj = next;
                        break;
                    }
                }
                so2.j5 j5Var2 = (so2.j5) obj;
                if (j5Var2 != null) {
                    long itemId = j5Var2.getItemId();
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = finderProfileTemplateUIC.f123468o;
                    if (wxRecyclerAdapter != null) {
                        wxRecyclerAdapter.e0(itemId);
                    }
                    dataListJustForAdapter.removeIf(new com.tencent.mm.plugin.finder.profile.uic.yg(itemId));
                    if (dataListJustForAdapter.isEmpty()) {
                        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTemplateUIC.P6(finderProfileTemplateUIC);
                    }
                    com.tencent.mars.xlog.Log.i("Finder.ProfileTemplateUIC", "template unpublished, removed templateId=" + str);
                }
            } else if (i17 == 2) {
                finderProfileTemplateUIC.f123474u = true;
            }
        }
        return jz5.f0.f302826a;
    }
}
