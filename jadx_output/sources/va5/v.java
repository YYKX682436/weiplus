package va5;

/* loaded from: classes11.dex */
public final class v extends android.widget.LinearLayout implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public va5.p f434455d;

    /* renamed from: e, reason: collision with root package name */
    public final va5.a f434456e;

    /* renamed from: f, reason: collision with root package name */
    public int f434457f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f434458g;

    /* renamed from: h, reason: collision with root package name */
    public int f434459h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(va5.a menu) {
        super(menu.f434402a);
        kotlin.jvm.internal.o.g(menu, "menu");
        this.f434456e = menu;
        this.f434458g = new java.util.ArrayList();
        int i17 = 0;
        setOrientation(0);
        java.util.ArrayList arrayList = (java.util.ArrayList) menu.f434403b;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            va5.c cVar = (va5.c) it.next();
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(cVar.f434410g, -1);
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
            linearLayout.setId(cVar.f434404a);
            linearLayout.setGravity(16);
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setBackground(cVar.f434407d);
            linearLayout.setOnClickListener(this);
            addView(linearLayout);
            this.f434458g.add(linearLayout);
            if (cVar.f434406c != null) {
                int e17 = com.tencent.mm.ui.zk.e(getContext(), com.tencent.mm.R.dimen.f479704cz);
                android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(e17, e17);
                android.widget.ImageView imageView = new android.widget.ImageView(getContext());
                imageView.setId(com.tencent.mm.R.id.vb_);
                imageView.setImageDrawable(cVar.f434406c);
                imageView.setLayoutParams(layoutParams2);
                linearLayout.addView(imageView);
            }
            if (!android.text.TextUtils.isEmpty(cVar.f434405b)) {
                android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-2, -2);
                android.widget.TextView textView = new android.widget.TextView(getContext());
                textView.setPadding(i65.a.b(getContext(), 16), 0, i65.a.b(getContext(), 16), 0);
                textView.setId(com.tencent.mm.R.id.vba);
                textView.setText(cVar.f434405b);
                textView.setGravity(17);
                textView.setTextSize(0, i65.a.q(getContext()) * cVar.f434409f);
                textView.setTextColor(cVar.f434408e);
                textView.setLayoutParams(layoutParams3);
                linearLayout.addView(textView);
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            i17 += ((va5.c) it6.next()).f434410g;
        }
        this.f434459h = i17;
        getViewTreeObserver().addOnPreDrawListener(new va5.u(this, this));
    }

    public final void a(java.lang.String title, int i17) {
        kotlin.jvm.internal.o.g(title, "title");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(i17);
        android.widget.TextView textView = linearLayout != null ? (android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.vba) : null;
        if (textView == null) {
            return;
        }
        textView.setText(title);
    }

    public final void b(boolean z17, int i17, int i18) {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(i17);
        android.view.View findViewById = linearLayout != null ? linearLayout.findViewById(i18) : null;
        if (findViewById == null) {
            return;
        }
        int i19 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/anim/swipe/SwipeMenuView", "updateMenuVisible", "(ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/ui/anim/swipe/SwipeMenuView", "updateMenuVisible", "(ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final int getExpandIndex() {
        java.util.Iterator it = ((java.util.ArrayList) this.f434456e.f434403b).iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if (((va5.c) it.next()).f434411h) {
                return i17;
            }
            i17++;
        }
        return -1;
    }

    public final int getMTotalMenuWidth() {
        return this.f434459h;
    }

    public final int getPosition() {
        return this.f434457f;
    }

    public final va5.p getSwipeMenuLayout() {
        return this.f434455d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/anim/swipe/SwipeMenuView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(v17, "v");
        yj0.a.h(this, "com/tencent/mm/ui/anim/swipe/SwipeMenuView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public final void setLayout(va5.p pVar) {
        this.f434455d = pVar;
    }

    public final void setMTotalMenuWidth(int i17) {
        this.f434459h = i17;
    }

    public final void setOnSwipeItemClickListener(va5.q qVar) {
    }

    public final void setPosition(int i17) {
        this.f434457f = i17;
    }
}
