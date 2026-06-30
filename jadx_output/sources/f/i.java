package f;

/* loaded from: classes14.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.activity.i f257981d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y f257982e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f.k f257983f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(androidx.activity.i iVar, androidx.lifecycle.y yVar, f.k kVar) {
        super(1);
        this.f257981d = iVar;
        this.f257982e = yVar;
        this.f257983f = kVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n0.b2 DisposableEffect = (n0.b2) obj;
        kotlin.jvm.internal.o.g(DisposableEffect, "$this$DisposableEffect");
        androidx.activity.i iVar = this.f257981d;
        androidx.lifecycle.y yVar = this.f257982e;
        f.k kVar = this.f257983f;
        iVar.a(yVar, kVar);
        return new f.h(kVar);
    }
}
