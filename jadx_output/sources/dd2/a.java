package dd2;

/* loaded from: classes2.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dd2.d f228951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f228952e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(dd2.d dVar, kotlin.coroutines.Continuation continuation) {
        super(1);
        this.f228951d = dVar;
        this.f228952e = continuation;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        yz5.l lVar = this.f228951d.f228956c;
        if (lVar != null) {
            kotlin.jvm.internal.o.d(fVar);
            iResponse = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) ((dd2.b) lVar).invoke(fVar);
        } else {
            iResponse = null;
        }
        this.f228952e.resumeWith(kotlin.Result.m521constructorimpl(iResponse));
        return jz5.f0.f302826a;
    }
}
