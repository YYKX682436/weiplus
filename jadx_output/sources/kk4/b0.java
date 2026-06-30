package kk4;

/* loaded from: classes15.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk4.f0 f308518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.thumbplayer.api.composition.ITPMediaAsset f308519e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(kk4.f0 f0Var, com.tencent.thumbplayer.api.composition.ITPMediaAsset iTPMediaAsset) {
        super(0);
        this.f308518d = f0Var;
        this.f308519e = iTPMediaAsset;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f308518d.f308525a.setDataSource(this.f308519e);
        return jz5.f0.f302826a;
    }
}
