package qm3;

/* loaded from: classes10.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qm3.a f364768d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f364769e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kp4.a f364770f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f364771g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qm3.i f364772h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(qm3.a aVar, long j17, kp4.a aVar2, android.graphics.Bitmap bitmap, qm3.i iVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f364768d = aVar;
        this.f364769e = j17;
        this.f364770f = aVar2;
        this.f364771g = bitmap;
        this.f364772h = iVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qm3.d(this.f364768d, this.f364769e, this.f364770f, this.f364771g, this.f364772h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qm3.d dVar = (qm3.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        dVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        qm3.a aVar2 = this.f364768d;
        java.util.Set set = aVar2.f364761c;
        long j17 = this.f364769e;
        set.remove(new java.lang.Long(j17));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        kp4.a aVar3 = this.f364770f;
        sb6.append(aVar3);
        sb6.append(" receives ");
        sb6.append(j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.ThumbCachedLoader", sb6.toString());
        android.graphics.Bitmap bitmap = this.f364771g;
        if (bitmap != null) {
            this.f364772h.f364787d.put(new qm3.b(aVar3, j17), bitmap);
            aVar2.f364762d.add(new java.lang.Long(j17));
            aVar2.f364763e.e(new java.lang.Long(j17));
        }
        return jz5.f0.f302826a;
    }
}
