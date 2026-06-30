package ri5;

/* loaded from: classes.dex */
public final class g extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f396102e = jz5.h.b(ri5.e.f396099d);

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f396103f = jz5.h.b(ri5.d.f396098d);

    @Override // in5.r
    public int e() {
        return i65.a.D(com.tencent.mm.sdk.platformtools.x2.f193071a) ? com.tencent.mm.R.layout.c5q : com.tencent.mm.R.layout.c5p;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        jz5.f0 f0Var;
        android.content.Intent intent;
        ri5.j item = (ri5.j) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.View view = holder.itemView;
        em.o2 o2Var = new em.o2(view);
        boolean z18 = !r26.n0.N(item.E);
        java.lang.String str = item.f396111f;
        if (z18) {
            gk0.k kVar = new gk0.k(o2Var.a().getMeasuredWidth(), o2Var.a().getMeasuredHeight());
            kVar.f272433d = 0.1f;
            kVar.f272434e = com.tencent.mm.R.drawable.bhm;
            gk0.n0 n0Var = (gk0.n0) i95.n0.c(gk0.n0.class);
            android.widget.ImageView a17 = o2Var.a();
            kotlin.jvm.internal.o.f(a17, "getAvatarIv(...)");
            ((h83.g) n0Var).wi(a17, item.E, kVar);
        } else {
            java.lang.String str2 = r26.n0.N(str) ^ true ? str : null;
            if (str2 != null) {
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(o2Var.a(), str2, 0.1f);
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                android.widget.ImageView a18 = o2Var.a();
                i95.m c17 = i95.n0.c(kv.b0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                a18.setImageBitmap(kv.b0.Mg((kv.b0) c17, 0.0f, 1, null));
            }
        }
        o2Var.a().setVisibility(item.D ? 8 : 0);
        if (item.f396118o) {
            o2Var.d().setVisibility(0);
            o2Var.c().setText(item.f396119p);
            if (item.f396121r) {
                com.tencent.mm.ui.bk.s0(o2Var.c().getPaint());
            }
        } else {
            o2Var.d().setVisibility(8);
        }
        if (item.f396120q != 0) {
            o2Var.d().setBackgroundColor(item.f396120q);
            o2Var.c().setBackgroundColor(item.f396120q);
        }
        if (item.f396127x) {
            if (item.f396125v) {
                o2Var.j().setChecked(true);
                o2Var.j().setEnabled(false);
                o2Var.j().setAlpha(1.0f);
                o2Var.a().setAlpha(1.0f);
                o2Var.g().setAlpha(1.0f);
                o2Var.j().setBackgroundResource(com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.raw.checkbox_selected_grey_dark : com.tencent.mm.R.raw.checkbox_selected_grey);
            } else {
                boolean z19 = item.f396115l1;
                int i19 = com.tencent.mm.R.drawable.aoe;
                if (z19) {
                    o2Var.j().setChecked(false);
                    o2Var.j().setEnabled(false);
                    o2Var.j().setAlpha(0.3f);
                    o2Var.j().setBackgroundResource(com.tencent.mm.R.drawable.aoe);
                    o2Var.a().setAlpha(0.3f);
                    o2Var.g().setAlpha(0.3f);
                } else {
                    o2Var.j().setChecked(item.f396126w);
                    o2Var.j().setEnabled(true);
                    o2Var.j().setAlpha(1.0f);
                    o2Var.a().setAlpha(1.0f);
                    o2Var.g().setAlpha(1.0f);
                    android.content.Context context = holder.itemView.getContext();
                    android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
                    if (((activity == null || (intent = activity.getIntent()) == null) ? 0 : intent.getIntExtra("key_check_box_color", 0)) == 1) {
                        i19 = com.tencent.mm.R.drawable.d6w;
                    }
                    o2Var.j().setBackgroundResource(i19);
                }
            }
            o2Var.j().setVisibility(0);
        } else {
            o2Var.j().setVisibility(8);
        }
        if (item.f396129z && o2Var.j().getVisibility() == 0) {
            o2Var.j().setVisibility(4);
        }
        if (o2Var.f254677e == null) {
            o2Var.f254677e = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.m38);
        }
        o2Var.f254677e.setVisibility(item.A ? 0 : 8);
        o2Var.e().setVisibility(item.C ? 0 : 8);
        if (item.f396122s) {
            if (com.tencent.mm.ui.bk.C()) {
                o2Var.b().setBackgroundResource(com.tencent.mm.R.color.f479314vu);
            } else {
                o2Var.b().setBackgroundResource(com.tencent.mm.R.color.f479313vt);
            }
            android.view.View b17 = o2Var.b();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(b17, arrayList.toArray(), "com/tencent/mm/ui/mvvm/item/SelectContactItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/mvvm/item/SelectContactListItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(b17, "com/tencent/mm/ui/mvvm/item/SelectContactItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/mvvm/item/SelectContactListItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View b18 = o2Var.b();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(b18, arrayList2.toArray(), "com/tencent/mm/ui/mvvm/item/SelectContactItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/mvvm/item/SelectContactListItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(b18, "com/tencent/mm/ui/mvvm/item/SelectContactItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/mvvm/item/SelectContactListItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (item.f396123t) {
            if (o2Var.f254690r == null) {
                o2Var.f254690r = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.n0e);
            }
            o2Var.f254690r.setVisibility(0);
        } else {
            if (o2Var.f254690r == null) {
                o2Var.f254690r = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.n0e);
            }
            o2Var.f254690r.setVisibility(8);
        }
        if (item.f396124u) {
            if (o2Var.f254681i == null) {
                o2Var.f254681i = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.v2a);
            }
            o2Var.f254681i.setVisibility(0);
        } else {
            if (o2Var.f254681i == null) {
                o2Var.f254681i = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.v2a);
            }
            o2Var.f254681i.setVisibility(8);
        }
        item.f396113h.c(o2Var, holder, item, i17, i18, z17, list);
        com.tencent.mm.plugin.fts.ui.n3.a(item.f396112g, o2Var.g());
        o2Var.g().setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        if (item.B) {
            if (o2Var.f254685m == null) {
                o2Var.f254685m = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.ulk);
            }
            o2Var.f254685m.setVisibility(0);
        } else {
            if (o2Var.f254685m == null) {
                o2Var.f254685m = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.ulk);
            }
            o2Var.f254685m.setVisibility(8);
            o2Var.g().setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
            ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).wi(o2Var.g(), str, i65.a.h(holder.f293121e, com.tencent.mm.R.dimen.f479691cq));
        }
        if (item.F > 0) {
            o2Var.i().setVisibility(0);
            o2Var.i().setText(o2Var.i().getResources().getString(com.tencent.mm.R.string.n79, java.lang.Integer.valueOf(item.F)));
        } else if (item.G != -1) {
            o2Var.i().setVisibility(0);
            o2Var.i().setText(o2Var.i().getResources().getString(com.tencent.mm.R.string.n76, java.lang.Integer.valueOf(item.G)));
        } else {
            o2Var.i().setVisibility(8);
        }
        if (((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Di(str)) {
            if (o2Var.f254675c == null) {
                o2Var.f254675c = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.spk);
            }
            o2Var.f254675c.setVisibility(0);
        } else {
            if (o2Var.f254675c == null) {
                o2Var.f254675c = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.spk);
            }
            o2Var.f254675c.setVisibility(8);
        }
        com.tencent.mm.plugin.fts.ui.n3.a(item.f396116m, o2Var.h());
        java.lang.CharSequence charSequence = item.f396117n;
        if (o2Var.f254676d == null) {
            o2Var.f254676d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.cut);
        }
        com.tencent.mm.plugin.fts.ui.n3.a(charSequence, o2Var.f254676d);
        if (o2Var.h().getVisibility() == 0) {
            o2Var.f().getViewTreeObserver().addOnGlobalLayoutListener(new ri5.f(o2Var, this));
        }
    }
}
