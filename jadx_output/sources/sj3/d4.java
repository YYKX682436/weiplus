package sj3;

/* loaded from: classes14.dex */
public final class d4 implements com.tencent.mm.plugin.multitalk.model.z, com.tencent.mm.plugin.multitalk.model.b0 {

    /* renamed from: d, reason: collision with root package name */
    public sj3.q3 f408475d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.voip.ui.e f408476e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.Intent f408477f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f408478g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f408479h;

    /* renamed from: m, reason: collision with root package name */
    public boolean f408481m;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f408484p;

    /* renamed from: i, reason: collision with root package name */
    public int f408480i = 1;

    /* renamed from: n, reason: collision with root package name */
    public long f408482n = -1;

    /* renamed from: o, reason: collision with root package name */
    public java.util.ArrayList f408483o = new java.util.ArrayList();

    @Override // com.tencent.mm.plugin.multitalk.model.z
    public void C() {
    }

    @Override // com.tencent.mm.plugin.multitalk.model.z
    public void D2(java.lang.String str) {
    }

    @Override // com.tencent.mm.plugin.multitalk.model.z
    public void I5(sj3.e4 e4Var, sj3.e4 e4Var2) {
    }

    @Override // com.tencent.mm.plugin.multitalk.model.z
    public void J5(java.lang.String str) {
    }

    @Override // com.tencent.mm.plugin.multitalk.model.z
    public void N0() {
    }

    @Override // com.tencent.mm.plugin.multitalk.model.z
    public void Z(boolean z17) {
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    @Override // com.tencent.mm.plugin.multitalk.model.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Z3() {
        /*
            r8 = this;
            com.tencent.mm.plugin.multitalk.model.v0 r0 = com.tencent.mm.plugin.multitalk.model.e3.Ri()
            boolean r0 = r0.B()
            if (r0 == 0) goto L16
            com.tencent.mm.sdk.platformtools.n3 r0 = r8.f408484p
            if (r0 == 0) goto L16
            sj3.y3 r1 = new sj3.y3
            r1.<init>(r8)
            r0.post(r1)
        L16:
            com.tencent.mm.sdk.platformtools.n3 r0 = r8.f408484p
            if (r0 == 0) goto L22
            sj3.z3 r1 = new sj3.z3
            r1.<init>(r8)
            r0.post(r1)
        L22:
            com.tencent.mm.plugin.multitalk.model.v0 r0 = com.tencent.mm.plugin.multitalk.model.e3.Ri()
            boolean r0 = r0.y()
            if (r0 == 0) goto L33
            com.tencent.mm.plugin.multitalk.model.v0 r0 = com.tencent.mm.plugin.multitalk.model.e3.Ri()
            r0.T()
        L33:
            long r0 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.multitalk.model.v0 r2 = com.tencent.mm.plugin.multitalk.model.e3.Ri()
            com.tencent.mm.modeltalkroom.MultiTalkGroup r3 = r2.f150177t
            java.lang.String r3 = r3.f71606d
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.K0(r3)
            if (r3 == 0) goto L49
            com.tencent.mm.modeltalkroom.MultiTalkGroup r3 = r2.f150177t
            java.lang.String r3 = r3.f71607e
        L49:
            com.tencent.mm.modeltalkroom.MultiTalkGroup r3 = r2.f150177t
            java.lang.String r3 = r3.f71608f
            boolean r3 = r2.w(r3)
            com.tencent.mm.modeltalkroom.MultiTalkGroup r4 = r2.f150177t
            com.tencent.mm.plugin.multitalk.model.o2.b(r4)
            com.tencent.mm.modeltalkroom.MultiTalkGroup r2 = r2.f150177t
            java.lang.String r2 = r2.f71608f
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if (r3 == 0) goto L67
            com.tencent.mm.plugin.multitalk.ilinkservice.i4 r2 = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE
            java.util.List r2 = r2.B()
        L67:
            java.lang.String r3 = c01.z1.r()
            boolean r2 = r2.contains(r3)
            r3 = 0
            if (r2 != 0) goto L75
            r8.f408481m = r3
            goto L8b
        L75:
            long r4 = r8.f408482n
            r6 = -1
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L86
            long r4 = r0 - r4
            r6 = 5000(0x1388, double:2.4703E-320)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L86
            goto L90
        L86:
            r3 = 1
            r8.f408481m = r3
            r8.f408482n = r0
        L8b:
            r8.g(r2)
            boolean r3 = r8.f408481m
        L90:
            if (r3 != 0) goto L95
            r8.i()
        L95:
            r8.l()
            com.tencent.mm.plugin.multitalk.model.s0 r0 = com.tencent.mm.plugin.multitalk.model.e3.wi()
            com.tencent.mm.plugin.multitalk.model.r2 r1 = r0.f150118m
            if (r1 == 0) goto Lb3
            boolean r1 = r0.c()
            if (r1 == 0) goto Lb3
            boolean r1 = r0.b()
            if (r1 == 0) goto Lb3
            boolean r1 = r0.f150123r
            if (r1 == 0) goto Lb3
            r0.g()
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sj3.d4.Z3():void");
    }

    @Override // com.tencent.mm.plugin.multitalk.model.b0
    public com.tencent.mm.plugin.multitalk.model.a0 b(java.lang.String wxUserName) {
        kotlin.jvm.internal.o.g(wxUserName, "wxUserName");
        sj3.q3 q3Var = this.f408475d;
        if (q3Var != null) {
            if (android.text.TextUtils.isEmpty(q3Var.getF150344m()) || kotlin.jvm.internal.o.b(q3Var.getF150344m(), wxUserName)) {
                return q3Var;
            }
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.multitalk.model.b0
    public void c() {
    }

    @Override // com.tencent.mm.plugin.multitalk.model.b0
    public com.tencent.mm.plugin.multitalk.model.a0 d(int i17) {
        return null;
    }

    public final void e(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkSmallWindow", "dismiss now.. isFinish: %b, smallView: %s", java.lang.Boolean.valueOf(z17), this.f408475d);
        sj3.q3 q3Var = this.f408475d;
        if (q3Var != null) {
            if (z17) {
                iq4.b.f293798a.f0(q3Var);
            }
            sj3.q3 q3Var2 = this.f408475d;
            if (q3Var2 != null) {
                q3Var2.setOnClickListener(null);
            }
            sj3.q3 q3Var3 = this.f408475d;
            if (q3Var3 != null) {
                q3Var3.j();
            }
            this.f408475d = null;
            com.tencent.mm.plugin.multitalk.model.e3.Ri().C = null;
            com.tencent.mm.plugin.multitalk.model.e3.wi().f150116h = null;
        } else if (z17) {
            iq4.b.f293798a.d();
        }
        com.tencent.mm.plugin.multitalk.model.e3.Ri().q().h(this);
    }

    public final void f(android.content.Intent intent, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkSmallWindow", "mini now..");
        if (this.f408475d != null) {
            e(false);
        }
        if (this.f408475d == null) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            this.f408475d = new sj3.q3(context);
            this.f408478g = false;
        }
        sj3.q3 q3Var = this.f408475d;
        if (q3Var != null) {
            boolean c17 = com.tencent.mm.plugin.multitalk.model.e3.wi().c();
            sj3.n1 n1Var = q3Var.f408711m;
            if (n1Var != null) {
                n1Var.f408652f = c17;
                n1Var.a(n1Var.f408653g, c17);
            }
        }
        sj3.q3 q3Var2 = this.f408475d;
        if (q3Var2 != null) {
            boolean z18 = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150162e;
            sj3.n1 n1Var2 = q3Var2.f408711m;
            if (n1Var2 != null) {
                n1Var2.f408653g = z18;
                n1Var2.a(z18, n1Var2.f408652f);
            }
        }
        this.f408484p = new com.tencent.mm.sdk.platformtools.n3();
        com.tencent.mm.plugin.multitalk.model.e3.Ri().C = this;
        com.tencent.mm.plugin.multitalk.model.e3.wi().f150116h = this;
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f408479h;
        if (b4Var != null) {
            b4Var.d();
        }
        sj3.q3 q3Var3 = this.f408475d;
        if (q3Var3 != null) {
            q3Var3.setOnClickListener(new sj3.t3(intent, this));
        }
        iq4.c cVar = iq4.b.f293798a;
        cVar.e0(8, true, this.f408475d, 3L, false);
        cVar.z();
        com.tencent.mm.plugin.multitalk.model.e3.Bi().f150134b = null;
        this.f408480i = 1;
        n(false);
        com.tencent.mm.plugin.voip.ui.e eVar = this.f408476e;
        kotlin.jvm.internal.o.d(eVar);
        eVar.c(intent, this.f408475d);
        com.tencent.mm.plugin.multitalk.model.p3 q17 = com.tencent.mm.plugin.multitalk.model.e3.Ri().q();
        kotlin.jvm.internal.o.d(q17);
        q17.g(0, "");
        q17.e(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
    
        if (r0.getHasShowDeviceStatus() == true) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(boolean r4) {
        /*
            r3 = this;
            sj3.q3 r0 = r3.f408475d
            if (r0 == 0) goto L45
            boolean r1 = r3.f408478g
            if (r1 != 0) goto L45
            if (r4 != 0) goto L27
            r1 = 0
            if (r0 == 0) goto L15
            boolean r0 = r0.getHasShowDeviceStatus()
            r2 = 1
            if (r0 != r2) goto L15
            goto L16
        L15:
            r2 = r1
        L16:
            if (r2 == 0) goto L27
            sj3.q3 r0 = r3.f408475d
            if (r0 != 0) goto L1d
            goto L20
        L1d:
            r0.setHasShowDeviceStatus(r1)
        L20:
            sj3.q3 r0 = r3.f408475d
            if (r0 == 0) goto L27
            r0.f()
        L27:
            ku5.u0 r0 = ku5.t0.f312615d
            ku5.t0 r0 = (ku5.t0) r0
            java.lang.String r1 = "showIcon"
            r0.A(r1)
            ku5.u0 r0 = ku5.t0.f312615d
            java.lang.String r2 = "resumeIcon"
            ku5.t0 r0 = (ku5.t0) r0
            r0.A(r2)
            ku5.u0 r0 = ku5.t0.f312615d
            sj3.v3 r2 = new sj3.v3
            r2.<init>(r3, r4)
            ku5.t0 r0 = (ku5.t0) r0
            r0.h(r2, r1)
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sj3.d4.g(boolean):void");
    }

    @Override // com.tencent.mm.plugin.multitalk.model.z
    public boolean g4() {
        return com.tencent.mm.plugin.multitalk.model.e3.wi().c();
    }

    public final void h() {
        if (this.f408475d == null) {
            e(true);
            return;
        }
        this.f408478g = true;
        ((ku5.t0) ku5.t0.f312615d).A("showIcon");
        ((ku5.t0) ku5.t0.f312615d).B(new sj3.x3(this));
    }

    @Override // com.tencent.mm.plugin.multitalk.model.z
    public void h0(boolean z17) {
    }

    public final void i() {
        sj3.u1 u1Var;
        java.util.Map.Entry entry;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = com.tencent.mm.plugin.multitalk.model.e3.Bi().f150134b;
        java.lang.String str = (copyOnWriteArrayList == null || (entry = (java.util.Map.Entry) kz5.n0.Z(copyOnWriteArrayList)) == null) ? null : (java.lang.String) entry.getKey();
        sj3.q3 q3Var = this.f408475d;
        boolean z17 = (q3Var != null ? q3Var.getRendererSpeaker() : null) == null;
        sj3.q3 q3Var2 = this.f408475d;
        if (kotlin.jvm.internal.o.b(str, q3Var2 != null ? q3Var2.getRendererSpeaker() : null)) {
            sj3.q3 q3Var3 = this.f408475d;
            if (q3Var3 != null) {
                sj3.u1 u1Var2 = q3Var3.f408710i;
                if (u1Var2 != null) {
                    boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    u1Var2.f408769q = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime());
                }
                sj3.u1 u1Var3 = q3Var3.f408710i;
                if ((u1Var3 != null && u1Var3.f408764l) || (u1Var = q3Var3.f408710i) == null) {
                    return;
                }
                u1Var.c(q3Var3.getRendererSpeaker());
                return;
            }
            return;
        }
        if (str == null) {
            if (z17) {
                sj3.q3 q3Var4 = this.f408475d;
                if (q3Var4 != null) {
                    q3Var4.m(null);
                }
                n(false);
                return;
            }
            ku5.u0 u0Var = ku5.t0.f312615d;
            sj3.a4 a4Var = new sj3.a4(this);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(a4Var, 1000L, false);
            return;
        }
        if (!z17) {
            ku5.u0 u0Var2 = ku5.t0.f312615d;
            sj3.b4 b4Var = new sj3.b4(this, str);
            ku5.t0 t0Var2 = (ku5.t0) u0Var2;
            t0Var2.getClass();
            t0Var2.z(b4Var, 1000L, false);
            return;
        }
        sj3.q3 q3Var5 = this.f408475d;
        if (q3Var5 != null) {
            q3Var5.m(str);
        }
        sj3.q3 q3Var6 = this.f408475d;
        if (q3Var6 != null) {
            q3Var6.o(str);
        }
        n(true);
    }

    @Override // com.tencent.mm.plugin.multitalk.model.z
    public void i1(com.tencent.mm.plugin.multitalk.model.n2 n2Var, com.tencent.mm.plugin.multitalk.model.n2 n2Var2) {
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // com.tencent.mm.plugin.multitalk.model.z
    public void i4() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkSmallWindow", "onVideoGroupMemberChange, SubCoreMultiTalk.getMultiTalkManager().getCurrentVideoUserSet().size(): " + com.tencent.mm.plugin.multitalk.model.e3.Ri().f150174q.size());
        if (com.tencent.mm.plugin.multitalk.model.e3.Ri().y()) {
            if (com.tencent.mm.plugin.multitalk.model.e3.Ri().f150174q.size() > com.tencent.mm.plugin.multitalk.model.e3.Ri().f150174q.contains(c01.z1.r())) {
                com.tencent.mm.plugin.multitalk.model.e3.Ri().T();
                sj3.q3 q3Var = this.f408475d;
                if (q3Var == null || kotlin.jvm.internal.o.b(q3Var.getRendererSpeaker(), "")) {
                    return;
                }
                n(true);
                sj3.q3 q3Var2 = this.f408475d;
                if (q3Var2 != null) {
                    q3Var2.p();
                    return;
                }
                return;
            }
            com.tencent.mm.plugin.multitalk.model.e3.Ri().W();
            sj3.q3 q3Var3 = this.f408475d;
            if (q3Var3 != null) {
                if (kotlin.jvm.internal.o.b(q3Var3.getRendererSpeaker(), "")) {
                    i();
                } else {
                    sj3.q3 q3Var4 = this.f408475d;
                    if (q3Var4 != null) {
                        q3Var4.o(q3Var3.getRendererSpeaker());
                    }
                }
            }
            l();
            n(false);
        }
    }

    @Override // com.tencent.mm.plugin.multitalk.model.z
    public void j(int i17) {
    }

    @Override // com.tencent.mm.plugin.multitalk.model.z
    public void k() {
    }

    public final void l() {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150175r;
        if (list != null) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                com.tencent.mm.modeltalkroom.VideoGroupMember videoGroupMember = (com.tencent.mm.modeltalkroom.VideoGroupMember) it.next();
                if (!kotlin.jvm.internal.o.b(videoGroupMember.f71619e, c01.z1.r())) {
                    arrayList.add(java.lang.Integer.valueOf(videoGroupMember.f71618d));
                }
            }
        }
        if (!arrayList.isEmpty()) {
            if (kotlin.jvm.internal.o.b(kz5.n0.X0(this.f408483o), kz5.n0.X0(arrayList))) {
                z17 = true;
            } else {
                this.f408483o = arrayList;
                z17 = false;
            }
            if (z17) {
                return;
            }
            if (this.f408483o.size() == 1) {
                com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE;
                java.lang.Integer num = (java.lang.Integer) kz5.n0.X(this.f408483o);
                i4Var.getClass();
                i4Var.J(new com.tencent.mm.plugin.multitalk.ilinkservice.h3(i4Var, num, false));
            } else {
                com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var2 = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE;
                java.util.ArrayList arrayList2 = this.f408483o;
                i4Var2.getClass();
                i4Var2.J(new com.tencent.mm.plugin.multitalk.ilinkservice.g3(i4Var2, arrayList2, false));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkSmallWindow", "ilink subscribeByUserMids ok, mids:" + arrayList + " and subscribe one is " + this.f408483o);
        }
    }

    public final void m(int i17) {
        sj3.q3 q3Var = this.f408475d;
        if (q3Var != null) {
            q3Var.setVoicePlayDevice(i17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        r1 = 4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(boolean r23) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sj3.d4.n(boolean):void");
    }

    @Override // com.tencent.mm.plugin.multitalk.model.z
    public void n3(boolean z17) {
    }

    @Override // com.tencent.mm.plugin.multitalk.model.z
    public void p() {
    }

    @Override // com.tencent.mm.plugin.multitalk.model.z
    public void p0(int i17, int i18) {
    }

    @Override // com.tencent.mm.plugin.multitalk.model.z
    public void p3() {
        h();
    }

    @Override // com.tencent.mm.plugin.multitalk.model.z
    public void r2() {
    }

    @Override // com.tencent.mm.plugin.multitalk.model.z
    public void v4() {
    }

    @Override // com.tencent.mm.plugin.multitalk.model.z
    public void x5() {
    }
}
