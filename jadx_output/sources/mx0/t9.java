package mx0;

/* loaded from: classes5.dex */
public abstract class t9 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public int f332356d;

    /* renamed from: e, reason: collision with root package name */
    public final yo0.i f332357e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f332358f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f332359g;

    /* renamed from: h, reason: collision with root package name */
    public mx0.q9 f332360h;

    public t9(int i17) {
        this.f332356d = i17;
        yo0.f fVar = new yo0.f();
        fVar.f464078b = true;
        fVar.f464077a = true;
        this.f332357e = fVar.a();
        this.f332358f = new java.util.ArrayList();
    }

    public abstract java.lang.String B(int i17);

    public abstract boolean E(int i17);

    public abstract boolean I(int i17);

    public abstract com.tencent.mm.protobuf.g J(int i17);

    public void K(int i17, mx0.ba holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View view = holder.f331863h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/ShootComposingTemplateAdapter", "onBindViewHolderUpdateSelection", "(ILcom/tencent/mm/mj_publisher/finder/shoot_composing/TemplateNormalViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/shoot_composing/ShootComposingTemplateAdapter", "onBindViewHolderUpdateSelection", "(ILcom/tencent/mm/mj_publisher/finder/shoot_composing/TemplateNormalViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        holder.f331862g.setVisibility(8);
        holder.f331861f.setVisibility(8);
    }

    public void L(java.lang.String templateId) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        mx0.q9 q9Var = this.f332360h;
        if (kotlin.jvm.internal.o.b(q9Var != null ? q9Var.f332269a : null, templateId)) {
            this.f332360h = null;
        }
        java.util.Iterator it = this.f332358f.iterator();
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
            notifyItemChanged(z(i17), mx0.r9.f332294d);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShootComposingImproveRecordMaasTemplateAdapter", "onTemplateDownloadFinished: templateId not found: ".concat(templateId));
        }
    }

    public final void M(int i17) {
        java.lang.String B = B(i17);
        if (B == null) {
            return;
        }
        com.tencent.mm.protobuf.g J2 = J(i17);
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        m7Var.getClass();
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.l6(m7Var, B, null), 3, null);
        java.util.Map Ai = m7Var.Ai();
        Ai.put("template_id", B);
        Ai.put("template_tab_id", 0);
        Ai.put("template_position", java.lang.Integer.valueOf(i17));
        try {
            if (J2 != null) {
                java.lang.String encodeToString = android.util.Base64.encodeToString(J2.f192156a, 2);
                kotlin.jvm.internal.o.f(encodeToString, "encodeToString(...)");
                Ai.put("template_session_buffer", encodeToString);
            } else {
                Ai.put("template_session_buffer", "");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShootComposingImproveRecordMaasTemplateAdapter", "encodeToString templateSessionBuffer exception: " + e17);
            Ai.put("template_session_buffer", "");
        }
        if (kotlin.jvm.internal.o.b(B, "kEmptyTemplateId")) {
            Ai.put("template_type", 4);
        } else {
            Ai.put("template_type", 3);
        }
        Ai.put("template_is_favorite", java.lang.Boolean.valueOf(I(i17)));
        Ai.put("template_is_aigc", java.lang.Boolean.valueOf(E(i17)));
        Ai.put("view_id", "sc_template_expose");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("sc_template_expose", null, Ai, 6, false);
    }

    public void N(java.lang.String templateId) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        if (this.f332360h != null) {
            L(templateId);
        }
        int i17 = 0;
        this.f332360h = new mx0.q9(templateId, 0);
        java.util.Iterator it = this.f332358f.iterator();
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
            notifyItemChanged(z(i17), mx0.r9.f332294d);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List payloads) {
        mx0.ba holder = (mx0.ba) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        boolean isEmpty = payloads.isEmpty();
        android.widget.TextView textView = holder.f331861f;
        if (isEmpty) {
            onBindViewHolder(holder, i17);
            holder.itemView.setContentDescription(textView.getText());
            return;
        }
        if (!payloads.contains(mx0.r9.f332294d)) {
            if (payloads.contains(mx0.r9.f332295e)) {
                K(i17, holder);
                return;
            }
            return;
        }
        mx0.q9 q9Var = this.f332360h;
        android.widget.ProgressBar progressBar = holder.f331862g;
        if (q9Var != null) {
            if (kotlin.jvm.internal.o.b(q9Var.f332269a, holder.f331859d)) {
                android.view.View view = holder.f331863h;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/ShootComposingTemplateAdapter", "onBindViewHolderUpdateDownloadProgress", "(ILcom/tencent/mm/mj_publisher/finder/shoot_composing/TemplateNormalViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/shoot_composing/ShootComposingTemplateAdapter", "onBindViewHolderUpdateDownloadProgress", "(ILcom/tencent/mm/mj_publisher/finder/shoot_composing/TemplateNormalViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                progressBar.setVisibility(0);
                textView.setVisibility(8);
            }
        }
        android.view.View view2 = holder.f331863h;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/ShootComposingTemplateAdapter", "onBindViewHolderUpdateDownloadProgress", "(ILcom/tencent/mm/mj_publisher/finder/shoot_composing/TemplateNormalViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/shoot_composing/ShootComposingTemplateAdapter", "onBindViewHolderUpdateDownloadProgress", "(ILcom/tencent/mm/mj_publisher/finder/shoot_composing/TemplateNormalViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        progressBar.setVisibility(8);
        textView.setVisibility(8);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.ddf, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new mx0.ba(inflate);
    }

    public final void x(int i17, mx0.ba holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        vt3.p pVar = (vt3.p) kz5.n0.a0(this.f332358f, i17);
        if (pVar == null) {
            return;
        }
        int z17 = z(i17);
        java.lang.String str = pVar.f440020b;
        kotlin.jvm.internal.o.g(str, "<set-?>");
        holder.f331859d = str;
        android.widget.TextView textView = holder.f331861f;
        java.lang.String str2 = pVar.f440021c;
        textView.setText(str2);
        java.lang.String str3 = pVar.f440024f;
        boolean z18 = str3.length() > 0;
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = holder.f331860e;
        if (z18) {
            vo0.e.f438468b.c(str3, mMRoundCornerImageView, this.f332357e);
        } else {
            mMRoundCornerImageView.setImageBitmap(m95.a.a(mMRoundCornerImageView.getContext().getResources(), com.tencent.mm.R.raw.icons_filled_template_loading, 0.0f));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingImproveRecordMaasTemplateAdapter", "bindNormalTemplate onBindViewHolder >> " + i17 + ' ' + str3 + ", " + str2 + ' ' + holder.f331859d);
        holder.itemView.setOnClickListener(new mx0.s9(this, z17));
        K(z17, holder);
    }

    public abstract int y(int i17);

    public abstract int z(int i17);
}
