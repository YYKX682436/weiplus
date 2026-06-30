package com.tencent.mm.plugin.recordvideo.background.provider;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/background/provider/WeSeeProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "pt3/b", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class WeSeeProvider extends android.content.ContentProvider {

    /* renamed from: g, reason: collision with root package name */
    public static final pt3.b f155649g = new pt3.b(null);

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String f155650h = com.tencent.mm.sdk.platformtools.x2.f193072b + ".plugin.recordvideo.background.provider.WeSeeProvider";

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f155651i = "query";

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String f155652m = "delete";

    /* renamed from: n, reason: collision with root package name */
    public static final int f155653n = 100;

    /* renamed from: o, reason: collision with root package name */
    public static final int f155654o = 101;

    /* renamed from: p, reason: collision with root package name */
    public static final int f155655p = 1;

    /* renamed from: q, reason: collision with root package name */
    public static final int f155656q = 3600000;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.UriMatcher f155657d;

    /* renamed from: e, reason: collision with root package name */
    public pt3.a f155658e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f155659f;

    public WeSeeProvider() {
        android.content.UriMatcher uriMatcher = new android.content.UriMatcher(-1);
        this.f155657d = uriMatcher;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select * from ");
        l75.e0 e0Var = pt3.c.f358259p;
        sb6.append(pt3.c.f358260q);
        this.f155659f = sb6.toString();
        java.lang.String str = f155651i;
        int i17 = f155653n;
        java.lang.String str2 = f155650h;
        uriMatcher.addURI(str2, str, i17);
        uriMatcher.addURI(str2, f155652m, f155654o);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.recordvideo.background.provider.WeSeeProvider.a():boolean");
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        kotlin.jvm.internal.o.g(uri, "uri");
        uri.toString();
        if (!a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeSeeProvider", "delete checkValid failed");
            return 0;
        }
        if (this.f155657d.match(uri) == f155654o) {
            pt3.a aVar = this.f155658e;
            java.lang.Integer valueOf = aVar != null ? java.lang.Integer.valueOf(aVar.getCount()) : null;
            kotlin.jvm.internal.o.d(valueOf);
            int intValue = valueOf.intValue();
            if (intValue != 0) {
                if (intValue > 1) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WeSeeProvider", "delete count error, count: " + intValue + ' ');
                }
                pt3.a aVar2 = this.f155658e;
                if (aVar2 != null) {
                    aVar2.delete(f155655p);
                }
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WeSeeProvider", "delete uriMatcher match failed");
        }
        return 0;
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        kotlin.jvm.internal.o.g(uri, "uri");
        uri.toString();
        return null;
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        kotlin.jvm.internal.o.g(uri, "uri");
        uri.toString();
        java.util.Objects.toString(contentValues);
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        kotlin.jvm.internal.o.g(uri, "uri");
        uri.toString();
        if (!a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeSeeProvider", "query checkValid failed");
            return null;
        }
        if (this.f155657d.match(uri) != f155653n) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WeSeeProvider", "query uriMatcher match failed");
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WeSeeProvider", "query inner ");
        pt3.a aVar = this.f155658e;
        if (aVar == null) {
            return null;
        }
        return aVar.rawQuery(this.f155659f, new java.lang.String[0]);
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        kotlin.jvm.internal.o.g(uri, "uri");
        uri.toString();
        java.util.Objects.toString(contentValues);
        return 0;
    }
}
