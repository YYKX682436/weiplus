package com.tencent.mm.plugin.ting.widget;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB\u001b\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017B#\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002R\u001b\u0010\u000e\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0011\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/plugin/ting/widget/TingCategoryMvvmView;", "Landroid/widget/RelativeLayout;", "", "coverSource", "Ljz5/f0;", "setCoverSource", "color", "setContainerBackgroundColor", com.tencent.tinker.loader.shareutil.ShareConstants.RES_PATH, "setContainerBackgroundResource", "d", "Ljz5/g;", "getCornerRadius", "()I", "cornerRadius", "e", "getCoverSize", "coverSize", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "nm4/d", "ting-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class TingCategoryMvvmView extends android.widget.RelativeLayout {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f174848t = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g cornerRadius;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g coverSize;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f174851f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f174852g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f174853h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f174854i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f174855m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.RelativeLayout f174856n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.view.MMPAGView f174857o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f174858p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f174859q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f174860r;

    /* renamed from: s, reason: collision with root package name */
    public int f174861s;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TingCategoryMvvmView(android.content.Context context) {
        this(context, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final int getCornerRadius() {
        return ((java.lang.Number) ((jz5.n) this.cornerRadius).getValue()).intValue();
    }

    private final int getCoverSize() {
        return ((java.lang.Number) ((jz5.n) this.coverSize).getValue()).intValue();
    }

    public final void a(android.view.View view) {
        android.widget.ImageView imageView = this.f174852g;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("mTingCategoryCover");
            throw null;
        }
        if (!(!kotlin.jvm.internal.o.b(this, view))) {
            imageView = null;
        }
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        android.widget.ImageView imageView2 = this.f174853h;
        if (imageView2 == null) {
            kotlin.jvm.internal.o.o("mTingCategoryRoundCoverChat");
            throw null;
        }
        if (!(!kotlin.jvm.internal.o.b(this, view))) {
            imageView2 = null;
        }
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        android.widget.ImageView imageView3 = this.f174854i;
        if (imageView3 == null) {
            kotlin.jvm.internal.o.o("mTingCategoryRoundCoverSns");
            throw null;
        }
        if (!(!kotlin.jvm.internal.o.b(this, view))) {
            imageView3 = null;
        }
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
        android.widget.RelativeLayout relativeLayout = this.f174856n;
        if (relativeLayout == null) {
            kotlin.jvm.internal.o.o("mTingCategoryPagLayout");
            throw null;
        }
        android.widget.RelativeLayout relativeLayout2 = kotlin.jvm.internal.o.b(this, view) ^ true ? relativeLayout : null;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(8);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ting/widget/TingCategoryMvvmView", "hideAllCoverExcept", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/ting/widget/TingCategoryMvvmView", "hideAllCoverExcept", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void b(android.widget.ImageView imageView, r45.lm6 lm6Var, com.tencent.mm.sdk.platformtools.w1 w1Var) {
        if (imageView == null) {
            return;
        }
        java.lang.String str = lm6Var.f379643m;
        boolean z17 = false;
        if (!(str == null || str.length() == 0) && com.tencent.mm.vfs.w6.j(lm6Var.f379643m)) {
            z17 = true;
        }
        java.lang.String str2 = z17 ? lm6Var.f379643m : lm6Var.f379639f;
        ff0.t tVar = (ff0.t) i95.n0.c(ff0.t.class);
        kotlin.jvm.internal.o.d(str2);
        int Vi = ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Vi();
        dl4.m0 m0Var = (dl4.m0) tVar;
        m0Var.getClass();
        m0Var.Zi(str2, imageView, Vi, 512, 512, w1Var, null);
    }

    public final void c() {
        android.widget.ImageView imageView = this.f174852g;
        if (imageView != null) {
            imageView.setImageResource(((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Vi());
        } else {
            kotlin.jvm.internal.o.o("mTingCategoryCover");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
    
        if (r26.i0.n(r4, "pag_cover_genre_piece.pag", false) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if (r26.i0.n(r4, "pag_cover_genre_piece.pag", false) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(com.tencent.mm.view.MMPAGView r6, java.util.List r7) {
        /*
            r5 = this;
            r0 = 0
            r6.setVisibility(r0)
            boolean r1 = r6.f()
            if (r1 == 0) goto Ld
            r6.n()
        Ld:
            boolean r1 = r6.getUseRfx()
            java.lang.String r2 = "path(...)"
            java.lang.String r3 = "pag_cover_genre_piece.pag"
            if (r1 != 0) goto L5f
            org.libpag.PAGComposition r1 = r6.getComposition()
            boolean r4 = r1 instanceof org.libpag.PAGFile
            if (r4 == 0) goto L31
            org.libpag.PAGFile r1 = (org.libpag.PAGFile) r1
            java.lang.String r4 = r1.path()
            kotlin.jvm.internal.o.f(r4, r2)
            boolean r0 = r26.i0.n(r4, r3, r0)
            if (r0 == 0) goto L31
            goto L3d
        L31:
            android.content.Context r0 = r5.getContext()
            android.content.res.AssetManager r0 = r0.getAssets()
            org.libpag.PAGFile r1 = org.libpag.PAGFile.Load(r0, r3)
        L3d:
            if (r1 == 0) goto La0
            java.util.Iterator r7 = r7.iterator()
        L43:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L5b
            java.lang.Object r0 = r7.next()
            nm4.d r0 = (nm4.d) r0
            int r2 = r0.f338486b
            android.graphics.Bitmap r0 = r0.f338485a
            org.libpag.PAGImage r0 = org.libpag.PAGImage.FromBitmap(r0)
            r1.replaceImage(r2, r0)
            goto L43
        L5b:
            r6.setComposition(r1)
            goto La0
        L5f:
            com.tencent.mm.rfx.RfxPagFile r1 = r6.getRfxComposition()
            if (r1 == 0) goto L73
            java.lang.String r4 = r1.path()
            kotlin.jvm.internal.o.f(r4, r2)
            boolean r0 = r26.i0.n(r4, r3, r0)
            if (r0 == 0) goto L73
            goto L7f
        L73:
            android.content.Context r0 = r5.getContext()
            android.content.res.AssetManager r0 = r0.getAssets()
            com.tencent.mm.rfx.RfxPagFile r1 = com.tencent.mm.rfx.RfxPagFile.Load(r0, r3)
        L7f:
            if (r1 == 0) goto La0
            java.util.Iterator r7 = r7.iterator()
        L85:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L9d
            java.lang.Object r0 = r7.next()
            nm4.d r0 = (nm4.d) r0
            int r2 = r0.f338486b
            android.graphics.Bitmap r0 = r0.f338485a
            com.tencent.mm.rfx.RfxPagImage r0 = com.tencent.mm.rfx.RfxPagImage.FromBitmap(r0)
            r1.replaceImage(r2, r0)
            goto L85
        L9d:
            r6.setComposition(r1)
        La0:
            r7 = 1
            r6.setRepeatCount(r7)
            r6.g()
            r6.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.ting.widget.TingCategoryMvvmView.d(com.tencent.mm.view.MMPAGView, java.util.List):void");
    }

    public final void e(java.lang.String str, android.graphics.Bitmap bitmap) {
        ff0.t tVar = (ff0.t) i95.n0.c(ff0.t.class);
        if (str == null) {
            str = "";
        }
        android.view.View view = this.f174859q;
        if (view == null) {
            kotlin.jvm.internal.o.o("mTingCategoryPagCoverBg");
            throw null;
        }
        ((dl4.m0) tVar).hj(str, view, bitmap, new nm4.i(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (r26.i0.n(r4, "pag_cover_master_piece.pag", false) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if (r26.i0.n(r4, "pag_cover_master_piece.pag", false) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(com.tencent.mm.view.MMPAGView r6, android.graphics.Bitmap r7) {
        /*
            r5 = this;
            r0 = 0
            r6.setVisibility(r0)
            boolean r1 = r6.f()
            if (r1 == 0) goto Ld
            r6.n()
        Ld:
            boolean r1 = r6.getUseRfx()
            java.lang.String r2 = "path(...)"
            java.lang.String r3 = "pag_cover_master_piece.pag"
            if (r1 != 0) goto L4a
            org.libpag.PAGComposition r1 = r6.getComposition()
            boolean r4 = r1 instanceof org.libpag.PAGFile
            if (r4 == 0) goto L31
            org.libpag.PAGFile r1 = (org.libpag.PAGFile) r1
            java.lang.String r4 = r1.path()
            kotlin.jvm.internal.o.f(r4, r2)
            boolean r2 = r26.i0.n(r4, r3, r0)
            if (r2 == 0) goto L31
            goto L3d
        L31:
            android.content.Context r1 = r5.getContext()
            android.content.res.AssetManager r1 = r1.getAssets()
            org.libpag.PAGFile r1 = org.libpag.PAGFile.Load(r1, r3)
        L3d:
            if (r1 == 0) goto L76
            org.libpag.PAGImage r7 = org.libpag.PAGImage.FromBitmap(r7)
            r1.replaceImage(r0, r7)
            r6.setComposition(r1)
            goto L76
        L4a:
            com.tencent.mm.rfx.RfxPagFile r1 = r6.getRfxComposition()
            if (r1 == 0) goto L5e
            java.lang.String r4 = r1.path()
            kotlin.jvm.internal.o.f(r4, r2)
            boolean r2 = r26.i0.n(r4, r3, r0)
            if (r2 == 0) goto L5e
            goto L6a
        L5e:
            android.content.Context r1 = r5.getContext()
            android.content.res.AssetManager r1 = r1.getAssets()
            com.tencent.mm.rfx.RfxPagFile r1 = com.tencent.mm.rfx.RfxPagFile.Load(r1, r3)
        L6a:
            if (r1 == 0) goto L76
            com.tencent.mm.rfx.RfxPagImage r7 = com.tencent.mm.rfx.RfxPagImage.FromBitmap(r7)
            r1.replaceImage(r0, r7)
            r6.setComposition(r1)
        L76:
            r7 = 1
            r6.setRepeatCount(r7)
            r6.g()
            r6.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.ting.widget.TingCategoryMvvmView.f(com.tencent.mm.view.MMPAGView, android.graphics.Bitmap):void");
    }

    public final void g(r45.lm6 tingCategoryViewData, com.tencent.mm.sdk.platformtools.w1 w1Var) {
        kotlin.jvm.internal.o.g(tingCategoryViewData, "tingCategoryViewData");
        android.view.View view = this.f174860r;
        if (view == null) {
            kotlin.jvm.internal.o.o("mTingTopicUGCHashLogo");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ting/widget/TingCategoryMvvmView", "updateCover", "(Lcom/tencent/mm/protocal/protobuf/TingCategoryViewData;Lcom/tencent/mm/sdk/platformtools/IMakeSureUIThread;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/ting/widget/TingCategoryMvvmView", "updateCover", "(Lcom/tencent/mm/protocal/protobuf/TingCategoryViewData;Lcom/tencent/mm/sdk/platformtools/IMakeSureUIThread;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i17 = tingCategoryViewData.f379640g;
        boolean z17 = true;
        if (i17 == 0) {
            android.view.View view2 = this.f174852g;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("mTingCategoryCover");
                throw null;
            }
            a(view2);
            android.widget.ImageView imageView = this.f174852g;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("mTingCategoryCover");
                throw null;
            }
            b(imageView, tingCategoryViewData, w1Var);
        } else if (i17 == 1) {
            if (this.f174861s == 2) {
                android.view.View view3 = this.f174854i;
                if (view3 == null) {
                    kotlin.jvm.internal.o.o("mTingCategoryRoundCoverSns");
                    throw null;
                }
                a(view3);
                android.widget.ImageView imageView2 = this.f174854i;
                if (imageView2 == null) {
                    kotlin.jvm.internal.o.o("mTingCategoryRoundCoverSns");
                    throw null;
                }
                b(imageView2, tingCategoryViewData, w1Var);
            } else {
                android.view.View view4 = this.f174853h;
                if (view4 == null) {
                    kotlin.jvm.internal.o.o("mTingCategoryRoundCoverChat");
                    throw null;
                }
                a(view4);
                android.widget.ImageView imageView3 = this.f174853h;
                if (imageView3 == null) {
                    kotlin.jvm.internal.o.o("mTingCategoryRoundCoverChat");
                    throw null;
                }
                b(imageView3, tingCategoryViewData, w1Var);
            }
        } else if (i17 == 4) {
            android.view.View view5 = this.f174852g;
            if (view5 == null) {
                kotlin.jvm.internal.o.o("mTingCategoryCover");
                throw null;
            }
            a(view5);
            android.widget.ImageView imageView4 = this.f174852g;
            if (imageView4 == null) {
                kotlin.jvm.internal.o.o("mTingCategoryCover");
                throw null;
            }
            b(imageView4, tingCategoryViewData, w1Var);
            android.view.View view6 = this.f174860r;
            if (view6 == null) {
                kotlin.jvm.internal.o.o("mTingTopicUGCHashLogo");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view6, arrayList2.toArray(), "com/tencent/mm/plugin/ting/widget/TingCategoryMvvmView", "updateCover", "(Lcom/tencent/mm/protocal/protobuf/TingCategoryViewData;Lcom/tencent/mm/sdk/platformtools/IMakeSureUIThread;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/ting/widget/TingCategoryMvvmView", "updateCover", "(Lcom/tencent/mm/protocal/protobuf/TingCategoryViewData;Lcom/tencent/mm/sdk/platformtools/IMakeSureUIThread;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view7 = this.f174856n;
            if (view7 == null) {
                kotlin.jvm.internal.o.o("mTingCategoryPagLayout");
                throw null;
            }
            a(view7);
            com.tencent.mars.xlog.Log.i("MicroMsg.TingCategoryMvvmView", "updatePagCoverTitle title: " + tingCategoryViewData.f379641h);
            android.widget.TextView textView = this.f174858p;
            if (textView == null) {
                kotlin.jvm.internal.o.o("mTingCategoryPagCoverTitle");
                throw null;
            }
            textView.setText(tingCategoryViewData.f379641h);
            if (tingCategoryViewData.f379640g == 3) {
                com.tencent.mm.view.MMPAGView mMPAGView = this.f174857o;
                if (mMPAGView == null) {
                    kotlin.jvm.internal.o.o("mTingCategoryPagCover");
                    throw null;
                }
                android.widget.RelativeLayout relativeLayout = this.f174856n;
                if (relativeLayout == null) {
                    kotlin.jvm.internal.o.o("mTingCategoryPagLayout");
                    throw null;
                }
                relativeLayout.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.a8t));
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(new nm4.d(null, 0));
                linkedList.add(new nm4.d(null, 1));
                linkedList.add(new nm4.d(null, 2));
                d(mMPAGView, linkedList);
                com.tencent.mars.xlog.Log.i("MicroMsg.TingCategoryMvvmView", "loadTingCategoryPagCover");
                java.util.LinkedList covers = tingCategoryViewData.f379644n;
                kotlin.jvm.internal.o.f(covers, "covers");
                int i18 = 0;
                for (java.lang.Object obj : covers) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    java.lang.String str = (java.lang.String) obj;
                    if (i18 == 0) {
                        e(str, null);
                    }
                    ff0.t tVar = (ff0.t) i95.n0.c(ff0.t.class);
                    kotlin.jvm.internal.o.d(str);
                    ((dl4.m0) tVar).bj(str, null, new nm4.g(this, mMPAGView, i18, str));
                    i18 = i19;
                }
            } else {
                com.tencent.mm.view.MMPAGView mMPAGView2 = this.f174857o;
                if (mMPAGView2 == null) {
                    kotlin.jvm.internal.o.o("mTingCategoryPagCover");
                    throw null;
                }
                android.widget.RelativeLayout relativeLayout2 = this.f174856n;
                if (relativeLayout2 == null) {
                    kotlin.jvm.internal.o.o("mTingCategoryPagLayout");
                    throw null;
                }
                relativeLayout2.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.a8t));
                f(mMPAGView2, null);
                java.lang.String str2 = tingCategoryViewData.f379643m;
                java.lang.String str3 = !(str2 == null || str2.length() == 0) && com.tencent.mm.vfs.w6.j(tingCategoryViewData.f379643m) ? tingCategoryViewData.f379643m : tingCategoryViewData.f379639f;
                com.tencent.mars.xlog.Log.i("MicroMsg.TingCategoryMvvmView", "loadTingCategoryPagCover coverUrl: %s", str3);
                e(tingCategoryViewData.f379639f, null);
                ff0.t tVar2 = (ff0.t) i95.n0.c(ff0.t.class);
                kotlin.jvm.internal.o.d(str3);
                ((dl4.m0) tVar2).bj(str3, null, new nm4.h(this, tingCategoryViewData, mMPAGView2));
            }
        }
        java.lang.String str4 = tingCategoryViewData.f379642i;
        if (str4 != null && str4.length() != 0) {
            z17 = false;
        }
        if (z17) {
            android.widget.ImageView imageView5 = this.f174855m;
            if (imageView5 != null) {
                imageView5.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("mTingCategoryAuthorAvatar");
                throw null;
            }
        }
        android.widget.ImageView imageView6 = this.f174855m;
        if (imageView6 == null) {
            kotlin.jvm.internal.o.o("mTingCategoryAuthorAvatar");
            throw null;
        }
        imageView6.setVisibility(0);
        ff0.t tVar3 = (ff0.t) i95.n0.c(ff0.t.class);
        kotlin.jvm.internal.o.d(str4);
        android.widget.ImageView imageView7 = this.f174855m;
        if (imageView7 == null) {
            kotlin.jvm.internal.o.o("mTingCategoryAuthorAvatar");
            throw null;
        }
        ((dl4.m0) tVar3).aj(str4, imageView7, 0, null);
    }

    public final void setContainerBackgroundColor(int i17) {
        android.view.View view = this.f174851f;
        if (view != null) {
            view.setBackgroundColor(i17);
        } else {
            kotlin.jvm.internal.o.o("mTingCategoryContainer");
            throw null;
        }
    }

    public final void setContainerBackgroundResource(int i17) {
        android.view.View view = this.f174851f;
        if (view != null) {
            view.setBackgroundResource(i17);
        } else {
            kotlin.jvm.internal.o.o("mTingCategoryContainer");
            throw null;
        }
    }

    public final void setCoverSource(int i17) {
        this.f174861s = i17;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TingCategoryMvvmView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TingCategoryMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.cornerRadius = jz5.h.b(new nm4.e(this));
        this.coverSize = jz5.h.b(new nm4.f(this));
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f489572eq1, (android.view.ViewGroup) this, true);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.vey);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f174851f = findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.o96);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f174852g = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.f487313vf0);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f174853h = (android.widget.ImageView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.f487314vf1);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f174854i = (android.widget.ImageView) findViewById4;
        android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.f487311o94);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f174855m = (android.widget.ImageView) findViewById5;
        android.view.View findViewById6 = inflate.findViewById(com.tencent.mm.R.id.o9a);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f174856n = (android.widget.RelativeLayout) findViewById6;
        android.view.View findViewById7 = inflate.findViewById(com.tencent.mm.R.id.o99);
        ((com.tencent.mm.view.MMPAGView) findViewById7).o(bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.global.RepairerConfigRfxTingSwitch()) == 1);
        kotlin.jvm.internal.o.f(findViewById7, "apply(...)");
        this.f174857o = (com.tencent.mm.view.MMPAGView) findViewById7;
        android.view.View findViewById8 = inflate.findViewById(com.tencent.mm.R.id.o9b);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f174858p = (android.widget.TextView) findViewById8;
        android.view.View findViewById9 = inflate.findViewById(com.tencent.mm.R.id.o9_);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f174859q = findViewById9;
        android.view.View findViewById10 = inflate.findViewById(com.tencent.mm.R.id.qxa);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.f174860r = findViewById10;
    }
}
