package rx3;

/* loaded from: classes10.dex */
public final class e implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f401022d;

    public e(java.util.ArrayList arrayList) {
        this.f401022d = arrayList;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ox3.a aVar = (ox3.a) obj;
        if (aVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExclusiveRemoteDataSource", "avail data receive " + aVar.f349721d.f415588d);
            this.f401022d.add(aVar);
        }
        return jz5.f0.f302826a;
    }
}
