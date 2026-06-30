package hr3;

/* loaded from: classes.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.q0 f283786d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(hr3.q0 q0Var) {
        super(1);
        this.f283786d = q0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (!kotlin.jvm.internal.o.b(it.getTag(com.tencent.mm.R.id.nwr), java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_outlined_more))) {
            return "";
        }
        java.lang.String string = this.f283786d.getContext().getResources().getString(com.tencent.mm.R.string.h2f);
        kotlin.jvm.internal.o.d(string);
        return string;
    }
}
