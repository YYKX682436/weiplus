package gp0;

/* loaded from: classes10.dex */
public final class g implements gp0.e {

    /* renamed from: a, reason: collision with root package name */
    public final gp0.d f274172a;

    /* renamed from: b, reason: collision with root package name */
    public final gp0.h f274173b;

    /* renamed from: c, reason: collision with root package name */
    public final gp0.h f274174c;

    /* renamed from: d, reason: collision with root package name */
    public final int f274175d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f274176e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f274177f;

    public g(gp0.d retrySg, gp0.h lightWork, gp0.h heavyWork, gp0.h ioWork, int i17, java.lang.String name) {
        kotlin.jvm.internal.o.g(retrySg, "retrySg");
        kotlin.jvm.internal.o.g(lightWork, "lightWork");
        kotlin.jvm.internal.o.g(heavyWork, "heavyWork");
        kotlin.jvm.internal.o.g(ioWork, "ioWork");
        kotlin.jvm.internal.o.g(name, "name");
        this.f274172a = retrySg;
        this.f274173b = lightWork;
        this.f274174c = heavyWork;
        this.f274175d = i17;
        this.f274176e = name;
        this.f274177f = "MicroMsg.Loader.TaskLoaderConfiguration";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(gp0.d retrySg, gp0.h lightWork, int i17, java.lang.String name) {
        this(retrySg, lightWork, lightWork, lightWork, i17, name);
        kotlin.jvm.internal.o.g(retrySg, "retrySg");
        kotlin.jvm.internal.o.g(lightWork, "lightWork");
        kotlin.jvm.internal.o.g(name, "name");
    }
}
