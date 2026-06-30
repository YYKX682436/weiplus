package xm3;

/* loaded from: classes4.dex */
public final class l0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f455349d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f455350e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mvvmlist.MvvmList f455351f;

    /* renamed from: g, reason: collision with root package name */
    public int f455352g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f455351f = mvvmList;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f455350e = obj;
        this.f455352g |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.mvvmlist.MvvmList.C(this.f455351f, null, this);
    }
}
