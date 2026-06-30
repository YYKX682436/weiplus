package fi2;

/* loaded from: classes10.dex */
public final class j1 extends fi2.a {

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView f262848c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f262849d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f262850e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f262851f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f262852g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f262853h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f262854i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f262855j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f262856k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f262857l;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f262858m;

    /* renamed from: n, reason: collision with root package name */
    public int f262859n;

    /* renamed from: o, reason: collision with root package name */
    public int f262860o;

    /* renamed from: p, reason: collision with root package name */
    public int f262861p;

    /* renamed from: q, reason: collision with root package name */
    public int f262862q;

    /* renamed from: r, reason: collision with root package name */
    public int f262863r;

    /* renamed from: s, reason: collision with root package name */
    public int f262864s;

    /* renamed from: t, reason: collision with root package name */
    public int f262865t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f262866u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f262867v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f262868w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(zi2.w plugin) {
        super(plugin);
        kotlin.jvm.internal.o.g(plugin, "plugin");
        this.f262850e = jz5.h.b(new fi2.i1(plugin));
        this.f262851f = jz5.h.b(new fi2.h1(plugin));
        this.f262852g = jz5.h.b(new fi2.g1(plugin));
        this.f262853h = jz5.h.b(new fi2.a1(plugin));
        this.f262854i = jz5.h.b(new fi2.b1(plugin));
        this.f262855j = jz5.h.b(new fi2.f1(plugin));
        this.f262856k = jz5.h.b(new fi2.d1(plugin));
        this.f262857l = jz5.h.b(new fi2.c1(plugin));
        this.f262858m = jz5.h.b(new fi2.e1(this));
        this.f262862q = -1;
        this.f262863r = -1;
        this.f262864s = -1;
        this.f262865t = -1;
        pm0.v.X(new fi2.z0(this, plugin));
    }

    public final fi2.w B() {
        return (fi2.w) ((jz5.n) this.f262857l).getValue();
    }

    public final void C() {
        android.view.View findViewById;
        zi2.w wVar = this.f262801a;
        qo0.c cVar = wVar.f473153p;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = cVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) cVar : null;
        android.view.View findViewById2 = k0Var != null ? k0Var.findViewById(com.tencent.mm.R.id.qs9) : null;
        if (findViewById2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/core/VoiceRoomCoverLogicCore", "initVoiceRoom", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/mic/core/VoiceRoomCoverLogicCore", "initVoiceRoom", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        c50.s0 s0Var = (c50.s0) i95.n0.c(c50.s0.class);
        qo0.c cVar2 = wVar.f473153p;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var2 = cVar2 instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) cVar2 : null;
        if (k0Var2 != null && (findViewById = k0Var2.findViewById(com.tencent.mm.R.id.fh8)) != null) {
            if (((pg2.j0) s0Var).wh()) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/core/VoiceRoomCoverLogicCore", "initVoiceRoom", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                findViewById.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/mic/core/VoiceRoomCoverLogicCore", "initVoiceRoom", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            } else {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/mic/core/VoiceRoomCoverLogicCore", "initVoiceRoom", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/mic/core/VoiceRoomCoverLogicCore", "initVoiceRoom", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        A(0);
    }

    public final boolean D() {
        int i17 = this.f262860o;
        return (i17 == 0 && this.f262859n == 4) || (i17 == 2 && this.f262861p == 16);
    }

    @Override // fi2.m
    public android.view.View a() {
        return this.f262849d;
    }

    @Override // fi2.m
    public void b(boolean z17) {
        android.widget.LinearLayout chatContentLayout;
        android.widget.LinearLayout contentLayout;
        int i17 = 0;
        if (this.f262860o == 2 && this.f262861p == 8) {
            com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView = this.f262848c;
            if (liveVoiceRoomLayoutView != null && (contentLayout = liveVoiceRoomLayoutView.getContentLayout()) != null) {
                int childCount = contentLayout.getChildCount();
                int i18 = 0;
                while (true) {
                    if (i18 >= childCount) {
                        break;
                    }
                    android.view.View childAt = contentLayout.getChildAt(i18);
                    oj2.c cVar = childAt instanceof oj2.c ? (oj2.c) childAt : null;
                    if (cVar != null) {
                        cVar.a0(z17);
                        break;
                    }
                    i18++;
                }
            }
            mh2.n0 f17 = B().f();
            if (f17 != null) {
                int childCount2 = f17.getChildCount();
                while (i17 < childCount2) {
                    android.view.View childAt2 = f17.getChildAt(i17);
                    qh2.d dVar = childAt2 instanceof qh2.d ? (qh2.d) childAt2 : null;
                    if (dVar != null) {
                        dVar.a0(z17);
                    }
                    i17++;
                }
                return;
            }
            return;
        }
        if (!D()) {
            com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView2 = this.f262848c;
            if (liveVoiceRoomLayoutView2 != null) {
                int childCount3 = liveVoiceRoomLayoutView2.getChildCount();
                while (i17 < childCount3) {
                    android.view.View childAt3 = liveVoiceRoomLayoutView2.getChildAt(i17);
                    oj2.c cVar2 = childAt3 instanceof oj2.c ? (oj2.c) childAt3 : null;
                    if (cVar2 != null) {
                        cVar2.a0(z17);
                        return;
                    }
                    i17++;
                }
                return;
            }
            return;
        }
        com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView3 = this.f262848c;
        if (liveVoiceRoomLayoutView3 == null || (chatContentLayout = liveVoiceRoomLayoutView3.getChatContentLayout()) == null) {
            return;
        }
        int childCount4 = chatContentLayout.getChildCount();
        while (i17 < childCount4) {
            android.view.View childAt4 = chatContentLayout.getChildAt(i17);
            oj2.c cVar3 = childAt4 instanceof oj2.c ? (oj2.c) childAt4 : null;
            if (cVar3 != null) {
                cVar3.a0(z17);
                return;
            }
            i17++;
        }
    }

    @Override // fi2.m
    public void e(xh2.a micCoverData) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(micCoverData, "micCoverData");
        ni2.k2 k2Var = (ni2.k2) ((jz5.n) this.f262850e).getValue();
        k2Var.getClass();
        fj2.s sVar = fj2.s.f263183a;
        ml2.w4 w4Var = ml2.w4.f328188f;
        km2.q qVar = micCoverData.f454520a;
        if (qVar == null || (str = qVar.f309172c) == null) {
            str = "";
        }
        fj2.s.h(sVar, w4Var, str, 0, 0, 12, null);
        k2Var.f337362d = micCoverData;
        gk2.e eVar = k2Var.f337360b;
        k2Var.f337363e = ((mm2.y2) eVar.a(mm2.y2.class)).R6(micCoverData.f454521b.f454553e);
        if (((mm2.e1) eVar.a(mm2.e1.class)).b7() || ((mm2.e1) eVar.a(mm2.e1.class)).Z6()) {
            k2Var.a();
            return;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = k2Var.f337364f;
        k0Var.q(k2Var.f337359a.getResources().getString(com.tencent.mm.R.string.lzj, java.lang.Integer.valueOf(micCoverData.f454521b.f454553e)), 17);
        k0Var.v();
    }

    @Override // fi2.m
    public void f(java.lang.String str) {
    }

    @Override // fi2.a, fi2.m
    public void g(java.lang.String str, boolean z17, int i17, int i18) {
        android.graphics.PointF pointF;
        android.view.View findViewById;
        java.lang.String str2 = this.f262802b;
        com.tencent.mars.xlog.Log.i(str2, "showKtvSelfSendFlower: giftThumbUrl=" + str + ", isLongClick=" + z17 + ", startX=" + i17 + ", startY=" + i18);
        if (this.f262848c != null) {
            zi2.w wVar = this.f262801a;
            int b17 = i65.a.b(wVar.f365323d.getContext(), 32);
            android.widget.ImageView imageView = new android.widget.ImageView(wVar.f365323d.getContext());
            imageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(b17, b17));
            ((wo0.b) new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128356f))).c(imageView);
            android.graphics.PointF pointF2 = new android.graphics.PointF(i17, i18);
            fi2.w B = B();
            com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView = this.f262848c;
            B.getClass();
            if (liveVoiceRoomLayoutView == null || (findViewById = liveVoiceRoomLayoutView.findViewById(com.tencent.mm.R.id.qrn)) == null) {
                pointF = null;
            } else {
                findViewById.getLocationOnScreen(new int[2]);
                pointF = new android.graphics.PointF((r12[0] + (findViewById.getWidth() / 2.0f)) - (b17 / 2.0f), r12[1] + (findViewById.getHeight() / 2.0f));
            }
            com.tencent.mars.xlog.Log.i(str2, "showKtvSelfSendFlower: startPoint=" + pointF2 + ", endPoint=" + pointF);
            long j17 = z17 ? 500L : 1650L;
            if (pointF != null) {
                com.tencent.mars.xlog.Log.i(str2, "showKtvSelfSendFlower: starting animation from " + pointF2 + " to " + pointF + ", duration=" + j17);
                ((tg2.g) ((jz5.n) this.f262858m).getValue()).d(imageView, pointF2, pointF, j17);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
    
        if (((kotlinx.coroutines.a) r1).a() == true) goto L8;
     */
    @Override // fi2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h() {
        /*
            r9 = this;
            r9.C()
            fi2.w r0 = r9.B()
            jz5.g r1 = r0.f262919e
            jz5.n r1 = (jz5.n) r1
            java.lang.Object r1 = r1.getValue()
            mh2.k r1 = (mh2.k) r1
            r1.c()
            mh2.k0 r1 = r0.m()
            r1.g()
            r0.o()
            kotlinx.coroutines.r2 r1 = r0.f262921g
            if (r1 == 0) goto L2c
            kotlinx.coroutines.a r1 = (kotlinx.coroutines.a) r1
            boolean r1 = r1.a()
            r2 = 1
            if (r1 != r2) goto L2c
            goto L2d
        L2c:
            r2 = 0
        L2d:
            if (r2 == 0) goto L30
            goto L44
        L30:
            kotlinx.coroutines.y0 r3 = r0.a()
            r4 = 0
            r5 = 0
            fi2.o r6 = new fi2.o
            r1 = 0
            r6.<init>(r0, r1)
            r7 = 3
            r8 = 0
            kotlinx.coroutines.r2 r1 = kotlinx.coroutines.l.d(r3, r4, r5, r6, r7, r8)
            r0.f262921g = r1
        L44:
            jz5.g r0 = r9.f262854i
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.getValue()
            fi2.d r0 = (fi2.d) r0
            zi2.w r1 = r0.f262811a
            java.lang.Class<mm2.y2> r2 = mm2.y2.class
            androidx.lifecycle.c1 r3 = r1.P0(r2)
            mm2.y2 r3 = (mm2.y2) r3
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData r3 = r3.B
            fi2.c r4 = new fi2.c
            r4.<init>(r0)
            r3.observe(r1, r4)
            androidx.lifecycle.c1 r1 = r1.P0(r2)
            mm2.y2 r1 = (mm2.y2) r1
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData r1 = r1.B
            java.lang.Object r1 = r1.getValue()
            xh2.e r1 = (xh2.e) r1
            if (r1 == 0) goto L79
            ci2.d r0 = r0.d()
            r0.b(r1)
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fi2.j1.h():void");
    }

    @Override // fi2.m
    public void i(java.lang.String userId, boolean z17) {
        kotlin.jvm.internal.o.g(userId, "userId");
    }

    @Override // fi2.m
    public android.view.View j() {
        return this.f262867v;
    }

    @Override // fi2.m
    public android.view.View k() {
        return this.f262848c;
    }

    @Override // fi2.m
    public android.view.View m() {
        com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView = this.f262848c;
        if (liveVoiceRoomLayoutView != null) {
            return liveVoiceRoomLayoutView.getBottomLinkSpace();
        }
        return null;
    }

    @Override // fi2.m
    public void n(boolean z17, boolean z18) {
    }

    @Override // fi2.m
    public android.widget.ImageView o() {
        android.widget.ImageView imageView;
        android.view.View view = this.f262849d;
        if (view == null || (imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f486011qv3)) == null) {
            return null;
        }
        imageView.setTranslationY(i65.a.b(imageView.getContext(), 402) - (com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y / 2.0f));
        return imageView;
    }

    @Override // fi2.m
    public android.view.ViewGroup p() {
        return this.f262848c;
    }

    @Override // fi2.a, fi2.m
    public void q(int i17, java.lang.String str) {
        android.graphics.PointF pointF;
        android.view.View findViewById;
        android.view.View findViewById2;
        android.widget.LinearLayout contentLayout;
        android.view.View childAt;
        com.tencent.mars.xlog.Log.i(this.f262802b, "notifyKtvSendFlower fromUserIndex: " + i17);
        if (this.f262848c != null) {
            zi2.w wVar = this.f262801a;
            int b17 = i65.a.b(wVar.f365323d.getContext(), 32);
            android.widget.ImageView imageView = new android.widget.ImageView(wVar.f365323d.getContext());
            imageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(b17, b17));
            ((wo0.b) new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128356f))).c(imageView);
            fi2.w B = B();
            com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView = this.f262848c;
            B.getClass();
            android.graphics.PointF pointF2 = null;
            if (liveVoiceRoomLayoutView != null && (contentLayout = liveVoiceRoomLayoutView.getContentLayout()) != null && (childAt = contentLayout.getChildAt(i17)) != null) {
                childAt.getLocationOnScreen(new int[2]);
                pointF = new android.graphics.PointF(r0[0] + (childAt.getWidth() / 2.0f), r0[1]);
            } else if (liveVoiceRoomLayoutView == null || (findViewById = liveVoiceRoomLayoutView.findViewById(com.tencent.mm.R.id.qrn)) == null) {
                pointF = null;
            } else {
                findViewById.getLocationOnScreen(new int[2]);
                pointF = new android.graphics.PointF(liveVoiceRoomLayoutView.getWidth(), r9[1] + i65.a.f(liveVoiceRoomLayoutView.getContext(), com.tencent.mm.R.dimen.f479721yt));
            }
            fi2.w B2 = B();
            com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView2 = this.f262848c;
            B2.getClass();
            if (liveVoiceRoomLayoutView2 != null && (findViewById2 = liveVoiceRoomLayoutView2.findViewById(com.tencent.mm.R.id.qrn)) != null) {
                findViewById2.getLocationOnScreen(new int[2]);
                pointF2 = new android.graphics.PointF(r4[0] + findViewById2.getWidth(), (r4[1] + (findViewById2.getHeight() / 2.0f)) - (b17 / 2.0f));
            }
            if (pointF == null || pointF2 == null) {
                return;
            }
            jz5.g gVar = this.f262858m;
            if (i17 != -1) {
                tg2.g gVar2 = (tg2.g) ((jz5.n) gVar).getValue();
                android.view.animation.PathInterpolator pathInterpolator = tg2.g.f419173b;
                gVar2.d(imageView, pointF, pointF2, 1650L);
            } else {
                tg2.g gVar3 = (tg2.g) ((jz5.n) gVar).getValue();
                gVar3.getClass();
                gVar3.b(imageView, pointF, new tg2.e(imageView, pointF, gVar3, pointF2));
            }
        }
    }

    @Override // fi2.m
    public void r() {
    }

    @Override // fi2.m
    public android.view.View s() {
        android.view.View findViewById;
        android.view.View view = this.f262849d;
        if (view == null || (findViewById = view.findViewById(com.tencent.mm.R.id.ewf)) == null) {
            return null;
        }
        findViewById.setTranslationY(i65.a.b(findViewById.getContext(), 402) - (com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y / 2.0f));
        return findViewById;
    }

    @Override // fi2.m
    public void statusChange(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
    }

    @Override // fi2.a, fi2.m
    public java.util.ArrayList t() {
        com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView;
        android.widget.LinearLayout chatContentLayout;
        android.widget.LinearLayout contentLayout;
        java.util.ArrayList t17 = super.t();
        int i17 = 0;
        if (this.f262860o == 2 && this.f262861p == 8) {
            com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView2 = this.f262848c;
            if (liveVoiceRoomLayoutView2 != null && (contentLayout = liveVoiceRoomLayoutView2.getContentLayout()) != null) {
                int childCount = contentLayout.getChildCount();
                for (int i18 = 0; i18 < childCount; i18++) {
                    android.view.View childAt = contentLayout.getChildAt(i18);
                    if (childAt instanceof wj2.w) {
                        t17.add(childAt);
                    }
                }
            }
            mh2.n0 f17 = B().f();
            if (f17 != null) {
                int childCount2 = f17.getChildCount();
                while (i17 < childCount2) {
                    android.view.View childAt2 = f17.getChildAt(i17);
                    if (childAt2 instanceof wj2.w) {
                        t17.add(childAt2);
                    }
                    i17++;
                }
            }
        } else if (D() && (liveVoiceRoomLayoutView = this.f262848c) != null && (chatContentLayout = liveVoiceRoomLayoutView.getChatContentLayout()) != null) {
            int childCount3 = chatContentLayout.getChildCount();
            while (i17 < childCount3) {
                android.view.View childAt3 = chatContentLayout.getChildAt(i17);
                if (childAt3 instanceof wj2.w) {
                    t17.add(childAt3);
                }
                i17++;
            }
        }
        return t17;
    }

    @Override // fi2.m
    public void u(r45.xn1 contact) {
        kotlin.jvm.internal.o.g(contact, "contact");
    }

    @Override // fi2.m
    public android.view.View v() {
        android.view.View view = this.f262849d;
        if (view != null) {
            return view.findViewById(com.tencent.mm.R.id.r1o);
        }
        return null;
    }

    @Override // fi2.m
    public void w(java.util.LinkedHashMap linkedHashMap, xh2.b bVar) {
        java.util.LinkedList linkedList;
        this.f262859n = bVar != null ? bVar.f454526e : 0;
        this.f262860o = bVar != null ? bVar.f454527f : 0;
        this.f262861p = bVar != null ? bVar.f454528g : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMicUserChanged liveMode: ");
        sb6.append(this.f262860o);
        sb6.append(" liveSubMode: ");
        sb6.append(this.f262861p);
        sb6.append(" voiceMode: ");
        sb6.append(this.f262859n);
        sb6.append(" size: ");
        sb6.append((bVar == null || (linkedList = bVar.f454530i) == null) ? null : java.lang.Integer.valueOf(linkedList.size()));
        com.tencent.mars.xlog.Log.i(this.f262802b, sb6.toString());
        com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView = this.f262848c;
        if (bVar != null && liveVoiceRoomLayoutView != null && (this.f262859n != 0 || this.f262860o != 0)) {
            gi2.e eVar = this.f262860o == 2 && this.f262861p == 8 ? (gi2.e) ((jz5.n) this.f262856k).getValue() : D() ? (gi2.e) ((jz5.n) this.f262853h).getValue() : (this.f262859n == 2 || this.f262861p == 2) ? (gi2.e) ((jz5.n) this.f262852g).getValue() : (gi2.e) ((jz5.n) this.f262851f).getValue();
            com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView2 = this.f262848c;
            if (liveVoiceRoomLayoutView2 != null) {
                liveVoiceRoomLayoutView2.setAdapter(eVar);
            }
            eVar.j(bVar.f454530i, bVar.f454524c);
            A(0);
        }
        if (bVar != null && this.f262865t == bVar.f454526e) {
            if ((bVar != null && this.f262864s == bVar.f454525d) && this.f262862q == this.f262860o && this.f262863r == this.f262861p) {
                return;
            }
        }
        this.f262864s = bVar != null ? bVar.f454525d : 0;
        this.f262865t = bVar != null ? bVar.f454526e : 0;
        this.f262862q = this.f262860o;
        this.f262863r = this.f262861p;
        zi2.w wVar = this.f262801a;
        com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView3 = this.f262848c;
        com.tencent.mm.plugin.finder.live.plugin.l.b1(wVar, liveVoiceRoomLayoutView3 != null ? liveVoiceRoomLayoutView3.getBottomLinkSpace() : null, this.f262802b, false, 4, null);
    }

    @Override // fi2.m
    public void x(java.lang.String userName) {
        java.util.LinkedList linkedList;
        java.lang.Object obj;
        java.lang.String str;
        kotlin.jvm.internal.o.g(userName, "userName");
        xh2.b bVar = ((mm2.y2) this.f262801a.P0(mm2.y2.class)).f329565r;
        if (bVar == null || (linkedList = bVar.f454530i) == null) {
            return;
        }
        synchronized (linkedList) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                km2.q qVar = ((xh2.a) next).f454520a;
                if (kotlin.jvm.internal.o.b(qVar != null ? qVar.f309172c : null, userName)) {
                    obj = next;
                    break;
                }
            }
        }
        xh2.a aVar = (xh2.a) obj;
        if (aVar != null) {
            ni2.p2 p2Var = (ni2.p2) ((jz5.n) this.f262855j).getValue();
            p2Var.getClass();
            p2Var.f337418d = aVar;
            p2Var.f337419e = ((mm2.y2) p2Var.f337416b.a(mm2.y2.class)).R6(aVar.f454521b.f454553e);
            com.tencent.mm.ui.widget.dialog.k0 k0Var = p2Var.f337420f;
            k0Var.q(p2Var.f337415a.getResources().getString(com.tencent.mm.R.string.lzk, java.lang.Integer.valueOf(aVar.f454521b.f454553e)), 17);
            k0Var.v();
            fj2.s sVar = fj2.s.f263183a;
            ml2.w4 w4Var = ml2.w4.f328188f;
            km2.q qVar2 = aVar.f454520a;
            if (qVar2 == null || (str = qVar2.f309172c) == null) {
                str = "";
            }
            fj2.s.h(sVar, w4Var, str, 0, 0, 12, null);
        }
    }

    @Override // fi2.a
    public java.lang.String z() {
        return "VoiceRoomCoverLogicCore: " + hashCode();
    }
}
