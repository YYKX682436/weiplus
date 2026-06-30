package mx0;

/* loaded from: classes5.dex */
public final class v9 extends mx0.t9 {

    /* renamed from: i, reason: collision with root package name */
    public yz5.a f332403i;

    @Override // mx0.t9
    public java.lang.String B(int i17) {
        if (i17 == 0) {
            return "kEmptyTemplateId";
        }
        int i18 = i17 - 1;
        java.util.ArrayList arrayList = this.f332358f;
        boolean z17 = false;
        if (i18 >= 0 && i18 < arrayList.size()) {
            z17 = true;
        }
        if (z17) {
            vt3.p pVar = (vt3.p) kz5.n0.a0(arrayList, i18);
            if (pVar != null) {
                return pVar.f440020b;
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShootComposingTemplateAdapterWithoutEmptyTemplate", "invalid position: " + i17);
        }
        return null;
    }

    @Override // mx0.t9
    public boolean E(int i17) {
        if (i17 == 0) {
            return false;
        }
        int i18 = i17 - 1;
        java.util.ArrayList arrayList = this.f332358f;
        if (i18 >= 0 && i18 < arrayList.size()) {
            vt3.p pVar = (vt3.p) kz5.n0.a0(arrayList, i18);
            if (pVar != null) {
                return pVar.f440031m;
            }
            return false;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ShootComposingTemplateAdapterWithoutEmptyTemplate", "getTemplateIsAIGC - invalid position: " + i17);
        return false;
    }

    @Override // mx0.t9
    public boolean I(int i17) {
        if (i17 == 0) {
            return false;
        }
        int i18 = i17 - 1;
        java.util.ArrayList arrayList = this.f332358f;
        if (i18 >= 0 && i18 < arrayList.size()) {
            vt3.p pVar = (vt3.p) kz5.n0.a0(arrayList, i18);
            if (pVar != null) {
                return pVar.f440027i;
            }
            return false;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ShootComposingTemplateAdapterWithoutEmptyTemplate", "getTemplateIsFavorite - invalid position: " + i17);
        return false;
    }

    @Override // mx0.t9
    public com.tencent.mm.protobuf.g J(int i17) {
        if (i17 == 0) {
            return null;
        }
        int i18 = i17 - 1;
        java.util.ArrayList arrayList = this.f332358f;
        boolean z17 = false;
        if (i18 >= 0 && i18 < arrayList.size()) {
            z17 = true;
        }
        if (z17) {
            vt3.p pVar = (vt3.p) kz5.n0.a0(arrayList, i18);
            if (pVar != null) {
                return pVar.f440026h;
            }
            return null;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ShootComposingTemplateAdapterWithoutEmptyTemplate", "invalid position: " + i17);
        return null;
    }

    @Override // mx0.t9
    public void L(java.lang.String templateId) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        super.L(templateId);
        if (kotlin.jvm.internal.o.b(templateId, "kEmptyTemplateId")) {
            notifyItemChanged(0, mx0.r9.f332294d);
        }
    }

    @Override // mx0.t9
    public void N(java.lang.String templateId) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        super.N(templateId);
        if (kotlin.jvm.internal.o.b(templateId, "kEmptyTemplateId")) {
            notifyItemChanged(0, mx0.r9.f332294d);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f332358f.size() + 1;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        vt3.m mVar;
        int i18 = i17 - 1;
        if (i17 == 0) {
            vt3.m mVar2 = vt3.m.f440011e;
            return 1;
        }
        vt3.p pVar = (vt3.p) kz5.n0.a0(this.f332358f, i18);
        if (pVar != null && (mVar = pVar.f440019a) != null) {
            return mVar.f440014d;
        }
        vt3.m mVar3 = vt3.m.f440011e;
        return 1;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        mx0.ba holder = (mx0.ba) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        if (i17 != 0) {
            x(i17 - 1, holder);
            return;
        }
        holder.f331859d = "kEmptyTemplateId";
        java.lang.String r17 = i65.a.r(holder.itemView.getContext(), com.tencent.mm.R.string.lfx);
        android.widget.TextView textView = holder.f331861f;
        textView.setText(r17);
        textView.setVisibility(8);
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = holder.f331860e;
        mMRoundCornerImageView.setImageResource(com.tencent.mm.R.drawable.f481049cl3);
        mMRoundCornerImageView.setBackgroundColor(0);
        android.view.View view = holder.f331863h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/ShootComposingTemplateAdapterWithEmptyTemplate", "bindEmptyTemplate", "(Lcom/tencent/mm/mj_publisher/finder/shoot_composing/TemplateNormalViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/shoot_composing/ShootComposingTemplateAdapterWithEmptyTemplate", "bindEmptyTemplate", "(Lcom/tencent/mm/mj_publisher/finder/shoot_composing/TemplateNormalViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        holder.f331862g.setVisibility(8);
        holder.itemView.setOnClickListener(new mx0.u9(this));
    }

    @Override // mx0.t9
    public int y(int i17) {
        return i17 - 1;
    }

    @Override // mx0.t9
    public int z(int i17) {
        return i17 + 1;
    }
}
