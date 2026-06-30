package f62;

/* loaded from: classes15.dex */
public final class a implements yj0.d {
    @Override // yj0.d
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object obj2) {
    }

    @Override // yj0.d
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object[] objArr) {
        if (objArr == null) {
            return;
        }
        if (objArr.length == 0) {
            return;
        }
        java.lang.Object obj2 = objArr[0];
        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) obj2).intValue();
        f62.b.f259845a = 10 == intValue;
        f62.b.f259847c = Integer.MAX_VALUE == intValue;
        r45.a07 a07Var = new r45.a07();
        a07Var.f369601d = java.lang.String.valueOf(intValue);
        a07Var.f369609o = java.lang.System.currentTimeMillis();
        a07Var.f369602e = a07Var.f369601d;
        a07Var.f369603f = "MMPopupWindow$PopupViewContainer";
        a07Var.f369605h = "MMPopupWindow$PopupViewContainer";
        k52.g gVar = k52.g.f304294e;
        a07Var.f369606i = 1;
        a07Var.f369615u = 0;
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.SubMenuMonitor", "SubMenuMonitor, viewCallback:\nid=" + a07Var.f369601d + "\ntimestamp=" + a07Var.f369609o + "\neventId=" + a07Var.f369606i);
        java.util.Map map = k52.l.f304310a;
        k52.l.f304314e.a(null, a07Var);
    }
}
