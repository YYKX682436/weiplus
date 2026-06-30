package com.tencent.mm.plugin.textstatus.convert.topic;

/* loaded from: classes11.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nj4.e f173386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f173387e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(nj4.e eVar, in5.s0 s0Var) {
        super(0);
        this.f173386d = eVar;
        this.f173387e = s0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view;
        nj4.e eVar = this.f173386d;
        if (eVar.f337936d.f5135b.size() > 0) {
            ai4.e eVar2 = eVar.f337936d;
            java.lang.String o17 = ((mj4.k) ((mj4.h) eVar2.f5135b.get(0))).o();
            in5.s0 s0Var = this.f173387e;
            android.view.View findViewWithTag = s0Var.itemView.findViewWithTag("status_avatar_".concat(o17));
            if (findViewWithTag != null) {
                android.graphics.Rect rect = new android.graphics.Rect();
                if (findViewWithTag.getLocalVisibleRect(rect) && rect.height() == findViewWithTag.getHeight()) {
                    view = findViewWithTag;
                    com.tencent.mm.plugin.textstatus.ui.h4 h4Var = com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity.f173478o;
                    android.content.Context context = s0Var.f293121e;
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    com.tencent.mm.plugin.textstatus.ui.h4.b(h4Var, context, o17, 1002, null, null, view, null, null, 216, null);
                    mj4.k kVar = (mj4.k) ((mj4.h) eVar2.f5135b.get(0));
                    qj4.s.n(qj4.s.f363958a, 6L, kVar.h(), eVar2.f5135b.size(), kVar.o(), null, null, 0, 0L, 0L, xe0.j0.a(kVar, false, 1, null).f355218i, java.lang.Integer.valueOf(xe0.j0.a(kVar, false, 1, null).f355225s), null, null, null, 14832, null);
                }
            }
            view = null;
            com.tencent.mm.plugin.textstatus.ui.h4 h4Var2 = com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity.f173478o;
            android.content.Context context2 = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            com.tencent.mm.plugin.textstatus.ui.h4.b(h4Var2, context2, o17, 1002, null, null, view, null, null, 216, null);
            mj4.k kVar2 = (mj4.k) ((mj4.h) eVar2.f5135b.get(0));
            qj4.s.n(qj4.s.f363958a, 6L, kVar2.h(), eVar2.f5135b.size(), kVar2.o(), null, null, 0, 0L, 0L, xe0.j0.a(kVar2, false, 1, null).f355218i, java.lang.Integer.valueOf(xe0.j0.a(kVar2, false, 1, null).f355225s), null, null, null, 14832, null);
        }
        return jz5.f0.f302826a;
    }
}
