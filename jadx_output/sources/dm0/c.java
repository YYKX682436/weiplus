package dm0;

/* loaded from: classes13.dex */
public class c extends bm0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dm0.d f241628a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(dm0.d dVar) {
        super(dVar);
        this.f241628a = dVar;
    }

    @Override // bm0.b
    public bm0.a a(org.tensorflow.lite.d dVar, java.lang.Object[] objArr) {
        java.util.HashMap hashMap = new java.util.HashMap();
        float[][] fArr = (float[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Float.TYPE, 1, 2);
        hashMap.put(0, fArr);
        dVar.j(objArr, hashMap);
        bm0.a aVar = new bm0.a(this.f241628a);
        float f17 = fArr[0][0];
        java.util.Map map = aVar.f21739a;
        ((java.util.HashMap) map).put(0, java.lang.Float.valueOf(f17));
        ((java.util.HashMap) map).put(1, java.lang.Float.valueOf(fArr[0][1]));
        if (fArr[0][1] > 0.5d) {
            em0.e.a(34L);
        } else {
            em0.e.a(35L);
        }
        return aVar;
    }
}
