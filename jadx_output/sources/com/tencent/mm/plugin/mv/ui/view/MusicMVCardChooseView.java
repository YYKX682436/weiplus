package com.tencent.mm.plugin.mv.ui.view;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003\u000e\u000f\u0010B\u001b\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB#\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/view/MusicMVCardChooseView;", "Landroid/widget/RelativeLayout;", "Ltj5/n;", "Lcom/tencent/mm/plugin/mv/ui/view/j;", "Lt23/m1;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/tencent/mm/plugin/mv/ui/view/b0", "com/tencent/mm/plugin/mv/ui/view/c0", "com/tencent/mm/plugin/mv/ui/view/d0", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MusicMVCardChooseView extends android.widget.RelativeLayout implements tj5.n, com.tencent.mm.plugin.mv.ui.view.j, t23.m1 {
    public static int B1 = 0;
    public static int C1 = 2000;
    public int A;
    public final yz5.a A1;
    public com.tencent.mm.ui.MMActivity B;
    public boolean C;
    public boolean D;
    public final com.tencent.mm.plugin.mv.ui.view.t0 E;
    public final bm3.a F;
    public com.tencent.mm.plugin.mv.ui.view.b0 G;
    public final java.util.ArrayList H;
    public dm.i8 I;

    /* renamed from: J, reason: collision with root package name */
    public final com.tencent.mm.plugin.mv.ui.view.z0 f151618J;
    public final java.lang.String K;
    public final com.tencent.mm.plugin.mv.ui.view.g0 L;
    public final com.tencent.mm.plugin.mv.ui.view.h0 M;
    public final km3.k N;
    public boolean P;
    public int Q;
    public int R;
    public int S;
    public t23.p1 T;
    public boolean U;
    public final int V;
    public int W;

    /* renamed from: d, reason: collision with root package name */
    public com.google.android.material.tabs.TabLayout f151619d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f151620e;

    /* renamed from: f, reason: collision with root package name */
    public km3.t f151621f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f151622g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.RelativeLayout f151623h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.RelativeLayout f151624i;

    /* renamed from: l1, reason: collision with root package name */
    public int f151625l1;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f151626m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f151627n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.mv.ui.view.FTSSearchNoActionBarView f151628o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.mv.ui.view.MusicMvTabSearchFragment f151629p;

    /* renamed from: p0, reason: collision with root package name */
    public android.app.ProgressDialog f151630p0;

    /* renamed from: p1, reason: collision with root package name */
    public int f151631p1;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f151632q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.LinearLayout f151633r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.LinearLayout f151634s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.LinearLayout f151635t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.LinearLayout f151636u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.LinearLayout f151637v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.mv.ui.view.MusicMvTabMachineFragment f151638w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyPostFragment f151639x;

    /* renamed from: x0, reason: collision with root package name */
    public volatile long f151640x0;

    /* renamed from: x1, reason: collision with root package name */
    public int f151641x1;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyFavFragment f151642y;

    /* renamed from: y0, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.mv.ui.view.c0 f151643y0;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f151644y1;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyLikeFragment f151645z;

    /* renamed from: z1, reason: collision with root package name */
    public kotlinx.coroutines.r2 f151646z1;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MusicMVCardChooseView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public static final void a(com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView musicMVCardChooseView, int i17) {
        com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyLikeFragment musicMvTabMyLikeFragment;
        com.tencent.mm.plugin.mv.ui.view.MusicMvTabMachineFragment musicMvTabMachineFragment = musicMVCardChooseView.f151638w;
        if (musicMvTabMachineFragment != null) {
            musicMvTabMachineFragment.setVisibility(8);
        }
        com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyPostFragment musicMvTabMyPostFragment = musicMVCardChooseView.f151639x;
        if (musicMvTabMyPostFragment != null) {
            musicMvTabMyPostFragment.setVisibility(8);
        }
        com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyFavFragment musicMvTabMyFavFragment = musicMVCardChooseView.f151642y;
        if (musicMvTabMyFavFragment != null) {
            musicMvTabMyFavFragment.setVisibility(8);
        }
        com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyLikeFragment musicMvTabMyLikeFragment2 = musicMVCardChooseView.f151645z;
        if (musicMvTabMyLikeFragment2 != null) {
            musicMvTabMyLikeFragment2.setVisibility(8);
        }
        if (i17 == 0) {
            com.tencent.mm.plugin.mv.ui.view.MusicMvTabMachineFragment musicMvTabMachineFragment2 = musicMVCardChooseView.f151638w;
            if (musicMvTabMachineFragment2 == null) {
                return;
            }
            musicMvTabMachineFragment2.setVisibility(0);
            return;
        }
        if (i17 == 1) {
            com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyPostFragment musicMvTabMyPostFragment2 = musicMVCardChooseView.f151639x;
            if (musicMvTabMyPostFragment2 == null) {
                return;
            }
            musicMvTabMyPostFragment2.setVisibility(0);
            return;
        }
        if (i17 != 2) {
            if (i17 == 3 && (musicMvTabMyLikeFragment = musicMVCardChooseView.f151645z) != null) {
                musicMvTabMyLikeFragment.setVisibility(0);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyFavFragment musicMvTabMyFavFragment2 = musicMVCardChooseView.f151642y;
        if (musicMvTabMyFavFragment2 == null) {
            return;
        }
        musicMvTabMyFavFragment2.setVisibility(0);
    }

    public static final void b(com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView musicMVCardChooseView, int i17) {
        bm3.a aVar = musicMVCardChooseView.F;
        android.widget.TextView textView = aVar.f22490d;
        if (textView != null) {
            textView.setTextColor(musicMVCardChooseView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
        }
        android.widget.TextView textView2 = aVar.f22492f;
        if (textView2 != null) {
            textView2.setTextColor(musicMVCardChooseView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
        }
        android.widget.TextView textView3 = aVar.f22489c;
        if (textView3 != null) {
            textView3.setTextColor(musicMVCardChooseView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
        }
        android.widget.TextView textView4 = aVar.f22491e;
        if (textView4 != null) {
            textView4.setTextColor(musicMVCardChooseView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
        }
        if (i17 == 0) {
            android.widget.TextView textView5 = aVar.f22490d;
            if (textView5 != null) {
                textView5.setTextColor(musicMVCardChooseView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_9));
                return;
            }
            return;
        }
        if (i17 == 1) {
            if (textView2 != null) {
                textView2.setTextColor(musicMVCardChooseView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_9));
            }
        } else if (i17 == 2) {
            if (textView3 != null) {
                textView3.setTextColor(musicMVCardChooseView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_9));
            }
        } else if (i17 == 3 && textView4 != null) {
            textView4.setTextColor(musicMVCardChooseView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_9));
        }
    }

    public static /* synthetic */ void j(com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView musicMVCardChooseView, boolean z17, yz5.l lVar, yz5.a aVar, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            lVar = null;
        }
        if ((i17 & 4) != 0) {
            aVar = null;
        }
        musicMVCardChooseView.i(z17, lVar, aVar);
    }

    public static /* synthetic */ void r(com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView musicMVCardChooseView, int i17, int i18, boolean z17, yz5.l lVar, yz5.a aVar, int i19, java.lang.Object obj) {
        if ((i19 & 4) != 0) {
            z17 = true;
        }
        musicMVCardChooseView.q(i17, i18, z17, (i19 & 8) != 0 ? null : lVar, (i19 & 16) != 0 ? null : aVar);
    }

    @Override // tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        java.lang.String str3;
        if (str == null || (str3 = r26.n0.u0(str).toString()) == null) {
            str3 = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMVCardChooseView", str3);
    }

    @Override // tj5.n
    public boolean G0() {
        java.lang.String str;
        com.tencent.mm.ui.search.FTSEditTextView ftsEditText;
        com.tencent.mm.ui.search.FTSEditTextView ftsEditText2;
        java.lang.String totalQuery;
        com.tencent.mm.plugin.mv.ui.view.FTSSearchNoActionBarView fTSSearchNoActionBarView = this.f151628o;
        if (fTSSearchNoActionBarView == null || (ftsEditText2 = fTSSearchNoActionBarView.getFtsEditText()) == null || (totalQuery = ftsEditText2.getTotalQuery()) == null || (str = r26.n0.u0(totalQuery).toString()) == null) {
            str = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return true;
        }
        com.tencent.mm.plugin.mv.ui.view.MusicMvTabSearchFragment musicMvTabSearchFragment = this.f151629p;
        if (musicMvTabSearchFragment != null) {
            musicMvTabSearchFragment.setResultView(8);
        }
        android.widget.TextView textView = this.f151632q;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout = this.f151633r;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        com.tencent.mm.plugin.mv.ui.view.MusicMvTabSearchFragment musicMvTabSearchFragment2 = this.f151629p;
        if (musicMvTabSearchFragment2 != null) {
            musicMvTabSearchFragment2.getRlLayout().setHasBottomMore(true);
            android.widget.TextView loadingTv = musicMvTabSearchFragment2.getLoadingTv();
            if (loadingTv != null) {
                loadingTv.setVisibility(8);
            }
            android.view.View f213435x = musicMvTabSearchFragment2.getRlLayout().getF213435x();
            if (f213435x != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(f213435x, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/view/MusicMvTabSearchFragment", "initSearch", "(Lcom/tencent/mm/autogen/table/BaseMusic;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                f213435x.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(f213435x, "com/tencent/mm/plugin/mv/ui/view/MusicMvTabSearchFragment", "initSearch", "(Lcom/tencent/mm/autogen/table/BaseMusic;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View f213435x2 = musicMvTabSearchFragment2.getRlLayout().getF213435x();
            android.widget.TextView textView2 = f213435x2 != null ? (android.widget.TextView) f213435x2.findViewById(com.tencent.mm.R.id.ili) : null;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            musicMvTabSearchFragment2.f151733y = java.util.UUID.randomUUID().toString();
            musicMvTabSearchFragment2.f151732x = null;
            musicMvTabSearchFragment2.f151731w = 0;
            musicMvTabSearchFragment2.getDataList().clear();
            musicMvTabSearchFragment2.c(null, str);
        }
        com.tencent.mm.plugin.mv.ui.view.FTSSearchNoActionBarView fTSSearchNoActionBarView2 = this.f151628o;
        if (fTSSearchNoActionBarView2 != null && (ftsEditText = fTSSearchNoActionBarView2.getFtsEditText()) != null) {
            ftsEditText.h();
        }
        return true;
    }

    @Override // tj5.n
    public void U1(boolean z17) {
        if (z17) {
            n();
            if (h()) {
                o();
            } else {
                j(this, false, null, new com.tencent.mm.plugin.mv.ui.view.s0(this), 2, null);
            }
        }
    }

    public final void c() {
        this.C = false;
        com.google.android.material.tabs.TabLayout tabLayout = this.f151619d;
        if (tabLayout != null) {
            tabLayout.t(i65.a.d(this.B, com.tencent.mm.R.color.BW_100_Alpha_0_2), i65.a.d(this.B, com.tencent.mm.R.color.BW_100_Alpha_0_5));
        }
        com.google.android.material.tabs.TabLayout tabLayout2 = this.f151619d;
        if (tabLayout2 != null) {
            tabLayout2.setSelectedTabIndicatorColor(i65.a.d(this.B, com.tencent.mm.R.color.BW_100_Alpha_0_5));
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f151626m;
        if (weImageView != null) {
            weImageView.r(-1, 0.5f);
        }
    }

    public final void d() {
        this.C = true;
        com.google.android.material.tabs.TabLayout tabLayout = this.f151619d;
        if (tabLayout != null) {
            tabLayout.t(i65.a.d(this.B, com.tencent.mm.R.color.BW_100_Alpha_0_5), i65.a.d(this.B, com.tencent.mm.R.color.BW_100_Alpha_0_9));
        }
        com.google.android.material.tabs.TabLayout tabLayout2 = this.f151619d;
        if (tabLayout2 != null) {
            tabLayout2.setSelectedTabIndicatorColor(i65.a.d(this.B, com.tencent.mm.R.color.BW_100_Alpha_0_9));
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f151626m;
        if (weImageView != null) {
            weImageView.r(-1, 1.0f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.C) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public final r45.nc5 e(com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment fragment) {
        kotlin.jvm.internal.o.g(fragment, "fragment");
        r45.nc5 nc5Var = new r45.nc5();
        nc5Var.f381246e = java.lang.String.valueOf(fragment.getType());
        int i17 = 0;
        for (java.lang.Object obj : fragment.getAllDataList()) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.plugin.mv.ui.view.q3 q3Var = (com.tencent.mm.plugin.mv.ui.view.q3) obj;
            java.util.LinkedList linkedList = nc5Var.f381245d;
            r45.mc5 mc5Var = new r45.mc5();
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = q3Var.f151927d.f151952b;
            mc5Var.f380363d = pm0.v.u(finderObject != null ? finderObject.getId() : 0L);
            mc5Var.f380365f = q3Var.f151927d.f151952b;
            mc5Var.f380364e = 3;
            linkedList.add(mc5Var);
            i17 = i18;
        }
        return nc5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0134, code lost:
    
        if (r7 != 3) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r45.oc5 f(java.lang.String r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView.f(java.lang.String, java.lang.String):r45.oc5");
    }

    public final void g(java.util.List list) {
        java.lang.System.currentTimeMillis();
        list.size();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next();
            if (!com.tencent.mm.vfs.w6.j(galleryItem$MediaItem.f138430e)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Mv.MusicMVCardChooseView", "filter non exist media: %s.", galleryItem$MediaItem.f138430e);
                linkedList.add(galleryItem$MediaItem);
            }
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            list.remove((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it6.next());
        }
        java.lang.System.currentTimeMillis();
    }

    public final boolean h() {
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (context instanceof androidx.appcompat.app.AppCompatActivity) {
            return ((com.tencent.mm.plugin.mv.ui.uic.c3) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.mv.ui.uic.c3.class)).P6();
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }

    public final void i(boolean z17, yz5.l lVar, yz5.a aVar) {
        com.tencent.mm.ui.search.FTSEditTextView ftsEditText;
        com.tencent.mm.ui.search.FTSEditTextView ftsEditText2;
        boolean z18 = this.f151644y1;
        if (!z18 && z17) {
            this.D = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMVCardChooseView", "onModeChanged, change2Min:true, hideSearchResultPanel");
            com.tencent.mm.plugin.mv.ui.view.FTSSearchNoActionBarView fTSSearchNoActionBarView = this.f151628o;
            if (fTSSearchNoActionBarView != null && (ftsEditText2 = fTSSearchNoActionBarView.getFtsEditText()) != null) {
                ftsEditText2.d();
            }
            com.tencent.mm.plugin.mv.ui.view.FTSSearchNoActionBarView fTSSearchNoActionBarView2 = this.f151628o;
            if (fTSSearchNoActionBarView2 != null && (ftsEditText = fTSSearchNoActionBarView2.getFtsEditText()) != null) {
                ftsEditText.h();
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f151622g;
            if (weImageView != null) {
                weImageView.setVisibility(8);
            }
            com.google.android.material.tabs.TabLayout tabLayout = this.f151619d;
            if (tabLayout != null) {
                tabLayout.animate().translationX(0.0f).setDuration(300L).start();
            }
            q(this.f151631p1, this.f151625l1, true, lVar, new com.tencent.mm.plugin.mv.ui.view.w0(aVar, this));
        } else if (!z18 || z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMVCardChooseView", "onModeChanged, else");
            if (aVar != null) {
                aVar.invoke();
            }
        } else {
            this.D = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMVCardChooseView", "onModeChanged, change2Min:false");
            int b17 = (this.A / 2) - i65.a.b(getContext(), 40);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f151622g;
            if (weImageView2 != null) {
                weImageView2.setVisibility(0);
            }
            com.google.android.material.tabs.TabLayout tabLayout2 = this.f151619d;
            if (tabLayout2 != null) {
                tabLayout2.animate().translationX((b17 - (tabLayout2.getWidth() / 2)) * 1.0f).setDuration(300L).start();
            }
            q(this.f151625l1, this.f151631p1, true, lVar, new com.tencent.mm.plugin.mv.ui.view.x0(aVar, this));
        }
        this.f151644y1 = z17;
    }

    public final void k() {
        ((lt0.i) kt0.g.a(kt0.g.f311913d)).a(1.0d);
        e60.b1 b1Var = (e60.b1) i95.n0.c(e60.b1.class);
        int i17 = this.V;
        ((o23.i) b1Var).getClass();
        o23.n nVar = o23.m.f342426a;
        nVar.getClass();
        nVar.f342427a = j33.o.f297450a.a(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMVCardChooseView", "start queryMediaInAlbums %s", this);
        ((t23.r0) ((t23.i1) i95.n0.c(t23.i1.class))).getClass();
        t23.p0.k().b(this);
        this.f151640x0 = java.lang.System.currentTimeMillis();
        t23.i1 i1Var = (t23.i1) i95.n0.c(t23.i1.class);
        long j17 = this.f151640x0;
        ((t23.r0) i1Var).getClass();
        t23.x1 k17 = t23.p0.k();
        k17.e("", k17.f415298g, j17);
        t23.q1 q1Var = (t23.q1) i95.n0.c(t23.q1.class);
        ((t23.a2) ((t23.q1) i95.n0.c(t23.q1.class))).getClass();
        ((t23.a2) q1Var).wi(new t23.s1());
        t23.q1 q1Var2 = (t23.q1) i95.n0.c(t23.q1.class);
        ((t23.a2) ((t23.q1) i95.n0.c(t23.q1.class))).getClass();
        ((t23.a2) q1Var2).wi(new t23.c2());
    }

    public final void l() {
        com.tencent.mm.ui.MMActivity mMActivity;
        int i17;
        java.lang.String str;
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        com.tencent.mm.ui.MMActivity mMActivity2 = this.B;
        java.lang.String[] strArr = {"android.permission.READ_EXTERNAL_STORAGE"};
        java.lang.String string = mMActivity2 != null ? mMActivity2.getString(com.tencent.mm.R.string.hht) : null;
        if (android.os.Build.VERSION.SDK_INT < 33) {
            mMActivity = this.B;
            if (mMActivity != null) {
                i17 = com.tencent.mm.R.string.h5a;
                str = mMActivity.getString(i17);
            }
            str = null;
        } else {
            mMActivity = this.B;
            if (mMActivity != null) {
                i17 = com.tencent.mm.R.string.mui;
                str = mMActivity.getString(i17);
            }
            str = null;
        }
        boolean Di = ((sb0.f) jVar).Di(mMActivity2, strArr, 145, string, str);
        this.U = Di;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMVCardChooseView", "checkPermission checkMediaStorage[%b]", java.lang.Boolean.valueOf(Di));
        this.f151643y0 = com.tencent.mm.plugin.mv.ui.view.c0.f151787d;
        android.content.Context context = getContext();
        android.content.Context context2 = getContext();
        this.f151630p0 = com.tencent.mm.ui.widget.dialog.u3.c(context, context2 != null ? context2.getString(com.tencent.mm.R.string.f490604zq) : null, false, 0, null);
        t23.r0 r0Var = (t23.r0) ((t23.i1) i95.n0.c(t23.i1.class));
        int i18 = this.V;
        r0Var.getClass();
        t23.p0.k().f415297f = i18;
        t23.i1 i1Var = (t23.i1) i95.n0.c(t23.i1.class);
        int i19 = this.W;
        ((t23.r0) i1Var).getClass();
        t23.p0.k().g(i19);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMVCardChooseView", "query source: " + i18 + ", queryType: " + this.W);
        if (this.U) {
            ((lt0.i) kt0.g.a(kt0.g.f311913d)).a(1.0d);
            e60.b1 b1Var = (e60.b1) i95.n0.c(e60.b1.class);
            int i27 = this.V;
            ((o23.i) b1Var).getClass();
            o23.n nVar = o23.m.f342426a;
            nVar.getClass();
            nVar.f342427a = j33.o.f297450a.a(i27);
            com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMVCardChooseView", "start queryMediaInAlbums %s", this);
            ((t23.r0) ((t23.i1) i95.n0.c(t23.i1.class))).getClass();
            t23.p0.k().b(this);
            this.f151640x0 = java.lang.System.currentTimeMillis();
            t23.i1 i1Var2 = (t23.i1) i95.n0.c(t23.i1.class);
            long j17 = this.f151640x0;
            ((t23.r0) i1Var2).getClass();
            t23.x1 k17 = t23.p0.k();
            k17.e("", k17.f415298g, j17);
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f151620e;
            if (recyclerView != null) {
                recyclerView.postDelayed(new com.tencent.mm.plugin.mv.ui.view.y0(this), 300L);
            }
            t23.q1 q1Var = (t23.q1) i95.n0.c(t23.q1.class);
            ((t23.a2) ((t23.q1) i95.n0.c(t23.q1.class))).getClass();
            ((t23.a2) q1Var).wi(new t23.s1());
            t23.q1 q1Var2 = (t23.q1) i95.n0.c(t23.q1.class);
            ((t23.a2) ((t23.q1) i95.n0.c(t23.q1.class))).getClass();
            ((t23.a2) q1Var2).wi(new t23.c2());
        }
    }

    public final void m() {
        android.widget.RelativeLayout relativeLayout = this.f151623h;
        if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
            android.widget.LinearLayout linearLayout = this.f151627n;
            if (linearLayout != null && linearLayout.getVisibility() == 8) {
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f151626m;
                if (weImageView == null) {
                    return;
                }
                weImageView.setVisibility(0);
                return;
            }
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f151626m;
        if (weImageView2 == null) {
            return;
        }
        weImageView2.setVisibility(4);
    }

    public final void n() {
        com.tencent.mm.ui.search.FTSEditTextView ftsEditText;
        com.tencent.mm.plugin.mv.ui.view.FTSSearchNoActionBarView fTSSearchNoActionBarView = this.f151628o;
        if (fTSSearchNoActionBarView != null && (ftsEditText = fTSSearchNoActionBarView.getFtsEditText()) != null) {
            ftsEditText.e();
        }
        com.tencent.mm.plugin.mv.ui.view.MusicMvTabSearchFragment musicMvTabSearchFragment = this.f151629p;
        if (musicMvTabSearchFragment != null) {
            musicMvTabSearchFragment.dataList.clear();
            musicMvTabSearchFragment.getAdapter().notifyDataSetChanged();
        }
        android.widget.LinearLayout linearLayout = this.f151627n;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        android.widget.RelativeLayout relativeLayout = this.f151624i;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        m();
    }

    public final void o() {
        com.tencent.mm.ui.search.FTSEditTextView ftsEditText;
        com.tencent.mm.ui.search.FTSEditTextView ftsEditText2;
        com.tencent.mm.plugin.mv.ui.view.FTSSearchNoActionBarView fTSSearchNoActionBarView = this.f151628o;
        if (fTSSearchNoActionBarView != null && (ftsEditText2 = fTSSearchNoActionBarView.getFtsEditText()) != null) {
            ftsEditText2.m();
        }
        com.tencent.mm.plugin.mv.ui.view.FTSSearchNoActionBarView fTSSearchNoActionBarView2 = this.f151628o;
        if (fTSSearchNoActionBarView2 == null || (ftsEditText = fTSSearchNoActionBarView2.getFtsEditText()) == null) {
            return;
        }
        ftsEditText.s();
    }

    @Override // tj5.n
    public void o3(int i17, tj5.x xVar) {
    }

    @Override // tj5.n
    public void onClickClearTextBtn(android.view.View view) {
        com.tencent.mm.plugin.mv.ui.view.MusicMvTabSearchFragment musicMvTabSearchFragment = this.f151629p;
        if (musicMvTabSearchFragment != null) {
            musicMvTabSearchFragment.dataList.clear();
            musicMvTabSearchFragment.getAdapter().notifyDataSetChanged();
        }
    }

    public final void p(boolean z17, int i17) {
        if (z17) {
            C1 = i17;
        } else {
            B1 = i17;
        }
        km3.t tVar = this.f151621f;
        if (tVar != null) {
            tVar.f309262f = i17;
            tVar.notifyDataSetChanged();
        }
        com.tencent.mm.plugin.mv.ui.view.MusicMvTabMachineFragment musicMvTabMachineFragment = this.f151638w;
        if (musicMvTabMachineFragment != null) {
            musicMvTabMachineFragment.setVideoDuration(i17);
        }
        com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyPostFragment musicMvTabMyPostFragment = this.f151639x;
        if (musicMvTabMyPostFragment != null) {
            musicMvTabMyPostFragment.setVideoDuration(i17);
        }
        com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyFavFragment musicMvTabMyFavFragment = this.f151642y;
        if (musicMvTabMyFavFragment != null) {
            musicMvTabMyFavFragment.setVideoDuration(i17);
        }
        com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyLikeFragment musicMvTabMyLikeFragment = this.f151645z;
        if (musicMvTabMyLikeFragment != null) {
            musicMvTabMyLikeFragment.setVideoDuration(i17);
        }
        com.tencent.mm.plugin.mv.ui.view.MusicMvTabSearchFragment musicMvTabSearchFragment = this.f151629p;
        if (musicMvTabSearchFragment != null) {
            musicMvTabSearchFragment.setVideoDuration(i17);
        }
    }

    public final void q(int i17, int i18, boolean z17, yz5.l lVar, yz5.a aVar) {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.cz9);
        if (findViewById != null) {
            if (z17) {
                android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(i17, i18);
                ofInt.addUpdateListener(new com.tencent.mm.plugin.mv.ui.view.d1(findViewById, lVar, i17, i18));
                ofInt.addListener(new com.tencent.mm.plugin.mv.ui.view.e1(aVar));
                ofInt.setDuration(300L);
                ofInt.start();
                return;
            }
            android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.height = i18;
            findViewById.setLayoutParams(layoutParams);
            if (lVar != null) {
                lVar.invoke(java.lang.Float.valueOf(1.0f));
            }
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    @Override // t23.m1
    public void u5(java.util.LinkedList linkedList, long j17, boolean z17) {
        if (j17 != this.f151640x0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Mv.MusicMVCardChooseView", "%s %s, not my query, ignore.", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(this.f151640x0));
            com.tencent.mars.xlog.Log.w("MicroMsg.Mv.MusicMVCardChooseView", "If you saw too mush this log, maybe user had too many photos. This can be optimized.");
            return;
        }
        if (linkedList == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Mv.MusicMVCardChooseView", "onQueryMediaFinished, null == mediaItems");
            return;
        }
        km3.t tVar = this.f151621f;
        if (tVar != null) {
            tVar.y();
        }
        linkedList.size();
        km3.t tVar2 = this.f151621f;
        if (tVar2 != null) {
            if (z17 || tVar2.y() > linkedList.size()) {
                g(linkedList);
            } else {
                java.util.List subList = linkedList.subList(tVar2.y(), linkedList.size());
                kotlin.jvm.internal.o.f(subList, "subList(...)");
                g(subList);
            }
            com.tencent.mm.plugin.mv.ui.view.b0 b0Var = this.G;
            if (b0Var != null) {
                ((ku5.t0) ku5.t0.f312615d).g(new jm3.r0((com.tencent.mm.plugin.mv.ui.MusicMvMakerUI) b0Var, new java.util.LinkedList(linkedList)));
            }
            java.util.LinkedList linkedList2 = new java.util.LinkedList(linkedList);
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf(this.f151621f == null);
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            objArr[1] = com.tencent.mm.sdk.platformtools.z3.b(true);
            com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMVCardChooseView", "[onQueryMediaFinished] adapter is null?:%s %s", objArr);
            if (this.f151621f != null) {
                com.tencent.mm.plugin.mv.ui.view.d0 d0Var = new com.tencent.mm.plugin.mv.ui.view.d0(this);
                d0Var.f151797d = new java.lang.ref.WeakReference(this.f151621f);
                d0Var.f151798e = new java.lang.ref.WeakReference(this.f151630p0);
                d0Var.f151799f = new java.lang.ref.WeakReference(this.f151620e);
                d0Var.f151800g = linkedList2;
                d0Var.f151801h = z17;
                if (com.tencent.mm.plugin.mv.ui.view.c0.f151787d == this.f151643y0) {
                    this.f151643y0 = com.tencent.mm.plugin.mv.ui.view.c0.f151788e;
                }
                ((t23.r0) ((t23.i1) i95.n0.c(t23.i1.class))).getClass();
                t23.p0.n().c(d0Var);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicMVCardChooseView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.C = true;
        this.E = new com.tencent.mm.plugin.mv.ui.view.t0(this);
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.c4n, (android.view.ViewGroup) this, false);
        addView(inflate);
        int i18 = com.tencent.mm.R.id.f482819os;
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) x4.b.a(inflate, com.tencent.mm.R.id.f482819os);
        if (recyclerView != null) {
            i18 = com.tencent.mm.R.id.f483758bz2;
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(inflate, com.tencent.mm.R.id.f483758bz2);
            if (weImageView != null) {
                android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) inflate;
                i18 = com.tencent.mm.R.id.e_u;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(inflate, com.tencent.mm.R.id.e_u);
                if (linearLayout != null) {
                    i18 = com.tencent.mm.R.id.f484437ea3;
                    android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) x4.b.a(inflate, com.tencent.mm.R.id.f484437ea3);
                    if (relativeLayout2 != null) {
                        i18 = com.tencent.mm.R.id.f484867fs1;
                        android.widget.RelativeLayout relativeLayout3 = (android.widget.RelativeLayout) x4.b.a(inflate, com.tencent.mm.R.id.f484867fs1);
                        if (relativeLayout3 != null) {
                            i18 = com.tencent.mm.R.id.f485231gz3;
                            android.widget.RelativeLayout relativeLayout4 = (android.widget.RelativeLayout) x4.b.a(inflate, com.tencent.mm.R.id.f485231gz3);
                            if (relativeLayout4 != null) {
                                i18 = com.tencent.mm.R.id.im7;
                                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(inflate, com.tencent.mm.R.id.im7);
                                if (linearLayout2 != null) {
                                    i18 = com.tencent.mm.R.id.f486082k36;
                                    android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) x4.b.a(inflate, com.tencent.mm.R.id.f486082k36);
                                    if (linearLayout3 != null) {
                                        i18 = com.tencent.mm.R.id.f486076k30;
                                        android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.f486076k30);
                                        if (textView != null) {
                                            i18 = com.tencent.mm.R.id.k3_;
                                            android.widget.LinearLayout linearLayout4 = (android.widget.LinearLayout) x4.b.a(inflate, com.tencent.mm.R.id.k3_);
                                            if (linearLayout4 != null) {
                                                i18 = com.tencent.mm.R.id.f486077k31;
                                                android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.f486077k31);
                                                if (textView2 != null) {
                                                    i18 = com.tencent.mm.R.id.k3a;
                                                    android.widget.LinearLayout linearLayout5 = (android.widget.LinearLayout) x4.b.a(inflate, com.tencent.mm.R.id.k3a);
                                                    if (linearLayout5 != null) {
                                                        i18 = com.tencent.mm.R.id.f486078k32;
                                                        android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.f486078k32);
                                                        if (textView3 != null) {
                                                            i18 = com.tencent.mm.R.id.k3b;
                                                            android.widget.LinearLayout linearLayout6 = (android.widget.LinearLayout) x4.b.a(inflate, com.tencent.mm.R.id.k3b);
                                                            if (linearLayout6 != null) {
                                                                i18 = com.tencent.mm.R.id.f486079k33;
                                                                android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.f486079k33);
                                                                if (textView4 != null) {
                                                                    i18 = com.tencent.mm.R.id.kcj;
                                                                    android.widget.TextView textView5 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.kcj);
                                                                    if (textView5 != null) {
                                                                        i18 = com.tencent.mm.R.id.koe;
                                                                        com.tencent.mm.plugin.mv.ui.view.MusicMvTabMachineFragment musicMvTabMachineFragment = (com.tencent.mm.plugin.mv.ui.view.MusicMvTabMachineFragment) x4.b.a(inflate, com.tencent.mm.R.id.koe);
                                                                        if (musicMvTabMachineFragment != null) {
                                                                            i18 = com.tencent.mm.R.id.kof;
                                                                            com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyFavFragment musicMvTabMyFavFragment = (com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyFavFragment) x4.b.a(inflate, com.tencent.mm.R.id.kof);
                                                                            if (musicMvTabMyFavFragment != null) {
                                                                                i18 = com.tencent.mm.R.id.kog;
                                                                                com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyLikeFragment musicMvTabMyLikeFragment = (com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyLikeFragment) x4.b.a(inflate, com.tencent.mm.R.id.kog);
                                                                                if (musicMvTabMyLikeFragment != null) {
                                                                                    i18 = com.tencent.mm.R.id.koh;
                                                                                    com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyPostFragment musicMvTabMyPostFragment = (com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyPostFragment) x4.b.a(inflate, com.tencent.mm.R.id.koh);
                                                                                    if (musicMvTabMyPostFragment != null) {
                                                                                        i18 = com.tencent.mm.R.id.koi;
                                                                                        com.tencent.mm.plugin.mv.ui.view.MusicMvTabSearchFragment musicMvTabSearchFragment = (com.tencent.mm.plugin.mv.ui.view.MusicMvTabSearchFragment) x4.b.a(inflate, com.tencent.mm.R.id.koi);
                                                                                        if (musicMvTabSearchFragment != null) {
                                                                                            i18 = com.tencent.mm.R.id.mdb;
                                                                                            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(inflate, com.tencent.mm.R.id.mdb);
                                                                                            if (weImageView2 != null) {
                                                                                                i18 = com.tencent.mm.R.id.mf7;
                                                                                                android.widget.LinearLayout linearLayout7 = (android.widget.LinearLayout) x4.b.a(inflate, com.tencent.mm.R.id.mf7);
                                                                                                if (linearLayout7 != null) {
                                                                                                    i18 = com.tencent.mm.R.id.mfo;
                                                                                                    com.tencent.mm.plugin.mv.ui.view.FTSSearchNoActionBarView fTSSearchNoActionBarView = (com.tencent.mm.plugin.mv.ui.view.FTSSearchNoActionBarView) x4.b.a(inflate, com.tencent.mm.R.id.mfo);
                                                                                                    if (fTSSearchNoActionBarView != null) {
                                                                                                        i18 = com.tencent.mm.R.id.od_;
                                                                                                        com.google.android.material.tabs.TabLayout tabLayout = (com.google.android.material.tabs.TabLayout) x4.b.a(inflate, com.tencent.mm.R.id.od_);
                                                                                                        if (tabLayout != null) {
                                                                                                            this.F = new bm3.a(relativeLayout, recyclerView, weImageView, relativeLayout, linearLayout, relativeLayout2, relativeLayout3, relativeLayout4, linearLayout2, linearLayout3, textView, linearLayout4, textView2, linearLayout5, textView3, linearLayout6, textView4, textView5, musicMvTabMachineFragment, musicMvTabMyFavFragment, musicMvTabMyLikeFragment, musicMvTabMyPostFragment, musicMvTabSearchFragment, weImageView2, linearLayout7, fTSSearchNoActionBarView, tabLayout);
                                                                                                            this.H = kz5.c0.d(getContext().getString(com.tencent.mm.R.string.h3s), getContext().getString(com.tencent.mm.R.string.h3t));
                                                                                                            this.f151618J = new com.tencent.mm.plugin.mv.ui.view.z0(this);
                                                                                                            this.K = "#*$";
                                                                                                            this.L = new com.tencent.mm.plugin.mv.ui.view.g0(this);
                                                                                                            this.M = new com.tencent.mm.plugin.mv.ui.view.h0(this);
                                                                                                            this.N = new com.tencent.mm.plugin.mv.ui.view.r0(this);
                                                                                                            this.Q = -1;
                                                                                                            this.R = -1;
                                                                                                            this.T = t23.p1.f415247d;
                                                                                                            this.V = 27;
                                                                                                            this.W = 3;
                                                                                                            this.f151640x0 = -1L;
                                                                                                            this.f151644y1 = true;
                                                                                                            this.A1 = new com.tencent.mm.plugin.mv.ui.view.c1(this);
                                                                                                            return;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i18)));
    }
}
