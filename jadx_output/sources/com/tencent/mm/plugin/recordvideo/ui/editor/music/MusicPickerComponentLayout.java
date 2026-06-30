package com.tencent.mm.plugin.recordvideo.ui.editor.music;

/* loaded from: classes5.dex */
public abstract class MusicPickerComponentLayout extends com.tencent.mm.plugin.recordvideo.ui.editor.music.component.BaseMusicPickerComponentLayout {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f156138f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.q f156139g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.p f156140h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f156141i;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f156142s;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MusicPickerComponentLayout(android.content.Context r1, android.util.AttributeSet r2, boolean r3, int r4, kotlin.jvm.internal.i r5) {
        /*
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto La
            r3 = 0
        La:
            java.lang.String r4 = "context"
            kotlin.jvm.internal.o.g(r1, r4)
            r0.<init>(r1, r2)
            r0.f156142s = r3
            java.lang.String r2 = "MicroMsg.MusicPickerComponentLayout"
            r0.f156138f = r2
            r2 = 2131494398(0x7f0c05fe, float:1.8612303E38)
            android.view.View.inflate(r1, r2, r0)
            r0.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout.<init>(android.content.Context, android.util.AttributeSet, boolean, int, kotlin.jvm.internal.i):void");
    }

    public boolean a() {
        return this.f156142s;
    }

    public com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment c(int i17) {
        boolean f17 = f();
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f d17 = d();
        kotlin.jvm.internal.i iVar = null;
        ev3.d w17 = d17 != null ? d17.w() : null;
        com.tencent.mm.plugin.vlog.model.i0 scene = getPageType();
        boolean a17 = a();
        kotlin.jvm.internal.o.g(scene, "scene");
        return i17 != 1 ? i17 != 2 ? i17 != 5 ? i17 != 14 ? i17 != 7 ? i17 != 8 ? i17 != 9 ? i17 != 11 ? i17 != 12 ? new com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerLikeBgmFragment(w17, f17) : new com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerRecommendFeedFragment(w17, f17, scene) : new com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerNewLifeRecommendDataFragment(w17, f17) : new com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerLikeFragment(w17, f17, a17) : new com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerShootRecommendFragment(w17, f17) : new com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerEditRecommendFragment(w17, f17, a17) : new com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerRecentlyPlayedFragment(w17, f17, a17) : new com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerTemplateClipRecommendFragment(w17) : new com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerLikeBgmFragment(w17, f17) : new com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment(w17, false, 2, iVar);
    }

    public final com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f d() {
        return (com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f) b(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f.class);
    }

    public final androidx.fragment.app.Fragment e(java.lang.Class fragmentClass) {
        kotlin.jvm.internal.o.g(fragmentClass, "fragmentClass");
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0 h0Var = (com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0) b(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0.class);
        androidx.fragment.app.Fragment o17 = h0Var != null ? h0Var.o(getDefaultSelectPageTabType()) : null;
        if (fragmentClass.isInstance(o17)) {
            return (androidx.fragment.app.Fragment) fragmentClass.cast(o17);
        }
        return null;
    }

    public boolean f() {
        return this instanceof com.tencent.mm.mj_publisher.finder.composing_creation.music.CreationComposingMusicPickerComponentLayout;
    }

    public boolean g() {
        return false;
    }

    public abstract int getDefaultSelectPageTabType();

    public int getLikeTabType() {
        return 2;
    }

    public final yz5.q getMusicClipChangeListener$plugin_recordvideo_release() {
        return this.f156139g;
    }

    public final yz5.p getMusicClipInitialRangeProvider$plugin_recordvideo_release() {
        return this.f156140h;
    }

    public final yz5.l getMusicClipPlayProgressListenerRegistrar$plugin_recordvideo_release() {
        return this.f156141i;
    }

    public com.tencent.mm.plugin.vlog.model.i0 getPageType() {
        return com.tencent.mm.plugin.vlog.model.i0.f175612d;
    }

    public abstract int[] getPageTypeArray();

    public int getPagerDefaultSelectTabType() {
        return getDefaultSelectPageTabType();
    }

    public final void h() {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.a aVar = (com.tencent.mm.plugin.recordvideo.ui.editor.music.component.a) b(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.a.class);
        if (aVar != null) {
            com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1 b1Var = (com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1) aVar;
            b1Var.z();
            b1Var.C.dead();
        }
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0 h0Var = (com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0) b(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0.class);
        if (h0Var != null) {
            java.util.Iterator it = h0Var.f156238o.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                ((com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment) ((jz5.l) next).f302834e).p0();
                i17 = i18;
            }
        }
    }

    public void i(boolean z17) {
    }

    public void j(fv3.d status, android.os.Bundle bundle) {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f d17;
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a aVar;
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a aVar2;
        java.lang.String string;
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a aVar3;
        java.lang.String string2;
        androidx.viewpager.widget.ViewPager q17;
        oa.i k17;
        kotlin.jvm.internal.o.g(status, "status");
        if (status == com.tencent.mm.plugin.recordvideo.ui.editor.music.component.i0.f156244d) {
            if (bundle != null) {
                int i17 = bundle.getInt("key_page_to_select");
                com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e1 e1Var = (com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e1) b(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e1.class);
                if (e1Var != null) {
                    com.tencent.mars.xlog.Log.i(e1Var.f156215n, "selectTabByPosition position = " + i17);
                    com.google.android.material.tabs.TabLayout tabLayout = e1Var.f156216o;
                    if (tabLayout == null || (k17 = tabLayout.k(i17)) == null || k17.a()) {
                        return;
                    }
                    k17.b();
                    return;
                }
                return;
            }
            return;
        }
        if (status == com.tencent.mm.plugin.recordvideo.ui.editor.music.component.i0.f156245e) {
            if (bundle != null) {
                int i18 = bundle.getInt("key_tab_to_select");
                com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0 h0Var = (com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0) b(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0.class);
                if (h0Var == null || (q17 = h0Var.q()) == null) {
                    return;
                }
                q17.setCurrentItem(i18);
                return;
            }
            return;
        }
        if (status == com.tencent.mm.plugin.recordvideo.ui.editor.music.component.i0.f156246f) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.f486045pz5);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/MusicPickerComponentLayout", "statusChange", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/component/base/IComponentStatusEnum;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/recordvideo/ui/editor/music/MusicPickerComponentLayout", "statusChange", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/component/base/IComponentStatusEnum;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f d18 = d();
            if (d18 != null) {
                d18.u();
                return;
            }
            return;
        }
        java.lang.String str = "";
        if (status == com.tencent.mm.plugin.recordvideo.ui.editor.music.component.i0.f156247g) {
            if (bundle != null && (string2 = bundle.getString("key_string_1")) != null) {
                str = string2;
            }
            com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f d19 = d();
            if (d19 == null || (aVar3 = d19.f156222o) == null) {
                return;
            }
            aVar3.f(str);
            return;
        }
        if (status == com.tencent.mm.plugin.recordvideo.ui.editor.music.component.i0.f156249i) {
            int i19 = bundle != null ? bundle.getInt("key_int") : 0;
            long j17 = bundle != null ? bundle.getLong("key_long") : 0L;
            if (bundle != null && (string = bundle.getString("key_string_1")) != null) {
                str = string;
            }
            com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f d27 = d();
            if (d27 == null || (aVar2 = d27.f156222o) == null) {
                return;
            }
            aVar2.h(str, i19, j17);
            return;
        }
        if (status == com.tencent.mm.plugin.recordvideo.ui.editor.music.component.i0.f156248h) {
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f486045pz5);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/MusicPickerComponentLayout", "statusChange", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/component/base/IComponentStatusEnum;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/recordvideo/ui/editor/music/MusicPickerComponentLayout", "statusChange", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/component/base/IComponentStatusEnum;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f d28 = d();
            if (d28 == null || (aVar = d28.f156222o) == null) {
                return;
            }
            aVar.o();
            return;
        }
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.i0 i0Var = com.tencent.mm.plugin.recordvideo.ui.editor.music.component.i0.f156250m;
        java.lang.String str2 = this.f156138f;
        if (status == i0Var) {
            if (bundle != null) {
                boolean z17 = bundle.getBoolean("key_boolean", false);
                com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f d29 = d();
                if (d29 != null) {
                    com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = z17 ? d29.f156220m.f413388b : null;
                    com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a aVar4 = d29.f156222o;
                    if (aVar4 != null) {
                        aVar4.s(z17, audioCacheInfo);
                    }
                    d29.t(audioCacheInfo, audioCacheInfo == null);
                }
                com.tencent.mars.xlog.Log.i(str2, "statusChange: mute music " + z17);
                return;
            }
            return;
        }
        if (status == com.tencent.mm.plugin.recordvideo.ui.editor.music.component.i0.f156251n) {
            if (bundle != null) {
                boolean z18 = bundle.getBoolean("key_boolean", false);
                com.tencent.mars.xlog.Log.i(str2, "statusChange: mute origin " + z18);
                com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f d37 = d();
                if (d37 != null) {
                    com.tencent.mars.xlog.Log.i(d37.f156219i, "onToggleWithOriginCallback: on:" + z18);
                    boolean z19 = z18 ^ true;
                    com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a aVar5 = d37.f156222o;
                    if (aVar5 != null) {
                        aVar5.g(z19);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (status == com.tencent.mm.plugin.recordvideo.ui.editor.music.component.i0.f156252o) {
            if (bundle != null) {
                boolean z27 = bundle.getBoolean("key_boolean", false);
                boolean z28 = bundle.getBoolean("KEY_FROM_CLICK", false);
                com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f d38 = d();
                if (d38 != null) {
                    com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f.v(d38, z27, z28, false, 4, null);
                }
                com.tencent.mars.xlog.Log.i(str2, "statusChange: lyrics " + z27);
                return;
            }
            return;
        }
        if (status == com.tencent.mm.plugin.recordvideo.ui.editor.music.component.i0.f156253p) {
            if (bundle != null) {
                boolean z29 = bundle.getBoolean("key_boolean", false);
                com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0 e0Var = (com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0) b(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0.class);
                if (e0Var != null) {
                    e0Var.E(z29);
                    return;
                }
                return;
            }
            return;
        }
        if (status != com.tencent.mm.plugin.recordvideo.ui.editor.music.component.i0.f156254q || bundle == null) {
            return;
        }
        boolean z37 = bundle.getBoolean("key_boolean", false);
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0 e0Var2 = (com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0) b(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0.class);
        if (e0Var2 != null) {
            e0Var2.E(true);
            if (e0Var2.G) {
                android.view.View q18 = e0Var2.q();
                int i27 = z37 ? 0 : 4;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(java.lang.Integer.valueOf(i27));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(q18, arrayList3.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicOptionComponent", "refreshStatusOnAudioSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                q18.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(q18, "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicOptionComponent", "refreshStatusOnAudioSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (!e0Var2.s(3) || (d17 = d()) == null) {
                return;
            }
            com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f.v(d17, z37, false, false, 4, null);
        }
    }

    public com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f k() {
        return new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f(this, this, getDefaultSelectPageTabType());
    }

    public com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0 l() {
        return new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0(this, this, com.tencent.mm.ui.bl.c(getContext()));
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.base.AbsMusicPickerAutoRegisterComponentLayout, fv3.b
    public void m() {
        k();
        l();
        o();
        new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e1(this, this, getPageTypeArray(), getPagerDefaultSelectTabType(), g());
        n();
        super.m();
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0 e0Var = (com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0) b(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0.class);
        if (e0Var != null) {
            e0Var.a(q());
        }
    }

    public com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0 n() {
        return new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0(this, this, getPageTypeArray(), getPagerDefaultSelectTabType(), new cv3.e(this));
    }

    public abstract com.tencent.mm.plugin.recordvideo.ui.editor.music.component.a o();

    public void p(boolean z17, boolean z18) {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0 e0Var = (com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0) b(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0.class);
        if (e0Var != null) {
            boolean z19 = !z18;
            e0Var.J(2, z19);
            if (z17) {
                android.view.View u17 = e0Var.u();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(u17, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicOptionComponent", "setupMuteOrigin", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                u17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(u17, "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicOptionComponent", "setupMuteOrigin", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                jz5.g gVar = e0Var.f156199n;
                if (z18) {
                    e0Var.z((com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) gVar).getValue(), false);
                    e0Var.x(e0Var.u(), com.tencent.mm.R.id.f482772nk, com.tencent.mm.R.string.f489949ge);
                } else {
                    e0Var.z((com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) gVar).getValue(), true);
                    e0Var.x(e0Var.u(), com.tencent.mm.R.id.f482772nk, com.tencent.mm.R.string.f489950gf);
                }
                e0Var.I(e0Var.u(), e0Var.v().getText().toString(), z19);
            } else {
                android.view.View u18 = e0Var.u();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(u18, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicOptionComponent", "setupMuteOrigin", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                u18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(u18, "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicOptionComponent", "setupMuteOrigin", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            e0Var.w();
        }
    }

    public boolean q() {
        return false;
    }

    public final void setBehaviorCallback(com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a aVar) {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f d17 = d();
        if (d17 == null) {
            return;
        }
        d17.f156222o = aVar;
    }

    public final void setMusicClipInitialRangeProvider(yz5.p pVar) {
        this.f156140h = pVar;
    }

    public final void setMusicClipPlayProgressListenerRegistrar(yz5.l lVar) {
        this.f156141i = lVar;
    }

    public final void setOnMusicClipChange(yz5.q qVar) {
        this.f156139g = qVar;
    }

    public final void setOnVolumeAdjustClickListener(android.view.View.OnClickListener onClickListener) {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0 e0Var = (com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0) b(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0.class);
        if (e0Var != null) {
            e0Var.f156211z = onClickListener;
        }
    }

    public void setPlayFirstSongOnRecommendFinish(boolean z17) {
    }

    public final void setupLyricsGroup(boolean z17) {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0 e0Var = (com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0) b(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0.class);
        if (e0Var != null) {
            if (e0Var.f156210y) {
                e0Var.G = false;
                android.view.View q17 = e0Var.q();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(q17, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicOptionComponent", "setupLyricsGroup", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                q17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(q17, "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicOptionComponent", "setupLyricsGroup", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            boolean z18 = z17 && ((tt3.a) tt3.b.f422037b.a()).f422033f;
            e0Var.G = z18;
            if (z18) {
                android.view.View q18 = e0Var.q();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(q18, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicOptionComponent", "setupLyricsGroup", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                q18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(q18, "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicOptionComponent", "setupLyricsGroup", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            android.view.View q19 = e0Var.q();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(q19, arrayList3.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicOptionComponent", "setupLyricsGroup", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            q19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(q19, "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicOptionComponent", "setupLyricsGroup", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
