package sz4;

/* loaded from: classes12.dex */
public abstract class u extends sz4.a {

    /* renamed from: w, reason: collision with root package name */
    public static final int f414229w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f414230x;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f414231f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText f414232g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText f414233h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.LinearLayout f414234i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f414235m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f414236n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.ImageView f414237o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f414238p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.LinearLayout f414239q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.LinearLayout f414240r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.LinearLayout f414241s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.LinearLayout f414242t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.LinearLayout f414243u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View.OnClickListener f414244v;

    static {
        float f17 = android.content.res.Resources.getSystem().getDisplayMetrics().density;
        f414229w = android.content.res.Resources.getSystem().getDisplayMetrics().widthPixels;
        f414230x = (int) ((f17 * 40.0f) + 0.5f);
    }

    public u(android.view.View view, mz4.j0 j0Var, mz4.d dVar) {
        super(view, j0Var, dVar);
        this.f414244v = new sz4.y(this);
        this.f414231f = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.d67);
        this.f414238p = view.findViewById(com.tencent.mm.R.id.f487544oy4);
        this.f414234i = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.kea);
        this.f414239q = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.f486165kf3);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.keb);
        this.f414235m = textView;
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ke9);
        this.f414236n = textView2;
        this.f414237o = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.ke_);
        textView.setTextSize(16.0f);
        textView2.setTextSize(12.0f);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.f486163kf1);
        this.f414240r = linearLayout;
        linearLayout.setVisibility(8);
        ((android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.keu)).setVisibility(8);
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.ke8);
        this.f414242t = linearLayout2;
        linearLayout2.setVisibility(8);
        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.kmx);
        this.f414243u = linearLayout3;
        linearLayout3.setBackgroundColor(1347529272);
        linearLayout3.setVisibility(8);
        linearLayout3.setOnClickListener(new sz4.v(this));
        android.widget.LinearLayout linearLayout4 = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.kn7);
        linearLayout4.setBackgroundColor(1347529272);
        linearLayout4.setVisibility(4);
        android.widget.LinearLayout linearLayout5 = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.f486216kn1);
        linearLayout5.setBackgroundColor(1347529272);
        linearLayout5.setVisibility(4);
        android.widget.LinearLayout linearLayout6 = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.d77);
        this.f414241s = linearLayout6;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) linearLayout6.getLayoutParams();
        layoutParams.width = f414229w - f414230x;
        layoutParams.height = -2;
        linearLayout6.setLayoutParams(layoutParams);
        com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText = (com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText) view.findViewById(com.tencent.mm.R.id.azq);
        this.f414233h = wXRTEditText;
        com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText2 = (com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText) view.findViewById(com.tencent.mm.R.id.azt);
        this.f414232g = wXRTEditText2;
        ((android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.azr)).setOnClickListener(new sz4.w(this));
        ((android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.azu)).setOnClickListener(new sz4.x(this));
        wXRTEditText.setEditTextType(2);
        wXRTEditText2.setEditTextType(1);
        wXRTEditText2.E = this;
        wXRTEditText.E = this;
        if (j0Var.f333309q != 2 || !this.f414182d.f333310r) {
            wXRTEditText.setKeyListener(null);
            wXRTEditText.setEnabled(false);
            wXRTEditText.setFocusable(false);
            wXRTEditText2.setKeyListener(null);
            wXRTEditText2.setEnabled(false);
            wXRTEditText2.setFocusable(false);
        }
        this.f414182d.k(wXRTEditText2);
        this.f414182d.k(wXRTEditText);
    }

    @Override // sz4.a
    public void j(iz4.c cVar, final int i17, int i18) {
        com.tencent.mars.xlog.Log.i("Micromsg.NoteOtherItemHolder", "ImageItemHolder position is " + getLayoutPosition());
        com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText = this.f414232g;
        wXRTEditText.setPosInDataList(i17);
        com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText2 = this.f414233h;
        wXRTEditText2.setPosInDataList(i17);
        if (nz4.y.M) {
            nz4.y.h().G(n(this.itemView), this.itemView, false);
        }
        cVar.f296106d = wXRTEditText;
        cVar.f296107e = wXRTEditText2;
        cVar.f296108f = null;
        o(cVar);
        android.widget.LinearLayout linearLayout = this.f414234i;
        if (linearLayout.getVisibility() == 0) {
            if (cVar.f296111i) {
                linearLayout.setBackgroundResource(com.tencent.mm.R.drawable.bbg);
            } else {
                linearLayout.setBackgroundResource(com.tencent.mm.R.drawable.bbf);
            }
        }
        if (k() != null) {
            int i19 = i();
            android.view.View k17 = k();
            android.content.Context context = k17.getContext();
            if (i19 == 20) {
                k17.setContentDescription(context.getResources().getString(com.tencent.mm.R.string.l_r));
                context.getResources().getString(com.tencent.mm.R.string.l_r);
            } else if (i19 == 30) {
                k17.setContentDescription(context.getResources().getString(com.tencent.mm.R.string.b1n));
                context.getResources().getString(com.tencent.mm.R.string.b1n);
            } else if (i19 == -3) {
                k17.setContentDescription(context.getResources().getString(com.tencent.mm.R.string.fw9));
                context.getResources().getString(com.tencent.mm.R.string.fw9);
            } else if (i19 == -2) {
                k17.setContentDescription(context.getResources().getString(com.tencent.mm.R.string.aot));
                context.getResources().getString(com.tencent.mm.R.string.aot);
            } else if (i19 == 2) {
                k17.setContentDescription(context.getResources().getString(com.tencent.mm.R.string.h_f));
                context.getResources().getString(com.tencent.mm.R.string.h_f);
            } else if (i19 == 3) {
                k17.setContentDescription(context.getResources().getString(com.tencent.mm.R.string.h_g));
                context.getResources().getString(com.tencent.mm.R.string.h_g);
            } else if (i19 == 4) {
                k17.setContentDescription(context.getResources().getString(com.tencent.mm.R.string.l_s));
                context.getResources().getString(com.tencent.mm.R.string.l_s);
            } else if (i19 == 5) {
                k17.setContentDescription(context.getResources().getString(com.tencent.mm.R.string.h_e));
                context.getResources().getString(com.tencent.mm.R.string.h_e);
            } else if (i19 == 6) {
                k17.setContentDescription(context.getResources().getString(com.tencent.mm.R.string.l_r));
                context.getResources().getString(com.tencent.mm.R.string.l_r);
            }
        }
        android.view.View l17 = l();
        if (l17 != null) {
            l17.setOnLongClickListener(new android.view.View.OnLongClickListener() { // from class: sz4.u$$a
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(android.view.View view) {
                    java.lang.Object obj = new java.lang.Object();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    int i27 = i17;
                    arrayList.add(java.lang.Integer.valueOf(i27));
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteOtherItemHolder", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", obj, array);
                    java.lang.Object obj2 = new java.lang.Object();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(java.lang.Integer.valueOf(i27));
                    arrayList2.add(view);
                    java.lang.Object[] array2 = arrayList2.toArray();
                    arrayList2.clear();
                    yj0.a.b("com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteOtherItemHolder", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", obj2, array2);
                    nz4.y.h().y(i27, 0, i27, 0);
                    nz4.y.h().w();
                    yj0.a.i(true, new java.lang.Object(), "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteOtherItemHolder", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                    yj0.a.i(true, new java.lang.Object(), "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteOtherItemHolder", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                    return true;
                }
            });
        }
    }

    public android.view.View k() {
        return null;
    }

    public android.view.View l() {
        return null;
    }

    public nz4.g n(android.view.View view) {
        return nz4.z.a(view);
    }

    public void o(iz4.c cVar) {
        boolean z17 = cVar.f296104b;
        com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText = this.f414233h;
        com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText2 = this.f414232g;
        if (z17) {
            if (cVar.f296110h) {
                wXRTEditText2.requestFocus();
                return;
            } else {
                wXRTEditText.requestFocus();
                return;
            }
        }
        if (wXRTEditText2.hasFocus()) {
            wXRTEditText2.clearFocus();
        }
        if (wXRTEditText.hasFocus()) {
            wXRTEditText.clearFocus();
        }
    }
}
