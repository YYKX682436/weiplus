package mx2;

/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.image.FinderImageBanner f332483d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.plugin.finder.view.image.FinderImageBanner finderImageBanner) {
        super(0);
        this.f332483d = finderImageBanner;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("Finder.ImageBanner", "checkPlay : onFirstFrameDraw, trigger pre-render for next LivePhoto");
        com.tencent.mm.plugin.finder.view.image.FinderImageBanner.d(this.f332483d);
        return jz5.f0.f302826a;
    }
}
