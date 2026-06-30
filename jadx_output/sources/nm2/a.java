package nm2;

/* loaded from: classes10.dex */
public abstract class a {
    public a(java.lang.String songMid, boolean z17) {
        kotlin.jvm.internal.o.g(songMid, "songMid");
    }

    public final java.lang.String a() {
        return b() + "`_`" + d();
    }

    public abstract java.lang.String b();

    public final boolean c(java.lang.String songMid, boolean z17) {
        kotlin.jvm.internal.o.g(songMid, "songMid");
        return kotlin.jvm.internal.o.b(a(), songMid + "`_`" + z17);
    }

    public abstract boolean d();
}
