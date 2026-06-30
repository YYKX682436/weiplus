package m82;

/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m82.o f324714d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(m82.o oVar) {
        super(1);
        this.f324714d = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (!kotlin.jvm.internal.o.b(it.getTag(com.tencent.mm.R.id.nwr), java.lang.Integer.valueOf(com.tencent.mm.R.raw.actionbar_icon_dark_more))) {
            return "";
        }
        boolean equals = "1".equals(it.getTag(com.tencent.mm.R.id.nwn));
        m82.o oVar = this.f324714d;
        java.lang.String string = equals ? oVar.getContext().getString(com.tencent.mm.R.string.h_t) : oVar.getContext().getString(com.tencent.mm.R.string.jzq);
        kotlin.jvm.internal.o.d(string);
        return string;
    }
}
