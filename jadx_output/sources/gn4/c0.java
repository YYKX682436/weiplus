package gn4;

/* loaded from: classes15.dex */
public class c0 extends fn4.h {
    public android.view.View E;
    public android.view.View F;
    public android.widget.ImageView G;
    public android.widget.TextView H;
    public android.view.View I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.View f273595J;
    public android.view.View K;
    public android.view.View L;
    public android.view.View M;
    public android.view.View N;
    public android.view.View P;
    public android.widget.TextView Q;
    public android.widget.TextView R;
    public android.widget.ImageView S;
    public android.widget.ImageView T;
    public android.widget.ImageView U;
    public android.widget.TextView V;
    public android.view.View W;

    /* renamed from: l1, reason: collision with root package name */
    public gn4.b0 f273596l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.widget.TextView f273597p0;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f273598p1;

    /* renamed from: x0, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f273599x0;

    /* renamed from: y0, reason: collision with root package name */
    public r45.xn6 f273600y0;

    public void A(r45.xn6 xn6Var) {
        this.f273600y0 = xn6Var;
        android.view.View view = this.E;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        float dimensionPixelSize = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a1u);
        this.f162477m.setTextSize(0, dimensionPixelSize);
        this.f162478n.setTextSize(0, dimensionPixelSize);
        android.view.ViewGroup.LayoutParams layoutParams = this.K.getLayoutParams();
        layoutParams.height = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a1t);
        this.K.setLayoutParams(layoutParams);
        if (xn6Var.D.size() > 0) {
            android.view.View view2 = this.L;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view3 = this.M;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.LinkedList linkedList = xn6Var.D;
            r45.x56 x56Var = (r45.x56) linkedList.get(0);
            this.N.setTag(x56Var);
            this.Q.setText(x56Var.f389796e);
            this.Q.setVisibility(0);
            android.view.View view4 = this.N;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.S.setVisibility(8);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(x56Var.f389802n)) {
                n11.a.b().h(x56Var.f389802n, this.S, wm4.u.f447310b);
                this.S.setVisibility(0);
            }
            if (linkedList.size() > 1) {
                r45.x56 x56Var2 = (r45.x56) linkedList.get(1);
                this.P.setTag(x56Var2);
                this.R.setText(x56Var2.f389796e);
                this.R.setVisibility(0);
                android.view.View view5 = this.P;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.T.setVisibility(8);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(x56Var2.f389802n)) {
                    n11.a.b().h(x56Var2.f389802n, this.T, wm4.u.f447310b);
                    this.T.setVisibility(0);
                }
            } else {
                android.view.View view6 = this.P;
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(8);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.R.setVisibility(8);
            }
        } else {
            android.view.View view7 = this.L;
            if (view7 != null) {
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                arrayList7.add(8);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(view7, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view8 = this.M;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        B(xn6Var);
        if (this.f273598p1) {
            android.view.View view9 = this.M;
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            arrayList9.add(8);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(view9, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view10 = this.W;
        if (view10 != null && this.V != null && this.U != null) {
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            arrayList10.add(8);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(view10, arrayList10.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(view10, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.V.setVisibility(8);
            this.U.setVisibility(8);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(xn6Var.f390269t)) {
                this.V.setText(xn6Var.f390269t);
                this.V.setVisibility(0);
                if (fn4.z0.f(xn6Var)) {
                    android.view.View view11 = this.W;
                    java.util.ArrayList arrayList11 = new java.util.ArrayList();
                    arrayList11.add(0);
                    java.util.Collections.reverse(arrayList11);
                    yj0.a.d(view11, arrayList11.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view11.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
                    yj0.a.f(view11, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(xn6Var.C)) {
                    this.U.setImageResource(com.tencent.mm.R.drawable.bhm);
                } else {
                    n11.a.b().h(xn6Var.C, this.U, wm4.u.f447309a);
                }
                this.U.setVisibility(0);
            }
        }
        android.widget.TextView textView = this.f273597p0;
        if (textView != null) {
            textView.setText(xn6Var.f390255d);
        }
    }

    public void B(r45.xn6 xn6Var) {
        if ((xn6Var.L & 128) <= 0) {
            android.view.View view = this.F;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateWowUI", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateWowUI", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.F;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateWowUI", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateWowUI", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (xn6Var.R) {
            this.G.setImageResource(com.tencent.mm.R.raw.top_story_wow_selected);
            this.H.setTextColor(getResources().getColor(com.tencent.mm.R.color.a9b));
        } else {
            this.G.setImageResource(com.tencent.mm.R.raw.top_story_wow_unselected);
            this.H.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479549ab0));
        }
        this.H.setText(wm4.u.p(xn6Var.X));
    }

    @Override // com.tencent.mm.plugin.websearch.widget.WebSearchVideoPlayerSeekBar, com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar
    public int getBarPointWidth() {
        return this.f162475h.getWidth();
    }

    @Override // com.tencent.mm.plugin.websearch.widget.WebSearchVideoPlayerSeekBar, com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d1p;
    }

    public android.view.View getWowView() {
        return this.F;
    }

    @Override // fn4.h, com.tencent.mm.plugin.websearch.widget.WebSearchVideoPlayerSeekBar, com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar
    public void j() {
        super.j();
        this.I = this.f162472e.findViewById(com.tencent.mm.R.id.cgt);
        this.E = this.f162472e.findViewById(com.tencent.mm.R.id.msx);
        this.F = this.f162472e.findViewById(com.tencent.mm.R.id.poj);
        this.G = (android.widget.ImageView) this.f162472e.findViewById(com.tencent.mm.R.id.poi);
        this.H = (android.widget.TextView) this.f162472e.findViewById(com.tencent.mm.R.id.poh);
        this.f273595J = this.f162472e.findViewById(com.tencent.mm.R.id.f486474lc1);
        this.K = this.f162472e.findViewById(com.tencent.mm.R.id.f486473lc0);
        this.L = this.f162472e.findViewById(com.tencent.mm.R.id.nwl);
        this.M = this.f162472e.findViewById(com.tencent.mm.R.id.avu);
        this.N = this.f162472e.findViewById(com.tencent.mm.R.id.nvx);
        this.P = this.f162472e.findViewById(com.tencent.mm.R.id.f487209nw1);
        this.Q = (android.widget.TextView) this.f162472e.findViewById(com.tencent.mm.R.id.nvy);
        this.R = (android.widget.TextView) this.f162472e.findViewById(com.tencent.mm.R.id.f487210nw2);
        this.S = (android.widget.ImageView) this.f162472e.findViewById(com.tencent.mm.R.id.nvw);
        this.T = (android.widget.ImageView) this.f162472e.findViewById(com.tencent.mm.R.id.f487208nw0);
        this.U = (android.widget.ImageView) this.f162472e.findViewById(com.tencent.mm.R.id.ne8);
        this.V = (android.widget.TextView) this.f162472e.findViewById(com.tencent.mm.R.id.nec);
        this.W = this.f162472e.findViewById(com.tencent.mm.R.id.ne7);
        this.f273597p0 = (android.widget.TextView) this.f162472e.findViewById(com.tencent.mm.R.id.odf);
    }

    @Override // com.tencent.mm.plugin.websearch.widget.WebSearchVideoPlayerSeekBar, com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar
    public void m() {
        r45.xn6 xn6Var;
        super.m();
        gn4.b0 b0Var = this.f273596l1;
        if (b0Var == null || (xn6Var = this.f273600y0) == null) {
            return;
        }
        int i17 = this.f162480p;
        int videoTotalTime = getVideoTotalTime();
        gn4.z zVar = ((gn4.n) b0Var).f273641a;
        int width = videoTotalTime > 0 ? (zVar.f264527y.getWidth() * i17) / videoTotalTime : 0;
        rm4.d dVar = zVar.getFSVideoUIComponent().o4().f264479f;
        if (dVar != null && dVar.f397455d < zVar.getFSVideoUIComponent().I2().c()) {
            dVar.f397455d = zVar.getFSVideoUIComponent().I2().c();
        }
        fn4.b bVar = zVar.A;
        if (bVar.I2().d()) {
            int c17 = bVar.I2().c() / 1000;
            if (((wm4.p) i95.n0.c(wm4.p.class)).f447299f.containsKey(xn6Var.f390259h)) {
                ((wm4.p) i95.n0.c(wm4.p.class)).f447299f.put(xn6Var.f390259h, java.lang.Integer.valueOf(c17));
            }
        }
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) zVar.f264526x.getLayoutParams();
        layoutParams.width = width;
        zVar.f264526x.setLayoutParams(layoutParams);
        zVar.f264526x.requestLayout();
        if (!(zVar.G.getVisibility() == 0)) {
            zVar.G.w();
        }
        if ((xn6Var.L & 256) <= 0) {
            bVar.g1(xn6Var, zVar, i17, videoTotalTime);
        }
        bVar.v6(xn6Var, zVar, i17, videoTotalTime);
    }

    public void setOnUpdateProgressLenListener(gn4.b0 b0Var) {
        this.f273596l1 = b0Var;
    }

    public void setOnlyFS(boolean z17) {
        this.f273598p1 = z17;
    }

    public void setShareBtnClickListener(android.view.View.OnClickListener onClickListener) {
        this.E.setOnClickListener(onClickListener);
    }

    public void setSourceItemClickListener(android.view.View.OnClickListener onClickListener) {
        android.widget.TextView textView = this.V;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
        android.widget.ImageView imageView = this.U;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
        android.view.View view = this.W;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    public void setTagBtnClickListener(android.view.View.OnClickListener onClickListener) {
        this.N.setOnClickListener(onClickListener);
        this.P.setOnClickListener(onClickListener);
    }

    public void setTitleClickListener(android.view.View.OnClickListener onClickListener) {
        this.f273597p0.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        gn4.b0 b0Var;
        super.setVisibility(i17);
        if (i17 != 8 && i17 != 4) {
            if (i17 != 0 || (b0Var = this.f273596l1) == null) {
                return;
            }
            ((gn4.n) b0Var).f273641a.f264525w.setVisibility(8);
            return;
        }
        gn4.b0 b0Var2 = this.f273596l1;
        if (b0Var2 != null) {
            gn4.z zVar = ((gn4.n) b0Var2).f273641a;
            if (zVar.getFSVideoUIComponent().I2().f264576e && (zVar.getFSVideoUIComponent().I2().d() || zVar.getFSVideoUIComponent().I2().f264577f)) {
                zVar.f264525w.setVisibility(0);
            } else {
                zVar.f264525w.setVisibility(8);
            }
        }
    }

    public void setWowBtnClickListener(android.view.View.OnClickListener onClickListener) {
        android.view.View view = this.F;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "setWowBtnClickListener", "(Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "setWowBtnClickListener", "(Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.F.setOnClickListener(onClickListener);
    }

    @Override // fn4.h
    public void w() {
        setVisibility(8);
    }

    @Override // fn4.h
    public void x() {
        setVisibility(0);
        this.f162476i.setVisibility(0);
        if (this.f273599x0 == null) {
            this.f273599x0 = new com.tencent.mm.sdk.platformtools.b4(new gn4.a0(this), false);
        }
        this.f273599x0.d();
        this.f273599x0.c(2000L, 2000L);
    }

    public void y() {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f273599x0;
        if (b4Var != null) {
            b4Var.d();
            this.f273599x0.c(2000L, 2000L);
        }
    }

    public void z() {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f273599x0;
        if (b4Var != null) {
            b4Var.d();
        }
    }
}
