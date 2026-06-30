package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public final class e implements com.tencent.mm.plugin.setting.ui.setting.b {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f160966a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.r f160967b;

    public e(com.tencent.mm.ui.base.preference.r rVar, java.lang.String str) {
        this.f160967b = rVar;
        this.f160966a = jz5.h.b(new com.tencent.mm.plugin.setting.ui.setting.d(rVar, str));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    @Override // com.tencent.mm.plugin.setting.ui.setting.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.graphics.drawable.Drawable r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 8
            if (r6 != 0) goto L29
            com.tencent.mm.ui.base.preference.IconPreference r6 = r5.c()
            if (r6 == 0) goto L19
            r6.N = r0
            android.widget.ImageView r2 = r6.P
            if (r2 == 0) goto L19
            r2.setLayerPaint(r0)
            android.widget.ImageView r6 = r6.P
            r6.setImageDrawable(r0)
        L19:
            com.tencent.mm.ui.base.preference.IconPreference r6 = r5.c()
            if (r6 == 0) goto L65
            r6.M = r1
            android.widget.ImageView r6 = r6.P
            if (r6 == 0) goto L65
            r6.setVisibility(r1)
            goto L65
        L29:
            com.tencent.mm.ui.base.preference.IconPreference r2 = r5.c()
            r3 = 0
            if (r2 == 0) goto L3f
            android.view.ViewGroup r4 = r2.E1
            if (r4 != 0) goto L37
            int r2 = r2.A1
            goto L3b
        L37:
            int r2 = r4.getVisibility()
        L3b:
            if (r2 != r1) goto L3f
            r1 = 1
            goto L40
        L3f:
            r1 = r3
        L40:
            if (r1 == 0) goto L65
            com.tencent.mm.ui.base.preference.IconPreference r1 = r5.c()
            if (r1 == 0) goto L56
            r1.N = r6
            android.widget.ImageView r2 = r1.P
            if (r2 == 0) goto L56
            r2.setLayerPaint(r0)
            android.widget.ImageView r0 = r1.P
            r0.setImageDrawable(r6)
        L56:
            com.tencent.mm.ui.base.preference.IconPreference r6 = r5.c()
            if (r6 == 0) goto L65
            r6.M = r3
            android.widget.ImageView r6 = r6.P
            if (r6 == 0) goto L65
            r6.setVisibility(r3)
        L65:
            com.tencent.mm.ui.base.preference.r r6 = r5.f160967b
            if (r6 == 0) goto L6e
            com.tencent.mm.ui.base.preference.h0 r6 = (com.tencent.mm.ui.base.preference.h0) r6
            r6.notifyDataSetChanged()
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.setting.ui.setting.e.a(android.graphics.drawable.Drawable):void");
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.b
    public void b(java.lang.String str, java.lang.Integer num) {
        android.widget.TextView textView;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSummaryAvailable screen = ");
        com.tencent.mm.ui.base.preference.r rVar = this.f160967b;
        sb6.append(rVar);
        sb6.append(" summary = ");
        sb6.append(str);
        sb6.append(", textColor = ");
        sb6.append(num);
        com.tencent.mars.xlog.Log.i("MainTabSettings", sb6.toString());
        com.tencent.mm.ui.base.preference.IconPreference c17 = c();
        if (c17 != null) {
            c17.H(str);
        }
        com.tencent.mm.ui.base.preference.IconPreference c18 = c();
        android.widget.TextView textView2 = c18 != null ? c18.L : null;
        if (textView2 != null) {
            textView2.setText(str);
        }
        if (num != null) {
            com.tencent.mm.ui.base.preference.IconPreference c19 = c();
            if (c19 != null) {
                c19.f197788y = num.intValue();
            }
            com.tencent.mm.ui.base.preference.IconPreference c27 = c();
            if (c27 != null && (textView = c27.L) != null) {
                textView.setTextColor(num.intValue());
            }
        }
        if (rVar != null) {
            ((com.tencent.mm.ui.base.preference.h0) rVar).notifyDataSetChanged();
        }
    }

    public final com.tencent.mm.ui.base.preference.IconPreference c() {
        return (com.tencent.mm.ui.base.preference.IconPreference) ((jz5.n) this.f160966a).getValue();
    }
}
