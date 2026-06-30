package id3;

/* loaded from: classes.dex */
public final class j implements vz.n1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ id3.k f290921a;

    public j(id3.k kVar) {
        this.f290921a = kVar;
    }

    @Override // vz.n1
    public void a(float f17, long j17, long j18) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("progress", java.lang.Float.valueOf(f17));
        jSONObject.put("totalBytesWritten", j17);
        jSONObject.put("totalBytesExpectedToWrite", j18);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        com.tencent.mm.plugin.magicbrush.jsapi.downloadtask.MBJsEventDownloadProgressUpdate mBJsEventDownloadProgressUpdate = new com.tencent.mm.plugin.magicbrush.jsapi.downloadtask.MBJsEventDownloadProgressUpdate();
        mBJsEventDownloadProgressUpdate.f147882e = jSONObject2;
        this.f290921a.b(mBJsEventDownloadProgressUpdate);
    }

    @Override // vz.n1
    public void b(org.json.JSONObject jSONObject) {
        java.lang.String optString = jSONObject != null ? jSONObject.optString("state", "") : null;
        if (optString == null || optString.length() == 0) {
            return;
        }
        com.tencent.mm.plugin.magicbrush.jsapi.downloadtask.MBJsEventDownloadStateChange mBJsEventDownloadStateChange = new com.tencent.mm.plugin.magicbrush.jsapi.downloadtask.MBJsEventDownloadStateChange();
        mBJsEventDownloadStateChange.f147882e = java.lang.String.valueOf(jSONObject);
        this.f290921a.b(mBJsEventDownloadStateChange);
    }

    @Override // vz.n1
    public void c(org.json.JSONObject jSONObject) {
        java.util.Iterator<java.lang.String> keys;
        lc3.a0 a0Var = new lc3.a0();
        if (jSONObject != null && (keys = jSONObject.keys()) != null) {
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                a0Var.put(next, jSONObject.get(next));
            }
        }
        id3.k kVar = this.f290921a;
        kVar.getClass();
        lc3.c0 c0Var = kVar.f148050g;
        if (c0Var == null) {
            kotlin.jvm.internal.o.o("mFakeJsApi");
            throw null;
        }
        c0Var.m(a0Var);
        kVar.a(a0Var);
    }

    @Override // vz.o1
    public void d(int i17, java.lang.String str) {
        id3.k kVar = this.f290921a;
        kVar.f290922h = i17;
        if (str == null) {
            str = "";
        }
        kVar.getClass();
        kVar.f290923i = str;
        kVar.a(kVar.d(kVar.f290922h, kVar.f290923i));
    }
}
