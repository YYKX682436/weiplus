package com.tencent.mm.pluginsdk.location;

/* loaded from: classes5.dex */
public class LocationView extends android.widget.LinearLayout implements w25.h {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f188755y = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f188756d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f188757e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f188758f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f188759g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f188760h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMProcessBar f188761i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f188762m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f188763n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f188764o;

    /* renamed from: p, reason: collision with root package name */
    public int f188765p;

    /* renamed from: q, reason: collision with root package name */
    public int f188766q;

    /* renamed from: r, reason: collision with root package name */
    public int f188767r;

    /* renamed from: s, reason: collision with root package name */
    public int f188768s;

    /* renamed from: t, reason: collision with root package name */
    public int f188769t;

    /* renamed from: u, reason: collision with root package name */
    public int f188770u;

    /* renamed from: v, reason: collision with root package name */
    public w25.g f188771v;

    /* renamed from: w, reason: collision with root package name */
    public final float f188772w;

    /* renamed from: x, reason: collision with root package name */
    public final float f188773x;

    public LocationView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    @Override // w25.h
    public void a(java.lang.String str, java.lang.String str2) {
        android.view.View view = this.f188763n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/location/LocationView", "setNormalState", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/pluginsdk/location/LocationView", "setNormalState", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f188760h;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/location/LocationView", "setNormalState", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/pluginsdk/location/LocationView", "setNormalState", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f188758f.setVisibility(8);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            setLocationName(str);
        } else {
            setLocationName(str2);
        }
        setLocationNameColor(this.f188766q);
        setLocationIcon(com.tencent.mm.R.raw.icons_filled_location);
        setLocationIconColor(this.f188765p);
    }

    @Override // w25.h
    public void b(int i17) {
        this.f188761i.c(i17, this.f188769t);
        this.f188762m.setTextColor(this.f188770u);
    }

    @Override // w25.h
    public void c() {
        android.view.View view = this.f188763n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/location/LocationView", "setLoadingState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/pluginsdk/location/LocationView", "setLoadingState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f188760h;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/location/LocationView", "setLoadingState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/pluginsdk/location/LocationView", "setLoadingState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // w25.h
    public void d() {
        android.view.View view = this.f188763n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/location/LocationView", "setDefaultState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/pluginsdk/location/LocationView", "setDefaultState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f188760h;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/location/LocationView", "setDefaultState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/pluginsdk/location/LocationView", "setDefaultState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f188758f.setVisibility(8);
        setLocationName(getContext().getString(com.tencent.mm.R.string.ggh));
        this.f188756d.setIconColor(this.f188767r);
        this.f188757e.setTextColor(this.f188768s);
        setLocationIcon(com.tencent.mm.R.raw.icons_outlined_location);
    }

    @Override // w25.h
    public void e(int i17, float f17) {
        this.f188757e.setTextSize(i17, f17);
    }

    public com.tencent.mm.pluginsdk.location.Location getLocation() {
        return new com.tencent.mm.pluginsdk.location.Location(this.f188772w, this.f188773x);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // w25.h
    public void setDefaultLoadingPBarColor(int i17) {
        this.f188769t = i17;
    }

    @Override // w25.h
    public void setDefaultLoadingTipColor(int i17) {
        this.f188770u = i17;
    }

    @Override // w25.h
    public void setDefaultStateIconColor(int i17) {
        this.f188767r = i17;
    }

    @Override // w25.h
    public void setDefaultStateTextColor(int i17) {
        this.f188768s = i17;
    }

    @Override // w25.h
    public void setIconColor(int i17) {
        this.f188765p = i17;
    }

    public void setLocationIcon(int i17) {
        this.f188756d.setImageResource(i17);
    }

    public void setLocationIconColor(int i17) {
        this.f188756d.setIconColor(i17);
    }

    @Override // w25.h
    public void setLocationName(java.lang.String str) {
        this.f188757e.setText(str);
    }

    public void setLocationNameColor(int i17) {
        this.f188757e.setTextColor(i17);
    }

    @Override // w25.h
    public void setLocationRightTips(java.lang.String str) {
        this.f188759g.setText(str);
        this.f188759g.setVisibility(0);
    }

    public void setLocationTipColor(int i17) {
        this.f188758f.setTextColor(i17);
    }

    public void setLocationTips(java.lang.String str) {
        this.f188758f.setText(str);
        this.f188758f.setVisibility(0);
    }

    @Override // w25.h
    public void setOnClickLocationListener(w25.g gVar) {
        this.f188771v = gVar;
    }

    @Override // w25.h
    public void setSuggestView(java.lang.String str) {
        android.view.View view = this.f188763n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/location/LocationView", "setSuggestView", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/pluginsdk/location/LocationView", "setSuggestView", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f188760h;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/location/LocationView", "setSuggestView", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/pluginsdk/location/LocationView", "setSuggestView", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f188758f.setVisibility(0);
        setLocationName(str);
        setLocationNameColor(this.f188766q);
        setLocationIcon(com.tencent.mm.R.raw.icons_filled_location);
        setLocationIconColor(this.f188765p);
    }

    @Override // w25.h
    public void setTextColor(int i17) {
        this.f188766q = i17;
    }

    public LocationView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f188772w = -85.0f;
        this.f188773x = -1000.0f;
        this.f188764o = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.bsn, this);
        this.f188756d = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.in7);
        this.f188757e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.inn);
        this.f188758f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ino);
        this.f188759g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.qup);
        this.f188760h = findViewById(com.tencent.mm.R.id.inf);
        this.f188761i = (com.tencent.mm.ui.widget.MMProcessBar) findViewById(com.tencent.mm.R.id.inz);
        this.f188762m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485691io0);
        this.f188763n = findViewById(com.tencent.mm.R.id.ink);
        setBackgroundResource(com.tencent.mm.R.drawable.f481306q2);
        this.f188764o.setOnClickListener(new w25.l(this));
        setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478502m));
        setIconColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478502m));
        setDefaultStateIconColor(getContext().getResources().getColor(com.tencent.mm.R.color.a0c));
        setDefaultStateTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.a0c));
        setDefaultLoadingPBarColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478502m));
        setDefaultLoadingTipColor(getContext().getResources().getColor(com.tencent.mm.R.color.FG_2));
    }
}
