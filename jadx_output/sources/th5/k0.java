package th5;

/* loaded from: classes12.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.media.live.LivePlayButton f419395d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ th5.q f419396e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ th5.l0 f419397f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f419398g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.tencent.mm.plugin.media.live.LivePlayButton livePlayButton, th5.q qVar, th5.l0 l0Var, android.view.View view) {
        super(1);
        this.f419395d = livePlayButton;
        this.f419396e = qVar;
        this.f419397f = l0Var;
        this.f419398g = view;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pf3.b visibility = (pf3.b) obj;
        kotlin.jvm.internal.o.g(visibility, "$this$visibility");
        visibility.c(this.f419395d);
        android.view.View view = this.f419398g;
        th5.q qVar = this.f419396e;
        if (qVar == null || !qVar.h() || this.f419397f.g0(qVar)) {
            visibility.b(view);
        } else {
            visibility.c(view);
        }
        return jz5.f0.f302826a;
    }
}
