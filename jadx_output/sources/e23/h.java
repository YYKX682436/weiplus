package e23;

/* loaded from: classes12.dex */
public class h extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.i f246859b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(e23.i iVar) {
        super(iVar);
        this.f246859b = iVar;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        e23.g gVar2 = (e23.g) eVar;
        e23.i iVar = (e23.i) gVar;
        android.content.res.Resources resources = context.getResources();
        if (this.f246859b.f246869t) {
            com.tencent.mm.plugin.fts.ui.n3.b(resources.getString(com.tencent.mm.R.string.idk, resources.getString(iVar.f246868s)), gVar2.f246851a);
            gVar2.f246852b.setRotation(0.0f);
        } else {
            com.tencent.mm.plugin.fts.ui.n3.b(resources.getString(com.tencent.mm.R.string.idl), gVar2.f246851a);
            gVar2.f246852b.setRotation(180.0f);
        }
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bbv, viewGroup, false);
        e23.g gVar = this.f246859b.f246871v;
        gVar.f246851a = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.jrw);
        gVar.f246852b = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.jqn);
        inflate.setTag(gVar);
        return inflate;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        return false;
    }
}
