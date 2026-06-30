package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public abstract class a0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.viewitems.q0 f203223d;

    /* renamed from: e, reason: collision with root package name */
    public wl5.v f203224e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.viewitems.r0 f203225f;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.y5 f203227h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.a6 f203228i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.z5 f203229m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.n6 f203230n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.f6 f203231o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.i6 f203232p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.b6 f203233q;

    /* renamed from: g, reason: collision with root package name */
    public boolean f203226g = false;

    /* renamed from: r, reason: collision with root package name */
    public java.util.concurrent.Future f203234r = null;

    public static boolean J(java.lang.String str) {
        return !(com.tencent.mm.storage.z3.z4(str) || com.tencent.mm.storage.z3.R3(str) || c01.e2.G(str) || c01.e2.U(str)) || com.tencent.mm.storage.z3.R4(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006e, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
    
        if ((c01.id.c() - r0) > r6) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0087, code lost:
    
        if ((c01.id.c() - r0) > u04.d.f423477c) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006a, code lost:
    
        if ((c01.id.c() - r0) > r2) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006c, code lost:
    
        r0 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean L(com.tencent.mm.storage.f9 r14, yb5.d r15) {
        /*
            long r0 = r14.getCreateTime()
            java.lang.Class<e42.e0> r15 = e42.e0.class
            i95.m r2 = i95.n0.c(r15)
            e42.e0 r2 = (e42.e0) r2
            e42.d0 r3 = e42.d0.clicfg_message_file_revoke_time
            h62.d r2 = (h62.d) r2
            r4 = 120000(0x1d4c0, double:5.9288E-319)
            long r2 = r2.Ui(r3, r4)
            i95.m r6 = i95.n0.c(r15)
            e42.e0 r6 = (e42.e0) r6
            e42.d0 r7 = e42.d0.clicfg_android_transfer_revoke_timelimit
            h62.d r6 = (h62.d) r6
            long r6 = r6.Ui(r7, r4)
            boolean r8 = r14.k2()
            r9 = 419430449(0x19000031, float:6.6174836E-24)
            java.lang.String r10 = "MicroMsg.ChattingItem"
            r11 = 0
            r12 = 1
            if (r8 == 0) goto L80
            java.lang.String r8 = r14.j()
            ot0.q r8 = ot0.q.v(r8)
            if (r8 == 0) goto L70
            ez.v0 r13 = ez.v0.f257777a
            int r8 = r8.f348666i
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            boolean r8 = r13.j(r8)
            if (r8 == 0) goto L70
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            long r5 = c01.id.c()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5, r6}
            java.lang.String r5 = "File revoke time is ：%s, TimeHelper.getSyncServerTimeMs(): %s, msgTime: %s"
            com.tencent.mars.xlog.Log.i(r10, r5, r4)
            long r4 = c01.id.c()
            long r4 = r4 - r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L6e
        L6c:
            r0 = r12
            goto L8a
        L6e:
            r0 = r11
            goto L8a
        L70:
            int r2 = r14.getType()
            if (r2 != r9) goto L80
            long r2 = c01.id.c()
            long r2 = r2 - r0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto L6e
            goto L6c
        L80:
            long r2 = c01.id.c()
            long r2 = r2 - r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L6e
            goto L6c
        L8a:
            if (r0 == 0) goto La2
            java.lang.String r15 = r14.Q0()
            long r0 = r14.I0()
            java.lang.Long r14 = java.lang.Long.valueOf(r0)
            java.lang.Object[] r14 = new java.lang.Object[]{r15, r14}
            java.lang.String r15 = "isRevokeExpire, msg talker: %s, svr id: %s."
            com.tencent.mars.xlog.Log.i(r10, r15, r14)
            return r11
        La2:
            int r0 = r14.A0()
            if (r0 == r12) goto La9
            return r11
        La9:
            java.lang.Class<c25.e> r0 = c25.e.class
            lm0.a r0 = gm0.j1.s(r0)
            c25.e r0 = (c25.e) r0
            com.tencent.mm.plugin.zero.a r0 = (com.tencent.mm.plugin.zero.a) r0
            ip.j r0 = r0.b()
            java.lang.String r1 = "ShowRevokeMsgEntry"
            int r0 = r0.b(r1, r12)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "[oneliang][isRevokeMsgEnable] enable:%d"
            com.tencent.mars.xlog.Log.i(r10, r2, r1)
            int r14 = r14.getType()
            if (r14 != r9) goto Le9
            i95.m r14 = i95.n0.c(r15)
            e42.e0 r14 = (e42.e0) r14
            e42.d0 r15 = e42.d0.clicfg_android_transfer_revoke_menu_config
            h62.d r14 = (h62.d) r14
            int r14 = r14.Ni(r15, r11)
            long r14 = (long) r14
            if (r0 != r12) goto Le8
            r0 = 1
            int r14 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r14 != 0) goto Le8
            r11 = r12
        Le8:
            return r11
        Le9:
            if (r12 != r0) goto Lec
            r11 = r12
        Lec:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.a0.L(com.tencent.mm.storage.f9, yb5.d):boolean");
    }

    public static void T(android.widget.ImageView imageView, java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            imageView.setImageResource(com.tencent.mm.R.drawable.bhm);
        } else {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, str, str2);
        }
    }

    public static void U(android.widget.ImageView imageView, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            imageView.setImageResource(com.tencent.mm.R.drawable.bgo);
        } else {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(imageView, str);
        }
    }

    public static void h(android.content.Intent intent, java.lang.String str) {
        if (intent == null || !com.tencent.mm.storage.z3.U4(str)) {
            return;
        }
        intent.putExtra(com.tencent.mm.ui.w2.f211205r, true);
    }

    public static void p(int i17, java.lang.CharSequence charSequence, com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView, boolean z17, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.viewitems.i0 i0Var) {
        ks5.a i18;
        int i19;
        java.util.Map d17;
        if (i17 == 0 || charSequence == null || charSequence.length() != mMNeat7extView.a().length() || (i18 = mMNeat7extView.i((int) (((mMNeat7extView.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480241sa) / j65.f.f297943g) - mMNeat7extView.getPaddingLeft()) - mMNeat7extView.getPaddingRight()), Integer.MAX_VALUE)) == null || (i19 = ((com.tencent.neattextview.textview.layout.NeatLayout) i18).L) <= 0) {
            return;
        }
        int g17 = i19 <= 2 ? ((ks5.c) i18).g(0, (int) ((mMNeat7extView.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480241sa) / 2) * j65.f.f297943g)) : ((ks5.c) i18).g(2, 0.0f);
        if (g17 < 1 || g17 >= charSequence.length()) {
            return;
        }
        java.lang.String string = mMNeat7extView.getContext().getString(com.tencent.mm.R.string.w_);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = mMNeat7extView.getContext();
        int textSize = (int) mMNeat7extView.getTextSize();
        ((ke0.e) xVar).getClass();
        android.text.SpannableString u17 = com.tencent.mm.pluginsdk.ui.span.c0.u(context, charSequence, textSize, 1, null, null, z17);
        android.text.SpannableString valueOf = android.text.SpannableString.valueOf(string);
        com.tencent.mm.ui.chatting.viewitems.f0 f0Var = new com.tencent.mm.ui.chatting.viewitems.f0(1, null, i0Var);
        valueOf.setSpan(f0Var, 0, string.length(), 17);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) u17);
        spannableStringBuilder.delete(g17, u17.length());
        spannableStringBuilder.append((java.lang.CharSequence) "...");
        spannableStringBuilder.append((java.lang.CharSequence) valueOf);
        android.text.SpannableString spannableString = new android.text.SpannableString(spannableStringBuilder.subSequence(0, spannableStringBuilder.length()));
        mMNeat7extView.c(spannableString, android.widget.TextView.BufferType.SPANNABLE, null);
        if (f9Var != null) {
            spannableString.removeSpan(f0Var);
            i0Var.a(spannableString);
            if (i17 == 2 && c01.ia.i(f9Var) == 0) {
                int i27 = g17 + 2;
                if (com.tencent.mm.sdk.platformtools.t8.K0(f9Var.G) || (d17 = com.tencent.mm.sdk.platformtools.aa.d(f9Var.G, "msgsource", null)) == null) {
                    return;
                }
                d17.put(".msgsource.sec_msg_node.clip-len", java.lang.String.valueOf(i27));
                c01.ia.O(f9Var, c01.ia.I(d17), true);
            }
        }
    }

    public static java.lang.String t(yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        java.lang.String x17 = dVar.x();
        return com.tencent.mm.storage.z3.R4(x17) ? c01.w9.s(f9Var.j()) : x17;
    }

    public static java.lang.String v(com.tencent.mm.storage.f9 f9Var, boolean z17, boolean z18) {
        java.lang.String str = null;
        if (f9Var == null) {
            return null;
        }
        if (f9Var.A0() == 1) {
            return c01.z1.r();
        }
        if (z17) {
            str = c01.w9.s(f9Var.j());
        } else if (z18) {
            str = f9Var.u0();
        }
        return com.tencent.mm.sdk.platformtools.t8.K0(str) ? f9Var.Q0() : str;
    }

    public static int y(com.tencent.mm.pluginsdk.ui.span.z0 z0Var) {
        int type = z0Var.getType();
        if (type == 1 || type == 27 || type == 30) {
            return 2;
        }
        if (type == 45) {
            return 6;
        }
        if (type == 58) {
            return 5;
        }
        if (type == 60) {
            return 7;
        }
        if (type != 24) {
            return type != 25 ? 0 : 3;
        }
        return 4;
    }

    public java.lang.String A(yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        if (M()) {
            return dVar.t();
        }
        java.lang.String x17 = dVar.x();
        if (!c0(dVar)) {
            return x17;
        }
        if (!dVar.D()) {
            return f9Var != null ? f9Var.u0() : x17;
        }
        java.lang.String s17 = c01.w9.s(f9Var.j());
        return (s17 == null || s17.length() <= 0) ? x17 : s17;
    }

    public com.tencent.mm.ui.chatting.n6 B(yb5.d dVar) {
        if (this.f203230n == null) {
            this.f203230n = new com.tencent.mm.ui.chatting.n6(dVar);
        }
        return this.f203230n;
    }

    public boolean C() {
        return !(this instanceof com.tencent.mm.ui.chatting.viewitems.i1);
    }

    public void D(yb5.d dVar, com.tencent.mm.storage.f9 f9Var, int i17, boolean z17, java.lang.String str, boolean z18, java.lang.String str2, int i18) {
        E(dVar, f9Var, i17, z17, str, z18, str2, i18, null);
    }

    public void E(yb5.d dVar, com.tencent.mm.storage.f9 f9Var, final int i17, boolean z17, final java.lang.String str, boolean z18, final java.lang.String str2, final int i18, final rq1.k0 k0Var) {
        final int i19 = dVar.C() ? 2 : 1;
        final java.lang.String x17 = dVar.C() ? dVar.x() : "0";
        final java.lang.String A = A(dVar, f9Var);
        final java.lang.String str3 = f9Var.I0() + "";
        final java.lang.String Zi = ((rq1.m0) ((rq1.l0) i95.n0.c(rq1.l0.class))).Zi();
        final long Vi = ((rq1.m0) ((rq1.l0) i95.n0.c(rq1.l0.class))).Vi();
        int i27 = z18 ? 65 : 34;
        if (!z17) {
            su4.k3.d(i17, str2, i27, 0, "", Zi, str3, A, i19, x17, Vi, str.length(), i18, "", "", -1, 0);
        } else {
            final int i28 = i27;
            ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.viewitems.a0$$b
                @Override // java.lang.Runnable
                public final void run() {
                    int i29 = i17;
                    java.lang.String str4 = str2;
                    int i37 = i28;
                    java.lang.String str5 = Zi;
                    java.lang.String str6 = str3;
                    java.lang.String str7 = A;
                    int i38 = i19;
                    java.lang.String str8 = x17;
                    long j17 = Vi;
                    int i39 = i18;
                    rq1.k0 k0Var2 = rq1.k0.this;
                    java.lang.String str9 = str;
                    if (k0Var2 != null) {
                        su4.k3.d(i29, str4, i37, 1, k0Var2.f398753c, str5, str6, str7, i38, str8, j17, str9.length(), i39, k0Var2.f398751a, k0Var2.f398754d, k0Var2.f398752b, k0Var2.f398755e);
                    } else {
                        rq1.k0 wi6 = ((rq1.m0) ((rq1.l0) i95.n0.c(rq1.l0.class))).wi(str9);
                        su4.k3.d(i29, str4, i37, 1, wi6.f398753c, str5, str6, str7, i38, str8, j17, str9.length(), i39, wi6.f398751a, wi6.f398754d, wi6.f398752b, wi6.f398755e);
                    }
                }
            });
        }
    }

    public abstract android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view);

    public void G(yb5.d dVar, android.view.View view, java.lang.Object obj) {
        view.setTag(obj);
        if (this.f203231o == null) {
            this.f203231o = new com.tencent.mm.ui.chatting.f6(dVar);
        }
        view.setOnClickListener(this.f203231o);
    }

    public void H(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, com.tencent.mm.storage.f9 f9Var) {
        android.widget.ProgressBar progressBar = g0Var.uploadingPB;
        if (progressBar == null) {
            return;
        }
        progressBar.setTag(com.tencent.mm.R.id.bpk, null);
        java.util.concurrent.Future future = this.f203234r;
        if (future != null) {
            future.cancel(false);
        }
        g0Var.uploadingPB.setVisibility(8);
        g0Var.uploadingPB.setTag(com.tencent.mm.R.id.bpi, java.lang.Long.valueOf(f9Var.getCreateTime()));
    }

    public boolean I(sb5.z zVar, long j17) {
        if (j17 <= 0) {
            return false;
        }
        com.tencent.mm.ui.chatting.adapter.k kVar = (com.tencent.mm.ui.chatting.adapter.k) zVar;
        long j18 = kVar.f198427y0;
        if (j18 == kVar.f198425x0) {
            kVar.f198427y0 = 0L;
            int count = kVar.getCount() - 1;
            while (true) {
                if (-1 < count) {
                    com.tencent.mm.storage.f9 item = kVar.getItem(count);
                    if ((item != null && item.A0() == 1) && (item.F & 4) != 4) {
                        kVar.f198427y0 = item.getMsgId();
                        break;
                    }
                    count--;
                } else {
                    break;
                }
            }
            j18 = kVar.f198427y0;
        }
        return j18 == j17;
    }

    public boolean K() {
        return this instanceof com.tencent.mm.ui.chatting.viewitems.b4;
    }

    public abstract boolean M();

    public boolean N() {
        return !(this instanceof com.tencent.mm.ui.chatting.viewitems.i1);
    }

    public boolean O(android.view.MenuItem menuItem, yb5.d dVar, com.tencent.mm.ui.chatting.viewitems.er erVar) {
        return false;
    }

    public abstract boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2);

    public abstract boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar);

    public abstract boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var);

    public void S(yb5.d dVar, rd5.d dVar2) {
    }

    public void V(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, rd5.d dVar, java.lang.String str, boolean z17, yb5.d dVar2, com.tencent.mm.ui.chatting.l6 l6Var) {
        W(g0Var, dVar, str, true, z17, dVar2, l6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void W(com.tencent.mm.ui.chatting.viewitems.g0 r5, rd5.d r6, java.lang.String r7, boolean r8, boolean r9, yb5.d r10, com.tencent.mm.ui.chatting.l6 r11) {
        /*
            r4 = this;
            we5.a r0 = r6.f394254d
            com.tencent.mm.storage.f9 r0 = r0.f445300b
            int r1 = r0.A0()
            r2 = 1
            if (r1 != r2) goto L72
            int r0 = r0.P0()
            r1 = -1
            if (r0 == r2) goto L2a
            r2 = 2
            if (r0 == r2) goto L2a
            r2 = 3
            if (r0 == r2) goto L2a
            r2 = 4
            if (r0 == r2) goto L2a
            r2 = 5
            if (r0 == r2) goto L26
            java.lang.String r0 = "MicroMsg.ChattingItem"
            java.lang.String r2 = "getMsgStateResId: not found this state"
            com.tencent.mars.xlog.Log.e(r0, r2)
            goto L2a
        L26:
            r0 = 2131236455(0x7f081667, float:1.8089133E38)
            goto L2b
        L2a:
            r0 = r1
        L2b:
            r2 = 0
            if (r0 == r1) goto L31
            r4.Z(r5, r2, r8)
        L31:
            android.widget.ImageView r8 = r5.stateIV
            if (r8 != 0) goto L36
            return
        L36:
            com.tencent.mm.ui.chatting.viewitems.er r3 = new com.tencent.mm.ui.chatting.viewitems.er
            r3.<init>(r6, r9, r5, r7)
            r8.setTag(r3)
            android.widget.ImageView r6 = r5.stateIV
            com.tencent.mm.ui.chatting.b6 r7 = r4.f203233q
            if (r7 != 0) goto L4b
            com.tencent.mm.ui.chatting.viewitems.c0 r7 = new com.tencent.mm.ui.chatting.viewitems.c0
            r7.<init>(r4, r10, r11)
            r4.f203233q = r7
        L4b:
            com.tencent.mm.ui.chatting.b6 r7 = r4.f203233q
            r6.setOnClickListener(r7)
            if (r0 == r1) goto L6b
            android.widget.ImageView r6 = r5.stateIV
            r6.setImageResource(r0)
            android.widget.ImageView r6 = r5.stateIV
            r6.setVisibility(r2)
            android.widget.ImageView r5 = r5.stateIV
            android.content.Context r6 = com.tencent.mm.sdk.platformtools.x2.f193071a
            r7 = 2131771874(0x7f1041e2, float:1.9175091E38)
            java.lang.String r6 = r6.getString(r7)
            r5.setContentDescription(r6)
            goto L72
        L6b:
            android.widget.ImageView r5 = r5.stateIV
            r6 = 8
            r5.setVisibility(r6)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.a0.W(com.tencent.mm.ui.chatting.viewitems.g0, rd5.d, java.lang.String, boolean, boolean, yb5.d, com.tencent.mm.ui.chatting.l6):void");
    }

    public void X(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, java.lang.CharSequence charSequence) {
        android.widget.TextView textView;
        if (g0Var == null || (textView = g0Var.userTV) == null) {
            return;
        }
        if (charSequence == null) {
            textView.setVisibility(8);
            return;
        }
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        g0Var.userTV.setText(charSequence);
        g0Var.userTV.setVisibility(0);
    }

    public boolean Y(int i17) {
        return true;
    }

    public void Z(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, boolean z17, boolean z18) {
        if (g0Var.uploadingPB == null) {
            return;
        }
        if (!z17) {
            g0Var.uploadingPB.setTag(com.tencent.mm.R.id.bpk, java.lang.Boolean.FALSE);
            java.util.concurrent.Future future = this.f203234r;
            if (future != null) {
                future.cancel(false);
            }
            g0Var.uploadingPB.setVisibility(8);
            return;
        }
        if (!z18) {
            g0Var.uploadingPB.setVisibility(0);
            g0Var.uploadingPB.setTag(com.tencent.mm.R.id.bpk, java.lang.Boolean.TRUE);
            return;
        }
        java.lang.Object tag = g0Var.uploadingPB.getTag(com.tencent.mm.R.id.bpi);
        if (tag != null && ((java.lang.Long) tag).longValue() < c01.id.c() - 1000) {
            g0Var.uploadingPB.setVisibility(0);
            g0Var.uploadingPB.setTag(com.tencent.mm.R.id.bpk, java.lang.Boolean.TRUE);
            return;
        }
        java.lang.Object tag2 = g0Var.uploadingPB.getTag(com.tencent.mm.R.id.bpk);
        if (tag2 != null && ((java.lang.Boolean) tag2).booleanValue()) {
            g0Var.uploadingPB.setVisibility(0);
            return;
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.ui.chatting.viewitems.d0 d0Var = new com.tencent.mm.ui.chatting.viewitems.d0(this, g0Var);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        this.f203234r = t0Var.z(d0Var, 1000L, false);
    }

    public boolean a0() {
        return this instanceof com.tencent.mm.ui.chatting.viewitems.o2;
    }

    public boolean b0() {
        return !(this instanceof com.tencent.mm.ui.chatting.viewitems.i1);
    }

    public boolean c0(yb5.d dVar) {
        if (M()) {
            return false;
        }
        return dVar.D() || ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) dVar.f460708c.a(sb5.f.class))).f198753r;
    }

    public com.tencent.mm.storage.a9 i(com.tencent.mm.storage.f9 f9Var, android.content.Context context, yb5.q qVar, yb5.a aVar) {
        return null;
    }

    public boolean j(yb5.d dVar, com.tencent.mm.pluginsdk.model.app.m mVar) {
        m33.b1 a17 = m33.a1.a();
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        android.app.Activity g17 = dVar.g();
        ((kt.c) i0Var).getClass();
        if (com.tencent.mm.pluginsdk.model.app.w.q(g17, mVar) || a17 == null) {
            return false;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(mVar.Q)) {
            boolean wi6 = ((yb0.c) ((zb0.y) i95.n0.c(zb0.y.class))).wi(dVar.g(), mVar.Q);
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItem", "oversea game info and gpdownload url is not empty, jump to google play directy:[%s], jump result: [%b]", mVar.Q, java.lang.Boolean.valueOf(wi6));
            if (wi6) {
                return true;
            }
        }
        int i17 = dVar.D() ? 2 : 1;
        com.tencent.mm.autogen.events.GameCenterOperationEvent gameCenterOperationEvent = new com.tencent.mm.autogen.events.GameCenterOperationEvent();
        am.ke keVar = gameCenterOperationEvent.f54357g;
        keVar.f7140a = 2;
        keVar.f7145f = i17;
        keVar.f7142c = mVar.field_appId;
        keVar.f7141b = dVar.g();
        gameCenterOperationEvent.e();
        ((com.tencent.mm.plugin.game.h0) a17).Di(dVar.g(), mVar.field_appId, 1, i17, i17);
        return true;
    }

    public void k(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, int i17, yb5.d dVar, com.tencent.mm.storage.f9 msg) {
        qk.o x07;
        if (dVar.u() == null || !dVar.u().k2() || (x07 = ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) dVar.f460708c.a(sb5.f.class))).x0()) == null || !x07.Q0()) {
            return;
        }
        int count = ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class))).getCount();
        long j17 = ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) dVar.f460708c.a(sb5.f.class))).f198751p;
        ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) dVar.f460708c.a(sb5.f.class))).A0();
        com.tencent.mm.storage.z3 talker = dVar.u();
        long j18 = r01.r1.f368216j;
        int i18 = r01.r1.f368217k;
        int i19 = r01.r1.f368218l;
        r01.j jVar = r01.j.f368119a;
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(msg, "msg");
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.Object obj = r01.j.f368120b;
            if (((com.tencent.mm.sdk.platformtools.r2) obj).get(java.lang.Long.valueOf(msg.getMsgId())) != null) {
                java.lang.Object obj2 = ((com.tencent.mm.sdk.platformtools.r2) obj).get(java.lang.Long.valueOf(msg.getMsgId()));
                kotlin.jvm.internal.o.f(obj2, "get(...)");
                if (currentTimeMillis - ((java.lang.Number) obj2).longValue() < 1000) {
                    return;
                }
            }
            ((com.tencent.mm.sdk.platformtools.r2) obj).put(java.lang.Long.valueOf(msg.getMsgId()), java.lang.Long.valueOf(currentTimeMillis));
            ((ku5.t0) ku5.t0.f312615d).h(new r01.i(talker, msg, i17, count, j18, i18, i19), "BizServicesReportThread");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BizChattingItemReportHelper", e17, "reportServiceMsgExpose exception", new java.lang.Object[0]);
        }
    }

    public abstract void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str);

    /* JADX WARN: Removed duplicated region for block: B:205:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(com.tencent.mm.ui.chatting.viewitems.g0 r11, yb5.d r12, java.lang.String r13, com.tencent.mm.storage.f9 r14) {
        /*
            Method dump skipped, instructions count: 1268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.a0.m(com.tencent.mm.ui.chatting.viewitems.g0, yb5.d, java.lang.String, com.tencent.mm.storage.f9):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        if ((r3 != null && java.lang.System.currentTimeMillis() - r3.field_updateTime >= 86400000) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(com.tencent.mm.ui.chatting.viewitems.g0 r17, final yb5.d r18, com.tencent.mm.storage.f9 r19, final java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.a0.n(com.tencent.mm.ui.chatting.viewitems.g0, yb5.d, com.tencent.mm.storage.f9, java.lang.String):void");
    }

    public final void o(android.view.View view, boolean z17) {
        if (view != null && (this instanceof com.tencent.mm.ui.chatting.viewitems.hp)) {
            int[] iArr = {com.tencent.mm.R.id.brr, com.tencent.mm.R.id.brn, com.tencent.mm.R.id.f483701bs0, com.tencent.mm.R.id.vgx, com.tencent.mm.R.id.brx, com.tencent.mm.R.id.che};
            for (int i17 = 0; i17 < 6; i17++) {
                android.view.View findViewById = view.findViewById(iArr[i17]);
                if (findViewById != null) {
                    android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                    if (layoutParams instanceof android.widget.RelativeLayout.LayoutParams) {
                        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
                        if (z17) {
                            layoutParams2.addRule(11);
                            layoutParams2.addRule(0, 0);
                        } else {
                            layoutParams2.addRule(11, 0);
                            layoutParams2.addRule(0, com.tencent.mm.R.id.f483645bk4);
                        }
                        findViewById.setLayoutParams(layoutParams2);
                    }
                }
            }
        }
    }

    public void q(yb5.d dVar, ot0.q qVar, com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mm.pluginsdk.ui.tools.k0 k0Var = (com.tencent.mm.pluginsdk.ui.tools.k0) qVar.y(com.tencent.mm.pluginsdk.ui.tools.k0.class);
        r(dVar, k0Var != null ? java.lang.Integer.valueOf(k0Var.f191741b) : null, qVar.f348646d, qVar.f348666i, qVar.X, f9Var);
    }

    public final void r(yb5.d dVar, java.lang.Integer num, java.lang.String str, int i17, java.lang.String str2, com.tencent.mm.storage.f9 f9Var) {
        m33.b1 a17 = m33.a1.a();
        if (a17 != null) {
            int i18 = dVar.D() ? 2 : 1;
            ((com.tencent.mm.plugin.game.h0) a17).Ni(dVar.g(), str, t(dVar, f9Var), i17, i18, str2, f9Var.I0(), dVar.x(), num != null ? num.intValue() : 0);
        }
    }

    public com.tencent.mm.ui.chatting.i6 s(yb5.d dVar) {
        if (this.f203232p == null) {
            this.f203232p = new com.tencent.mm.ui.chatting.i6(dVar);
        }
        return this.f203232p;
    }

    public com.tencent.mm.ui.chatting.viewitems.q0 u(yb5.d dVar) {
        if (this.f203223d == null) {
            this.f203223d = new com.tencent.mm.ui.chatting.viewitems.q0(this, dVar);
        }
        return this.f203223d;
    }

    public com.tencent.mm.ui.chatting.viewitems.r0 w(yb5.d dVar) {
        if (this.f203225f == null) {
            com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = dVar.f460717l;
            if (baseChattingUIFragment instanceof com.tencent.mm.ui.chatting.AppBrandServiceChattingUI.AppBrandServiceChattingFmUI) {
                com.tencent.mm.ui.chatting.AppBrandServiceChattingUI.AppBrandServiceChattingFmUI appBrandServiceChattingFmUI = (com.tencent.mm.ui.chatting.AppBrandServiceChattingUI.AppBrandServiceChattingFmUI) baseChattingUIFragment;
                appBrandServiceChattingFmUI.getClass();
                this.f203225f = new com.tencent.mm.ui.chatting.m0(appBrandServiceChattingFmUI, appBrandServiceChattingFmUI.f198152f, this);
            } else {
                this.f203225f = new com.tencent.mm.ui.chatting.viewitems.r0(dVar, this);
            }
        }
        return this.f203225f;
    }

    public wl5.v x(com.tencent.mm.ui.chatting.viewitems.q0 q0Var) {
        if (this.f203224e == null) {
            this.f203224e = new com.tencent.mm.ui.chatting.viewitems.s0(q0Var);
        }
        return this.f203224e;
    }

    public java.lang.String z(yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        s01.h hVar;
        java.lang.String Q0 = f9Var.Q0();
        sb5.f fVar = (sb5.f) dVar.f460708c.a(sb5.f.class);
        return (!((com.tencent.mm.ui.chatting.component.biz.a) fVar).f198753r || (hVar = ((com.tencent.mm.ui.chatting.component.biz.a) fVar).f198744f) == null) ? Q0 : hVar.field_bizChatServId;
    }
}
