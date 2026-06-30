package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class f3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.q3 f173859d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f173860e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(com.tencent.mm.plugin.textstatus.ui.q3 q3Var, android.content.Context context) {
        super(0);
        this.f173859d = q3Var;
        this.f173860e = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.textstatus.ui.q3 q3Var = this.f173859d;
        com.tencent.mars.xlog.Log.i(q3Var.f174190e, "onLongClickToPlay");
        mj4.h hVar = q3Var.A;
        if (hVar != null) {
            qj4.s.m(qj4.s.f363958a, this.f173860e, 91L, null, hVar, 0L, 0L, 0L, 0L, null, null, 0L, com.tencent.rtmp.TXLiveConstants.PLAY_WARNING_VIDEO_TIMESTAMP_ROLLBACK, null);
        }
        return jz5.f0.f302826a;
    }
}
