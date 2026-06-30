package uf3;

/* loaded from: classes12.dex */
public final class g extends mf3.e implements uf3.c, vf3.g, mg3.d, ml5.g, rf3.v {

    /* renamed from: o, reason: collision with root package name */
    public em.o1 f427184o;

    /* renamed from: p, reason: collision with root package name */
    public y51.c f427185p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f427186q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f427187r;

    /* renamed from: s, reason: collision with root package name */
    public int f427188s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(mf3.p apiCenter) {
        super(apiCenter, "MediaGallery.LivePreviewLayer");
        kotlin.jvm.internal.o.g(apiCenter, "apiCenter");
        this.f427186q = "";
        this.f427187r = "";
        this.f427188s = -1;
    }

    @Override // vf3.g
    public void A(gg3.c videoParam, sf3.g imageParam, vf3.e state, vf3.f extraInfo) {
        mf3.k kVar;
        mf3.k kVar2;
        kotlin.jvm.internal.o.g(videoParam, "videoParam");
        kotlin.jvm.internal.o.g(imageParam, "imageParam");
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(extraInfo, "extraInfo");
        mf3.s sVar = this.f326110m;
        if (sVar == null || (kVar = sVar.f326117a) == null) {
            return;
        }
        java.lang.String id6 = kVar.getId();
        java.lang.String str = videoParam.f271726a;
        if (!kotlin.jvm.internal.o.b(str, id6)) {
            P("onStateChanged apply abort. callback id: " + str + ", mediaId: " + kVar.getId(), new java.lang.Object[0]);
            return;
        }
        P("onLiveStateChanged apply: " + state.name() + " mediaId: " + kVar.getId() + " mediaLevel: " + kVar.getLevel().name(), new java.lang.Object[0]);
        if (state == vf3.e.f436386p || state == vf3.e.f436385o) {
            uf3.a aVar = (uf3.a) g(uf3.a.class);
            if (aVar != null) {
                aVar.m(state, new vf3.f(null, null, 0, 0.0f, 15, null));
            }
            S(null);
            return;
        }
        vf3.a aVar2 = (vf3.a) H(vf3.a.class);
        vf3.b T4 = aVar2 != null ? aVar2.T4(kVar) : null;
        uf3.a aVar3 = (uf3.a) g(uf3.a.class);
        if (aVar3 != null) {
            aVar3.v(T4);
        }
        uf3.a aVar4 = (uf3.a) g(uf3.a.class);
        if (aVar4 != null) {
            aVar4.m(state, extraInfo);
        }
        mf3.w level = kVar.getLevel();
        mf3.w wVar = mf3.w.f326128d;
        if (level != wVar) {
            int ordinal = state.ordinal();
            if (ordinal == 1 || ordinal == 4) {
                T(videoParam, imageParam);
                return;
            }
            if (ordinal != 6) {
                if (ordinal != 7) {
                    return;
                }
                U(imageParam);
                return;
            } else {
                mf3.s sVar2 = this.f326110m;
                if (sVar2 == null || (kVar2 = sVar2.f326117a) == null) {
                    return;
                }
                kVar2.f(wVar);
                return;
            }
        }
        int ordinal2 = state.ordinal();
        if (ordinal2 != 1) {
            if (ordinal2 == 3) {
                em.o1 o1Var = this.f427184o;
                if (o1Var == null) {
                    kotlin.jvm.internal.o.o("rootVB");
                    throw null;
                }
                o1Var.e().setVisibility(8);
                em.o1 o1Var2 = this.f427184o;
                if (o1Var2 == null) {
                    kotlin.jvm.internal.o.o("rootVB");
                    throw null;
                }
                o1Var2.a().setVisibility(0);
                em.o1 o1Var3 = this.f427184o;
                if (o1Var3 != null) {
                    o1Var3.a().setProgress(0);
                    return;
                } else {
                    kotlin.jvm.internal.o.o("rootVB");
                    throw null;
                }
            }
            if (ordinal2 != 4) {
                if (ordinal2 == 5) {
                    S(K().getString(com.tencent.mm.R.string.g09));
                    return;
                } else {
                    if (ordinal2 != 6) {
                        if (ordinal2 != 7) {
                            S(null);
                            return;
                        } else {
                            U(imageParam);
                            return;
                        }
                    }
                    return;
                }
            }
        }
        T(videoParam, imageParam);
    }

    @Override // mg3.d
    public void B(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        mf3.o oVar = (mf3.o) g(mf3.o.class);
        if (oVar != null) {
            oVar.j();
        }
    }

    @Override // mf3.e, mf3.l
    public void F() {
        this.f326111n = true;
        em.o1 o1Var = this.f427184o;
        if (o1Var == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        o1Var.d().setEnabled(true);
        cg3.a aVar = (cg3.a) H(cg3.a.class);
        if (aVar == null) {
            return;
        }
        aVar.u3(new uf3.f(this));
    }

    @Override // mf3.e, kg3.d
    public void H2() {
        Q("onVerticalUIApply", new java.lang.Object[0]);
        if (this.f427188s != 1) {
            em.o1 o1Var = this.f427184o;
            if (o1Var == null) {
                kotlin.jvm.internal.o.o("rootVB");
                throw null;
            }
            o1Var.e().setVisibility(4);
            y51.c cVar = this.f427185p;
            if (cVar != null) {
                ((y51.b) cVar).b();
            }
        }
        W(true);
        this.f427188s = 1;
    }

    @Override // mf3.e
    public android.view.View J(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ejl, (android.view.ViewGroup) null);
        this.f427184o = new em.o1(inflate);
        kotlin.jvm.internal.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    public final void S(java.lang.String str) {
        mf3.k kVar;
        java.lang.String str2;
        mf3.s sVar = this.f326110m;
        if (sVar == null || (kVar = sVar.f326117a) == null) {
            return;
        }
        em.o1 o1Var = this.f427184o;
        if (o1Var == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        o1Var.i().setVisibility(4);
        em.o1 o1Var2 = this.f427184o;
        if (o1Var2 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        o1Var2.e().setVisibility(8);
        em.o1 o1Var3 = this.f427184o;
        if (o1Var3 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        o1Var3.a().setVisibility(8);
        em.o1 o1Var4 = this.f427184o;
        if (o1Var4 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        o1Var4.b().setVisibility(0);
        em.o1 o1Var5 = this.f427184o;
        if (o1Var5 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        if (o1Var5.f254666e == null) {
            o1Var5.f254666e = (com.tencent.mm.ui.widget.imageview.WeImageView) o1Var5.f254662a.findViewById(com.tencent.mm.R.id.uam);
        }
        o1Var5.f254666e.setImageResource(com.tencent.mm.R.raw.image_download_fail_icon);
        em.o1 o1Var6 = this.f427184o;
        if (o1Var6 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        o1Var6.c().setText(K().getString(com.tencent.mm.R.string.fjg));
        if (str != null) {
            em.o1 o1Var7 = this.f427184o;
            if (o1Var7 != null) {
                o1Var7.c().setText(str);
                return;
            } else {
                kotlin.jvm.internal.o.o("rootVB");
                throw null;
            }
        }
        vf3.a aVar = (vf3.a) H(vf3.a.class);
        vf3.c S3 = aVar != null ? aVar.S3(kVar) : null;
        if (S3 == null || (str2 = S3.f436371a) == null) {
            return;
        }
        if (str2.length() > 0) {
            em.o1 o1Var8 = this.f427184o;
            if (o1Var8 != null) {
                o1Var8.c().setText(str2);
            } else {
                kotlin.jvm.internal.o.o("rootVB");
                throw null;
            }
        }
    }

    public final void T(gg3.c cVar, sf3.g gVar) {
        cg3.a aVar;
        Q("resetUI", new java.lang.Object[0]);
        em.o1 o1Var = this.f427184o;
        if (o1Var == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        o1Var.b().setVisibility(8);
        em.o1 o1Var2 = this.f427184o;
        if (o1Var2 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        o1Var2.a().setVisibility(8);
        em.o1 o1Var3 = this.f427184o;
        if (o1Var3 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        o1Var3.a().setProgress(0);
        fg3.h hVar = (fg3.h) this.f326104d.a(fg3.h.class);
        if (hVar != null) {
            hVar.reset();
        }
        Q("onVideoLoadSuccess", new java.lang.Object[0]);
        mf3.s sVar = this.f326110m;
        if (sVar != null && sVar.f326119c) {
            java.lang.String mediaId = gVar.f407388b;
            java.lang.String str = gVar.f407390d;
            sf3.h hVar2 = gVar.f407392f;
            java.util.Map pathMap = (1 & 16) != 0 ? kz5.q0.f314001d : gVar.f407387a;
            java.lang.String previewPath = (16 & 4) != 0 ? "" : gVar.f407389c;
            java.lang.String detectPath = (8 & 16) != 0 ? "" : str;
            sf3.m detectType = (16 & 16) != 0 ? sf3.m.f407402d : null;
            sf3.h loadStrategy = (16 & 32) != 0 ? new sf3.b() : hVar2;
            kotlin.jvm.internal.o.g(pathMap, "pathMap");
            kotlin.jvm.internal.o.g(mediaId, "mediaId");
            kotlin.jvm.internal.o.g(previewPath, "previewPath");
            kotlin.jvm.internal.o.g(detectPath, "detectPath");
            kotlin.jvm.internal.o.g(detectType, "detectType");
            kotlin.jvm.internal.o.g(loadStrategy, "loadStrategy");
            sf3.m mVar = sf3.m.f407406h;
            sf3.g gVar2 = new sf3.g(pathMap, mediaId, previewPath, detectPath, null, loadStrategy, 16, null);
            java.lang.String str2 = (java.lang.String) gVar2.f407387a.get(mVar);
            if (str2 == null) {
                str2 = "";
            }
            gVar2.f407390d = str2;
            gVar2.f407391e = mVar;
            gVar2.f407392f = new sf3.b();
            em.o1 o1Var4 = this.f427184o;
            if (o1Var4 == null) {
                kotlin.jvm.internal.o.o("rootVB");
                throw null;
            }
            o1Var4.i().e(gVar2);
            mf3.s sVar2 = this.f326110m;
            if (sVar2 != null) {
                sVar2.f326119c = false;
            }
        }
        em.o1 o1Var5 = this.f427184o;
        if (o1Var5 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        o1Var5.i().e(gVar);
        java.lang.String c17 = gVar.c();
        if (this.f326111n && (aVar = (cg3.a) H(cg3.a.class)) != null) {
            aVar.o4(c17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (((z51.p) ((y51.b) r0).a(z51.p.class)).k() == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U(sf3.g r5) {
        /*
            r4 = this;
            y51.c r0 = r4.f427185p
            if (r0 == 0) goto L16
            y51.b r0 = (y51.b) r0
            java.lang.Class<z51.p> r1 = z51.p.class
            z51.x r0 = r0.a(r1)
            z51.p r0 = (z51.p) r0
            boolean r0 = r0.k()
            r1 = 1
            if (r0 != r1) goto L16
            goto L17
        L16:
            r1 = 0
        L17:
            r0 = 0
            java.lang.String r2 = "rootVB"
            if (r1 == 0) goto L37
            y51.c r1 = r4.f427185p
            if (r1 == 0) goto L26
            y51.b r1 = (y51.b) r1
            r1.b()
        L26:
            em.o1 r1 = r4.f427184o
            if (r1 == 0) goto L33
            android.widget.RelativeLayout r1 = r1.e()
            r3 = 4
            r1.setVisibility(r3)
            goto L37
        L33:
            kotlin.jvm.internal.o.o(r2)
            throw r0
        L37:
            em.o1 r1 = r4.f427184o
            if (r1 == 0) goto L43
            com.tencent.mm.plugin.media.image.SwitchableImageContainer r0 = r1.i()
            r0.e(r5)
            return
        L43:
            kotlin.jvm.internal.o.o(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: uf3.g.U(sf3.g):void");
    }

    public void V() {
        mf3.k kVar;
        vf3.a aVar;
        mf3.s sVar = this.f326110m;
        if (sVar == null || (kVar = sVar.f326117a) == null || (aVar = (vf3.a) H(vf3.a.class)) == null) {
            return;
        }
        aVar.v2(kVar, this);
    }

    public final void W(boolean z17) {
        mf3.k kVar;
        float f17;
        float f18;
        em.o1 o1Var = this.f427184o;
        if (o1Var == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.ui.base.MultiTouchImageView g17 = o1Var.g();
        kotlin.jvm.internal.o.f(g17, "getNormalImage(...)");
        em.o1 o1Var2 = this.f427184o;
        if (o1Var2 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer d17 = o1Var2.d();
        kotlin.jvm.internal.o.f(d17, "getLiveGestureContainer(...)");
        em.o1 o1Var3 = this.f427184o;
        if (o1Var3 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.live.LiveSwitchableContainer f19 = o1Var3.f();
        kotlin.jvm.internal.o.f(f19, "getLiveSwitchableContainer(...)");
        em.o1 o1Var4 = this.f427184o;
        if (o1Var4 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.image.SwitchableImageContainer i17 = o1Var4.i();
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = i17.f148562d;
        if (multiTouchImageView != null) {
            multiTouchImageView.i();
        }
        com.tencent.mm.ui.base.WxImageView wxImageView = i17.sampleImageView;
        if (wxImageView != null) {
            wxImageView.i();
        }
        mf3.s sVar = this.f326110m;
        if (sVar == null || (kVar = sVar.f326117a) == null) {
            return;
        }
        vf3.a aVar = (vf3.a) H(vf3.a.class);
        vf3.d K = aVar != null ? aVar.K(kVar) : null;
        int imageWidth = K != null ? K.f436375d : g17.getImageWidth();
        int imageHeight = K != null ? K.f436376e : g17.getImageHeight();
        java.lang.Boolean valueOf = (java.lang.Float.isNaN(g17.f197654q) || java.lang.Float.isInfinite(g17.f197654q)) ? null : java.lang.Boolean.valueOf(g17.G);
        boolean booleanValue = valueOf == null ? false : valueOf.booleanValue();
        if (imageWidth <= 0 || imageHeight <= 0) {
            d17.setLongVertical(booleanValue);
            d17.O(f19, 1.0f, 1.0f, false);
            Q("resetGesture default, isLongVerticalImage=" + booleanValue, new java.lang.Object[0]);
            return;
        }
        float f27 = imageHeight / imageWidth;
        boolean z18 = f27 > 2.2f || booleanValue;
        boolean z19 = z17 && f19.getWidth() > f19.getHeight();
        android.content.Context K2 = K();
        android.app.Activity activity = K2 instanceof android.app.Activity ? (android.app.Activity) K2 : null;
        boolean z27 = activity != null && (com.tencent.mm.ui.bk.N(activity.getTaskId()) || com.tencent.mm.ui.bk.P(K()));
        Q("resetGesture removeListener containerWH: " + f19.getWidth() + '-' + f19.getHeight() + ", contentWH: " + imageWidth + '-' + imageHeight + ", isScreenVertical: " + z17 + " imageRatio:" + f27 + " isLongVertical: " + z18 + " isPad: " + z19 + " isFoldScreenExpand: " + z27, new java.lang.Object[0]);
        if (!z17 || z18 || z19 || z27) {
            float width = f19.getWidth() / (f19.getHeight() / f27);
            em.o1 o1Var5 = this.f427184o;
            if (o1Var5 == null) {
                kotlin.jvm.internal.o.o("rootVB");
                throw null;
            }
            o1Var5.h().U = true;
            em.o1 o1Var6 = this.f427184o;
            if (o1Var6 == null) {
                kotlin.jvm.internal.o.o("rootVB");
                throw null;
            }
            o1Var6.h().invalidate();
            em.o1 o1Var7 = this.f427184o;
            if (o1Var7 == null) {
                kotlin.jvm.internal.o.o("rootVB");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = o1Var7.e().getLayoutParams();
            layoutParams.height = -1;
            layoutParams.width = ((int) (f19.getHeight() / f27)) + 2;
            f17 = width;
            f18 = 1.0f;
        } else {
            f18 = f19.getHeight() / (f19.getWidth() * f27);
            em.o1 o1Var8 = this.f427184o;
            if (o1Var8 == null) {
                kotlin.jvm.internal.o.o("rootVB");
                throw null;
            }
            o1Var8.h().invalidate();
            em.o1 o1Var9 = this.f427184o;
            if (o1Var9 == null) {
                kotlin.jvm.internal.o.o("rootVB");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams2 = o1Var9.e().getLayoutParams();
            layoutParams2.height = ((int) (f19.getWidth() * f27)) + 2;
            layoutParams2.width = -1;
            f17 = 1.0f;
        }
        d17.setScaleConfig(new mg3.l(0.0f, 0.75f, 2.0f, 0.0f, 9, null));
        d17.setLongVertical(false);
        d17.O(f19, f17, f18, true);
    }

    public void X() {
        mf3.k kVar;
        java.lang.String str;
        java.lang.String str2;
        mf3.s sVar = this.f326110m;
        if (sVar == null || (kVar = sVar.f326117a) == null) {
            return;
        }
        gg3.c a17 = kVar.a();
        java.lang.String str3 = "";
        if (a17 == null || (str = a17.f271727b) == null) {
            str = "";
        }
        gg3.c a18 = kVar.a();
        if (a18 != null && (str2 = a18.f271728c) != null) {
            str3 = str2;
        }
        java.lang.Long j17 = r26.h0.j(kVar.getId());
        if (j17 == null) {
            throw new java.lang.RuntimeException("media id for live must can be converted to long");
        }
        long longValue = j17.longValue();
        if (this.f427185p != null && kotlin.jvm.internal.o.b(str, this.f427186q) && kotlin.jvm.internal.o.b(str3, this.f427187r)) {
            Q("initLivePlayer return, same live info, playerView: " + this.f427185p + ", liveThumbPath: " + this.f427186q + ", liveVideoPath: " + this.f427187r, new java.lang.Object[0]);
        } else {
            vf3.a aVar = (vf3.a) H(vf3.a.class);
            boolean c27 = aVar != null ? aVar.c2(kVar) : false;
            this.f427186q = str;
            this.f427187r = str3;
            Q("initLivePlayer, liveThumbPath: " + this.f427186q + " (isExist: " + com.tencent.mm.vfs.w6.j(this.f427186q) + "), liveVideoPath: " + this.f427187r + " (isExist: " + com.tencent.mm.vfs.w6.j(this.f427187r) + ") audioSupported: " + c27, new java.lang.Object[0]);
            java.lang.String r17 = i65.a.r(K(), com.tencent.mm.R.string.o4x);
            kotlin.jvm.internal.o.f(r17, "getString(...)");
            a61.d dVar = new a61.d(false, null, true, false, true, r17, c27 ^ true, null, false, null);
            a61.c cVar = new a61.c(1, this.f427186q, true, this.f427187r, java.lang.Long.valueOf(longValue), new uf3.d(this), null);
            y51.c cVar2 = this.f427185p;
            if (cVar2 != null) {
                ((y51.b) cVar2).e();
            }
            this.f427185p = ((hs.z) ((qk.t7) i95.n0.c(qk.t7.class))).Ai(new a61.a(dVar, cVar), K());
            em.o1 o1Var = this.f427184o;
            if (o1Var == null) {
                kotlin.jvm.internal.o.o("rootVB");
                throw null;
            }
            o1Var.e().removeAllViews();
            em.o1 o1Var2 = this.f427184o;
            if (o1Var2 == null) {
                kotlin.jvm.internal.o.o("rootVB");
                throw null;
            }
            android.widget.RelativeLayout e17 = o1Var2.e();
            java.lang.Object obj = this.f427185p;
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type android.view.View");
            e17.addView((android.view.View) obj, new android.view.ViewGroup.LayoutParams(-1, -1));
        }
        R();
        em.o1 o1Var3 = this.f427184o;
        if (o1Var3 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        o1Var3.e().setVisibility(0);
        java.lang.Object obj2 = this.f427185p;
        if (obj2 != null) {
            y51.b bVar = (y51.b) obj2;
            if (((z51.p) bVar.a(z51.p.class)).k()) {
                return;
            }
            em.o1 o1Var4 = this.f427184o;
            if (o1Var4 == null) {
                kotlin.jvm.internal.o.o("rootVB");
                throw null;
            }
            o1Var4.e().removeAllViews();
            em.o1 o1Var5 = this.f427184o;
            if (o1Var5 == null) {
                kotlin.jvm.internal.o.o("rootVB");
                throw null;
            }
            o1Var5.e().addView((android.view.View) obj2, new android.view.ViewGroup.LayoutParams(-1, -1));
            Q("playerView start play", new java.lang.Object[0]);
            bVar.c();
        }
    }

    @Override // mf3.e, kg3.d
    public void h4() {
        Q("onHorizontalUIApply", new java.lang.Object[0]);
        if (this.f427188s != 2) {
            em.o1 o1Var = this.f427184o;
            if (o1Var == null) {
                kotlin.jvm.internal.o.o("rootVB");
                throw null;
            }
            o1Var.e().setVisibility(4);
            y51.c cVar = this.f427185p;
            if (cVar != null) {
                ((y51.b) cVar).b();
            }
        }
        W(false);
        this.f427188s = 2;
    }

    @Override // mf3.e, mf3.l
    public void i() {
        this.f326111n = false;
        y51.c cVar = this.f427185p;
        if (cVar != null) {
            ((y51.b) cVar).b();
        }
        em.o1 o1Var = this.f427184o;
        if (o1Var == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        o1Var.d().setEnabled(false);
        em.o1 o1Var2 = this.f427184o;
        if (o1Var2 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.image.SwitchableImageContainer i17 = o1Var2.i();
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = i17.f148562d;
        if (multiTouchImageView != null) {
            multiTouchImageView.i();
        }
        com.tencent.mm.ui.base.WxImageView wxImageView = i17.sampleImageView;
        if (wxImageView != null) {
            wxImageView.i();
        }
        R();
    }

    @Override // mg3.d
    public void k(android.view.MotionEvent e17) {
        mf3.k kVar;
        dg3.m mVar;
        kotlin.jvm.internal.o.g(e17, "e");
        mf3.s sVar = this.f326110m;
        if (sVar == null || (kVar = sVar.f326117a) == null || (mVar = (dg3.m) H(dg3.m.class)) == null) {
            return;
        }
        mVar.y6(kVar, this.f326104d);
    }

    @Override // mf3.l
    public mg3.b l() {
        em.o1 o1Var = this.f427184o;
        if (o1Var != null) {
            return o1Var.d();
        }
        kotlin.jvm.internal.o.o("rootVB");
        throw null;
    }

    @Override // mf3.l
    public void onPause() {
        y51.c cVar = this.f427185p;
        if (cVar != null) {
            ((y51.b) cVar).b();
        }
    }

    @Override // ml5.g
    public void onScroll(float f17, float f18) {
        em.o1 o1Var = this.f427184o;
        if (o1Var != null) {
            o1Var.h().A(f17, f18);
        } else {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
    }

    @Override // mf3.l
    public void q(float f17) {
        y51.c cVar;
        if (f17 > 0.5f || (cVar = this.f427185p) == null) {
            return;
        }
        ((y51.b) cVar).b();
    }

    @Override // mf3.e, mf3.l
    public void recycle() {
        super.recycle();
        y51.c cVar = this.f427185p;
        if (cVar != null) {
            ((y51.b) cVar).b();
        }
        y51.c cVar2 = this.f427185p;
        if (cVar2 != null) {
            ((y51.b) cVar2).e();
        }
        em.o1 o1Var = this.f427184o;
        if (o1Var != null) {
            o1Var.d().setEnabled(false);
        } else {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
    }

    @Override // mf3.e, mf3.l
    public void t(mf3.s bindContext) {
        kotlin.jvm.internal.o.g(bindContext, "bindContext");
        super.t(bindContext);
        em.o1 o1Var = this.f427184o;
        if (o1Var == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        o1Var.e().setVisibility(4);
        em.o1 o1Var2 = this.f427184o;
        if (o1Var2 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        o1Var2.b().setVisibility(4);
        em.o1 o1Var3 = this.f427184o;
        if (o1Var3 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        o1Var3.i().setVisibility(0);
        V();
    }

    @Override // mf3.e, mf3.l
    public void u(android.view.View parentView) {
        kotlin.jvm.internal.o.g(parentView, "parentView");
        super.u(parentView);
        em.o1 o1Var = this.f427184o;
        if (o1Var == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        o1Var.g().setCustomScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        em.o1 o1Var2 = this.f427184o;
        if (o1Var2 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.image.SwitchableImageContainer i17 = o1Var2.i();
        sf3.e eVar = (sf3.e) H(sf3.e.class);
        i17.setInnerLoader(eVar != null ? eVar.create() : null);
        em.o1 o1Var3 = this.f427184o;
        if (o1Var3 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        i17.setSampleImageView(o1Var3.h());
        com.tencent.mm.ui.base.WxImageView sampleImageView = i17.getSampleImageView();
        if (sampleImageView != null) {
            sampleImageView.setDoubleTabZoomToNormal(true);
        }
        i17.d();
        i17.setListener(this);
        em.o1 o1Var4 = this.f427184o;
        if (o1Var4 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.live.LiveSwitchableContainer f17 = o1Var4.f();
        em.o1 o1Var5 = this.f427184o;
        if (o1Var5 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        f17.setDelegate(o1Var5.i());
        em.o1 o1Var6 = this.f427184o;
        if (o1Var6 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer d17 = o1Var6.d();
        d17.setEnableTouch(false);
        d17.setHasBorder(false);
        d17.setEnableOverScroll(false);
        d17.setBackgroundColor(d17.getContext().getResources().getColor(android.R.color.transparent));
        d17.setGestureListener(this);
        d17.setCropLayoutTouchListener(this);
    }

    @Override // ml5.g
    public void y(float f17, float f18, float f19) {
        em.o1 o1Var = this.f427184o;
        if (o1Var != null) {
            o1Var.h().z(f17, f18, f19);
        } else {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
    }

    @Override // rf3.v
    public void z(sf3.g param) {
        kotlin.jvm.internal.o.g(param, "param");
        ym5.a1.f(new uf3.e(this));
    }
}
