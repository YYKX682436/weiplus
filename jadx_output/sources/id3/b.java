package id3;

/* loaded from: classes.dex */
public final class b implements vz.n1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f290910a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ id3.c f290911b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f290912c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f290913d;

    public b(java.util.HashMap hashMap, id3.c cVar, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.h0 h0Var) {
        this.f290910a = hashMap;
        this.f290911b = cVar;
        this.f290912c = f0Var;
        this.f290913d = h0Var;
    }

    @Override // vz.n1
    public void a(float f17, long j17, long j18) {
        cl0.g gVar = new cl0.g();
        gVar.h("progress", java.lang.Float.valueOf(f17));
        gVar.p("totalBytesWritten", j17);
        gVar.p("totalBytesExpectedToWrite", j18);
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        com.tencent.mm.plugin.magicbrush.jsapi.downloadtask.MBJsEventDownloadProgressUpdate mBJsEventDownloadProgressUpdate = new com.tencent.mm.plugin.magicbrush.jsapi.downloadtask.MBJsEventDownloadProgressUpdate();
        mBJsEventDownloadProgressUpdate.f147882e = gVar2;
        this.f290911b.b(mBJsEventDownloadProgressUpdate);
    }

    @Override // vz.n1
    public void b(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.magicbrush.jsapi.downloadtask.MBJsEventDownloadStateChange mBJsEventDownloadStateChange = new com.tencent.mm.plugin.magicbrush.jsapi.downloadtask.MBJsEventDownloadStateChange();
        mBJsEventDownloadStateChange.f147882e = java.lang.String.valueOf(jSONObject);
        this.f290911b.b(mBJsEventDownloadStateChange);
    }

    @Override // vz.n1
    public void c(org.json.JSONObject jSONObject) {
    }

    @Override // vz.o1
    public void d(int i17, java.lang.String str) {
        id3.c cVar = this.f290911b;
        if (i17 != 0) {
            this.f290912c.f310116d = i17;
            if (str == null) {
                str = "";
            }
            this.f290913d.f310123d = str;
            cVar.a(cVar.d(i17, str));
            return;
        }
        java.lang.Long valueOf = str != null ? java.lang.Long.valueOf(java.lang.Long.parseLong(str)) : null;
        java.util.HashMap map = this.f290910a;
        map.put("downloadId", valueOf);
        cVar.getClass();
        kotlin.jvm.internal.o.g(map, "map");
        lc3.c0 c0Var = cVar.f148050g;
        if (c0Var != null) {
            cVar.a(c0Var.l(map));
        } else {
            kotlin.jvm.internal.o.o("mFakeJsApi");
            throw null;
        }
    }
}
