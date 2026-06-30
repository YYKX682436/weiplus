package je2;

/* loaded from: classes10.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f299198d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ je2.g f299199e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ca2 f299200f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(je2.g gVar, r45.ca2 ca2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f299199e = gVar;
        this.f299200f = ca2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new je2.b(this.f299199e, this.f299200f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((je2.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f299198d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            je2.g gVar = this.f299199e;
            java.util.LinkedList list = this.f299200f.getList(0);
            kotlin.jvm.internal.o.f(list, "getBubble_list(...)");
            java.util.Map P6 = this.f299199e.P6();
            kotlin.jvm.internal.o.f(P6, "access$getStickerBubbleCache(...)");
            rl2.x xVar = (rl2.x) ((jz5.n) ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).A).getValue();
            this.f299198d = 1;
            if (je2.g.N6(gVar, "loadBubbleResource", list, P6, xVar, this) == aVar) {
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
