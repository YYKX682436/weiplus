package yh2;

/* loaded from: classes3.dex */
public final class h extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.res.Resources f462385d;

    /* renamed from: e, reason: collision with root package name */
    public final mm2.c1 f462386e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f462387f;

    /* renamed from: g, reason: collision with root package name */
    public final int f462388g;

    /* renamed from: h, reason: collision with root package name */
    public int f462389h;

    /* renamed from: i, reason: collision with root package name */
    public int f462390i;

    /* renamed from: m, reason: collision with root package name */
    public long f462391m;

    /* renamed from: n, reason: collision with root package name */
    public int f462392n;

    /* renamed from: o, reason: collision with root package name */
    public ce2.i f462393o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f462394p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f462395q;

    /* renamed from: r, reason: collision with root package name */
    public yz5.l f462396r;

    /* renamed from: s, reason: collision with root package name */
    public int f462397s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f462398t;

    public h(android.content.res.Resources resources, mm2.c1 liveCommonSlice) {
        kotlin.jvm.internal.o.g(resources, "resources");
        kotlin.jvm.internal.o.g(liveCommonSlice, "liveCommonSlice");
        this.f462385d = resources;
        this.f462386e = liveCommonSlice;
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.tencent.mm.R.dimen.f479681ch);
        this.f462388g = dimensionPixelOffset;
        this.f462389h = dimensionPixelOffset;
        this.f462390i = dimensionPixelOffset;
        this.f462394p = new java.util.ArrayList();
        this.f462395q = new java.util.LinkedList();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f462394p.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return ((yh2.b) this.f462394p.get(i17)).f462368b;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        java.lang.String string;
        yh2.a holder = (yh2.a) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        boolean z17 = holder instanceof yh2.e;
        java.util.ArrayList arrayList = this.f462394p;
        if (z17) {
            yh2.e eVar = (yh2.e) holder;
            java.lang.Object obj = arrayList.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            yh2.b bVar = (yh2.b) obj;
            x(eVar, i17, bVar);
            eVar.itemView.setOnClickListener(new yh2.f(this, bVar));
            return;
        }
        boolean z18 = holder instanceof yh2.c;
        android.content.res.Resources resources = this.f462385d;
        if (z18) {
            yh2.c cVar = (yh2.c) holder;
            cVar.itemView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
            int color = resources.getColor(com.tencent.mm.R.color.f479105q4);
            android.widget.TextView textView = cVar.f462372d;
            textView.setTextColor(color);
            int i18 = ((yh2.b) arrayList.get(i17)).f462369c;
            ((yh2.b) arrayList.get(i17)).getClass();
            textView.setText(resources.getString(com.tencent.mm.R.string.dti, java.lang.Integer.valueOf(i18 + 0)));
            return;
        }
        if (holder instanceof yh2.d) {
            yh2.d dVar = (yh2.d) holder;
            dVar.f462373d.setText(!this.f462387f ? resources.getString(com.tencent.mm.R.string.nsf, java.lang.Integer.valueOf(this.f462392n)) : resources.getString(com.tencent.mm.R.string.nsp, java.lang.Integer.valueOf(this.f462392n)));
            zl2.r4 r4Var = zl2.r4.f473950a;
            boolean t17 = r4Var.t(this.f462386e.f328963d);
            android.widget.TextView textView2 = dVar.f462374e;
            if (t17) {
                if (this.f462393o != null) {
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    objArr[0] = zl2.r4.S(r4Var, this.f462391m, 0, 2, null);
                    ce2.i iVar = this.f462393o;
                    objArr[1] = iVar != null ? iVar.field_name : null;
                    string = resources.getString(com.tencent.mm.R.string.m3a, objArr);
                } else {
                    string = resources.getString(com.tencent.mm.R.string.lj8, this.f462398t ? "" : zl2.r4.S(r4Var, this.f462391m, 0, 2, null));
                }
                textView2.setText(string);
                return;
            }
            kotlin.jvm.internal.o.f(textView2, "<get-tvHeat>(...)");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(textView2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/adapter/FinderLiveMicMemberLinearAdapter", "bindHeader", "(Lcom/tencent/mm/plugin/finder/live/mic/adapter/FinderLiveMicMemberLinearAdapter$MemberHeaderViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(textView2, "com/tencent/mm/plugin/finder/live/mic/adapter/FinderLiveMicMemberLinearAdapter", "bindHeader", "(Lcom/tencent/mm/plugin/finder/live/mic/adapter/FinderLiveMicMemberLinearAdapter$MemberHeaderViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (i17 == 1) {
            android.view.View inflate = android.view.View.inflate(parent.getContext(), com.tencent.mm.R.layout.dem, null);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            return new yh2.d(this, inflate);
        }
        if (i17 == 3) {
            android.view.View inflate2 = android.view.View.inflate(parent.getContext(), com.tencent.mm.R.layout.f488926dev, null);
            kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
            return new yh2.c(this, inflate2);
        }
        android.view.View inflate3 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.dew, parent, false);
        kotlin.jvm.internal.o.f(inflate3, "inflate(...)");
        return new yh2.e(inflate3);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0454 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(yh2.e r32, int r33, yh2.b r34) {
        /*
            Method dump skipped, instructions count: 1468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yh2.h.x(yh2.e, int, yh2.b):void");
    }
}
