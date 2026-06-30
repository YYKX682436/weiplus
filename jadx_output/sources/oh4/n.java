package oh4;

/* loaded from: classes8.dex */
public final class n extends ph4.j {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f345486b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ph4.f callback) {
        super(callback);
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f345486b = "TaskBarSectionOtherViewMusicHelper";
    }

    @Override // ph4.j
    public int a(com.tencent.mm.plugin.multitask.model.MultiTaskInfo data) {
        kotlin.jvm.internal.o.g(data, "data");
        return com.tencent.mm.R.drawable.cfz;
    }

    @Override // ph4.j
    public java.lang.String b(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        java.lang.String r17 = i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f490321rq);
        kotlin.jvm.internal.o.f(r17, "getString(...)");
        return r17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [jz5.f0] */
    /* JADX WARN: Type inference failed for: r1v12, types: [wu5.c] */
    @Override // ph4.j
    public void d(int i17, ph4.b viewHolder, lh4.n viewModel) {
        java.lang.String string;
        java.lang.String str;
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        kotlin.jvm.internal.o.g(viewModel, "viewModel");
        super.d(i17, viewHolder, viewModel);
        r45.rs4 rs4Var = new r45.rs4();
        try {
            rs4Var.parseFrom(((com.tencent.mm.plugin.multitask.model.MultiTaskInfo) ((java.util.ArrayList) viewModel.f318724d).get(i17)).field_data);
            viewHolder.f354461d.setVisibility(0);
            viewHolder.f354462e.setImageDrawable(null);
            r45.xs4 xs4Var = (r45.xs4) rs4Var.getCustom(0);
            if (xs4Var != null && (string = xs4Var.getString(13)) != null) {
                r45.xs4 xs4Var2 = (r45.xs4) rs4Var.getCustom(0);
                r3 = xs4Var2 != null ? xs4Var2.getString(2) : null;
                if ((r3 == null || r3.length() == 0) && com.tencent.mm.vfs.w6.j(string)) {
                    str = ((ku5.t0) ku5.t0.f312615d).a(new oh4.m(string, this, viewHolder, rs4Var));
                } else {
                    e(viewHolder, rs4Var);
                    str = jz5.f0.f302826a;
                }
                r3 = str;
            }
            if (r3 == null) {
                e(viewHolder, rs4Var);
            }
            viewHolder.f354463f.setText(((com.tencent.mm.plugin.multitask.model.MultiTaskInfo) ((java.util.ArrayList) viewModel.f318724d).get(i17)).v0().getString(1));
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e(this.f345486b, "MusicMultiTaskData parse failed");
        }
    }

    public final void e(ph4.b bVar, r45.rs4 rs4Var) {
        bVar.f354462e.setImageDrawable(null);
        r45.xs4 xs4Var = (r45.xs4) rs4Var.getCustom(0);
        java.lang.String string = xs4Var != null ? xs4Var.getString(2) : null;
        if (string == null || string.length() == 0) {
            string = rs4Var.getString(13);
        }
        if (string != null) {
            com.tencent.mars.xlog.Log.i(this.f345486b, "use url: ".concat(string));
            n11.a.b().h(string, bVar.f354462e, gh4.j0.f271933a);
        }
    }
}
