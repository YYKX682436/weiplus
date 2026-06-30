package i93;

/* loaded from: classes11.dex */
public class e extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f289727d;

    /* renamed from: n, reason: collision with root package name */
    public final android.content.Context f289734n;

    /* renamed from: s, reason: collision with root package name */
    public boolean f289739s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f289740t;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f289728e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f289729f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f289730g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f289731h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f289732i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f289733m = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public int f289735o = 0;

    /* renamed from: p, reason: collision with root package name */
    public java.util.ArrayList f289736p = null;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Map f289737q = new java.util.HashMap();

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f289738r = "";

    /* renamed from: u, reason: collision with root package name */
    public boolean f289741u = true;

    /* renamed from: v, reason: collision with root package name */
    public i93.f f289742v = null;

    /* renamed from: w, reason: collision with root package name */
    public final android.util.SparseArray f289743w = new android.util.SparseArray();

    public e(android.content.Context context) {
        this.f289734n = context;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        java.util.ArrayList arrayList = this.f289727d;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public long getItemId(int i17) {
        return i17;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, final int i17) {
        final f93.d5 d5Var = (f93.d5) k3Var;
        final com.tencent.mm.storage.d4 x17 = x(i17);
        final java.lang.String valueOf = java.lang.String.valueOf(x17.field_labelID);
        d5Var.f260315f.setOnClickListener(new android.view.View.OnClickListener() { // from class: i93.e$$a
            /* JADX WARN: Removed duplicated region for block: B:39:0x01dd  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x01ee  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x02d4  */
            /* JADX WARN: Removed duplicated region for block: B:70:0x01df  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClick(android.view.View r22) {
                /*
                    Method dump skipped, instructions count: 810
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: i93.e$$a.onClick(android.view.View):void");
            }
        });
        d5Var.f260315f.setOnTouchListener(null);
        d5Var.f260318i.setVisibility(8);
        int i18 = this.f289735o;
        android.widget.CheckBox checkBox = d5Var.f260317h;
        if (i18 == 1) {
            checkBox.setVisibility(0);
        } else {
            checkBox.setVisibility(8);
        }
        boolean z17 = this.f289740t;
        android.content.Context context = this.f289734n;
        android.widget.TextView textView = d5Var.f260314e;
        if (z17) {
            textView.setVisibility(0);
            textView.setText(context.getResources().getString(com.tencent.mm.R.string.f492373g94, java.lang.Integer.valueOf(y(valueOf))));
        } else {
            textView.setVisibility(8);
        }
        if (this.f289731h.contains(valueOf)) {
            checkBox.setEnabled(false);
            checkBox.setChecked(true);
        } else {
            checkBox.setEnabled(true);
            if (checkBox.getVisibility() == 0) {
                checkBox.setChecked(((java.util.LinkedList) this.f289729f).contains(valueOf));
            }
        }
        boolean z18 = bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.profile.RepairerConfigLabelSearchByContact()) == 1;
        com.tencent.mm.ui.widget.MMTextView mMTextView = d5Var.f260313d;
        if (!z18) {
            java.lang.String str = x17.field_labelName;
            int h17 = i65.a.h(context, com.tencent.mm.R.dimen.f479897ia);
            int hashCode = str.hashCode();
            android.util.SparseArray sparseArray = this.f289743w;
            android.text.SpannableString spannableString = (android.text.SpannableString) sparseArray.get(hashCode);
            if (spannableString == null) {
                spannableString = new android.text.SpannableString(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, str, h17));
                int indexOf = str.indexOf(this.f289738r);
                if (indexOf != -1) {
                    int length = this.f289738r.length() + indexOf;
                    spannableString.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.tencent.mm.R.color.aaq)), indexOf, length, 33);
                    spannableString.setSpan(new android.text.style.StyleSpan(1), indexOf, length, 33);
                    sparseArray.put(hashCode, spannableString);
                }
            }
            mMTextView.setText(spannableString);
        } else if (i17 >= 0 && i17 < this.f289728e.size()) {
            p13.y matchInfo = (p13.y) this.f289728e.get(i17);
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((i93.d) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(i93.d.class)).getClass();
            kotlin.jvm.internal.o.g(matchInfo, "matchInfo");
            java.lang.Object obj = matchInfo.f351197o;
            jz5.l lVar = obj instanceof jz5.l ? (jz5.l) obj : null;
            if (mMTextView != null) {
                mMTextView.setText(lVar != null ? (java.lang.CharSequence) lVar.f302833d : null);
            }
            android.widget.TextView textView2 = d5Var.f260319m;
            if (textView2 != null) {
                textView2.setText(lVar != null ? (java.lang.CharSequence) lVar.f302834e : null);
            }
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
        }
        boolean isEmpty = this.f289733m.isEmpty();
        android.widget.LinearLayout linearLayout = d5Var.f260316g;
        if (isEmpty || !this.f289733m.contains(java.lang.String.valueOf(x17.field_labelID))) {
            linearLayout.setAlpha(1.0f);
            checkBox.setAlpha(1.0f);
        } else {
            linearLayout.setAlpha(0.3f);
            checkBox.setAlpha(0.3f);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        android.view.View inflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.a2c, viewGroup, false);
        f93.d5 d5Var = new f93.d5(inflate);
        inflate.setTag(d5Var);
        return d5Var;
    }

    public com.tencent.mm.storage.d4 x(int i17) {
        java.util.ArrayList arrayList = this.f289727d;
        if (arrayList == null || i17 > arrayList.size()) {
            return null;
        }
        return (com.tencent.mm.storage.d4) this.f289727d.get(i17);
    }

    public int y(java.lang.String str) {
        int i17;
        java.util.Map map = this.f289737q;
        java.lang.Integer num = (java.lang.Integer) ((java.util.HashMap) map).get(str);
        if (num != null) {
            return num.intValue();
        }
        java.util.ArrayList P1 = b93.r.wi().P1(str);
        int i18 = 0;
        if (com.tencent.mm.sdk.platformtools.t8.L0(P1)) {
            i17 = 0;
        } else {
            int size = P1.size();
            java.util.Iterator it = P1.iterator();
            while (it.hasNext()) {
                if (com.tencent.mm.storage.z3.L3((java.lang.String) it.next())) {
                    i18++;
                }
            }
            i17 = i18;
            i18 = size;
        }
        ((java.util.HashMap) map).put(str, java.lang.Integer.valueOf(i18 - i17));
        return i18;
    }

    public void z(java.util.ArrayList arrayList) {
        if (arrayList == null) {
            this.f289727d = new java.util.ArrayList();
            notifyDataSetChanged();
            return;
        }
        java.util.List list = this.f289730g;
        if (!list.isEmpty()) {
            java.util.List list2 = this.f289732i;
            ((java.util.LinkedList) list2).clear();
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                com.tencent.mm.storage.d4 d4Var = (com.tencent.mm.storage.d4) arrayList.get(i17);
                if (((java.util.LinkedList) list).contains(java.lang.String.valueOf(d4Var.field_labelID))) {
                    ((java.util.LinkedList) list2).add(java.lang.String.valueOf(d4Var.field_labelID));
                }
            }
            java.util.List list3 = this.f289729f;
            ((java.util.LinkedList) list3).clear();
            ((java.util.LinkedList) list3).addAll(list2);
        }
        this.f289727d = arrayList;
        notifyDataSetChanged();
    }
}
