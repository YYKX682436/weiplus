package zh5;

/* loaded from: classes12.dex */
public abstract class a implements mf3.k, zh5.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f472991a;

    /* renamed from: b, reason: collision with root package name */
    public final e60.t0 f472992b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f472993c;

    /* renamed from: d, reason: collision with root package name */
    public final dn.m f472994d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f472995e;

    /* renamed from: f, reason: collision with root package name */
    public final long f472996f;

    public a(java.lang.String mediaId, java.lang.String uriString, e60.t0 config) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(uriString, "uriString");
        kotlin.jvm.internal.o.g(config, "config");
        this.f472991a = mediaId;
        this.f472992b = config;
        android.net.Uri parse = android.net.Uri.parse(uriString);
        java.lang.String queryParameter = parse.getQueryParameter("thumb_path");
        this.f472993c = queryParameter == null ? "" : queryParameter;
        java.lang.String queryParameter2 = parse.getQueryParameter("duration_ms");
        this.f472996f = queryParameter2 != null ? java.lang.Long.parseLong(queryParameter2) : 0L;
        dn.m mVar = new dn.m();
        android.net.Uri parse2 = android.net.Uri.parse(uriString);
        java.lang.String path = parse2.getPath();
        mVar.field_fullpath = path != null ? r26.n0.W(path, "cdn://") : "";
        java.util.Set<java.lang.String> queryParameterNames = parse2.getQueryParameterNames();
        kotlin.jvm.internal.o.f(queryParameterNames, "getQueryParameterNames(...)");
        for (java.lang.String str : queryParameterNames) {
            if (str != null) {
                switch (str.hashCode()) {
                    case -350592554:
                        if (str.equals("field_totalLen")) {
                            java.lang.String queryParameter3 = parse2.getQueryParameter(str);
                            mVar.field_totalLen = queryParameter3 != null ? java.lang.Long.parseLong(queryParameter3) : 0L;
                            break;
                        } else {
                            break;
                        }
                    case -249694731:
                        if (str.equals("field_aesKey")) {
                            java.lang.String queryParameter4 = parse2.getQueryParameter(str);
                            mVar.field_aesKey = queryParameter4 == null ? "" : queryParameter4;
                            break;
                        } else {
                            break;
                        }
                    case -103039332:
                        if (str.equals("field_fileId")) {
                            java.lang.String queryParameter5 = parse2.getQueryParameter(str);
                            mVar.field_fileId = queryParameter5 == null ? "" : queryParameter5;
                            break;
                        } else {
                            break;
                        }
                    case 1100782653:
                        if (str.equals("field_filemd5")) {
                            java.lang.String queryParameter6 = parse2.getQueryParameter(str);
                            mVar.field_filemd5 = queryParameter6 == null ? "" : queryParameter6;
                            break;
                        } else {
                            break;
                        }
                    case 1109408056:
                        if (str.equals("download_url")) {
                            java.lang.String queryParameter7 = parse2.getQueryParameter(str);
                            mVar.f241811z = queryParameter7 == null ? "" : queryParameter7;
                            break;
                        } else {
                            break;
                        }
                    case 1309226322:
                        if (str.equals("field_authKey")) {
                            java.lang.String queryParameter8 = parse2.getQueryParameter(str);
                            mVar.field_authKey = queryParameter8 == null ? "" : queryParameter8;
                            break;
                        } else {
                            break;
                        }
                }
            }
        }
        mVar.field_needStorage = false;
        mVar.f241786e = false;
        this.f472994d = mVar;
        java.lang.String str2 = mVar.field_fullpath;
        this.f472995e = str2 != null ? str2 : "";
    }

    @Override // zh5.j0
    public java.lang.String b() {
        return null;
    }

    public abstract dn.m d();

    @Override // mf3.k
    public abstract java.lang.String g();

    @Override // mf3.k
    public abstract java.lang.String getId();
}
