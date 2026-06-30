package in2;

/* loaded from: classes10.dex */
public final class f0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f292822d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f292823e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f292824f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f292825g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f292826h;

    /* renamed from: i, reason: collision with root package name */
    public final int f292827i;

    /* renamed from: m, reason: collision with root package name */
    public final int f292828m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.l f292829n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.q f292830o;

    /* renamed from: p, reason: collision with root package name */
    public yz5.l f292831p;

    /* renamed from: q, reason: collision with root package name */
    public int f292832q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f292833r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f292834s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f292835t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f292836u;

    /* renamed from: v, reason: collision with root package name */
    public yz5.a f292837v;

    public f0(android.content.Context context, gk2.e liveData) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        this.f292822d = "FinderLiveAnchorSingSongAddAdapter";
        this.f292823e = "save_str";
        this.f292824f = "PAY_LOAD_EMOJI_TIPS_SHOW";
        this.f292825g = "PAY_LOAD_EMOJI_TIPS_HIDE";
        this.f292826h = new java.util.ArrayList();
        this.f292827i = 100;
        this.f292828m = 30;
        this.f292832q = -1;
        this.f292833r = true;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        int size = this.f292826h.size();
        zl2.r4.f473950a.M2(this.f292822d, "getItemCount " + size);
        return size;
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f488847an1, parent, false);
        android.widget.EditText editText = (android.widget.EditText) inflate.findViewById(com.tencent.mm.R.id.jzh);
        if (editText != null) {
            editText.setHint(com.tencent.mm.R.string.p1k);
        }
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.v5o);
        if (textView != null) {
            textView.setText(com.tencent.mm.R.string.p1l);
        }
        return new in2.t(this, inflate);
    }

    public final boolean x(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        int i17 = this.f292832q;
        if (i17 != -1) {
            java.util.ArrayList arrayList = this.f292826h;
            if (i17 <= arrayList.size() - 1) {
                int i18 = 0;
                for (java.lang.Object obj : arrayList) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    dk2.yg ygVar = (dk2.yg) obj;
                    int i27 = this.f292832q;
                    if (i27 != i18 && kotlin.jvm.internal.o.b(ygVar.f234393a, ((dk2.yg) arrayList.get(i27)).f234393a)) {
                        if (ygVar.f234393a.length() > 0) {
                            db5.t7.g(context, context.getResources().getString(com.tencent.mm.R.string.p1u));
                            int i28 = this.f292832q;
                            notifyItemChanged(i28, java.lang.Integer.valueOf(i28));
                            return false;
                        }
                    }
                    i18 = i19;
                }
                return true;
            }
        }
        this.f292832q = -1;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x027e, code lost:
    
        if (((dk2.yg) r3.get(r28 + 1)).f234395c == 1) goto L21;
     */
    @Override // androidx.recyclerview.widget.f2
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(in2.t r27, int r28) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: in2.f0.onBindViewHolder(in2.t, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List payloads) {
        in2.t holder = (in2.t) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder(holder, i17);
            return;
        }
        for (java.lang.Object obj : payloads) {
            boolean z17 = obj instanceof java.lang.Integer;
            android.widget.EditText editText = holder.f292902h;
            if (z17 && z17 && i17 == ((java.lang.Number) obj).intValue()) {
                this.f292835t = true;
                this.f292834s = true;
                editText.postDelayed(new in2.c0(holder), 300L);
            }
            boolean z18 = obj instanceof java.lang.Boolean;
            java.util.ArrayList arrayList = this.f292826h;
            if (z18 && kotlin.jvm.internal.o.b(obj, java.lang.Boolean.TRUE)) {
                if (editText.hasFocus()) {
                    dk2.yg ygVar = (dk2.yg) arrayList.get(i17);
                    java.lang.String obj2 = r26.n0.u0(editText.getEditableText().toString()).toString();
                    ygVar.getClass();
                    kotlin.jvm.internal.o.g(obj2, "<set-?>");
                    ygVar.f234393a = obj2;
                    editText.clearFocus();
                }
                yz5.a aVar = this.f292837v;
                if (aVar != null) {
                    aVar.invoke();
                }
                this.f292837v = null;
            }
            boolean z19 = obj instanceof java.lang.String;
            if (z19 && kotlin.jvm.internal.o.b(obj, this.f292823e)) {
                if (this.f292832q == i17) {
                    dk2.yg ygVar2 = (dk2.yg) arrayList.get(i17);
                    java.lang.String obj3 = r26.n0.u0(editText.getEditableText().toString()).toString();
                    ygVar2.getClass();
                    kotlin.jvm.internal.o.g(obj3, "<set-?>");
                    ygVar2.f234393a = obj3;
                }
                onBindViewHolder(holder, i17);
            }
            android.widget.TextView textView = holder.f292904m;
            if (z19 && kotlin.jvm.internal.o.b(obj, this.f292825g)) {
                kotlin.jvm.internal.o.f(textView, "<get-auditStatus>(...)");
                java.lang.Object obj4 = arrayList.get(i17);
                kotlin.jvm.internal.o.f(obj4, "get(...)");
                in2.b1.a(textView, (dk2.yg) obj4);
            }
            if (z19 && kotlin.jvm.internal.o.b(obj, this.f292824f)) {
                kotlin.jvm.internal.o.d(textView);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(textView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongAddAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongAddAdapter$SingSongAddViewHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongAddAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongAddAdapter$SingSongAddViewHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView.setText(textView.getContext().getString(com.tencent.mm.R.string.li6));
                textView.setTextColor(textView.getContext().getColor(com.tencent.mm.R.color.Red_100));
            }
        }
    }
}
