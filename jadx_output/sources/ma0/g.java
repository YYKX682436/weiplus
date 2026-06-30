package ma0;

/* loaded from: classes11.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ma0.h f325137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b21.r f325138e;

    public g(ma0.h hVar, b21.r rVar) {
        this.f325137d = hVar;
        this.f325138e = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ma0.h hVar = this.f325137d;
        b21.r rVar = this.f325138e;
        synchronized (hVar) {
            if (rVar != null) {
                java.lang.String str = rVar.f17358t;
                if (str != null && kotlin.jvm.internal.o.b(str, hVar.f325146n)) {
                    java.lang.String j17 = gm0.j1.b().j();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    try {
                        org.json.JSONArray jSONArray = new org.json.JSONObject(com.tencent.mm.sdk.platformtools.o4.M(hVar.f325141f + j17).getString(hVar.f325142g, "")).getJSONArray(hVar.f325143h);
                        int length = jSONArray.length();
                        for (int i17 = 0; i17 < length; i17++) {
                            org.json.JSONObject jSONObject = new org.json.JSONObject(jSONArray.getString(i17));
                            ma0.e eVar = new ma0.e(hVar);
                            try {
                                eVar.f325132a = jSONObject.getString(hVar.f325144i);
                                eVar.f325133b = jSONObject.getString(hVar.f325145m);
                                arrayList.add(eVar);
                            } catch (org.json.JSONException unused) {
                            }
                        }
                    } catch (org.json.JSONException unused2) {
                    }
                    ma0.e eVar2 = new ma0.e(hVar);
                    eVar2.f325132a = rVar.f17348g;
                    eVar2.f325133b = rVar.f17349h;
                    if (arrayList.contains(eVar2)) {
                        arrayList.remove(eVar2);
                    }
                    arrayList.add(0, eVar2);
                    int size = arrayList.size();
                    java.util.List list = arrayList;
                    if (size > 10) {
                        list = arrayList.subList(0, 10);
                    }
                    org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    int size2 = list.size();
                    for (int i18 = 0; i18 < size2; i18++) {
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        ma0.e eVar3 = (ma0.e) list.get(i18);
                        jSONObject3.put(hVar.f325144i, eVar3.f325132a);
                        jSONObject3.put(hVar.f325145m, eVar3.f325133b);
                        jSONArray2.put(i18, jSONObject3);
                    }
                    jSONObject2.put(hVar.f325143h, jSONArray2);
                    com.tencent.mm.sdk.platformtools.o4.M(hVar.f325141f + j17).putString(hVar.f325142g, jSONObject2.toString());
                }
            }
        }
    }
}
