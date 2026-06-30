package uo5;

/* loaded from: classes13.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final uo5.m f429714a;

    /* renamed from: b, reason: collision with root package name */
    public final uo5.n f429715b;

    /* renamed from: c, reason: collision with root package name */
    public final uo5.p f429716c;

    public b(uo5.m codecProvider, uo5.n configProvider, uo5.p dataCallbackProxy) {
        kotlin.jvm.internal.o.g(codecProvider, "codecProvider");
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        kotlin.jvm.internal.o.g(dataCallbackProxy, "dataCallbackProxy");
        this.f429714a = codecProvider;
        this.f429715b = configProvider;
        this.f429716c = dataCallbackProxy;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo5.b)) {
            return false;
        }
        uo5.b bVar = (uo5.b) obj;
        return kotlin.jvm.internal.o.b(this.f429714a, bVar.f429714a) && kotlin.jvm.internal.o.b(this.f429715b, bVar.f429715b) && kotlin.jvm.internal.o.b(this.f429716c, bVar.f429716c);
    }

    public int hashCode() {
        return (((this.f429714a.hashCode() * 31) + this.f429715b.hashCode()) * 31) + this.f429716c.hashCode();
    }

    public java.lang.String toString() {
        return "CodecContext(codecProvider=" + this.f429714a + ", configProvider=" + this.f429715b + ", dataCallbackProxy=" + this.f429716c + ')';
    }
}
