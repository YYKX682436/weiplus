package hk5;

/* loaded from: classes9.dex */
public final class l extends o50.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // o50.j
    public co.a T6() {
        return new vd5.a();
    }

    @Override // o50.j
    public android.view.View U6(co.a aVar) {
        vd5.a cardViewModel = (vd5.a) aVar;
        kotlin.jvm.internal.o.g(cardViewModel, "cardViewModel");
        mi5.e eVar = new mi5.e();
        vd5.a aVar2 = eVar.f326820b;
        eVar.f326820b = cardViewModel;
        eVar.c(aVar2, cardViewModel);
        return eVar.a(getActivity());
    }
}
