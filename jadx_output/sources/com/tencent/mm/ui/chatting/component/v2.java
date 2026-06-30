package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.e.class)
/* loaded from: classes8.dex */
public class v2 extends com.tencent.mm.ui.chatting.component.a implements sb5.e {

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.HashMap f200105n = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f200106e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f200107f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f200108g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f200109h = true;

    /* renamed from: i, reason: collision with root package name */
    public final l75.q0 f200110i = new com.tencent.mm.ui.chatting.component.u2(this);

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.i0 f200111m = null;

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        f21.b wi6 = f21.r0.wi();
        l75.q0 q0Var = this.f200110i;
        wi6.add(q0Var);
        f21.r0.Bi().add(q0Var);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChattingBackgroundComponent", "[onChattingExitAnimEnd]");
        if (gm0.j1.a()) {
            f21.b wi6 = f21.r0.wi();
            l75.q0 q0Var = this.f200110i;
            wi6.remove(q0Var);
            f21.r0.Bi().remove(q0Var);
        }
        m0();
    }

    @Override // yn.d
    public void R(android.content.res.Configuration configuration) {
        int i17 = configuration.orientation;
        if (i17 == 1 && !this.f200109h) {
            q0();
        } else if (i17 == 2 && this.f200109h) {
            q0();
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
    }

    public final void m0() {
        android.graphics.Bitmap bitmap = this.f200106e;
        if (bitmap != null && !bitmap.isRecycled()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChattingBackgroundComponent", "recycle bitmap:%s", this.f200106e.toString());
            this.f200106e.recycle();
        }
        android.widget.ImageView imageView = this.f200107f;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        android.widget.ImageView imageView2 = this.f200108g;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
    }

    public int n0() {
        if (this.f200111m.f190869d) {
            return !com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.drawable.czh : com.tencent.mm.R.drawable.czg;
        }
        return 0;
    }

    public int o0(int i17) {
        if (this.f200111m.f190869d) {
            return 0;
        }
        return i17 - i65.a.f(this.f198580d.g(), com.tencent.mm.R.dimen.f479645bk);
    }

    public boolean p0() {
        f21.a m07 = f21.r0.wi().m0(this.f198580d.x());
        return (m07 == null || m07.f258833b == -2) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q0() {
        /*
            Method dump skipped, instructions count: 799
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.v2.q0():void");
    }

    public final void r0(int i17) {
        m0();
        android.widget.ImageView imageView = this.f200107f;
        if (imageView != null) {
            imageView.setImageDrawable(new android.graphics.drawable.ColorDrawable(i17));
            return;
        }
        android.view.View c17 = this.f198580d.c(com.tencent.mm.R.id.bkb);
        if (c17 != null) {
            c17.setBackgroundColor(i17);
        }
    }

    public final boolean s0(android.content.Context context, java.lang.String str) {
        java.util.HashMap hashMap = f200105n;
        if (hashMap.containsKey(str)) {
            this.f200111m = (com.tencent.mm.pluginsdk.ui.i0) hashMap.get(str);
            return true;
        }
        try {
            java.lang.String e17 = com.tencent.mm.sdk.platformtools.t8.e(context.getAssets().open(str));
            if (!com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
                com.tencent.mm.pluginsdk.ui.i0 i0Var = new com.tencent.mm.pluginsdk.ui.i0(e17, this.f198580d.g());
                this.f200111m = i0Var;
                hashMap.put(str, i0Var);
            }
            return true;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingUI.ChattingBackgroundComponent", e18, "", new java.lang.Object[0]);
            return false;
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChattingBackgroundComponent", "[onChattingEnterAnimStart]");
        q0();
    }
}
