package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class hg extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f132238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderPopupBubbleView f132239e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.hp2 f132240f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.jb f132241g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f132242h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg(com.tencent.mm.plugin.finder.view.FinderPopupBubbleView finderPopupBubbleView, r45.hp2 hp2Var, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, r45.qt2 qt2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f132239e = finderPopupBubbleView;
        this.f132240f = hp2Var;
        this.f132241g = jbVar;
        this.f132242h = qt2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.view.hg(this.f132239e, this.f132240f, this.f132241g, this.f132242h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.view.hg) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0169 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0109 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.view.hg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
