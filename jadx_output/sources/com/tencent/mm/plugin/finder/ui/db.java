package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class db extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f129063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f129064e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db(java.lang.String str, java.lang.String str2) {
        super(1);
        this.f129063d = str;
        this.f129064e = str2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("Finder.FinderModifyNameUI", "click ".concat(it));
        java.lang.String str2 = this.f129063d;
        if (str2 != null && (str = this.f129064e) != null) {
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
            am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
            nxVar.f7466a = str2;
            nxVar.f7467b = str;
            startAppBrandUIFromOuterEvent.e();
        }
        return jz5.f0.f302826a;
    }
}
