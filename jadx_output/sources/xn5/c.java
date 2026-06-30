package xn5;

/* loaded from: classes13.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f455652a;

    /* renamed from: b, reason: collision with root package name */
    public final int f455653b;

    public c(xn5.g gVar, java.lang.String name, xn5.d type, long j17, int i17, int i18, kotlin.jvm.internal.i iVar) {
        name = (i18 & 1) != 0 ? "" : name;
        type = (i18 & 2) != 0 ? xn5.d.f455659d : type;
        j17 = (i18 & 4) != 0 ? java.lang.System.nanoTime() : j17;
        i17 = (i18 & 8) != 0 ? -1 : i17;
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        this.f455652a = j17;
        this.f455653b = i17;
    }
}
