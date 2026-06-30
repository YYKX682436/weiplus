package gx1;

/* loaded from: classes12.dex */
public abstract class l extends gx1.a {

    /* renamed from: x, reason: collision with root package name */
    public static final int f277301x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f277302y;

    /* renamed from: e, reason: collision with root package name */
    public ix1.a f277303e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f277304f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText f277305g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText f277306h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.LinearLayout f277307i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f277308m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f277309n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.ImageView f277310o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f277311p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.LinearLayout f277312q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.LinearLayout f277313r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.LinearLayout f277314s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.LinearLayout f277315t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.LinearLayout f277316u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.LinearLayout f277317v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View.OnClickListener f277318w;

    static {
        float f17 = android.content.res.Resources.getSystem().getDisplayMetrics().density;
        f277301x = android.content.res.Resources.getSystem().getDisplayMetrics().widthPixels;
        f277302y = (int) ((f17 * 40.0f) + 0.5f);
    }

    public l(android.view.View view, nx1.z zVar) {
        super(view, zVar);
        this.f277318w = new gx1.k(this);
        this.f277304f = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.d67);
        this.f277311p = view.findViewById(com.tencent.mm.R.id.f487544oy4);
        this.f277307i = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.kea);
        this.f277312q = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.f486165kf3);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.keb);
        this.f277308m = textView;
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ke9);
        this.f277309n = textView2;
        this.f277310o = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.ke_);
        textView.setTextSize(16.0f);
        textView2.setTextSize(12.0f);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.f486163kf1);
        this.f277313r = linearLayout;
        linearLayout.setVisibility(8);
        ((android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.keu)).setVisibility(8);
        ((android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.ke8)).setVisibility(8);
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.kmx);
        this.f277315t = linearLayout2;
        linearLayout2.setBackgroundColor(1347529272);
        linearLayout2.setVisibility(8);
        linearLayout2.setOnClickListener(new gx1.h(this));
        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.kn7);
        this.f277316u = linearLayout3;
        linearLayout3.setBackgroundColor(1347529272);
        linearLayout3.setVisibility(4);
        android.widget.LinearLayout linearLayout4 = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.f486216kn1);
        this.f277317v = linearLayout4;
        linearLayout4.setBackgroundColor(1347529272);
        linearLayout4.setVisibility(4);
        android.widget.LinearLayout linearLayout5 = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.d77);
        this.f277314s = linearLayout5;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) linearLayout5.getLayoutParams();
        layoutParams.width = f277301x - f277302y;
        layoutParams.height = -2;
        linearLayout5.setLayoutParams(layoutParams);
        com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText = (com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText) view.findViewById(com.tencent.mm.R.id.azq);
        this.f277306h = wXRTEditText;
        com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText2 = (com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText) view.findViewById(com.tencent.mm.R.id.azt);
        this.f277305g = wXRTEditText2;
        ((android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.azr)).setOnClickListener(new gx1.i(this));
        ((android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.azu)).setOnClickListener(new gx1.j(this));
        wXRTEditText.setEditTextType(2);
        wXRTEditText2.setEditTextType(1);
        wXRTEditText2.E = this;
        wXRTEditText.E = this;
        this.f277291d.f(wXRTEditText2);
        this.f277291d.f(wXRTEditText);
    }

    @Override // gx1.a
    public void j(ix1.a aVar, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EditorOtherItemHolder", "ImageItemHolder position is %d, editable:%b", java.lang.Integer.valueOf(getLayoutPosition()), java.lang.Boolean.valueOf(this.f277291d.f341334d));
        this.f277303e = aVar;
        com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText = this.f277305g;
        wXRTEditText.setPosInDataList(i17);
        com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText2 = this.f277306h;
        wXRTEditText2.setPosInDataList(i17);
        if (ox1.s.K) {
            ox1.s.h().D(this.f277315t, this.f277316u, this.f277317v, i17);
        }
        aVar.f295314d = wXRTEditText;
        aVar.f295315e = wXRTEditText2;
        aVar.f295316f = null;
        if (!aVar.f295312b) {
            if (wXRTEditText.hasFocus()) {
                wXRTEditText.clearFocus();
            }
            if (wXRTEditText2.hasFocus()) {
                wXRTEditText2.clearFocus();
            }
        } else if (aVar.f295317g) {
            wXRTEditText.requestFocus();
        } else {
            wXRTEditText2.requestFocus();
        }
        android.widget.LinearLayout linearLayout = this.f277307i;
        if (linearLayout.getVisibility() == 0) {
            if (aVar.f295318h) {
                linearLayout.setBackgroundResource(com.tencent.mm.R.drawable.f481379rq);
            } else {
                linearLayout.setBackgroundResource(com.tencent.mm.R.drawable.f481378rp);
            }
        }
    }
}
