package uh1;

/* loaded from: classes7.dex */
public class b0 implements wh1.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427765a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uh1.c0 f427766b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uh1.e0 f427767c;

    public b0(uh1.e0 e0Var, java.lang.String str, uh1.c0 c0Var) {
        this.f427767c = e0Var;
        this.f427765a = str;
        this.f427766b = c0Var;
    }

    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        this.f427767c.b(this.f427765a);
        ((bd1.a) this.f427766b).a(-1, str3, i17);
    }

    public void b(java.lang.String str) {
        this.f427767c.f427780h.remove(str);
    }

    public void c(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, long j17, java.util.Map map) {
        this.f427767c.b(this.f427765a);
        bd1.a aVar = (bd1.a) this.f427766b;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.String str4 = aVar.f19234b;
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseCreateUploadTask", "onUploadResultWithCode uploadTaskId:%s, filePath:%s, result:%s, errMsg:%d, statusCode %d", str4, aVar.f19235c, str3, 0, valueOf);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, str3);
        hashMap.put("statusCode", java.lang.Integer.valueOf(i17));
        hashMap.put("uploadTaskId", str4);
        hashMap.put("state", ya.b.SUCCESS);
        org.json.JSONObject jSONObject = aVar.f19233a;
        if (jSONObject != null) {
            hashMap.put("header", jSONObject);
        }
        java.lang.String jSONObject2 = new org.json.JSONObject(hashMap).toString();
        bd1.b bVar = new bd1.b();
        bVar.p(aVar.f19236d);
        bVar.r(jSONObject2);
        bd1.c cVar = aVar.f19237e;
        bVar.n(cVar.f19240f.a(str4));
        cVar.f19240f.b(str4);
    }

    public void d(org.json.JSONObject jSONObject) {
        bd1.a aVar = (bd1.a) this.f427766b;
        aVar.getClass();
        if (jSONObject == null) {
            return;
        }
        boolean optBoolean = jSONObject.optBoolean("__AppBrandRemoteDebugRequestHeader__");
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = aVar.f19236d;
        java.lang.String str = aVar.f19234b;
        if (optBoolean) {
            if (((uh1.a) lVar.b(uh1.a.class)).F) {
                jSONObject.remove("__AppBrandRemoteDebugRequestHeader__");
                com.tencent.mm.autogen.events.AppBrandNetWorkReqHeaderReceivedEvent appBrandNetWorkReqHeaderReceivedEvent = new com.tencent.mm.autogen.events.AppBrandNetWorkReqHeaderReceivedEvent();
                am.u uVar = appBrandNetWorkReqHeaderReceivedEvent.f53981g;
                uVar.f8045a = "upload";
                uVar.f8047c = jSONObject;
                uVar.f8046b = str;
                appBrandNetWorkReqHeaderReceivedEvent.e();
                return;
            }
            return;
        }
        aVar.f19233a = jSONObject;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("uploadTaskId", str);
        hashMap.put("state", "headersReceived");
        hashMap.put("header", aVar.f19233a);
        java.lang.String jSONObject2 = new org.json.JSONObject(hashMap).toString();
        bd1.b bVar = new bd1.b();
        bVar.p(lVar);
        bVar.r(jSONObject2);
        bVar.n(aVar.f19237e.f19240f.a(str));
    }

    public void e(java.lang.String str, java.lang.String str2, int i17, long j17, long j18) {
        bd1.a aVar = (bd1.a) this.f427766b;
        aVar.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str3 = aVar.f19234b;
        hashMap.put("uploadTaskId", str3);
        hashMap.put("state", "progressUpdate");
        hashMap.put("progress", java.lang.Integer.valueOf(i17));
        hashMap.put("totalBytesSent", java.lang.Long.valueOf(j17));
        hashMap.put("totalBytesExpectedToSend", java.lang.Long.valueOf(j18));
        java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
        bd1.b bVar = new bd1.b();
        bVar.p(aVar.f19236d);
        bVar.r(jSONObject);
        bVar.n(aVar.f19237e.f19240f.a(str3));
    }
}
