package lg1;

/* loaded from: classes5.dex */
public class a extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.LinearLayout f318546d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f318547e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f318548f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f318549g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.ViewGroup f318550h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.ViewGroup f318551i;

    public a(android.content.Context context, boolean z17) {
        super(context);
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.d3x, this);
        this.f318547e = context;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.cg7);
        this.f318546d = linearLayout;
        linearLayout.setOrientation(!z17 ? 1 : 0);
        this.f318548f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f484050cu2);
        this.f318549g = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.h5n);
        this.f318550h = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.m7g);
        this.f318551i = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.gu6);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view) {
        this.f318546d.addView(view);
    }

    public void setHasBorder(boolean z17) {
        android.view.ViewGroup viewGroup = this.f318550h;
        if (z17) {
            viewGroup.setBackground(this.f318547e.getDrawable(com.tencent.mm.R.drawable.b3p));
        } else {
            viewGroup.setBackground(null);
        }
    }

    public void setStep(lg1.b bVar) {
        android.view.ViewGroup viewGroup = this.f318551i;
        android.widget.ImageView imageView = this.f318549g;
        android.widget.TextView textView = this.f318548f;
        if (bVar == null) {
            textView.setText((java.lang.CharSequence) null);
            imageView.setImageDrawable(null);
            viewGroup.setVisibility(8);
        } else {
            textView.setText(bVar.f318552a);
            int i17 = bVar.f318553b;
            imageView.setImageResource(i17 != -2 ? i17 != 0 ? i17 != 2 ? com.tencent.mm.R.drawable.brt : com.tencent.mm.R.drawable.brs : com.tencent.mm.R.drawable.bru : com.tencent.mm.R.drawable.brv);
            viewGroup.setVisibility(0);
        }
    }
}
