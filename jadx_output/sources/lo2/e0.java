package lo2;

/* loaded from: classes8.dex */
public final class e0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f320115d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.ui.FinderMemberSearchUI f320116e;

    /* renamed from: f, reason: collision with root package name */
    public int f320117f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.plugin.finder.member.ui.FinderMemberSearchUI finderMemberSearchUI, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f320116e = finderMemberSearchUI;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f320115d = obj;
        this.f320117f |= Integer.MIN_VALUE;
        java.lang.Object c76 = com.tencent.mm.plugin.finder.member.ui.FinderMemberSearchUI.c7(this.f320116e, null, this);
        return c76 == pz5.a.f359186d ? c76 : kotlin.Result.m520boximpl(c76);
    }
}
