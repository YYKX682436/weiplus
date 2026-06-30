package ej4;

/* loaded from: classes4.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f253377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ej4.v f253378e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f253379f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(android.widget.TextView textView, ej4.v vVar, java.lang.CharSequence charSequence, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f253377d = textView;
        this.f253378e = vVar;
        this.f253379f = charSequence;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ej4.t(this.f253377d, this.f253378e, this.f253379f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ej4.t tVar = (ej4.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        tVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        android.widget.TextView textView = this.f253377d;
        if (textView.getTag().equals(this.f253378e.f253383d)) {
            textView.setText(this.f253379f);
        }
        return jz5.f0.f302826a;
    }
}
