package com.tencent.mm.ui.contact;

/* loaded from: classes.dex */
public final class s8 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.contact.u8 f207175e;

    public s8(com.tencent.mm.ui.contact.u8 u8Var) {
        this.f207175e = u8Var;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.ccj;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.ui.contact.w8 w8Var;
        android.view.View view;
        android.widget.ImageView imageView;
        int i19;
        com.tencent.mm.ui.contact.v8 item = (com.tencent.mm.ui.contact.v8) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ou7);
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.a9o);
        android.widget.ImageView imageView3 = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.sg8);
        android.widget.CheckBox checkBox = (android.widget.CheckBox) holder.p(com.tencent.mm.R.id.mht);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.f486796v22);
        android.widget.Button button = (android.widget.Button) holder.p(com.tencent.mm.R.id.f486795v21);
        com.tencent.mm.ui.contact.w8 w8Var2 = item.f207220d;
        java.lang.String str = w8Var2.f207231a;
        java.lang.String str2 = w8Var2.f207232b;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.spk);
        if (i18 == 1) {
            android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
            if (w8Var2.f207234d) {
                android.view.View view2 = holder.itemView;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/contact/RecentForwardConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/contact/RecentForwardItemConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/contact/RecentForwardConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/contact/RecentForwardItemConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                layoutParams.height = 0;
                layoutParams.width = 0;
            } else {
                android.view.View view3 = holder.itemView;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/ui/contact/RecentForwardConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/contact/RecentForwardItemConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/ui/contact/RecentForwardConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/contact/RecentForwardItemConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                checkBox.setVisibility(8);
                textView.setVisibility(8);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(p17, arrayList3.toArray(), "com/tencent/mm/ui/contact/RecentForwardConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/contact/RecentForwardItemConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/ui/contact/RecentForwardConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/contact/RecentForwardItemConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (w8Var2.f207235e) {
                    imageView2.setVisibility(8);
                    button.setVisibility(0);
                    button.setOnClickListener(new com.tencent.mm.ui.contact.p8(this));
                    button.setTextSize(1, 14 * java.lang.Math.min(1.125f, i65.a.q(holder.itemView.getContext())));
                } else {
                    imageView2.setVisibility(0);
                    button.setVisibility(8);
                    imageView2.setImageResource(com.tencent.mm.R.drawable.f480954g9);
                }
                layoutParams.height = -2;
                layoutParams.width = -2;
            }
            holder.itemView.setLayoutParams(layoutParams);
            return;
        }
        textView.setText(str2);
        if (com.tencent.mm.storage.z3.m4(str)) {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            imageView = imageView3;
            i19 = 0;
            w8Var = w8Var2;
            view = p17;
            ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).ij(com.tencent.mm.sdk.platformtools.x2.f193071a, textView, str2, n17.Q0(), n17.G0(), (int) textView.getTextSize());
        } else {
            w8Var = w8Var2;
            view = p17;
            imageView = imageView3;
            i19 = 0;
        }
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView2, str, null);
        if (c01.e2.R(str)) {
            android.graphics.drawable.Drawable drawable = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.raw.open_im_main_logo);
            kotlin.jvm.internal.o.f(drawable, "getDrawable(...)");
            drawable.setBounds(i19, i19, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            textView.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, drawable, (android.graphics.drawable.Drawable) null);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        }
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).wi(textView, str, i65.a.h(holder.f293121e, com.tencent.mm.R.dimen.f479691cq));
        com.tencent.mm.ui.contact.w8 w8Var3 = w8Var;
        checkBox.setVisibility((!w8Var3.f207234d || w8Var3.f207235e) ? 8 : i19);
        checkBox.setChecked(w8Var3.f207233c);
        if (checkBox.isChecked() && j65.e.b() && com.tencent.mm.ui.bk.C()) {
            checkBox.setBackgroundResource(com.tencent.mm.R.raw.checkbox_selected_filled_dark);
        }
        int i27 = w8Var3.f207235e ? i19 : 8;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList4.add(java.lang.Integer.valueOf(i27));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/ui/contact/RecentForwardConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/contact/RecentForwardItemConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = view;
        view4.setVisibility(((java.lang.Integer) arrayList4.get(i19)).intValue());
        yj0.a.f(view4, "com/tencent/mm/ui/contact/RecentForwardConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/contact/RecentForwardItemConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setOnClickListener(new com.tencent.mm.ui.contact.q8(this, i17, item));
        vh0.i2 i2Var = (vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class));
        java.lang.String str3 = w8Var3.f207231a;
        if (i2Var.Di(str3)) {
            weImageView.setVisibility(i19);
        } else {
            weImageView.setVisibility(8);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RecentForwardConverter", "onBindViewHolder: displayName :" + w8Var3.f207232b + "  contactUserName:" + str3 + " isSelected:" + w8Var3.f207233c + ' ');
        holder.itemView.setOnTouchListener(new com.tencent.mm.ui.contact.r8(imageView));
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
