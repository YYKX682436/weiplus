package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class yd extends com.tencent.mm.plugin.finder.viewmodel.component.mb0 implements zy2.e7 {

    /* renamed from: f, reason: collision with root package name */
    public final so2.c f136554f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f136555g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f136556h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f136557i;

    /* renamed from: m, reason: collision with root package name */
    public xc2.p0 f136558m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.ref.WeakReference f136559n;

    /* renamed from: o, reason: collision with root package name */
    public az2.f f136560o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f136561p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.viewmodel.component.od f136562q;

    /* renamed from: r, reason: collision with root package name */
    public db5.d5 f136563r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f136564s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f136554f = so2.c.f410281h;
        this.f136561p = jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.md.f135163d);
        this.f136562q = new com.tencent.mm.plugin.finder.viewmodel.component.od(this);
        this.f136564s = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.xd(this));
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    public void O6(in5.s0 holder, com.tencent.mm.plugin.finder.viewmodel.component.db0 animationType) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(animationType, "animationType");
        db5.d5 d5Var = this.f136563r;
        if (d5Var != null) {
            pm0.v.C(g7());
            d5Var.dismiss();
        }
        this.f136563r = null;
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    public void P6(in5.s0 holder, com.tencent.mm.plugin.finder.viewmodel.component.db0 animationType) {
        java.util.List list;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(animationType, "animationType");
        java.lang.Object obj = holder.f293125i;
        java.lang.Object obj2 = null;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
        if (baseFinderFeed == null || (list = (java.util.List) f7().U6(baseFinderFeed.getItemId()).getValue()) == null) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            java.util.LinkedList<r45.wf6> style = ((com.tencent.mm.protocal.protobuf.FinderJumpInfo) next).getStyle();
            kotlin.jvm.internal.o.f(style, "getStyle(...)");
            boolean z17 = false;
            if (!style.isEmpty()) {
                java.util.Iterator<T> it6 = style.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    r45.wf6 wf6Var = (r45.wf6) it6.next();
                    kotlin.jvm.internal.o.d(wf6Var);
                    if (h7(wf6Var)) {
                        z17 = true;
                        break;
                    }
                }
            }
            if (z17) {
                obj2 = next;
                break;
            }
        }
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) obj2;
        if (finderJumpInfo == null) {
            return;
        }
        com.tencent.mm.plugin.finder.assist.r1.f102493a.d(finderJumpInfo.getBusiness_type(), baseFinderFeed.getItemId());
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    public void Q6(in5.s0 holder, com.tencent.mm.plugin.finder.viewmodel.component.db0 animationType) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(animationType, "animationType");
        U6(holder);
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    public android.view.View R6(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.f484883qk1);
        if (p17 != null) {
            return p17;
        }
        android.view.ViewStub viewStub = (android.view.ViewStub) holder.p(com.tencent.mm.R.id.f484884qk2);
        android.view.View inflate = viewStub != null ? viewStub.inflate() : null;
        if (inflate != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedMusicLikeUIC", "getContentView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(inflate, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedMusicLikeUIC", "getContentView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return inflate;
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    public so2.c S6() {
        return this.f136554f;
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    public void W6(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        if (holder.p(com.tencent.mm.R.id.f484883qk1) != null) {
            super.W6(holder);
        }
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    public boolean X6(in5.s0 holder, boolean z17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        return d7(holder);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e9  */
    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c7(in5.s0 r13) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.yd.c7(in5.s0):void");
    }

    public final boolean d7(in5.s0 s0Var) {
        java.util.List list;
        java.lang.Object obj = s0Var.f293125i;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
        if (baseFinderFeed == null || (list = (java.util.List) f7().U6(baseFinderFeed.getItemId()).getValue()) == null) {
            return false;
        }
        com.tencent.mm.protocal.protobuf.FinderJumpInfo e76 = e7(baseFinderFeed, list);
        boolean z17 = e76 != null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isNeedShow: canShowCarousel=");
        sb6.append(z17);
        sb6.append(", businessType=");
        sb6.append(e76 != null ? java.lang.Integer.valueOf(e76.getBusiness_type()) : null);
        sb6.append(", feedId=");
        sb6.append(pm0.v.u(baseFinderFeed.getItemId()));
        com.tencent.mars.xlog.Log.i("FinderFeedMusicLikeUIC", sb6.toString());
        return z17;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo e7(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, java.util.List list) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (true) {
            z17 = true;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            java.util.LinkedList<r45.wf6> style = ((com.tencent.mm.protocal.protobuf.FinderJumpInfo) next).getStyle();
            kotlin.jvm.internal.o.f(style, "getStyle(...)");
            if (!style.isEmpty()) {
                for (r45.wf6 wf6Var : style) {
                    kotlin.jvm.internal.o.d(wf6Var);
                    if (h7(wf6Var)) {
                        break;
                    }
                }
            }
            z17 = false;
            if (z17) {
                arrayList.add(next);
            }
        }
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) kz5.n0.Z(arrayList);
        if (finderJumpInfo == null) {
            return null;
        }
        if (baseFinderFeed.getCurrentCarouselItemType() != so2.c.f410281h && !com.tencent.mm.plugin.finder.assist.r1.f102493a.a(finderJumpInfo.getBusiness_type(), java.lang.Long.valueOf(baseFinderFeed.getItemId()))) {
            z17 = false;
        }
        if (z17) {
            return finderJumpInfo;
        }
        return null;
    }

    public final xc2.k0 f7() {
        return (xc2.k0) ((jz5.n) this.f136561p).getValue();
    }

    public final java.lang.Runnable g7() {
        return (java.lang.Runnable) ((jz5.n) this.f136564s).getValue();
    }

    public final boolean h7(r45.wf6 wf6Var) {
        r45.d60 d60Var = (r45.d60) wf6Var.getCustom(31);
        java.lang.Integer valueOf = d60Var != null ? java.lang.Integer.valueOf(d60Var.getInteger(5)) : null;
        return wf6Var.getInteger(2) == 23 && wf6Var.getInteger(1) == 16 && ((valueOf != null && valueOf.intValue() == 2) || ((valueOf != null && valueOf.intValue() == 5) || (valueOf != null && valueOf.intValue() == 6)));
    }

    public final void i7(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, xc2.p0 p0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, yz5.a aVar) {
        java.lang.Object obj;
        r45.d60 d60Var;
        android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.f489045dh5, null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.fth);
        int i17 = 0;
        if (str3 == null || str3.length() == 0) {
            if (textView != null) {
                textView.setText(com.tencent.mm.R.string.lou);
            }
        } else if (textView != null) {
            textView.setText(str3);
        }
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.qcq);
        if (str4 == null || str4.length() == 0) {
            if (textView2 != null) {
                textView2.setText(com.tencent.mm.R.string.lov);
            }
        } else if (textView2 != null) {
            textView2.setText(str4);
        }
        db5.d5 d5Var = this.f136563r;
        if (d5Var != null) {
            d5Var.dismiss();
        }
        db5.d5 d5Var2 = new db5.d5(inflate);
        d5Var2.setAnimationStyle(com.tencent.mm.R.style.f494816x2);
        this.f136563r = d5Var2;
        inflate.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.ud(aVar, this, baseFinderFeed));
        db5.d5 d5Var3 = this.f136563r;
        if (d5Var3 != null) {
            d5Var3.setWidth(-1);
        }
        db5.d5 d5Var4 = this.f136563r;
        if (d5Var4 != null) {
            d5Var4.setHeight(-2);
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479649bo);
        db5.d5 d5Var5 = this.f136563r;
        if (d5Var5 != null) {
            d5Var5.showAtLocation(getContext().getWindow().getDecorView(), 80, 0, dimensionPixelSize);
        }
        android.content.Context context = inflate.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        java.lang.String ek6 = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(baseFinderFeed.getItemId(), baseFinderFeed.w(), ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6().getInteger(5));
        jz5.l[] lVarArr = new jz5.l[6];
        lVarArr[0] = new jz5.l("feed_id", pm0.v.u(baseFinderFeed.getItemId()));
        lVarArr[1] = new jz5.l("songid", str);
        lVarArr[2] = new jz5.l("audioid", str2);
        lVarArr[3] = new jz5.l("business_type", java.lang.Integer.valueOf(p0Var.f453234a.getBusiness_type()));
        java.util.LinkedList<r45.wf6> style = p0Var.f453234a.getStyle();
        kotlin.jvm.internal.o.f(style, "getStyle(...)");
        java.util.Iterator<T> it = style.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            java.lang.Object next = it.next();
            r45.wf6 wf6Var = (r45.wf6) next;
            kotlin.jvm.internal.o.d(wf6Var);
            if (h7(wf6Var)) {
                obj = next;
                break;
            }
        }
        r45.wf6 wf6Var2 = (r45.wf6) obj;
        if (wf6Var2 != null && (d60Var = (r45.d60) wf6Var2.getCustom(31)) != null) {
            i17 = d60Var.getInteger(5);
        }
        lVarArr[4] = new jz5.l("btntype", java.lang.Integer.valueOf(i17));
        lVarArr[5] = new jz5.l("session_buffer", ek6);
        hc2.v0.e(inflate, "like_and_song_sheet", 0, 0, false, true, kz5.c1.k(lVarArr), null, 78, null);
        pm0.v.C(g7());
        pm0.v.U(5000L, g7());
    }

    public final void l7(in5.s0 s0Var) {
        java.util.List list;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo e76;
        r45.d60 d60Var;
        java.lang.Object obj = s0Var.f293125i;
        java.lang.Object obj2 = null;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
        if (baseFinderFeed == null || (list = (java.util.List) f7().U6(baseFinderFeed.getItemId()).getValue()) == null || (e76 = e7(baseFinderFeed, list)) == null) {
            return;
        }
        java.util.LinkedList<r45.wf6> style = e76.getStyle();
        kotlin.jvm.internal.o.f(style, "getStyle(...)");
        java.util.Iterator<T> it = style.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            r45.wf6 wf6Var = (r45.wf6) next;
            kotlin.jvm.internal.o.d(wf6Var);
            if (h7(wf6Var)) {
                obj2 = next;
                break;
            }
        }
        r45.wf6 wf6Var2 = (r45.wf6) obj2;
        if (wf6Var2 == null || (d60Var = (r45.d60) wf6Var2.getCustom(31)) == null) {
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.tencent.mm.R.id.b09);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) s0Var.p(com.tencent.mm.R.id.b0o);
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.b1l);
        com.tencent.mars.xlog.Log.i("FinderFeedMusicLikeUIC", "[updateBtnStatus] isLikeSong:" + this.f136555g + " isFavAndGuidePost:" + this.f136556h);
        if (this.f136555g) {
            if (weImageView != null) {
                weImageView.setVisibility(0);
            }
            if (weImageView != null) {
                weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_done);
            }
            if (weImageView != null) {
                weImageView.setIconColor(getActivity().getResources().getColor(com.tencent.mm.R.color.abx));
            }
            if (textView != null) {
                textView.setText(this.f136556h ? getContext().getResources().getString(com.tencent.mm.R.string.f491411li4) : getContext().getResources().getString(com.tencent.mm.R.string.d0m));
            }
            if (textView != null) {
                textView.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3));
            }
        } else {
            if (weImageView != null) {
                weImageView.setVisibility(8);
            }
            if (textView != null) {
                java.lang.String string = d60Var.getString(4);
                if (string == null || string.length() == 0) {
                    string = getContext().getResources().getString(com.tencent.mm.R.string.erk);
                }
                textView.setText(string);
            }
            if (textView != null) {
                textView.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
            }
        }
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        float b17 = i65.a.b(getContext(), 4);
        gradientDrawable.setCornerRadii(new float[]{b17, b17, b17, b17, b17, b17, b17, b17});
        gradientDrawable.setColor(!this.f136555g ? getContext().getResources().getColor(com.tencent.mm.R.color.adh) : getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_1));
        if (viewGroup == null) {
            return;
        }
        viewGroup.setBackground(gradientDrawable);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
        g7();
        pm0.v.C(g7());
        db5.d5 d5Var = this.f136563r;
        if (d5Var != null) {
            d5Var.dismiss();
        }
        this.f136563r = null;
    }
}
