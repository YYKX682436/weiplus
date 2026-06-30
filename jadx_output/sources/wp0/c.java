package wp0;

/* loaded from: classes7.dex */
public abstract class c extends lc3.s implements jc3.g0, jc3.u {

    /* renamed from: f, reason: collision with root package name */
    public jc3.j0 f448375f;

    /* renamed from: g, reason: collision with root package name */
    public bf3.p f448376g;

    @Override // lc3.s
    public jc3.m F0(java.lang.String containerTag) {
        kotlin.jvm.internal.o.g(containerTag, "containerTag");
        return null;
    }

    public java.util.List G0() {
        return kz5.c0.i(new yp0.a(), new yp0.c(), new yp0.e(), new yp0.d());
    }

    public jz5.l H0() {
        return new jz5.l(0, 0);
    }

    public abstract com.tencent.mm.magicbrush.plugin.emoji.ui.MEHolderView K0();

    public abstract wp0.b M0(java.lang.String str, java.lang.String str2, boolean z17);

    @Override // jc3.g0
    public void Me(int i17, android.view.View view) {
        int intValue;
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.magicbrush.plugin.emoji.ui.MEHolderView K0 = K0();
        com.tencent.mars.xlog.Log.i("MagicEmojiBaseBiz", "[ME] canvas created id = " + i17 + ", holder size = " + K0.getTop() + ' ' + K0.getWidth() + ' ' + K0.getHeight());
        android.widget.FrameLayout frameLayout = K0.f68648e;
        java.lang.Integer valueOf = frameLayout != null ? java.lang.Integer.valueOf(K0.indexOfChild(frameLayout)) : null;
        android.widget.FrameLayout frameLayout2 = K0.f68649f;
        java.lang.Integer valueOf2 = frameLayout2 != null ? java.lang.Integer.valueOf(K0.indexOfChild(frameLayout2)) : null;
        if (valueOf != null && valueOf2 != null) {
            int intValue2 = valueOf.intValue() - valueOf2.intValue();
            intValue = valueOf.intValue();
            if (intValue2 > 1) {
                intValue--;
            }
        } else if (valueOf != null) {
            intValue = valueOf.intValue() - 1;
            if (intValue < 0) {
                intValue = 0;
            }
        } else {
            intValue = valueOf2 != null ? valueOf2.intValue() + 1 : -1;
        }
        K0.addView(view, intValue, new android.view.ViewGroup.LayoutParams(-1, -1));
    }

    public abstract java.util.Map N0(boolean z17);

    public void O0() {
    }

    @Override // jc3.g0
    public void P8(int i17, android.view.View view, int i18, int i19, int i27, int i28) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i("MagicEmojiBaseBiz", "[ME] canvas layout id = " + i17 + ", holder size = " + i18 + ' ' + i27 + ' ' + i28);
    }

    @Override // jc3.u
    public void Q9(java.lang.String envId, java.lang.String msg) {
        kotlin.jvm.internal.o.g(envId, "envId");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MagicEmojiBaseBiz", "[ME] js exception: ".concat(msg));
    }

    public abstract void S0(com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig);

    public boolean V0() {
        boolean z17 = true;
        if (this.f448375f != null) {
            return true;
        }
        if (((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Ui("ilinkres_5c731eda", "MagicEmojiCocos") == null) {
            ea5.l wi6 = ((com.tencent.mm.udr.e1) ((com.tencent.mm.udr.c0) i95.n0.c(com.tencent.mm.udr.c0.class))).wi("ilinkres_5c731eda");
            com.tencent.wechat.aff.udr.q qVar = new com.tencent.wechat.aff.udr.q();
            qVar.c("ilinkres_5c731eda");
            java.util.LinkedList linkedList = qVar.f217548e;
            if (linkedList != null) {
                linkedList.add("MagicEmojiCocos");
            }
            java.util.LinkedList linkedList2 = qVar.f217549f;
            if (linkedList2 != null) {
                java.util.RandomAccess parameter = wi6 != null ? wi6.getParameter() : null;
                if (parameter == null) {
                    parameter = kz5.p0.f313996d;
                }
                linkedList2.addAll(parameter);
            }
            ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Bi(qVar);
            z17 = false;
        }
        com.tencent.mars.xlog.Log.i("MagicEmojiBaseBiz", "[ME] canSetup = " + z17);
        if (z17) {
            O0();
            com.tencent.mm.plugin.magicbrush.d4 d4Var = (com.tencent.mm.plugin.magicbrush.d4) i95.n0.c(com.tencent.mm.plugin.magicbrush.d4.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            bf3.p Di = ((com.tencent.mm.plugin.magicbrush.m5) d4Var).Di(context);
            Di.a(K0());
            com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = new com.tencent.mm.plugin.magicbrush.MBBuildConfig(null, null, null, null, false, false, false, null, false, null, 1023, null);
            mBBuildConfig.f147828r = this;
            mBBuildConfig.f147834x = this;
            mBBuildConfig.f147831u = Di;
            mBBuildConfig.a(G0());
            mBBuildConfig.f147832v = ((je3.i) i95.n0.c(je3.i.class)).Ii(0.001f);
            mBBuildConfig.f147821h = z65.c.a();
            S0(mBBuildConfig);
            jc3.j0 wi7 = ((com.tencent.mm.plugin.magicbrush.b6) ((com.tencent.mm.plugin.magicbrush.p4) i95.n0.c(com.tencent.mm.plugin.magicbrush.p4.class))).wi("MagicEmojiCocos");
            rc3.w0 w0Var = (rc3.w0) wi7;
            w0Var.w(this);
            w0Var.W(mBBuildConfig);
            w0Var.start();
            this.f448375f = wi7;
            this.f448376g = Di;
        }
        return z17;
    }

    @Override // jc3.g0
    public void Zf(int i17, android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i("MagicEmojiBaseBiz", "[ME] canvas destroy id = " + i17);
        android.view.ViewParent parent = view.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }

    @Override // jc3.g0
    public void c(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MagicEmojiBaseBiz", "[ME] first frame rendered");
    }

    @Override // jc3.u
    public void onDestroy(int i17) {
        com.tencent.mars.xlog.Log.i("MagicEmojiBaseBiz", "[ME] biz destroy with reason = " + i17);
    }
}
