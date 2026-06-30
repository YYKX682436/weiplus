package df5;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ua5.f f232061a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f232062b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f232063c;

    /* renamed from: d, reason: collision with root package name */
    public df5.v f232064d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f232065e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f232066f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f232067g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f232068h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f232069i;

    public d(ua5.f animator, yz5.a baseCharsProvider, yz5.a durationMsProvider) {
        kotlin.jvm.internal.o.g(animator, "animator");
        kotlin.jvm.internal.o.g(baseCharsProvider, "baseCharsProvider");
        kotlin.jvm.internal.o.g(durationMsProvider, "durationMsProvider");
        this.f232061a = animator;
        this.f232062b = baseCharsProvider;
        this.f232063c = durationMsProvider;
        this.f232066f = new java.util.ArrayList();
    }

    public final void a() {
        boolean d17 = d();
        if (d17 != this.f232069i) {
            this.f232069i = d17;
            yz5.l lVar = this.f232068h;
            if (lVar != null) {
                lVar.invoke(java.lang.Boolean.valueOf(d17));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f1, code lost:
    
        if ((r10.f232236g != null) == false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.util.List r10) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df5.d.b(java.util.List):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0038, code lost:
    
        if ((r3.f232236g != null) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.util.List r3) {
        /*
            r2 = this;
            java.lang.String r0 = "views"
            kotlin.jvm.internal.o.g(r3, r0)
            java.util.List r0 = r2.f232066f
            df5.n1 r1 = new df5.n1
            r1.<init>(r3)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r1)
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r0}
            java.lang.String r0 = "MicroMsg.FeederQueue"
            java.lang.String r1 = "[FEEDER_QUEUE] enqueueShowViews: count=%d, queueSize=%d"
            com.tencent.mars.xlog.Log.i(r0, r1, r3)
            df5.v r3 = r2.f232064d
            if (r3 == 0) goto L3a
            java.lang.Runnable r3 = r3.f232236g
            if (r3 == 0) goto L37
            r3 = 1
            goto L38
        L37:
            r3 = 0
        L38:
            if (r3 != 0) goto L3d
        L3a:
            r2.e()
        L3d:
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: df5.d.c(java.util.List):void");
    }

    public final boolean d() {
        boolean z17;
        df5.v vVar = this.f232064d;
        if (vVar != null) {
            if (vVar.f232236g != null) {
                z17 = true;
                return !z17 || (((java.util.ArrayList) this.f232066f).isEmpty() ^ true);
            }
        }
        z17 = false;
        if (z17) {
        }
    }

    public final void e() {
        int indexOfChild;
        int i17;
        android.view.View childAt;
        java.util.List list = this.f232066f;
        if (((java.util.ArrayList) list).isEmpty()) {
            this.f232064d = null;
            a();
            return;
        }
        df5.o1 o1Var = (df5.o1) ((java.util.ArrayList) list).remove(0);
        if (o1Var instanceof df5.m1) {
            df5.e eVar = ((df5.m1) o1Var).f232167a;
            this.f232065e = eVar.f232078a;
            android.text.SpannableStringBuilder newFullSSB = eVar.f232079b;
            java.lang.String spannableStringBuilder = newFullSSB.length() <= 60 ? newFullSSB.toString() : ((java.lang.Object) newFullSSB.subSequence(0, 30)) + "..." + ((java.lang.Object) newFullSSB.subSequence(newFullSSB.length() - 27, newFullSSB.length()));
            kotlin.jvm.internal.o.f(spannableStringBuilder, "let(...)");
            android.widget.TextView tv6 = eVar.f232078a;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(java.lang.System.identityHashCode(tv6));
            int i18 = eVar.f232080c;
            com.tencent.mars.xlog.Log.i("MicroMsg.FeederQueue", "[FEEDER_QUEUE] startNext: Feed tvHash=%d, oldLen=%d, newLen=%d, remainingQueue=%d, text=[%s]", valueOf, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(newFullSSB.length()), java.lang.Integer.valueOf(((java.util.ArrayList) list).size()), spannableStringBuilder);
            df5.v vVar = new df5.v(this.f232061a, this.f232062b, this.f232063c, new df5.b(this), new df5.c(this));
            this.f232064d = vVar;
            kotlin.jvm.internal.o.g(tv6, "tv");
            kotlin.jvm.internal.o.g(newFullSSB, "newFullSSB");
            vVar.f232237h = tv6;
            vVar.f232238i = newFullSSB;
            vVar.f232240k = i18;
            vVar.f232241l = newFullSSB.length();
            com.tencent.mars.xlog.Log.i("MicroMsg.MdTextFeeder", "[STREAM_FEED] feed: start, oldLen=%d, targetEnd=%d, remaining=%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(vVar.f232241l), java.lang.Integer.valueOf(vVar.f232241l - i18));
            tv6.setText(new android.text.SpannableStringBuilder(newFullSSB, 0, i18), android.widget.TextView.BufferType.EDITABLE);
            android.text.Editable editableText = tv6.getEditableText();
            vVar.f232239j = editableText instanceof android.text.SpannableStringBuilder ? (android.text.SpannableStringBuilder) editableText : null;
            vVar.a();
            return;
        }
        if (!(o1Var instanceof df5.n1)) {
            if (o1Var instanceof df5.l1) {
                ((java.util.ArrayList) list).size();
                java.util.List list2 = (java.util.List) ((df5.l1) o1Var).f232164b.invoke();
                if (!list2.isEmpty()) {
                    ((java.util.ArrayList) list).addAll(0, list2);
                }
                e();
                return;
            }
            return;
        }
        df5.n1 n1Var = (df5.n1) o1Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.FeederQueue", "[FEEDER_QUEUE] startNext: ShowViews count=%d, remainingQueue=%d", java.lang.Integer.valueOf(n1Var.f232181a.size()), java.lang.Integer.valueOf(((java.util.ArrayList) list).size()));
        for (android.view.View view : n1Var.f232181a) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/FeederQueue", "showViewsImmediate", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/FeederQueue", "showViewsImmediate", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.ViewParent parent = view.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null && (indexOfChild = viewGroup.indexOfChild(view)) >= 0 && (i17 = indexOfChild + 1) < viewGroup.getChildCount() && (childAt = viewGroup.getChildAt(i17)) != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(childAt, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/FeederQueue", "showViewsImmediate", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(childAt, "com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/FeederQueue", "showViewsImmediate", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        yz5.l lVar = this.f232067g;
        if (lVar != null) {
            lVar.invoke(n1Var.f232181a);
        }
        e();
    }
}
