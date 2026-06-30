package hk5;

/* loaded from: classes9.dex */
public final class v extends o50.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // o50.j
    public co.a T6() {
        return new qc5.a();
    }

    @Override // o50.j
    public android.view.View U6(co.a aVar) {
        qc5.a cardViewModel = (qc5.a) aVar;
        kotlin.jvm.internal.o.g(cardViewModel, "cardViewModel");
        mi5.v vVar = new mi5.v();
        qc5.a aVar2 = vVar.f326928b;
        vVar.f326928b = cardViewModel;
        vVar.c(aVar2, cardViewModel);
        return vVar.a(getActivity());
    }
}
