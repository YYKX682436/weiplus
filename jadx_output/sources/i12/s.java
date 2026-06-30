package i12;

/* loaded from: classes15.dex */
public class s extends j12.b {

    /* renamed from: i, reason: collision with root package name */
    public final android.content.Context f287235i;

    /* renamed from: m, reason: collision with root package name */
    public final int f287236m;

    /* renamed from: n, reason: collision with root package name */
    public int f287237n;

    /* renamed from: o, reason: collision with root package name */
    public final int f287238o;

    /* renamed from: p, reason: collision with root package name */
    public final int f287239p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f287240q;

    /* renamed from: r, reason: collision with root package name */
    public i12.q f287241r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.HashMap f287242s;

    public s(android.content.Context context, boolean z17) {
        super(context);
        this.f287236m = 3;
        this.f287237n = 0;
        this.f287235i = context;
        this.f287240q = z17;
        context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.i_);
        this.f287238o = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479567j);
        this.f287239p = (int) ((i65.a.B(context) - (context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480360vn) * 3)) / (3 + 1.0f));
    }

    @Override // j12.b
    public int c() {
        return 0;
    }

    @Override // j12.b
    public int f() {
        return this.f287237n;
    }

    @Override // j12.b
    public boolean g(int i17) {
        return false;
    }

    @Override // j12.b, android.widget.Adapter
    public int getCount() {
        double ceil;
        boolean z17 = this.f287240q;
        int i17 = this.f287236m;
        if (!z17) {
            if (t() <= this.f287237n) {
                return 0;
            }
            return (int) java.lang.Math.ceil((r0 - r3) / i17);
        }
        int i18 = this.f287237n;
        if (i18 == 0) {
            return 0;
        }
        if (i18 > 0) {
            if (t() > this.f287237n) {
                ceil = java.lang.Math.ceil(r1 / i17);
                return (int) ceil;
            }
        }
        ceil = java.lang.Math.ceil(t() / i17);
        return (int) ceil;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.widget.LinearLayout, android.view.View] */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // j12.b, android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        ?? linearLayout;
        i12.r rVar;
        int i18 = this.f287236m;
        android.content.Context context = this.f287235i;
        if (view == null || view.getTag() == null) {
            linearLayout = new android.widget.LinearLayout(context);
            android.widget.AbsListView.LayoutParams layoutParams = new android.widget.AbsListView.LayoutParams(-1, -2);
            linearLayout.setBackgroundResource(com.tencent.mm.R.drawable.f482190b84);
            linearLayout.setOrientation(0);
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setPadding(0, 0, 0, this.f287238o);
            rVar = new i12.r(this);
            rVar.f287234a = linearLayout;
            linearLayout.setTag(rVar);
            for (int i19 = 0; i19 < i18; i19++) {
                android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -2);
                layoutParams2.leftMargin = this.f287239p;
                rVar.f287234a.addView(new i12.d(context, com.tencent.mm.R.layout.a7x).f287202b, i19, layoutParams2);
            }
        } else {
            rVar = (i12.r) view.getTag();
            linearLayout = view;
        }
        for (int i27 = 0; i27 < i18; i27++) {
            int i28 = (this.f287240q ? i17 * i18 : (i17 * i18) + this.f287237n) + i27;
            android.view.View childAt = rVar.f287234a.getChildAt(i27);
            i12.d dVar = new i12.d(context, childAt);
            childAt.setOnClickListener(new i12.p(this, dVar, i28));
            j12.i item = getItem(i28);
            if (i28 > t() - 1 || item == null) {
                childAt.setClickable(false);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV2PersonAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(childAt, "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV2PersonAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                dVar.f287205e.setBackgroundDrawable(null);
            } else {
                if (this.f287242s == null) {
                    this.f287242s = new java.util.HashMap();
                }
                if (this.f287242s.containsValue(dVar)) {
                    this.f287242s.remove(dVar.f287201a);
                }
                dVar.f287201a = d(item);
                this.f287242s.put(d(item), dVar);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(childAt, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV2PersonAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(childAt, "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV2PersonAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                dVar.f287204d.setText(item.f297167b.f392130f);
                n11.a b17 = n11.a.b();
                r45.zj0 zj0Var = item.f297167b;
                java.lang.String str = zj0Var.f392129e;
                b17.h(str, dVar.f287203c, y12.f.b(zj0Var.f392128d, str));
                dVar.f287205e.setBackgroundResource(com.tencent.mm.R.drawable.emoji_grid_item_fg);
                childAt.setClickable(true);
                u(dVar, item.f297171f);
            }
        }
        return linearLayout;
    }

    @Override // j12.b
    public android.view.View j(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        return null;
    }

    @Override // j12.b
    public int k() {
        return 0;
    }

    @Override // j12.b
    public i12.c l(android.content.Context context, android.view.View view) {
        return null;
    }

    @Override // j12.b
    public void o(int i17) {
    }

    @Override // j12.b
    public void p(int i17) {
        this.f287237n = i17;
    }

    @Override // j12.b
    public void q(int i17) {
    }

    @Override // j12.b
    public void s(java.lang.String str, int i17) {
        java.util.HashMap hashMap = this.f287242s;
        if (hashMap == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiStoreV2PersonAdapter", "updateStatus mCacheHolder is nulll.");
            return;
        }
        i12.d dVar = (i12.d) hashMap.get(str);
        j12.i g17 = this.f297152e.g(str);
        if (g17 != null) {
            n(g17, str, i17);
        }
        if (g17 != null && this.f297152e != null && g17.f297171f == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreV2PersonAdapter", "force refresh status");
            j12.f fVar = this.f297152e;
            boolean z17 = fVar.f297161g;
            com.tencent.mm.storage.f5 f5Var = (com.tencent.mm.storage.f5) fVar.f297159e.get(str);
            java.util.HashMap hashMap2 = this.f297152e.f297160f;
            g17.b(z17, f5Var, hashMap2 == null ? false : hashMap2.containsKey(str));
        }
        if (dVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiStoreV2PersonAdapter", "updateStatus viewHolder is nulll.");
        } else {
            u(dVar, i17);
        }
    }

    public int t() {
        if (!this.f287240q) {
            return super.getCount();
        }
        int i17 = this.f287237n;
        if (i17 == 0) {
            return 0;
        }
        if (i17 > 0) {
            int count = super.getCount();
            int i18 = this.f287237n;
            if (count > i18) {
                return i18;
            }
        }
        return super.getCount();
    }

    public final void u(i12.d dVar, int i17) {
        android.content.Context context = this.f297151d;
        if (i17 != 7) {
            dVar.f287204d.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a0c));
            dVar.f287204d.setCompoundDrawables(null, null, null, null);
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiStoreV2PersonAdapter", "unknow product status:%d", java.lang.Integer.valueOf(i17));
        } else {
            dVar.f287204d.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.t_));
            android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.tencent.mm.R.raw.emoji_download_finish);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            dVar.f287204d.setCompoundDrawables(null, null, drawable, null);
        }
    }
}
