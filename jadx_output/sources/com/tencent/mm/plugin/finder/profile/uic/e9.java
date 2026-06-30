package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class e9 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f123660a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f123661b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f123662c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f123663d;

    public e9(com.tencent.mm.plugin.finder.profile.uic.ob obVar, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, kotlin.jvm.internal.c0 c0Var, boolean z17) {
        this.f123660a = obVar;
        this.f123661b = finderJumpInfo;
        this.f123662c = c0Var;
        this.f123663d = z17;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f123660a;
            long longExtra = obVar.getIntent().getLongExtra("finder_from_feed_id", 0L);
            com.tencent.mm.plugin.finder.report.t2 t2Var = com.tencent.mm.plugin.finder.report.t2.f125363a;
            android.app.Activity context = obVar.getContext();
            java.lang.String username = obVar.getUsername();
            java.lang.String wording = this.f123661b.getWording();
            if (wording == null) {
                wording = "";
            }
            t2Var.c(context, username, false, wording, this.f123662c.f310112d, longExtra, this.f123663d);
        }
    }
}
