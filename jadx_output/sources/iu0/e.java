package iu0;

/* loaded from: classes5.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f294806d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f294807e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f294808f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.io.File f294809g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String str, int i17, java.lang.String str2, java.io.File file, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f294806d = str;
        this.f294807e = i17;
        this.f294808f = str2;
        this.f294809g = file;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new iu0.e(this.f294806d, this.f294807e, this.f294808f, this.f294809g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((iu0.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f294806d);
        sb6.append('_');
        sb6.append(this.f294807e);
        sb6.append('_');
        java.lang.String str = this.f294808f;
        sb6.append(str.hashCode());
        return iu0.k.a(iu0.k.f294830a, str, this.f294809g.getAbsolutePath() + '/' + sb6.toString());
    }
}
