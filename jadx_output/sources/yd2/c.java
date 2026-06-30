package yd2;

/* loaded from: classes5.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f461035d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f461036e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f461037f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yd2.j f461038g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f461039h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentHashMap f461040i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.util.List list, java.util.List list2, yd2.j jVar, yz5.l lVar, java.util.concurrent.ConcurrentHashMap concurrentHashMap, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f461036e = list;
        this.f461037f = list2;
        this.f461038g = jVar;
        this.f461039h = lVar;
        this.f461040i = concurrentHashMap;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yd2.c(this.f461036e, this.f461037f, this.f461038g, this.f461039h, this.f461040i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yd2.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f461035d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f461035d = 1;
            if (kotlinx.coroutines.h.c(this.f461036e, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.f461037f.iterator();
        while (it.hasNext()) {
            r45.mf1 mf1Var = (r45.mf1) this.f461040i.get(((yd2.n) it.next()).f461078a);
            if (mf1Var != null) {
                arrayList.add(mf1Var);
            }
        }
        yd2.j jVar = this.f461038g;
        yd2.j.a(jVar);
        com.tencent.mars.xlog.Log.i("Finder.Live.AiAssistant.ToolManager", "handleToolCalls: all " + arrayList.size() + " completed");
        this.f461039h.invoke(arrayList);
        yz5.l lVar = jVar.f461074b;
        if (lVar != null) {
            lVar.invoke(arrayList);
        }
        return jz5.f0.f302826a;
    }
}
