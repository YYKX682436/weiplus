package com.tencent.mm.pluginsdk.ui.preference;

/* loaded from: classes11.dex */
public class FMessageListView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final l75.q0 f191061d;

    /* renamed from: e, reason: collision with root package name */
    public final l75.q0 f191062e;

    /* renamed from: f, reason: collision with root package name */
    public final l75.q0 f191063f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f191064g;

    /* renamed from: h, reason: collision with root package name */
    public y35.j f191065h;

    /* renamed from: i, reason: collision with root package name */
    public y35.q f191066i;

    /* renamed from: m, reason: collision with root package name */
    public y35.d f191067m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f191068n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f191069o;

    /* renamed from: p, reason: collision with root package name */
    public y35.k f191070p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f191071q;

    public FMessageListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(y35.r r15) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.ui.preference.FMessageListView.a(y35.r):void");
    }

    public void b() {
        com.tencent.mm.storage.q7 Ai = r21.w.Ai();
        l75.q0 q0Var = this.f191062e;
        Ai.remove(q0Var);
        r21.w.Bi().remove(q0Var);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Zi().remove(this.f191061d);
        r21.w.Di().remove(this.f191063f);
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = getChildAt(i17);
            if (childAt instanceof y35.d) {
                ((y35.d) childAt).c();
            }
        }
        this.f191066i = null;
        this.f191067m = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.tencent.mm.storage.q7 Ai = r21.w.Ai();
        l75.q0 q0Var = this.f191062e;
        Ai.add(q0Var);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Zi().add(this.f191061d);
        r21.w.Bi().add(q0Var);
        r21.w.Di().add(this.f191063f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    public void setFMessageArgs(y35.j jVar) {
        this.f191065h = jVar;
        y35.d.setFMessageArgs(jVar);
    }

    public void setForceHideReply(boolean z17) {
        this.f191071q = z17;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.FMessageListView", "setForceHideReply = %s, stack = ", valueOf, new com.tencent.mm.sdk.platformtools.z3());
    }

    public void setGotoSayHiCallBack(y35.k kVar) {
        this.f191070p = kVar;
    }

    public void setHide(boolean z17) {
        this.f191069o = z17;
    }

    public void setReplyBtnVisible(boolean z17) {
        int childCount = getChildCount();
        if (childCount <= 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FMessageListView", "setReplyBtnVisible fail, childCount invalid = " + childCount);
            return;
        }
        y35.q qVar = this.f191066i;
        if (qVar != null) {
            qVar.setVisibility(z17 ? 0 : 8);
        }
        y35.d dVar = this.f191067m;
        if (dVar != null) {
            dVar.setVisibility(z17 ? 0 : 8);
        }
    }

    public FMessageListView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f191061d = new y35.l(this);
        this.f191062e = new y35.m(this);
        this.f191063f = new y35.n(this);
        this.f191069o = false;
        this.f191071q = false;
        this.f191064g = context;
    }
}
