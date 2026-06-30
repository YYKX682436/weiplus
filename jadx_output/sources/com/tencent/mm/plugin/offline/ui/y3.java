package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public final class y3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.b4 f152769d;

    public y3(com.tencent.mm.plugin.offline.ui.b4 b4Var) {
        this.f152769d = b4Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialog, int i17) {
        kotlin.jvm.internal.o.g(dialog, "dialog");
        dialog.dismiss();
        this.f152769d.f152591a.f179978g.a();
    }
}
