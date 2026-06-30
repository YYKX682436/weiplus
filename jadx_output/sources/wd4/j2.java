package wd4;

/* loaded from: classes.dex */
public final class j2 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog f444939d;

    public j2(com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog snsGroupDialog) {
        this.f444939d = snsGroupDialog;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2$1");
        int size = com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog.K(this.f444939d).size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2$1");
        return size;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2$1");
        wd4.s0 s0Var = (wd4.s0) com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog.K(this.f444939d).get(i17);
        s0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
        int i18 = s0Var.f445020a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2$1");
        return i18;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        java.lang.String str;
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2$1");
        kotlin.jvm.internal.o.g(holder, "holder");
        holder.itemView.setOnClickListener(wd4.h2.f444922d);
        boolean z17 = holder instanceof wd4.d3;
        com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog snsGroupDialog = this.f444939d;
        if (z17) {
            wd4.d3 d3Var = (wd4.d3) holder;
            wd4.s0 s0Var = (wd4.s0) com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog.K(snsGroupDialog).get(i17);
            s0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTitle", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTitle", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
            java.lang.String str2 = s0Var.f445021b;
            kotlin.jvm.internal.o.d(str2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTitle", "com.tencent.mm.plugin.sns.ui.sheet.TitleHolder");
            d3Var.itemView.setClickable(false);
            android.view.View view = d3Var.itemView;
            kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.widget.TextView");
            ((android.widget.TextView) view).setText(str2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTitle", "com.tencent.mm.plugin.sns.ui.sheet.TitleHolder");
        } else if (holder instanceof wd4.w0) {
            wd4.w0 w0Var = (wd4.w0) holder;
            wd4.t0 a17 = ((wd4.s0) com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog.K(snsGroupDialog).get(i17)).a();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLabelInfo", "com.tencent.mm.plugin.sns.ui.sheet.LabelItemHolder");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNameText", "com.tencent.mm.plugin.sns.ui.sheet.LabelItemHolder");
            java.lang.Object value = ((jz5.n) w0Var.f445051d).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            android.widget.TextView textView = (android.widget.TextView) value;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNameText", "com.tencent.mm.plugin.sns.ui.sheet.LabelItemHolder");
            com.tencent.mm.smiley.x1 Di = com.tencent.mm.smiley.x1.Di();
            if (a17 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
                str = a17.f445028b;
            } else {
                str = null;
            }
            textView.setText(Di.Ri(str, true));
            if (a17 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
                i18 = a17.f445029c;
            } else {
                i18 = 0;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNumText", "com.tencent.mm.plugin.sns.ui.sheet.LabelItemHolder");
            java.lang.Object value2 = ((jz5.n) w0Var.f445052e).getValue();
            kotlin.jvm.internal.o.f(value2, "getValue(...)");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNumText", "com.tencent.mm.plugin.sns.ui.sheet.LabelItemHolder");
            java.lang.String r17 = i65.a.r(w0Var.itemView.getContext(), com.tencent.mm.R.string.jb7);
            kotlin.jvm.internal.o.f(r17, "getString(...)");
            java.lang.String format = java.lang.String.format(r17, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i18)}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            ((android.widget.TextView) value2).setText(format);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLabelInfo", "com.tencent.mm.plugin.sns.ui.sheet.LabelItemHolder");
            if (getItemViewType(i17) == 3) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBackgroundResource", "com.tencent.mm.plugin.sns.ui.sheet.LabelItemHolder");
                w0Var.itemView.setBackgroundResource(com.tencent.mm.R.drawable.b1y);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBackgroundResource", "com.tencent.mm.plugin.sns.ui.sheet.LabelItemHolder");
            } else if (getItemViewType(i17) == 2) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBackgroundResource", "com.tencent.mm.plugin.sns.ui.sheet.LabelItemHolder");
                w0Var.itemView.setBackgroundResource(com.tencent.mm.R.drawable.b1z);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBackgroundResource", "com.tencent.mm.plugin.sns.ui.sheet.LabelItemHolder");
            }
            android.view.View itemView = holder.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            itemView.setOnClickListener(new wd4.g2(itemView, 1000L, this.f444939d, i17));
        } else if (holder instanceof wd4.w) {
            wd4.w wVar = (wd4.w) holder;
            wd4.s0 s0Var2 = (wd4.s0) com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog.K(snsGroupDialog).get(i17);
            s0Var2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContact", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContact", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setContactInfo", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder");
            com.tencent.mm.storage.z3 z3Var = s0Var2.f445023d;
            if (z3Var == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setContactInfo", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder");
            } else {
                tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                java.lang.String d17 = z3Var.d1();
                ((sg3.a) v0Var).getClass();
                java.lang.String c17 = c01.a2.c(z3Var, d17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUserTextView", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder");
                java.lang.Object value3 = ((jz5.n) wVar.f445050f).getValue();
                kotlin.jvm.internal.o.f(value3, "getValue(...)");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUserTextView", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder");
                ((android.widget.TextView) value3).setText(com.tencent.mm.smiley.x1.Di().Ri(c17, true));
                kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAvatarImg", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder");
                java.lang.Object value4 = ((jz5.n) wVar.f445049e).getValue();
                kotlin.jvm.internal.o.f(value4, "getValue(...)");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAvatarImg", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder");
                ((com.tencent.mm.feature.avatar.w) zVar).Ai((com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView) value4, z3Var.d1(), null);
                android.view.View itemView2 = wVar.itemView;
                kotlin.jvm.internal.o.f(itemView2, "itemView");
                itemView2.setOnClickListener(new wd4.u(itemView2, 1000L, wVar, z3Var));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setContactInfo", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder");
            }
            if (getItemViewType(i17) == 6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMHaveLabelChosen$p", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
                boolean z18 = snsGroupDialog.K;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMHaveLabelChosen$p", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
                if (z18 || i17 != 0) {
                    wVar.i(com.tencent.mm.R.drawable.b1y);
                } else {
                    wVar.i(com.tencent.mm.R.drawable.f482122b21);
                }
            } else if (getItemViewType(i17) == 5) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMHaveLabelChosen$p", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
                boolean z19 = snsGroupDialog.K;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMHaveLabelChosen$p", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
                if (z19 || i17 != 0) {
                    wVar.i(com.tencent.mm.R.drawable.b1z);
                } else {
                    wVar.i(com.tencent.mm.R.drawable.f482121b20);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2$1");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        androidx.recyclerview.widget.k3 d3Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2$1");
        kotlin.jvm.internal.o.g(parent, "parent");
        com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog snsGroupDialog = this.f444939d;
        switch (i17) {
            case 1:
                android.view.View inflate = com.tencent.mm.ui.id.b(snsGroupDialog.getContext()).inflate(com.tencent.mm.R.layout.f489504cs0, parent, false);
                kotlin.jvm.internal.o.f(inflate, "inflate(...)");
                d3Var = new wd4.d3(inflate);
                break;
            case 2:
            case 3:
                android.view.View inflate2 = com.tencent.mm.ui.id.b(snsGroupDialog.getContext()).inflate(com.tencent.mm.R.layout.f489505cs1, parent, false);
                kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
                d3Var = new wd4.w0(inflate2);
                break;
            case 4:
                d3Var = new wd4.i2(com.tencent.mm.ui.id.b(snsGroupDialog.getContext()).inflate(com.tencent.mm.R.layout.cry, parent, false));
                break;
            case 5:
            case 6:
                android.view.View inflate3 = com.tencent.mm.ui.id.b(snsGroupDialog.getContext()).inflate(com.tencent.mm.R.layout.crz, parent, false);
                kotlin.jvm.internal.o.f(inflate3, "inflate(...)");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUiContext", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUiContext", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
                d3Var = new wd4.w(inflate3, snsGroupDialog.f170461r);
                break;
            default:
                d3Var = new wd4.w0(new android.widget.TextView(snsGroupDialog.getContext()));
                break;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2$1");
        return d3Var;
    }
}
