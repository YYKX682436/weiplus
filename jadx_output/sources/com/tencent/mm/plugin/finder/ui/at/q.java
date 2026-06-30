package com.tencent.mm.plugin.finder.ui.at;

/* loaded from: classes.dex */
public final class q extends com.tencent.mm.plugin.finder.ui.at.l {
    public final jz5.g B;
    public final jz5.g C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.content.Context context, java.lang.Boolean bool, com.tencent.mm.storage.u3 recentAtStorageKey, com.tencent.mm.plugin.finder.ui.at.a callback) {
        super(context, bool, callback);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(recentAtStorageKey, "recentAtStorageKey");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.B = jz5.h.b(new com.tencent.mm.plugin.finder.ui.at.o(recentAtStorageKey));
        this.C = jz5.h.b(new com.tencent.mm.plugin.finder.ui.at.p(this));
    }

    @Override // hg5.d
    public int E() {
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i17 = b17.x;
        int i18 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!z17) {
            if (i18 >= i17) {
                i17 = i18;
            }
            i18 = i17;
        }
        return (int) ((i18 * 0.25d) - com.tencent.mm.ui.bl.h(getContext()));
    }

    @Override // com.tencent.mm.plugin.finder.ui.at.l, hg5.d
    public void G() {
        z().f(1);
        super.G();
        android.view.Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(com.tencent.mm.R.style.f494504ot);
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.at.l
    public in5.s K() {
        return new in5.s() { // from class: com.tencent.mm.plugin.finder.ui.at.FinderAtSomeoneDialog$buildItemConvertFactory$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return type != 2 ? type != 4 ? new com.tencent.mm.plugin.finder.ui.at.s(com.tencent.mm.plugin.finder.ui.at.q.this.f128887r) : new com.tencent.mm.plugin.finder.ui.at.r(com.tencent.mm.plugin.finder.ui.at.q.this.f128887r) : new com.tencent.mm.plugin.finder.ui.at.w(com.tencent.mm.plugin.finder.ui.at.q.this.f128887r);
            }
        };
    }

    @Override // com.tencent.mm.plugin.finder.ui.at.l
    public java.lang.String L(com.tencent.mm.storage.z3 ct6) {
        kotlin.jvm.internal.o.g(ct6, "ct");
        java.lang.String f27 = ct6.f2();
        kotlin.jvm.internal.o.f(f27, "getDisplayNick(...)");
        return f27;
    }

    @Override // com.tencent.mm.plugin.finder.ui.at.l
    public void M() {
        android.view.View findViewById;
        super.M();
        android.view.View view = this.f281403i;
        if (view == null || (findViewById = view.findViewById(com.tencent.mm.R.id.mdb)) == null) {
            return;
        }
        findViewById.setBackgroundResource(com.tencent.mm.R.drawable.f481536vv);
    }

    @Override // com.tencent.mm.plugin.finder.ui.at.l
    public ym3.a N() {
        return (ym3.a) ((jz5.n) this.B).getValue();
    }

    @Override // com.tencent.mm.plugin.finder.ui.at.l
    public ym3.b O() {
        return (com.tencent.mm.plugin.finder.ui.at.FinderAtSomeoneSearchDataSource) ((jz5.n) this.C).getValue();
    }

    @Override // com.tencent.mm.plugin.finder.ui.at.l
    public int P() {
        return com.tencent.mm.R.layout.ae6;
    }
}
