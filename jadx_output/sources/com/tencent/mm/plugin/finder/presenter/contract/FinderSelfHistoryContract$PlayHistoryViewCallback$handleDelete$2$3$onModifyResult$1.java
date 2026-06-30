package com.tencent.mm.plugin.finder.presenter.contract;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lso2/j5;", "it", "", "invoke", "(Lso2/j5;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class FinderSelfHistoryContract$PlayHistoryViewCallback$handleDelete$2$3$onModifyResult$1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f123262d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderSelfHistoryContract$PlayHistoryViewCallback$handleDelete$2$3$onModifyResult$1(so2.j5 j5Var) {
        super(1);
        this.f123262d = j5Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        so2.j5 it = (so2.j5) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(it.getItemId() == this.f123262d.getItemId());
    }
}
