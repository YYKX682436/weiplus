package dm0;

/* loaded from: classes13.dex */
public class b extends bm0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dm0.d f241627a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(dm0.d dVar) {
        super(dVar);
        this.f241627a = dVar;
    }

    @Override // bm0.b
    public bm0.a a(org.tensorflow.lite.d dVar, java.lang.Object[] objArr) {
        java.util.HashMap hashMap = new java.util.HashMap();
        float[][] fArr = (float[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Float.TYPE, 1, 1);
        hashMap.put(0, fArr);
        dVar.j(objArr, hashMap);
        bm0.a aVar = new bm0.a(this.f241627a);
        ((java.util.HashMap) aVar.f21739a).put(1, java.lang.Float.valueOf(fArr[0][0]));
        if (fArr[0][0] > 0.5d) {
            em0.e.a(31L);
        } else {
            em0.e.a(32L);
        }
        return aVar;
    }
}
