package fr5;

/* loaded from: classes3.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fr5.f0 f266022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f266023e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(fr5.f0 f0Var, android.view.View view) {
        super(1);
        this.f266022d = f0Var;
        this.f266023e = view;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.MotionEvent e17 = (android.view.MotionEvent) obj;
        kotlin.jvm.internal.o.g(e17, "e");
        this.f266022d.getClass();
        return java.lang.Boolean.valueOf(this.f266023e.performClick());
    }
}
