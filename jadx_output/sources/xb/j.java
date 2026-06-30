package xb;

/* loaded from: classes15.dex */
public class j {

    /* renamed from: b, reason: collision with root package name */
    public int f452880b;

    /* renamed from: c, reason: collision with root package name */
    public float f452881c;

    /* renamed from: d, reason: collision with root package name */
    public float f452882d;

    /* renamed from: e, reason: collision with root package name */
    public float f452883e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f452884f;

    /* renamed from: h, reason: collision with root package name */
    public float f452886h;

    /* renamed from: i, reason: collision with root package name */
    public int f452887i;

    /* renamed from: g, reason: collision with root package name */
    public int f452885g = -16777216;

    /* renamed from: a, reason: collision with root package name */
    public int f452879a = 8388611;

    public j(com.robinhood.ticker.TickerView tickerView, android.content.res.Resources resources) {
        this.f452886h = android.util.TypedValue.applyDimension(2, 12.0f, resources.getDisplayMetrics());
    }

    public void a(android.content.res.TypedArray typedArray) {
        this.f452879a = typedArray.getInt(4, this.f452879a);
        this.f452880b = typedArray.getColor(6, this.f452880b);
        this.f452881c = typedArray.getFloat(7, this.f452881c);
        this.f452882d = typedArray.getFloat(8, this.f452882d);
        this.f452883e = typedArray.getFloat(9, this.f452883e);
        this.f452884f = typedArray.getString(5);
        this.f452885g = typedArray.getColor(3, this.f452885g);
        this.f452886h = typedArray.getDimension(1, this.f452886h);
        this.f452887i = typedArray.getInt(2, this.f452887i);
    }
}
