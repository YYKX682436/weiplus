package dl2;

/* loaded from: classes3.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f235197a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f235198b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f235199c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f235200d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f235201e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f235202f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f235203g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f235204h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f235205i;

    /* renamed from: j, reason: collision with root package name */
    public yz5.a f235206j;

    /* renamed from: k, reason: collision with root package name */
    public dl2.g f235207k;

    /* renamed from: l, reason: collision with root package name */
    public long f235208l;

    /* renamed from: m, reason: collision with root package name */
    public long f235209m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.LinkedHashMap f235210n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.LinkedList f235211o;

    /* renamed from: p, reason: collision with root package name */
    public long f235212p;

    /* renamed from: q, reason: collision with root package name */
    public int f235213q;

    /* renamed from: r, reason: collision with root package name */
    public final int f235214r;

    /* renamed from: s, reason: collision with root package name */
    public final char f235215s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedHashMap f235216t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f235217u;

    /* renamed from: v, reason: collision with root package name */
    public int f235218v;

    /* renamed from: w, reason: collision with root package name */
    public int f235219w;

    public f0(android.view.View root) {
        kotlin.jvm.internal.o.g(root, "root");
        this.f235197a = root;
        this.f235198b = "FinderLiveGiftPkgChooseView";
        this.f235199c = jz5.h.b(new dl2.a0(this));
        this.f235200d = jz5.h.b(new dl2.x(this));
        jz5.g b17 = jz5.h.b(new dl2.y(this));
        jz5.g b18 = jz5.h.b(new dl2.r(this));
        jz5.g b19 = jz5.h.b(new dl2.u(this));
        this.f235201e = b19;
        this.f235202f = jz5.h.b(new dl2.t(this));
        jz5.g b27 = jz5.h.b(new dl2.b0(this));
        this.f235203g = b27;
        jz5.g b28 = jz5.h.b(new dl2.c0(this));
        this.f235204h = b28;
        this.f235207k = new dl2.g(0, 0L, new java.util.LinkedList());
        this.f235210n = new java.util.LinkedHashMap();
        this.f235211o = new java.util.LinkedList();
        this.f235214r = 999;
        this.f235215s = (char) 8197;
        this.f235216t = new java.util.LinkedHashMap();
        this.f235217u = jz5.h.b(dl2.w.f235264d);
        this.f235218v = -1;
        ((android.view.View) ((jz5.n) b17).getValue()).setOnClickListener(new dl2.h(this));
        ((android.view.View) ((jz5.n) b18).getValue()).setOnClickListener(new dl2.i(this));
        ((android.view.View) ((jz5.n) b19).getValue()).setOnClickListener(new dl2.j(this));
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) b27).getValue();
        wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(root.getContext()));
        wxRecyclerView.setAdapter((dl2.p) ((jz5.n) b28).getValue());
    }

    public final void a(boolean z17) {
        yz5.l lVar;
        jz5.g gVar = this.f235199c;
        if (((com.tencent.mm.ui.widget.LiveBottomSheetPanel) ((jz5.n) gVar).getValue()).isShowing) {
            java.util.LinkedHashMap linkedHashMap = this.f235216t;
            linkedHashMap.forEach(dl2.s.f235260a);
            linkedHashMap.clear();
            com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = (com.tencent.mm.ui.widget.LiveBottomSheetPanel) ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(liveBottomSheetPanel, "<get-reChooseGiftPanel>(...)");
            com.tencent.mm.ui.widget.LiveBottomSheetPanel.b(liveBottomSheetPanel, null, 1, null);
            if (z17 && (lVar = this.f235205i) != null) {
                lVar.invoke(null);
            }
            android.view.View view = this.f235197a;
            android.content.Context context = view.getContext();
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity != null) {
                android.view.View currentFocus = activity.getCurrentFocus();
                android.os.IBinder windowToken = currentFocus != null ? currentFocus.getWindowToken() : null;
                if (windowToken != null) {
                    java.lang.Object systemService = view.getContext().getSystemService("input_method");
                    kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(windowToken, 0);
                }
            }
            this.f235218v = -1;
        }
    }

    public final void b() {
        java.lang.Object obj;
        java.lang.Object obj2;
        r45.s64 s64Var;
        java.util.Iterator it = this.f235211o.iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                if (((r45.s64) obj2).getInteger(0) == this.f235213q) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        r45.s64 s64Var2 = (r45.s64) obj2;
        if (s64Var2 == null) {
            return;
        }
        java.util.LinkedList linkedList = this.f235207k.f235222c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj3 : linkedList) {
            dl2.f fVar = (dl2.f) obj3;
            if (fVar.f235195a && fVar.f235196b.getInteger(1) > 0) {
                arrayList.add(obj3);
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        long j17 = 0;
        while (it6.hasNext()) {
            j17 += r8.f235196b.getInteger(1) * (((r45.kv1) this.f235210n.get(((dl2.f) it6.next()).f235196b.getString(0))) != null ? r9.getFloat(9) : 0.0f);
        }
        this.f235207k.f235221b = j17;
        long j18 = this.f235212p + j17;
        if (j18 <= ((r45.s64) kz5.n0.X(this.f235211o)).getLong(1)) {
            s64Var = (r45.s64) kz5.n0.X(this.f235211o);
        } else {
            java.util.LinkedList linkedList2 = this.f235211o;
            java.util.ListIterator listIterator = linkedList2.listIterator(linkedList2.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                java.lang.Object previous = listIterator.previous();
                if (j18 >= ((r45.s64) previous).getLong(1)) {
                    obj = previous;
                    break;
                }
            }
            s64Var = (r45.s64) obj;
            if (s64Var == null) {
                s64Var = (r45.s64) kz5.n0.i0(this.f235211o);
            }
        }
        int integer = s64Var.getInteger(0);
        long j19 = s64Var2.getLong(1);
        android.view.View view = this.f235197a;
        int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9);
        android.graphics.drawable.Drawable e17 = com.tencent.mm.ui.uk.e(view.getContext(), com.tencent.mm.R.raw.coin_icon, i65.a.d(view.getContext(), com.tencent.mm.R.color.aaq));
        e17.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        al5.w wVar = new al5.w(e17, 1);
        int i17 = this.f235213q;
        jz5.g gVar = this.f235201e;
        jz5.g gVar2 = this.f235202f;
        if (integer < i17) {
            android.text.SpannableString spannableString = new android.text.SpannableString(view.getContext().getResources().getString(com.tencent.mm.R.string.din, java.lang.Long.valueOf(j19 - j18)));
            java.lang.String string = view.getContext().getResources().getString(com.tencent.mm.R.string.dio);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            int K = r26.n0.K(spannableString, this.f235215s, 0, false, 6, null);
            spannableString.setSpan(wVar, K, K + 1, 34);
            int L = r26.n0.L(spannableString, string, 0, false, 6, null);
            if (L >= 0 && string.length() + L < spannableString.length()) {
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(view.getContext().getResources().getColor(com.tencent.mm.R.color.a2y)), L, string.length() + L, 34);
            }
            ((android.widget.TextView) ((jz5.n) gVar2).getValue()).setText(spannableString);
            this.f235207k.f235220a = this.f235213q;
            ((android.view.View) ((jz5.n) gVar).getValue()).setEnabled(false);
            return;
        }
        if (i17 < integer) {
            android.text.SpannableString spannableString2 = new android.text.SpannableString(view.getContext().getResources().getString(com.tencent.mm.R.string.dil, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(integer)));
            int K2 = r26.n0.K(spannableString2, this.f235215s, 0, false, 6, null);
            spannableString2.setSpan(wVar, K2, K2 + 1, 34);
            ((android.widget.TextView) ((jz5.n) gVar2).getValue()).setText(spannableString2);
            this.f235207k.f235220a = integer;
            ((android.view.View) ((jz5.n) gVar).getValue()).setEnabled(true);
            return;
        }
        android.text.SpannableString spannableString3 = new android.text.SpannableString(view.getContext().getResources().getString(com.tencent.mm.R.string.dim, java.lang.Long.valueOf(j17)));
        int K3 = r26.n0.K(spannableString3, this.f235215s, 0, false, 6, null);
        spannableString3.setSpan(wVar, K3, K3 + 1, 34);
        ((android.widget.TextView) ((jz5.n) gVar2).getValue()).setText(spannableString3);
        this.f235207k.f235220a = this.f235213q;
        ((android.view.View) ((jz5.n) gVar).getValue()).setEnabled(true);
    }
}
