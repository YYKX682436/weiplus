package f93;

/* loaded from: classes3.dex */
public final class e extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.AbsLabelUserDialog f260322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f260323e;

    public e(com.tencent.mm.plugin.label.ui.AbsLabelUserDialog absLabelUserDialog, android.content.Context context) {
        this.f260322d = absLabelUserDialog;
        this.f260323e = context;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f260322d.f143187w.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return ((f93.c5) this.f260322d.f143187w.get(i17)).f260305a;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        holder.itemView.setOnClickListener(f93.c.f260299d);
        boolean z17 = holder instanceof f93.v5;
        com.tencent.mm.plugin.label.ui.AbsLabelUserDialog absLabelUserDialog = this.f260322d;
        if (z17) {
            f93.v5 v5Var = (f93.v5) holder;
            java.lang.String str = ((f93.c5) absLabelUserDialog.f143187w.get(i17)).f260306b;
            kotlin.jvm.internal.o.d(str);
            v5Var.itemView.setClickable(false);
            android.view.View view = v5Var.itemView;
            kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.widget.TextView");
            ((android.widget.TextView) view).setText(str);
            return;
        }
        if (!(holder instanceof f93.u5)) {
            if (holder instanceof f93.u0) {
                f93.u0 u0Var = (f93.u0) holder;
                u0Var.i(((f93.c5) absLabelUserDialog.f143187w.get(i17)).f260308d);
                if (getItemViewType(i17) == 6) {
                    if (absLabelUserDialog.f143188x == 0 && i17 == 0) {
                        u0Var.itemView.setBackgroundResource(com.tencent.mm.R.drawable.f482122b21);
                        return;
                    } else {
                        u0Var.itemView.setBackgroundResource(com.tencent.mm.R.drawable.b1y);
                        return;
                    }
                }
                if (getItemViewType(i17) == 5) {
                    if (absLabelUserDialog.f143188x == 0 && i17 == 0) {
                        u0Var.itemView.setBackgroundResource(com.tencent.mm.R.drawable.f482121b20);
                        return;
                    } else {
                        u0Var.itemView.setBackgroundResource(com.tencent.mm.R.drawable.b1z);
                        return;
                    }
                }
                return;
            }
            return;
        }
        f93.u5 u5Var = (f93.u5) holder;
        f93.r5 r5Var = ((f93.c5) absLabelUserDialog.f143187w.get(i17)).f260307c;
        java.lang.Object value = ((jz5.n) u5Var.f260483d).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((android.widget.TextView) value).setText(com.tencent.mm.smiley.x1.Di().Ri(r5Var != null ? r5Var.f260451b : null, true));
        int i18 = r5Var != null ? r5Var.f260452c : 0;
        java.lang.Object value2 = ((jz5.n) u5Var.f260484e).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        java.lang.String r17 = i65.a.r(u5Var.itemView.getContext(), com.tencent.mm.R.string.jb7);
        kotlin.jvm.internal.o.f(r17, "getString(...)");
        java.lang.String format = java.lang.String.format(r17, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i18)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        ((android.widget.TextView) value2).setText(format);
        if (getItemViewType(i17) == 3) {
            u5Var.itemView.setBackgroundResource(com.tencent.mm.R.drawable.b1y);
        } else if (getItemViewType(i17) == 2) {
            u5Var.itemView.setBackgroundResource(com.tencent.mm.R.drawable.b1z);
        }
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        com.tencent.mm.plugin.label.ui.AbsLabelUserDialog absLabelUserDialog2 = this.f260322d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setThrottleOnClickListener", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        itemView.setOnClickListener(new f93.b(itemView, 1000L, absLabelUserDialog2, i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setThrottleOnClickListener", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        com.tencent.mm.plugin.label.ui.AbsLabelUserDialog absLabelUserDialog = this.f260322d;
        switch (i17) {
            case 1:
                android.view.View inflate = com.tencent.mm.ui.id.b(absLabelUserDialog.getContext()).inflate(com.tencent.mm.R.layout.f489504cs0, parent, false);
                kotlin.jvm.internal.o.f(inflate, "inflate(...)");
                return new f93.v5(inflate);
            case 2:
            case 3:
                android.view.View inflate2 = com.tencent.mm.ui.id.b(absLabelUserDialog.getContext()).inflate(com.tencent.mm.R.layout.f489505cs1, parent, false);
                kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
                return new f93.u5(inflate2);
            case 4:
                return new f93.d(com.tencent.mm.ui.id.b(absLabelUserDialog.getContext()).inflate(com.tencent.mm.R.layout.cry, parent, false));
            case 5:
            case 6:
                android.view.View inflate3 = com.tencent.mm.ui.id.b(absLabelUserDialog.getContext()).inflate(com.tencent.mm.R.layout.crz, parent, false);
                kotlin.jvm.internal.o.f(inflate3, "inflate(...)");
                return new f93.u0(inflate3, this.f260323e, absLabelUserDialog.f143184t);
            default:
                return new f93.u5(new android.widget.TextView(absLabelUserDialog.getContext()));
        }
    }
}
