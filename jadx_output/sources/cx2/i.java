package cx2;

/* loaded from: classes9.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f224539a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.dialog.i0 f224540b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f224541c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f224542d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.content.DialogInterface.OnDismissListener f224543e;

    public i(android.content.Context context) {
        this.f224539a = context;
        com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(context);
        this.f224540b = i0Var;
        com.tencent.mm.ui.widget.dialog.a aVar = i0Var.f211821b;
        aVar.A = false;
        aVar.B = false;
        aVar.f211725o = new cx2.h(this);
    }

    public cx2.i a(com.tencent.mm.ui.widget.dialog.j jVar) {
        com.tencent.mm.ui.widget.dialog.j0 a17 = this.f224540b.a();
        this.f224541c = a17;
        android.content.DialogInterface.OnDismissListener onDismissListener = this.f224543e;
        if (onDismissListener != null) {
            a17.setOnDismissListener(onDismissListener);
        }
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f224541c;
        java.lang.String str = this.f224542d;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        android.content.Context context = this.f224539a;
        if (K0 || str.length() == 0) {
            str = context.getResources().getString(com.tencent.mm.R.string.f490941bb3);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(null)) {
            throw null;
        }
        java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.f490347sg);
        j0Var.A(str, true, new cx2.f(j0Var, jVar));
        j0Var.w(string, true, new cx2.g(j0Var, jVar));
        return this;
    }

    public cx2.i b(java.lang.Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        com.tencent.mm.ui.widget.dialog.i0 i0Var = this.f224540b;
        i0Var.f211821b.f211716f = booleanValue;
        if (bool.booleanValue()) {
            i0Var.f211821b.f211714d = this.f224539a.getString(com.tencent.mm.R.string.f490938bb0);
        }
        return this;
    }

    public cx2.i c(java.lang.Object obj) {
        com.tencent.mm.ui.widget.dialog.i0 i0Var = this.f224540b;
        if (obj != null) {
            java.util.List<java.lang.String> P1 = obj instanceof java.lang.String ? com.tencent.mm.sdk.platformtools.t8.P1(((java.lang.String) obj).split(",")) : obj instanceof java.util.List ? (java.util.List) obj : null;
            if (!com.tencent.mm.sdk.platformtools.t8.L0(P1)) {
                int size = P1.size();
                android.content.Context context = this.f224539a;
                if (size == 1) {
                    java.lang.String str = (java.lang.String) P1.get(0);
                    i65.a.b(context, (int) (i65.a.q(context) * 20.0f));
                    android.text.SpannableString Ai = ((h12.b) ((k12.r) i95.n0.c(k12.r.class))).Ai(context, context.getString(com.tencent.mm.R.string.i27).toString());
                    com.tencent.mm.ui.widget.dialog.a aVar = i0Var.f211821b;
                    aVar.f211709a = Ai;
                    aVar.S = 3;
                    ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                    java.lang.String e17 = c01.a2.e(str);
                    i65.a.b(context, (int) (i65.a.q(context) * 14.0f));
                    if (com.tencent.mm.storage.z3.R4(str)) {
                        ((c01.w1) ((rv1.e) i95.n0.c(rv1.e.class))).getClass();
                        android.text.SpannableString Ai2 = ((h12.b) ((k12.r) i95.n0.c(k12.r.class))).Ai(context, (e17 + context.getString(com.tencent.mm.R.string.ifs, java.lang.Integer.valueOf(c01.v1.o(str)))).toString());
                        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.a48, (android.view.ViewGroup) null);
                        android.widget.GridView gridView = (android.widget.GridView) inflate.findViewById(com.tencent.mm.R.id.bgk);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        ((c01.w1) ((rv1.e) i95.n0.c(rv1.e.class))).getClass();
                        java.util.List m17 = c01.v1.m(str);
                        i0Var.c(str, Ai2, java.lang.Boolean.TRUE, new cx2.a(inflate, arrayList, str, m17), new cx2.b());
                        cx2.d dVar = new cx2.d(i0Var, context, str);
                        com.tencent.mm.ui.widget.dialog.a aVar2 = i0Var.f211821b;
                        aVar2.f211723m = dVar;
                        gridView.setAdapter((android.widget.ListAdapter) new cx2.m(context, m17, arrayList));
                        gridView.setSelector(new android.graphics.drawable.ColorDrawable(context.getResources().getColor(com.tencent.mm.R.color.a9e)));
                        if (m17 != null) {
                            if (((java.util.LinkedList) m17).size() > 16) {
                                gridView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, i65.a.h(context, com.tencent.mm.R.dimen.f479635ba)));
                                gridView.setPadding(i65.a.h(context, com.tencent.mm.R.dimen.f479632b7), 0, i65.a.h(context, com.tencent.mm.R.dimen.f479632b7), 0);
                            } else {
                                gridView.setPadding(0, 0, 0, i65.a.h(context, com.tencent.mm.R.dimen.f479629b4));
                            }
                        }
                        aVar2.N = inflate;
                    } else {
                        i0Var.c(str, ((h12.b) ((k12.r) i95.n0.c(k12.r.class))).Ai(context, e17.toString()), java.lang.Boolean.FALSE, null, new cx2.e());
                    }
                } else {
                    android.view.View inflate2 = android.view.View.inflate(context, com.tencent.mm.R.layout.a09, null);
                    int i17 = 0;
                    for (java.lang.String str2 : P1) {
                        if (i17 <= 8 && inflate2 != null) {
                            android.widget.ImageView imageView = (android.widget.ImageView) inflate2.findViewById(cx2.j.f224544a[i17]);
                            if (str2 != null) {
                                imageView.setVisibility(0);
                                ng5.a.a(imageView, str2);
                                i17++;
                            }
                        }
                    }
                    i0Var.f211821b.M = inflate2;
                    java.lang.String string = context.getString(com.tencent.mm.R.string.h0p);
                    com.tencent.mm.ui.widget.dialog.a aVar3 = i0Var.f211821b;
                    aVar3.f211709a = string;
                    aVar3.S = 3;
                }
            }
        }
        i0Var.f211821b.C = true;
        return this;
    }
}
