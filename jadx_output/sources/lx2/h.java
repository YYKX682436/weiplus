package lx2;

/* loaded from: classes2.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lx2.j f322067d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(lx2.j jVar) {
        super(0);
        this.f322067d = jVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f322067d.f322051b;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (context instanceof androidx.appcompat.app.AppCompatActivity) {
            return (com.tencent.mm.plugin.finder.viewmodel.component.bl) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.bl.class);
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }
}
