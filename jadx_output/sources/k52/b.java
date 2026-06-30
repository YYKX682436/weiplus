package k52;

/* loaded from: classes15.dex */
public final class b implements yj0.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k52.c f304283a;

    public b(k52.c cVar) {
        this.f304283a = cVar;
    }

    @Override // yj0.d
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object obj2) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // yj0.d
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object[] objArr) {
        java.lang.String r17;
        k52.f fVar;
        if (objArr != null) {
            if (!(objArr.length == 0) && (obj instanceof android.view.View)) {
                k52.p pVar = k52.q.f304326a;
                android.view.View view = (android.view.View) obj;
                java.lang.String b17 = pVar.b(view);
                if (b17 == null) {
                    k52.c.f304284e = false;
                    return;
                }
                if (view.getId() == -1) {
                    b17 = pVar.c(view);
                }
                if (view.getId() == -1) {
                    r17 = b17;
                } else {
                    r17 = b52.b.r(view.getId());
                    kotlin.jvm.internal.o.f(r17, "toHexString(...)");
                }
                java.lang.String name = obj.getClass().getName();
                k52.c cVar = this.f304283a;
                cVar.getClass();
                r45.a07 a07Var = new r45.a07();
                a07Var.f369602e = b17;
                a07Var.f369601d = r17;
                a07Var.f369609o = java.lang.System.currentTimeMillis();
                java.lang.String g17 = b52.b.g(name);
                a07Var.f369603f = g17;
                a07Var.f369605h = g17;
                if (str2 != null) {
                    switch (str2.hashCode()) {
                        case -1263341865:
                            if (str2.equals("onSingleTapUp")) {
                                k52.g gVar = k52.g.f304294e;
                                a07Var.f369606i = 1;
                                break;
                            }
                            break;
                        case -1236836200:
                            if (str2.equals("onContextClick")) {
                                k52.g gVar2 = k52.g.f304294e;
                                a07Var.f369606i = 1;
                                break;
                            }
                            break;
                        case -836949261:
                            if (str2.equals("onDoubleTap")) {
                                k52.g gVar3 = k52.g.f304294e;
                                a07Var.f369606i = 3;
                                break;
                            }
                            break;
                        case 83417096:
                            if (str2.equals(if1.m.NAME)) {
                                k52.g gVar4 = k52.g.f304294e;
                                a07Var.f369606i = 2;
                                break;
                            }
                            break;
                    }
                    if (a07Var.f369606i != -1 || (fVar = cVar.f304285a) == null) {
                        return;
                    }
                    ((k52.j) fVar).a(null, a07Var);
                    return;
                }
                k52.g gVar5 = k52.g.f304294e;
                a07Var.f369606i = -1;
                if (a07Var.f369606i != -1) {
                    return;
                } else {
                    return;
                }
            }
        }
        k52.c.f304284e = false;
    }
}
