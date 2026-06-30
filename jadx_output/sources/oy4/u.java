package oy4;

/* loaded from: classes5.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f350079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oy4.v f350080e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(java.util.ArrayList arrayList, oy4.v vVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f350079d = arrayList;
        this.f350080e = vVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new oy4.u(this.f350079d, this.f350080e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((oy4.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getImageFeatureResult >> ");
        java.util.ArrayList arrayList2 = this.f350079d;
        sb6.append(arrayList2.size());
        sb6.append(' ');
        sb6.append(java.lang.Thread.currentThread());
        com.tencent.mars.xlog.Log.i("MicroMsg.FeatureApiImpl", sb6.toString());
        oy4.v vVar = this.f350080e;
        vVar.getClass();
        if (oy4.v.f350081d != null) {
            z17 = true;
        } else {
            ny4.f fVar = new ny4.f();
            oy4.v.f350081d = fVar;
            boolean c17 = fVar.c(null);
            com.tencent.mars.xlog.Log.i("MicroMsg.FeatureApiImpl", "initEnv >> " + c17 + ' ' + oy4.v.f350081d);
            z17 = c17;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FeatureApiImpl", "getImageFeatureResult init error");
            return arrayList;
        }
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            oy4.a a17 = ny4.h.f341467a.a((java.lang.String) it.next());
            java.nio.Buffer buffer = a17 != null ? a17.f350052b : null;
            android.graphics.Bitmap bitmap = a17 != null ? a17.f350051a : null;
            if (buffer == null || bitmap == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FeatureApiImpl", "getImageFeatureResult >> buffer get error");
                arrayList.add(new float[0]);
            } else {
                ny4.f fVar2 = oy4.v.f350081d;
                float[] a18 = fVar2 != null ? fVar2.a(buffer, bitmap.getWidth(), bitmap.getHeight()) : new float[0];
                com.tencent.mars.xlog.Log.i("MicroMsg.FeatureApiImpl", "getImageFeatureResult >> result: " + a18);
                arrayList.add(a18);
            }
        }
        vVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FeatureApiImpl", "destroyEnv " + oy4.v.f350081d);
        ny4.f fVar3 = oy4.v.f350081d;
        if (fVar3 != null) {
            fVar3.b();
        }
        oy4.v.f350081d = null;
        return arrayList;
    }
}
