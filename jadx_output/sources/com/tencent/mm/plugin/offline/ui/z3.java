package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public final class z3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.b4 f152776d;

    public z3(com.tencent.mm.plugin.offline.ui.b4 b4Var) {
        this.f152776d = b4Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialog, int i17) {
        kotlin.jvm.internal.o.g(dialog, "dialog");
        dialog.dismiss();
        this.f152776d.f152591a.finish();
    }
}
