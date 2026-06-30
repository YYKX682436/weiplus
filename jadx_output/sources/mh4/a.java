package mh4;

/* loaded from: classes8.dex */
public final class a extends ph4.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ph4.f callback) {
        super(callback);
        kotlin.jvm.internal.o.g(callback, "callback");
    }

    @Override // ph4.j
    public int a(com.tencent.mm.plugin.multitask.model.MultiTaskInfo data) {
        kotlin.jvm.internal.o.g(data, "data");
        return data.field_type == 4 ? com.tencent.mm.R.drawable.cfx : com.tencent.mm.R.drawable.f482159cg0;
    }

    @Override // ph4.j
    public java.lang.String b(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        if (multiTaskInfo == null) {
            return "";
        }
        if (multiTaskInfo.field_type == 4) {
            java.lang.String r17 = i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f490318rn);
            kotlin.jvm.internal.o.f(r17, "getString(...)");
            return r17;
        }
        java.lang.String r18 = i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f490322rr);
        kotlin.jvm.internal.o.f(r18, "getString(...)");
        return r18;
    }

    @Override // ph4.j
    public void c(ph4.b viewHolder) {
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        viewHolder.f354462e.setImageBitmap(null);
    }

    @Override // ph4.j
    public void d(int i17, ph4.b viewHolder, lh4.n viewModel) {
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        kotlin.jvm.internal.o.g(viewModel, "viewModel");
        super.d(i17, viewHolder, viewModel);
        java.util.List list = viewModel.f318724d;
        if (((com.tencent.mm.plugin.multitask.model.MultiTaskInfo) ((java.util.ArrayList) list).get(i17)).field_type == 4) {
            jt.a0 a0Var = (jt.a0) i95.n0.c(jt.a0.class);
            java.lang.String string = ((com.tencent.mm.plugin.multitask.model.MultiTaskInfo) ((java.util.ArrayList) list).get(i17)).v0().getString(4);
            ((ht.s) a0Var).getClass();
            com.tencent.mm.pluginsdk.model.t3.n(string, false);
        }
        ((com.tencent.mm.feature.emoji.gb) ((com.tencent.mm.feature.emoji.api.c7) i95.n0.c(com.tencent.mm.feature.emoji.api.c7.class))).getClass();
        com.tencent.mm.smiley.x1 Di = com.tencent.mm.smiley.x1.Di();
        viewHolder.itemView.getContext();
        viewHolder.f354463f.setText(Di.Ri(((com.tencent.mm.plugin.multitask.model.MultiTaskInfo) ((java.util.ArrayList) list).get(i17)).v0().getString(1), true));
    }
}
