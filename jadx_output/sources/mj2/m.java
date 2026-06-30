package mj2;

/* loaded from: classes10.dex */
public class m extends mj2.j {

    /* renamed from: y, reason: collision with root package name */
    public final nj2.z f327039y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.content.Context context, nj2.z parentPanel, gk2.e liveData, android.view.View root, zh2.c pluginAbility, zh2.e micUserInterface, zh2.d dVar) {
        super(context, liveData, root, pluginAbility, micUserInterface, dVar);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(parentPanel, "parentPanel");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(micUserInterface, "micUserInterface");
        this.f327039y = parentPanel;
    }

    @Override // mj2.j, mj2.e
    public mi2.h j() {
        return new mi2.h(this.f327013d, this.f327016g, new mj2.l(this));
    }

    @Override // mj2.e
    public void m() {
        this.f327039y.a();
    }
}
