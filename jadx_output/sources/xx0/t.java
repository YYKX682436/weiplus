package xx0;

/* loaded from: classes5.dex */
public final class t extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final xx0.i f457938d;

    /* renamed from: e, reason: collision with root package name */
    public final xx0.j f457939e;

    /* renamed from: f, reason: collision with root package name */
    public final yo0.i f457940f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f457941g;

    /* renamed from: h, reason: collision with root package name */
    public xx0.u f457942h;

    /* renamed from: i, reason: collision with root package name */
    public vt3.r f457943i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.a f457944m;

    public t(xx0.i dataProvider, xx0.j jVar) {
        java.lang.String M;
        kotlin.jvm.internal.o.g(dataProvider, "dataProvider");
        this.f457938d = dataProvider;
        this.f457939e = jVar;
        yo0.f fVar = new yo0.f();
        fVar.f464078b = true;
        fVar.f464077a = true;
        this.f457940f = fVar.a();
        this.f457941g = new java.util.ArrayList();
        xx0.u uVar = null;
        if (jVar != null && (M = ((mx0.x7) jVar).f332435a.f69557v.M()) != null) {
            uVar = new xx0.u(M, null);
        }
        this.f457942h = uVar;
    }

    public final void B(int i17) {
        vt3.r rVar = this.f457943i;
        long j17 = rVar != null ? rVar.f440039a : 0L;
        vt3.p pVar = (vt3.p) kz5.n0.a0(this.f457941g, i17);
        if (pVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TemplateTabPageView", "onTemplateVisible: template is invalid at: " + i17);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onTemplateVisibleAt: ");
        sb6.append(i17);
        sb6.append(", tabID: ");
        sb6.append(j17);
        sb6.append(", templateID: ");
        java.lang.String templateID = pVar.f440020b;
        sb6.append(templateID);
        com.tencent.mars.xlog.Log.i("MicroMsg.TemplateTabPageView", sb6.toString());
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        m7Var.getClass();
        kotlin.jvm.internal.o.g(templateID, "templateID");
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.l6(m7Var, templateID, null), 3, null);
        java.util.Map Ai = m7Var.Ai();
        Ai.put("template_id", templateID);
        Ai.put("template_tab_id", java.lang.Long.valueOf(j17));
        Ai.put("template_position", java.lang.Integer.valueOf(i17 + 1));
        try {
            com.tencent.mm.protobuf.g gVar = pVar.f440026h;
            if (gVar != null) {
                java.lang.String encodeToString = android.util.Base64.encodeToString(gVar.f192156a, 2);
                kotlin.jvm.internal.o.f(encodeToString, "encodeToString(...)");
                Ai.put("template_session_buffer", encodeToString);
            } else {
                Ai.put("template_session_buffer", "");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TemplateTabPageView", "encodeToString templateSessionBuffer exception: " + e17);
            Ai.put("template_session_buffer", "");
        }
        if (kotlin.jvm.internal.o.b(templateID, "kEmptyTemplateId")) {
            Ai.put("template_type", 4);
        } else {
            Ai.put("template_type", 3);
        }
        Ai.put("template_is_favorite", java.lang.Boolean.valueOf(pVar.f440027i));
        Ai.put("template_is_aigc", java.lang.Boolean.valueOf(pVar.f440031m));
        Ai.put("view_id", "sc_template_expose");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("sc_template_expose", null, Ai, 6, false);
    }

    public final void E(vt3.p pVar, xx0.q qVar) {
        xx0.u uVar = this.f457942h;
        if (!kotlin.jvm.internal.o.b(pVar.f440020b, uVar != null ? uVar.f457945a : null)) {
            android.view.View view = qVar.f457932g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter", "updateSelectedStateUI", "(Lcom/tencent/mm/plugin/recordvideo/model/ImproveRecordMaasTemplateItem;Lcom/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter$TemplateViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter", "updateSelectedStateUI", "(Lcom/tencent/mm/plugin/recordvideo/model/ImproveRecordMaasTemplateItem;Lcom/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter$TemplateViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            qVar.f457931f.setVisibility(8);
            android.view.View view2 = qVar.f457933h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter", "updateSelectedStateUI", "(Lcom/tencent/mm/plugin/recordvideo/model/ImproveRecordMaasTemplateItem;Lcom/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter$TemplateViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter", "updateSelectedStateUI", "(Lcom/tencent/mm/plugin/recordvideo/model/ImproveRecordMaasTemplateItem;Lcom/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter$TemplateViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = qVar.f457930e;
            textView.setTextColor(textView.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9, null));
            return;
        }
        if (uVar.f457946b != null) {
            android.view.View view3 = qVar.f457932g;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter", "updateSelectedStateUI", "(Lcom/tencent/mm/plugin/recordvideo/model/ImproveRecordMaasTemplateItem;Lcom/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter$TemplateViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter", "updateSelectedStateUI", "(Lcom/tencent/mm/plugin/recordvideo/model/ImproveRecordMaasTemplateItem;Lcom/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter$TemplateViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.ProgressBar progressBar = qVar.f457931f;
            progressBar.setVisibility(0);
            progressBar.setProgress(uVar.f457946b.intValue());
        } else {
            android.view.View view4 = qVar.f457932g;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter", "updateSelectedStateUI", "(Lcom/tencent/mm/plugin/recordvideo/model/ImproveRecordMaasTemplateItem;Lcom/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter$TemplateViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter", "updateSelectedStateUI", "(Lcom/tencent/mm/plugin/recordvideo/model/ImproveRecordMaasTemplateItem;Lcom/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter$TemplateViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            qVar.f457931f.setVisibility(8);
        }
        android.view.View view5 = qVar.f457933h;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter", "updateSelectedStateUI", "(Lcom/tencent/mm/plugin/recordvideo/model/ImproveRecordMaasTemplateItem;Lcom/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter$TemplateViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter", "updateSelectedStateUI", "(Lcom/tencent/mm/plugin/recordvideo/model/ImproveRecordMaasTemplateItem;Lcom/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter$TemplateViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView2 = qVar.f457930e;
        textView2.setTextColor(textView2.getResources().getColor(com.tencent.mm.R.color.f479206su, null));
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.ArrayList) this.f457941g).size() + 1;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return i17 == ((java.util.ArrayList) this.f457941g).size() ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (i17 == 0) {
            android.view.View inflate = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.f489471dk4, parent, false);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            return new xx0.q(inflate);
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("Unknown view type");
        }
        android.view.View inflate2 = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.f489472dk5, parent, false);
        kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
        return new xx0.p(inflate2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007c, code lost:
    
        if (r10.f430473e == true) goto L21;
     */
    @Override // androidx.recyclerview.widget.f2
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(xx0.r r10, int r11) {
        /*
            r9 = this;
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.o.g(r10, r0)
            vt3.r r0 = r9.f457943i
            if (r0 != 0) goto La
            return
        La:
            long r4 = r0.f440039a
            boolean r1 = r10 instanceof xx0.q
            if (r1 == 0) goto L43
            java.util.List r0 = r9.f457941g
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r0 = r0.get(r11)
            vt3.p r0 = (vt3.p) r0
            r7 = r10
            xx0.q r7 = (xx0.q) r7
            android.widget.TextView r1 = r7.f457930e
            java.lang.String r2 = r0.f440021c
            r1.setText(r2)
            vo0.e r1 = vo0.e.f438467a
            vo0.a r1 = vo0.e.f438468b
            java.lang.String r2 = r0.f440024f
            com.tencent.mm.ui.widget.MMRoundCornerImageView r3 = r7.f457929d
            yo0.i r6 = r9.f457940f
            r1.c(r2, r3, r6)
            android.view.View r10 = r10.itemView
            xx0.s r8 = new xx0.s
            r1 = r8
            r2 = r11
            r3 = r9
            r6 = r0
            r1.<init>(r2, r3, r4, r6)
            r10.setOnClickListener(r8)
            r9.E(r0, r7)
            goto Laf
        L43:
            xx0.i r10 = r9.f457938d
            r10.getClass()
            us2.u r11 = us2.u.f430548a
            int r10 = r10.f457903a
            long r1 = r0.f440039a
            vt3.n r11 = r0.f440041c
            java.lang.String r0 = "followContext"
            kotlin.jvm.internal.o.g(r11, r0)
            java.lang.Object r0 = us2.u.f430553f
            monitor-enter(r0)
            us2.d r3 = new us2.d     // Catch: java.lang.Throwable -> Lb0
            r3.<init>(r1, r11)     // Catch: java.lang.Throwable -> Lb0
            java.util.Map r11 = us2.u.f430555h     // Catch: java.lang.Throwable -> Lb0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> Lb0
            java.util.HashMap r11 = (java.util.HashMap) r11     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r10 = r11.get(r10)     // Catch: java.lang.Throwable -> Lb0
            java.util.Map r10 = (java.util.Map) r10     // Catch: java.lang.Throwable -> Lb0
            if (r10 == 0) goto L7f
            java.lang.Object r10 = r10.get(r3)     // Catch: java.lang.Throwable -> Lb0
            us2.a r10 = (us2.a) r10     // Catch: java.lang.Throwable -> Lb0
            if (r10 == 0) goto L7f
            us2.b r10 = r10.f430468b     // Catch: java.lang.Throwable -> Lb0
            if (r10 == 0) goto L7f
            boolean r10 = r10.f430473e     // Catch: java.lang.Throwable -> Lb0
            r11 = 1
            if (r10 != r11) goto L7f
            goto L80
        L7f:
            r11 = 0
        L80:
            monitor-exit(r0)
            java.lang.String r10 = "MicroMsg.TemplateTabPageView"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "loadMoreTemplate: tabId: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = ", reachEnd: "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r10, r0)
            java.util.List r10 = r9.f457941g
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            int r10 = r10.size()
            if (r10 <= 0) goto Laf
            if (r11 != 0) goto Laf
            yz5.a r10 = r9.f457944m
            if (r10 == 0) goto Laf
            r10.invoke()
        Laf:
            return
        Lb0:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: xx0.t.onBindViewHolder(xx0.r, int):void");
    }

    public final void y(java.lang.String templateId) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        xx0.u uVar = this.f457942h;
        if (kotlin.jvm.internal.o.b(uVar != null ? uVar.f457945a : null, templateId)) {
            this.f457942h = new xx0.u(templateId, null);
            java.util.Iterator it = ((java.util.ArrayList) this.f457941g).iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                } else if (kotlin.jvm.internal.o.b(((vt3.p) it.next()).f440020b, templateId)) {
                    break;
                } else {
                    i17++;
                }
            }
            if (i17 >= 0) {
                notifyItemChanged(i17, 0);
            }
        }
    }

    public final void z(int i17) {
        vt3.r rVar = this.f457943i;
        long j17 = rVar != null ? rVar.f440039a : 0L;
        vt3.p pVar = (vt3.p) kz5.n0.a0(this.f457941g, i17);
        if (pVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TemplateTabPageView", "onTemplateInvisible: template is invalid at: " + i17);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onTemplateInvisibleAt: ");
        sb6.append(i17);
        sb6.append(", tabID: ");
        sb6.append(j17);
        sb6.append(", templateID: ");
        java.lang.String templateID = pVar.f440020b;
        sb6.append(templateID);
        com.tencent.mars.xlog.Log.i("MicroMsg.TemplateTabPageView", sb6.toString());
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        m7Var.getClass();
        kotlin.jvm.internal.o.g(templateID, "templateID");
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.b6(m7Var, templateID, null), 3, null);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List payloads) {
        xx0.r holder = (xx0.r) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        if (holder instanceof xx0.q) {
            if (payloads.isEmpty()) {
                onBindViewHolder(holder, i17);
                return;
            } else {
                E((vt3.p) ((java.util.ArrayList) this.f457941g).get(i17), (xx0.q) holder);
                return;
            }
        }
        onBindViewHolder(holder, i17);
    }
}
