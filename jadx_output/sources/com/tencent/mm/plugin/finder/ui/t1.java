package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class t1 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderBlockListSearchUI f129854d;

    public t1(com.tencent.mm.plugin.finder.ui.FinderBlockListSearchUI finderBlockListSearchUI) {
        this.f129854d = finderBlockListSearchUI;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        int a07 = i17 - ((in5.n0) adapter).a0();
        if (a07 >= 0) {
            com.tencent.mm.plugin.finder.ui.FinderBlockListSearchUI finderBlockListSearchUI = this.f129854d;
            if (a07 < finderBlockListSearchUI.f128524v.size()) {
                com.tencent.mm.protocal.protobuf.FinderContact finderContact = ((so2.i0) finderBlockListSearchUI.f128524v.get(a07)).f410415d;
                if (!com.tencent.mm.storage.z3.S3(finderContact.getUsername())) {
                    com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                    java.lang.String username = finderContact.getUsername();
                    androidx.appcompat.app.AppCompatActivity context = finderBlockListSearchUI.getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    i0Var.Bk(username, context);
                    return;
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("finder_username", finderContact.getUsername());
                com.tencent.mm.plugin.finder.assist.i0 i0Var2 = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                android.content.Context context2 = holder.f293121e;
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                i0Var2.mk(context2, intent);
            }
        }
    }
}
