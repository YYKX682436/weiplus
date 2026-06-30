package dx0;

/* loaded from: classes5.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f244448d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dx0.n f244449e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.base.MJID f244450f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f244451g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.segments.ClipSegment f244452h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(dx0.n nVar, com.tencent.maas.base.MJID mjid, boolean z17, com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f244449e = nVar;
        this.f244450f = mjid;
        this.f244451g = z17;
        this.f244452h = clipSegment;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dx0.l(this.f244449e, this.f244450f, this.f244451g, this.f244452h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dx0.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f244448d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ex0.a0 a0Var = this.f244449e.f244460d;
            if (a0Var == null) {
                kotlin.jvm.internal.o.o("timelineVM");
                throw null;
            }
            com.tencent.maas.base.MJID segmentID = this.f244450f;
            kotlin.jvm.internal.o.g(segmentID, "segmentID");
            a0Var.D.remove(segmentID);
            if (this.f244451g) {
                java.util.Set keySet = this.f244449e.f244465i.keySet();
                kotlin.jvm.internal.o.f(keySet, "<get-keys>(...)");
                com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = this.f244452h;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : keySet) {
                    if (kotlin.jvm.internal.o.b(((dx0.r) obj2).f244473a, clipSegment.f48532a)) {
                        arrayList.add(obj2);
                    }
                }
                dx0.n nVar = this.f244449e;
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    dx0.r rVar = (dx0.r) it.next();
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = nVar.f244465i;
                    kotlin.jvm.internal.o.d(rVar);
                    synchronized (concurrentHashMap) {
                        concurrentHashMap.remove(rVar);
                    }
                }
            }
            com.tencent.maas.moviecomposing.o0 c17 = com.tencent.maas.moviecomposing.o0.c(this.f244452h, this.f244449e.b(), this.f244452h.C() != ug.m.ImageClip);
            ex0.a0 a0Var2 = this.f244449e.f244460d;
            if (a0Var2 == null) {
                kotlin.jvm.internal.o.o("timelineVM");
                throw null;
            }
            com.tencent.maas.base.MJID segmentID2 = this.f244450f;
            kotlin.jvm.internal.o.g(segmentID2, "segmentID");
            a0Var2.D.put(segmentID2, c17);
            dx0.n nVar2 = this.f244449e;
            kotlinx.coroutines.p0 p0Var = nVar2.f244458b;
            dx0.k kVar = new dx0.k(nVar2, this.f244450f, null);
            this.f244448d = 1;
            if (kotlinx.coroutines.l.g(p0Var, kVar, this) == aVar) {
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
