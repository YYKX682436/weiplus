package hw2;

/* loaded from: classes5.dex */
public final class h {
    public h(kotlin.jvm.internal.i iVar) {
    }

    public final void a(java.lang.String str, java.util.HashMap hashMap, int i17) {
        try {
            hw2.h hVar = hw2.t.f285554v;
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderRecordBeautifyPlugin", "extractJsonToMap: " + str);
            cl0.g gVar = new cl0.g(str);
            hashMap.put(0, java.lang.Integer.valueOf(gVar.optInt("skin_smooth", i17)));
            hashMap.put(1, java.lang.Integer.valueOf(gVar.optInt("face_morph", i17)));
            hashMap.put(4, java.lang.Integer.valueOf(gVar.optInt("eye_morph", i17)));
            hashMap.put(2, java.lang.Integer.valueOf(gVar.optInt("skin_bright", i17)));
            hashMap.put(5, java.lang.Integer.valueOf(gVar.optInt("eye_bright", i17)));
            hashMap.put(3, java.lang.Integer.valueOf(gVar.optInt("rosy", i17)));
            hashMap.put(6, java.lang.Integer.valueOf(gVar.optInt("eye_pouch", i17)));
            hashMap.put(7, java.lang.Integer.valueOf(gVar.optInt("smile_folds", i17)));
            hashMap.put(8, java.lang.Integer.valueOf(gVar.optInt("sharpen", i17)));
            hashMap.put(9, java.lang.Integer.valueOf(gVar.optInt("teeth_bright", i17)));
            hashMap.put(10, java.lang.Integer.valueOf(gVar.optInt("small_head", i17)));
            hashMap.put(11, java.lang.Integer.valueOf(gVar.optInt("cheek_bone", i17)));
            hashMap.put(12, java.lang.Integer.valueOf(gVar.optInt("lower_jawbone", i17)));
            hashMap.put(13, java.lang.Integer.valueOf(gVar.optInt("wing_of_nose", i17)));
        } catch (java.lang.Exception e17) {
            hw2.h hVar2 = hw2.t.f285554v;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FinderRecordBeautifyPlugin", e17, "json error: ", new java.lang.Object[0]);
        }
    }
}
