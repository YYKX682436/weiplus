package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes2.dex */
public final class ga0 extends com.tencent.mm.plugin.finder.storage.vj0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f126822a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f126823b = jz5.h.b(com.tencent.mm.plugin.finder.storage.fa0.f126763d);

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f126824c = jz5.h.b(com.tencent.mm.plugin.finder.storage.da0.f126639d);

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f126825d = jz5.h.b(new com.tencent.mm.plugin.finder.storage.ea0(this));

    public ga0(boolean z17, int i17) {
        this.f126822a = z17;
    }

    @Override // com.tencent.mm.plugin.finder.storage.vj0
    public in5.s b(final yz5.l lVar) {
        return new in5.s() { // from class: com.tencent.mm.plugin.finder.storage.FinderMemberPreviewVideoConfig$getItemConvertFactory$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                in5.r rVar;
                if (type == 2) {
                    com.tencent.mm.plugin.finder.storage.ga0 ga0Var = com.tencent.mm.plugin.finder.storage.ga0.this;
                    return new com.tencent.mm.plugin.finder.storage.ba0(ga0Var.f126822a, ga0Var.g(), com.tencent.mm.plugin.finder.storage.ga0.this.f());
                }
                if (type == 4) {
                    com.tencent.mm.plugin.finder.storage.ga0 ga0Var2 = com.tencent.mm.plugin.finder.storage.ga0.this;
                    return new com.tencent.mm.plugin.finder.storage.ba0(ga0Var2.f126822a, ga0Var2.g(), com.tencent.mm.plugin.finder.storage.ga0.this.f());
                }
                if (type == 9) {
                    com.tencent.mm.plugin.finder.storage.ga0 ga0Var3 = com.tencent.mm.plugin.finder.storage.ga0.this;
                    return new com.tencent.mm.plugin.finder.storage.ba0(ga0Var3.f126822a, ga0Var3.g(), com.tencent.mm.plugin.finder.storage.ga0.this.f());
                }
                switch (type) {
                    case -17:
                        com.tencent.mm.plugin.finder.storage.ga0 ga0Var4 = com.tencent.mm.plugin.finder.storage.ga0.this;
                        return new com.tencent.mm.plugin.finder.convert.ko(ga0Var4.f126822a, null, ga0Var4.g(), com.tencent.mm.plugin.finder.storage.ga0.this.f(), 2, null);
                    case -16:
                        com.tencent.mm.plugin.finder.storage.ga0.this.getClass();
                        return new com.tencent.mm.plugin.finder.convert.mo(206, com.tencent.mm.plugin.finder.storage.ga0.this.g(), com.tencent.mm.plugin.finder.storage.ga0.this.f(), ((java.lang.Number) ((jz5.n) com.tencent.mm.plugin.finder.storage.ga0.this.f126824c).getValue()).floatValue(), true, false);
                    case -15:
                        com.tencent.mm.plugin.finder.storage.ga0.this.getClass();
                        return new com.tencent.mm.plugin.finder.convert.mo(206, com.tencent.mm.plugin.finder.storage.ga0.this.g(), com.tencent.mm.plugin.finder.storage.ga0.this.f(), ((java.lang.Number) ((jz5.n) com.tencent.mm.plugin.finder.storage.ga0.this.f126824c).getValue()).floatValue(), true, false);
                    default:
                        yz5.l lVar2 = lVar;
                        return (lVar2 == null || (rVar = (in5.r) lVar2.invoke(java.lang.Integer.valueOf(type))) == null) ? new com.tencent.mm.plugin.finder.convert.z2() : rVar;
                }
            }
        };
    }

    @Override // com.tencent.mm.plugin.finder.storage.vj0
    public androidx.recyclerview.widget.p2 c() {
        return new com.tencent.mm.plugin.finder.storage.ca0();
    }

    @Override // com.tencent.mm.plugin.finder.storage.vj0
    public androidx.recyclerview.widget.RecyclerView.LayoutManager d(final android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return new androidx.recyclerview.widget.GridLayoutManager(context) { // from class: com.tencent.mm.plugin.finder.storage.FinderMemberPreviewVideoConfig$getLayoutManager$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            /* renamed from: canScrollVertically */
            public boolean getF123307r() {
                return false;
            }
        };
    }

    @Override // com.tencent.mm.plugin.finder.storage.vj0
    public androidx.recyclerview.widget.y2 e(com.tencent.mm.ui.MMActivity context) {
        kotlin.jvm.internal.o.g(context, "context");
        return null;
    }

    public final int f() {
        return ((java.lang.Number) ((jz5.n) this.f126825d).getValue()).intValue();
    }

    public final int g() {
        return ((java.lang.Number) ((jz5.n) this.f126823b).getValue()).intValue();
    }
}
