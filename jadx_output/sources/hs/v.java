package hs;

@j95.b
/* loaded from: classes4.dex */
public final class v extends i95.w implements qk.r7 {
    public aq.u0 Ai(long j17, java.lang.String videoSavePath, java.lang.String coverPath, long j18) {
        kotlin.jvm.internal.o.g(videoSavePath, "videoSavePath");
        kotlin.jvm.internal.o.g(coverPath, "coverPath");
        return qp.b.f365674a.b(j17, videoSavePath, coverPath, j18);
    }

    public java.util.HashMap Bi(java.util.List mediaIdList) {
        kotlin.jvm.internal.o.g(mediaIdList, "mediaIdList");
        qp.b bVar = qp.b.f365674a;
        java.util.List<java.lang.Long> V0 = kz5.n0.V0(mediaIdList);
        f65.q qVar = f65.q.f259959a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isBatchLivePhoto before check cache size is ");
        java.util.ArrayList arrayList = (java.util.ArrayList) V0;
        sb6.append(arrayList.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.MMLivePhotoCore", sb6.toString());
        java.util.HashMap hashMap = new java.util.HashMap();
        if (!arrayList.isEmpty()) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.motion.core.LivePhotoCore livePhotoCore = qp.b.f365675b;
            if (livePhotoCore == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMLivePhotoCore", "isBatchLivePhoto >> livePhotoCore is null");
            } else {
                try {
                    java.util.HashMap<java.lang.Long, java.lang.Boolean> isLivePhoto = livePhotoCore.isLivePhoto(V0);
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMLivePhotoCore", "isBatchLivePhoto costTime: " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("count", arrayList.size());
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                    java.lang.String jSONObject2 = jSONObject.toString();
                    kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                    qVar.a("is_livePhoto", 0, currentTimeMillis2, jSONObject2);
                    kotlin.jvm.internal.o.d(isLivePhoto);
                    for (java.util.Map.Entry<java.lang.Long, java.lang.Boolean> entry : isLivePhoto.entrySet()) {
                        java.lang.Long key = entry.getKey();
                        java.lang.Boolean value = entry.getValue();
                        kotlin.jvm.internal.o.d(key);
                        kotlin.jvm.internal.o.d(value);
                        hashMap.put(key, value);
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MMLivePhotoCore", "isBatchLivePhoto api exception " + e17.getMessage());
                    f65.q.b(qVar, "is_livePhoto", -1, java.lang.System.currentTimeMillis() - currentTimeMillis, null, 8, null);
                }
            }
        }
        return hashMap;
    }

    public bs.b wi(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        if (kotlin.jvm.internal.o.b(key, "check_file")) {
            return new cs.a();
        }
        if (kotlin.jvm.internal.o.b(key, "check_permission")) {
            return new cs.c();
        }
        return null;
    }
}
