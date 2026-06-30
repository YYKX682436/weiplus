package hq5;

/* loaded from: classes5.dex */
public final class t0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f283271d;

    /* renamed from: e, reason: collision with root package name */
    public final int f283272e;

    /* renamed from: f, reason: collision with root package name */
    public final int f283273f;

    /* renamed from: g, reason: collision with root package name */
    public long f283274g;

    /* renamed from: h, reason: collision with root package name */
    public final long f283275h;

    /* renamed from: i, reason: collision with root package name */
    public final long f283276i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f283277m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.f4 f283278n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f283271d = "MicroMsg.WeDrop.WeDropSelectFileUIC";
        this.f283272e = 10001;
        this.f283273f = 10002;
        long qj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).qj(new com.tencent.mm.repairer.config.f2f.RepairerConfigWeDropSelectFileSizeLimit());
        this.f283275h = qj6 < 1073741824 ? 1073741824L : qj6;
        long qj7 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).qj(new com.tencent.mm.repairer.config.f2f.RepairerConfigWeDropSelectImgSizeLimit());
        this.f283276i = qj7 >= 1073741824 ? qj7 : 1073741824L;
        this.f283277m = jz5.h.b(new hq5.l0(this));
    }

    public final em.k4 T6() {
        return (em.k4) ((jz5.n) this.f283277m).getValue();
    }

    public final void U6(int i17, android.content.Intent intent) {
        int i18;
        java.lang.String str = this.f283271d;
        if (i17 != -1) {
            com.tencent.mars.xlog.Log.e(str, "select file result code: " + i17);
            return;
        }
        java.util.List stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("selected_file_lst") : null;
        java.util.List list = kz5.p0.f313996d;
        java.util.List list2 = stringArrayListExtra == null ? list : stringArrayListExtra;
        java.util.List stringArrayListExtra2 = intent != null ? intent.getStringArrayListExtra("selected_file_title_lst") : null;
        if (stringArrayListExtra2 != null) {
            list = stringArrayListExtra2;
        }
        com.tencent.mars.xlog.Log.i(str, "select file count: " + list2.size() + ", title count: " + list.size());
        if ((!list2.isEmpty()) && (!list.isEmpty()) && list2.size() == list.size()) {
            W6();
            android.content.ContentResolver contentResolver = getContext().getContentResolver();
            java.util.Iterator it = list2.iterator();
            while (true) {
                i18 = 0;
                if (!it.hasNext()) {
                    break;
                }
                java.lang.String str2 = (java.lang.String) it.next();
                try {
                    if (r26.i0.A(str2, "content://", false, 2, null)) {
                        android.net.Uri parse = android.net.Uri.parse(str2);
                        contentResolver.takePersistableUriPermission(parse, 1);
                        com.tencent.mars.xlog.Log.i(str, "take persistable uri permission: " + parse);
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e(str, "take persistable uri permission error: " + e17);
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            long j17 = 0;
            for (java.lang.Object obj : list2) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                java.lang.String str3 = (java.lang.String) obj;
                kotlin.jvm.internal.o.d(str3);
                eq5.a aVar = new eq5.a(str3, r45.z77.File, com.tencent.mm.vfs.w6.k(str3));
                java.lang.String str4 = (java.lang.String) list.get(i18);
                if (str4 == null) {
                    str4 = "";
                }
                aVar.f255909d = str4;
                java.lang.String n17 = com.tencent.mm.vfs.w6.n(str4);
                kotlin.jvm.internal.o.f(n17, "getFileExt(...)");
                aVar.f255910e = n17;
                j17 += aVar.f255908c;
                arrayList.add(aVar);
                i18 = i19;
            }
            cq5.i.f221543a.f(java.lang.System.currentTimeMillis() - this.f283274g, arrayList.size(), 0, 0, j17, cq5.c.f221510f);
            j75.f Q6 = Q6();
            if (Q6 != null) {
                Q6.B3(new eq5.g(arrayList, j17));
            }
            jq5.b bVar = jq5.b.f301255a;
            kz5.r0 r0Var = kz5.r0.f314002d;
            bVar.a(r0Var, r0Var);
        }
    }

    public final void V6(java.util.List list, java.util.List list2, boolean z17) {
        W6();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        long j17 = 0;
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            eq5.a aVar = new eq5.a(str, r45.z77.Image, com.tencent.mm.vfs.w6.k(str));
            j17 += aVar.f255908c;
            arrayList.add(aVar);
        }
        java.util.Iterator it6 = list2.iterator();
        while (it6.hasNext()) {
            java.lang.String str2 = (java.lang.String) it6.next();
            eq5.a aVar2 = new eq5.a(str2, r45.z77.Video, com.tencent.mm.vfs.w6.k(str2));
            j17 += aVar2.f255908c;
            arrayList.add(aVar2);
        }
        cq5.i.f221543a.f(java.lang.System.currentTimeMillis() - this.f283274g, 0, list2.size(), list.size(), j17, z17 ? cq5.c.f221511g : cq5.c.f221509e);
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.B3(new eq5.g(arrayList, j17));
        }
        jq5.b.f301255a.a(kz5.n0.X0(list), kz5.n0.X0(list2));
    }

    public final void W6() {
        if (this.f283278n == null) {
            android.app.Activity context = getContext();
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211780g = 2;
            e4Var.f211776c = getString(com.tencent.mm.R.string.f490604zq);
            e4Var.f211779f = true;
            e4Var.f211778e = false;
            this.f283278n = e4Var.c();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (intent == null) {
            return;
        }
        if (i17 != this.f283272e) {
            if (i17 == this.f283273f) {
                U6(i18, intent);
                return;
            }
            return;
        }
        java.util.List stringArrayListExtra = intent.getStringArrayListExtra("CropImage_OutputPath_List");
        java.util.List list = kz5.p0.f313996d;
        if (stringArrayListExtra == null) {
            stringArrayListExtra = list;
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("key_select_video_list");
        if (stringArrayListExtra2 != null) {
            list = stringArrayListExtra2;
        }
        com.tencent.mars.xlog.Log.i(this.f283271d, "select image count: " + stringArrayListExtra.size() + ", video count: " + list.size());
        if ((!stringArrayListExtra.isEmpty()) || (!list.isEmpty())) {
            V6(stringArrayListExtra, list, false);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new hq5.m0(this));
        }
    }
}
