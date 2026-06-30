package sc2;

/* loaded from: classes2.dex */
public final class u3 extends ad2.h {

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f406280x;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f406279w = "FinderJumperCnyWishPag";

    /* renamed from: y, reason: collision with root package name */
    public final int f406281y = 3;

    /* renamed from: z, reason: collision with root package name */
    public final long f406282z = 150;
    public final java.util.Map A = kz5.c1.k(new jz5.l(0, java.lang.Integer.valueOf(com.tencent.mm.R.id.tbz)), new jz5.l(1, java.lang.Integer.valueOf(com.tencent.mm.R.id.f484439tc0)), new jz5.l(2, java.lang.Integer.valueOf(com.tencent.mm.R.id.f484440tc1)));
    public final java.util.List B = kz5.c0.k("", "", "");
    public final android.util.ArrayMap C = new android.util.ArrayMap();
    public final java.util.List D = kz5.c0.k(java.lang.Double.valueOf(0.0d), java.lang.Double.valueOf(0.0d), java.lang.Double.valueOf(0.0d));

    @Override // ad2.h
    public void E(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, boolean z17, yz5.a aVar) {
        int i17;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        xc2.p0 p0Var = this.f3147h;
        android.view.View view = this.f3143d;
        if (p0Var != null && view != null) {
            java.util.ArrayList arrayList = p0Var.Z;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if ((((xc2.p0) next).f453257s == 35 ? 1 : 0) != 0) {
                    arrayList2.add(next);
                }
            }
            int size = arrayList2.size();
            int i18 = this.f406281y;
            if (size != i18) {
                com.tencent.mars.xlog.Log.i("TAG", "pag size err, need " + i18 + ", but get " + arrayList2.size());
            } else {
                for (java.lang.Object obj : arrayList2) {
                    int i19 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    xc2.p0 p0Var2 = (xc2.p0) obj;
                    java.lang.Integer num = (java.lang.Integer) this.A.get(java.lang.Integer.valueOf(i17));
                    com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) view.findViewById(num != null ? num.intValue() : com.tencent.mm.R.id.tbz);
                    kotlin.jvm.internal.o.d(mMPAGView);
                    G(p0Var2, mMPAGView);
                    i17 = i19;
                }
            }
        }
        f(500L, jumpView, z17, aVar);
        e(true, z17);
    }

    public final void G(xc2.p0 p0Var, com.tencent.mm.view.MMPAGView mMPAGView) {
        fe0.t3 t3Var = (fe0.t3) i95.n0.c(fe0.t3.class);
        java.lang.String jump_page_id = p0Var.f453234a.getJump_page_id();
        ((ee0.p3) t3Var).getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHalfEggCardExposedId", "com.tencent.mm.feature.sns.FinderCnyAdService");
        java.lang.String d17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.j0.d(jump_page_id);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHalfEggCardExposedId", "com.tencent.mm.feature.sns.FinderCnyAdService");
        boolean z17 = !com.tencent.mm.sdk.platformtools.t8.K0(d17);
        if (z17) {
            mMPAGView.setProgress(0.0d);
            mMPAGView.d();
            mMPAGView.n();
        }
        this.C.put(p0Var.f453234a.getJump_page_id(), java.lang.Boolean.valueOf(z17));
    }

    @Override // ad2.h
    public gs2.a j(com.tencent.mm.protocal.protobuf.FinderJumpInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        return info.getBusiness_type() == 2 ? info.getExt_type() == 3 ? gs2.a.f275052h : gs2.a.f275054m : super.j(info);
    }

    @Override // ad2.h
    public java.lang.String k() {
        return this.f406279w;
    }

    @Override // ad2.h
    public boolean m(xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        return true;
    }

    @Override // ad2.h
    public void n(android.view.View jumpView, boolean z17, yz5.a aVar) {
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        g(250L, jumpView, z17, aVar);
        e(false, z17);
    }

    @Override // ad2.h
    public void q(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        java.lang.Object obj;
        java.util.LinkedList<r45.wf6> style;
        java.lang.Object obj2;
        r45.ql6 ql6Var;
        int i17;
        java.lang.Object obj3;
        com.tencent.mm.view.MMPAGView mMPAGView;
        cl0.g gVar;
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        kotlin.jvm.internal.o.g(source, "source");
        super.q(feed, holder, jumpView, infoEx, source);
        if (this.f406280x == null) {
            android.content.Context context = jumpView.getContext();
            final com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderCnyEggCardEvent> iListener = mMActivity != null ? new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderCnyEggCardEvent>(mMActivity) { // from class: com.tencent.mm.plugin.finder.feed.component.FeedJumperCnyWishPagObserver$createListener$1
                {
                    this.__eventId = 1918656061;
                }

                @Override // com.tencent.mm.sdk.event.IListener
                public boolean callback(com.tencent.mm.autogen.events.FinderCnyEggCardEvent finderCnyEggCardEvent) {
                    com.tencent.mm.autogen.events.FinderCnyEggCardEvent event = finderCnyEggCardEvent;
                    kotlin.jvm.internal.o.g(event, "event");
                    ((ku5.t0) ku5.t0.f312615d).B(new sc2.t3(this));
                    return true;
                }
            } : null;
            this.f406280x = iListener;
            if (iListener != null) {
                iListener.alive();
            }
        }
        java.util.ArrayList arrayList = infoEx.Z;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((xc2.p0) obj).f453257s == 36) {
                    break;
                }
            }
        }
        xc2.p0 p0Var = (xc2.p0) obj;
        int i18 = 2;
        if (p0Var == null) {
            com.tencent.mars.xlog.Log.i("TAG", "cny wish text err, get null");
        } else {
            android.widget.TextView textView = (android.widget.TextView) jumpView.findViewById(com.tencent.mm.R.id.f484442tc3);
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = p0Var.f453234a;
            if (finderJumpInfo != null && (style = finderJumpInfo.getStyle()) != null) {
                java.util.Iterator<T> it6 = style.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it6.next();
                        if (((r45.wf6) obj2).getInteger(2) == 36) {
                            break;
                        }
                    }
                }
                r45.wf6 wf6Var = (r45.wf6) obj2;
                if (wf6Var != null && (ql6Var = (r45.ql6) wf6Var.getCustom(45)) != null) {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(ql6Var.getString(0))) {
                        try {
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(ql6Var.getString(1))) {
                                textView.setTextColor(android.graphics.Color.parseColor(ql6Var.getString(1)));
                            }
                        } catch (java.lang.Throwable unused) {
                            com.tencent.mars.xlog.Log.e(this.f406279w, "bindCnyText color err, color: " + ql6Var.getString(1));
                        }
                        if (textView != null) {
                            textView.setText(ql6Var.getString(0));
                        }
                        if (textView != null) {
                            textView.setVisibility(0);
                        }
                    } else if (textView != null) {
                        textView.setVisibility(8);
                    }
                }
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it7 = arrayList.iterator();
        while (true) {
            i17 = 35;
            if (!it7.hasNext()) {
                break;
            }
            java.lang.Object next = it7.next();
            if (((xc2.p0) next).f453257s == 35) {
                arrayList2.add(next);
            }
        }
        int size = arrayList2.size();
        int i19 = this.f406281y;
        if (size != i19) {
            com.tencent.mars.xlog.Log.i("TAG", "pag size err, need " + i19 + ", but get " + arrayList2.size());
        } else {
            java.util.Iterator it8 = arrayList2.iterator();
            int i27 = 0;
            while (it8.hasNext()) {
                java.lang.Object next2 = it8.next();
                int i28 = i27 + 1;
                if (i27 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                xc2.p0 p0Var2 = (xc2.p0) next2;
                if (i27 >= 3) {
                    break;
                }
                java.lang.Integer num = (java.lang.Integer) this.A.get(java.lang.Integer.valueOf(i27));
                com.tencent.mm.view.MMPAGView mMPAGView2 = (com.tencent.mm.view.MMPAGView) jumpView.findViewById(num != null ? num.intValue() : com.tencent.mm.R.id.tbz);
                kotlin.jvm.internal.o.d(mMPAGView2);
                com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                mMPAGView2.o(((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Jg).getValue()).r()).booleanValue());
                mMPAGView2.setRepeatCount(1);
                java.util.LinkedList<r45.wf6> style2 = p0Var2.f453234a.getStyle();
                if (style2 != null) {
                    java.util.Iterator<T> it9 = style2.iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            obj3 = null;
                            break;
                        } else {
                            obj3 = it9.next();
                            if (((r45.wf6) obj3).getInteger(i18) == i17) {
                                break;
                            }
                        }
                    }
                    r45.wf6 wf6Var2 = (r45.wf6) obj3;
                    if (wf6Var2 == null) {
                        continue;
                    } else {
                        holder.j();
                        kotlinx.coroutines.y0 y0Var = holder.f293120d;
                        if (y0Var != null) {
                            mMPAGView = mMPAGView2;
                            kotlinx.coroutines.l.d(y0Var, null, null, new sc2.q3(this, i27, wf6Var2, mMPAGView2, null), 3, null);
                        } else {
                            mMPAGView = mMPAGView2;
                        }
                        G(p0Var2, mMPAGView);
                        mMPAGView.setOnClickListener(new sc2.r3(holder, p0Var2));
                        xc2.p0 p0Var3 = this.f3147h;
                        xc2.o0 o0Var = p0Var3 != null ? p0Var3.f453246h : null;
                        xc2.p pVar = o0Var instanceof xc2.p ? (xc2.p) o0Var : null;
                        java.lang.Object opt = (pVar == null || (gVar = pVar.f453227f) == null) ? null : gVar.opt("report_extra_data");
                        if (opt == null) {
                            opt = "";
                        }
                        java.lang.Object obj4 = opt;
                        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = p0Var2.f453244f;
                        long itemId = baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L;
                        android.content.Context context2 = mMPAGView.getContext();
                        kotlin.jvm.internal.o.f(context2, "getContext(...)");
                        pf5.z zVar = pf5.z.f353948a;
                        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).c(zy2.ra.class))).V6();
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(mMPAGView, "finder_red_packet_extract");
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(mMPAGView, 40, 25496);
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(mMPAGView, new sc2.s3(itemId, this, p0Var2, obj4, V6));
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Tj(mMPAGView, 40, 1, false);
                    }
                }
                i27 = i28;
                i18 = 2;
                i17 = 35;
            }
        }
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = infoEx.f453234a;
        gs2.c.f275072a.e(holder, jumpView, j(finderJumpInfo2), finderJumpInfo2.getBusiness_type() == 2);
    }

    @Override // ad2.h
    public void y(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, ec2.f event) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        kotlin.jvm.internal.o.g(event, "event");
        super.y(holder, jumpView, infoEx, event);
        java.util.ArrayList arrayList = infoEx.Z;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((xc2.p0) next).f453257s == 35) {
                arrayList2.add(next);
            }
        }
        int size = arrayList2.size();
        int i17 = this.f406281y;
        if (size != i17) {
            com.tencent.mars.xlog.Log.i("TAG", "pag size err, need " + i17 + ", but get " + arrayList2.size());
            return;
        }
        int i18 = 0;
        for (java.lang.Object obj : arrayList2) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            xc2.p0 p0Var = (xc2.p0) obj;
            if (i18 >= 3) {
                return;
            }
            java.lang.Integer num = (java.lang.Integer) this.A.get(java.lang.Integer.valueOf(i18));
            com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) jumpView.findViewById(num != null ? num.intValue() : com.tencent.mm.R.id.tbz);
            android.util.ArrayMap arrayMap = this.C;
            java.util.List list = this.D;
            int i27 = event.f250959d;
            if (i27 == 11 && !kotlin.jvm.internal.o.b(arrayMap.get(p0Var.f453234a.getJump_page_id()), java.lang.Boolean.TRUE)) {
                list.set(i18, java.lang.Double.valueOf(mMPAGView.getProgress()));
                mMPAGView.n();
            } else if (i27 == 1) {
                if ((mMPAGView.getProgress() == ((java.lang.Number) list.get(i18)).doubleValue()) && !mMPAGView.f() && !kotlin.jvm.internal.o.b(arrayMap.get(p0Var.f453234a.getJump_page_id()), java.lang.Boolean.TRUE)) {
                    mMPAGView.setProgress(((java.lang.Number) list.get(i18)).doubleValue());
                    mMPAGView.g();
                }
            }
            i18 = i19;
        }
    }

    @Override // ad2.h
    public void z(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        super.z(holder, jumpView, infoEx, i17);
        if (i17 < infoEx.E || i17 >= infoEx.F) {
            return;
        }
        java.util.ArrayList arrayList = infoEx.Z;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((xc2.p0) next).f453257s == 35) {
                arrayList2.add(next);
            }
        }
        int size = arrayList2.size();
        int i18 = this.f406281y;
        if (size != i18) {
            com.tencent.mars.xlog.Log.i("TAG", "pag size err, need " + i18 + ", but get " + arrayList2.size());
            return;
        }
        int i19 = 0;
        for (java.lang.Object obj : arrayList2) {
            int i27 = i19 + 1;
            if (i19 < 0) {
                kz5.c0.p();
                throw null;
            }
            xc2.p0 p0Var = (xc2.p0) obj;
            if (i19 >= 3) {
                return;
            }
            java.lang.Integer num = (java.lang.Integer) this.A.get(java.lang.Integer.valueOf(i19));
            com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) jumpView.findViewById(num != null ? num.intValue() : com.tencent.mm.R.id.tbz);
            kotlin.jvm.internal.o.d(mMPAGView);
            java.lang.Boolean bool = (java.lang.Boolean) this.C.get(p0Var.f453234a.getJump_page_id());
            if (bool == null ? false : bool.booleanValue()) {
                mMPAGView.setProgress(0.0d);
                mMPAGView.d();
                mMPAGView.n();
            } else {
                if (mMPAGView.c() / 1000 != 0) {
                    long j17 = (i17 - p0Var.E) * 1000;
                    long j18 = this.f406282z;
                    mMPAGView.setProgress(((float) ((j17 % (r3 - j18)) + j18)) / ((float) r3));
                    if (!mMPAGView.f()) {
                        mMPAGView.g();
                    }
                }
            }
            i19 = i27;
        }
    }
}
