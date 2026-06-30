package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class w10 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f114855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f114856e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tx2.i0 f114857f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.notice.NoticeStatusView f114858g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.z10 f114859h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w10(yz5.a aVar, tx2.i0 i0Var, com.tencent.mm.plugin.finder.view.notice.NoticeStatusView noticeStatusView, com.tencent.mm.plugin.finder.live.plugin.z10 z10Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f114856e = aVar;
        this.f114857f = i0Var;
        this.f114858g = noticeStatusView;
        this.f114859h = z10Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.w10(this.f114856e, this.f114857f, this.f114858g, this.f114859h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.w10) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f114855d;
        tx2.i0 i0Var = this.f114857f;
        yz5.a aVar2 = this.f114856e;
        com.tencent.mm.plugin.finder.view.notice.NoticeStatusView noticeStatusView = this.f114858g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.q65 q65Var = (r45.q65) ((r45.h32) aVar2.invoke()).getCustom(10);
            boolean z17 = false;
            if (q65Var != null && q65Var.getBoolean(0)) {
                z17 = true;
            }
            if (z17) {
                i0Var.a();
                this.f114855d = 1;
                if (noticeStatusView.a(1, this) == aVar) {
                    return aVar;
                }
                com.tencent.mm.plugin.finder.live.plugin.z10.a(this.f114859h, noticeStatusView);
            } else {
                this.f114855d = 2;
                if (noticeStatusView.a(1, this) == aVar) {
                    return aVar;
                }
                i0Var.z(noticeStatusView.getDm.i4.COL_USERNAME java.lang.String(), (r45.h32) aVar2.invoke(), null);
            }
        } else if (i17 == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.live.plugin.z10.a(this.f114859h, noticeStatusView);
        } else {
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            i0Var.z(noticeStatusView.getDm.i4.COL_USERNAME java.lang.String(), (r45.h32) aVar2.invoke(), null);
        }
        return jz5.f0.f302826a;
    }
}
