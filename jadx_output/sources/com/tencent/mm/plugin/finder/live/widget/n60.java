package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class n60 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.z60 f119160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az2.f f119161e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ re2.h1 f119162f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n60(com.tencent.mm.plugin.finder.live.widget.z60 z60Var, az2.f fVar, re2.h1 h1Var) {
        super(0);
        this.f119160d = z60Var;
        this.f119161e = fVar;
        this.f119162f = h1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean b17 = kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper());
        com.tencent.mm.plugin.finder.live.widget.z60 z60Var = this.f119160d;
        az2.f fVar = this.f119161e;
        re2.h1 h1Var = this.f119162f;
        if (b17) {
            fVar.b();
            com.tencent.mars.xlog.Log.i("Finder.FinderStartLiveModeTabWidget", "openCoLiveSettingPanel: task created, invitationId=" + h1Var.f394390c);
            com.tencent.mm.plugin.finder.live.widget.z60.b(z60Var);
            z60Var.o();
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.finder.live.widget.m60(fVar, h1Var, z60Var));
        }
        return jz5.f0.f302826a;
    }
}
