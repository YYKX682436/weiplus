package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class s30 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f114212d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.b0 f114213e;

    public s30(android.content.Context context, cm2.b0 b0Var) {
        this.f114212d = context;
        this.f114213e = b0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        com.tencent.mm.protocal.protobuf.FinderJumpInfo info = this.f114213e.f43331v;
        android.content.Context context = this.f114212d;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(info, "info");
        xc2.y2 y2Var = xc2.y2.f453343a;
        xc2.p0 p0Var = new xc2.p0(info);
        p0Var.f453252n = 0;
        xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
    }
}
