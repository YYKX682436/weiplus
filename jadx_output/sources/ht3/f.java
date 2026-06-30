package ht3;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ht3.g f284949d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ht3.g gVar) {
        super(1);
        this.f284949d = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object tag = it.getTag(com.tencent.mm.R.id.e5q);
        java.lang.CharSequence charSequence = tag instanceof java.lang.CharSequence ? (java.lang.CharSequence) tag : null;
        if (charSequence == null) {
            charSequence = "";
        }
        java.lang.String string = this.f284949d.getContext().getString(com.tencent.mm.R.string.clq, charSequence);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }
}
