package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class c7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm.x3 f133971d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.d7 f133972e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gx2.q f133973f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(dm.x3 x3Var, com.tencent.mm.plugin.finder.viewmodel.component.d7 d7Var, gx2.q qVar) {
        super(0);
        this.f133971d = x3Var;
        this.f133972e = d7Var;
        this.f133973f = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        cq.k1.a();
        boolean booleanValue = ((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127730h6).getValue()).r()).booleanValue();
        dm.x3 item = this.f133971d;
        if (!booleanValue) {
            i95.m c17 = i95.n0.c(c61.l7.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.storage.r rVar = (com.tencent.mm.plugin.finder.storage.r) ((jz5.n) ((c61.l7) c17).H).getValue();
            rVar.getClass();
            kotlin.jvm.internal.o.g(item, "item");
            com.tencent.mars.xlog.Log.i("Finder.FinderCommEducationInfoStorage", "remove bizType:" + item.field_biz_type + ", result: " + rVar.f127455d.delete("FinderCommEducationInfoItem", "biz_type=?", new java.lang.String[]{java.lang.String.valueOf(item.field_biz_type)}));
        }
        com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
        com.tencent.mm.plugin.finder.viewmodel.component.d7 d7Var = this.f133972e;
        com.tencent.mm.plugin.finder.report.d2.i(d2Var, d7Var.getActivity(), "privacy_protect", "trigger_privacy_protect_toast", false, com.tencent.mm.plugin.finder.viewmodel.component.d7.O6(d7Var, item), 8, null);
        if (item.field_report_only) {
            androidx.appcompat.app.AppCompatActivity activity = d7Var.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((com.tencent.mm.plugin.finder.viewmodel.component.ea) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ea.class)).f134241e = false;
        } else {
            com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.m(this.f133973f, false, 1, null);
            d7Var.f134087d = true;
        }
        return jz5.f0.f302826a;
    }
}
