package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes15.dex */
public final class m9 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f129511d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI f129512e;

    /* renamed from: f, reason: collision with root package name */
    public int f129513f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9(com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI finderLivePostHelperUI, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f129512e = finderLivePostHelperUI;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f129511d = obj;
        this.f129513f |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI.l7(this.f129512e, null, this);
    }
}
