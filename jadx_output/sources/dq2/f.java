package dq2;

/* loaded from: classes2.dex */
public final class f extends up2.m {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f242364p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.util.ArrayList feedDataList, yz5.a autoPlayManager, sp2.c4 caller, yz5.a loadMoreCall, yz5.a canLoadingMore, int i17) {
        super(feedDataList, autoPlayManager, caller, loadMoreCall, canLoadingMore, i17);
        kotlin.jvm.internal.o.g(feedDataList, "feedDataList");
        kotlin.jvm.internal.o.g(autoPlayManager, "autoPlayManager");
        kotlin.jvm.internal.o.g(caller, "caller");
        kotlin.jvm.internal.o.g(loadMoreCall, "loadMoreCall");
        kotlin.jvm.internal.o.g(canLoadingMore, "canLoadingMore");
        this.f242364p = "VerticalNewEntrancePlayChecker";
    }

    @Override // up2.m
    public int b() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.P4).getValue()).r()).intValue();
    }

    @Override // up2.m
    public java.lang.String c() {
        return this.f242364p;
    }

    @Override // up2.m
    public boolean d(so2.j5 j5Var) {
        return true;
    }
}
