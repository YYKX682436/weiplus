package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class fz extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f134446d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f134447e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz(android.content.Context context, long j17) {
        super(1);
        this.f134446d = context;
        this.f134447e = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if ((fVar != null && fVar.f70615a == 0) && fVar.f70616b == 0) {
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(this.f134446d);
            e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
            e4Var.d(com.tencent.mm.R.string.f492045o11);
            e4Var.c();
            com.tencent.mm.autogen.events.FinderContinueWatchEvent finderContinueWatchEvent = new com.tencent.mm.autogen.events.FinderContinueWatchEvent();
            am.xa xaVar = finderContinueWatchEvent.f54267g;
            xaVar.f8369a = 1;
            xaVar.f8370b = this.f134447e;
            finderContinueWatchEvent.e();
        }
        return jz5.f0.f302826a;
    }
}
