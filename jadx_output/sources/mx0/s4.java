package mx0;

/* loaded from: classes5.dex */
public final class s4 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f332304d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f332305e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f332306f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f332307g;

    /* renamed from: h, reason: collision with root package name */
    public int f332308h;

    /* renamed from: i, reason: collision with root package name */
    public long f332309i;

    /* renamed from: m, reason: collision with root package name */
    public long f332310m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f332311n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332312o;

    /* renamed from: p, reason: collision with root package name */
    public int f332313p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f332312o = shootComposingPluginLayout;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f332311n = obj;
        this.f332313p |= Integer.MIN_VALUE;
        return com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout.C(this.f332312o, null, 0, 0L, null, this);
    }
}
