package rl1;

/* loaded from: classes5.dex */
public class b extends android.widget.LinearLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final int f397155e = android.graphics.Color.parseColor("#000000");

    /* renamed from: f, reason: collision with root package name */
    public static final int f397156f = android.graphics.Color.parseColor("#000000");

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f397157d;

    public b(android.content.Context context) {
        super(context);
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        setOrientation(1);
        setGravity(17);
        android.widget.TextView textView = new android.widget.TextView(context);
        this.f397157d = textView;
        textView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        addView(this.f397157d);
    }

    public void a(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39) {
        setPadding(i18, i18, i18, i18);
        rl1.a aVar = new rl1.a();
        aVar.f397151f = i17;
        aVar.f397146a.setColor(i27);
        aVar.f397152g = i18;
        aVar.f397154i = (i18 / 3) + aVar.f397153h;
        android.graphics.Paint paint = aVar.f397147b;
        paint.setColor(i19);
        if (i38 > 0) {
            paint.setShadowLayer(i39 <= 0 ? 1.0f : i39, i29, i37, i28);
        }
        setBackgroundDrawable(aVar);
    }

    public void setGravity(java.lang.String str) {
        if (str.equals("left")) {
            this.f397157d.setGravity(3);
            return;
        }
        if (str.equals("right")) {
            this.f397157d.setGravity(5);
        } else if (str.equals("center")) {
            this.f397157d.setGravity(17);
        } else {
            this.f397157d.setGravity(17);
        }
    }

    public void setText(java.lang.String str) {
        this.f397157d.setText(str);
    }

    public void setTextColor(int i17) {
        this.f397157d.setTextColor(i17);
    }

    public void setTextSize(int i17) {
        this.f397157d.setTextSize(i17);
    }

    public void setTitlePadding(int i17) {
        this.f397157d.setPadding(i17, i17, i17, i17);
    }
}
