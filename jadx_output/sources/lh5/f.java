package lh5;

/* loaded from: classes11.dex */
public final class f extends lc3.b0 {

    /* renamed from: h, reason: collision with root package name */
    public android.view.animation.Animation f318732h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.animation.Animation f318733i;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f318730f = {15.0f, 12.0f, 9.0f, 6.0f, 3.0f};

    /* renamed from: g, reason: collision with root package name */
    public final long[] f318731g = {0, 50, 100, 150, 200};

    /* renamed from: j, reason: collision with root package name */
    public final java.util.LinkedList f318734j = new java.util.LinkedList();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.LinkedList f318735k = new java.util.LinkedList();

    /* renamed from: l, reason: collision with root package name */
    public final java.util.LinkedList f318736l = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f318737m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f318738n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f318739o = new java.util.LinkedList();

    @Override // lc3.c0
    public java.lang.String f() {
        return "shakeVisibleBubblesAndAvatars";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        lc3.a0 k17;
        java.util.LinkedList linkedList;
        java.lang.Object obj;
        android.view.animation.AnimationSet animationSet;
        kotlin.jvm.internal.o.g(data, "data");
        yz5.l s17 = s();
        lc3.e eVar = this.f317890a;
        kotlin.jvm.internal.o.d(eVar);
        kh5.h hVar = (kh5.h) eVar;
        java.lang.String str = "MicroMsg.MEShakeBubblesAndAvatar";
        com.tencent.mars.xlog.Log.i("MicroMsg.MEShakeBubblesAndAvatar", "[MB] shake");
        android.view.animation.Animation animation = this.f318732h;
        java.util.LinkedList linkedList2 = this.f318737m;
        java.util.LinkedList linkedList3 = this.f318734j;
        java.util.LinkedList linkedList4 = this.f318739o;
        java.util.LinkedList linkedList5 = this.f318736l;
        java.util.LinkedList linkedList6 = this.f318738n;
        java.util.LinkedList linkedList7 = this.f318735k;
        float[] fArr = this.f318730f;
        if (animation == null || this.f318733i == null) {
            this.f318732h = android.view.animation.AnimationUtils.loadAnimation(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.anim.f477820ce);
            this.f318733i = android.view.animation.AnimationUtils.loadAnimation(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.anim.f477821cf);
            int i17 = 0;
            while (i17 < 5) {
                float f17 = fArr[i17];
                long j17 = this.f318731g[i17];
                float f18 = (-2) * f17;
                yz5.l lVar = s17;
                float f19 = 2 * f17;
                kh5.h hVar2 = hVar;
                java.lang.String str2 = str;
                java.util.LinkedList linkedList8 = linkedList2;
                java.util.List i18 = kz5.c0.i(new lh5.e(f17, 50L, j17), new lh5.e(f18, 100L, 50 + j17), new lh5.e(f19, 100L, 150 + j17), new lh5.e(f18, 100L, 250 + j17), new lh5.e(f17, 50L, com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE + j17));
                android.view.animation.AnimationSet u17 = u(i18, 0.0f);
                u17.addAnimation(this.f318732h);
                linkedList7.add(u17);
                android.view.animation.AnimationSet u18 = u(i18, 0.0f);
                u18.addAnimation(this.f318733i);
                linkedList6.add(u18);
                android.view.animation.AnimationSet u19 = u(i18, 1.0f);
                u19.addAnimation(this.f318732h);
                linkedList5.add(u19);
                android.view.animation.AnimationSet u27 = u(i18, 1.0f);
                u27.addAnimation(this.f318733i);
                linkedList4.add(u27);
                java.util.List i19 = kz5.c0.i(new lh5.e(f17, 34L, j17), new lh5.e(f18, 67L, 34 + j17), new lh5.e(f19, 67L, 101 + j17), new lh5.e(f18, 67L, be1.r0.CTRL_INDEX + j17), new lh5.e(f19, 67L, 235 + j17), new lh5.e(f18, 67L, 312 + j17), new lh5.e(f17, 34L, 379 + j17));
                android.view.animation.AnimationSet u28 = u(i19, 0.5f);
                u28.addAnimation(this.f318732h);
                linkedList3.add(u28);
                android.view.animation.AnimationSet u29 = u(i19, 0.5f);
                u29.addAnimation(this.f318733i);
                linkedList8.add(u29);
                i17++;
                linkedList6 = linkedList6;
                linkedList7 = linkedList7;
                hVar = hVar2;
                str = str2;
                linkedList2 = linkedList8;
                s17 = lVar;
            }
        }
        yz5.l lVar2 = s17;
        java.lang.String str3 = str;
        java.util.LinkedList linkedList9 = linkedList2;
        java.util.LinkedList linkedList10 = linkedList6;
        java.util.LinkedList linkedList11 = linkedList7;
        java.util.List c17 = mh5.a.c(hVar.f308071h, true);
        if (c17 == null) {
            com.tencent.mars.xlog.Log.e(str3, "[MB] no visible views");
            k17 = h(1, "no visible views");
        } else {
            boolean optBoolean = data.optBoolean("isFrom", false);
            java.util.ArrayList arrayList = (java.util.ArrayList) c17;
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                android.util.Pair pair = (android.util.Pair) it.next();
                com.tencent.mm.ui.chatting.viewitems.g0 g0Var = (com.tencent.mm.ui.chatting.viewitems.g0) pair.second;
                android.view.View mainContainerView = g0Var instanceof com.tencent.mm.ui.chatting.viewitems.ya ? ((com.tencent.mm.ui.chatting.viewitems.ya) g0Var).f206063n : g0Var.getMainContainerView();
                com.tencent.mm.ui.chatting.view.ChattingAvatarImageView chattingAvatarImageView = g0Var.avatarIV;
                int size = (arrayList.size() - arrayList.indexOf(pair)) - 1;
                if (size >= fArr.length) {
                    size = fArr.length - 1;
                }
                if (mainContainerView != null) {
                    if (g0Var.chattingItem.M()) {
                        android.view.animation.AnimationSet animationSet2 = (android.view.animation.AnimationSet) (optBoolean ? linkedList5.get(size) : linkedList4.get(size));
                        kotlin.jvm.internal.o.d(animationSet2);
                        animationSet = animationSet2;
                        linkedList = linkedList11;
                    } else {
                        if (optBoolean) {
                            linkedList = linkedList11;
                            obj = linkedList.get(size);
                        } else {
                            linkedList = linkedList11;
                            obj = linkedList10.get(size);
                        }
                        animationSet = (android.view.animation.AnimationSet) obj;
                        kotlin.jvm.internal.o.d(animationSet);
                    }
                    animationSet.setAnimationListener(new lh5.d(mainContainerView));
                    mainContainerView.startAnimation(animationSet);
                } else {
                    linkedList = linkedList11;
                }
                if (chattingAvatarImageView != null) {
                    java.lang.Object obj2 = optBoolean ? linkedList3.get(size) : linkedList9.get(size);
                    kotlin.jvm.internal.o.f(obj2, "get(...)");
                    android.view.animation.Animation animation2 = (android.view.animation.Animation) obj2;
                    animation2.setAnimationListener(new lh5.d(chattingAvatarImageView));
                    chattingAvatarImageView.startAnimation(animation2);
                }
                linkedList11 = linkedList;
            }
            k17 = k();
        }
        lVar2.invoke(k17);
    }

    public final android.view.animation.AnimationSet u(java.util.List list, float f17) {
        android.view.animation.AnimationSet animationSet = new android.view.animation.AnimationSet(false);
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            lh5.e eVar = (lh5.e) list.get(i17);
            android.view.animation.RotateAnimation rotateAnimation = new android.view.animation.RotateAnimation(0.0f, eVar.f318727a, 1, f17, 1, 0.0f);
            rotateAnimation.setDuration(eVar.f318728b);
            rotateAnimation.setStartOffset(eVar.f318729c);
            if (i17 == 0) {
                rotateAnimation.setInterpolator(new android.view.animation.AccelerateInterpolator());
            } else if (i17 == list.size() - 1) {
                rotateAnimation.setInterpolator(new android.view.animation.DecelerateInterpolator());
            } else {
                rotateAnimation.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
            }
            animationSet.addAnimation(rotateAnimation);
        }
        return animationSet;
    }
}
