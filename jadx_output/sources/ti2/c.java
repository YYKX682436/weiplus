package ti2;

/* loaded from: classes8.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ti2.d f419544d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vi2.e f419545e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f419546f;

    public c(ti2.d dVar, android.view.ViewGroup viewGroup, vi2.e eVar, int i17) {
        this.f419544d = dVar;
        this.f419545e = eVar;
        this.f419546f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.List list;
        java.lang.Object obj;
        jz5.f0 f0Var;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/pk/convert/AnchorMicApplyConvert$onBindViewHolder$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gk2.e eVar = this.f419544d.f419547e;
        jz5.f0 f0Var2 = null;
        if (eVar != null && (list = ((mm2.o4) eVar.a(mm2.o4.class)).f329319p) != null) {
            vi2.e eVar2 = this.f419545e;
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    java.lang.String str = ((km2.q) obj).f309172c;
                    r45.xn1 xn1Var = eVar2.f437544d;
                    if (kotlin.jvm.internal.o.b(str, (xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact.getUsername())) {
                        break;
                    }
                }
            }
            km2.q qVar = (km2.q) obj;
            if (qVar != null) {
                ti2.d dVar = this.f419544d;
                int i17 = this.f419546f;
                vi2.e eVar3 = this.f419545e;
                if (qVar.m()) {
                    si2.a aVar = dVar.f419548f;
                    if (aVar != null) {
                        aVar.f(i17, eVar3.f437544d);
                        f0Var = jz5.f0.f302826a;
                        f0Var2 = f0Var;
                    }
                } else {
                    si2.a aVar2 = dVar.f419548f;
                    if (aVar2 != null) {
                        aVar2.e(i17, eVar3.f437544d);
                        f0Var = jz5.f0.f302826a;
                        f0Var2 = f0Var;
                    }
                }
            }
        }
        if (f0Var2 == null) {
            ti2.d dVar2 = this.f419544d;
            int i18 = this.f419546f;
            vi2.e eVar4 = this.f419545e;
            si2.a aVar3 = dVar2.f419548f;
            if (aVar3 != null) {
                aVar3.e(i18, eVar4.f437544d);
            }
            com.tencent.mars.xlog.Log.i("AnchorMicApplyConvert", "user is null");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pk/convert/AnchorMicApplyConvert$onBindViewHolder$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
