package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class x60 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az2.f f120300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ re2.h1 f120301e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x60(com.tencent.mm.plugin.finder.live.widget.z60 z60Var, az2.f fVar, re2.h1 h1Var) {
        super(2);
        this.f120300d = fVar;
        this.f120301e = h1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String str = (java.lang.String) obj2;
        az2.f fVar = this.f120300d;
        re2.h1 h1Var = this.f120301e;
        if (kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            fVar.b();
            com.tencent.mars.xlog.Log.e("Finder.FinderStartLiveModeTabWidget", "showCoLiveSettingDialog: create failed, errCode=" + intValue + ", errMsg=" + str);
            if (re2.j1.f394438b == h1Var) {
                re2.e0 e0Var = re2.j1.f394438b;
                if (e0Var != null) {
                    com.tencent.mars.xlog.Log.i("Finder.CoLiveTaskManager", "destroy: invitationId=" + e0Var.f394390c + ", phase=" + e0Var.f394389b);
                    e0Var.a();
                }
                re2.j1.f394438b = null;
            }
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.finder.live.widget.w60(fVar, intValue, str, h1Var));
        }
        return jz5.f0.f302826a;
    }
}
