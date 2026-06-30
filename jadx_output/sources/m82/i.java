package m82;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m82.l f324710d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m82.l lVar) {
        super(1);
        this.f324710d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String string = this.f324710d.getContext().getString(com.tencent.mm.R.string.cde);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }
}
