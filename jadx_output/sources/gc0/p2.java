package gc0;

/* loaded from: classes5.dex */
public final class p2 extends com.tencent.mm.ui.component.UIComponent implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: d, reason: collision with root package name */
    public yz5.a f270242d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f270243e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.tools.f5 f270244f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f270245g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f270246h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f270247i;

    /* renamed from: m, reason: collision with root package name */
    public final gc0.e1 f270248m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f270249n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f270242d = gc0.e2.f270156d;
        this.f270243e = gc0.f2.f270171d;
        this.f270244f = new com.tencent.mm.ui.tools.f5(activity);
        this.f270245g = jz5.h.b(new gc0.n1(this));
        this.f270246h = jz5.h.b(new gc0.o2(this));
        this.f270248m = new gc0.e1(activity);
        this.f270249n = jz5.h.b(new gc0.n2(this));
    }

    public static final android.view.View O6(gc0.p2 p2Var, android.content.Context context, java.lang.String str) {
        android.widget.TextView textView;
        p2Var.getClass();
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.e3q, (android.view.ViewGroup) null);
        if (inflate != null && (textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.vk7)) != null) {
            textView.setText(str);
            com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            textView.setSingleLine();
        }
        return inflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P6(gc0.p2 r5, gc0.b0 r6, kotlin.coroutines.Continuation r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof gc0.o1
            if (r0 == 0) goto L16
            r0 = r7
            gc0.o1 r0 = (gc0.o1) r0
            int r1 = r0.f270233f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f270233f = r1
            goto L1b
        L16:
            gc0.o1 r0 = new gc0.o1
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.f270231d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f270233f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.throwOnFailure(r7)
            goto L4f
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.throwOnFailure(r7)
            boolean r7 = r5.X6()
            if (r7 == 0) goto L3d
            goto La4
        L3d:
            gc0.y0 r7 = gc0.y0.f270365a
            boolean r5 = r5.f270247i
            if (r5 == 0) goto L45
            r5 = r3
            goto L46
        L45:
            r5 = 2
        L46:
            r0.f270233f = r3
            java.lang.Object r7 = r7.a(r6, r5, r0)
            if (r7 != r1) goto L4f
            goto La5
        L4f:
            uc0.u r7 = (uc0.u) r7
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "getRecommendImageMsgId called getRecommendList result remark:"
            r5.<init>(r6)
            java.util.List r6 = r7.f426278a
            int r6 = r6.size()
            r5.append(r6)
            java.lang.String r6 = " phone:"
            r5.append(r6)
            java.util.List r6 = r7.f426279b
            int r6 = r6.size()
            r5.append(r6)
            java.lang.String r6 = " img:"
            r5.append(r6)
            r6 = 4
            r45.kl5 r7 = r7.f426280c
            if (r7 == 0) goto L83
            long r0 = r7.getLong(r6)
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r0)
            goto L84
        L83:
            r2 = r4
        L84:
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "MicroMsg.RecommendRemarkUIC"
            com.tencent.mars.xlog.Log.i(r0, r5)
            r0 = 0
            if (r7 == 0) goto L99
            long r5 = r7.getLong(r6)
            goto L9a
        L99:
            r5 = r0
        L9a:
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 == 0) goto La4
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r5)
            goto La5
        La4:
            r1 = r4
        La5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gc0.p2.P6(gc0.p2, gc0.b0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static void T6(gc0.p2 p2Var, gc0.b0 profile, java.util.List existingImages, yz5.a aVar, yz5.l onRecommendImage, int i17, java.lang.Object obj) {
        yz5.a whenNoRecommend = (i17 & 4) != 0 ? gc0.r1.f270261d : aVar;
        p2Var.getClass();
        kotlin.jvm.internal.o.g(profile, "profile");
        kotlin.jvm.internal.o.g(existingImages, "existingImages");
        kotlin.jvm.internal.o.g(whenNoRecommend, "whenNoRecommend");
        kotlin.jvm.internal.o.g(onRecommendImage, "onRecommendImage");
        kotlinx.coroutines.l.d(v65.m.b(p2Var.getActivity()), kotlinx.coroutines.q1.f310568a, null, new gc0.s1(p2Var, profile, whenNoRecommend, existingImages, onRecommendImage, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q6(gc0.b0 r10, java.util.List r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gc0.p2.Q6(gc0.b0, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x034d, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0350, code lost:
    
        if (r3 != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0352, code lost:
    
        r3 = new r45.kl5();
        r3.set(0, r5);
        r3.set(2, java.lang.Float.valueOf(1.0f));
        r3.set(3, 0L);
        r3.set(4, 0L);
        r4 = new r45.ll5();
        r4.set(0, 0);
        r4.set(1, 4);
        r3.set(5, r4);
        r2.add(0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x034f, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x038b, code lost:
    
        r4 = !r2.isEmpty();
        r3 = r1.f270100b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0393, code lost:
    
        if (r3 == null) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0399, code lost:
    
        if (r26.n0.N(r3) == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x039c, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x039f, code lost:
    
        if (r3 != false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x03a1, code lost:
    
        r1 = r1.f270100b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x03a3, code lost:
    
        if (r12 == null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x03a9, code lost:
    
        if (r26.n0.B(r12, r1, false) != true) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x03ab, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x03ae, code lost:
    
        if (r3 != false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x03b0, code lost:
    
        r3 = new r45.kl5();
        r3.set(0, r1);
        r3.set(2, java.lang.Float.valueOf(1.0f));
        r3.set(3, 0L);
        r3.set(4, 0L);
        r1 = new r45.ll5();
        r1.set(0, 0);
        r1.set(1, 2);
        r3.set(5, r1);
        r2.add(0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x03ad, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x039e, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0342, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02b0, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02a4, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0282, code lost:
    
        if (r3.f270247i == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x027e, code lost:
    
        if (kz5.c0.i(10, 11, 13).contains(java.lang.Integer.valueOf(((java.lang.Number) ((jz5.n) r4).getValue()).intValue())) != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0284, code lost:
    
        r5 = (fc0.e) i95.n0.c(fc0.e.class);
        r7 = r3.getUsername();
        ((br3.f) r5).getClass();
        r5 = m61.k.wi().h(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x029d, code lost:
    
        if (r5 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x029f, code lost:
    
        r5 = r5.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02a5, code lost:
    
        if (r5 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02ab, code lost:
    
        if (r26.n0.N(r5) == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02ae, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x02b1, code lost:
    
        if (r7 == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02b3, code lost:
    
        r7 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(r3.getUsername(), true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02c9, code lost:
    
        if (r7 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02cb, code lost:
    
        r7 = r7.J0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02d1, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.RecommendRemarkUIC", "initMobileNameArea() isVerifyPage: " + r3.f270247i + ", encryptUsername: " + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02ee, code lost:
    
        if (r3.f270247i == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02f0, code lost:
    
        if (r7 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02f6, code lost:
    
        if (r26.n0.N(r7) == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02f9, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02fc, code lost:
    
        if (r8 != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02fe, code lost:
    
        ((br3.f) ((fc0.e) i95.n0.c(fc0.e.class))).getClass();
        r4 = m61.k.wi().h(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0311, code lost:
    
        if (r4 == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0313, code lost:
    
        r8 = r4.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0319, code lost:
    
        r5 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0318, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02fb, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02d0, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x031a, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.RecommendRemarkUIC", "initMobileNameArea() realName: " + r5 + ", username: " + r3.getUsername());
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0337, code lost:
    
        if (r5 == null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x033d, code lost:
    
        if (r26.n0.N(r5) == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0340, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0343, code lost:
    
        if (r3 != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0345, code lost:
    
        if (r12 == null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x034b, code lost:
    
        if (r26.n0.B(r12, r5, false) != true) goto L137;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R6(gc0.b0 r18, java.lang.String r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 1052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gc0.p2.R6(gc0.b0, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final r45.ml5 S6() {
        return (r45.ml5) ((jz5.n) this.f270249n).getValue();
    }

    public final void U6(gc0.b0 profile, yz5.a getPhoneList, yz5.a isReachPhoneLimit, com.tencent.mm.ui.base.FlowLayout flowLayout, yz5.l onAppendPhone) {
        kotlin.jvm.internal.o.g(profile, "profile");
        kotlin.jvm.internal.o.g(getPhoneList, "getPhoneList");
        kotlin.jvm.internal.o.g(isReachPhoneLimit, "isReachPhoneLimit");
        kotlin.jvm.internal.o.g(flowLayout, "flowLayout");
        kotlin.jvm.internal.o.g(onAppendPhone, "onAppendPhone");
        kotlinx.coroutines.l.d(v65.m.b(getActivity()), null, null, new gc0.w1(this, profile, getPhoneList, flowLayout, ((java.lang.Boolean) isReachPhoneLimit.invoke()).booleanValue(), onAppendPhone, null), 3, null);
    }

    public final void V6(gc0.b0 profile, yz5.a getRemarkText, yz5.a getPhoneList, yz5.a isReachPhoneLimit, yz5.l onAppendPhone, yz5.l lVar, yz5.a aVar) {
        kotlin.jvm.internal.o.g(profile, "profile");
        kotlin.jvm.internal.o.g(getRemarkText, "getRemarkText");
        kotlin.jvm.internal.o.g(getPhoneList, "getPhoneList");
        kotlin.jvm.internal.o.g(isReachPhoneLimit, "isReachPhoneLimit");
        kotlin.jvm.internal.o.g(onAppendPhone, "onAppendPhone");
        if (X6()) {
            return;
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.uya);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.ui.base.FlowLayout flowLayout = (com.tencent.mm.ui.base.FlowLayout) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.upz);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        kotlinx.coroutines.l.d(v65.m.b(getActivity()), null, null, new gc0.z1(profile, this, flowLayout, getRemarkText, aVar, getPhoneList, isReachPhoneLimit, (com.tencent.mm.ui.base.FlowLayout) findViewById2, onAppendPhone, lVar, null), 3, null);
    }

    public final void W6(gc0.b0 profile, com.tencent.mm.ui.base.FlowLayout flowLayout, yz5.a getRemarkText, yz5.l lVar, yz5.a aVar) {
        kotlin.jvm.internal.o.g(profile, "profile");
        kotlin.jvm.internal.o.g(flowLayout, "flowLayout");
        kotlin.jvm.internal.o.g(getRemarkText, "getRemarkText");
        kotlinx.coroutines.l.d(v65.m.b(getActivity()), null, null, new gc0.d2(this, profile, getRemarkText, flowLayout, aVar, lVar, null), 3, null);
    }

    public final boolean X6() {
        if (this.f270247i || S6().getLong(3) > 0) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RecommendRemarkUIC", "initRecommendRemark() return shownData.sayHiTime = " + S6().getLong(3));
        return true;
    }

    public final java.lang.String getUsername() {
        return (java.lang.String) ((jz5.n) this.f270246h).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        this.f270244f.f210400e = this;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        this.f270244f.d();
        gc0.f0 f0Var = gc0.f0.f270167a;
        java.lang.String username = getUsername();
        kotlin.jvm.internal.o.f(username, "<get-username>(...)");
        if (f0Var.b(username).getLong(3) > 0 && S6().getLong(3) == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RecommendRemarkUIC", "onDestroy key:" + getUsername() + " just sayHi, skip save");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RecommendRemarkUIC", "onDestroy save shown data");
        java.lang.String username2 = getUsername();
        kotlin.jvm.internal.o.f(username2, "<get-username>(...)");
        r45.ml5 data = S6();
        kotlin.jvm.internal.o.g(data, "data");
        f0Var.c().H(username2, data.toByteArray());
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        this.f270244f.d();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        this.f270244f.f();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        if (z17) {
            this.f270244f.f();
        }
    }

    @Override // com.tencent.mm.ui.tools.c5
    public void w2(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RecommendRemarkUIC", "height:%s", java.lang.Integer.valueOf(i17));
        if (i17 != 0) {
            this.f270242d.invoke();
        } else {
            this.f270243e.invoke();
        }
    }
}
