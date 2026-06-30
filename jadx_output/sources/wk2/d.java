package wk2;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f446938a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.multistream.panel.preview.MultiStreamPreviewView f446939b;

    /* renamed from: c, reason: collision with root package name */
    public final in5.c f446940c;

    public d(int i17, com.tencent.mm.plugin.finder.live.multistream.panel.preview.MultiStreamPreviewView view, in5.c data) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(data, "data");
        this.f446938a = i17;
        this.f446939b = view;
        this.f446940c = data;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wk2.d)) {
            return false;
        }
        wk2.d dVar = (wk2.d) obj;
        return this.f446938a == dVar.f446938a && kotlin.jvm.internal.o.b(this.f446939b, dVar.f446939b) && kotlin.jvm.internal.o.b(this.f446940c, dVar.f446940c);
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f446938a) * 31) + this.f446939b.hashCode()) * 31) + this.f446940c.hashCode();
    }

    public java.lang.String toString() {
        return "LivePreviewData(pos=" + this.f446938a + ", view=" + this.f446939b + ", data=" + this.f446940c + ')';
    }
}
