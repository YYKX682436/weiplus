package lj2;

/* loaded from: classes10.dex */
public final class k {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.List f318879f = kz5.c0.i(0, 2, 3, 8);

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f318880a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.TextView f318881b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.Space f318882c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f318883d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318884e;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f318885g;

    public k(android.content.Context context, android.view.View view, lj2.v0 pluginAbility) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        this.f318880a = view;
        android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.a5_) : null;
        this.f318885g = textView;
        android.widget.TextView textView2 = view != null ? (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.tmk) : null;
        this.f318881b = textView2;
        qo0.c q17 = pluginAbility.q();
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = q17 instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) q17 : null;
        android.widget.Space space = k0Var != null ? (android.widget.Space) k0Var.findViewById(com.tencent.mm.R.id.ugi) : null;
        this.f318882c = space;
        boolean J2 = pluginAbility.a0().J();
        if (!J2 || space == null || textView2 == null) {
            this.f318883d = false;
            com.tencent.mars.xlog.Log.i("FinderLiveMicTopicBarWidget", "init, isEnableNewSetMicModeLayout:" + J2 + ", micTopicSpace:" + space + ", micTopicText:" + textView2);
        } else {
            this.f318883d = true;
        }
        float g17 = (14.0f * j65.f.g()) / 400;
        if (textView != null) {
            textView.setTextSize(1, g17);
        }
        if (textView != null) {
            com.tencent.mm.ui.fk.b(textView);
        }
        if (textView2 != null) {
            textView2.setTextSize(1, g17);
        }
        if (textView2 != null) {
            com.tencent.mm.ui.fk.b(textView2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if ((r0.length() > 0) == true) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r13 = this;
            boolean r0 = r13.f318884e
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"
            android.widget.Space r2 = r13.f318882c
            android.view.View r11 = r13.f318880a
            r12 = 0
            if (r0 == 0) goto L8a
            android.widget.TextView r0 = r13.f318881b
            if (r0 == 0) goto L22
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L22
            int r0 = r0.length()
            r3 = 1
            if (r0 <= 0) goto L1e
            r0 = r3
            goto L1f
        L1e:
            r0 = r12
        L1f:
            if (r0 != r3) goto L22
            goto L23
        L22:
            r3 = r12
        L23:
            if (r3 == 0) goto L8a
            if (r11 != 0) goto L28
            goto L6d
        L28:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.ThreadLocal r3 = zj0.c.f473285a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r0.add(r3)
            java.util.Collections.reverse(r0)
            java.lang.Object[] r4 = r0.toArray()
            java.lang.String r5 = "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveMicTopicBarWidget"
            java.lang.String r6 = "updateVisible"
            java.lang.String r7 = "()V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r11
            yj0.a.d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r0 = r0.get(r12)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r11.setVisibility(r0)
            java.lang.String r4 = "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveMicTopicBarWidget"
            java.lang.String r5 = "updateVisible"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            yj0.a.f(r3, r4, r5, r6, r7, r8, r9)
        L6d:
            android.content.Context r0 = com.tencent.mm.sdk.platformtools.x2.f193071a
            r3 = 40
            int r0 = i65.a.b(r0, r3)
            if (r2 != 0) goto L78
            goto Le2
        L78:
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            if (r3 == 0) goto L84
            r3.height = r0
            r2.setLayoutParams(r3)
            goto Le2
        L84:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L8a:
            if (r11 != 0) goto L8d
            goto Ld4
        L8d:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.ThreadLocal r3 = zj0.c.f473285a
            r3 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
            java.util.Collections.reverse(r0)
            java.lang.Object[] r4 = r0.toArray()
            java.lang.String r5 = "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveMicTopicBarWidget"
            java.lang.String r6 = "updateVisible"
            java.lang.String r7 = "()V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r11
            yj0.a.d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r0 = r0.get(r12)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r11.setVisibility(r0)
            java.lang.String r4 = "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveMicTopicBarWidget"
            java.lang.String r5 = "updateVisible"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            yj0.a.f(r3, r4, r5, r6, r7, r8, r9)
        Ld4:
            if (r2 != 0) goto Ld7
            goto Le2
        Ld7:
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            if (r0 == 0) goto Le3
            r0.height = r12
            r2.setLayoutParams(r0)
        Le2:
            return
        Le3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lj2.k.a():void");
    }
}
