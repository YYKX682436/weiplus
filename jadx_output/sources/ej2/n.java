package ej2;

/* loaded from: classes10.dex */
public final class n extends ej2.j {

    /* renamed from: o, reason: collision with root package name */
    public final zh2.e f253318o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.view.View root, gk2.e liveData, zh2.e userInterface) {
        super(root, liveData);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(userInterface, "userInterface");
        this.f253318o = userInterface;
        this.f253311n = new yh2.k(new com.tencent.mm.plugin.finder.live.mic.pk.factory.FinderLiveVisitorLinkConvertFactory(liveData, new ej2.l(this, liveData, root)), this.f253310m);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f253308k;
        if (recyclerView == null) {
            return;
        }
        recyclerView.setAdapter(a());
    }
}
