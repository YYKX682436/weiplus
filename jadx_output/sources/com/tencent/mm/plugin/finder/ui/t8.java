package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes15.dex */
public final class t8 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f129864d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f129865e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI f129866f;

    /* renamed from: g, reason: collision with root package name */
    public int f129867g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI finderLivePostHelperUI, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f129866f = finderLivePostHelperUI;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f129865e = obj;
        this.f129867g |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI.f7(this.f129866f, null, this);
    }
}
