package p10;

/* loaded from: classes7.dex */
public final class d0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f350939d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f350940e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.nirvana.ui.MagicEcsNirvanaUI f350941f;

    /* renamed from: g, reason: collision with root package name */
    public int f350942g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.tencent.mm.feature.ecs.nirvana.ui.MagicEcsNirvanaUI magicEcsNirvanaUI, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f350941f = magicEcsNirvanaUI;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f350940e = obj;
        this.f350942g |= Integer.MIN_VALUE;
        return com.tencent.mm.feature.ecs.nirvana.ui.MagicEcsNirvanaUI.U6(this.f350941f, this);
    }
}
