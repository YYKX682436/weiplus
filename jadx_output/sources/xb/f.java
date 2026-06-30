package xb;

/* loaded from: classes15.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Paint f452868a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f452869b;

    /* renamed from: c, reason: collision with root package name */
    public float f452870c;

    /* renamed from: d, reason: collision with root package name */
    public float f452871d;

    /* renamed from: e, reason: collision with root package name */
    public xb.i f452872e;

    public f(android.graphics.Paint paint) {
        java.util.HashMap hashMap = new java.util.HashMap(256);
        this.f452869b = hashMap;
        this.f452872e = xb.i.ANY;
        this.f452868a = paint;
        hashMap.clear();
        android.graphics.Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f17 = fontMetrics.bottom;
        float f18 = fontMetrics.top;
        this.f452870c = f17 - f18;
        this.f452871d = -f18;
    }

    public float a(char c17) {
        if (c17 == 0) {
            return 0.0f;
        }
        java.util.Map map = this.f452869b;
        java.lang.Float f17 = (java.lang.Float) ((java.util.HashMap) map).get(java.lang.Character.valueOf(c17));
        if (f17 != null) {
            return f17.floatValue();
        }
        float measureText = this.f452868a.measureText(java.lang.Character.toString(c17));
        ((java.util.HashMap) map).put(java.lang.Character.valueOf(c17), java.lang.Float.valueOf(measureText));
        return measureText;
    }
}
