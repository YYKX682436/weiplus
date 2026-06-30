package vo0;

/* loaded from: classes10.dex */
public class a extends vo0.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yo0.e configuration) {
        super(configuration);
        kotlin.jvm.internal.o.g(configuration, "configuration");
    }

    @Override // vo0.d
    public wo0.c b(java.lang.Object obj, yo0.i options) {
        java.lang.String url = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(options, "options");
        wo0.b bVar = new wo0.b(new ip0.a(url), this.f438466a);
        if (options.f464106k) {
            dp0.e eVar = new dp0.e(true, 0.5f);
            eVar.f242116c = dp0.c.f242111e;
            bVar.h(new dp0.a(eVar));
        }
        bVar.f447872c = options;
        return bVar;
    }

    @Override // vo0.d
    public wo0.c d(java.lang.Object obj) {
        java.lang.String url = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(url, "url");
        return new wo0.b(new ip0.a(url), this.f438466a);
    }

    @Override // vo0.d
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public wo0.c a(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        return new wo0.b(new ip0.a(url), this.f438466a);
    }

    @Override // vo0.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void c(java.lang.String url, android.widget.ImageView view, yo0.i options) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(options, "options");
        wo0.b bVar = new wo0.b(new ip0.a(url), this.f438466a);
        if (options.f464106k) {
            dp0.e eVar = new dp0.e(true, 0.5f);
            eVar.f242116c = dp0.c.f242111e;
            bVar.h(new dp0.a(eVar));
        }
        bVar.f447872c = options;
        bVar.c(view);
    }

    public final wo0.c g(java.lang.String assertPath) {
        kotlin.jvm.internal.o.g(assertPath, "assertPath");
        return new wo0.b(new ip0.a(assertPath, ip0.b.ASSET_DATA), this.f438466a);
    }

    public final void h(java.lang.String url, android.widget.ImageView view, yo0.i options, yz5.p pVar) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(options, "options");
        wo0.b bVar = new wo0.b(new ip0.a(url), this.f438466a);
        if (options.f464106k) {
            dp0.e eVar = new dp0.e(true, 0.5f);
            eVar.f242116c = dp0.c.f242111e;
            bVar.h(new dp0.a(eVar));
        }
        bVar.f447872c = options;
        bVar.i(view, pVar);
    }

    public wo0.c i(java.lang.String filePath) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        return new wo0.b(new ip0.a(filePath, ip0.b.LOCAL_PATH), this.f438466a);
    }
}
