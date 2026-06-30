package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class f8 extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f112508p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f112509q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View f112510r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f112511s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f112512t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f112513u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f112514v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f112515w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f112516x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f112517y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f112508p = root.findViewById(com.tencent.mm.R.id.elj);
        this.f112509q = root.findViewById(com.tencent.mm.R.id.elg);
        this.f112510r = root.findViewById(com.tencent.mm.R.id.elm);
        this.f112511s = root.findViewById(com.tencent.mm.R.id.ela);
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.mbs);
        this.f112512t = findViewById;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.lca);
        this.f112513u = findViewById2;
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.p_3);
        this.f112514v = findViewById3;
        this.f112515w = "anchorlive.bottom.tools.screenshare";
        this.f112516x = "anchorlive.bottom.tools.link";
        this.f112517y = "anchorlive.bottom.tools.vote";
        jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.e8(root));
        if (!x0()) {
            root.post(new com.tencent.mm.plugin.finder.live.plugin.b8(root));
        }
        root.setTranslationY(com.tencent.mm.ui.bl.b(root.getContext()).y);
        root.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.c8(this));
        ll2.e eVar = ll2.e.f319133a;
        java.lang.Object context = root.getContext();
        ll2.e.l(eVar, context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null, "anchorlive.bottom.tools.screenshare", findViewById, null, null, 24, null);
        java.lang.Object context2 = root.getContext();
        ll2.e.l(eVar, context2 instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context2 : null, "anchorlive.bottom.tools.link", findViewById2, null, null, 24, null);
        java.lang.Object context3 = root.getContext();
        ll2.e.l(eVar, context3 instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context3 : null, "anchorlive.bottom.tools.vote", findViewById3, null, null, 24, null);
    }

    @Override // qo0.a
    public boolean B0() {
        if (w0() != 0) {
            return false;
        }
        t1();
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final void t1() {
        ll2.e eVar = ll2.e.f319133a;
        eVar.e(this.f112515w, false);
        eVar.e(this.f112516x, false);
        eVar.e(this.f112517y, false);
        this.f365323d.animate().translationY(com.tencent.mm.ui.bl.b(r0.getContext()).y).setDuration(200L).setListener(new com.tencent.mm.plugin.finder.live.plugin.d8(this)).start();
    }
}
