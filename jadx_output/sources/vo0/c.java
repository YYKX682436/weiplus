package vo0;

/* loaded from: classes10.dex */
public class c extends vo0.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(yo0.e configuration) {
        super(configuration);
        kotlin.jvm.internal.o.g(configuration, "configuration");
    }

    @Override // vo0.d
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public wo0.b a(ip0.c url) {
        kotlin.jvm.internal.o.g(url, "url");
        return new wo0.b(new ip0.a(url), this.f438466a);
    }

    @Override // vo0.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public wo0.c b(ip0.c url, yo0.i options) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(options, "options");
        wo0.b bVar = new wo0.b(new ip0.a(url), this.f438466a);
        bVar.f447872c = options;
        return bVar;
    }

    @Override // vo0.d
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void c(ip0.c url, android.widget.ImageView view, yo0.i options) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(options, "options");
        wo0.b bVar = new wo0.b(new ip0.a(url), this.f438466a);
        bVar.f447872c = options;
        bVar.c(view);
    }

    @Override // vo0.d
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public wo0.b d(ip0.c url) {
        kotlin.jvm.internal.o.g(url, "url");
        return new wo0.b(new ip0.a(url), this.f438466a);
    }

    public wo0.b i(ip0.c url, yo0.i options) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(options, "options");
        wo0.b bVar = new wo0.b(new ip0.a(url), this.f438466a);
        bVar.f447872c = options;
        return bVar;
    }
}
