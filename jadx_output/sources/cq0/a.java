package cq0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final cq0.a f221325a = new cq0.a();

    public final float a(float f17) {
        return (float) java.lang.Math.ceil(f17 / (com.tencent.mm.sdk.platformtools.x2.n() ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDisplayMetrics().density : 0.0f));
    }

    public final java.util.HashMap b(android.graphics.RectF frame) {
        kotlin.jvm.internal.o.g(frame, "frame");
        java.util.HashMap hashMap = new java.util.HashMap();
        cq0.a aVar = f221325a;
        hashMap.put("x", java.lang.Float.valueOf(aVar.a(frame.left)));
        hashMap.put("y", java.lang.Float.valueOf(aVar.a(frame.top)));
        hashMap.put("w", java.lang.Float.valueOf(aVar.a(frame.width())));
        hashMap.put("h", java.lang.Float.valueOf(aVar.a(frame.height())));
        return hashMap;
    }
}
