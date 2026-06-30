package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes8.dex */
public final class x1 implements com.tencent.mm.plugin.profile.ui.tab.c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.s4 f154690a;

    public x1(com.tencent.mm.plugin.profile.ui.tab.s4 s4Var) {
        this.f154690a = s4Var;
    }

    public void a(com.tencent.mm.plugin.profile.ui.tab.b1 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mars.xlog.Log.i("ContactWidgetTabBizHeaderView", "followMoreView data is unavailable, reason: " + reason.name() + '.');
    }
}
