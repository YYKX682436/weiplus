package hg2;

/* loaded from: classes3.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hg2.h f281337d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(hg2.h hVar) {
        super(0);
        this.f281337d = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        hg2.h hVar = this.f281337d;
        hVar.f281356q.d();
        android.view.ViewGroup viewGroup = hVar.f281353n;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        return jz5.f0.f302826a;
    }
}
