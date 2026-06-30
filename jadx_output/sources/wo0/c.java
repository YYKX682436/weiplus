package wo0;

/* loaded from: classes15.dex */
public abstract class c implements vo0.b {

    /* renamed from: a, reason: collision with root package name */
    public final ip0.a f447870a;

    /* renamed from: b, reason: collision with root package name */
    public final yo0.e f447871b;

    /* renamed from: c, reason: collision with root package name */
    public yo0.i f447872c;

    /* renamed from: d, reason: collision with root package name */
    public ep0.e f447873d;

    /* renamed from: e, reason: collision with root package name */
    public ep0.d f447874e;

    /* renamed from: f, reason: collision with root package name */
    public ep0.f f447875f;

    /* renamed from: g, reason: collision with root package name */
    public ep0.c f447876g;

    /* renamed from: h, reason: collision with root package name */
    public ep0.g f447877h;

    /* renamed from: i, reason: collision with root package name */
    public ep0.b f447878i;

    /* renamed from: j, reason: collision with root package name */
    public ep0.a f447879j;

    /* renamed from: k, reason: collision with root package name */
    public dp0.a f447880k;

    /* renamed from: l, reason: collision with root package name */
    public android.graphics.drawable.Drawable f447881l;

    /* renamed from: m, reason: collision with root package name */
    public cp0.f f447882m;

    public c(ip0.a reqValue, yo0.e mImageLoaderConfiguration) {
        kotlin.jvm.internal.o.g(reqValue, "reqValue");
        kotlin.jvm.internal.o.g(mImageLoaderConfiguration, "mImageLoaderConfiguration");
        this.f447870a = reqValue;
        this.f447871b = mImageLoaderConfiguration;
    }

    @Override // vo0.b
    public void a() {
        this.f447882m = new cp0.a();
        f();
    }

    public void d() {
        this.f447882m = new cp0.a();
        vo0.h hVar = new vo0.h(this, this.f447871b);
        hVar.f438491u = hVar.f438471a.f447870a;
        hVar.b();
    }

    public java.lang.Object e() {
        yo0.i iVar = this.f447872c;
        yo0.e eVar = this.f447871b;
        if (iVar == null) {
            eVar.e();
        }
        com.tencent.mm.loader.cache.memory.e l17 = eVar.l();
        dp0.a aVar = this.f447880k;
        if (aVar == null) {
            aVar = eVar.d();
        }
        hp0.g a17 = l17.a(this.f447870a, aVar);
        if (a17 != null) {
            return a17.f282913a;
        }
        return null;
    }

    public void f() {
        vo0.h hVar = new vo0.h(this, this.f447871b);
        hVar.f438491u = hVar.f438471a.f447870a;
        hVar.b();
    }

    public vo0.b g(yo0.i options) {
        kotlin.jvm.internal.o.g(options, "options");
        this.f447872c = options;
        return this;
    }

    public final vo0.b h(dp0.d _transcoder) {
        kotlin.jvm.internal.o.g(_transcoder, "_transcoder");
        dp0.a aVar = this.f447880k;
        if (aVar == null) {
            this.f447880k = new dp0.a(_transcoder);
        } else if (aVar != null) {
            aVar.c(_transcoder);
        }
        return this;
    }
}
