package je2;

/* loaded from: classes10.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f299201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ je2.g f299202e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.da2 f299203f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(je2.g gVar, r45.da2 da2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f299202e = gVar;
        this.f299203f = da2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new je2.c(this.f299202e, this.f299203f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((je2.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f299201d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            je2.g gVar = this.f299202e;
            java.util.LinkedList list = this.f299203f.getList(0);
            kotlin.jvm.internal.o.f(list, "getFont_list(...)");
            java.util.Map R6 = this.f299202e.R6();
            kotlin.jvm.internal.o.f(R6, "access$getStickerFontCache(...)");
            rl2.y yVar = (rl2.y) ((jz5.n) ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).B).getValue();
            this.f299201d = 1;
            if (je2.g.N6(gVar, "loadFontResource", list, R6, yVar, this) == aVar) {
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
