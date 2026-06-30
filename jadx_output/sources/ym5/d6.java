package ym5;

/* loaded from: classes8.dex */
public final class d6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.StretchFrameLayout f463254d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(com.tencent.mm.view.StretchFrameLayout stretchFrameLayout) {
        super(1);
        this.f463254d = stretchFrameLayout;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(this.f463254d.mStretchIds.contains(java.lang.Integer.valueOf(it.getId())));
    }
}
