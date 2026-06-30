package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.i0.class)
/* loaded from: classes5.dex */
public final class y8 extends com.tencent.mm.ui.chatting.component.a implements yn.e, sb5.i0 {
    public static final java.util.concurrent.ConcurrentHashMap N;
    public android.text.TextWatcher A;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public long G;
    public float H;
    public float I;

    /* renamed from: J, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.component.a8 f200286J;
    public com.tencent.mm.ui.chatting.component.a8 K;
    public com.tencent.mm.sdk.event.IListener L;
    public fu.d M;

    /* renamed from: m, reason: collision with root package name */
    public a31.m f200292m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.chat.h9 f200293n;

    /* renamed from: o, reason: collision with root package name */
    public int f200294o;

    /* renamed from: p, reason: collision with root package name */
    public long f200295p;

    /* renamed from: q, reason: collision with root package name */
    public int f200296q;

    /* renamed from: r, reason: collision with root package name */
    public int f200297r;

    /* renamed from: s, reason: collision with root package name */
    public int f200298s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f200299t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f200300u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f200301v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f200303x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f200304y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.component.gp f200305z;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f200287e = jz5.h.b(com.tencent.mm.ui.chatting.component.q8.f199759d);

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f200288f = jz5.h.b(new com.tencent.mm.ui.chatting.component.v8(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f200289g = jz5.h.b(new com.tencent.mm.ui.chatting.component.g8(this));

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f200290h = jz5.h.b(com.tencent.mm.ui.chatting.component.d8.f198931d);

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f200291i = jz5.h.b(new com.tencent.mm.ui.chatting.component.e8(this));

    /* renamed from: w, reason: collision with root package name */
    public boolean f200302w = true;
    public final jz5.g B = jz5.h.b(new com.tencent.mm.ui.chatting.component.c8(this));

    static {
        new com.tencent.mm.ui.chatting.component.z7(null);
        N = new java.util.concurrent.ConcurrentHashMap();
    }

    public y8() {
        com.tencent.mm.ui.chatting.component.a8 a8Var = com.tencent.mm.ui.chatting.component.a8.f198611e;
        this.f200286J = a8Var;
        this.K = a8Var;
    }

    public static final void m0(com.tencent.mm.ui.chatting.component.y8 y8Var, long j17) {
        if (j17 <= 0) {
            y8Var.getClass();
            return;
        }
        java.lang.Object p17 = y8Var.f198580d.p();
        androidx.recyclerview.widget.RecyclerView recyclerView = p17 instanceof androidx.recyclerview.widget.RecyclerView ? (androidx.recyclerview.widget.RecyclerView) p17 : null;
        if (recyclerView == null) {
            return;
        }
        androidx.recyclerview.widget.n2 itemAnimator = recyclerView.getItemAnimator();
        com.tencent.mm.ui.chatting.view.r rVar = itemAnimator instanceof com.tencent.mm.ui.chatting.view.r ? (com.tencent.mm.ui.chatting.view.r) itemAnimator : null;
        if (rVar != null) {
            java.lang.Long valueOf = java.lang.Long.valueOf(j17);
            java.lang.Long l17 = rVar.f203064h;
            if (l17 != null) {
                long longValue = l17.longValue();
                if (valueOf == null || valueOf.longValue() <= 0 || valueOf.longValue() == longValue) {
                    rVar.f203064h = null;
                }
            }
        }
    }

    public static final void n0(com.tencent.mm.ui.chatting.component.y8 y8Var) {
        android.view.View view = (android.view.View) ((jz5.n) y8Var.B).getValue();
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/ChattingVoice2TxtComponent", "hideBubbleGuideBackground", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/component/ChattingVoice2TxtComponent", "hideBubbleGuideBackground", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public static final void o0(com.tencent.mm.ui.chatting.component.y8 y8Var) {
        com.tencent.mm.pluginsdk.ui.chat.h9 h9Var = y8Var.f200293n;
        if ((h9Var == null || h9Var.E) ? false : true) {
            return;
        }
        if (y8Var.D) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingVoice2TxtComponent", "insertFakeMsg: already inserted fake msg, delete previous one first, quickSendMsgId:" + y8Var.f200295p);
            y8Var.u0();
        }
        y8Var.D = true;
        com.tencent.mm.pluginsdk.ui.chat.h9 h9Var2 = y8Var.f200293n;
        if (h9Var2 != null) {
            kotlinx.coroutines.r2 r2Var = h9Var2.Q;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            h9Var2.Q = kotlinx.coroutines.l.d(h9Var2.f190362h, null, null, new com.tencent.mm.pluginsdk.ui.chat.t8(h9Var2, null), 3, null);
        }
        if (!y8Var.I0()) {
            oi3.g gVar = new oi3.g();
            int i17 = gVar.f345617d;
            gVar.set(i17 + 7, 2);
            gVar.set(i17 + 3, y8Var.f198580d.x());
            gVar.set(i17 + 2, java.lang.Long.valueOf(c01.w9.o(y8Var.f198580d.x())));
            gVar.set(i17 + 13, "· · ·");
            gVar.set(i17 + 4, 1);
            gVar.set(i17 + 9, 1);
            long r17 = pt0.f0.f358209b1.r(gVar);
            y8Var.f200295p = r17;
            y8Var.s0(r17, false, true, false);
            return;
        }
        pt0.e0 e0Var = pt0.f0.f358209b1;
        java.lang.String x17 = y8Var.f198580d.x();
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter v07 = y8Var.v0();
        com.tencent.mm.storage.f9 k17 = e0Var.k(x17, v07 != null ? v07.getLastQuoteMsgId() : 0L);
        if (k17 == null) {
            return;
        }
        java.lang.String x18 = y8Var.f198580d.x();
        l15.c cVar = new l15.c();
        v05.b bVar = new v05.b();
        int i18 = bVar.f368365d;
        bVar.set(i18 + 6, 57);
        bVar.set(i18 + 2, "· · ·");
        bVar.set(i18 + 3, "· · ·");
        r15.a aVar = new r15.a();
        aVar.A(k17.I0());
        aVar.B(k17.getType());
        java.lang.String Q0 = k17.Q0();
        kotlin.jvm.internal.o.f(Q0, "getTalker(...)");
        aVar.w(Q0);
        aVar.r(x18);
        java.lang.String Q02 = k17.Q0();
        kotlin.jvm.internal.o.f(Q02, "getTalker(...)");
        aVar.u(Q02);
        java.lang.String j17 = k17.j();
        if (j17 == null) {
            j17 = "";
        }
        aVar.s(j17);
        java.lang.String str = k17.G;
        aVar.x(str != null ? str : "");
        aVar.z(java.lang.String.valueOf(k17.I0()));
        aVar.t(k17.getCreateTime());
        bVar.set(bVar.f432315e + 76, aVar);
        cVar.q(bVar);
        y8Var.M = new fu.d(new fu.a(y8Var.f198580d.x(), cVar, null));
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope != null) {
            v65.i.b(lifecycleScope, null, new com.tencent.mm.ui.chatting.component.o8(y8Var, null), 1, null);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingVoice2TxtComponent", "insertFakeQuoteMsg: accountScope is null, abort");
            y8Var.M = null;
        }
    }

    public static final void p0(com.tencent.mm.ui.chatting.component.y8 y8Var, float f17, float f18) {
        com.tencent.mm.pluginsdk.ui.chat.h9 h9Var = y8Var.f200293n;
        if (h9Var != null) {
            db5.d5 d5Var = h9Var.f190365k;
            if (d5Var != null && d5Var.isShowing()) {
                com.tencent.mm.pluginsdk.ui.chat.h9 h9Var2 = y8Var.f200293n;
                if (h9Var2 != null) {
                    h9Var2.g(f17, f18);
                }
                if (f18 < y8Var.f200294o) {
                    y8Var.f200286J = com.tencent.mm.ui.chatting.component.a8.f198610d;
                } else {
                    y8Var.f200286J = com.tencent.mm.ui.chatting.component.a8.f198611e;
                }
                com.tencent.mm.ui.chatting.component.a8 a8Var = y8Var.K;
                com.tencent.mm.ui.chatting.component.a8 a8Var2 = y8Var.f200286J;
                if (a8Var != a8Var2) {
                    y8Var.K = a8Var2;
                    com.tencent.mm.pluginsdk.ui.chat.h9 h9Var3 = y8Var.f200293n;
                    if (h9Var3 != null) {
                        boolean z17 = a8Var2 == com.tencent.mm.ui.chatting.component.a8.f198610d;
                        java.lang.Object systemService = h9Var3.f190360f.getSystemService("vibrator");
                        android.os.Vibrator vibrator = systemService instanceof android.os.Vibrator ? (android.os.Vibrator) systemService : null;
                        if (vibrator != null) {
                            vibrator.vibrate(30L);
                        }
                        if (!z17) {
                            h9Var3.E = true;
                            android.widget.ImageView imageView = h9Var3.f190372r;
                            if (imageView != null) {
                                imageView.setVisibility(0);
                            }
                            android.view.View view = h9Var3.f190370p;
                            if (view != null) {
                                view.animate().translationY(0.0f).alpha(1.0f).withStartAction(new com.tencent.mm.pluginsdk.ui.chat.d9(h9Var3)).withEndAction(new com.tencent.mm.pluginsdk.ui.chat.e9(h9Var3));
                            }
                            android.view.View view2 = h9Var3.f190373s;
                            if (view2 != null) {
                                view2.animate().translationY(0.0f).alpha(0.0f).setDuration(100L).start();
                                return;
                            }
                            return;
                        }
                        h9Var3.E = false;
                        android.widget.ImageView imageView2 = h9Var3.f190372r;
                        if (imageView2 != null) {
                            imageView2.setVisibility(8);
                        }
                        android.view.View view3 = h9Var3.f190370p;
                        float f19 = h9Var3.f190377w;
                        if (view3 != null) {
                            view3.animate().translationY(f19).alpha(0.0f).setDuration(100L).withStartAction(new com.tencent.mm.pluginsdk.ui.chat.b9(h9Var3)).withEndAction(new com.tencent.mm.pluginsdk.ui.chat.c9(h9Var3)).start();
                        }
                        android.view.View view4 = h9Var3.f190373s;
                        if (view4 != null) {
                            view4.animate().translationY(f19).alpha(1.0f).setDuration(100L).start();
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:222:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void q0(com.tencent.mm.ui.chatting.component.y8 r29, float r30, float r31) {
        /*
            Method dump skipped, instructions count: 1778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.y8.q0(com.tencent.mm.ui.chatting.component.y8, float, float):void");
    }

    public static final boolean r0(com.tencent.mm.ui.chatting.component.y8 y8Var) {
        if (y8Var.f200300u) {
            return y8Var.f198580d.g().getResources().getConfiguration().orientation == 1;
        }
        return false;
    }

    public final com.tencent.mm.sdk.platformtools.o4 A0() {
        return (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) this.f200287e).getValue();
    }

    public final com.tencent.mm.pluginsdk.ui.SpeechInputLayout B0() {
        return (com.tencent.mm.pluginsdk.ui.SpeechInputLayout) ((jz5.n) this.f200288f).getValue();
    }

    public final fl5.i C0() {
        fl5.i toSendEt;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter v07 = v0();
        if (v07 == null || (toSendEt = v07.getToSendEt()) == null) {
            return null;
        }
        return toSendEt.getRealEditText();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        java.util.Objects.toString(v0());
        if (this.f200292m == null) {
            H0();
        }
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter v07 = v0();
        java.lang.String lastText = v07 != null ? v07.getLastText() : null;
        if ((lastText == null || r26.n0.N(lastText)) && !this.f200304y) {
            android.view.View F0 = F0();
            if (F0 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(F0, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/ChattingVoice2TxtComponent", "onChattingEnterAnimEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                F0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(F0, "com/tencent/mm/ui/chatting/component/ChattingVoice2TxtComponent", "onChattingEnterAnimEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.pluginsdk.ui.SpeechInputLayout B0 = B0();
            if (B0 != null) {
                B0.c(1);
            }
            if (com.tencent.mm.pluginsdk.ui.SpeechInputLayout.f189820y.a() == 2) {
                com.tencent.mm.pluginsdk.ui.SpeechInputLayout B02 = B0();
                if (B02 != null && B02.getCurV2TStatus() == 1) {
                    J0();
                }
            }
        }
        if (this.f200293n == null) {
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter v08 = v0();
            this.f200293n = v08 != null ? new com.tencent.mm.pluginsdk.ui.chat.h9(v08) : null;
        }
    }

    public final com.tencent.mm.ui.widget.MMEditText E0() {
        fl5.i C0 = C0();
        if (C0 instanceof com.tencent.mm.ui.widget.MMEditText) {
            return (com.tencent.mm.ui.widget.MMEditText) C0;
        }
        return null;
    }

    public final android.view.View F0() {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter v07 = v0();
        if (v07 != null) {
            return v07.getV2TBtnLayout();
        }
        return null;
    }

    public final void G0() {
        N0(false);
        M0(false);
    }

    public final void H0() {
        a31.m mVar;
        android.view.View F0;
        com.tencent.mm.pluginsdk.ui.SpeechInputLayout B0;
        if (E0() == null || B0() == null) {
            return;
        }
        int f17 = i65.a.f(w0(), com.tencent.mm.R.dimen.f479646bl);
        if (((java.lang.Boolean) ((jz5.n) this.f200290h).getValue()).booleanValue() && (B0 = B0()) != null) {
            B0.post(new com.tencent.mm.ui.chatting.component.i8(this, f17));
        }
        if (this.f200301v) {
            com.tencent.mm.pluginsdk.ui.SpeechInputLayout B02 = B0();
            if (B02 != null) {
                B02.setScaleX(com.tencent.mm.ui.gk.a(1.0f));
            }
            com.tencent.mm.pluginsdk.ui.SpeechInputLayout B03 = B0();
            if (B03 != null) {
                B03.setScaleY(com.tencent.mm.ui.gk.a(1.0f));
            }
            jz5.g gVar = this.B;
            android.view.View view = (android.view.View) ((jz5.n) gVar).getValue();
            if (view != null) {
                view.setScaleX(com.tencent.mm.ui.gk.a(1.0f));
            }
            android.view.View view2 = (android.view.View) ((jz5.n) gVar).getValue();
            if (view2 != null) {
                view2.setScaleY(com.tencent.mm.ui.gk.a(1.0f));
            }
        }
        if (com.tencent.mm.pluginsdk.ui.SpeechInputLayout.f189820y.a() == 1) {
            android.view.View F02 = F0();
            android.view.ViewGroup.LayoutParams layoutParams = F02 != null ? F02.getLayoutParams() : null;
            android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.rightMargin = i65.a.f(w0(), com.tencent.mm.R.dimen.f479646bl);
                android.view.View F03 = F0();
                if (F03 != null) {
                    F03.setLayoutParams(layoutParams2);
                }
            }
        }
        if (this.f200292m == null) {
            this.f200292m = new a31.m();
        }
        a31.m mVar2 = this.f200292m;
        if (mVar2 != null) {
            mVar2.f(w0(), 15, E0(), B0(), this.f198580d.x());
        }
        a31.m mVar3 = this.f200292m;
        if (mVar3 != null) {
            mVar3.f973g = 1;
        }
        com.tencent.mm.pluginsdk.ui.SpeechInputLayout B04 = B0();
        if (B04 != null) {
            B04.setOnSpeechInputListener(new com.tencent.mm.ui.chatting.component.j8(this));
        }
        android.view.View F04 = F0();
        if (F04 != null) {
            F04.setOnTouchListener(new com.tencent.mm.ui.chatting.component.l8(this));
        }
        com.tencent.mm.pluginsdk.ui.SpeechInputLayout B05 = B0();
        if (B05 != null) {
            B05.setOnSpeechInputShowListener(new com.tencent.mm.ui.chatting.component.m8(this));
        }
        if (this.f200304y && (F0 = F0()) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(F0, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/ChattingVoice2TxtComponent", "initSpeechInputLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            F0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(F0, "com/tencent/mm/ui/chatting/component/ChattingVoice2TxtComponent", "initSpeechInputLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (!this.f200299t || (mVar = this.f200292m) == null) {
            return;
        }
        mVar.f990x = true;
        com.tencent.mm.pluginsdk.ui.SpeechInputLayout speechInputLayout = mVar.f969c;
        if (speechInputLayout != null) {
            speechInputLayout.c(1);
        }
    }

    public final boolean I0() {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter v07 = v0();
        return (v07 != null ? v07.getLastQuoteMsgId() : 0L) > 0;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        b31.l.f17613a.i();
        if (!(!A0().i("show_btn_guide", false))) {
            G0();
        }
        this.f200299t = false;
        com.tencent.mm.sdk.event.IListener iListener = this.L;
        if (iListener != null) {
            iListener.dead();
        }
        this.L = null;
        com.tencent.mm.pluginsdk.ui.chat.h9 h9Var = this.f200293n;
        if (h9Var != null) {
            db5.d5 d5Var = h9Var.f190365k;
            if (d5Var == null || !d5Var.isShowing()) {
                h9Var.f190365k = null;
            } else {
                h9Var.f190365k = null;
                h9Var.f();
                try {
                    d5Var.dismiss();
                } catch (java.lang.Exception unused) {
                }
                h9Var.f190359e.W0();
            }
            kotlinx.coroutines.p2.a(h9Var.f190361g, null, 1, null);
            h9Var.a();
            z21.w wVar = h9Var.H;
            if (wVar != null) {
                wVar.cancel(true);
            }
            h9Var.M = null;
        }
        this.f200293n = null;
        a31.m mVar = this.f200292m;
        if (mVar != null) {
            mVar.c();
        }
        this.f200292m = null;
    }

    public final void J0() {
        android.view.View view = (android.view.View) ((jz5.n) this.B).getValue();
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/ChattingVoice2TxtComponent", "showBubbleGuideBackground", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/component/ChattingVoice2TxtComponent", "showBubbleGuideBackground", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        com.tencent.mm.ui.chatting.component.gp gpVar = this.f200305z;
        if (gpVar != null) {
            gpVar.c();
        }
        this.f200305z = null;
    }

    public final void K0() {
        java.lang.Object p17 = this.f198580d.p();
        androidx.recyclerview.widget.RecyclerView recyclerView = p17 instanceof androidx.recyclerview.widget.RecyclerView ? (androidx.recyclerview.widget.RecyclerView) p17 : null;
        if (recyclerView == null) {
            return;
        }
        androidx.recyclerview.widget.n2 itemAnimator = recyclerView.getItemAnimator();
        com.tencent.mm.ui.chatting.view.r rVar = itemAnimator instanceof com.tencent.mm.ui.chatting.view.r ? (com.tencent.mm.ui.chatting.view.r) itemAnimator : null;
        if (rVar == null) {
            return;
        }
        rVar.k();
        com.tencent.mm.ui.chatting.view.v.c(recyclerView, rVar);
    }

    public final void L0(boolean z17) {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter v07 = v0();
        android.view.View voiceRcdBtn = v07 != null ? v07.getVoiceRcdBtn() : null;
        if (voiceRcdBtn != null && voiceRcdBtn.getVisibility() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingVoice2TxtComponent", "updateLongClickTextGuide voiceRcdBtn is VISIBLE , return");
            return;
        }
        if (!z17) {
            android.widget.TextView y07 = y0();
            if (y07 != null) {
                y07.setVisibility(8);
            }
            android.view.View x07 = x0();
            if (x07 == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(x07, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/ChattingVoice2TxtComponent", "updateLongClickTextGuide", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            x07.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(x07, "com/tencent/mm/ui/chatting/component/ChattingVoice2TxtComponent", "updateLongClickTextGuide", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.widget.TextView y08 = y0();
        if (y08 != null) {
            y08.setText(w0().getString(com.tencent.mm.R.string.o_0));
        }
        android.widget.TextView y09 = y0();
        if (y09 != null && y09.getVisibility() == 8) {
            android.widget.TextView y010 = y0();
            if (y010 != null) {
                sa5.d.c(y010, 0.0f, 150L, null, 5, null);
            }
            android.view.View x08 = x0();
            if (x08 != null) {
                sa5.d.c(x08, 0.0f, 150L, null, 5, null);
            }
        } else {
            android.widget.TextView y011 = y0();
            if (y011 != null) {
                y011.setVisibility(0);
            }
            android.view.View x09 = x0();
            if (x09 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(x09, arrayList2.toArray(), "com/tencent/mm/ui/chatting/component/ChattingVoice2TxtComponent", "updateLongClickTextGuide", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                x09.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(x09, "com/tencent/mm/ui/chatting/component/ChattingVoice2TxtComponent", "updateLongClickTextGuide", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        this.f200302w = false;
        int o17 = A0().o("longclick_guide_count", 0) + 1;
        A0().A("longclick_guide_count", o17);
        if (o17 >= 3) {
            A0().G("show_longclick_guide", true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x009d, code lost:
    
        if ((r0 != null ? r0.f990x : false) == false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M0(boolean r22) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.y8.M0(boolean):void");
    }

    public final void N0(boolean z17) {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter v07 = v0();
        android.view.View voiceRcdBtn = v07 != null ? v07.getVoiceRcdBtn() : null;
        if (voiceRcdBtn != null && voiceRcdBtn.getVisibility() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingVoice2TxtComponent", "updateNewTextGuide voiceRcdBtn is VISIBLE , return");
            return;
        }
        if (!z17) {
            android.widget.TextView y07 = y0();
            if (y07 != null) {
                y07.setVisibility(8);
            }
            android.view.View x07 = x0();
            if (x07 == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(x07, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/ChattingVoice2TxtComponent", "updateNewTextGuide", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            x07.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(x07, "com/tencent/mm/ui/chatting/component/ChattingVoice2TxtComponent", "updateNewTextGuide", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.widget.TextView y08 = y0();
        if (y08 != null) {
            y08.setText(w0().getString(com.tencent.mm.R.string.n7_));
        }
        android.widget.TextView y09 = y0();
        if (y09 != null && y09.getVisibility() == 8) {
            android.widget.TextView y010 = y0();
            if (y010 != null) {
                sa5.d.c(y010, 0.0f, 150L, new com.tencent.mm.ui.chatting.component.w8(this), 1, null);
            }
            android.view.View x08 = x0();
            if (x08 != null) {
                sa5.d.c(x08, 0.0f, 150L, new com.tencent.mm.ui.chatting.component.x8(this), 1, null);
            }
        } else {
            android.widget.TextView y011 = y0();
            if (y011 != null) {
                y011.setVisibility(0);
            }
            android.view.View x09 = x0();
            if (x09 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(x09, arrayList2.toArray(), "com/tencent/mm/ui/chatting/component/ChattingVoice2TxtComponent", "updateNewTextGuide", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                x09.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(x09, "com/tencent/mm/ui/chatting/component/ChattingVoice2TxtComponent", "updateNewTextGuide", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        this.f200302w = false;
        this.f200297r = A0().o("btn_guide_count", 0) + 1;
        A0().A("btn_guide_count", this.f200297r);
        if (this.f200297r >= 3) {
            A0().G("show_btn_guide", true);
        }
    }

    public void O0(int i17) {
        a31.m mVar;
        com.tencent.mm.pluginsdk.ui.SpeechInputLayout B0 = B0();
        if ((B0 != null ? B0.getCurV2TStatus() : 0) < 2 && (mVar = this.f200292m) != null) {
            mVar.l(i17);
        }
    }

    public void P0(int i17) {
        a31.m mVar;
        com.tencent.mm.pluginsdk.ui.SpeechInputLayout B0 = B0();
        if ((B0 != null ? B0.getCurV2TStatus() : 0) >= 2 && (mVar = this.f200292m) != null) {
            mVar.m(i17);
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
        android.view.View F0;
        boolean z17 = true;
        this.f200300u = j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigVoiceInputLongClick()) == 1 && com.tencent.mm.storage.z3.i4(this.f198580d.x()) && j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigVoiceInputIlink()) == 1;
        this.f200301v = j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigChatfooterFixBigFont()) == 1;
        this.f200303x = j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigShowMicButtonBubbleGuide()) > 0;
        boolean z18 = (((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("DisableClawBotVoiceInput", 0) == 1) && com.tencent.mm.storage.z3.L4(this.f198580d.x());
        this.f200304y = z18;
        if (z18) {
            android.view.View F02 = F0();
            if (F02 == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(F02, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/ChattingVoice2TxtComponent", "onChattingInit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            F02.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(F02, "com/tencent/mm/ui/chatting/component/ChattingVoice2TxtComponent", "onChattingInit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter v07 = v0();
        java.lang.String lastText = v07 != null ? v07.getLastText() : null;
        if (lastText != null && !r26.n0.N(lastText)) {
            z17 = false;
        }
        if (!z17 || (F0 = F0()) == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(F0, arrayList2.toArray(), "com/tencent/mm/ui/chatting/component/ChattingVoice2TxtComponent", "onChattingInit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        F0.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(F0, "com/tencent/mm/ui/chatting/component/ChattingVoice2TxtComponent", "onChattingInit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.h
    public void k(int i17, boolean z17) {
    }

    @Override // yn.d
    public void l0() {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter v07 = v0();
        if (v07 != null) {
            v07.post(new com.tencent.mm.ui.chatting.component.h8(this));
        }
    }

    public final void s0(long j17, boolean z17, boolean z18, boolean z19) {
        if (j17 <= 0) {
            return;
        }
        java.lang.Object p17 = this.f198580d.p();
        androidx.recyclerview.widget.RecyclerView recyclerView = p17 instanceof androidx.recyclerview.widget.RecyclerView ? (androidx.recyclerview.widget.RecyclerView) p17 : null;
        if (recyclerView == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingVoice2TxtComponent", "armVoice2TxtTextChangeAnim failed, listView is not RecyclerView");
            return;
        }
        long j18 = z18 ? j17 : 0L;
        if (!z19) {
            j17 = 0;
        }
        androidx.recyclerview.widget.n2 itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null && itemAnimator.o()) {
            com.tencent.mars.xlog.Log.w("ChattingTextChangeItemAnimator", "[armChattingTextChangeOnce] already running, force ending current animations");
            androidx.recyclerview.widget.n2 itemAnimator2 = recyclerView.getItemAnimator();
            if (itemAnimator2 != null) {
                itemAnimator2.k();
                return;
            }
            return;
        }
        androidx.recyclerview.widget.n2 itemAnimator3 = recyclerView.getItemAnimator();
        if (itemAnimator3 != null) {
            itemAnimator3.k();
        }
        java.lang.Long valueOf = java.lang.Long.valueOf(j18);
        if (!(valueOf.longValue() > 0)) {
            valueOf = null;
        }
        java.lang.Long valueOf2 = java.lang.Long.valueOf(j17);
        if (!(valueOf2.longValue() > 0)) {
            valueOf2 = null;
        }
        com.tencent.mm.ui.chatting.view.r rVar = new com.tencent.mm.ui.chatting.view.r(300L, valueOf, valueOf2);
        rVar.f203068l = new com.tencent.mm.ui.chatting.view.s(null, z17, recyclerView, rVar);
        recyclerView.setItemAnimator(rVar);
    }

    public final boolean t0() {
        if (A0().i("show_longclick_guide", false) || j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigVoiceInputLongClickGuide()) != 1 || !this.f200300u) {
            return false;
        }
        long q17 = A0().q("longclick_guide_first_time", 0L);
        if (q17 == 0) {
            return false;
        }
        long q18 = A0().q("longclick_guide_interval_override", 0L);
        if (q18 <= 0) {
            q18 = 604800000;
        }
        return java.lang.System.currentTimeMillis() - q17 >= q18;
    }

    public final void u0() {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter v07;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingVoice2TxtComponent", "deleteFakeMsg quickSendMsgId:%s", java.lang.Long.valueOf(this.f200295p));
        com.tencent.mm.pluginsdk.ui.chat.h9 h9Var = this.f200293n;
        if (h9Var != null) {
            h9Var.E = false;
        }
        fu.d dVar = this.M;
        if (dVar != null) {
            dVar.x();
        }
        this.M = null;
        if (I0() && (v07 = v0()) != null) {
            v07.b1();
        }
        long j17 = this.f200295p;
        if (j17 > 0) {
            com.tencent.mm.ui.chatting.view.r.f203062m.a(j17);
            K0();
            java.lang.String x17 = this.f198580d.x();
            pt0.e0 e0Var = pt0.f0.f358209b1;
            if (e0Var.k(x17, this.f200295p) != null) {
                e0Var.b(x17, this.f200295p);
            }
        }
    }

    public final com.tencent.mm.pluginsdk.ui.chat.ChatFooter v0() {
        return ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) this.f198580d.f460708c.a(sb5.s0.class))).f199263e;
    }

    public final android.content.Context w0() {
        android.app.Activity g17 = this.f198580d.g();
        kotlin.jvm.internal.o.f(g17, "getContext(...)");
        return g17;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        if (this.f200292m == null) {
            H0();
        }
        if (this.f200293n == null) {
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter v07 = v0();
            this.f200293n = v07 != null ? new com.tencent.mm.pluginsdk.ui.chat.h9(v07) : null;
        }
    }

    public final android.view.View x0() {
        return (android.view.View) ((jz5.n) this.f200291i).getValue();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
        a31.m mVar;
        com.tencent.mm.pluginsdk.ui.SpeechInputLayout B0 = B0();
        if ((B0 != null ? B0.getCurV2TStatus() : 0) >= 2 && (mVar = this.f200292m) != null) {
            mVar.m(14);
        }
        if (this.D) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingVoice2TxtComponent", "onChattingPause: clean up fake msg, quickSendMsgId:" + this.f200295p);
            u0();
            this.D = false;
        }
        K0();
        com.tencent.mm.ui.chatting.component.gp gpVar = this.f200305z;
        if (gpVar != null) {
            gpVar.dismiss();
        }
        this.f200305z = null;
    }

    public final android.widget.TextView y0() {
        return (android.widget.TextView) ((jz5.n) this.f200289g).getValue();
    }
}
