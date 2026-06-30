package ej4;

/* loaded from: classes11.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.NoMeasuredTextView f253386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ej4.x f253387e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f253388f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.ui.base.NoMeasuredTextView noMeasuredTextView, ej4.x xVar, java.lang.CharSequence charSequence) {
        super(0);
        this.f253386d = noMeasuredTextView;
        this.f253387e = xVar;
        this.f253388f = charSequence;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.base.NoMeasuredTextView noMeasuredTextView = this.f253386d;
        java.lang.Object tag = noMeasuredTextView.getTag(com.tencent.mm.R.id.f483942t06);
        java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
        if (str == null || kotlin.jvm.internal.o.b(str, this.f253387e.f253374a)) {
            noMeasuredTextView.setText(this.f253388f);
        }
        return jz5.f0.f302826a;
    }
}
