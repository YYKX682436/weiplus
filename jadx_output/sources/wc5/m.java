package wc5;

/* loaded from: classes10.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wc5.q f444604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f444605e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f444606f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(wc5.q qVar, long j17, kotlin.jvm.internal.f0 f0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f444604d = qVar;
        this.f444605e = j17;
        this.f444606f = f0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wc5.m(this.f444604d, this.f444605e, this.f444606f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        wc5.m mVar = (wc5.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        mVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        wc5.q qVar = this.f444604d;
        qVar.V6();
        long j17 = this.f444605e;
        int W6 = qVar.W6(j17);
        if (W6 >= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryInitialLoadUIC", "startLocateLoad: targetMsgId=" + j17 + " found in final check at position=" + W6);
            qVar.Z6(W6);
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startLocateLoad: targetMsgId=");
            sb6.append(j17);
            sb6.append(" not found, pages=");
            sb6.append(this.f444606f.f310116d);
            sb6.append(", itemCount=");
            androidx.recyclerview.widget.f2 adapter = qVar.getRecyclerView().getAdapter();
            sb6.append(adapter != null ? adapter.getItemCount() : 0);
            com.tencent.mars.xlog.Log.w("MicroMsg.MsgHistoryGalleryInitialLoadUIC", sb6.toString());
        }
        return jz5.f0.f302826a;
    }
}
