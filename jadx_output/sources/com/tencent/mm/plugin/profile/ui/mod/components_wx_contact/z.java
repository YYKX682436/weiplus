package com.tencent.mm.plugin.profile.ui.mod.components_wx_contact;

/* loaded from: classes10.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f154160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f154161e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0 f154162f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f154163g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f154164h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.f4 f154165i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(java.util.List list, com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0 i0Var, int i17, java.util.List list2, com.tencent.mm.ui.widget.dialog.f4 f4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f154161e = list;
        this.f154162f = i0Var;
        this.f154163g = i17;
        this.f154164h = list2;
        this.f154165i = f4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.z(this.f154161e, this.f154162f, this.f154163g, this.f154164h, this.f154165i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.z) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.List list;
        com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0 i0Var;
        mr3.l a17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f154160d;
        com.tencent.mm.ui.widget.dialog.f4 f4Var = this.f154165i;
        try {
            try {
                if (i17 == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.Iterator it = this.f154161e.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        list = this.f154164h;
                        i0Var = this.f154162f;
                        if (!hasNext) {
                            break;
                        }
                        java.lang.String Ai = ((br3.f) ((fc0.e) i95.n0.c(fc0.e.class))).Ai(i0Var.getUsername(), (java.lang.String) it.next());
                        if (Ai != null && (a17 = mr3.l.f330874n.a(i0Var.getUsername(), Ai, this.f154163g)) != null) {
                            list.add(a17);
                        }
                    }
                    kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                    kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
                    com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.y yVar = new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.y(i0Var, list, null);
                    this.f154160d = 1;
                    if (kotlinx.coroutines.l.g(g3Var, yVar, this) == aVar) {
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
