package lw2;

/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lw2.m f321565d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(lw2.m mVar) {
        super(0);
        this.f321565d = mVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.report.r0 a76;
        android.content.Context context = this.f321565d.f321576a.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        if (nyVar == null || (a76 = nyVar.a7(-1)) == null) {
            return null;
        }
        return a76.f125284h;
    }
}
