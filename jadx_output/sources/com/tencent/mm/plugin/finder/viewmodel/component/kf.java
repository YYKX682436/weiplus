package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class kf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f134963d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FinderPostRefFeedCommentEvent f134964e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.qf f134965f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.autogen.events.FinderPostRefFeedCommentEvent finderPostRefFeedCommentEvent, com.tencent.mm.plugin.finder.viewmodel.component.qf qfVar) {
        super(2, continuation);
        this.f134963d = hVar;
        this.f134964e = finderPostRefFeedCommentEvent;
        this.f134965f = qfVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.kf(this.f134963d, continuation, this.f134964e, this.f134965f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.viewmodel.component.kf kfVar = (com.tencent.mm.plugin.finder.viewmodel.component.kf) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        kfVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) ((xg2.i) this.f134963d).f454393b).getCustom(2);
        if (finderObject != null) {
            com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 32);
            bu2.j jVar = bu2.j.f24534a;
            bu2.i iVar = bu2.i.f24521b;
            jVar.n(a17, bu2.i.f24531l);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("feed_object_id", finderObject.getId());
            intent.putExtra("KEY_COMMENT_ID", this.f134964e.f54315g.f8075c);
            intent.putExtra("from_pat", true);
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Xj(this.f134965f.getActivity(), intent);
        }
        return jz5.f0.f302826a;
    }
}
