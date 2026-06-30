package cw2;

/* loaded from: classes2.dex */
public final class h3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderLiveCardMediaLayout f223740d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(com.tencent.mm.plugin.finder.video.FinderLiveCardMediaLayout finderLiveCardMediaLayout) {
        super(0);
        this.f223740d = finderLiveCardMediaLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f223740d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (context instanceof androidx.appcompat.app.AppCompatActivity) {
            return (hy2.m) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(hy2.m.class);
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }
}
