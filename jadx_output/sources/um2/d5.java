package um2;

/* loaded from: classes3.dex */
public final class d5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f428766e;

    public d5(um2.x5 x5Var, java.lang.Integer num) {
        this.f428765d = x5Var;
        this.f428766e = num;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.Object obj;
        fm2.c cVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/state/visitor/FinderLiveVisitorLivingUIC$onStatusChanged$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.List list = ((mm2.o4) this.f428765d.c(mm2.o4.class)).f329327v;
        kotlin.jvm.internal.o.f(list, "<get-audienceLinkMicUserList>(...)");
        um2.x5 x5Var = this.f428765d;
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (com.tencent.mm.sdk.platformtools.t8.D0(((km2.q) obj).f309170a, ((mm2.c1) x5Var.c(mm2.c1.class)).m8())) {
                        break;
                    }
                }
            }
        }
        boolean z17 = obj != null;
        if (z17) {
            um2.x5 x5Var2 = this.f428765d;
            androidx.appcompat.app.AppCompatActivity appCompatActivity = x5Var2.f19605b;
            if ((appCompatActivity instanceof android.app.Activity) && (cVar = x5Var2.f19606c) != null) {
                kotlin.jvm.internal.o.e(appCompatActivity, "null cannot be cast to non-null type android.app.Activity");
                cVar.showAlertDialog(appCompatActivity, "", this.f428765d.f19605b.getResources().getString(com.tencent.mm.R.string.eij), "");
            }
        } else {
            dk2.xf h17 = this.f428765d.h();
            if (h17 != null) {
                androidx.appcompat.app.AppCompatActivity appCompatActivity2 = this.f428765d.f19605b;
                kotlin.jvm.internal.o.e(appCompatActivity2, "null cannot be cast to non-null type android.app.Activity");
                ((dk2.r4) h17).r(appCompatActivity2, false);
            }
        }
        com.tencent.mars.xlog.Log.i(this.f428765d.f429032f, "scene:" + this.f428766e + ", click ok linking:" + z17);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/state/visitor/FinderLiveVisitorLivingUIC$onStatusChanged$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
