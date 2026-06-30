package gu0;

/* loaded from: classes5.dex */
public final class k0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f275717d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f275718e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f275719f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.MJCamResourceManager f275720g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(java.util.List list, java.util.List list2, java.lang.String str, com.tencent.maas.camstudio.MJCamResourceManager mJCamResourceManager, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f275717d = list;
        this.f275718e = list2;
        this.f275719f = str;
        this.f275720g = mJCamResourceManager;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gu0.k0(this.f275717d, this.f275718e, this.f275719f, this.f275720g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gu0.k0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        return com.tencent.maas.moviecomposing.ComposingFactory.b(this.f275717d, this.f275718e, this.f275719f, 0L, this.f275720g, null);
    }
}
