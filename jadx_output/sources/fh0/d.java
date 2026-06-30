package fh0;

/* loaded from: classes5.dex */
public final class d implements e70.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f262524a;

    public d(java.lang.String str) {
        this.f262524a = str;
    }

    @Override // e70.c0
    public void d(com.tencent.wechat.aff.ilink_stream.a abortInfo) {
        kotlin.jvm.internal.o.g(abortInfo, "abortInfo");
        fh0.b bVar = (fh0.b) fh0.k.f262534e.get(this.f262524a);
        if (bVar != null) {
            bVar.f262520c = "ABORT";
        }
        fh0.k.f262530a.a();
    }

    @Override // e70.c0
    public void e(java.util.List data) {
        kotlin.jvm.internal.o.g(data, "data");
        fh0.b bVar = (fh0.b) fh0.k.f262534e.get(this.f262524a);
        if (bVar == null) {
            return;
        }
        java.util.Iterator it = data.iterator();
        while (it.hasNext()) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(((com.tencent.mm.protobuf.g) it.next()).i());
                if (kotlin.jvm.internal.o.b(jSONObject.optString("type"), com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT)) {
                    java.lang.String optString = jSONObject.optString(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT);
                    kotlin.jvm.internal.o.d(optString);
                    boolean z17 = true;
                    if (optString.length() > 0) {
                        bVar.f262521d += optString.length();
                        if (bVar.f262522e.length() != 0) {
                            z17 = false;
                        }
                        if (z17) {
                            bVar.f262522e = r26.p0.E0(optString, 10);
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WeClawStream.DataShower", "getILinkListener onReceive parse error: " + e17.getMessage());
            }
        }
        fh0.k.f262530a.a();
    }

    @Override // e70.c0
    public void g(com.tencent.wechat.aff.ilink_stream.x error) {
        kotlin.jvm.internal.o.g(error, "error");
        fh0.b bVar = (fh0.b) fh0.k.f262534e.get(this.f262524a);
        if (bVar != null) {
            java.lang.String str = "ERR:" + error.name();
            kotlin.jvm.internal.o.g(str, "<set-?>");
            bVar.f262520c = str;
        }
        fh0.k.f262530a.a();
    }

    @Override // e70.c0
    public void h() {
        fh0.b bVar = (fh0.b) fh0.k.f262534e.get(this.f262524a);
        if (bVar != null) {
            bVar.f262520c = "END";
        }
        fh0.k.f262530a.a();
    }

    @Override // e70.c0
    public void onTimeout() {
        fh0.b bVar = (fh0.b) fh0.k.f262534e.get(this.f262524a);
        if (bVar != null) {
            bVar.f262520c = com.google.android.gms.iid.InstanceID.ERROR_TIMEOUT;
        }
        fh0.k.f262530a.a();
    }
}
