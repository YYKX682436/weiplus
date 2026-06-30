package ti2;

/* loaded from: classes10.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ti2.o f419566d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f419567e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ km2.q f419568f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f419569g;

    public m(ti2.o oVar, int i17, km2.q qVar, yz5.a aVar) {
        this.f419566d = oVar;
        this.f419567e = i17;
        this.f419568f = qVar;
        this.f419569g = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.List list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/pk/convert/MicVisitorLinkUserConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ti2.o oVar = this.f419566d;
        int i17 = this.f419567e;
        km2.q qVar = this.f419568f;
        gk2.e eVar = oVar.f419574e;
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
            com.tencent.mars.xlog.Log.i(oVar.f419576g, "onHungupLinkUser pos: " + i17 + " nick: " + qVar.f309173d);
            si2.c cVar = oVar.f419575f;
            if (cVar != null) {
                cVar.b(i17, qVar);
            }
        } else {
            com.tencent.mars.xlog.Log.i(oVar.f419576g, "onAcceptLinkUser pos: " + i17 + " nick: " + qVar.f309173d);
            si2.c cVar2 = oVar.f419575f;
            if (cVar2 != null) {
                cVar2.c(i17, qVar);
            }
        }
        if (this.f419568f.m()) {
            this.f419569g.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pk/convert/MicVisitorLinkUserConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
