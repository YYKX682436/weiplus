package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public abstract class e0 extends android.app.Dialog {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f173821d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(android.content.Context context) {
        super(context, com.tencent.mm.R.style.f494273il);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.textstatus.ui.w1 w1Var;
        java.lang.Object m521constructorimpl;
        super.onCreate(bundle);
        com.tencent.mm.plugin.textstatus.ui.j2 j2Var = (com.tencent.mm.plugin.textstatus.ui.j2) this;
        android.view.Window window = j2Var.getWindow();
        if (window != null) {
            window.setWindowAnimations(com.tencent.mm.R.style.f494617rr);
        }
        android.view.View inflate = android.view.LayoutInflater.from(j2Var.getContext()).inflate(com.tencent.mm.R.layout.f488295pd, (android.view.ViewGroup) null, false);
        j2Var.setContentView(inflate);
        if (inflate instanceof android.widget.RelativeLayout) {
            ((android.widget.RelativeLayout) inflate).addView(new com.tencent.mm.plugin.textstatus.ui.c0(j2Var, j2Var.getContext()));
        }
        j2Var.f173821d = (android.widget.LinearLayout) j2Var.findViewById(com.tencent.mm.R.id.hw_);
        j2Var.findViewById(com.tencent.mm.R.id.cz9).setOnClickListener(new com.tencent.mm.plugin.textstatus.ui.d0(j2Var));
        ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).Vi();
        ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).Ri();
        nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
        o04.e eVar2 = new o04.e(pj4.p0.class, 9, true);
        android.content.Context context = j2Var.f173995e;
        ((md0.e) eVar).Zi(context, eVar2);
        pj4.p0 p0Var = (pj4.p0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(context, 9, pj4.p0.class);
        if (p0Var != null) {
            ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
            p0Var.f355236d = o13.n.l(1);
        }
        bi4.h1 h1Var = j2Var.f173996f;
        h1Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.MultipleTextStatusCardDialog", "initUI: " + context + ", forbidShowSetStatusButton=false, allowShowHeaderAvatar=false");
        com.tencent.mm.plugin.textstatus.ui.d2 d2Var = new com.tencent.mm.plugin.textstatus.ui.d2(j2Var);
        bi4.k1 a17 = bi4.k1.a();
        a17.f21067g = h1Var.f21050b;
        com.tencent.mm.plugin.textstatus.ui.w1 w1Var2 = new com.tencent.mm.plugin.textstatus.ui.w1(j2Var.f173995e, null, d2Var, "SCENE_MULTIPLE_DIALOG", null, false, a17, 50, null);
        android.widget.LinearLayout linearLayout = j2Var.f173821d;
        if (linearLayout != null) {
            linearLayout.addView(w1Var2, -1, -2);
        }
        int a18 = i65.a.a(context, 12.0f);
        android.view.View contentView$plugin_textstatus_release = w1Var2.getContentView$plugin_textstatus_release();
        float f17 = a18;
        if (contentView$plugin_textstatus_release != null) {
            contentView$plugin_textstatus_release.setOutlineProvider(new bk4.e2(true, true, f17));
        }
        if (contentView$plugin_textstatus_release != null) {
            contentView$plugin_textstatus_release.setClipToOutline(true);
        }
        bi4.i1 i1Var = h1Var.f21053e;
        if (i1Var != null) {
            android.view.View contentView$plugin_textstatus_release2 = w1Var2.getContentView$plugin_textstatus_release();
            if (contentView$plugin_textstatus_release2.getForeground() != null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.TextStatus.MultipleTextStatusCardDialog", "applyCardStroke: view.foreground already in use, skip stroke to avoid override");
            } else {
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    bi4.n0 f18 = j2Var.f();
                    contentView$plugin_textstatus_release2.setForeground(new wj4.d(f18 != null ? ((com.tencent.mm.plugin.textstatus.ui.q3) f18).f174196m : null, i1Var, f17));
                    contentView$plugin_textstatus_release2.invalidate();
                    m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
                } catch (java.lang.Throwable th6) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                }
                java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
                if (m524exceptionOrNullimpl != null) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TextStatus.MultipleTextStatusCardDialog", m524exceptionOrNullimpl, "applyCardStroke: set foreground failed, downgrade to no-stroke", new java.lang.Object[0]);
                }
            }
        }
        si4.a G = ai4.m0.f5173a.G();
        java.lang.String str = h1Var.f21049a;
        java.util.List q17 = G.q(str);
        w1Var2.j(q17);
        android.widget.LinearLayout linearLayout2 = j2Var.f173821d;
        if (linearLayout2 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
            android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.topMargin += com.tencent.mm.ui.bl.a(j2Var.getContext()) + (com.tencent.mm.ui.dl.g() ? 0 : com.tencent.mm.ui.v9.b(j2Var.getContext()));
            }
            linearLayout2.setBackground(null);
            w1Var = w1Var2;
            linearLayout2.post(new com.tencent.mm.plugin.textstatus.ui.c2(w1Var2, j2Var, q17, linearLayout2, linearLayout2));
        } else {
            w1Var = w1Var2;
        }
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.ui.MMFragmentActivity) context : null;
        if (mMFragmentActivity != null) {
            j2Var.f174000m.J0(mMFragmentActivity);
        }
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((uj4.m) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(uj4.m.class)).P6((android.view.ViewGroup) w1Var.findViewById(com.tencent.mm.R.id.hwd), str);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        android.view.Window window = getWindow();
        if (window != null) {
            window.addFlags(67108864);
        }
        android.view.Window window2 = getWindow();
        if (window2 != null) {
            window2.setDimAmount(0.5f);
        }
        android.view.Window window3 = getWindow();
        if (window3 != null) {
            window3.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        android.view.Window window = getWindow();
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
        }
        super.show();
    }
}
