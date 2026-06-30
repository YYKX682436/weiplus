package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class v60 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.z60 f120045d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az2.f f120046e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ re2.h1 f120047f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v60(com.tencent.mm.plugin.finder.live.widget.z60 z60Var, az2.f fVar, re2.h1 h1Var) {
        super(0);
        this.f120045d = z60Var;
        this.f120046e = fVar;
        this.f120047f = h1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean b17 = kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper());
        com.tencent.mm.plugin.finder.live.widget.z60 z60Var = this.f120045d;
        az2.f fVar = this.f120046e;
        re2.h1 h1Var = this.f120047f;
        if (b17) {
            fVar.b();
            com.tencent.mars.xlog.Log.i("Finder.FinderStartLiveModeTabWidget", "showCoLiveSettingDialog: task created, invitationId=" + h1Var.f394390c);
            com.tencent.mm.plugin.finder.live.widget.z60.b(z60Var);
            z60Var.o();
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.finder.live.widget.u60(fVar, h1Var, z60Var));
        }
        return jz5.f0.f302826a;
    }
}
