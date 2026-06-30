package id3;

/* loaded from: classes.dex */
public final class l implements vz.n1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ id3.m f290924a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f290925b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f290926c;

    public l(id3.m mVar, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.h0 h0Var) {
        this.f290924a = mVar;
        this.f290925b = f0Var;
        this.f290926c = h0Var;
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
        this.f290924a.b(mBJsEventDownloadProgressUpdate);
    }

    @Override // vz.n1
    public void b(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.magicbrush.jsapi.downloadtask.MBJsEventDownloadStateChange mBJsEventDownloadStateChange = new com.tencent.mm.plugin.magicbrush.jsapi.downloadtask.MBJsEventDownloadStateChange();
        mBJsEventDownloadStateChange.f147882e = java.lang.String.valueOf(jSONObject);
        this.f290924a.b(mBJsEventDownloadStateChange);
    }

    @Override // vz.n1
    public void c(org.json.JSONObject jSONObject) {
    }

    @Override // vz.o1
    public void d(int i17, java.lang.String str) {
        id3.m mVar = this.f290924a;
        if (i17 == 0) {
            mVar.a(mVar.e());
            return;
        }
        this.f290925b.f310116d = i17;
        if (str == null) {
            str = "";
        }
        this.f290926c.f310123d = str;
        mVar.a(mVar.d(i17, str));
    }
}
