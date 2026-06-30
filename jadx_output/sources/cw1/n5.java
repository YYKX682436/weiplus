package cw1;

/* loaded from: classes12.dex */
public final class n5 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f223181d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanFilterDialog f223182e;

    public n5(com.tencent.mm.plugin.clean.ui.fileindexui.CleanFilterDialog cleanFilterDialog, java.util.List items) {
        kotlin.jvm.internal.o.g(items, "items");
        this.f223182e = cleanFilterDialog;
        this.f223181d = items;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f223181d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return ((cw1.o5) this.f223181d.get(i17)).f223202b ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        if (holder instanceof cw1.l5) {
            cw1.l5 l5Var = (cw1.l5) holder;
            cw1.o5 o5Var = (cw1.o5) l5Var.f223105e.f223181d.get(l5Var.getAdapterPosition());
            cw1.n5 n5Var = l5Var.f223105e;
            com.tencent.mm.plugin.clean.ui.fileindexui.CleanFilterDialog cleanFilterDialog = n5Var.f223182e;
            long[] jArr = cleanFilterDialog.f95769p;
            boolean z17 = o5Var.f223205e;
            android.widget.TextView textView = l5Var.f223104d;
            if (z17) {
                if (o5Var.f223203c == cleanFilterDialog.f95770q) {
                    if (o5Var.f223204d == cleanFilterDialog.f95771r && jArr != null) {
                        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy.MM.dd");
                        textView.setText(simpleDateFormat.format(new java.util.Date(jArr[0])) + '~' + simpleDateFormat.format(new java.util.Date(jArr[1])));
                        com.tencent.mm.plugin.clean.ui.fileindexui.CleanFilterDialog.a(n5Var.f223182e, textView, ((cw1.o5) n5Var.f223181d.get(l5Var.getAdapterPosition())).f223205e);
                        return;
                    }
                }
            }
            textView.setText(o5Var.f223201a);
            com.tencent.mm.plugin.clean.ui.fileindexui.CleanFilterDialog.a(n5Var.f223182e, textView, ((cw1.o5) n5Var.f223181d.get(l5Var.getAdapterPosition())).f223205e);
            return;
        }
        if (holder instanceof cw1.m5) {
            cw1.m5 m5Var = (cw1.m5) holder;
            m5Var.f223142d.setText(((cw1.o5) m5Var.f223143e.f223181d.get(m5Var.getAdapterPosition())).f223201a);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(parent.getContext());
        if (i17 == 1) {
            android.view.View inflate = from.inflate(com.tencent.mm.R.layout.e2t, parent, false);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            return new cw1.m5(this, inflate);
        }
        android.view.View inflate2 = from.inflate(com.tencent.mm.R.layout.e2u, parent, false);
        kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
        return new cw1.l5(this, inflate2);
    }

    public final void x(int i17) {
        cw1.o5 o5Var;
        int i18;
        java.util.List list = this.f223181d;
        cw1.o5 o5Var2 = (cw1.o5) list.get(i17);
        int i19 = o5Var2.f223203c;
        boolean z17 = o5Var2.f223205e;
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanFilterDialog cleanFilterDialog = this.f223182e;
        if (z17) {
            if (i19 == 0) {
                android.view.View view = cleanFilterDialog.f95762f;
                if (view != null) {
                    view.callOnClick();
                    return;
                } else {
                    kotlin.jvm.internal.o.o("background");
                    throw null;
                }
            }
            return;
        }
        int i27 = o5Var2.f223204d;
        int i28 = i17 - i27;
        int i29 = i28;
        while (true) {
            if (i29 >= list.size() || (i18 = (o5Var = (cw1.o5) list.get(i29)).f223203c) != i19) {
                break;
            }
            o5Var.f223205e = i29 == i17;
            if (i18 == cleanFilterDialog.f95770q) {
                if (o5Var.f223204d == cleanFilterDialog.f95771r) {
                    notifyItemChanged(i17);
                }
            }
            i29++;
        }
        notifyItemRangeChanged(i28, i29 - i28, "");
        cleanFilterDialog.f95768o[i19] = i27;
        if (i19 != 0) {
            cleanFilterDialog.d();
            cleanFilterDialog.f95767n = true;
            return;
        }
        android.widget.TextView textView = cleanFilterDialog.f95763g;
        if (textView == null) {
            kotlin.jvm.internal.o.o("sortText");
            throw null;
        }
        textView.setText(cleanFilterDialog.getContext().getString(com.tencent.mm.R.string.n9r, o5Var2.f223201a));
        android.view.View view2 = cleanFilterDialog.f95762f;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("background");
            throw null;
        }
        view2.callOnClick();
        cw1.r5 onFilterChangeListener = cleanFilterDialog.getOnFilterChangeListener();
        if (onFilterChangeListener != null) {
            ((cw1.w2$$u) onFilterChangeListener).a(cleanFilterDialog.f95768o, cleanFilterDialog.f95769p);
        }
        cleanFilterDialog.f95767n = false;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17, java.util.List payloads) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder(holder, i17);
            return;
        }
        if (holder instanceof cw1.l5) {
            cw1.l5 l5Var = (cw1.l5) holder;
            cw1.n5 n5Var = l5Var.f223105e;
            com.tencent.mm.plugin.clean.ui.fileindexui.CleanFilterDialog.a(n5Var.f223182e, l5Var.f223104d, ((cw1.o5) n5Var.f223181d.get(l5Var.getAdapterPosition())).f223205e);
        }
    }
}
