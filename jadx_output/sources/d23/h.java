package d23;

/* loaded from: classes.dex */
public final class h implements aw4.p {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f225897d;

    /* renamed from: e, reason: collision with root package name */
    public int f225898e;

    public h(androidx.appcompat.app.AppCompatActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f225897d = activity;
    }

    @Override // aw4.p
    public void C4(java.lang.String query, boolean z17) {
        kotlin.jvm.internal.o.g(query, "query");
    }

    @Override // aw4.q
    public android.content.Context H() {
        return this.f225897d;
    }

    @Override // av4.j
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.websearch.webview.WebSearchWebView getWebView() {
        if (!com.tencent.mm.plugin.fts.ui.n3.h()) {
            return null;
        }
        androidx.appcompat.app.AppCompatActivity activity = this.f225897d;
        kotlin.jvm.internal.o.g(activity, "activity");
        return ((c23.m) ((c23.a) pf5.z.f353948a.a(activity).c(c23.a.class))).V6();
    }

    @Override // aw4.o, aw4.q
    public aw4.b0 b() {
        androidx.appcompat.app.AppCompatActivity activity = this.f225897d;
        kotlin.jvm.internal.o.g(activity, "activity");
        return ((c23.m) ((c23.a) pf5.z.f353948a.a(activity).c(c23.a.class))).T6();
    }

    @Override // av4.j
    public int z2() {
        return a06.d.b(this.f225898e / i65.a.g(this.f225897d));
    }

    @Override // aw4.o, aw4.q
    public aw4.y c() {
        if (!com.tencent.mm.plugin.fts.ui.n3.h()) {
            return null;
        }
        androidx.appcompat.app.AppCompatActivity activity = this.f225897d;
        kotlin.jvm.internal.o.g(activity, "activity");
        return (d23.j) ((jz5.n) ((c23.m) ((c23.a) pf5.z.f353948a.a(activity).c(c23.a.class))).f38047h).getValue();
    }
}
