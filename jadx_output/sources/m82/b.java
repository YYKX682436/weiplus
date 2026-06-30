package m82;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m82.l f324703d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(m82.l lVar) {
        super(1);
        this.f324703d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (!kotlin.jvm.internal.o.b(it.getTag(com.tencent.mm.R.id.nwr), java.lang.Integer.valueOf(com.tencent.mm.R.raw.actionbar_icon_dark_add))) {
            return "";
        }
        java.lang.String string = this.f324703d.getContext().getResources().getString(com.tencent.mm.R.string.c98);
        kotlin.jvm.internal.o.d(string);
        return string;
    }
}
