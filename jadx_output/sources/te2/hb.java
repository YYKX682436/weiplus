package te2;

/* loaded from: classes3.dex */
public final class hb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.hc f418067d;

    public hb(te2.hc hcVar) {
        this.f418067d = hcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.l94 b17;
        bw5.x7 x7Var;
        java.lang.String string;
        r45.ov2 a17;
        java.lang.String str;
        java.lang.String string2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorNoticeQRCodeUIC$mBindItemButton$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        te2.hc hcVar = this.f418067d;
        r45.h32 h32Var = hcVar.f418068J;
        java.lang.String str2 = "";
        if (h32Var != null && (a17 = zl2.t.a(h32Var)) != null) {
            java.lang.String string3 = a17.getString(1);
            if (string3 != null) {
                java.lang.String str3 = hcVar.M;
                if (str3 == null) {
                    kotlin.jvm.internal.o.o(dm.i4.COL_USERNAME);
                    throw null;
                }
                r45.h32 h32Var2 = hcVar.f418068J;
                java.lang.String str4 = (h32Var2 == null || (string2 = h32Var2.getString(4)) == null) ? "" : string2;
                te2.va vaVar = new te2.va(hcVar);
                i95.m c17 = i95.n0.c(s40.w0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                java.lang.String e17 = xy2.c.e(hcVar.getContext());
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(string3);
                s40.w0.Fa((s40.w0) c17, 0L, 0L, str3, e17, null, linkedList, str4, hcVar.getActivity(), false, vaVar, 256, null);
            }
            zl2.g gVar = zl2.g.f473770a;
            java.lang.String string4 = a17.getString(1);
            if (string4 == null) {
                string4 = "";
            }
            r45.h32 h32Var3 = hcVar.f418068J;
            if (h32Var3 == null || (str = h32Var3.getString(4)) == null) {
                str = "";
            }
            gVar.b(string4, str, 3);
        }
        r45.h32 h32Var4 = hcVar.f418068J;
        if (h32Var4 != null && (b17 = zl2.t.b(h32Var4)) != null && (x7Var = (bw5.x7) b17.getCustom(2)) != null) {
            i95.m c18 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c18;
            ml2.t1 t1Var = ml2.t1.f327998w3;
            jz5.l[] lVarArr = new jz5.l[1];
            r45.h32 h32Var5 = hcVar.f418068J;
            if (h32Var5 != null && (string = h32Var5.getString(4)) != null) {
                str2 = string;
            }
            lVarArr[0] = new jz5.l("noticeid", str2);
            java.util.Map l17 = kz5.c1.l(lVarArr);
            java.lang.String str5 = hcVar.M;
            if (str5 == null) {
                kotlin.jvm.internal.o.o(dm.i4.COL_USERNAME);
                throw null;
            }
            zy2.zb.T8(zbVar, t1Var, l17, null, "200", null, str5, false, 84, null);
            pq.a aVar = new pq.a(hcVar.getContext());
            i95.m c19 = i95.n0.c(pq.q.class);
            kotlin.jvm.internal.o.f(c19, "getService(...)");
            pq.q.Lb((pq.q) c19, aVar, x7Var, null, 4, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorNoticeQRCodeUIC$mBindItemButton$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
