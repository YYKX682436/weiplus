package qt2;

/* loaded from: classes2.dex */
public final class b0 extends qt2.j implements cw2.ea {

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f366548r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ProgressBar f366549s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f366550t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f366551u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.model.BaseFinderFeed f366552v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f366553w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.Runnable f366554x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f366548r = "Finder.ShareGuideNextUIC";
    }

    public static final void a7(qt2.b0 b0Var, int i17) {
        androidx.recyclerview.widget.RecyclerView recyclerView = b0Var.f366590g;
        if (recyclerView != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(1);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/share/FinderShareGuideNextUIC", "scrollToNext", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            recyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/share/FinderShareGuideNextUIC", "scrollToNext", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
        com.tencent.mars.xlog.Log.i(b0Var.f366548r, "[doPullDown]");
        b0Var.c7(0L);
        com.tencent.mm.plugin.finder.report.y3.b(com.tencent.mm.plugin.finder.report.y3.f125472a, b0Var.getActivity(), i17, null, 4, null);
        b0Var.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clear() {
        androidx.recyclerview.widget.k3 p07;
        android.view.View view;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f366590g;
        if (recyclerView == null || (p07 = recyclerView.p0(0)) == null || (view = p07.itemView) == null) {
            return;
        }
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.e_k);
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = findViewById instanceof com.tencent.mm.plugin.finder.video.FinderVideoLayout ? (com.tencent.mm.plugin.finder.video.FinderVideoLayout) findViewById : null;
        if (finderVideoLayout != null) {
            finderVideoLayout.T(this);
        }
    }

    @Override // qt2.j
    public int Q6() {
        return com.tencent.mm.R.id.aue;
    }

    @Override // qt2.j
    public void R6(java.util.List feeds) {
        kotlin.jvm.internal.o.g(feeds, "feeds");
        this.f366595o = feeds;
        if (feeds.size() > 1) {
            java.lang.Object obj = feeds.get(1);
            this.f366552v = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
        }
    }

    @Override // qt2.j
    public void S6(androidx.recyclerview.widget.RecyclerView recyclerView) {
        com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout;
        androidx.recyclerview.widget.k3 p07;
        android.view.View view;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        super.S6(recyclerView);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f366590g;
        if (recyclerView2 != null && (p07 = recyclerView2.p0(0)) != null && (view = p07.itemView) != null) {
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.e_k);
            com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = findViewById instanceof com.tencent.mm.plugin.finder.video.FinderVideoLayout ? (com.tencent.mm.plugin.finder.video.FinderVideoLayout) findViewById : null;
            if (finderVideoLayout != null) {
                finderVideoLayout.t(this);
            }
            this.f366550t = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.g99);
            this.f366551u = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.dq6);
            int[] iArr = new int[2];
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f366550t;
            if (weImageView != null) {
                weImageView.getLocationInWindow(iArr);
            }
            int i17 = iArr[0];
            int i18 = iArr[1];
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f366551u;
            if (weImageView2 != null) {
                weImageView2.setVisibility(4);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.f366551u;
            java.lang.Object layoutParams = weImageView3 != null ? weImageView3.getLayoutParams() : null;
            android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.leftMargin = i17;
                layoutParams2.topMargin = i18;
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = this.f366551u;
                if (weImageView4 != null) {
                    weImageView4.setLayoutParams(layoutParams2);
                }
            }
            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = this.f366593m;
            if (finderFullSeekBarLayout != null) {
                finderFullSeekBarLayout.setFakeFloatPlayIcon(this.f366551u);
            }
        }
        android.view.View view2 = this.f366588e;
        if (view2 == null || (roundCornerRelativeLayout = (com.tencent.mm.ui.widget.RoundCornerRelativeLayout) view2.findViewById(com.tencent.mm.R.id.gvv)) == null) {
            return;
        }
        roundCornerRelativeLayout.setOnClickListener(qt2.y.f366629d);
    }

    @Override // qt2.j
    public void U6() {
        super.U6();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f366552v;
        if (!(baseFinderFeed != null && 2 == baseFinderFeed.h()) && this.f366553w) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f366550t;
            if (!(weImageView != null && weImageView.getVisibility() == 0)) {
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f366550t;
                if (weImageView2 != null) {
                    weImageView2.setVisibility(0);
                }
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.f366550t;
                if (weImageView3 != null) {
                    weImageView3.setAlpha(1.0f);
                }
            }
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = this.f366551u;
        if (weImageView4 != null) {
            weImageView4.setVisibility(8);
        }
        com.tencent.mars.xlog.Log.i(this.f366548r, "[hide]");
    }

    @Override // qt2.j
    public void V6(float f17) {
        super.V6(f17);
        c7(0L);
    }

    @Override // qt2.j
    public boolean X6() {
        boolean z17;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127708g3).getValue()).r()).intValue() != 1) {
            return false;
        }
        androidx.appcompat.app.AppCompatActivity context = getActivity();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        int integer = nyVar != null ? nyVar.V6().getInteger(5) : 0;
        if (!(integer == 25 || integer == 38)) {
            return false;
        }
        java.util.List list = this.f366595o;
        if (list != null && list.size() > 1) {
            java.lang.Object obj = list.get(0);
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
            if (!((((baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (feedObject2 = feedObject.getFeedObject()) == null) ? 0 : feedObject2.getPermissionFlag()) & 256) != 0)) {
                z17 = true;
                return z17 && hc2.e.a();
            }
        }
        z17 = false;
        if (z17) {
            return false;
        }
    }

    @Override // qt2.j
    public void Y6() {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        java.lang.String sb6;
        boolean z17 = this.f366589f;
        java.lang.String str = this.f366548r;
        if (z17 || T6()) {
            com.tencent.mars.xlog.Log.i(str, "[show] return due to isShowing:" + this.f366589f + " or isNotAllow:false");
            return;
        }
        android.view.View view = this.f366588e;
        android.widget.ImageView imageView = view != null ? (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.gvx) : null;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f366552v;
        if (baseFinderFeed != null && (feedObject = baseFinderFeed.getFeedObject()) != null && (feedObject2 = feedObject.getFeedObject()) != null && (objectDesc = feedObject2.getObjectDesc()) != null && (media = objectDesc.getMedia()) != null && media.size() > 0) {
            java.lang.String coverUrl = media.get(0).getCoverUrl();
            if (coverUrl == null || coverUrl.length() == 0) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(media.get(0).getThumbUrl());
                java.lang.String thumb_url_token = media.get(0).getThumb_url_token();
                if (thumb_url_token == null) {
                    thumb_url_token = "";
                }
                sb7.append(thumb_url_token);
                sb6 = sb7.toString();
            } else {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append(media.get(0).getCoverUrl());
                java.lang.String cover_url_token = media.get(0).getCover_url_token();
                if (cover_url_token == null) {
                    cover_url_token = "";
                }
                sb8.append(cover_url_token);
                sb6 = sb8.toString();
            }
            if (imageView != null) {
                mn2.g1 g1Var = mn2.g1.f329975a;
                g1Var.e().b(new mn2.q3(sb6, com.tencent.mm.plugin.finder.storage.y90.f128356f), g1Var.h(mn2.f1.f329970x)).c(imageView);
            }
        }
        if (imageView != null) {
            imageView.setOnClickListener(new qt2.x(this));
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = this.f366552v;
        if (baseFinderFeed2 != null) {
            android.app.Activity context = getContext();
            android.view.View view2 = this.f366588e;
            android.widget.TextView textView = view2 != null ? (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.gvw) : null;
            if (textView != null) {
                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2 = baseFinderFeed2.getFeedObject().getFeedObject().getObjectDesc();
                java.util.LinkedList<r45.cw2> short_title = objectDesc2 != null ? objectDesc2.getShort_title() : null;
                android.text.SpannableString flowCardDescSpan = baseFinderFeed2.getFeedObject().getFlowCardDescSpan();
                if (flowCardDescSpan == null || flowCardDescSpan.length() == 0) {
                    if (short_title != null && (short_title.isEmpty() ^ true)) {
                        textView.setVisibility(0);
                        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                        java.lang.String string = ((r45.cw2) kz5.n0.X(short_title)).getString(0);
                        ((ke0.e) xVar).getClass();
                        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, string));
                    } else if (com.tencent.mm.sdk.platformtools.t8.K0(baseFinderFeed2.getFeedObject().getDescription())) {
                        textView.setVisibility(8);
                        textView.setText("");
                    } else {
                        textView.setVisibility(0);
                        textView.setText(baseFinderFeed2.getFeedObject().getDescriptionSpan());
                    }
                } else {
                    textView.setVisibility(0);
                    textView.setText(baseFinderFeed2.getFeedObject().getFlowCardDescSpan());
                }
                com.tencent.mm.ui.fk.a(textView);
                textView.setOnClickListener(new qt2.a0(this));
            }
        }
        android.view.View view3 = this.f366588e;
        android.view.View findViewById = view3 != null ? view3.findViewById(com.tencent.mm.R.id.gvu) : null;
        if (findViewById != null) {
            findViewById.setOnClickListener(new qt2.w(this));
        }
        android.view.View view4 = this.f366588e;
        android.widget.ImageView imageView2 = view4 != null ? (android.widget.ImageView) view4.findViewById(com.tencent.mm.R.id.age) : null;
        android.view.View view5 = this.f366588e;
        android.widget.ImageView imageView3 = view5 != null ? (android.widget.ImageView) view5.findViewById(com.tencent.mm.R.id.agq) : null;
        um5.d dVar = new um5.d();
        int b17 = com.tencent.mm.ui.bh.a(getContext()).f197135a - i65.a.b(getContext(), 32);
        int b18 = i65.a.b(getContext(), 122);
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(b18));
        arrayList.add(java.lang.Integer.valueOf(b17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/share/FinderShareGuideNextUIC", "initBlur", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/finder/share/FinderShareGuideNextUIC", "initBlur", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        createBitmap.eraseColor(android.graphics.Color.parseColor("#61F0F0F0"));
        dVar.b(createBitmap);
        dVar.f429141b = b17;
        dVar.f429142c = b18;
        uq5.b b19 = dVar.f429144e.f429193b.b();
        b19.d(20.0f);
        b19.e(5.0f);
        dVar.a(new qt2.v(imageView2));
        if (imageView3 != null) {
            imageView3.setImageDrawable(new android.graphics.drawable.ColorDrawable(getResources().getColor(com.tencent.mm.R.color.f478500k)));
        }
        if (this.f366588e != null) {
            W6(i65.a.b(getContext(), 176), 300L);
        }
        com.tencent.mm.plugin.finder.report.y3.b(com.tencent.mm.plugin.finder.report.y3.f125472a, getActivity(), 3, null, 4, null);
        android.view.View view6 = this.f366588e;
        android.widget.ProgressBar progressBar = view6 != null ? (android.widget.ProgressBar) view6.findViewById(com.tencent.mm.R.id.gvy) : null;
        this.f366549s = progressBar;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        this.f366589f = true;
        com.tencent.mars.xlog.Log.i(str, "[show]");
    }

    public final void b7() {
        com.tencent.mars.xlog.Log.i(this.f366548r, "[forbidToShow]");
    }

    public final void c7(long j17) {
        android.view.View view = this.f366588e;
        if (view != null) {
            view.removeCallbacks(this.f366554x);
        }
        qt2.z zVar = new qt2.z(this);
        this.f366554x = zVar;
        android.view.View view2 = this.f366588e;
        if (view2 != null) {
            view2.postDelayed(zVar, j17);
        }
    }

    @Override // qt2.j
    public java.lang.String getTag() {
        return this.f366548r;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        android.view.View view = this.f366588e;
        if (view != null) {
            view.removeCallbacks(this.f366554x);
        }
        clear();
    }

    @Override // cw2.ea
    public void onVideoPause() {
        this.f366553w = true;
        android.widget.ProgressBar progressBar = this.f366549s;
        if (progressBar == null || progressBar.getVisibility() != 0) {
            return;
        }
        progressBar.setVisibility(8);
        android.view.View view = this.f366588e;
        if (view != null) {
            view.removeCallbacks(this.f366554x);
        }
    }

    @Override // cw2.ea
    public void onVideoPlay() {
        this.f366553w = false;
    }

    @Override // cw2.ea
    public void p4(long j17, long j18) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f366548r = "Finder.ShareGuideNextUIC";
    }
}
