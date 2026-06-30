package cw2;

/* loaded from: classes.dex */
public final class c9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderVideoLayout f223622d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout) {
        super(0);
        this.f223622d = finderVideoLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f223622d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (context instanceof androidx.appcompat.app.AppCompatActivity) {
            return (hy2.m) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(hy2.m.class);
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }
}
