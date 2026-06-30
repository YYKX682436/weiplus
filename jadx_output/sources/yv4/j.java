package yv4;

/* loaded from: classes4.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yv4.k f466227d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(yv4.k kVar) {
        super(0);
        this.f466227d = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yv4.k kVar = this.f466227d;
        com.tencent.mm.ui.base.WxImageView wxImageView = (com.tencent.mm.ui.base.WxImageView) kVar.findViewById(com.tencent.mm.R.id.ss6);
        wxImageView.setOnImageLoadEventListener(new yv4.i(kVar));
        return wxImageView;
    }
}
