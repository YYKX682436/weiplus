package e91;

/* loaded from: classes13.dex */
public class b extends android.graphics.Paint implements java.io.Serializable {

    /* renamed from: e, reason: collision with root package name */
    public float f250341e;

    /* renamed from: f, reason: collision with root package name */
    public int f250342f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f250343g;

    /* renamed from: h, reason: collision with root package name */
    public int f250344h;

    /* renamed from: d, reason: collision with root package name */
    public e91.a f250340d = e91.a.NORMAL;

    /* renamed from: i, reason: collision with root package name */
    public float f250345i = Float.MAX_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f250346m = Integer.MAX_VALUE;

    public b() {
        c();
    }

    public e91.b a() {
        e91.b bVar = new e91.b();
        bVar.setColor(getColor());
        bVar.setFlags(getFlags());
        bVar.setDither(isDither());
        android.graphics.Shader shader = getShader();
        if (shader != null) {
            java.lang.Object a17 = ik1.e0.a(android.graphics.Shader.class, "copy", shader, new java.lang.Class[0], new java.lang.Object[0]);
            if (a17 != null && (a17 instanceof android.graphics.Shader)) {
                shader = (android.graphics.Shader) a17;
            }
            bVar.setShader(shader);
        }
        bVar.setStrokeJoin(getStrokeJoin());
        bVar.setStrokeMiter(getStrokeMiter());
        bVar.setStrokeWidth(getStrokeWidth());
        bVar.setStrokeCap(getStrokeCap());
        bVar.setStyle(getStyle());
        bVar.setTextSize(getTextSize());
        bVar.setTextAlign(getTextAlign());
        bVar.setTypeface(getTypeface());
        bVar.f250340d = this.f250340d;
        return bVar;
    }

    public e91.b b(e91.b bVar) {
        bVar.setColor(getColor());
        bVar.setFlags(getFlags());
        bVar.setDither(isDither());
        android.graphics.Shader shader = getShader();
        if (shader != null) {
            java.lang.Object a17 = ik1.e0.a(android.graphics.Shader.class, "copy", shader, new java.lang.Class[0], new java.lang.Object[0]);
            if (a17 != null && (a17 instanceof android.graphics.Shader)) {
                shader = (android.graphics.Shader) a17;
            }
            bVar.setShader(shader);
        }
        bVar.setStrokeJoin(getStrokeJoin());
        bVar.setStrokeMiter(getStrokeMiter());
        bVar.setStrokeWidth(getStrokeWidth());
        bVar.setStrokeCap(getStrokeCap());
        bVar.setStyle(getStyle());
        bVar.setTextSize(getTextSize());
        bVar.setTextAlign(getTextAlign());
        bVar.setTypeface(getTypeface());
        bVar.f250340d = this.f250340d;
        return bVar;
    }

    public final void c() {
        this.f250341e = 0.0f;
        this.f250342f = 0;
        this.f250343g = null;
        this.f250344h = 0;
        float f17 = this.f250345i;
        if (f17 == Float.MAX_VALUE) {
            float alpha = getAlpha() / 255.0f;
            this.f250341e = alpha;
            this.f250345i = alpha;
        } else {
            this.f250341e = f17;
        }
        int i17 = this.f250346m;
        if (i17 != Integer.MAX_VALUE) {
            this.f250342f = i17;
            return;
        }
        int color = getColor();
        this.f250342f = color;
        this.f250346m = color;
    }

    public java.lang.Object clone() {
        return super.clone();
    }

    public void d(int i17) {
        this.f250344h = i17;
        setTypeface(android.graphics.Typeface.create(this.f250343g, i17));
    }

    @Override // android.graphics.Paint
    public void reset() {
        super.reset();
        this.f250340d = e91.a.NORMAL;
    }

    @Override // android.graphics.Paint
    public void setColor(int i17) {
        this.f250342f = i17;
        super.setColor((i17 & 16777215) | ((((int) (android.graphics.Color.alpha(i17) * this.f250341e)) & 255) << 24));
    }
}
