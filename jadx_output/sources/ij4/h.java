package ij4;

/* loaded from: classes11.dex */
public final class h extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final bi4.m0 f291726e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f291727f;

    /* renamed from: g, reason: collision with root package name */
    public final bi4.k1 f291728g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f291729h;

    /* renamed from: i, reason: collision with root package name */
    public final android.content.Context f291730i;

    public h(bi4.m0 m0Var, java.lang.String str, java.util.ArrayList likeList, android.content.Context context, bi4.k1 k1Var) {
        kotlin.jvm.internal.o.g(likeList, "likeList");
        kotlin.jvm.internal.o.g(context, "context");
        this.f291726e = m0Var;
        this.f291727f = str;
        this.f291728g = k1Var;
        this.f291729h = likeList;
        this.f291730i = context;
    }

    @Override // in5.r
    public in5.s0 d(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View convertView) {
        android.view.ViewGroup.LayoutParams layoutParams;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(convertView, "convertView");
        if (recyclerView.getWidth() != 0 && (layoutParams = convertView.getLayoutParams()) != null) {
            convertView.setLayoutParams(layoutParams);
        }
        return new in5.s0(convertView);
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.cyo;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        ij4.d item = (ij4.d) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        holder.toString();
        java.util.Objects.toString(list);
        java.lang.Object obj = holder.f293124h;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.ui.StatusCardView");
        com.tencent.mm.plugin.textstatus.ui.q3 q3Var = (com.tencent.mm.plugin.textstatus.ui.q3) obj;
        q3Var.f174196m.setTag(com.tencent.mm.R.id.nwq, java.lang.Integer.valueOf(i17));
        android.view.View view = q3Var.f174196m;
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.ovl);
        if (imageView != null) {
            java.lang.Object tag = imageView.getTag(com.tencent.mm.R.id.rrh);
            java.lang.String f17 = dj4.u.f233049a.f(item.f291717d);
            if (!kotlin.jvm.internal.o.b(tag, "") && !kotlin.jvm.internal.o.b(f17, tag)) {
                imageView.setImageBitmap(null);
            }
            imageView.hashCode();
            java.util.Objects.toString(tag);
        }
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.hmt);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/model/feed/CardFeedItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/textstatus/model/feed/CardFeedItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/textstatus/model/feed/CardFeedItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/textstatus/model/feed/CardFeedItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        bi4.p0.U2(q3Var, ((mj4.k) item.f291717d).o(), item.f291717d, null, 4, null);
        boolean i19 = bi4.v1.i();
        android.content.Context context = holder.f293121e;
        if (i19) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("userName = ");
            sb6.append(((mj4.k) item.f291717d).o());
            sb6.append(", like list = ");
            java.util.ArrayList arrayList2 = this.f291729h;
            sb6.append(arrayList2);
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.CardFeedItemConvert", sb6.toString());
            if (!en1.a.a().equals(((mj4.k) item.f291717d).o())) {
                boolean O = kz5.n0.O(arrayList2, ((mj4.k) item.f291717d).l());
                android.widget.ImageView imageView2 = q3Var.f174208w;
                if (O) {
                    if (imageView2 != null) {
                        android.graphics.drawable.Drawable i27 = i65.a.i(context, com.tencent.mm.R.raw.icon_filled_awesome_status);
                        com.tencent.mm.ui.uk.f(i27, i65.a.d(context, com.tencent.mm.R.color.Red_100));
                        imageView2.setImageDrawable(i27);
                    }
                    if (imageView2 != null) {
                        imageView2.setTag(java.lang.Boolean.TRUE);
                    }
                    android.content.Context context2 = this.f291730i;
                    kotlin.jvm.internal.o.g(context2, "context");
                    pf5.z zVar = pf5.z.f353948a;
                    if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    ((com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC.class)).f173782p.put(((mj4.k) item.f291717d).l(), java.lang.Boolean.TRUE);
                } else {
                    if (imageView2 != null) {
                        android.graphics.drawable.Drawable i28 = i65.a.i(context, com.tencent.mm.R.raw.icon_filled_awesome_status);
                        com.tencent.mm.ui.uk.f(i28, i65.a.d(context, com.tencent.mm.R.color.f478553an));
                        imageView2.setImageDrawable(i28);
                    }
                    if (imageView2 != null) {
                        imageView2.setTag(java.lang.Boolean.FALSE);
                    }
                }
            }
        }
        android.view.View view2 = holder.itemView;
        kotlin.jvm.internal.o.e(view2, "null cannot be cast to non-null type android.widget.RelativeLayout");
        q3Var.D1 = new ij4.e(this, item, holder, (android.widget.RelativeLayout) view2);
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        recyclerView.toString();
        holder.toString();
        android.view.View view = holder.itemView;
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.widget.RelativeLayout");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) view;
        boolean z17 = false;
        java.lang.String str = this.f291727f;
        bi4.k1 k1Var = this.f291728g;
        if (k1Var == null) {
            if (kotlin.jvm.internal.o.b(str, "SCENE_HISTORY_FEED")) {
                k1Var = new bi4.k1();
                k1Var.e(true);
                k1Var.f(true);
                k1Var.q(true);
                k1Var.j(false);
                k1Var.f21067g = 9;
                k1Var.f21064d |= 32;
                k1Var.r(true);
                k1Var.d(false);
                k1Var.i(false);
                k1Var.c(true);
                k1Var.g(false);
                k1Var.h(true);
                k1Var.o(true);
                k1Var.f21065e = true;
                k1Var.f21066f = true;
                k1Var.n(true);
                k1Var.p(true);
                k1Var.f21064d = k1Var.f21064d | 524288 | 4194304;
                k1Var.m(true);
            } else if (kotlin.jvm.internal.o.b(str, "SCENE_DIALOG")) {
                k1Var = new bi4.k1();
                k1Var.q(true);
                k1Var.o(true);
                java.text.SimpleDateFormat simpleDateFormat = bi4.v1.f21093a;
                k1Var.r(true);
                k1Var.m(true);
                k1Var.f21064d |= 2097152;
            } else if (kotlin.jvm.internal.o.b(str, "SCENE_MULTIPLE_DIALOG")) {
                k1Var = bi4.k1.a();
            } else if (kotlin.jvm.internal.o.b(str, "SCENE_CONTACT_PROFILE")) {
                k1Var = bi4.k1.b(4, true, false);
            } else if (kotlin.jvm.internal.o.b(str, "SCENE_MORE_TAB")) {
                k1Var = bi4.k1.b(5, false, true);
            } else {
                k1Var = new bi4.k1();
                k1Var.e(true);
                k1Var.f(true);
                k1Var.q(true);
                k1Var.j(false);
                k1Var.f21067g = 8;
                k1Var.f21064d |= 32;
                k1Var.r(true);
                k1Var.d(false);
                k1Var.i(false);
                k1Var.c(true);
                k1Var.g(false);
                k1Var.h(true);
                k1Var.o(true);
                java.text.SimpleDateFormat simpleDateFormat2 = bi4.v1.f21093a;
                k1Var.k(true);
                k1Var.p(true);
                k1Var.m(true);
                k1Var.f21064d |= 1024;
            }
        }
        xe0.l0 l0Var = (xe0.l0) i95.n0.c(xe0.l0.class);
        android.content.Context context = recyclerView.getContext();
        ((we0.j1) l0Var).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.textstatus.ui.q3 n2Var = k1Var.l(com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) ? new com.tencent.mm.plugin.textstatus.ui.n2(context, k1Var) : new com.tencent.mm.plugin.textstatus.ui.q3(context, k1Var);
        android.view.View view2 = n2Var.f174196m;
        relativeLayout.addView(view2, 0);
        holder.f293124h = n2Var;
        holder.hashCode();
        n2Var.hashCode();
        boolean b17 = kotlin.jvm.internal.o.b(str, "SCENE_DEFAULT");
        android.content.Context context2 = holder.f293121e;
        if (b17 || kotlin.jvm.internal.o.b(str, "SCENE_MULTIPLE_DIALOG") || kotlin.jvm.internal.o.b(str, "SCENE_MORE_TAB") || kotlin.jvm.internal.o.b(str, "SCENE_CONTACT_PROFILE")) {
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            uj4.m mVar = (uj4.m) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(uj4.m.class);
            if (mVar != null && ((java.lang.Boolean) ((jz5.n) mVar.f428442d).getValue()).booleanValue()) {
                z17 = true;
            }
            if (z17) {
                view2.setOnTouchListener(new ij4.f(holder, n2Var));
            }
        } else if (kotlin.jvm.internal.o.b(str, "SCENE_HISTORY_FEED")) {
            view2.setOnTouchListener(new ij4.g(holder, n2Var));
        }
        android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ((android.widget.RelativeLayout.LayoutParams) layoutParams).width = -1;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        holder.toString();
    }
}
