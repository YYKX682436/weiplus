package yx2;

/* loaded from: classes15.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.snscover.SnsFinderImageBackView f467872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f467873e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.plugin.finder.view.snscover.SnsFinderImageBackView snsFinderImageBackView, com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        super(0);
        this.f467872d = snsFinderImageBackView;
        this.f467873e = finderObject;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f467872d.resetBanner(this.f467873e);
        return jz5.f0.f302826a;
    }
}
