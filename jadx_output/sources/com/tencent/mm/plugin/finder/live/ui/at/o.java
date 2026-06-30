package com.tencent.mm.plugin.finder.live.ui.at;

/* loaded from: classes.dex */
public class o extends com.tencent.mm.plugin.finder.ui.at.l {
    public final jz5.g B;
    public final jz5.g C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.content.Context context, java.lang.Boolean bool, com.tencent.mm.plugin.finder.ui.at.a callback) {
        super(context, bool, callback);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.B = jz5.h.b(com.tencent.mm.plugin.finder.live.ui.at.m.f115416d);
        this.C = jz5.h.b(new com.tencent.mm.plugin.finder.live.ui.at.n(this));
        com.tencent.mm.autogen.events.UpdateSearchIndexAtOnceEvent updateSearchIndexAtOnceEvent = new com.tencent.mm.autogen.events.UpdateSearchIndexAtOnceEvent();
        updateSearchIndexAtOnceEvent.f54924g.f6419a = 0L;
        updateSearchIndexAtOnceEvent.e();
    }

    @Override // com.tencent.mm.plugin.finder.ui.at.l
    public in5.s K() {
        return new in5.s() { // from class: com.tencent.mm.plugin.finder.live.ui.at.FinderLiveAtSomeoneDialog$buildItemConvertFactory$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return type != 2 ? type != 4 ? new com.tencent.mm.plugin.finder.live.ui.at.q(com.tencent.mm.plugin.finder.live.ui.at.o.this.f128887r) : new com.tencent.mm.plugin.finder.live.ui.at.p(com.tencent.mm.plugin.finder.live.ui.at.o.this.f128887r) : new com.tencent.mm.plugin.finder.live.ui.at.t(com.tencent.mm.plugin.finder.live.ui.at.o.this.f128887r);
            }
        };
    }

    @Override // com.tencent.mm.plugin.finder.ui.at.l
    public java.lang.String L(com.tencent.mm.storage.z3 ct6) {
        kotlin.jvm.internal.o.g(ct6, "ct");
        if (kotlin.jvm.internal.o.b(ct6.d1(), "notify@all")) {
            java.lang.String string = getContext().getResources().getString(com.tencent.mm.R.string.f491472d63);
            kotlin.jvm.internal.o.d(string);
            return string;
        }
        java.lang.String f27 = ct6.f2();
        kotlin.jvm.internal.o.d(f27);
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
        return (com.tencent.mm.plugin.finder.live.ui.at.FinderLiveAtSomeoneSearchDataSource) ((jz5.n) this.C).getValue();
    }

    @Override // com.tencent.mm.plugin.finder.ui.at.l
    public int P() {
        return com.tencent.mm.R.layout.anv;
    }
}
