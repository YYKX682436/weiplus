package sg0;

/* loaded from: classes8.dex */
public final class j2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.websearch.m2 f407733a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.websearch.FlutterSearchFinderVideoPlayerPlugin f407734b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.websearch.FlutterSearchFinderLivePlayerPlugin f407735c;

    /* renamed from: d, reason: collision with root package name */
    public final zc.b0 f407736d;

    public j2(com.tencent.mm.plugin.websearch.m2 flutterPlugin, com.tencent.mm.plugin.websearch.FlutterSearchFinderVideoPlayerPlugin flutterFinderVideoPlayerPlugin, com.tencent.mm.plugin.websearch.FlutterSearchFinderLivePlayerPlugin flutterFinderLivePlayerPlugin, zc.b0 flutterLiteApiPlugin) {
        kotlin.jvm.internal.o.g(flutterPlugin, "flutterPlugin");
        kotlin.jvm.internal.o.g(flutterFinderVideoPlayerPlugin, "flutterFinderVideoPlayerPlugin");
        kotlin.jvm.internal.o.g(flutterFinderLivePlayerPlugin, "flutterFinderLivePlayerPlugin");
        kotlin.jvm.internal.o.g(flutterLiteApiPlugin, "flutterLiteApiPlugin");
        this.f407733a = flutterPlugin;
        this.f407734b = flutterFinderVideoPlayerPlugin;
        this.f407735c = flutterFinderLivePlayerPlugin;
        this.f407736d = flutterLiteApiPlugin;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sg0.j2)) {
            return false;
        }
        sg0.j2 j2Var = (sg0.j2) obj;
        return kotlin.jvm.internal.o.b(this.f407733a, j2Var.f407733a) && kotlin.jvm.internal.o.b(this.f407734b, j2Var.f407734b) && kotlin.jvm.internal.o.b(this.f407735c, j2Var.f407735c) && kotlin.jvm.internal.o.b(this.f407736d, j2Var.f407736d);
    }

    public int hashCode() {
        return (((((this.f407733a.hashCode() * 31) + this.f407734b.hashCode()) * 31) + this.f407735c.hashCode()) * 31) + this.f407736d.hashCode();
    }

    public java.lang.String toString() {
        return "SearchResultFlutterPlugins(flutterPlugin=" + this.f407733a + ", flutterFinderVideoPlayerPlugin=" + this.f407734b + ", flutterFinderLivePlayerPlugin=" + this.f407735c + ", flutterLiteApiPlugin=" + this.f407736d + ')';
    }
}
