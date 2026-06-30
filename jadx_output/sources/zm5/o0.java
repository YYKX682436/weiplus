package zm5;

/* loaded from: classes9.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zm5.r0 f474249d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f474250e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f474251f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f474252g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(zm5.r0 r0Var, n0.e5 e5Var, n0.e5 e5Var2, n0.e5 e5Var3) {
        super(1);
        this.f474249d = r0Var;
        this.f474250e = e5Var;
        this.f474251f = e5Var2;
        this.f474252g = e5Var3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
    
        r6 = ((java.lang.Number) r2.f302833d).intValue();
        r2 = (com.tencent.mm.plugin.msg.MsgIdTalker) r2.f302834e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ab, code lost:
    
        if (((fo.e) ((le5.e) i95.n0.c(le5.e.class))).aj(r4.getActivity(), r2.f149480d, null) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ad, code lost:
    
        r9 = r20.f474251f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00af, code lost:
    
        if (r6 == (-1)) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b1, code lost:
    
        r10 = r4.getActivity();
        r11 = new android.content.Intent(r4.getContext(), (java.lang.Class<?>) com.tencent.mm.view.activity.ImageQueryGalleryUI.class);
        r11.putExtra("KEY_IMAGE_CURRENT_INDEX", r6);
        r11.putParcelableArrayListExtra("KEY_IMAGE_DATA", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d0, code lost:
    
        if (r9.getValue() == en5.d.f255373f) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00da, code lost:
    
        if (r4.O6().Z6(r1) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e9, code lost:
    
        r1 = new java.util.ArrayList();
        r1.add(r11);
        java.util.Collections.reverse(r1);
        yj0.a.d(r10, r1.toArray(), "com/tencent/mm/view/activity/ImageQueryMainUIC$initView$1$4", "invoke", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        r10.startActivity((android.content.Intent) r1.get(0));
        yj0.a.f(r10, "com/tencent/mm/view/activity/ImageQueryMainUIC$initView$1$4", "invoke", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00dc, code lost:
    
        r11.putExtra("KEY_IMAGE_KEY_WORDS", (java.lang.String) r20.f474252g.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0120, code lost:
    
        r1 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0126, code lost:
    
        if (aq.p.f12930b == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0128, code lost:
    
        r4 = new java.lang.StringBuilder("getMsgCreateTime >> ");
        r5 = r2.f149480d;
        r4.append(r5);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryComposeOp", r4.toString());
        r1 = pt0.f0.f358209b1.n(r1, r5).getCreateTime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x014a, code lost:
    
        f65.o.f259925n = r1;
        r1 = r9.getValue();
        kotlin.jvm.internal.o.f(r1, "<get-value>(...)");
        r1 = (en5.d) r1;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryReporter", "setMatchLogic >> type: " + r1);
        r1 = r1.ordinal();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x016c, code lost:
    
        if (r1 == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x016e, code lost:
    
        if (r1 == 1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0171, code lost:
    
        if (r1 != 2) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0173, code lost:
    
        r7 = 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x017b, code lost:
    
        throw new jz5.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x017e, code lost:
    
        f65.o.f259927p = r7;
        f65.o.f259912a.c(5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x017c, code lost:
    
        r7 = 11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0148, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0188, code lost:
    
        return jz5.f0.f302826a;
     */
    @Override // yz5.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zm5.o0.invoke(java.lang.Object):java.lang.Object");
    }
}
