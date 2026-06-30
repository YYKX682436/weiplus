package com.tencent.mm.plugin.finder.view.interactioneasteregg;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%B#\b\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010&\u001a\u00020\u0002¢\u0006\u0004\b$\u0010'J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R*\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000f8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\rR.\u0010\u001f\u001a\u0004\u0018\u00010\u00182\b\u0010\u0007\u001a\u0004\u0018\u00010\u00188\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006("}, d2 = {"Lcom/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEgg;", "Landroid/widget/FrameLayout;", "", "svgResId", "Ljz5/f0;", "setTitle", "", "value", "s", "Z", "getEmojiDownloadComplete", "()Z", "setEmojiDownloadComplete", "(Z)V", "emojiDownloadComplete", "Le06/k;", "u", "Le06/k;", "setEmojiSize", "(Le06/k;)V", "emojiSize", org.chromium.base.BaseSwitches.V, "isPreview", "setPreview", "Lcom/tencent/mm/api/IEmojiInfo;", "w", "Lcom/tencent/mm/api/IEmojiInfo;", "getEmoji", "()Lcom/tencent/mm/api/IEmojiInfo;", "setEmoji", "(Lcom/tencent/mm/api/IEmojiInfo;)V", "emoji", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class CenterInteractionEasterEgg extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public long f132369d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f132370e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f132371f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f132372g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderEmojiView f132373h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f132374i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.view.MMPAGView f132375m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f132376n;

    /* renamed from: o, reason: collision with root package name */
    public final int f132377o;

    /* renamed from: p, reason: collision with root package name */
    public final int f132378p;

    /* renamed from: q, reason: collision with root package name */
    public final int f132379q;

    /* renamed from: r, reason: collision with root package name */
    public final int f132380r;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public boolean emojiDownloadComplete;

    /* renamed from: t, reason: collision with root package name */
    public boolean f132382t;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public e06.k emojiSize;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public boolean isPreview;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.api.IEmojiInfo emoji;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f132386x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f132387y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CenterInteractionEasterEgg(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f132377o = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479727dj);
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479731dn);
        this.f132378p = dimensionPixelSize;
        this.f132379q = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479734dr);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479659bw);
        this.f132380r = dimensionPixelSize2;
        this.emojiSize = new e06.k(dimensionPixelSize, dimensionPixelSize2);
        this.f132386x = new int[2];
    }

    private final void setEmoji(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        if (kotlin.jvm.internal.o.b(this.emoji, iEmojiInfo)) {
            return;
        }
        setEmojiDownloadComplete(false);
        this.emoji = iEmojiInfo;
        if (iEmojiInfo == null) {
            com.tencent.mm.plugin.finder.view.FinderEmojiView finderEmojiView = this.f132373h;
            if (finderEmojiView == null) {
                return;
            }
            finderEmojiView.setEmojiInfo(null);
            return;
        }
        com.tencent.mm.plugin.finder.view.FinderEmojiView finderEmojiView2 = this.f132373h;
        if (finderEmojiView2 != null) {
            finderEmojiView2.setStatusListener(new ox2.c(this, iEmojiInfo));
        }
        com.tencent.mm.plugin.finder.view.FinderEmojiView finderEmojiView3 = this.f132373h;
        if (finderEmojiView3 != null) {
            finderEmojiView3.setEmojiInfo(iEmojiInfo);
        }
        com.tencent.mm.plugin.finder.view.FinderEmojiView finderEmojiView4 = this.f132373h;
        if (finderEmojiView4 != null) {
            finderEmojiView4.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setEmojiDownloadComplete(boolean z17) {
        if (this.emojiDownloadComplete == z17) {
            return;
        }
        this.emojiDownloadComplete = z17;
        if (z17) {
            h();
        }
    }

    private final void setEmojiSize(e06.k kVar) {
        com.tencent.mm.api.IEmojiInfo iEmojiInfo;
        com.tencent.mm.plugin.finder.view.FinderEmojiView finderEmojiView;
        this.emojiSize = kVar;
        if (!this.emojiDownloadComplete || (iEmojiInfo = this.emoji) == null || (finderEmojiView = this.f132373h) == null) {
            return;
        }
        hc2.f1.z(finderEmojiView, iEmojiInfo, new ox2.a(this), new ox2.b(this));
    }

    private final void setTitle(int i17) {
        int h17 = i65.a.h(getContext(), this.isPreview ? com.tencent.mm.R.dimen.f479688cn : com.tencent.mm.R.dimen.f479693cs);
        android.widget.TextView textView = this.f132372g;
        if (textView != null) {
            textView.setTextSize(0, i65.a.h(getContext(), this.isPreview ? com.tencent.mm.R.dimen.f479672c9 : com.tencent.mm.R.dimen.f479674cb));
        }
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.f493352om1);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        android.widget.TextView textView2 = this.f132372g;
        if (textView2 == null) {
            return;
        }
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        textView2.setText(hc2.x0.k(string, context, '#', i17, com.tencent.mm.R.color.aby, h17, h17, 0, 0, 0, com.tencent.wcdb.FileUtils.S_IRWXU, null));
    }

    public final android.animation.AnimatorSet b(long j17, android.view.View thumbOrHeartView, android.view.View view) {
        kotlin.jvm.internal.o.g(thumbOrHeartView, "thumbOrHeartView");
        if (!this.emojiDownloadComplete) {
            com.tencent.mars.xlog.Log.w("InteractionEasterEggCenter", "start: emoji 没有下载完，不显示彩蛋");
            setVisibility(8);
            return null;
        }
        com.tencent.mars.xlog.Log.i("InteractionEasterEggCenter", "getEmojiAnimation startDelay: " + j17);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new android.view.animation.AccelerateInterpolator());
        ofFloat.addUpdateListener(new ox2.q(thumbOrHeartView));
        ox2.r rVar = new ox2.r(thumbOrHeartView);
        ofFloat.addListener(new ox2.s(rVar, rVar, thumbOrHeartView));
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setDuration(100L);
        ofFloat2.setInterpolator(new android.view.animation.AccelerateInterpolator());
        ofFloat2.addUpdateListener(new ox2.o(this));
        ox2.p pVar = new ox2.p(this);
        ofFloat2.addListener(new ox2.n(pVar, this, pVar, this, view));
        android.animation.ValueAnimator ofFloat3 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat3.setDuration(100L);
        ofFloat3.addUpdateListener(new ox2.k(this, view));
        ox2.l lVar = new ox2.l(this, view);
        ofFloat3.addListener(new ox2.m(lVar, lVar));
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        animatorSet2.playTogether(ofFloat2, ofFloat3);
        cq.k1.a();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        long floatValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127738he).getValue()).r()).floatValue() * ((float) 1000);
        android.animation.ValueAnimator ofFloat4 = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat4.setStartDelay(floatValue);
        ofFloat4.setDuration(300L);
        ofFloat4.addUpdateListener(new ox2.f(this, view));
        ox2.g gVar = new ox2.g(this, view);
        ofFloat4.addListener(new ox2.h(gVar, gVar));
        animatorSet.playSequentially(ofFloat, animatorSet2, ofFloat4);
        animatorSet.setStartDelay(j17);
        ox2.e eVar = new ox2.e(this);
        animatorSet.addListener(new ox2.d(eVar, eVar));
        return animatorSet;
    }

    public final boolean c() {
        java.lang.String a17;
        try {
            a17 = su2.p.f412767a.a(su2.h.f412743f);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("InteractionEasterEggCenter", "initPag e:" + th6);
        }
        if (a17 == null) {
            com.tencent.mars.xlog.Log.w("InteractionEasterEggCenter", "initPag: resource is null");
            this.f132387y = false;
            return false;
        }
        com.tencent.mars.xlog.Log.i("InteractionEasterEggCenter", "initPag: resource valid");
        com.tencent.mm.view.MMPAGView mMPAGView = this.f132375m;
        if (mMPAGView != null) {
            cq.k1.a();
            mMPAGView.o(((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.Z0().r()).booleanValue());
            if (mMPAGView.getUseRfx()) {
                mMPAGView.setComposition(com.tencent.mm.rfx.RfxPagFile.Load(a17));
            } else {
                mMPAGView.setComposition(org.libpag.PAGFile.Load(a17));
            }
            this.f132387y = true;
            return true;
        }
        this.f132387y = false;
        return false;
    }

    public final void d(int i17, int i18) {
        setVisibility(0);
        setAlpha(0.0f);
        android.view.View view = this.f132371f;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEgg", "initWithCenterPosition", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEgg", "initWithCenterPosition", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.f132374i;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEgg", "initWithCenterPosition", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEgg", "initWithCenterPosition", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view3 = this.f132376n;
        if (view3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEgg", "initWithCenterPosition", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEgg", "initWithCenterPosition", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view4 = this.f132371f;
        if (view4 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEgg", "initWithCenterPosition", "(II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view4.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEgg", "initWithCenterPosition", "(II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View view5 = this.f132371f;
        if (view5 != null) {
            view5.post(new ox2.i(this, i17, i18));
        }
        com.tencent.mars.xlog.Log.i("InteractionEasterEggCenter", "initWithCenterPosition x: " + i17 + " y: " + i18);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r18, java.lang.String r20, com.tencent.mm.api.IEmojiInfo r21) {
        /*
            r17 = this;
            r11 = r17
            r12 = r18
            r14 = r21
            r11.f132369d = r12
            r0 = r20
            r11.f132370e = r0
            r11.setEmoji(r14)
            r0 = 0
            r11.f132382t = r0
            boolean r0 = r11.isPreview
            java.lang.String r10 = "InteractionEasterEggCenter"
            if (r0 != 0) goto L1b
        L18:
            r15 = r10
            goto Lc1
        L1b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "report29179 feedId: "
            r0.<init>(r1)
            long r1 = r11.f132369d
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r10, r0)
            android.content.Context r0 = r17.getContext()
            java.lang.String r1 = "getContext(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            boolean r1 = r0 instanceof com.tencent.mm.ui.MMFragmentActivity
            if (r1 == 0) goto L4c
            androidx.appcompat.app.AppCompatActivity r0 = (androidx.appcompat.app.AppCompatActivity) r0
            pf5.z r1 = pf5.z.f353948a
            pf5.v r0 = r1.a(r0)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.ny> r1 = com.tencent.mm.plugin.finder.viewmodel.component.ny.class
            androidx.lifecycle.c1 r0 = r0.a(r1)
            com.tencent.mm.plugin.finder.viewmodel.component.ny r0 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) r0
            goto L4d
        L4c:
            r0 = 0
        L4d:
            if (r0 == 0) goto L54
            r45.qt2 r0 = r0.V6()
            goto L55
        L54:
            r0 = 0
        L55:
            if (r0 != 0) goto L69
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "report29179: contextObj:"
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.mars.xlog.Log.w(r10, r0)
            goto L18
        L69:
            java.lang.Class<com.tencent.mm.plugin.finder.report.o3> r1 = com.tencent.mm.plugin.finder.report.o3.class
            i95.m r1 = i95.n0.c(r1)
            java.lang.String r2 = "getService(...)"
            kotlin.jvm.internal.o.f(r1, r2)
            com.tencent.mm.plugin.finder.report.o3 r1 = (com.tencent.mm.plugin.finder.report.o3) r1
            long r2 = r11.f132369d
            java.lang.String r4 = r11.f132370e
            r5 = 5
            int r0 = r0.getInteger(r5)
            java.lang.String r0 = r1.ek(r2, r4, r0)
            com.tencent.mm.plugin.finder.report.d2 r1 = com.tencent.mm.plugin.finder.report.d2.f124994a
            java.lang.String r2 = "like_easter_egg_emoji"
            r3 = 128(0x80, float:1.8E-43)
            r4 = 0
            r5 = 0
            r6 = 0
            lz5.m r7 = new lz5.m
            r7.<init>()
            long r8 = r11.f132369d
            java.lang.String r8 = pm0.v.u(r8)
            java.lang.String r9 = "feed_id"
            r7.put(r9, r8)
            java.lang.String r8 = "session_buffer"
            r7.put(r8, r0)
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r8 = "easter_show_position"
            r7.put(r8, r0)
            java.util.Map r7 = kz5.b1.b(r7)
            ox2.j r8 = new ox2.j
            r8.<init>(r11)
            r9 = 56
            r16 = 0
            r0 = r1
            r1 = r17
            r15 = r10
            r10 = r16
            com.tencent.mm.plugin.finder.report.d2.o(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        Lc1:
            r17.h()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onBindFeed feedId: "
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r1 = " emoji: "
            r0.append(r1)
            if (r14 == 0) goto Lda
            java.lang.String r1 = r21.getMd5()
            goto Ldb
        Lda:
            r1 = 0
        Ldb:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r15, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg.e(long, java.lang.String, com.tencent.mm.api.IEmojiInfo):void");
    }

    public final void f() {
        setTitle(com.tencent.mm.R.raw.heart_medium);
    }

    public final void g() {
        setTitle(com.tencent.mm.R.raw.thumb_medium);
    }

    public final com.tencent.mm.api.IEmojiInfo getEmoji() {
        return this.emoji;
    }

    public final boolean getEmojiDownloadComplete() {
        return this.emojiDownloadComplete;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h() {
        android.content.Context context;
        r45.fl2 fl2Var;
        if (this.isPreview && (context = getContext()) != null) {
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
            long j17 = this.f132369d;
            java.lang.String str = this.f132370e;
            com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.emoji;
            boolean z17 = this.f132382t;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateCenterInteractionEasterEgg ");
            sb6.append(j17);
            sb6.append(' ');
            sb6.append(iEmojiInfo != null ? iEmojiInfo.getMd5() : null);
            com.tencent.mars.xlog.Log.i("Finder.FinderReportLogic", sb6.toString());
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            com.tencent.mm.plugin.finder.report.e6 hk6 = com.tencent.mm.plugin.finder.report.o3.hk(o3Var, j17, str, nyVar != null ? nyVar.V6().getInteger(5) : 0, null, 8, null);
            if (hk6 == null || (fl2Var = hk6.f125012a) == null) {
                return;
            }
            try {
                java.lang.String string = fl2Var.getString(5);
                if (string == null) {
                    string = "";
                }
                org.json.JSONObject jSONObject = (string.length() == 0) != false ? new org.json.JSONObject() : new org.json.JSONObject(string);
                jSONObject.put("is_set_trigger_egg", iEmojiInfo == null ? 0 : 1);
                jSONObject.put("is_show_like_egg", z17 ? 1 : 0);
                jSONObject.put("easter_egg_emoji_md5", iEmojiInfo != null ? iEmojiInfo.getMd5() : null);
                jSONObject.put("emoticon_designerid", iEmojiInfo != null ? iEmojiInfo.X0() : null);
                jSONObject.put("emoticon_pid", iEmojiInfo != null ? iEmojiInfo.getGroupId() : null);
                jSONObject.put("emoticon_activityid", iEmojiInfo != null ? iEmojiInfo.S0() : null);
                fl2Var.set(5, jSONObject.toString());
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("Finder.FinderReportLogic", "updateCenterInteractionEasterEgg " + e17.getMessage());
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        com.tencent.mars.xlog.Log.i("InteractionEasterEggCenter", "initView");
        this.f132371f = findViewById(com.tencent.mm.R.id.soy);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.oqh);
        this.f132372g = textView;
        if (textView != null) {
            com.tencent.mm.ui.fk.b(textView);
        }
        this.f132373h = (com.tencent.mm.plugin.finder.view.FinderEmojiView) findViewById(com.tencent.mm.R.id.det);
        this.f132374i = findViewById(com.tencent.mm.R.id.t7y);
        this.f132375m = (com.tencent.mm.view.MMPAGView) findViewById(com.tencent.mm.R.id.vae);
        this.f132376n = findViewById(com.tencent.mm.R.id.vaf);
        c();
    }

    public final void setPreview(boolean z17) {
        this.isPreview = z17;
        int i17 = this.f132379q;
        setEmojiSize(z17 ? new e06.k(this.f132377o, i17) : new e06.k(this.f132378p, this.f132380r));
        android.view.View view = this.f132374i;
        if (view != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = i17;
            layoutParams.height = i17;
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CenterInteractionEasterEgg(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f132377o = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479727dj);
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479731dn);
        this.f132378p = dimensionPixelSize;
        this.f132379q = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479734dr);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479659bw);
        this.f132380r = dimensionPixelSize2;
        this.emojiSize = new e06.k(dimensionPixelSize, dimensionPixelSize2);
        this.f132386x = new int[2];
    }
}
