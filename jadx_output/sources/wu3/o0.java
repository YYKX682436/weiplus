package wu3;

/* loaded from: classes10.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f449786a;

    /* renamed from: b, reason: collision with root package name */
    public long f449787b;

    public o0(java.util.List editorItems) {
        kotlin.jvm.internal.o.g(editorItems, "editorItems");
        this.f449786a = editorItems;
    }

    public final long a(android.graphics.Canvas canvas, android.graphics.Paint paint) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(paint, "paint");
        java.util.List<av3.a> list = this.f449786a;
        if (list.size() <= 0) {
            return 0L;
        }
        long j17 = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        for (av3.a aVar : list) {
            long a17 = aVar.a(this.f449787b);
            aVar.c(canvas, paint);
            if (a17 < j17) {
                j17 = a17;
            }
        }
        this.f449787b = j17;
        return j17;
    }
}
