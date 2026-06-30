package zr0;

/* loaded from: classes14.dex */
public final class m extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zr0.p f475154d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ is0.c f475155e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(zr0.p pVar, is0.c cVar, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f475154d = pVar;
        this.f475155e = cVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new zr0.m(this.f475154d, this.f475155e, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        zr0.m mVar = (zr0.m) create((kotlin.coroutines.Continuation) obj);
        jz5.f0 f0Var = jz5.f0.f302826a;
        mVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        zr0.p pVar = this.f475154d;
        is0.c cVar = this.f475155e;
        pVar.f475172o = cVar;
        os0.a aVar2 = pVar.f475169i;
        if (aVar2 != null) {
            aVar2.w(cVar.f294400m, cVar.f294401n);
        }
        zr0.p pVar2 = this.f475154d;
        os0.a aVar3 = pVar2.f475169i;
        if (aVar3 != null) {
            aVar3.u(pVar2.f475165e.f456175a.f456173a, this.f475154d.f475165e.f456175a.f456174b);
        }
        os0.a aVar4 = this.f475154d.f475169i;
        if (aVar4 != null) {
            ((os0.e) aVar4).H = this.f475155e.f294395e;
        }
        if (aVar4 != null) {
            aVar4.o();
        }
        rs0.h hVar = this.f475154d.f475166f;
        if (hVar != null) {
            android.opengl.EGL14.eglSwapBuffers(hVar.f399292a, hVar.f399293b);
        }
        return jz5.f0.f302826a;
    }
}
