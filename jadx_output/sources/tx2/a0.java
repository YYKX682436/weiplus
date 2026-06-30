package tx2;

/* loaded from: classes3.dex */
public final class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tx2.i0 f422531d;

    public a0(tx2.i0 i0Var) {
        this.f422531d = i0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        r45.l94 b17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/notice/NoticeBigCardWidget$refreshBindSingleProductView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tx2.i0 i0Var = this.f422531d;
        i0Var.getClass();
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.t1 t1Var = ml2.t1.f327995v3;
        jz5.l[] lVarArr = new jz5.l[1];
        r45.h32 h32Var = i0Var.C;
        if (h32Var == null || (str = h32Var.getString(4)) == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("noticeid", str);
        java.util.Map l17 = kz5.c1.l(lVarArr);
        android.content.Context context = i0Var.f118381d;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        zy2.zb.T8(zbVar, t1Var, l17, null, java.lang.String.valueOf(((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6().getInteger(5)), null, i0Var.D, false, 84, null);
        r45.h32 h32Var2 = i0Var.C;
        if (h32Var2 != null && (b17 = zl2.t.b(h32Var2)) != null) {
            java.util.LinkedList list = b17.getList(0);
            kotlin.jvm.internal.o.f(list, "getProducts(...)");
            r45.k94 k94Var = (r45.k94) kz5.n0.Z(list);
            if (k94Var != null) {
                new dk2.ac((r45.bd5) k94Var.getCustom(6), k94Var.getLong(0), i0Var.f118381d, null, r45.ya2.SUBSCRIBE_SCENE_LIVE_NOTICE, new tx2.u(k94Var, b17, i0Var)).b();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/notice/NoticeBigCardWidget$refreshBindSingleProductView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
