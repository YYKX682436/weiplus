package m82;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m82.l f324708d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m82.l lVar) {
        super(1);
        this.f324708d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        m82.l lVar = this.f324708d;
        if (lVar.f324713d) {
            java.lang.String string = lVar.getContext().getString(com.tencent.mm.R.string.f491212cd2);
            kotlin.jvm.internal.o.d(string);
            return string;
        }
        java.lang.String string2 = lVar.getContext().getString(com.tencent.mm.R.string.cd_);
        kotlin.jvm.internal.o.d(string2);
        return string2;
    }
}
