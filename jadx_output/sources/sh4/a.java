package sh4;

/* loaded from: classes8.dex */
public final class a extends ph4.j {

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.multitask.model.MultiTaskInfo f408029b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f408030c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ph4.f callback) {
        super(callback);
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f408030c = "TaskBarSectionOtherViewWebViewHelper";
    }

    @Override // ph4.j
    public int a(com.tencent.mm.plugin.multitask.model.MultiTaskInfo data) {
        kotlin.jvm.internal.o.g(data, "data");
        return com.tencent.mm.R.drawable.f482161cg2;
    }

    @Override // ph4.j
    public java.lang.String b(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        java.lang.String r17 = i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f490325ru);
        kotlin.jvm.internal.o.f(r17, "getString(...)");
        return r17;
    }

    @Override // ph4.j
    public void c(ph4.b viewHolder) {
        r45.lr4 v07;
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        if (this.f408029b == null) {
            return;
        }
        r45.k97 k97Var = new r45.k97();
        java.lang.String str = null;
        try {
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = this.f408029b;
            k97Var.parseFrom(multiTaskInfo != null ? multiTaskInfo.field_data : null);
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e(this.f408030c, "WebMultiTaskData parse failed");
        }
        java.lang.String string = k97Var.getString(28);
        if (string == null) {
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo2 = this.f408029b;
            if (multiTaskInfo2 != null && (v07 = multiTaskInfo2.v0()) != null) {
                str = v07.getString(5);
            }
        } else {
            str = string;
        }
        if (str != null) {
            n11.a.b().h(str, viewHolder.f354462e, gh4.j0.f271933a);
        }
    }

    @Override // ph4.j
    public void d(int i17, ph4.b viewHolder, lh4.n viewModel) {
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        kotlin.jvm.internal.o.g(viewModel, "viewModel");
        java.util.List list = viewModel.f318724d;
        this.f408029b = (com.tencent.mm.plugin.multitask.model.MultiTaskInfo) ((java.util.ArrayList) list).get(i17);
        viewHolder.f354463f.setText(((com.tencent.mm.plugin.multitask.model.MultiTaskInfo) ((java.util.ArrayList) list).get(i17)).v0().getString(1));
        super.d(i17, viewHolder, viewModel);
    }
}
