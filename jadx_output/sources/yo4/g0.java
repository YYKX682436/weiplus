package yo4;

/* loaded from: classes10.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout f464216d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f464216d = multiVideoFullScreenPluginLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yo4.g0(this.f464216d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yo4.g0 g0Var = (yo4.g0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        g0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ru3.o oVar = ru3.o.f399764e;
        com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout = this.f464216d;
        multiVideoFullScreenPluginLayout.setCurrentStyle(oVar);
        multiVideoFullScreenPluginLayout.getMultiPreviewPlugin().f23211g.setStyle(multiVideoFullScreenPluginLayout.getCurrentStyle());
        bp4.k0 multiPreviewPlugin = multiVideoFullScreenPluginLayout.getMultiPreviewPlugin();
        yo4.p pVar = multiVideoFullScreenPluginLayout.f175855w;
        if (pVar == null) {
            kotlin.jvm.internal.o.o("addMusicPlugin");
            throw null;
        }
        multiPreviewPlugin.I(pVar.B());
        com.tencent.mm.plugin.vlog.model.u0 u0Var = multiVideoFullScreenPluginLayout.H;
        int size = ((java.util.ArrayList) u0Var.f175743t.m()).size() - 1;
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        for (int i17 = 0; i17 < size; i17++) {
            arrayList.add(java.lang.Boolean.FALSE);
        }
        bp4.e4 e4Var = multiVideoFullScreenPluginLayout.N;
        e4Var.getClass();
        com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView vLogThumbView = e4Var.f23160h;
        vLogThumbView.getClass();
        vLogThumbView.recyclerView.D0();
        multiVideoFullScreenPluginLayout.setBackgroundColor(multiVideoFullScreenPluginLayout.Q1);
        yo4.p pVar2 = multiVideoFullScreenPluginLayout.f175855w;
        if (pVar2 == null) {
            kotlin.jvm.internal.o.o("addMusicPlugin");
            throw null;
        }
        ct0.b bVar = multiVideoFullScreenPluginLayout.G;
        kotlin.jvm.internal.o.d(bVar);
        yo4.p.K(pVar2, bVar, multiVideoFullScreenPluginLayout.F, false, multiVideoFullScreenPluginLayout.I, u0Var.f175734h, 4, null);
        int size2 = u0Var.f175743t.f175597c.size();
        bp4.p4 p4Var = multiVideoFullScreenPluginLayout.f175858x1;
        if (size2 == 1 && ((com.tencent.mm.plugin.vlog.model.i1) u0Var.f175743t.f175597c.get(0)).f175627l.f397508j > multiVideoFullScreenPluginLayout.f175843m) {
            multiVideoFullScreenPluginLayout.B();
            p4Var.getClass();
            u0Var.j(0);
            multiVideoFullScreenPluginLayout.P.z().setEnableLengthEdit(!u0Var.s());
            bp4.o4 o4Var = multiVideoFullScreenPluginLayout.P;
            com.tencent.mm.plugin.vlog.model.i1 i1Var = u0Var.f175747x;
            kotlin.jvm.internal.o.d(i1Var);
            bp4.o4.A(o4Var, i1Var, true, 0L, 4, null);
            bp4.k0 multiPreviewPlugin2 = multiVideoFullScreenPluginLayout.getMultiPreviewPlugin();
            yo4.p pVar3 = multiVideoFullScreenPluginLayout.f175855w;
            if (pVar3 == null) {
                kotlin.jvm.internal.o.o("addMusicPlugin");
                throw null;
            }
            multiPreviewPlugin2.I(pVar3.B());
        } else if (u0Var.f175743t.k() > multiVideoFullScreenPluginLayout.f175843m) {
            multiVideoFullScreenPluginLayout.B();
            p4Var.getClass();
            u0Var.j(-1);
            e4Var.setVisibility(8);
            com.tencent.mm.plugin.vlog.model.h1 h1Var = u0Var.f175743t;
            bp4.n nVar = multiVideoFullScreenPluginLayout.Q;
            nVar.A(h1Var);
            u0Var.a(h1Var, false);
            nVar.D(u0Var.f175743t, multiVideoFullScreenPluginLayout.f175843m);
            bp4.k0 multiPreviewPlugin3 = multiVideoFullScreenPluginLayout.getMultiPreviewPlugin();
            yo4.p pVar4 = multiVideoFullScreenPluginLayout.f175855w;
            if (pVar4 == null) {
                kotlin.jvm.internal.o.o("addMusicPlugin");
                throw null;
            }
            multiPreviewPlugin3.I(pVar4.B());
            com.tencent.mm.plugin.vlog.model.b0 b0Var = com.tencent.mm.plugin.vlog.model.b0.f175547a;
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderVideoShell", "markShowCrop60s");
            if (com.tencent.mm.plugin.vlog.model.b0.f175553g <= 0) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mm.plugin.vlog.model.b0.f175553g = android.os.SystemClock.elapsedRealtime();
            }
        }
        return jz5.f0.f302826a;
    }
}
