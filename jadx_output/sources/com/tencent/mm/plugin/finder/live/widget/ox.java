package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class ox extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f119332d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f119333e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.rx f119334f;

    /* renamed from: g, reason: collision with root package name */
    public int f119335g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ox(com.tencent.mm.plugin.finder.live.widget.rx rxVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f119334f = rxVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f119333e = obj;
        this.f119335g |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.finder.live.widget.rx.e0(this.f119334f, this);
    }
}
