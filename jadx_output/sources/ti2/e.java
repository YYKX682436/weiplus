package ti2;

/* loaded from: classes10.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ti2.g f419549d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f419550e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ km2.q f419551f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f419552g;

    public e(ti2.g gVar, int i17, km2.q qVar, yz5.a aVar) {
        this.f419549d = gVar;
        this.f419550e = i17;
        this.f419551f = qVar;
        this.f419552g = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.List list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/pk/convert/AnchorPayMicAudienceConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ti2.g gVar = this.f419549d;
        int i17 = this.f419550e;
        km2.q qVar = this.f419551f;
        gk2.e eVar = gVar.f419557e;
        java.lang.Object obj = null;
        if (eVar != null && (list = ((mm2.o4) eVar.a(mm2.o4.class)).f329327v) != null) {
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (com.tencent.mm.sdk.platformtools.t8.D0(((km2.q) next).f309170a, qVar.f309170a)) {
                        obj = next;
                        break;
                    }
                }
            }
            obj = (km2.q) obj;
        }
        if (obj != null) {
            com.tencent.mars.xlog.Log.i("AnchorPayMicAudienceCon", "onHungupLinkUser pos: " + i17 + " nick: " + qVar.f309173d);
            si2.c cVar = gVar.f419558f;
            if (cVar != null) {
                cVar.b(i17, qVar);
            }
        } else {
            com.tencent.mars.xlog.Log.i("AnchorPayMicAudienceCon", "onAcceptLinkUser pos: " + i17 + " nick: " + qVar.f309173d);
            si2.c cVar2 = gVar.f419558f;
            if (cVar2 != null) {
                cVar2.c(i17, qVar);
            }
        }
        if (this.f419551f.m()) {
            this.f419552g.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pk/convert/AnchorPayMicAudienceConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
