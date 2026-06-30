package com.tencent.mm.plugin.multitalk.ui.widget.avatar_view;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010$\u001a\u00020#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R.\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR4\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010\"\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u001b¨\u0006)"}, d2 = {"Lcom/tencent/mm/plugin/multitalk/ui/widget/avatar_view/MultiTalkAvatarLayout;", "Landroid/widget/FrameLayout;", "", "visibility", "Ljz5/f0;", "setVisibility", "Ltj3/x;", "value", "f", "Ltj3/x;", "getLayoutAdapter", "()Ltj3/x;", "setLayoutAdapter", "(Ltj3/x;)V", "layoutAdapter", "Lkotlin/Function2;", "", "g", "Lyz5/p;", "getOnMaxYChanged", "()Lyz5/p;", "setOnMaxYChanged", "(Lyz5/p;)V", "onMaxYChanged", "n", "I", "getBottomPanelHeight", "()I", "setBottomPanelHeight", "(I)V", "bottomPanelHeight", "o", "Ljz5/g;", "getScreenHeight", "screenHeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-multitalk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class MultiTalkAvatarLayout extends android.widget.FrameLayout {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f150362q = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.util.ArrayMap f150363d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.HashSet f150364e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public tj3.x layoutAdapter;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public yz5.p onMaxYChanged;

    /* renamed from: h, reason: collision with root package name */
    public int f150367h;

    /* renamed from: i, reason: collision with root package name */
    public int f150368i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f150369m;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public int bottomPanelHeight;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final jz5.g screenHeight;

    /* renamed from: p, reason: collision with root package name */
    public int f150372p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiTalkAvatarLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f150363d = new android.util.ArrayMap();
        this.f150364e = new java.util.HashSet();
        this.onMaxYChanged = tj3.t.f419798d;
        this.f150367h = -1;
        this.f150368i = -1;
        this.screenHeight = jz5.h.b(new tj3.u(context));
    }

    private final int getScreenHeight() {
        return ((java.lang.Number) ((jz5.n) this.screenHeight).getValue()).intValue();
    }

    public final void a() {
        if (getVisibility() == 8) {
            return;
        }
        if (getMeasuredWidth() > 0) {
            c();
        } else {
            requestLayout();
            post(new tj3.r(this));
        }
    }

    public final void b(tj3.p pVar) {
        int i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkAvatarLayout", "innerSelectUser: " + pVar.f419788g);
        int i18 = pVar.f419790i;
        if (this.f150367h != i18) {
            this.f150369m = pVar.f419788g.f150297b;
            i17 = i18;
        } else {
            this.f150369m = null;
            i17 = -1;
        }
        this.f150367h = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkAvatarLayout", "addView on avatar click: click " + pVar.f419788g.f150297b + ", idx: " + i18);
        tj3.x xVar = this.layoutAdapter;
        if (xVar != null) {
            xVar.a(this.f150364e, this.f150369m);
        }
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 1498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.multitalk.ui.widget.avatar_view.MultiTalkAvatarLayout.c():void");
    }

    public final void d(boolean z17) {
        java.util.List list;
        java.lang.Object obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkAvatarLayout", "refreshLayout: forceUpdate " + z17);
        tj3.x xVar = this.layoutAdapter;
        if (xVar == null || (list = xVar.f419805d) == null) {
            return;
        }
        android.util.ArrayMap arrayMap = this.f150363d;
        java.util.ArrayList arrayList = new java.util.ArrayList(arrayMap.size());
        java.util.Iterator it = arrayMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(((tj3.p) ((java.util.Map.Entry) it.next()).getValue()).f419788g);
        }
        if (!android.text.TextUtils.isEmpty(this.f150369m)) {
            java.util.Iterator it6 = list.iterator();
            while (true) {
                if (it6.hasNext()) {
                    obj = it6.next();
                    if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.multitalk.ui.t) obj).f150297b, this.f150369m)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (((com.tencent.mm.plugin.multitalk.ui.t) obj) == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkAvatarLayout", "refreshLayout: current chosen user quit talking");
                this.f150367h = -1;
                this.f150369m = null;
            }
        }
        java.util.List<com.tencent.mm.plugin.multitalk.ui.t> q07 = !z17 ? kz5.n0.q0(list, kz5.n0.X0(arrayList)) : list;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            arrayList2.add(((com.tencent.mm.plugin.multitalk.ui.t) it7.next()).f150297b);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList3.add(((com.tencent.mm.plugin.multitalk.ui.t) it8.next()).f150297b);
        }
        java.util.Iterator it9 = kz5.n0.q0(arrayList2, kz5.n0.X0(arrayList3)).iterator();
        int i17 = 0;
        boolean z18 = false;
        while (it9.hasNext()) {
            tj3.p pVar = (tj3.p) arrayMap.remove((java.lang.String) it9.next());
            if (pVar != null) {
                android.view.ViewPropertyAnimator animate = pVar.d().animate();
                if (animate != null) {
                    animate.cancel();
                }
                removeView(pVar.f419783b);
                removeView(pVar.f419784c);
                removeView(pVar.f419785d);
                removeView(pVar.d());
                if (pVar.f419792k) {
                    removeView(pVar.b());
                }
                removeView(pVar.c());
            }
            z18 = true;
        }
        for (com.tencent.mm.plugin.multitalk.ui.t tVar : q07) {
            tj3.p pVar2 = (tj3.p) arrayMap.get(tVar.f150297b);
            if (pVar2 != null) {
                com.tencent.mm.plugin.multitalk.ui.t tVar2 = pVar2.f419788g;
                if (tVar2.f150299d != tVar.f150299d || tVar2.a() != tVar.a()) {
                    z18 = true;
                }
                pVar2.e(tVar, z17);
            } else {
                pVar2 = null;
            }
            if (pVar2 == null) {
                java.lang.String str = tVar.f150297b;
                if (arrayMap.containsKey(str)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MT.MultiTalkAvatarLayout", "already has this item");
                } else {
                    android.content.Context context = getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    tj3.p pVar3 = new tj3.p(context, tVar);
                    arrayMap.put(str, pVar3);
                    tj3.q qVar = new tj3.q(pVar3, this);
                    android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(i17, i17);
                    tj3.i0 i0Var = pVar3.f419783b;
                    addView(i0Var, layoutParams);
                    android.widget.RelativeLayout c17 = pVar3.c();
                    android.content.Context context2 = pVar3.f419782a;
                    addView(c17, new android.view.ViewGroup.LayoutParams(-1, context2.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479727dj)));
                    i0Var.setOnClickListener(new tj3.i(qVar));
                    addView(pVar3.d());
                    addView(pVar3.f419784c, new android.view.ViewGroup.LayoutParams(context2.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480577a73), context2.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480577a73)));
                    addView(pVar3.f419785d, new android.view.ViewGroup.LayoutParams(context2.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480577a73), context2.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480577a73)));
                    if (pVar3.f419792k) {
                        addView(pVar3.b(), new android.view.ViewGroup.LayoutParams(-2, -2));
                        pVar3.b().setVisibility(4);
                    }
                }
                z18 = true;
            }
            i17 = 0;
        }
        int i18 = 0;
        for (java.lang.Object obj2 : list) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            tj3.p pVar4 = (tj3.p) arrayMap.get(((com.tencent.mm.plugin.multitalk.ui.t) obj2).f150297b);
            if (pVar4 != null) {
                pVar4.f419790i = i18;
            }
            i18 = i19;
        }
        if (!android.text.TextUtils.isEmpty(this.f150369m)) {
            tj3.p pVar5 = (tj3.p) arrayMap.get(this.f150369m);
            int i27 = pVar5 != null ? pVar5.f419790i : -1;
            boolean z19 = z18 || i27 != this.f150367h;
            this.f150367h = i27;
            z18 = z19;
        }
        if (z18) {
            a();
        }
    }

    public final void e(java.util.List list) {
        java.lang.Object parent = getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        int scrollY = view != null ? view.getScrollY() : 0;
        int screenHeight = (getScreenHeight() - this.bottomPanelHeight) + scrollY;
        java.util.HashSet hashSet = new java.util.HashSet(this.f150364e);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            gc.a aVar = (gc.a) it.next();
            android.graphics.Rect rect = aVar.f270082c;
            int i17 = rect.bottom;
            java.lang.String str = aVar.f270081b;
            if (i17 < scrollY || rect.top > screenHeight) {
                hashSet.remove(str);
            } else {
                hashSet.add(str);
            }
        }
        this.f150364e = hashSet;
        tj3.x xVar = this.layoutAdapter;
        if (xVar != null) {
            xVar.a(hashSet, this.f150369m);
        }
    }

    public final java.util.List f(android.util.ArrayMap arrayMap) {
        java.util.ArrayList arrayList = new java.util.ArrayList(arrayMap.size());
        java.util.Iterator it = arrayMap.entrySet().iterator();
        while (it.hasNext()) {
            tj3.p pVar = (tj3.p) ((java.util.Map.Entry) it.next()).getValue();
            tj3.i0 i0Var = pVar.f419783b;
            arrayList.add(new gc.a(pVar.f419790i, pVar.f419788g.f150297b, new android.graphics.Rect((int) i0Var.getX(), (int) i0Var.getY(), (int) (i0Var.getX() + (i0Var.getWidth() * i0Var.getScaleX())), (int) (i0Var.getY() + (i0Var.getHeight() * i0Var.getScaleY())))));
        }
        return arrayList;
    }

    public final int getBottomPanelHeight() {
        return this.bottomPanelHeight;
    }

    public final tj3.x getLayoutAdapter() {
        return this.layoutAdapter;
    }

    public final yz5.p getOnMaxYChanged() {
        return this.onMaxYChanged;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        measureChildren(i17, i18);
        java.util.List f17 = f(this.f150363d);
        int defaultSize = android.view.View.getDefaultSize(getSuggestedMinimumWidth(), i17);
        int i19 = this.f150367h;
        gc.c cVar = gc.c.f270083a;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i19);
        java.lang.Integer num = null;
        if (!(valueOf.intValue() < ((java.util.ArrayList) f17).size())) {
            valueOf = null;
        }
        cVar.b(f17, valueOf != null ? valueOf.intValue() : -1, defaultSize, this.bottomPanelHeight == 0 ? 0 : (getScreenHeight() - pm0.v.t(this)[1]) - this.bottomPanelHeight);
        java.util.Iterator it = f17.iterator();
        if (it.hasNext()) {
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(((gc.a) it.next()).f270082c.bottom);
            loop0: while (true) {
                num = valueOf2;
                while (it.hasNext()) {
                    valueOf2 = java.lang.Integer.valueOf(((gc.a) it.next()).f270082c.bottom);
                    if (num.compareTo(valueOf2) < 0) {
                        break;
                    }
                }
            }
        }
        java.lang.Integer num2 = num;
        setMeasuredDimension(defaultSize, (num2 != null ? num2.intValue() : 0) + this.bottomPanelHeight);
    }

    public final void setBottomPanelHeight(int i17) {
        this.bottomPanelHeight = i17;
    }

    public final void setLayoutAdapter(tj3.x xVar) {
        this.layoutAdapter = xVar;
        if (xVar == null) {
            return;
        }
        xVar.f419803b = new tj3.s(this);
    }

    public final void setOnMaxYChanged(yz5.p pVar) {
        kotlin.jvm.internal.o.g(pVar, "<set-?>");
        this.onMaxYChanged = pVar;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkAvatarLayout", "setVisibility: clear visible user");
            this.f150364e.clear();
        } else {
            e(f(this.f150363d));
            d(true);
        }
    }
}
