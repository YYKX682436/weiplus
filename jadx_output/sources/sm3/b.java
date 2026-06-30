package sm3;

/* loaded from: classes10.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f409834d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qm3.i f409835e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kp4.a f409836f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.widget.MvFrameListView f409837g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(qm3.i iVar, kp4.a aVar, com.tencent.mm.plugin.mv.ui.widget.MvFrameListView mvFrameListView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f409835e = iVar;
        this.f409836f = aVar;
        this.f409837g = mvFrameListView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sm3.b(this.f409835e, this.f409836f, this.f409837g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sm3.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f409834d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            qm3.i iVar = this.f409835e;
            iVar.getClass();
            kp4.a track = this.f409836f;
            kotlin.jvm.internal.o.g(track, "track");
            kotlinx.coroutines.flow.e eVar = new kotlinx.coroutines.flow.e(iVar.a(track).f364763e.d(), false, null, 0, null, 28, null);
            sm3.a aVar2 = new sm3.a(track, this.f409837g);
            this.f409834d = 1;
            if (eVar.a(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
