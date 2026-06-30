package vu0;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.nio.ByteBuffer f440114a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.segments.CaptionItem f440115b;

    public l(java.nio.ByteBuffer pcmData, com.tencent.maas.moviecomposing.segments.CaptionItem captionItem) {
        kotlin.jvm.internal.o.g(pcmData, "pcmData");
        kotlin.jvm.internal.o.g(captionItem, "captionItem");
        this.f440114a = pcmData;
        this.f440115b = captionItem;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu0.l)) {
            return false;
        }
        vu0.l lVar = (vu0.l) obj;
        return kotlin.jvm.internal.o.b(this.f440114a, lVar.f440114a) && kotlin.jvm.internal.o.b(this.f440115b, lVar.f440115b);
    }

    public int hashCode() {
        return (this.f440114a.hashCode() * 31) + this.f440115b.hashCode();
    }

    public java.lang.String toString() {
        return "CaptionItemWithPCM(pcmData=" + this.f440114a + ", captionItem=" + this.f440115b + ')';
    }
}
