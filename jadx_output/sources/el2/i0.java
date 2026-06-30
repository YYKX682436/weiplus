package el2;

/* loaded from: classes3.dex */
public final class i0 extends com.tencent.mm.plugin.finder.live.widget.e0 implements com.tencent.mm.modelbase.u0 {
    public final java.lang.String H;
    public wt2.a I;

    /* renamed from: J */
    public r45.jg1 f253810J;
    public android.view.View K;
    public android.widget.TextView L;
    public android.widget.TextView M;
    public android.view.View N;
    public android.widget.TextView P;
    public final bm2.v0 Q;
    public com.tencent.mm.view.recyclerview.WxRecyclerView R;
    public final com.tencent.mm.plugin.finder.live.plugin.view.promote.FinderLiveAnchorPromoteView$tingEventListener$1 S;
    public final jz5.g T;
    public final jz5.g U;
    public final jz5.g V;
    public com.tencent.mm.ui.widget.dialog.u3 W;
    public final jz5.g X;
    public final jz5.g Y;
    public final int Z;

    /* renamed from: p0 */
    public final java.util.List f253811p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.tencent.mm.plugin.finder.live.plugin.view.promote.FinderLiveAnchorPromoteView$tingEventListener$1] */
    public i0(android.content.Context context) {
        super(context, false, null, 0.35f, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.H = "FinderLiveAnchorPromoteView";
        this.Q = new bm2.v0(context);
        this.S = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.TingCategoryChangeEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.finder.live.plugin.view.promote.FinderLiveAnchorPromoteView$tingEventListener$1
            {
                this.__eventId = -1986766098;
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x00bd  */
            @Override // com.tencent.mm.sdk.event.IListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean callback(com.tencent.mm.autogen.events.TingCategoryChangeEvent r12) {
                /*
                    Method dump skipped, instructions count: 275
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.view.promote.FinderLiveAnchorPromoteView$tingEventListener$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.T = jz5.h.b(new el2.z(context));
        this.U = jz5.h.b(new el2.p(context, this));
        this.V = jz5.h.b(new el2.g(context, this));
        this.X = jz5.h.b(new el2.h0(context, this));
        this.Y = jz5.h.b(new el2.y(context, this));
        this.Z = 1;
        this.f253811p0 = kz5.c0.i(8, 13);
    }

    public static final boolean e0(el2.i0 i0Var) {
        java.util.LinkedList list;
        r45.im5 im5Var;
        java.lang.Object obj;
        r45.jg1 jg1Var = i0Var.f253810J;
        if (jg1Var == null || (list = jg1Var.getList(2)) == null) {
            return false;
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            im5Var = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.a52) obj).getInteger(0) == 7) {
                break;
            }
        }
        r45.a52 a52Var = (r45.a52) obj;
        if (a52Var == null) {
            return false;
        }
        com.tencent.mm.protobuf.g byteString = a52Var.getByteString(5);
        if (byteString != null) {
            r45.im5 im5Var2 = new r45.im5();
            try {
                im5Var2.parseFrom(byteString.g());
                im5Var = im5Var2;
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
        }
        return (im5Var != null ? im5Var.getInteger(0) : -1) == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f0(el2.i0 r9) {
        /*
            r9.getClass()
            com.tencent.mm.modelbase.r1 r0 = gm0.j1.d()
            r1 = 372(0x174, float:5.21E-43)
            r0.a(r1, r9)
            r45.jg1 r0 = r9.f253810J
            r1 = 3
            r2 = 1
            r3 = 0
            r4 = 2
            r5 = 0
            if (r0 == 0) goto L6d
            java.util.LinkedList r0 = r0.getList(r4)
            if (r0 == 0) goto L6d
            java.util.Iterator r0 = r0.iterator()
        L1f:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L38
            java.lang.Object r6 = r0.next()
            r7 = r6
            r45.a52 r7 = (r45.a52) r7
            int r7 = r7.getInteger(r3)
            if (r7 != r1) goto L34
            r7 = r2
            goto L35
        L34:
            r7 = r3
        L35:
            if (r7 == 0) goto L1f
            goto L39
        L38:
            r6 = r5
        L39:
            r45.a52 r6 = (r45.a52) r6
            if (r6 == 0) goto L6d
            com.tencent.mm.protobuf.g r0 = r6.getByteString(r4)
            if (r0 == 0) goto L45
            r0 = r2
            goto L46
        L45:
            r0 = r3
        L46:
            if (r0 == 0) goto L49
            goto L4a
        L49:
            r6 = r5
        L4a:
            if (r6 == 0) goto L6d
            r45.c52 r0 = new r45.c52
            r0.<init>()
            com.tencent.mm.protobuf.g r6 = r6.getByteString(r4)
            kotlin.jvm.internal.o.d(r6)
            byte[] r6 = r6.g()
            r0.parseFrom(r6)     // Catch: java.lang.Exception -> L60
            goto L6e
        L60:
            r6 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r7 = "safeParser"
            java.lang.String r8 = ""
            com.tencent.mm.sdk.platformtools.Log.a(r7, r8, r6)
            goto L6e
        L6d:
            r0 = r5
        L6e:
            if (r0 == 0) goto L74
            java.lang.String r5 = r0.getString(r1)
        L74:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r6 = "click to see wecom : "
            r0.<init>(r6)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = r9.H
            com.tencent.mars.xlog.Log.i(r6, r0)
            zl2.q4 r0 = zl2.q4.f473933a
            boolean r0 = r0.E()
            android.content.Context r6 = r9.f118183e
            if (r0 == 0) goto La6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r7 = "contactid:"
            r0.<init>(r7)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.widget.Toast r0 = db5.t7.makeText(r6, r0, r3)
            r0.show()
        La6:
            java.lang.Class<ab0.b0> r0 = ab0.b0.class
            i95.m r0 = i95.n0.c(r0)
            ab0.b0 r0 = (ab0.b0) r0
            r45.g05 r3 = new r45.g05
            r3.<init>()
            java.lang.String r7 = xy2.c.e(r6)
            r3.f374785e = r7
            r3.f374784d = r4
            za0.k r0 = (za0.k) r0
            r0.getClass()
            l41.e0 r0 = new l41.e0
            r0.<init>(r5, r2, r3)
            com.tencent.mm.modelbase.r1 r3 = gm0.j1.d()
            r3.g(r0)
            r3 = 2131770609(0x7f103cf1, float:1.9172526E38)
            java.lang.String r3 = r6.getString(r3)
            el2.v r4 = new el2.v
            r4.<init>(r9, r0)
            com.tencent.mm.ui.widget.dialog.u3 r0 = com.tencent.mm.ui.widget.dialog.u3.f(r6, r3, r2, r1, r4)
            r9.W = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: el2.i0.f0(el2.i0):void");
    }

    public static final void g0(el2.i0 i0Var) {
        r45.jg1 jg1Var = i0Var.f253810J;
        if (jg1Var != null) {
            com.tencent.mm.plugin.finder.live.view.gb gbVar = (com.tencent.mm.plugin.finder.live.view.gb) ((jz5.n) i0Var.V).getValue();
            wt2.a aVar = i0Var.I;
            if (aVar == null) {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
            java.util.LinkedList linkedList = i0Var.Q.f22362e;
            gbVar.getClass();
            com.tencent.mm.plugin.finder.live.widget.e0.W(gbVar, null, false, 0, 7, null);
            gbVar.f0(aVar, jg1Var, linkedList);
        }
        com.tencent.mm.plugin.finder.live.widget.e0.t((el2.j1) ((jz5.n) i0Var.U).getValue(), false, 1, null);
        i0Var.m0(true);
    }

    public static final void h0(el2.i0 i0Var, int i17, com.tencent.mm.plugin.finder.live.widget.e0 e0Var) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        com.tencent.mm.plugin.finder.live.view.c4 k07 = i0Var.k0();
        k07.getClass();
        com.tencent.mm.plugin.finder.live.widget.e0.W(k07, e0Var, false, 0, 6, null);
        com.tencent.mm.ui.widget.MMEditText mMEditText = k07.K;
        if (mMEditText != null) {
            mMEditText.setText("");
        }
        k07.M = i17;
        k07.g0();
        com.tencent.mm.ui.tools.f5 f5Var = k07.N;
        if (f5Var != null) {
            f5Var.f();
        }
        android.content.Context context = k07.f118183e;
        if (i17 == 2) {
            android.widget.TextView textView3 = k07.f116225J;
            if (textView3 != null) {
                textView3.setText(context.getString(com.tencent.mm.R.string.e8q));
            }
        } else if (i17 == 1 && (textView = k07.f116225J) != null) {
            textView.setText(context.getString(com.tencent.mm.R.string.e96));
        }
        yz5.l lVar = k07.Q;
        if (lVar == null || (textView2 = k07.I) == null) {
            return;
        }
        textView2.setText((java.lang.CharSequence) lVar.invoke(java.lang.Integer.valueOf(i17)));
    }

    public static /* synthetic */ void n0(el2.i0 i0Var, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        i0Var.m0(z17);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.amu;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int D() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        android.content.Context context;
        android.content.Context context2;
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo;
        android.text.TextPaint paint;
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.K = rootView.findViewById(com.tencent.mm.R.id.f484779fi2);
        this.L = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.fjh);
        this.M = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.f484532ej4);
        this.N = rootView.findViewById(com.tencent.mm.R.id.fiu);
        this.P = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.fis);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) rootView.findViewById(com.tencent.mm.R.id.lcb);
        android.content.Context context3 = wxRecyclerView.getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        wxRecyclerView.setLayoutManager(new com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager(context3));
        bm2.v0 v0Var = this.Q;
        wxRecyclerView.setAdapter(v0Var);
        this.R = wxRecyclerView;
        android.view.View view = this.K;
        if (view != null) {
            view.setOnClickListener(new el2.q(this));
        }
        android.widget.TextView textView = this.M;
        if (textView != null && (paint = textView.getPaint()) != null) {
            com.tencent.mm.ui.bk.r0(paint, 0.8f);
        }
        android.widget.TextView textView2 = this.M;
        if (textView2 != null) {
            textView2.setOnClickListener(new el2.r(this));
        }
        v0Var.f22370p = new el2.u(this);
        ya2.b2 b17 = ya2.h.f460484a.b(xy2.c.e(this.f118183e));
        boolean z17 = false;
        if (b17 != null && (finderAuthInfo = b17.field_authInfo) != null && finderAuthInfo.getAuthIconType() == 2) {
            z17 = true;
        }
        java.lang.String str = null;
        if (z17) {
            android.widget.TextView textView3 = this.P;
            if (textView3 != null) {
                if (textView3 != null && (context2 = textView3.getContext()) != null) {
                    str = context2.getString(com.tencent.mm.R.string.e9a);
                }
                textView3.setText(str);
            }
        } else {
            android.widget.TextView textView4 = this.P;
            if (textView4 != null) {
                if (textView4 != null && (context = textView4.getContext()) != null) {
                    str = context.getString(com.tencent.mm.R.string.e9_);
                }
                textView4.setText(str);
            }
        }
        android.widget.TextView textView5 = this.L;
        if (textView5 != null) {
            com.tencent.mm.ui.fk.a(textView5);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void S() {
        super.S();
        dead();
    }

    public final void i0(int i17, java.lang.String str, r45.i23 i23Var, boolean z17) {
        yg2.b bVar;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String string;
        if (i17 != 1) {
            if (i17 == 2) {
                dk2.ef efVar = dk2.ef.f233372a;
                gk2.e eVar = dk2.ef.I;
                if (eVar == null || (bVar = eVar.f272475i) == null) {
                    return;
                }
                kotlinx.coroutines.l.d(bVar, null, null, new el2.n(this, str, i23Var, z17, null), 3, null);
                return;
            }
            return;
        }
        wt2.a aVar = this.I;
        if (aVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        r45.a52 a52Var = new r45.a52();
        a52Var.set(0, 2);
        r45.b52 b52Var = new r45.b52();
        java.lang.String str4 = "";
        if (i23Var == null || (str2 = i23Var.getString(3)) == null) {
            str2 = "";
        }
        b52Var.set(2, str2);
        b52Var.set(3, str);
        if (i23Var == null || (str3 = i23Var.getString(0)) == null) {
            str3 = "";
        }
        b52Var.set(0, str3);
        if (i23Var != null && (string = i23Var.getString(2)) != null) {
            str4 = string;
        }
        b52Var.set(4, str4);
        a52Var.set(2, new com.tencent.mm.protobuf.g(b52Var.toByteArray()));
        wt2.a.m4(aVar, a52Var, null, 2, null);
        wt2.a aVar2 = this.I;
        if (aVar2 == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        gk2.e q57 = aVar2.q5();
        if (q57 != null) {
            bf2.c.b(bf2.c.f19598a, q57, 3, 2, str, 0, 16, null);
        }
    }

    public void j0(java.lang.String noticeId) {
        kotlin.jvm.internal.o.g(noticeId, "noticeId");
        if (l0().P()) {
            com.tencent.mm.plugin.finder.live.view.k7 l07 = l0();
            l07.getClass();
            bm2.x5 x5Var = l07.Q;
            if (x5Var != null) {
                java.util.LinkedList linkedList = x5Var.f22432f;
                if (linkedList != null) {
                    pm0.v.d0(linkedList, new bm2.u5(noticeId));
                }
                x5Var.notifyDataSetChanged();
            }
            android.widget.TextView textView = l07.L;
            if (textView == null) {
                return;
            }
            android.content.res.Resources resources = l07.f118183e.getResources();
            java.lang.Object[] objArr = new java.lang.Object[1];
            bm2.x5 x5Var2 = l07.Q;
            objArr[0] = x5Var2 != null ? java.lang.Integer.valueOf(x5Var2.getItemCount()) : null;
            textView.setText(resources.getString(com.tencent.mm.R.string.dyz, objArr));
        }
    }

    public final com.tencent.mm.plugin.finder.live.view.c4 k0() {
        return (com.tencent.mm.plugin.finder.live.view.c4) ((jz5.n) this.Y).getValue();
    }

    public final com.tencent.mm.plugin.finder.live.view.k7 l0() {
        return (com.tencent.mm.plugin.finder.live.view.k7) ((jz5.n) this.T).getValue();
    }

    public final void m0(boolean z17) {
        if (P()) {
            s(z17);
        }
        if (l0().P()) {
            com.tencent.mm.plugin.finder.live.view.k7 l07 = l0();
            l07.s(true);
            bm2.x5 x5Var = l07.Q;
            if (x5Var != null) {
                java.util.LinkedList linkedList = x5Var.f22432f;
                if (linkedList != null) {
                    linkedList.clear();
                }
                x5Var.notifyDataSetChanged();
            }
        }
    }

    public void o0(wt2.a p17, androidx.lifecycle.j0 liveData, androidx.lifecycle.y liftCycle) {
        kotlin.jvm.internal.o.g(p17, "p");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(liftCycle, "liftCycle");
        this.I = p17;
        bm2.v0 v0Var = this.Q;
        v0Var.f22368n = p17;
        v0Var.f22369o = new el2.a0(this);
        liveData.observe(liftCycle, new el2.b0(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.W;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (i17 == 0 && i18 == 0) {
            dk2.ef efVar = dk2.ef.f233372a;
            gk2.e eVar = dk2.ef.I;
            if (eVar != null) {
                mm2.f6 f6Var = (mm2.f6) eVar.a(mm2.f6.class);
                kotlin.jvm.internal.o.e(m1Var, "null cannot be cast to non-null type com.tencent.mm.feature.openim.api.INetSceneSearchOpenIMContact");
                f6Var.R6(this.f118183e, (ab0.v) m1Var);
            }
        }
        gm0.j1.d().q(vb1.e.CTRL_INDEX, this);
    }

    public void p0() {
        wt2.a aVar = this.I;
        if (aVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        java.util.LinkedList j07 = aVar.j0();
        if (j07 == null || j07.isEmpty()) {
            com.tencent.mm.plugin.finder.live.widget.e0.W((el2.j1) ((jz5.n) this.U).getValue(), null, false, 0, 7, null);
        } else {
            com.tencent.mm.plugin.finder.live.widget.e0.W(this, null, false, 0, 7, null);
            alive();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void s(boolean z17) {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.R;
        if (wxRecyclerView != null) {
            wxRecyclerView.setVisibility(8);
        }
        super.s(z17);
    }
}
