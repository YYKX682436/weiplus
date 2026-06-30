package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class f2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.h2 f151826d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(com.tencent.mm.plugin.mv.ui.view.h2 h2Var) {
        super(0);
        this.f151826d = h2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        final com.tencent.mm.plugin.mv.ui.view.h2 h2Var = this.f151826d;
        return new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.mv.ui.view.MusicMvListDialog$adapter$2$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new com.tencent.mm.plugin.mv.ui.view.e2(com.tencent.mm.plugin.mv.ui.view.h2.this);
            }
        }, h2Var.f151842e, true);
    }
}
