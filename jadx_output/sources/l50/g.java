package l50;

/* loaded from: classes9.dex */
public final class g extends o50.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // o50.j
    public co.a T6() {
        return new pb5.a();
    }

    @Override // o50.j
    public android.view.View U6(co.a aVar) {
        pb5.a cardViewModel = (pb5.a) aVar;
        kotlin.jvm.internal.o.g(cardViewModel, "cardViewModel");
        mi5.d dVar = new mi5.d();
        pb5.a aVar2 = dVar.f326812c;
        dVar.f326812c = cardViewModel;
        dVar.c(aVar2, cardViewModel);
        return dVar.a(getActivity());
    }
}
