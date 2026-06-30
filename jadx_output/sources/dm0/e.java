package dm0;

/* loaded from: classes13.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public org.tensorflow.lite.d f241629a;

    public e(java.lang.String str) {
    }

    public float[] a(float[] fArr, int i17) {
        org.tensorflow.lite.d dVar = this.f241629a;
        if (!(dVar != null && fArr != null && dVar.c() == 1 && this.f241629a.b(0).i() == fArr.length)) {
            com.tencent.mars.xlog.Log.e("Kara.TfLiteMultiClassifyPredict", "input data invalid");
            return null;
        }
        float[][] fArr2 = (float[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Float.TYPE, 1, i17);
        float[] fArr3 = fArr2[0];
        org.tensorflow.lite.d dVar2 = this.f241629a;
        if (!(dVar2 != null && fArr3 != null && dVar2.i() == 1 && this.f241629a.f(0).i() == fArr3.length)) {
            com.tencent.mars.xlog.Log.e("Kara.TfLiteMultiClassifyPredict", "output data invalid");
            return null;
        }
        org.tensorflow.lite.d dVar3 = this.f241629a;
        dVar3.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(0, fArr2);
        dVar3.j(new java.lang.Object[]{fArr}, hashMap);
        return fArr2[0];
    }
}
