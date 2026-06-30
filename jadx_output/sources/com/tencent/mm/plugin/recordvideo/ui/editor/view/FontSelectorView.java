package com.tencent.mm.plugin.recordvideo.ui.editor.view;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u001d\b\u0016\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R0\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/view/FontSelectorView;", "Landroid/widget/LinearLayout;", "", "font", "Ljz5/f0;", "setSelectFont", "Lkotlin/Function1;", "f", "Lyz5/l;", "getFontSelectCallback", "()Lyz5/l;", "setFontSelectCallback", "(Lyz5/l;)V", "fontSelectCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FontSelectorView extends android.widget.LinearLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f156436g = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f156437d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f156438e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public yz5.l fontSelectCallback;

    public FontSelectorView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f156437d = new java.util.ArrayList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f156438e = arrayList;
        setOrientation(0);
        setGravity(16);
        ou3.q qVar = ou3.q.f348970c;
        if (!qVar.f348940b) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, i65.a.r(getContext(), com.tencent.mm.R.string.fee));
        jSONObject.put("key", "default");
        jSONObject.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "default");
        arrayList.add(jSONObject);
        org.json.JSONArray jSONArray = qVar.f348940b ? new org.json.JSONArray(com.tencent.mm.vfs.w6.M(qVar.e() + "config.json")) : null;
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i18 = 0; i18 < length; i18++) {
                arrayList.add(jSONArray.optJSONObject(i18));
            }
        }
        try {
            java.util.Iterator it = arrayList.iterator();
            int i19 = 0;
            while (true) {
                boolean hasNext = it.hasNext();
                java.util.ArrayList arrayList2 = this.f156437d;
                if (!hasNext) {
                    ((android.view.View) arrayList2.get(0)).setBackground(getContext().getDrawable(com.tencent.mm.R.drawable.adn));
                    return;
                }
                java.lang.Object next = it.next();
                int i27 = i19 + 1;
                if (i19 >= 0) {
                    org.json.JSONObject jSONObject2 = (org.json.JSONObject) next;
                    android.widget.TextView textView = new android.widget.TextView(getContext());
                    java.lang.String optString = jSONObject2.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
                    java.lang.String str = android.text.TextUtils.isEmpty(jSONObject2.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH)) ? "" : ou3.q.f348970c.e() + jSONObject2.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
                    textView.setText(optString);
                    java.lang.String r17 = i65.a.r(getContext(), com.tencent.mm.R.string.f489969gy);
                    kotlin.jvm.internal.o.f(r17, "getString(...)");
                    java.lang.String format = java.lang.String.format(r17, java.util.Arrays.copyOf(new java.lang.Object[]{optString}, 1));
                    kotlin.jvm.internal.o.f(format, "format(...)");
                    textView.setContentDescription(format);
                    if (com.tencent.mm.vfs.w6.j(str)) {
                        textView.setTypeface(android.graphics.Typeface.createFromFile(str));
                    } else {
                        textView.setTypeface(android.graphics.Typeface.DEFAULT);
                    }
                    textView.setBackground(getContext().getDrawable(com.tencent.mm.R.drawable.adm));
                    textView.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_BG_100));
                    textView.setTextSize(0, getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn));
                    android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                    layoutParams.width = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479731dn);
                    layoutParams.height = i65.a.b(getContext(), 30);
                    if (i19 != arrayList.size() - 1) {
                        layoutParams.setMarginEnd(getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479714d7));
                    }
                    textView.setGravity(17);
                    addView(textView, layoutParams);
                    arrayList2.add(textView);
                    textView.setTag(java.lang.Integer.valueOf(i19));
                    textView.setOnClickListener(new cw3.r(this));
                    i19 = i27;
                } else {
                    kz5.c0.p();
                    throw null;
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FontSelectorView", e17, "parse font error", new java.lang.Object[0]);
        }
    }

    public final void a(int i17) {
        int i18 = 0;
        for (java.lang.Object obj : this.f156437d) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.view.View view = (android.view.View) obj;
            if (i18 == i17) {
                view.setBackground(getContext().getDrawable(com.tencent.mm.R.drawable.adn));
            } else {
                view.setBackground(getContext().getDrawable(com.tencent.mm.R.drawable.adm));
            }
            i18 = i19;
        }
    }

    public final yz5.l getFontSelectCallback() {
        return this.fontSelectCallback;
    }

    public final void setFontSelectCallback(yz5.l lVar) {
        this.fontSelectCallback = lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r26.n0.B(r7, r3, false) == true) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setSelectFont(java.lang.String r7) {
        /*
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r1 = 0
            if (r0 == 0) goto Lb
            r6.a(r1)
            return
        Lb:
            java.util.ArrayList r0 = r6.f156438e
            java.util.Iterator r0 = r0.iterator()
            r2 = r1
        L12:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L44
            java.lang.Object r3 = r0.next()
            int r4 = r2 + 1
            if (r2 < 0) goto L3f
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            if (r7 == 0) goto L37
            java.lang.String r5 = "path"
            java.lang.String r3 = r3.optString(r5)
            java.lang.String r5 = "optString(...)"
            kotlin.jvm.internal.o.f(r3, r5)
            boolean r3 = r26.n0.B(r7, r3, r1)
            r5 = 1
            if (r3 != r5) goto L37
            goto L38
        L37:
            r5 = r1
        L38:
            if (r5 == 0) goto L3d
            r6.a(r2)
        L3d:
            r2 = r4
            goto L12
        L3f:
            kz5.c0.p()
            r7 = 0
            throw r7
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.recordvideo.ui.editor.view.FontSelectorView.setSelectFont(java.lang.String):void");
    }

    public FontSelectorView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
