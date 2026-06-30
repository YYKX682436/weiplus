package tz4;

/* loaded from: classes12.dex */
public class i extends androidx.recyclerview.widget.f2 {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.ref.WeakReference f423346f;

    /* renamed from: g, reason: collision with root package name */
    public tz4.h f423347g;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f423344d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final tz4.u[] f423345e = {tz4.u.Bold, tz4.u.Highlight, tz4.u.Paragraph_OL, tz4.u.Paragraph_UL, tz4.u.Paragraph_Todo, tz4.u.Paragraph_Separator, tz4.u.CurrentTime};

    /* renamed from: h, reason: collision with root package name */
    public int f423348h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f423349i = 0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f423350m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f423351n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f423352o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f423353p = -1;

    public i(android.content.Context context, tz4.k kVar) {
        this.f423346f = new java.lang.ref.WeakReference(kVar);
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.WNToolBarAdapter", "WNToolBarAdapter created, layout calculation will be deferred to first bind", null);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f423345e.length;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        boolean z17;
        tz4.j jVar = (tz4.j) k3Var;
        tz4.u[] uVarArr = this.f423345e;
        if (i17 >= uVarArr.length) {
            return;
        }
        if (!this.f423352o || (((z17 = this.f423350m) && this.f423349i <= 0) || (!z17 && this.f423348h <= 0))) {
            x(y(jVar.itemView.getContext()));
        }
        java.util.HashMap hashMap = this.f423344d;
        hashMap.put(uVarArr[i17], jVar.f423354d);
        int ordinal = uVarArr[i17].ordinal();
        com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton = jVar.f423354d;
        switch (ordinal) {
            case 0:
                weImageButton.setImageResource(com.tencent.mm.R.raw.icons_outlined_note_b);
                weImageButton.setContentDescription(weImageButton.getContext().getString(com.tencent.mm.R.string.l_t));
                weImageButton.setOnClickListener(new tz4.a(this));
                break;
            case 1:
                weImageButton.setImageResource(com.tencent.mm.R.raw.icons_outlined_note_text);
                weImageButton.setContentDescription(weImageButton.getContext().getString(com.tencent.mm.R.string.lyp));
                weImageButton.setOnClickListener(new tz4.b(this));
                break;
            case 2:
                weImageButton.setImageResource(com.tencent.mm.R.raw.icons_outlined_note_order);
                weImageButton.setContentDescription(weImageButton.getContext().getString(com.tencent.mm.R.string.l_u));
                weImageButton.setOnClickListener(new tz4.c(this));
                break;
            case 3:
                weImageButton.setImageResource(com.tencent.mm.R.raw.icons_outlined_note_item);
                weImageButton.setContentDescription(weImageButton.getContext().getString(com.tencent.mm.R.string.l_x));
                weImageButton.setOnClickListener(new tz4.d(this));
                break;
            case 4:
                weImageButton.setImageResource(com.tencent.mm.R.raw.icons_outlined_note_dottedlist);
                weImageButton.setContentDescription(weImageButton.getContext().getString(com.tencent.mm.R.string.l_v));
                weImageButton.setOnClickListener(new tz4.e(this));
                break;
            case 5:
                weImageButton.setImageResource(com.tencent.mm.R.raw.icons_outlined_note_todo);
                weImageButton.setContentDescription(weImageButton.getContext().getString(com.tencent.mm.R.string.l_w));
                weImageButton.setOnClickListener(new tz4.f(this));
                break;
            case 6:
                weImageButton.setImageResource(com.tencent.mm.R.raw.icons_outlined_note_time);
                weImageButton.setContentDescription(weImageButton.getContext().getString(com.tencent.mm.R.string.lyo));
                weImageButton.setOnClickListener(new tz4.g(this));
                break;
        }
        android.view.ViewGroup.LayoutParams layoutParams = weImageButton.getLayoutParams();
        if (this.f423350m) {
            if (layoutParams != null) {
                layoutParams.width = this.f423349i;
                weImageButton.setLayoutParams(layoutParams);
                int f17 = (this.f423349i - i65.a.f(weImageButton.getContext(), com.tencent.mm.R.dimen.f479704cz)) / 2;
                int f18 = i65.a.f(weImageButton.getContext(), com.tencent.mm.R.dimen.f479688cn);
                weImageButton.setPadding(f17, f18, f17, f18);
            }
            jVar.itemView.setPadding(0, 0, 0, 0);
        } else {
            if (layoutParams != null) {
                layoutParams.width = i65.a.f(weImageButton.getContext(), com.tencent.mm.R.dimen.aip);
                weImageButton.setLayoutParams(layoutParams);
                int f19 = i65.a.f(weImageButton.getContext(), com.tencent.mm.R.dimen.f479688cn);
                weImageButton.setPadding(f19, f19, f19, f19);
            }
            jVar.itemView.setPadding(uVarArr[i17] == tz4.u.Bold ? i65.a.f(jVar.itemView.getContext(), com.tencent.mm.R.dimen.aiq) : this.f423348h, 0, this.f423348h, 0);
        }
        if (hashMap.size() == uVarArr.length) {
            java.lang.ref.WeakReference weakReference = this.f423346f;
            if (weakReference.get() != null) {
                mz4.j0 j0Var = ((com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) ((tz4.k) weakReference.get())).f188147m;
                j0Var.n(j0Var.b());
            }
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        return new tz4.j(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.djx, viewGroup, false));
    }

    public final boolean x(int i17) {
        if (i17 <= 0) {
            java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17)};
            int i18 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.w("MicroMsg.Note.WNToolBarAdapter", "calculateLayoutParams: invalid parentWidth=%d, skip calculation", objArr);
            return false;
        }
        if (this.f423352o && this.f423353p == i17) {
            int i19 = rl.b.f397143a;
            return true;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f423353p)};
        int i27 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.WNToolBarAdapter", "calculateLayoutParams: START parentWidth=%d, lastWidth=%d", objArr2);
        this.f423348h = 0;
        this.f423349i = 0;
        this.f423350m = false;
        this.f423351n = false;
        int f17 = i65.a.f(context, com.tencent.mm.R.dimen.aip);
        int f18 = i65.a.f(context, com.tencent.mm.R.dimen.aiq);
        int f19 = i65.a.f(context, com.tencent.mm.R.dimen.aio);
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.WNToolBarAdapter", "calculateLayoutParams: baseBtnWidth=%d, marginToLeft=%d, averageThreshold=%d", java.lang.Integer.valueOf(f17), java.lang.Integer.valueOf(f18), java.lang.Integer.valueOf(f19));
        tz4.u[] uVarArr = this.f423345e;
        float length = i17 / (uVarArr.length + 1);
        if (length < f19) {
            int i28 = f18 * 2;
            if (((uVarArr.length + 1) * f17) + i28 > i17) {
                this.f423351n = true;
                int i29 = (int) ((i17 - (f17 * 1.5d)) - i28);
                int i37 = i29 / f17;
                int i38 = i29 - (f17 * i37);
                if (i38 <= 0 || i37 <= 0) {
                    this.f423348h = 0;
                } else {
                    this.f423348h = (i38 / i37) / 2;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Note.WNToolBarAdapter", "calculateLayoutParams: SCROLLABLE mode, visibleBtnCount=%d, btnMarginLeft=%d", java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(this.f423348h));
            } else {
                int length2 = (((i17 - (f17 * (uVarArr.length + 1))) - i28) / uVarArr.length) / 2;
                this.f423348h = length2;
                com.tencent.mars.xlog.Log.i("MicroMsg.Note.WNToolBarAdapter", "calculateLayoutParams: FIXED mode, btnMarginLeft=%d", java.lang.Integer.valueOf(length2));
            }
        } else {
            this.f423350m = true;
            int i39 = (int) length;
            this.f423349i = i39;
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.WNToolBarAdapter", "calculateLayoutParams: AVERAGE_WIDTH mode, btnAverageWidth=%d", java.lang.Integer.valueOf(i39));
        }
        this.f423352o = true;
        this.f423353p = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.WNToolBarAdapter", "calculateLayoutParams: DONE useAverageWidth=%b, scrollable=%b", java.lang.Boolean.valueOf(this.f423350m), java.lang.Boolean.valueOf(this.f423351n));
        tz4.h hVar = this.f423347g;
        if (hVar != null) {
            final boolean z17 = this.f423350m;
            final int i47 = this.f423349i;
            final tz4.l lVar = ((tz4.l$$a) hVar).f423367a;
            lVar.f423358d.post(new java.lang.Runnable() { // from class: tz4.l$$b
                @Override // java.lang.Runnable
                public final void run() {
                    tz4.i iVar;
                    tz4.i iVar2;
                    tz4.l lVar2 = tz4.l.this;
                    lVar2.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.WNToolViewHolder", "calculateLayoutParams: callback triggered");
                    android.view.View view = lVar2.f423355a;
                    if (view == null || view.getContext() == null || lVar2.f423358d == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.WNToolViewHolder", "updateExtendButtonLayout: footView or recyclerView is null");
                        return;
                    }
                    android.content.Context context2 = lVar2.f423355a.getContext();
                    android.view.View findViewById = lVar2.f423355a.findViewById(com.tencent.mm.R.id.qow);
                    android.view.View findViewById2 = lVar2.f423355a.findViewById(com.tencent.mm.R.id.qox);
                    int f27 = i65.a.f(context2, com.tencent.mm.R.dimen.aip);
                    if (z17) {
                        int i48 = i47;
                        com.tencent.mars.xlog.Log.i("MicroMsg.WNToolViewHolder", "updateExtendButtonLayout: AVERAGE mode, btnAverageWidth=%d", java.lang.Integer.valueOf(i48));
                        android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = i48;
                            findViewById.setLayoutParams(layoutParams);
                            android.view.View findViewById3 = lVar2.f423355a.findViewById(com.tencent.mm.R.id.qmd);
                            if (findViewById3 != null && (findViewById3.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
                                int i49 = (i48 - f27) / 2;
                                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) findViewById3.getLayoutParams();
                                marginLayoutParams.setMarginStart(i49);
                                marginLayoutParams.setMarginEnd(i49);
                                findViewById3.setLayoutParams(marginLayoutParams);
                            }
                        }
                        android.view.ViewGroup.LayoutParams layoutParams2 = lVar2.f423358d.getLayoutParams();
                        if (layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams) {
                            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).setMargins(0, 0, i48, 0);
                            lVar2.f423358d.setLayoutParams(layoutParams2);
                        }
                        if (findViewById2 != null) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                            arrayList.add(8);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/wenote/ui/nativenote/toolview/WNToolViewHolder", "updateExtendButtonLayout", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                            yj0.a.f(findViewById2, "com/tencent/mm/plugin/wenote/ui/nativenote/toolview/WNToolViewHolder", "updateExtendButtonLayout", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            return;
                        }
                        return;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.WNToolViewHolder", "updateExtendButtonLayout: DEFAULT mode, defaultBtnWidth=%d", java.lang.Integer.valueOf(f27));
                    int f28 = i65.a.f(context2, com.tencent.mm.R.dimen.f479642bh);
                    android.view.ViewGroup.LayoutParams layoutParams3 = findViewById.getLayoutParams();
                    if (layoutParams3 != null && (iVar2 = lVar2.f423357c) != null) {
                        if (iVar2.f423351n) {
                            int i57 = f27 + f28;
                            layoutParams3.width = i57;
                            com.tencent.mars.xlog.Log.i("MicroMsg.WNToolViewHolder", "updateExtendButtonLayout: scrollable=true, wrapWidth=%d (btn=%d + line=%d)", java.lang.Integer.valueOf(i57), java.lang.Integer.valueOf(f27), java.lang.Integer.valueOf(f28));
                        } else {
                            layoutParams3.width = f27;
                            com.tencent.mars.xlog.Log.i("MicroMsg.WNToolViewHolder", "updateExtendButtonLayout: scrollable=false, wrapWidth=%d", java.lang.Integer.valueOf(f27));
                        }
                        findViewById.setLayoutParams(layoutParams3);
                        android.view.View findViewById4 = lVar2.f423355a.findViewById(com.tencent.mm.R.id.qmd);
                        if (findViewById4 != null && (findViewById4.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
                            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) findViewById4.getLayoutParams();
                            marginLayoutParams2.setMarginStart(0);
                            marginLayoutParams2.setMarginEnd(0);
                            findViewById4.setLayoutParams(marginLayoutParams2);
                        }
                    }
                    android.view.ViewGroup.LayoutParams layoutParams4 = lVar2.f423358d.getLayoutParams();
                    if ((layoutParams4 instanceof android.view.ViewGroup.MarginLayoutParams) && layoutParams3 != null) {
                        ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).setMargins(0, 0, layoutParams3.width, 0);
                        lVar2.f423358d.setLayoutParams(layoutParams4);
                        com.tencent.mars.xlog.Log.i("MicroMsg.WNToolViewHolder", "updateExtendButtonLayout: RecyclerView rightMargin=%d", java.lang.Integer.valueOf(layoutParams3.width));
                    }
                    if (findViewById2 == null || (iVar = lVar2.f423357c) == null) {
                        return;
                    }
                    boolean z18 = iVar.f423351n;
                    int i58 = z18 ? 0 : 8;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(java.lang.Integer.valueOf(i58));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/wenote/ui/nativenote/toolview/WNToolViewHolder", "updateExtendButtonLayout", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/wenote/ui/nativenote/toolview/WNToolViewHolder", "updateExtendButtonLayout", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (z18) {
                        findViewById.requestLayout();
                        android.view.ViewGroup.LayoutParams layoutParams5 = findViewById2.getLayoutParams();
                        if (layoutParams5 != null) {
                            layoutParams5.width = f28;
                            layoutParams5.height = i65.a.h(context2, com.tencent.mm.R.dimen.f479705d0);
                            findViewById2.setLayoutParams(layoutParams5);
                            com.tencent.mars.xlog.Log.i("MicroMsg.WNToolViewHolder", "updateExtendButtonLayout: separateLine width=%d, height=%d", java.lang.Integer.valueOf(layoutParams5.width), java.lang.Integer.valueOf(layoutParams5.height));
                        }
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.WNToolViewHolder", "updateExtendButtonLayout: separateLine visibility=%b", java.lang.Boolean.valueOf(z18));
                }
            });
        }
        return true;
    }

    public final int y(android.content.Context context) {
        android.graphics.Point h17 = com.tencent.mm.ui.bk.h(context);
        int i17 = context.getResources().getDisplayMetrics().widthPixels;
        int i18 = rl.b.f397143a;
        int i19 = h17.x;
        if (i19 <= h17.y) {
            return i19;
        }
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return java.lang.Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }
}
