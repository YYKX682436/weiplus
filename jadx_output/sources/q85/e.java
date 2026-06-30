package q85;

/* loaded from: classes3.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f360797d;

    /* renamed from: e, reason: collision with root package name */
    public int f360798e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q85.g f360799f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(q85.g gVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f360799f = gVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new q85.e(this.f360799f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((q85.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        fk4.u uVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f360798e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        q85.g gVar = this.f360799f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("MiscroMsg.PlayerState", "getPlayer snsId:" + gVar.f360802d + " isPlay:" + gVar.f360808m);
            pk4.d dVar = gVar.f360807i;
            if (dVar == null) {
                return f0Var;
            }
            kotlin.jvm.internal.o.d(dVar);
            if (dVar.isInitialized()) {
                pk4.d dVar2 = gVar.f360807i;
                kotlin.jvm.internal.o.d(dVar2);
                dVar2.stop();
            }
            if (gVar.f360809n == null) {
                int i18 = gVar.f360803e;
                r45.jj4 media = gVar.f360804f;
                kotlin.jvm.internal.o.g(media, "media");
                gVar.f360809n = null;
            }
            if (gVar.f360809n != null) {
                pk4.d dVar3 = gVar.f360807i;
                kotlin.jvm.internal.o.d(dVar3);
                ((com.tencent.mm.pluginsdk.ui.tools.f4) dVar3).setVideoPath(gVar.f360809n);
                pk4.d dVar4 = gVar.f360807i;
                kotlin.jvm.internal.o.d(dVar4);
                dVar4.setVideoCallback(gVar);
                pk4.d dVar5 = gVar.f360807i;
                kotlin.jvm.internal.o.d(dVar5);
                dVar5.setLoop(true);
                pk4.d dVar6 = gVar.f360807i;
                kotlin.jvm.internal.o.d(dVar6);
                dVar6.setScaleType(com.tencent.mm.pluginsdk.ui.e1.COVER);
                return f0Var;
            }
            int i19 = gVar.f360803e;
            r45.jj4 media2 = gVar.f360804f;
            int i27 = gVar.f360805g;
            kotlin.jvm.internal.o.g(media2, "media");
            kotlin.jvm.internal.o.d(null);
            ((cf0.z) ((df0.s) i95.n0.c(df0.s.class))).getClass();
            fk4.k kVar = new fk4.k(null);
            kVar.o();
            this.f360797d = kVar;
            this.f360798e = 1;
            if (kVar.d(this) == aVar) {
                return aVar;
            }
            uVar = kVar;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uVar = (fk4.u) this.f360797d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        pk4.d dVar7 = gVar.f360807i;
        kotlin.jvm.internal.o.d(dVar7);
        dVar7.setResourceDownloader(uVar);
        pk4.d dVar8 = gVar.f360807i;
        kotlin.jvm.internal.o.d(dVar8);
        dVar8.prepare();
        pk4.d dVar42 = gVar.f360807i;
        kotlin.jvm.internal.o.d(dVar42);
        dVar42.setVideoCallback(gVar);
        pk4.d dVar52 = gVar.f360807i;
        kotlin.jvm.internal.o.d(dVar52);
        dVar52.setLoop(true);
        pk4.d dVar62 = gVar.f360807i;
        kotlin.jvm.internal.o.d(dVar62);
        dVar62.setScaleType(com.tencent.mm.pluginsdk.ui.e1.COVER);
        return f0Var;
    }
}
