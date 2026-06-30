package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class n9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.x9 f119170d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9(com.tencent.mm.plugin.finder.live.widget.x9 x9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f119170d = x9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.n9(this.f119170d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.n9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.List list;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        gk2.e eVar = this.f119170d.H;
        java.lang.Object obj2 = null;
        if (eVar != null && (list = ((mm2.o4) eVar.a(mm2.o4.class)).f329327v) != null) {
            com.tencent.mm.plugin.finder.live.widget.x9 x9Var = this.f119170d;
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (com.tencent.mm.sdk.platformtools.t8.D0(((km2.q) next).f309170a, ((mm2.c1) x9Var.H.a(mm2.c1.class)).m8())) {
                        obj2 = next;
                        break;
                    }
                }
            }
            obj2 = (km2.q) obj2;
        }
        boolean z17 = obj2 != null;
        if (z17) {
            com.tencent.mars.xlog.Log.i(this.f119170d.K, "[onRightClick] chooseVisitorRole linking");
            android.content.Context context = this.f119170d.f118183e;
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.eij);
            e4Var.c();
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
