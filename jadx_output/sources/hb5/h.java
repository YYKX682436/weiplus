package hb5;

/* loaded from: classes11.dex */
public class h implements com.tencent.mm.ui.contact.item.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hb5.i f280195a;

    public h(hb5.i iVar) {
        this.f280195a = iVar;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = i65.a.D(context) ? android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ck7, viewGroup, false) : android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ck6, viewGroup, false);
        hb5.g gVar = this.f280195a.F;
        gVar.f280190a = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a_4);
        gVar.f280191b = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.cut)).setVisibility(8);
        inflate.setTag(gVar);
        return inflate;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public boolean b(android.content.Context context, android.view.View view, com.tencent.mm.ui.contact.item.d dVar) {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public void c(android.content.Context context, com.tencent.mm.ui.contact.item.b bVar, com.tencent.mm.ui.contact.item.d dVar, boolean z17, boolean z18) {
        o11.g gVar;
        hb5.i iVar = (hb5.i) dVar;
        hb5.g gVar2 = (hb5.g) bVar;
        com.tencent.mm.plugin.fts.ui.n3.a(iVar.f206818y, gVar2.f280191b);
        n11.a b17 = n11.a.b();
        java.lang.String str = iVar.C;
        android.widget.ImageView imageView = gVar2.f280190a;
        java.lang.String str2 = iVar.f206819z;
        this.f280195a.getClass();
        if (str2 == null) {
            gVar = null;
        } else {
            java.util.HashMap hashMap = (java.util.HashMap) hb5.i.G;
            if (!hashMap.containsKey(str2) || hashMap.get(str2) == null) {
                o11.f fVar = new o11.f();
                fVar.f342083g = qk.b.a(str2);
                fVar.f342078b = true;
                fVar.f342095s = true;
                fVar.f342091o = com.tencent.mm.R.raw.default_avatar;
                o11.g a17 = fVar.a();
                hashMap.put(str2, a17);
                gVar = a17;
            } else {
                gVar = (o11.g) hashMap.get(str2);
            }
        }
        b17.h(str, imageView, gVar);
    }
}
