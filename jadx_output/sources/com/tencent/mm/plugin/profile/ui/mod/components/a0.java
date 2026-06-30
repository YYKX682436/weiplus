package com.tencent.mm.plugin.profile.ui.mod.components;

/* loaded from: classes10.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f153871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f153872e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components.j0 f153873f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f153874g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f153875h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.f4 f153876i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(java.util.List list, com.tencent.mm.plugin.profile.ui.mod.components.j0 j0Var, int i17, java.util.List list2, com.tencent.mm.ui.widget.dialog.f4 f4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f153872e = list;
        this.f153873f = j0Var;
        this.f153874g = i17;
        this.f153875h = list2;
        this.f153876i = f4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.profile.ui.mod.components.a0(this.f153872e, this.f153873f, this.f153874g, this.f153875h, this.f153876i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.profile.ui.mod.components.a0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.List list;
        com.tencent.mm.plugin.profile.ui.mod.components.j0 j0Var;
        mr3.l a17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f153871d;
        com.tencent.mm.ui.widget.dialog.f4 f4Var = this.f153876i;
        try {
            try {
                if (i17 == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.Iterator it = this.f153872e.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        list = this.f153875h;
                        j0Var = this.f153873f;
                        if (!hasNext) {
                            break;
                        }
                        java.lang.String str = (java.lang.String) it.next();
                        fc0.e eVar = (fc0.e) i95.n0.c(fc0.e.class);
                        int i18 = com.tencent.mm.plugin.profile.ui.mod.components.j0.A;
                        java.lang.String Ai = ((br3.f) eVar).Ai(j0Var.getUsername(), str);
                        if (Ai != null && (a17 = mr3.l.f330874n.a(j0Var.getUsername(), Ai, this.f153874g)) != null) {
                            list.add(a17);
                        }
                    }
                    kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                    kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
                    com.tencent.mm.plugin.profile.ui.mod.components.z zVar = new com.tencent.mm.plugin.profile.ui.mod.components.z(j0Var, list, null);
                    this.f153871d = 1;
                    if (kotlinx.coroutines.l.g(g3Var, zVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i17 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ModProfile.ModImageDescriptionUI", "handleImagePathList error: " + e17.getMessage());
            }
            return jz5.f0.f302826a;
        } finally {
            f4Var.dismiss();
        }
    }
}
