package xm3;

/* loaded from: classes4.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mvvmlist.MvvmList f455369d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList) {
        super(0);
        this.f455369d = mvvmList;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = this.f455369d;
        return new com.tencent.mm.sdk.event.pending.UIPendingEventNotifier(mvvmList.f152070t, (xm3.n) ((jz5.n) mvvmList.f152074x).getValue(), mvvmList.f152059f);
    }
}
