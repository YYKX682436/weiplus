package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class bb extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.nk2 f128944d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb(r45.nk2 nk2Var) {
        super(1);
        this.f128944d = nk2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String text = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(text, "text");
        com.tencent.mars.xlog.Log.i("Finder.FinderModifyNameUI", "click ".concat(text));
        r45.nk2 nk2Var = this.f128944d;
        java.lang.String string = nk2Var.getString(3);
        java.lang.String string2 = nk2Var.getString(2);
        if (string != null && string2 != null) {
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
            am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
            nxVar.f7466a = string;
            nxVar.f7467b = string2;
            startAppBrandUIFromOuterEvent.e();
        }
        return jz5.f0.f302826a;
    }
}
