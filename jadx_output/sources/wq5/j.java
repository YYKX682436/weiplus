package wq5;

/* loaded from: classes13.dex */
public class j {

    /* renamed from: e, reason: collision with root package name */
    public static final wq5.j f448720e = new wq5.j();

    /* renamed from: a, reason: collision with root package name */
    public boolean f448721a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f448722b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f448723c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f448724d;

    static {
        wq5.j jVar = new wq5.j();
        new wq5.j(jVar.f448721a, "__content__", false, jVar.f448724d).f448721a = true;
    }

    public j() {
        this.f448721a = false;
        this.f448722b = "__content__";
        this.f448723c = false;
        this.f448724d = java.util.Collections.emptyMap();
    }

    public java.lang.Object clone() {
        return new wq5.j(this.f448721a, this.f448722b, this.f448723c, this.f448724d);
    }

    public j(boolean z17, java.lang.String str, boolean z18, java.util.Map map) {
        this.f448721a = z17;
        this.f448722b = str;
        this.f448723c = z18;
        this.f448724d = java.util.Collections.unmodifiableMap(map);
    }
}
