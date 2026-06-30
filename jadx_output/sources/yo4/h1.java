package yo4;

/* loaded from: classes10.dex */
public final class h1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout f464232d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout multiVideoPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f464232d = multiVideoPluginLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yo4.h1(this.f464232d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yo4.h1 h1Var = (yo4.h1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        h1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout multiVideoPluginLayout = this.f464232d;
        com.tencent.mm.plugin.vlog.ui.widget.MultiEditCropOperationLayout multiEditCropOperationLayout = multiVideoPluginLayout.getMultiPreviewPlugin().f23211g;
        ru3.o oVar = ru3.o.f399764e;
        multiEditCropOperationLayout.setStyle(oVar);
        multiVideoPluginLayout.setCurrentStyle(oVar);
        bp4.k0 multiPreviewPlugin = multiVideoPluginLayout.getMultiPreviewPlugin();
        yo4.p pVar = multiVideoPluginLayout.f175879v;
        multiPreviewPlugin.I(pVar.B());
        com.tencent.mm.plugin.vlog.model.u0 u0Var = multiVideoPluginLayout.G;
        int size = ((java.util.ArrayList) u0Var.f175743t.m()).size() - 1;
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        for (int i17 = 0; i17 < size; i17++) {
            arrayList.add(java.lang.Boolean.FALSE);
        }
        bp4.e4 e4Var = multiVideoPluginLayout.M;
        e4Var.getClass();
        com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView vLogThumbView = e4Var.f23160h;
        vLogThumbView.getClass();
        vLogThumbView.recyclerView.D0();
        multiVideoPluginLayout.setBackgroundColor(multiVideoPluginLayout.J1);
        yo4.p pVar2 = multiVideoPluginLayout.f175879v;
        ct0.b bVar = multiVideoPluginLayout.F;
        kotlin.jvm.internal.o.d(bVar);
        yo4.p.K(pVar2, bVar, multiVideoPluginLayout.E, false, multiVideoPluginLayout.H, u0Var.f175734h, 4, null);
        int size2 = u0Var.f175743t.f175597c.size();
        bp4.p4 p4Var = multiVideoPluginLayout.f175873p1;
        if (size2 == 1 && ((com.tencent.mm.plugin.vlog.model.i1) u0Var.f175743t.f175597c.get(0)).f175627l.f397508j > multiVideoPluginLayout.f175868m) {
            multiVideoPluginLayout.A();
            p4Var.getClass();
            u0Var.j(0);
            multiVideoPluginLayout.N.z().setEnableLengthEdit(!u0Var.s());
            bp4.o4 o4Var = multiVideoPluginLayout.N;
            com.tencent.mm.plugin.vlog.model.i1 i1Var = u0Var.f175747x;
            kotlin.jvm.internal.o.d(i1Var);
            bp4.o4.A(o4Var, i1Var, true, 0L, 4, null);
            multiVideoPluginLayout.getMultiPreviewPlugin().I(pVar.B());
        } else if (u0Var.f175743t.k() > multiVideoPluginLayout.f175868m) {
            multiVideoPluginLayout.A();
            p4Var.getClass();
            u0Var.j(-1);
            e4Var.setVisibility(8);
            com.tencent.mm.plugin.vlog.model.h1 h1Var = u0Var.f175743t;
            bp4.n nVar = multiVideoPluginLayout.P;
            nVar.A(h1Var);
            u0Var.a(h1Var, false);
            nVar.D(u0Var.f175743t, multiVideoPluginLayout.f175868m);
            multiVideoPluginLayout.getMultiPreviewPlugin().I(pVar.B());
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
