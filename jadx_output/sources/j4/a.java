package j4;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.Executor f297549a;

    /* renamed from: b, reason: collision with root package name */
    public final j4.h f297550b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f297551c;

    /* renamed from: d, reason: collision with root package name */
    public final java.io.File f297552d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f297553e = false;

    /* renamed from: f, reason: collision with root package name */
    public j4.b[] f297554f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f297555g;

    public a(android.content.res.AssetManager assetManager, java.util.concurrent.Executor executor, j4.h hVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.io.File file) {
        byte[] bArr;
        this.f297549a = executor;
        this.f297550b = hVar;
        this.f297552d = file;
        switch (android.os.Build.VERSION.SDK_INT) {
            case 24:
            case 25:
                bArr = j4.o.f297586e;
                break;
            case 26:
                bArr = j4.o.f297585d;
                break;
            case 27:
                bArr = j4.o.f297584c;
                break;
            case 28:
            case 29:
            case 30:
                bArr = j4.o.f297583b;
                break;
            case 31:
                bArr = j4.o.f297582a;
                break;
            default:
                bArr = null;
                break;
        }
        this.f297551c = bArr;
    }

    public final void a(final int i17, final java.lang.Object obj) {
        this.f297549a.execute(new java.lang.Runnable() { // from class: j4.a$$a
            @Override // java.lang.Runnable
            public final void run() {
                j4.a.this.f297550b.a(i17, obj);
            }
        });
    }
}
