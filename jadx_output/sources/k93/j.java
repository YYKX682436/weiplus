package k93;

/* loaded from: classes11.dex */
public class j extends androidx.recyclerview.widget.f2 implements k93.c0 {
    public boolean A;
    public boolean B;
    public long C;
    public boolean D;
    public k93.x E;
    public boolean S1;
    public e0.w1 T1;
    public e0.x1 U1;

    /* renamed from: m, reason: collision with root package name */
    public final android.content.Context f305898m;

    /* renamed from: n, reason: collision with root package name */
    public k93.q f305899n;

    /* renamed from: o, reason: collision with root package name */
    public androidx.recyclerview.widget.g1 f305900o;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.storage.d4 f305907v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f305908w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f305909x;

    /* renamed from: y, reason: collision with root package name */
    public k93.s f305910y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View.OnTouchListener f305911z;

    /* renamed from: d, reason: collision with root package name */
    public boolean f305892d = true;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f305893e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f305894f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f305895g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f305896h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f305897i = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public int f305901p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f305902q = false;

    /* renamed from: r, reason: collision with root package name */
    public int f305903r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f305904s = -1;

    /* renamed from: t, reason: collision with root package name */
    public int f305905t = -1;

    /* renamed from: u, reason: collision with root package name */
    public java.util.HashMap f305906u = new java.util.HashMap();

    public j(android.content.Context context) {
        com.tencent.mm.storage.d4 d4Var = new com.tencent.mm.storage.d4();
        this.f305907v = d4Var;
        this.f305908w = false;
        this.S1 = false;
        this.f305909x = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f492368g90);
        this.f305911z = null;
        this.A = false;
        this.B = false;
        this.D = true;
        this.E = null;
        this.f305898m = context;
        d4Var.field_labelID = -2000000;
        d4Var.field_isTemporary = true;
    }

    public static void x(k93.j jVar, java.lang.String str, java.lang.String str2) {
        jVar.getClass();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList P1 = b93.r.wi().P1(str);
        if (P1 != null && P1.size() > 0) {
            hashSet.addAll(P1);
        }
        java.lang.String r17 = c01.z1.r();
        if (hashSet.contains(r17)) {
            hashSet.remove(r17);
        }
        android.content.Context context = jVar.f305898m;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI.class);
        intent.putExtra("last_page_source_type", 1);
        intent.putExtra("list_type", 1);
        intent.putExtra("filter_type", "@all.contact.android");
        intent.putExtra("only_show_contact", true);
        if (context instanceof android.app.Activity) {
            intent.putExtra("key_label_click_source", ((android.app.Activity) context).getIntent().getIntExtra("key_label_click_source", 0));
        }
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 22);
        if (hashSet.size() > 0) {
            intent.putExtra("titile", str2 + "(" + hashSet.size() + ")");
        } else {
            intent.putExtra("titile", str2);
        }
        intent.putExtra("list_type", 1);
        intent.putExtra("already_select_contact", (java.lang.String[]) hashSet.toArray(new java.lang.String[0]));
        android.app.Activity activity = (android.app.Activity) context;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(com.tencent.liteav.TXLiteAVCode.WARNING_AUDIO_RECORDING_WRITE_FAIL));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/widget/LabelAdapter", "gotoSingleLebalContact", "(Ljava/lang/String;Ljava/lang/String;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public static k93.r y(java.util.List list, int i17) {
        java.lang.String r17 = c01.z1.r();
        java.util.HashSet hashSet = new java.util.HashSet();
        if (list != null) {
            hashSet.addAll(list);
        }
        hashSet.add("filehelper");
        hashSet.add(r17);
        java.util.ArrayList arrayList = new java.util.ArrayList(hashSet);
        gm0.j1.i();
        android.database.Cursor U = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().U(null, "", "@all.contact.without.chatroom.without.openim.without.chatbot", "", arrayList);
        if (U == null) {
            return new k93.r(0, java.util.Collections.emptyList(), false);
        }
        int count = U.getCount();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (count == 0) {
            U.close();
            return new k93.r(0, arrayList2, false);
        }
        boolean z17 = i17 > 0 && count > i17;
        if (!z17) {
            i17 = count;
        }
        for (int i18 = 0; i18 < i17 && U.moveToPosition(i18); i18++) {
            com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
            z3Var.convertFrom(U);
            arrayList2.add(z3Var.d1());
        }
        U.close();
        return new k93.r(count, arrayList2, z17);
    }

    public void B() {
        if (this.E != null) {
            android.content.Intent intent = new android.content.Intent(this.f305898m, (java.lang.Class<?>) com.tencent.mm.plugin.label.ui.searchLabel.LabelSearchUI.class);
            int i17 = this.f305901p;
            if (i17 == 1 || i17 == 3) {
                intent.putExtra("edit_mode_state", 1);
            } else {
                intent.putExtra("edit_mode_state", 0);
            }
            intent.putExtra("contact_has_choose_label_list", com.tencent.mm.sdk.platformtools.t8.c1(this.f305894f, ","));
            if (this.f305901p == 3) {
                intent.putExtra("contact_search_label_need_toast_after_choose", false);
                intent.putExtra("contact_search_label_enable_choose_empty_label", false);
                intent.putExtra("contact_search_label_choose_duplicate", true);
                intent.putExtra("contact_search_label_show_member_count", true);
            }
            intent.putExtra("contact_search_label_forbid_select_label_id_list", com.tencent.mm.sdk.platformtools.t8.c1(this.f305896h, ","));
            this.E.U(intent);
            com.tencent.mars.xlog.Log.i("MicroMsg.LabelAdapter", "gotoSearchPage: showSelectStatus:%d", java.lang.Integer.valueOf(this.f305901p));
        }
    }

    public void E() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LabelAdapter", "resetStatus: ");
        java.util.ArrayList arrayList = this.f305894f;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f305903r = 0;
        this.f305904s = -1;
    }

    @Override // k93.c0
    public void a() {
    }

    @Override // k93.c0
    public void g() {
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        java.util.ArrayList arrayList = this.f305893e;
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
        com.tencent.mm.storage.d4 d4Var = (com.tencent.mm.storage.d4) this.f305893e.get(i17);
        if (d4Var != null && d4Var.field_labelID == -1000000) {
            return 2;
        }
        if (d4Var != null && d4Var.field_labelID == -2000000) {
            return 3;
        }
        if (d4Var != null && d4Var.field_labelID == -3000000) {
            return 4;
        }
        if (d4Var != null && d4Var.field_labelID == -5000000) {
            return 6;
        }
        java.util.HashMap hashMap = this.f305906u;
        return (hashMap == null || !hashMap.containsKey(java.lang.Integer.valueOf(d4Var.field_labelID)) || ((java.lang.Integer) this.f305906u.get(java.lang.Integer.valueOf(d4Var.field_labelID))).intValue() <= 0) ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03e4  */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.k3 r33, int r34) {
        /*
            Method dump skipped, instructions count: 1371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k93.j.onBindViewHolder(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        if (i17 == 3) {
            android.view.View inflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.f487982d7, viewGroup, false);
            k93.t tVar = new k93.t(this, inflate);
            inflate.setTag(tVar);
            return tVar;
        }
        if (i17 == 2) {
            android.view.View inflate2 = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.a2d, viewGroup, false);
            k93.u uVar = new k93.u(this, inflate2);
            inflate2.setTag(uVar);
            return uVar;
        }
        if (i17 == 0) {
            android.view.View inflate3 = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.a2c, viewGroup, false);
            f93.d5 d5Var = new f93.d5(inflate3);
            inflate3.setTag(d5Var);
            return d5Var;
        }
        if (i17 == 1) {
            android.view.View inflate4 = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.a2e, viewGroup, false);
            k93.w wVar = new k93.w(this, inflate4);
            inflate4.setTag(wVar);
            return wVar;
        }
        if (i17 == 4) {
            android.view.View inflate5 = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.a2f, viewGroup, false);
            k93.v vVar = new k93.v(this, inflate5);
            inflate5.setTag(vVar);
            return vVar;
        }
        if (i17 != 6) {
            return null;
        }
        android.view.View inflate6 = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.f489653dx, viewGroup, false);
        e0.y1 y1Var = new e0.y1(this, inflate6);
        inflate6.setTag(y1Var);
        return y1Var;
    }

    public com.tencent.mm.storage.d4 z(int i17) {
        java.util.ArrayList arrayList = this.f305893e;
        if (arrayList == null || i17 > arrayList.size()) {
            return null;
        }
        return (com.tencent.mm.storage.d4) this.f305893e.get(i17);
    }
}
