package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class o70 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f135436d;

    /* renamed from: e, reason: collision with root package name */
    public final int f135437e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f135438f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f135439g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f135440h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o70(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f135436d = new java.util.HashMap();
        this.f135437e = Q6();
    }

    public static final java.lang.String O6(com.tencent.mm.plugin.finder.viewmodel.component.o70 o70Var, java.lang.String str, android.graphics.Paint paint, int i17) {
        o70Var.getClass();
        java.lang.String str2 = "";
        if ((str.length() == 0) || paint == null || paint.getTextSize() <= 0.0f || i17 <= 0) {
            return "";
        }
        int length = str.length();
        int i18 = 0;
        int i19 = 0;
        while (i18 < length) {
            i19 = ((i18 + length) + 1) / 2;
            str2 = str.substring(0, i19);
            kotlin.jvm.internal.o.f(str2, "substring(...)");
            float measureText = paint.measureText(str2);
            float f17 = i17;
            if (measureText < f17) {
                i18 = i19;
            } else if (measureText > f17) {
                length = i19 - 1;
            } else {
                length = i19;
                i18 = length;
            }
        }
        if (i18 == i19) {
            return str2;
        }
        java.lang.String substring = str.substring(0, i18);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        return substring;
    }

    public final java.lang.String P6(long j17) {
        com.tencent.mm.plugin.finder.viewmodel.component.n70 n70Var = (com.tencent.mm.plugin.finder.viewmodel.component.n70) this.f135436d.get(java.lang.Long.valueOf(j17));
        java.util.List list = n70Var != null ? n70Var.f135275k : null;
        if (list == null || list.isEmpty()) {
            return "30000";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r45.ch7 a17 = r45.ch7.a(((r45.ay2) it.next()).getInteger(0));
            java.lang.String obj = a17 != null ? a17.toString() : null;
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        java.lang.String g07 = kz5.n0.g0(arrayList, "#", null, null, 0, null, null, 62, null);
        java.lang.String str = g07.length() > 0 ? g07 : null;
        return str == null ? "30000" : str;
    }

    public final int Q6() {
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(getContext());
        return a17.f197135a - (getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9) * 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x01a5 A[LOOP:1: B:67:0x0173->B:77:0x01a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ab A[EDGE_INSN: B:78:0x01ab->B:79:0x01ab BREAK  A[LOOP:1: B:67:0x0173->B:77:0x01a5], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R6(long r35, int r37) {
        /*
            Method dump skipped, instructions count: 1158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.o70.R6(long, int):void");
    }

    public final void S6(in5.s0 s0Var, boolean z17) {
        android.view.View view;
        com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout X6;
        if (s0Var == null) {
            com.tencent.mars.xlog.Log.i("FinderSubtitleUIC", "resetContainer holder is null");
            this.f135438f = null;
        }
        if (z17) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar = (com.tencent.mm.plugin.finder.viewmodel.component.pt) pf5.z.f353948a.a(activity).e(com.tencent.mm.plugin.finder.viewmodel.component.pt.class);
            if (ptVar == null || (X6 = ptVar.X6()) == null) {
                this.f135438f = null;
                com.tencent.mars.xlog.Log.i("FinderSubtitleUIC", "resetContainer find container error");
            } else {
                this.f135438f = X6.findViewById(com.tencent.mm.R.id.tvl);
            }
        } else {
            this.f135438f = (s0Var == null || (view = s0Var.itemView) == null) ? null : view.findViewById(com.tencent.mm.R.id.tvl);
        }
        android.view.View view2 = this.f135438f;
        this.f135439g = view2 != null ? (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.tvm) : null;
        android.view.View view3 = this.f135438f;
        this.f135440h = view3 != null ? (android.widget.TextView) view3.findViewById(com.tencent.mm.R.id.tvn) : null;
    }

    public final void T6(long j17, java.util.List languages) {
        kotlin.jvm.internal.o.g(languages, "languages");
        com.tencent.mm.plugin.finder.viewmodel.component.n70 n70Var = (com.tencent.mm.plugin.finder.viewmodel.component.n70) this.f135436d.get(java.lang.Long.valueOf(j17));
        if (n70Var != null) {
            n70Var.f135275k = languages;
            int size = languages.size();
            com.tencent.mm.plugin.finder.viewmodel.component.o70 o70Var = n70Var.f135277m;
            if (size == 0) {
                db5.t7.h(o70Var.getContext(), o70Var.getString(com.tencent.mm.R.string.o27));
            } else {
                db5.t7.h(o70Var.getContext(), o70Var.getString(com.tencent.mm.R.string.f492094o26));
            }
            n70Var.e((r45.by2) kz5.n0.a0(n70Var.f135273i, n70Var.f135274j));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o70(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f135436d = new java.util.HashMap();
        this.f135437e = Q6();
    }
}
