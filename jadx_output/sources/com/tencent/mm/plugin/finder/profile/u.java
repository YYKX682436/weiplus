package com.tencent.mm.plugin.finder.profile;

/* loaded from: classes2.dex */
public final class u implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.w f123411a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f123412b;

    public u(com.tencent.mm.plugin.finder.profile.w wVar, boolean z17) {
        this.f123411a = wVar;
        this.f123412b = z17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.profile.b0 b0Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        boolean z17 = this.f123412b;
        com.tencent.mm.plugin.finder.profile.w wVar = this.f123411a;
        if (i17 == 0 && fVar.f70616b == 0) {
            com.tencent.mars.xlog.Log.i("Finder.UserPoiHandler", "[requestUserPoi] " + ((r45.e23) fVar.f70618d).getList(1).size());
            wVar.f124452i = ((r45.e23) fVar.f70618d).getInteger(2);
            wVar.f124451h = ((r45.e23) fVar.f70618d).getByteString(3);
            if (z17) {
                java.util.LinkedList list = ((r45.e23) fVar.f70618d).getList(1);
                kotlin.jvm.internal.o.f(list, "getPoi_list(...)");
                com.tencent.mm.plugin.finder.profile.b0 b0Var2 = wVar.f124449f;
                if (b0Var2 != null) {
                    com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = b0Var2.f123316g;
                    if (mMProcessBar != null) {
                        mMProcessBar.e();
                    }
                    if (!list.isEmpty()) {
                        java.util.LinkedList linkedList = b0Var2.f123317h;
                        linkedList.addAll(list);
                        b0Var2.c(linkedList.size());
                        com.tencent.mm.plugin.finder.profile.z zVar = b0Var2.f123319m;
                        if (zVar == null) {
                            kotlin.jvm.internal.o.o("adapter");
                            throw null;
                        }
                        zVar.notifyDataSetChanged();
                    }
                }
                wVar.f(wVar.f124452i != 0);
            } else {
                com.tencent.mm.plugin.finder.profile.w.h(this.f123411a, ((r45.e23) fVar.f70618d).getList(1), wVar.f124452i != 0, false, 4, null);
            }
        } else {
            com.tencent.mars.xlog.Log.i("Finder.UserPoiHandler", "[requestUserPoi] errType=" + fVar.f70615a + " errCode=" + fVar.f70616b + " errMsg=" + fVar.f70617c);
        }
        if (z17 && (b0Var = wVar.f124449f) != null) {
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = b0Var.f123314e;
            if (refreshLoadMoreLayout == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout.N(((r45.e23) fVar.f70618d).getList(1).size());
        }
        return jz5.f0.f302826a;
    }
}
