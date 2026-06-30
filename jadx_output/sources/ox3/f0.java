package ox3;

/* loaded from: classes10.dex */
public final class f0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final int f349741e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.p f349742f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.p f349743g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.p f349744h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.q f349745i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Set f349746m;

    /* renamed from: n, reason: collision with root package name */
    public final c50.a1 f349747n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f349748o;

    public f0(int i17, yz5.p onClickAuthor, yz5.p onClickUse, yz5.p onClickListen, yz5.q onPlayStateChange) {
        kotlin.jvm.internal.o.g(onClickAuthor, "onClickAuthor");
        kotlin.jvm.internal.o.g(onClickUse, "onClickUse");
        kotlin.jvm.internal.o.g(onClickListen, "onClickListen");
        kotlin.jvm.internal.o.g(onPlayStateChange, "onPlayStateChange");
        this.f349741e = i17;
        this.f349742f = onClickAuthor;
        this.f349743g = onClickUse;
        this.f349744h = onClickListen;
        this.f349745i = onPlayStateChange;
        this.f349746m = new java.util.LinkedHashSet();
        ((c61.s9) ((c50.b1) i95.n0.c(c50.b1.class))).getClass();
        this.f349747n = new lt2.b();
        this.f349748o = c01.e2.a0();
    }

    @Override // in5.r
    public int e() {
        int i17 = this.f349741e;
        return (i17 == 1 || i17 == 2 || i17 != 3) ? com.tencent.mm.R.layout.ch_ : com.tencent.mm.R.layout.cgz;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        boolean z18;
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy2;
        t45.f fVar;
        vx3.i a17;
        java.lang.CharSequence string;
        java.lang.String str;
        ox3.g item = (ox3.g) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        item.getItemId();
        java.util.Objects.toString(list != null ? list.get(0) : null);
        boolean z19 = list == null || list.isEmpty();
        yz5.q qVar = this.f349745i;
        if (z19) {
            t45.n0 n0Var = item.f349749d;
            t45.g gVar = n0Var.f415617f;
            if (gVar != null && (fVar = gVar.f415560d) != null && (a17 = qx3.d.a(fVar.f415549d)) != null) {
                holder.s(com.tencent.mm.R.id.m5x, o13.q.e(p13.i.a(a17.f441292i, item.f349752g, false, false)).f351105a);
                android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.m4p);
                if (imageView != null) {
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    ya2.l.f460502a.k(a17.f441294k, imageView, a17.e());
                }
                int i19 = gVar.f415574u;
                android.content.Context context = holder.f293121e;
                if (i19 == 1) {
                    string = context.getString(com.tencent.mm.R.string.cvk, java.lang.Long.valueOf(gVar.f415572s));
                } else if (i19 == 2) {
                    string = context.getString(com.tencent.mm.R.string.cvl, ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).il((int) gVar.f415568o));
                } else if (i19 != 3) {
                    string = context.getString(com.tencent.mm.R.string.cvl, ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).il((int) gVar.f415568o));
                } else {
                    le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                    t45.p0 p0Var = gVar.f415575v;
                    if (p0Var == null || (str = p0Var.f415628d) == null) {
                        str = "";
                    }
                    ((ke0.e) xVar).getClass();
                    string = com.tencent.mm.pluginsdk.ui.span.c0.i(context, str);
                }
                android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.lo7);
                if (textView != null) {
                    textView.setText(string);
                }
                android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.lo7);
                if (textView2 != null) {
                    kotlin.jvm.internal.o.d(string);
                    textView2.setVisibility(string.length() > 0 ? 0 : 8);
                }
                int i27 = (int) gVar.f415568o;
                android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.m5y);
                if (textView3 != null) {
                    textView3.setText(context.getString(com.tencent.mm.R.string.cvl, ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).il(i27)));
                    textView3.setVisibility(i27 > 0 ? 0 : 8);
                }
                holder.s(com.tencent.mm.R.id.m4y, a17.f441293j);
                holder.p(com.tencent.mm.R.id.m4y).setOnClickListener(new ox3.v(this, holder, item));
                holder.p(com.tencent.mm.R.id.m4y).setClickable(true);
                holder.p(com.tencent.mm.R.id.opo).setOnClickListener(new ox3.x(this, holder, item));
                if (n0Var.f415622n != null) {
                    holder.w(com.tencent.mm.R.id.q1w, 0);
                    holder.p(com.tencent.mm.R.id.q1w).setOnClickListener(new ox3.z(this, holder, item));
                } else {
                    holder.w(com.tencent.mm.R.id.q1w, 8);
                }
                if (this.f349748o) {
                    holder.w(com.tencent.mm.R.id.q1w, 8);
                }
            }
            boolean z27 = item.f349750e;
            vx3.i a18 = qx3.d.a(item.getItemId());
            if (a18 != null && (finderObject = a18.f441287d) != null) {
                c50.a1 a1Var = this.f349747n;
                android.view.View p17 = holder.p(com.tencent.mm.R.id.f486695m63);
                kotlin.jvm.internal.o.f(p17, "getView(...)");
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) p17;
                android.view.View p18 = holder.p(com.tencent.mm.R.id.m4p);
                kotlin.jvm.internal.o.f(p18, "getView(...)");
                android.widget.ImageView imageView2 = (android.widget.ImageView) p18;
                ((lt2.b) a1Var).getClass();
                long id6 = finderObject.getId();
                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
                if (objectDesc == null || (media = objectDesc.getMedia()) == null || (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) == null) {
                    z18 = true;
                    finderThumbPlayerProxy = null;
                } else {
                    r45.mb4 i28 = bu2.z.i(finderMedia);
                    mn2.g4 c17 = ds2.h.f242866a.c(id6, i28, false);
                    com.tencent.mm.plugin.finder.storage.FeedData b17 = com.tencent.mm.plugin.finder.storage.FeedData.Companion.b(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, finderObject.getObjectType()));
                    if (frameLayout.getChildCount() == 0) {
                        android.content.Context context2 = frameLayout.getContext();
                        kotlin.jvm.internal.o.f(context2, "getContext(...)");
                        finderThumbPlayerProxy2 = new com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy(context2);
                        frameLayout.addView(finderThumbPlayerProxy2, new android.widget.FrameLayout.LayoutParams(-1, -1));
                    } else {
                        android.view.View childAt = frameLayout.getChildAt(0);
                        kotlin.jvm.internal.o.e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy");
                        finderThumbPlayerProxy2 = (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) childAt;
                        if (kotlin.jvm.internal.o.b(c17.n(), finderThumbPlayerProxy2.getVideoMediaId())) {
                            finderThumbPlayerProxy2.pause();
                        } else {
                            finderThumbPlayerProxy2.stop();
                        }
                    }
                    if (!kotlin.jvm.internal.o.b(c17.n(), finderThumbPlayerProxy2.getVideoMediaId())) {
                        if (i28.getFloat(4) > 0.0f && i28.getFloat(5) > 0.0f && i28.getFloat(4) / i28.getFloat(5) > 0.75f) {
                            imageView2.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
                            finderThumbPlayerProxy2.setScaleType(com.tencent.mm.pluginsdk.ui.e1.CONTAIN);
                        } else {
                            imageView2.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                            finderThumbPlayerProxy2.setScaleType(com.tencent.mm.pluginsdk.ui.e1.COVER);
                        }
                        finderThumbPlayerProxy2.setLoop(true);
                        finderThumbPlayerProxy2.n(c17, false, b17);
                        finderThumbPlayerProxy2.F();
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.FinderVideoPlayHelper", "onBindViewHolder feedId:" + id6 + ", mediaId:" + finderThumbPlayerProxy2.getVideoMediaId() + ", isPlay:" + z27);
                    finderThumbPlayerProxy2.setVideoPlayLifecycle(new lt2.a(imageView2));
                    imageView2.setVisibility(0);
                    if (z27) {
                        z18 = true;
                        finderThumbPlayerProxy2.setLoop(true);
                        finderThumbPlayerProxy2.setVideoViewFocused(true);
                        zy2.g5.u(finderThumbPlayerProxy2, null, 1, null);
                    } else {
                        z18 = true;
                    }
                    finderThumbPlayerProxy = finderThumbPlayerProxy2;
                }
                pm0.v.L("MicroMsg.RingtoneConverter", z18, new ox3.a0(finderThumbPlayerProxy, this));
            }
            if (item.f349750e) {
                qVar.invoke(java.lang.Integer.valueOf(i17), java.lang.Boolean.TRUE, item);
            }
        } else {
            java.lang.Object i07 = kz5.n0.i0(list);
            kotlin.jvm.internal.o.e(i07, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((java.lang.Boolean) i07).booleanValue();
            item.f349750e = booleanValue;
            pm0.v.L("MicroMsg.RingtoneConverter", true, new ox3.b0(this, holder, booleanValue));
            qVar.invoke(java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(booleanValue), item);
        }
        n(item, holder);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    @Override // in5.r
    public void j(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        super.j(recyclerView);
        pm0.v.L("MicroMsg.RingtoneConverter", true, new ox3.c0(this));
    }

    @Override // in5.r
    public void k(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        ox3.g gVar = (ox3.g) holder.f293125i;
        int adapterPosition = holder.getAdapterPosition();
        if (gVar.f349750e) {
            gVar.f349750e = false;
            pm0.v.L("MicroMsg.RingtoneConverter", true, new ox3.d0(this, holder));
            this.f349745i.invoke(java.lang.Integer.valueOf(adapterPosition), java.lang.Boolean.FALSE, null);
        }
        n(gVar, holder);
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        pm0.v.L("MicroMsg.RingtoneConverter", true, new ox3.e0(this, holder));
    }

    public final void n(ox3.g gVar, in5.s0 s0Var) {
        boolean z17 = gVar.f349750e;
        s0Var.w(com.tencent.mm.R.id.m4s, z17 ? 4 : 0);
        com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView = (com.tencent.mm.plugin.gif.MMAnimateView) s0Var.p(com.tencent.mm.R.id.m4r);
        mMAnimateView.setVisibility(z17 ? 0 : 4);
        if (!z17) {
            mMAnimateView.y();
            return;
        }
        mMAnimateView.y();
        mMAnimateView.setImageFilePath(mx3.f0.f332548a.d(mx3.f0.f332558k));
        mMAnimateView.x();
    }
}
