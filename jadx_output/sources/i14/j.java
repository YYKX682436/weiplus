package i14;

/* loaded from: classes8.dex */
public final class j extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i14.k f287330b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i14.k kVar) {
        super(kVar);
        this.f287330b = kVar;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... extraData) {
        kotlin.jvm.internal.o.g(extraData, "extraData");
        this.f287330b.a(context, eVar, java.util.Arrays.copyOf(extraData, extraData.length));
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.efq, viewGroup, false);
        i14.i iVar = this.f287330b.f287335u;
        kotlin.jvm.internal.o.e(iVar, "null cannot be cast to non-null type com.tencent.mm.plugin.setting.fts.FTSSettingSearchDataItem.FTSSettingSearchViewHolder");
        iVar.f287328b = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf);
        iVar.f287329c = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.cut);
        iVar.f287327a = inflate.findViewById(com.tencent.mm.R.id.d0v);
        inflate.setTag(iVar);
        return inflate;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... extraData) {
        kotlin.jvm.internal.o.g(extraData, "extraData");
        i14.k kVar = this.f287330b;
        a(kVar.i(), kVar.f287331q);
        wd0.x1 x1Var = kVar.f287332r;
        if (x1Var == null) {
            return true;
        }
        wd0.y1 y1Var = (wd0.y1) i95.n0.c(wd0.y1.class);
        android.content.Context context2 = view != null ? view.getContext() : null;
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        ((vd0.l3) y1Var).Ui((androidx.appcompat.app.AppCompatActivity) context2, x1Var);
        return true;
    }
}
