package m31;

/* loaded from: classes9.dex */
public final class y0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f323237d;

    /* renamed from: e, reason: collision with root package name */
    public final m31.p1 f323238e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f323239f;

    public y0(java.util.List items, m31.p1 dialog) {
        kotlin.jvm.internal.o.g(items, "items");
        kotlin.jvm.internal.o.g(dialog, "dialog");
        this.f323237d = items;
        this.f323238e = dialog;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f323239f = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : items) {
            if (((m31.q0) obj).f323200a) {
                arrayList2.add(obj);
            }
        }
        arrayList.addAll(arrayList2);
        m31.p1 p1Var = this.f323238e;
        int size = ((java.util.ArrayList) this.f323239f).size();
        p1Var.getClass();
        p1Var.f323192s.setEnabled(size != 0);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f323237d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return this.f323237d.get(i17) instanceof m31.z0 ? 2 : 1;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        boolean z17 = holder instanceof m31.u0;
        java.util.List list = this.f323237d;
        if (z17) {
            m31.u0 u0Var = (m31.u0) holder;
            u0Var.f323217d.setText(((m31.q0) list.get(i17)).f323201b);
            boolean z18 = ((m31.q0) list.get(i17)).f323200a;
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = u0Var.f323218e;
            mMSwitchBtn.setCheck(z18);
            mMSwitchBtn.setSwitchListener(new m31.v0(this, holder, i17));
            return;
        }
        if (holder instanceof m31.s0) {
            m31.s0 s0Var = (m31.s0) holder;
            boolean z19 = ((m31.q0) list.get(i17)).f323200a;
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn2 = s0Var.f323211f;
            mMSwitchBtn2.setCheck(z19);
            s0Var.f323209d.setText(((m31.q0) list.get(i17)).f323201b);
            int i18 = ((m31.q0) list.get(i17)).f323200a ? 0 : 8;
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = s0Var.f323210e;
            weImageView.setVisibility(i18);
            mMSwitchBtn2.setSwitchListener(new m31.w0(this, holder, i17));
            m31.q0 q0Var = (m31.q0) list.get(i17);
            if (q0Var instanceof m31.z0) {
                x(i17, ((m31.z0) q0Var).f323242e, false, s0Var, (m31.q0) list.get(i17));
                weImageView.setOnClickListener(new m31.x0(q0Var, this, i17, holder));
            }
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (i17 == 2) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.cx7, (android.view.ViewGroup) null);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            return new m31.s0(inflate);
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.cx8, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
        return new m31.u0(inflate2);
    }

    public final void x(int i17, boolean z17, boolean z18, m31.s0 s0Var, m31.q0 q0Var) {
        android.content.res.Resources resources;
        int i18;
        m31.d1 d1Var;
        m31.p1 p1Var = this.f323238e;
        m31.c1 c1Var = p1Var.f323181e;
        if (c1Var != null) {
            c1Var.b(m31.b1.f323122d, z17, q0Var, z18);
        }
        if (z18) {
            if (z17) {
                java.lang.Object systemService = p1Var.f323180d.getSystemService("vibrator");
                kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
                ((android.os.Vibrator) systemService).vibrate(10L);
                m31.d1 d1Var2 = p1Var.f323182f;
                if (d1Var2 != null) {
                    ((com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.j) d1Var2).a(p1Var.f323180d, true);
                }
            } else if (s0Var.f323211f.f211363x && (d1Var = p1Var.f323182f) != null) {
                ((com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.j) d1Var).a(p1Var.f323180d, false);
            }
        }
        if (z17) {
            resources = s0Var.f323210e.getContext().getResources();
            i18 = com.tencent.mm.R.color.f479530a82;
        } else {
            resources = s0Var.f323210e.getContext().getResources();
            i18 = com.tencent.mm.R.color.BW_0_Alpha_0_5;
        }
        int color = resources.getColor(i18);
        android.graphics.drawable.Drawable drawable = s0Var.itemView.getContext().getResources().getDrawable(z17 ? com.tencent.mm.R.raw.icons_bell_on : com.tencent.mm.R.raw.icons_outlined_bellring_close);
        com.tencent.mm.ui.uk.f(drawable, color);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = s0Var.f323210e;
        weImageView.setImageDrawable(drawable);
        weImageView.setIconColor(color);
    }

    public final void y(boolean z17, androidx.recyclerview.widget.k3 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        boolean z18 = holder instanceof m31.u0;
        java.util.List list = this.f323239f;
        m31.p1 p1Var = this.f323238e;
        java.util.List list2 = this.f323237d;
        if (z18) {
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = ((m31.u0) holder).f323218e;
            mMSwitchBtn.setCheck(z17);
            ((m31.q0) list2.get(i17)).f323200a = mMSwitchBtn.f211363x;
            if (((m31.q0) list2.get(i17)).f323200a) {
                ((java.util.ArrayList) list).add(list2.get(i17));
            } else {
                ((java.util.ArrayList) list).remove(list2.get(i17));
            }
            int size = ((java.util.ArrayList) list).size();
            p1Var.getClass();
            p1Var.f323192s.setEnabled(size != 0);
            return;
        }
        if (holder instanceof m31.s0) {
            m31.s0 s0Var = (m31.s0) holder;
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn2 = s0Var.f323211f;
            mMSwitchBtn2.setCheck(z17);
            m31.q0 q0Var = (m31.q0) list2.get(i17);
            boolean z19 = mMSwitchBtn2.f211363x;
            q0Var.f323200a = z19;
            s0Var.f323210e.setVisibility(z19 ? 0 : 8);
            m31.q0 q0Var2 = (m31.q0) list2.get(i17);
            if (q0Var2.f323200a) {
                ((java.util.ArrayList) list).add(q0Var2);
            } else {
                ((java.util.ArrayList) list).remove(q0Var2);
                if (q0Var2 instanceof m31.z0) {
                    ((m31.z0) q0Var2).f323242e = false;
                    x(i17, false, true, s0Var, (m31.q0) list2.get(i17));
                }
            }
            int size2 = ((java.util.ArrayList) list).size();
            p1Var.getClass();
            p1Var.f323192s.setEnabled(size2 != 0);
        }
    }
}
