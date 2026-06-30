package lj2;

/* loaded from: classes10.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f318814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f318815e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lj2.b f318816f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String str, lj2.b bVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f318815e = str;
        this.f318816f = bVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new lj2.a(this.f318815e, this.f318816f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((lj2.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f318814d;
        boolean z17 = true;
        lj2.b bVar = this.f318816f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str = this.f318815e;
            vl2.h hVar = kotlin.jvm.internal.o.b(str, "finder_live_pk_result_draw.pag") ? vl2.h.R : kotlin.jvm.internal.o.b(str, "finder_live_pk_result_draw_en.pag") ? vl2.h.S : null;
            if (hVar != null) {
                vl2.s sVar = vl2.s.f437868a;
                com.tencent.mm.view.MMPAGView mMPAGView = bVar.f318822e;
                this.f318814d = 1;
                if (sVar.d(hVar, mMPAGView, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (bVar.f318822e.getVisibility() == 0) {
            com.tencent.mm.view.MMPAGView mMPAGView2 = bVar.f318822e;
            if (!mMPAGView2.useRfx ? mMPAGView2.getComposition() == null : mMPAGView2.getRfxComposition() == null) {
                z17 = false;
            }
            if (z17) {
                bVar.f318822e.g();
                bVar.f318822e.d();
            }
        }
        return jz5.f0.f302826a;
    }
}
