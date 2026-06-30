package r25;

/* loaded from: classes7.dex */
public final class f implements l81.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bc0.g f368859d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f368860e;

    public f(bc0.g gVar, android.net.Uri uri) {
        this.f368859d = gVar;
        this.f368860e = uri;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        if (r1 != null) goto L13;
     */
    @Override // l81.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a() {
        /*
            r3 = this;
            bc0.g r0 = r3.f368859d
            if (r0 == 0) goto L19
            android.os.Bundle r0 = r0.f19153h
            if (r0 == 0) goto L19
            java.lang.String r1 = "IDeepLinkService.BypassJson"
            java.lang.String r0 = r0.getString(r1)
            if (r0 == 0) goto L19
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L16
            r1.<init>(r0)     // Catch: java.lang.Exception -> L16
            goto L17
        L16:
            r1 = 0
        L17:
            if (r1 != 0) goto L1e
        L19:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
        L1e:
            c75.c r0 = c75.c.f39637a
            android.net.Uri r2 = r3.f368860e
            r0.f(r1, r2)
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r25.f.a():java.lang.String");
    }
}
