package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class oj implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.bl f135476d;

    public oj(com.tencent.mm.plugin.finder.viewmodel.component.bl blVar) {
        this.f135476d = blVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.viewmodel.component.bl blVar = this.f135476d;
        if (itemId != 1) {
            if (itemId != 2) {
                return;
            }
            androidx.appcompat.app.AppCompatActivity activity = blVar.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.gg.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.gg.O6((com.tencent.mm.plugin.finder.viewmodel.component.gg) a17, false, false, false, null, false, false, 63, null);
            return;
        }
        com.tencent.mm.ui.ee.f(blVar.getActivity().getTaskId(), null);
        if (!com.tencent.mm.ui.bk.w0() || android.os.Build.VERSION.SDK_INT < 26) {
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity2 = blVar.getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        ((com.tencent.mm.plugin.finder.viewmodel.component.gg) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.finder.viewmodel.component.gg.class)).f134505d = false;
        blVar.getActivity().finish();
        if (com.tencent.mm.ui.fj.b(blVar.getActivity())) {
            blVar.getIntent().removeFlags(4096);
        } else {
            blVar.getIntent().addFlags(4096);
        }
        pm0.v.V(0L, new com.tencent.mm.plugin.finder.viewmodel.component.nj(blVar));
    }
}
