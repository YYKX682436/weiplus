package xg2;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final rm0.j f454379a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.CancellationException f454380b;

    public a(rm0.j jVar, java.util.concurrent.CancellationException cancellationException, int i17, kotlin.jvm.internal.i iVar) {
        jVar = (i17 & 1) != 0 ? null : jVar;
        cancellationException = (i17 & 2) != 0 ? null : cancellationException;
        this.f454379a = jVar;
        this.f454380b = cancellationException;
    }

    public java.lang.String toString() {
        java.lang.String jVar;
        rm0.j jVar2 = this.f454379a;
        if (jVar2 != null && (jVar = jVar2.toString()) != null) {
            return jVar;
        }
        return "cancelException: " + this.f454380b;
    }
}
