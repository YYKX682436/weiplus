package df5;

/* loaded from: classes5.dex */
public final class l extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public yz5.l f232151d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f232152e;

    /* renamed from: f, reason: collision with root package name */
    public final int f232153f;

    /* renamed from: g, reason: collision with root package name */
    public final float f232154g;

    /* renamed from: h, reason: collision with root package name */
    public final int f232155h;

    /* renamed from: i, reason: collision with root package name */
    public final int f232156i;

    /* renamed from: m, reason: collision with root package name */
    public final int f232157m;

    /* renamed from: n, reason: collision with root package name */
    public v11.h f232158n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f232159o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f232160p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.Runnable f232161q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f232153f = context.getResources().getColor(com.tencent.mm.R.color.Link_170);
        this.f232154g = android.util.TypedValue.applyDimension(1, i65.a.m(context) * 17.0f, context.getResources().getDisplayMetrics());
        this.f232155h = (int) android.util.TypedValue.applyDimension(1, 12.0f, context.getResources().getDisplayMetrics());
        this.f232156i = (int) android.util.TypedValue.applyDimension(1, 12.0f, context.getResources().getDisplayMetrics());
        this.f232157m = (int) android.util.TypedValue.applyDimension(1, 4.0f, context.getResources().getDisplayMetrics());
        this.f232159o = new java.util.LinkedHashMap();
        this.f232160p = new java.util.ArrayList();
        setOrientation(1);
        this.f232161q = new df5.j(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getActualContainerWidth() {
        java.lang.Object parent = getParent();
        if (parent instanceof android.view.View) {
            if (((android.view.View) parent).getWidth() > 0) {
                return (int) (r0.getWidth() * 0.9f);
            }
        }
        return getEstimatedContainerWidth();
    }

    private final int getDisabledTextColor() {
        return com.tencent.mm.ui.bk.C() ? getContext().getResources().getColor(com.tencent.mm.R.color.FG_3) : this.f232153f;
    }

    private final int getEstimatedContainerWidth() {
        int width;
        java.lang.Object parent = getParent();
        return (int) (((!(parent instanceof android.view.View) || (width = ((android.view.View) parent).getWidth()) <= 0) ? getContext().getResources().getDisplayMetrics().widthPixels * 0.8f : width) * 0.9f);
    }

    public final java.util.List b(java.util.List list, int i17) {
        int measureText;
        if (i17 <= 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(kz5.b0.c((v11.e) it.next()));
            }
            return arrayList;
        }
        int i18 = (int) (i17 * 0.7f);
        int i19 = (this.f232156i * 2) + 1;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it6 = list.iterator();
        int i27 = 0;
        while (it6.hasNext()) {
            v11.e eVar = (v11.e) it6.next();
            java.lang.String str = eVar.f432356b;
            if (str.length() == 0) {
                measureText = 0;
            } else {
                android.graphics.Paint paint = new android.graphics.Paint();
                paint.setTextSize(this.f232154g);
                paint.setTypeface(android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 0));
                measureText = (int) paint.measureText(str);
            }
            if (measureText > i18) {
                if (!arrayList3.isEmpty()) {
                    arrayList2.add(kz5.n0.S0(arrayList3));
                    arrayList3.clear();
                    i27 = 0;
                }
                arrayList2.add(kz5.b0.c(eVar));
            } else {
                int i28 = (arrayList3.isEmpty() ^ true ? i19 + measureText : measureText) + i27;
                if ((!arrayList3.isEmpty()) && (i28 > i17 || arrayList3.size() >= 6)) {
                    arrayList2.add(kz5.n0.S0(arrayList3));
                    arrayList3.clear();
                    i27 = 0;
                }
                arrayList3.add(eVar);
                if (arrayList3.size() > 1) {
                    measureText += i19;
                }
                i27 += measureText;
            }
        }
        if (!arrayList3.isEmpty()) {
            arrayList2.add(kz5.n0.S0(arrayList3));
        }
        return arrayList2;
    }

    public final android.widget.LinearLayout c(java.util.List list) {
        java.lang.String string;
        int color;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        linearLayout.setGravity(8388627);
        int i17 = 0;
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            v11.e eVar = (v11.e) obj;
            if (i17 > 0) {
                v11.b bVar = eVar.f432360f;
                android.view.View view = new android.view.View(getContext());
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(com.tencent.mm.ui.zk.a(view.getContext(), 1), com.tencent.mm.ui.zk.a(view.getContext(), 16));
                int i19 = this.f232156i;
                layoutParams.setMarginStart(i19);
                layoutParams.setMarginEnd(i19);
                int i27 = this.f232155h;
                layoutParams.topMargin = i27;
                layoutParams.bottomMargin = i27;
                view.setLayoutParams(layoutParams);
                view.post(new dw3.a(view));
                int ordinal = bVar.ordinal();
                if (ordinal == 0) {
                    color = view.getContext().getResources().getColor(com.tencent.mm.R.color.FG_3);
                } else if (ordinal == 1) {
                    color = getDisabledTextColor();
                } else {
                    if (ordinal != 2) {
                        throw new jz5.j();
                    }
                    color = getDisabledTextColor();
                }
                view.setBackgroundColor(color);
                ((java.util.ArrayList) this.f232160p).add(view);
                linearLayout.addView(view);
            }
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            df5.g gVar = new df5.g(context);
            android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -2);
            int i28 = this.f232157m;
            layoutParams2.topMargin = i28;
            layoutParams2.bottomMargin = i28;
            gVar.setLayoutParams(layoutParams2);
            java.lang.String str = eVar.f432356b;
            v11.b bVar2 = eVar.f432360f;
            gVar.b(str, bVar2);
            if (bVar2 == v11.b.f432329d) {
                gVar.setClickable(true);
                gVar.setOnTouchListener(new df5.h(gVar, this, eVar));
            }
            int ordinal2 = eVar.f432355a.ordinal();
            java.lang.String str2 = eVar.f432356b;
            if (ordinal2 == 0) {
                string = gVar.getContext().getString(com.tencent.mm.R.string.p_v, str2);
            } else {
                if (ordinal2 != 1) {
                    throw new jz5.j();
                }
                string = gVar.getContext().getString(com.tencent.mm.R.string.p_w, str2);
            }
            gVar.setContentDescription(string);
            java.lang.String str3 = eVar.f432361g;
            if (str3.length() > 0) {
                this.f232159o.put(str3, gVar);
            }
            linearLayout.addView(gVar);
            i17 = i18;
        }
        return linearLayout;
    }

    public final void d() {
        for (df5.g gVar : ((java.util.LinkedHashMap) this.f232159o).values()) {
            gVar.f232107v = false;
            android.animation.ValueAnimator valueAnimator = gVar.f232105t;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            gVar.f232105t = null;
            gVar.f232106u = 0.0f;
            gVar.invalidate();
        }
        v11.h hVar = this.f232158n;
        if (hVar != null) {
            java.util.List list = hVar.f432393a;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((v11.e) it.next()).b(v11.b.f432329d));
            }
            f(new v11.h(arrayList));
            com.tencent.mars.xlog.Log.i("MicroMsg.WeClawCallbackManager", "clearPendingCallback: msgSvrId=%d", java.lang.Long.valueOf(qy4.e.f367787a));
            qy4.e.f367787a = 0L;
        }
        removeCallbacks(this.f232161q);
    }

    public final void e(v11.h hVar) {
        this.f232158n = hVar;
        removeAllViews();
        ((java.util.LinkedHashMap) this.f232159o).clear();
        ((java.util.ArrayList) this.f232160p).clear();
        removeCallbacks(this.f232161q);
        if (hVar != null) {
            java.util.List list = hVar.f432393a;
            if (!list.isEmpty()) {
                int i17 = 0;
                setVisibility(0);
                if (list.isEmpty()) {
                    setVisibility(8);
                    return;
                }
                int estimatedContainerWidth = getEstimatedContainerWidth();
                java.util.List b17 = b(list, estimatedContainerWidth);
                java.util.Iterator it = ((java.util.ArrayList) b17).iterator();
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    addView(c((java.util.List) next));
                    i17 = i18;
                }
                post(new df5.i(this, estimatedContainerWidth, list, b17));
                return;
            }
        }
        setVisibility(8);
    }

    public final void f(v11.h newOptions) {
        kotlin.jvm.internal.o.g(newOptions, "newOptions");
        this.f232158n = newOptions;
        java.util.List<v11.e> list = newOptions.f432393a;
        for (v11.e eVar : list) {
            df5.g gVar = (df5.g) ((java.util.LinkedHashMap) this.f232159o).get(eVar.f432361g);
            if (gVar != null) {
                java.lang.String str = eVar.f432356b;
                v11.b bVar = eVar.f432360f;
                gVar.b(str, bVar);
                int ordinal = bVar.ordinal();
                if (ordinal == 0) {
                    gVar.setClickable(true);
                    gVar.setOnTouchListener(new df5.k(gVar, this, eVar));
                } else if (ordinal == 1 || ordinal == 2) {
                    gVar.setClickable(false);
                    gVar.setFocusable(false);
                    gVar.setOnTouchListener(null);
                    gVar.setPressedState(false);
                }
            }
        }
        if (list.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f232160p;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = list.size();
        int i17 = 0;
        for (int i18 = 1; i18 < size && i17 < arrayList.size(); i18++) {
            v11.e eVar2 = (v11.e) list.get(i18 - 1);
            v11.e eVar3 = (v11.e) list.get(i18);
            v11.b bVar2 = eVar2.f432360f;
            v11.b bVar3 = v11.b.f432329d;
            ((android.view.View) arrayList.get(i17)).setBackgroundColor(bVar2 == bVar3 && eVar3.f432360f == bVar3 ? getContext().getResources().getColor(com.tencent.mm.R.color.FG_3) : getDisabledTextColor());
            i17++;
        }
    }

    public final yz5.l getOnButtonClickListener() {
        return this.f232151d;
    }

    public final yz5.a getOnInteractionConsumed() {
        return this.f232152e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
    }

    public final void setOnButtonClickListener(yz5.l lVar) {
        this.f232151d = lVar;
    }

    public final void setOnInteractionConsumed(yz5.a aVar) {
        this.f232152e = aVar;
    }
}
