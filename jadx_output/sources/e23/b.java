package e23;

/* loaded from: classes12.dex */
public class b extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.c f246777b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e23.c cVar) {
        super(cVar);
        this.f246777b = cVar;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        e23.a aVar = (e23.a) eVar;
        android.view.View view = aVar.f246768a;
        e23.c cVar = this.f246777b;
        com.tencent.mm.plugin.fts.ui.n3.i(view, cVar.f423761d);
        com.tencent.mm.plugin.fts.ui.n3.a(cVar.f246793q, aVar.f246770c);
        aVar.f246769b.setImageResource(com.tencent.mm.R.raw.search_add_icon_green);
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489121bd0, viewGroup, false);
        e23.a aVar = new e23.a(this.f246777b);
        aVar.f246769b = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.h6y);
        aVar.f246770c = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.o_q);
        aVar.f246768a = inflate.findViewById(com.tencent.mm.R.id.mem);
        inflate.setTag(aVar);
        return inflate;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        return false;
    }
}
