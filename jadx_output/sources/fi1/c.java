package fi1;

/* loaded from: classes8.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fi1.d f262772d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(fi1.d dVar) {
        super(0);
        this.f262772d = dVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f262772d.f262773d;
        if (!(context instanceof android.app.Activity)) {
            return null;
        }
        android.view.View findViewById = ((android.app.Activity) context).getWindow().getDecorView().findViewById(android.R.id.content);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.view.View");
        return findViewById;
    }
}
