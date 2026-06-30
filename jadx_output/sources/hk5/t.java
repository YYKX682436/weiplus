package hk5;

/* loaded from: classes9.dex */
public final class t extends o50.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // o50.j
    public co.a T6() {
        return new fc5.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o50.j
    public android.view.View U6(co.a aVar) {
        mi5.q qVar;
        fc5.g model = (fc5.g) aVar;
        kotlin.jvm.internal.o.g(model, "model");
        if (pd5.l.f353580b.a(com.tencent.mm.repairer.config.chatting.mvvmitem.RepairerConfigMvvmItem_FinderNameCard.class, false)) {
            mi5.b bVar = new mi5.b();
            fc5.g gVar = bVar.f326798c;
            bVar.f326798c = model;
            bVar.c(gVar, model);
            qVar = bVar;
        } else {
            mi5.q qVar2 = new mi5.q();
            fc5.g gVar2 = qVar2.f326899c;
            qVar2.f326899c = model;
            qVar2.c(gVar2, model);
            qVar = qVar2;
        }
        return qVar.a(getActivity());
    }
}
