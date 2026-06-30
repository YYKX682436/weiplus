package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes.dex */
public final class l0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f121763d;

    /* renamed from: e, reason: collision with root package name */
    public int f121764e;

    /* renamed from: f, reason: collision with root package name */
    public int f121765f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vp2.e f121766g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerView f121767h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.m0 f121768i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(vp2.e eVar, com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.m0 m0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f121766g = eVar;
        this.f121767h = wxRecyclerView;
        this.f121768i = m0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.l0(this.f121766g, this.f121767h, this.f121768i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.l0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x007e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0065 -> B:5:0x0068). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.l0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
