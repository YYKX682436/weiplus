package ox3;

/* loaded from: classes10.dex */
public final class e extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public ox3.b f349738e;

    @Override // in5.r
    public in5.s0 d(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View convertView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(convertView, "convertView");
        return new ox3.c(this, convertView);
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.clc;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        vx3.i d17;
        android.content.res.Resources resources;
        android.content.res.Resources resources2;
        ox3.a exclusive = (ox3.a) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(exclusive, "exclusive");
        if (holder instanceof ox3.c) {
            if (!(list == null || list.isEmpty())) {
                ox3.c cVar2 = (ox3.c) holder;
                java.lang.Object obj = list.get(0);
                java.lang.Boolean bool = obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null;
                n(cVar2, bool != null ? bool.booleanValue() : false, exclusive);
                return;
            }
            ox3.c cVar3 = (ox3.c) holder;
            t45.i iVar = exclusive.f349721d;
            java.lang.String str = iVar.f415588d;
            if (str != null) {
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Di(cVar3.f349730p, str);
                ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                cVar3.f349729o.setText(c01.a2.e(str));
                android.content.Context context = cVar3.itemView.getContext();
                android.content.Context context2 = cVar3.itemView.getContext();
                int i19 = -16777216;
                android.graphics.drawable.Drawable e17 = com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_more, (context2 == null || (resources2 = context2.getResources()) == null) ? -16777216 : resources2.getColor(com.tencent.mm.R.color.FG_0));
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = cVar3.f349731q;
                weImageView.setImageDrawable(e17);
                android.content.Context context3 = cVar3.itemView.getContext();
                if (context3 != null && (resources = context3.getResources()) != null) {
                    i19 = resources.getColor(com.tencent.mm.R.color.FG_0);
                }
                weImageView.setIconColor(i19);
                weImageView.setOnClickListener(new ox3.d(this, exclusive, cVar3));
            }
            java.lang.String str2 = iVar.f415588d;
            if (str2 != null && ((d17 = mx3.i0.d(str2)) != null || (d17 = qx3.b.a(str2.hashCode())) != null)) {
                android.widget.TextView textView = (android.widget.TextView) cVar3.itemView.findViewById(com.tencent.mm.R.id.diq);
                android.widget.ImageView imageView = (android.widget.ImageView) cVar3.itemView.findViewById(com.tencent.mm.R.id.m4s);
                cy3.u uVar = cVar3.f349728n;
                uVar.getClass();
                uVar.f224853d = d17;
                int i27 = d17.j() ? com.tencent.mm.R.dimen.f479646bl : com.tencent.mm.R.dimen.f479943jp;
                android.content.Context context4 = uVar.f224852c;
                int h17 = i65.a.h(context4, i27);
                com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView = uVar.f224850a;
                mMAnimateView.setPadding(h17, h17, h17, h17);
                int i28 = d17.j() ? com.tencent.mm.R.raw.icons_filled_specialplay : com.tencent.mm.R.raw.icons_filled_ringing;
                uVar.f224851b = i28;
                mMAnimateView.setImageDrawable(com.tencent.mm.ui.uk.e(context4, i28, context4.getResources().getColor(com.tencent.mm.R.color.FG_0)));
                if (d17.f441297n) {
                    if (textView != null) {
                        textView.setText(i65.a.r(cVar3.itemView.getContext(), com.tencent.mm.R.string.i3f));
                    }
                    if (textView != null) {
                        textView.setTextColor(i65.a.d(cVar3.itemView.getContext(), com.tencent.mm.R.color.FG_4));
                    }
                    if (imageView != null) {
                        android.content.Context context5 = cVar3.itemView.getContext();
                        kotlin.jvm.internal.o.f(context5, "getContext(...)");
                        int d18 = i65.a.d(context5, com.tencent.mm.R.color.a38);
                        android.graphics.drawable.Drawable mutate = i65.a.i(context5, com.tencent.mm.R.raw.icons_filled_error).mutate();
                        kotlin.jvm.internal.o.f(mutate, "mutate(...)");
                        mutate.setColorFilter(new android.graphics.PorterDuffColorFilter(android.graphics.Color.argb(android.graphics.Color.alpha(d18), android.graphics.Color.red(d18), android.graphics.Color.green(d18), android.graphics.Color.blue(d18)), android.graphics.PorterDuff.Mode.SRC_ATOP));
                        mutate.setAlpha(android.graphics.Color.alpha(d18));
                        imageView.setImageDrawable(mutate);
                    }
                    uVar.a(false);
                } else {
                    if (d17.j()) {
                        if (textView != null) {
                            textView.setText(d17.f441291h);
                        }
                    } else if (textView != null) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        java.lang.String str3 = d17.f441291h;
                        if (str3 == null) {
                            str3 = "";
                        }
                        sb6.append(str3);
                        sb6.append(" - ");
                        java.lang.String str4 = d17.f441293j;
                        sb6.append(str4 != null ? str4 : "");
                        textView.setText(sb6.toString());
                    }
                    if (textView != null) {
                        textView.setTextColor(i65.a.d(cVar3.itemView.getContext(), com.tencent.mm.R.color.FG_0));
                    }
                    if (imageView != null) {
                        android.content.Context context6 = cVar3.itemView.getContext();
                        kotlin.jvm.internal.o.f(context6, "getContext(...)");
                        int d19 = i65.a.d(context6, com.tencent.mm.R.color.FG_0);
                        android.graphics.drawable.Drawable mutate2 = i65.a.i(context6, com.tencent.mm.R.raw.icons_filled_ringing).mutate();
                        kotlin.jvm.internal.o.f(mutate2, "mutate(...)");
                        mutate2.setColorFilter(new android.graphics.PorterDuffColorFilter(android.graphics.Color.argb(android.graphics.Color.alpha(d19), android.graphics.Color.red(d19), android.graphics.Color.green(d19), android.graphics.Color.blue(d19)), android.graphics.PorterDuff.Mode.SRC_ATOP));
                        mutate2.setAlpha(android.graphics.Color.alpha(d19));
                        imageView.setImageDrawable(mutate2);
                    }
                    uVar.a(true);
                }
            }
            n(cVar3, exclusive.f349722e, exclusive);
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    public final void n(ox3.c cVar, boolean z17, ox3.a aVar) {
        aVar.getClass();
        if (!z17) {
            cy3.u uVar = cVar.f349728n;
            int i17 = uVar.f224851b;
            android.content.Context context = uVar.f224852c;
            uVar.f224850a.setImageDrawable(com.tencent.mm.ui.uk.e(context, i17, context.getResources().getColor(com.tencent.mm.R.color.FG_0)));
            return;
        }
        cy3.u uVar2 = cVar.f349728n;
        com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView = uVar2.f224850a;
        if (mMAnimateView.r()) {
            return;
        }
        vx3.i iVar = uVar2.f224853d;
        if ((iVar == null || iVar.j()) ? false : true) {
            mMAnimateView.setImageFilePath(mx3.f0.f(true));
            mMAnimateView.x();
        }
    }
}
