package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class ao extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMNeat7extView f203379b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f203380c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.ViewStub f203381d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate f203382e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.AnimImageView f203383f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ProgressBar f203384g;

    /* renamed from: h, reason: collision with root package name */
    public rl5.r f203385h;

    /* renamed from: i, reason: collision with root package name */
    public wl5.x f203386i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.span.y f203387j;

    /* renamed from: k, reason: collision with root package name */
    public wl5.u f203388k;

    /* renamed from: m, reason: collision with root package name */
    public rl5.r f203390m;

    /* renamed from: n, reason: collision with root package name */
    public wl5.x f203391n;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f203393p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.LinearLayout f203394q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f203395r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.LinearLayout f203396s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f203397t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.ViewStub f203398u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.LinearLayout f203399v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f203400w;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.ArrayList f203389l = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public java.lang.CharSequence f203392o = "";

    public static void b(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.viewitems.ao aoVar, yb5.d dVar, java.lang.Boolean bool) {
        if (aoVar == null) {
            return;
        }
        if (f9Var.getMsgId() == ((com.tencent.mm.ui.chatting.component.fm) ((sb5.i2) dVar.f460708c.a(sb5.i2.class))).f199060f) {
            aoVar.f203384g.setVisibility(0);
            if (bool.booleanValue()) {
                aoVar.f203379b.setBackgroundResource(com.tencent.mm.R.drawable.bzq);
            } else {
                aoVar.f203379b.setBackgroundResource(com.tencent.mm.R.drawable.bzw);
            }
        } else {
            aoVar.f203384g.setVisibility(8);
            if (bool.booleanValue()) {
                aoVar.f203379b.setBackgroundResource(com.tencent.mm.R.drawable.f481181mh);
            } else {
                aoVar.f203379b.setBackgroundResource(com.tencent.mm.R.drawable.o_);
            }
        }
        if (f9Var.getMsgId() == ((com.tencent.mm.ui.chatting.component.fm) ((sb5.i2) dVar.f460708c.a(sb5.i2.class))).f199059e) {
            aoVar.f203383f.setVisibility(0);
            aoVar.f203383f.b();
        } else {
            aoVar.f203383f.setVisibility(8);
            aoVar.f203383f.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.ui.chatting.viewitems.g0 a(android.view.View r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.ao.a(android.view.View, boolean):com.tencent.mm.ui.chatting.viewitems.g0");
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.g0
    public android.view.View getMainContainerView() {
        return this.f203379b;
    }
}
