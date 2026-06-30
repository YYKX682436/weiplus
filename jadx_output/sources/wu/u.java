package wu;

/* loaded from: classes9.dex */
public final class u extends wu.p {

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.mvvm.MvvmView f449631h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(hu.f uiParams, com.tencent.mm.plugin.mvvmlist.MvvmList<hu.b> mvvmList) {
        super(uiParams, mvvmList);
        kotlin.jvm.internal.o.g(uiParams, "uiParams");
        kotlin.jvm.internal.o.g(mvvmList, "mvvmList");
    }

    @Override // wu.p
    public void n(android.widget.FrameLayout containerView, hu.b item, int i17, int i18) {
        kotlin.jvm.internal.o.g(containerView, "containerView");
        kotlin.jvm.internal.o.g(item, "item");
        if (this.f449631h == null) {
            com.tencent.mars.xlog.Log.e("RecordDetailFinderProductItemConvert", "product card view is null");
            return;
        }
        s15.j x17 = item.f284997e.x();
        if (x17 == null) {
            com.tencent.mars.xlog.Log.w("RecordDetailFinderProductItemConvert", "record item product item == null");
            return;
        }
        i95.m c17 = i95.n0.c(c00.z2.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        java.lang.String avatarUsername = item.f284998f;
        kotlin.jvm.internal.o.g(avatarUsername, "avatarUsername");
        ((b00.r) ((c00.z2) c17)).f16757d.getClass();
        bw5.u8 u8Var = new bw5.u8();
        u8Var.f33772d = x17.n();
        boolean[] zArr = u8Var.f33784p1;
        zArr[1] = true;
        u8Var.f33773e = x17.getFinderUsername();
        zArr[2] = true;
        u8Var.f33774f = x17.p();
        zArr[3] = true;
        u8Var.f33775g = x17.o();
        zArr[4] = true;
        u8Var.f33776h = x17.u();
        zArr[5] = true;
        u8Var.f33777i = x17.getAppId();
        zArr[6] = true;
        u8Var.o(x17.y());
        u8Var.r(com.tencent.mm.sdk.platformtools.b8.c(x17.F()));
        u8Var.f33781o = x17.getCoverUrl();
        zArr[9] = true;
        u8Var.f33782p = x17.G();
        zArr[10] = true;
        u8Var.f33785q = x17.w();
        zArr[11] = true;
        u8Var.f33786r = x17.Q();
        zArr[12] = true;
        u8Var.p(x17.z());
        u8Var.q(x17.B());
        u8Var.f33789u = x17.S();
        zArr[15] = true;
        u8Var.f33792x = x17.l();
        zArr[18] = true;
        u8Var.f33794y = x17.R();
        zArr[19] = true;
        u8Var.f33796z = x17.A();
        zArr[20] = true;
        u8Var.A = x17.s();
        zArr[21] = true;
        u8Var.B = x17.r();
        zArr[22] = true;
        u8Var.C = x17.P();
        zArr[23] = true;
        u8Var.D = x17.O();
        zArr[24] = true;
        u8Var.E = x17.q();
        zArr[25] = true;
        u8Var.F = x17.N();
        zArr[26] = true;
        u8Var.G = x17.Z();
        zArr[27] = true;
        u8Var.H = x17.f0();
        zArr[28] = true;
        u8Var.I = x17.t();
        zArr[29] = true;
        u8Var.f33771J = x17.k();
        zArr[30] = true;
        u8Var.K = x17.H();
        zArr[31] = true;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList T = x17.T();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(T, 10));
        java.util.Iterator it = T.iterator();
        while (it.hasNext()) {
            arrayList.add(e00.l.a((java.lang.String) it.next()));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next = it6.next();
            if (((byte[]) next) != null) {
                arrayList2.add(next);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
        java.util.Iterator it7 = arrayList2.iterator();
        while (it7.hasNext()) {
            byte[] bArr = (byte[]) it7.next();
            bw5.o5 o5Var = new bw5.o5();
            o5Var.parseFrom(bArr);
            arrayList3.add(o5Var);
        }
        linkedList.addAll(arrayList3);
        u8Var.L = linkedList;
        zArr[32] = true;
        u8Var.M = x17.C();
        zArr[33] = true;
        u8Var.N = x17.E();
        zArr[34] = true;
        u8Var.P = x17.e0();
        zArr[35] = true;
        u8Var.Q = x17.j();
        zArr[36] = true;
        u8Var.R = x17.I();
        zArr[37] = true;
        u8Var.S = x17.J();
        zArr[38] = true;
        u8Var.T = x17.b0();
        zArr[39] = true;
        u8Var.U = x17.c0();
        zArr[40] = true;
        u8Var.V = x17.V();
        zArr[41] = true;
        u8Var.W = x17.W();
        zArr[42] = true;
        u8Var.X = x17.d0();
        zArr[43] = true;
        u8Var.Y = x17.a0();
        zArr[44] = true;
        u8Var.Z = x17.Y();
        zArr[45] = true;
        u8Var.f33783p0 = x17.U();
        zArr[46] = true;
        u8Var.f33793x0 = x17.x();
        zArr[47] = true;
        bw5.a9 a9Var = null;
        if (x17.K().length() > 0) {
            bw5.a9 a9Var2 = new bw5.a9();
            try {
                a9Var2.parseFrom(n51.d.a(x17.K(), 2));
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                a9Var2 = null;
            }
            u8Var.f33795y0 = a9Var2;
            zArr[48] = true;
        }
        if (x17.L().length() > 0) {
            bw5.a9 a9Var3 = new bw5.a9();
            try {
                a9Var3.parseFrom(n51.d.a(x17.L(), 2));
                a9Var = a9Var3;
            } catch (java.lang.Exception e18) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e18);
            }
            u8Var.f33778l1 = a9Var;
            zArr[49] = true;
        }
        g00.c cVar = new g00.c(u8Var, bw5.x8.ECS_REQ_SCENE_RECORD);
        cVar.f267388f = avatarUsername;
        com.tencent.mm.mvvm.MvvmView mvvmView = this.f449631h;
        if (mvvmView != null) {
            mvvmView.setViewModel(cVar);
        }
        com.tencent.mm.mvvm.MvvmView mvvmView2 = this.f449631h;
        if (mvvmView2 != null) {
            mvvmView2.setBackgroundResource(com.tencent.mm.R.drawable.d87);
        }
    }

    @Override // wu.p
    public void o(android.view.View view, hu.b item) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(item, "item");
        kotlinx.coroutines.l.d(v65.m.a(view), null, null, new wu.t(view, item, null), 3, null);
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        kotlin.jvm.internal.o.g(containerView, "containerView");
        i95.m c17 = i95.n0.c(c00.z2.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        android.content.Context context = containerView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((b00.r) ((c00.z2) c17)).f16757d.getClass();
        com.tencent.mm.feature.ecs.card.view.EcsProductCardViewNewStyle ecsProductCardViewNewStyle = new com.tencent.mm.feature.ecs.card.view.EcsProductCardViewNewStyle(context, null, 0, 6, null);
        this.f449631h = ecsProductCardViewNewStyle;
        containerView.addView(ecsProductCardViewNewStyle, -2, -2);
    }
}
