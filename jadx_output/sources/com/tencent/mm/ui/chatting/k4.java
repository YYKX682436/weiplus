package com.tencent.mm.ui.chatting;

/* loaded from: classes12.dex */
public class k4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.h4 f201891d;

    public k4(com.tencent.mm.ui.chatting.h4 h4Var) {
        this.f201891d = h4Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.multitalk.model.y yVar = (com.tencent.mm.plugin.multitalk.model.y) i95.n0.c(com.tencent.mm.plugin.multitalk.model.y.class);
        com.tencent.mm.ui.chatting.h4 h4Var = this.f201891d;
        if (!yVar.q4(h4Var.I())) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            dp.a.makeText(context, context.getString(com.tencent.mm.R.string.f492596h34), 0).show();
            return;
        }
        com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.Z = new com.tencent.mm.ui.chatting.k4$$a();
        if (((com.tencent.mm.plugin.multitalk.model.y) i95.n0.c(com.tencent.mm.plugin.multitalk.model.y.class)).mh(h4Var.I())) {
            return;
        }
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        dp.a.makeText(context2, context2.getString(com.tencent.mm.R.string.h1k), 0).show();
    }
}
