package com.tencent.mm.pluginsdk.ui.tools;

@db5.a(7)
/* loaded from: classes8.dex */
public class AppChooserUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ int f191330x0 = 0;
    public com.tencent.mm.pluginsdk.ui.otherway.x A;
    public final com.tencent.mm.pluginsdk.ui.otherway.x B;
    public final java.util.ArrayList C;
    public final java.util.ArrayList D;
    public boolean E;
    public java.lang.String F;
    public java.lang.String G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f191331J;
    public boolean K;
    public boolean L;
    public long M;
    public com.tencent.mm.pluginsdk.ui.tools.e0 N;
    public com.tencent.mm.pluginsdk.ui.tools.d0 P;
    public final android.widget.AdapterView.OnItemClickListener Q;
    public final android.content.DialogInterface.OnClickListener R;
    public final android.view.View.OnClickListener S;
    public final android.content.DialogInterface.OnClickListener T;
    public final in5.x U;
    public final android.view.View.OnClickListener V;
    public final com.tencent.mm.ui.widget.dialog.h2 W;
    public final com.tencent.mm.ui.widget.dialog.h2 X;
    public final android.content.DialogInterface.OnDismissListener Y;
    public final com.tencent.mm.plugin.downloader.model.g1 Z;

    /* renamed from: d, reason: collision with root package name */
    public android.content.pm.PackageManager f191332d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.a0 f191333e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.y1 f191334f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f191335g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f191336h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.otherway.x f191337i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.y1 f191338m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f191339n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f191340o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.otherway.x f191341p;

    /* renamed from: p0, reason: collision with root package name */
    public final java.util.List f191342p0;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.otherway.x f191343q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f191344r;

    /* renamed from: s, reason: collision with root package name */
    public android.content.Intent f191345s;

    /* renamed from: t, reason: collision with root package name */
    public int f191346t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f191347u;

    /* renamed from: v, reason: collision with root package name */
    public android.os.Bundle f191348v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.model.y3 f191349w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.ArrayList f191350x;

    /* renamed from: y, reason: collision with root package name */
    public int f191351y;

    /* renamed from: z, reason: collision with root package name */
    public int f191352z;

    public AppChooserUI() {
        com.tencent.mm.pluginsdk.ui.otherway.x xVar = new com.tencent.mm.pluginsdk.ui.otherway.x();
        this.f191337i = xVar;
        this.f191341p = xVar;
        this.f191343q = xVar;
        this.f191344r = true;
        this.f191345s = null;
        this.f191347u = null;
        this.f191348v = null;
        this.f191349w = null;
        this.f191350x = null;
        this.f191351y = 0;
        this.f191352z = 0;
        this.A = null;
        this.B = new com.tencent.mm.pluginsdk.ui.otherway.x();
        this.C = new java.util.ArrayList();
        this.D = new java.util.ArrayList();
        this.E = false;
        this.G = null;
        this.f191331J = false;
        this.K = false;
        this.L = false;
        this.N = com.tencent.mm.pluginsdk.ui.tools.e0.UNINSTALL;
        this.Q = new com.tencent.mm.pluginsdk.ui.tools.m(this);
        this.R = new com.tencent.mm.pluginsdk.ui.tools.n(this);
        this.S = new com.tencent.mm.pluginsdk.ui.tools.o(this);
        this.T = new com.tencent.mm.pluginsdk.ui.tools.p(this);
        this.U = new com.tencent.mm.pluginsdk.ui.tools.q(this);
        this.V = new com.tencent.mm.pluginsdk.ui.tools.r(this);
        this.W = new com.tencent.mm.pluginsdk.ui.tools.s(this);
        this.X = new com.tencent.mm.pluginsdk.ui.tools.t(this);
        this.Y = new com.tencent.mm.pluginsdk.ui.tools.u(this);
        this.Z = new com.tencent.mm.pluginsdk.ui.tools.g(this);
        this.f191342p0 = java.util.Arrays.asList(1, 2, 8, 7);
    }

    public static int U6(int i17, java.lang.String str, int i18) {
        return str != null ? i17 + i18 + str.hashCode() : i17 + i18;
    }

    public final boolean T6() {
        this.M = ((java.lang.Long) gm0.j1.u().c().l(U6(274560, this.G, this.f191346t), 0L)).longValue();
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo p17 = com.tencent.mm.plugin.downloader.model.r0.i().p(this.M);
        if (3 != p17.f96963f || !com.tencent.mm.vfs.w6.j(p17.f96964g)) {
            return false;
        }
        Y6(com.tencent.mm.pluginsdk.ui.tools.e0.DOWNLOADED);
        com.tencent.mm.pluginsdk.ui.tools.a0 a0Var = this.f191333e;
        if (a0Var != null) {
            a0Var.notifyDataSetChanged();
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f191336h;
        if (wxRecyclerAdapter == null) {
            return true;
        }
        wxRecyclerAdapter.notifyDataSetChanged();
        return true;
    }

    public final java.util.ArrayList V6(android.content.Intent intent, boolean z17, java.util.ArrayList arrayList) {
        boolean z18;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = this.f191332d.queryIntentActivities(intent, 65536);
        jt.u b17 = this.f191349w.b();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(b17.f301590c)) {
            this.f191347u = b17.f301590c;
        } else if (b17.f301589b > 0) {
            this.f191347u = getResources().getString(b17.f301589b);
        }
        int i17 = b17.f301588a;
        com.tencent.mm.pluginsdk.ui.otherway.x xVar = this.B;
        if (i17 > 0) {
            xVar.f191030f = getResources().getDrawable(b17.f301588a);
        }
        if (b17.f301591d > 0) {
            xVar.f191029e = getResources().getString(b17.f301591d);
        } else {
            xVar.f191029e = b17.f301592e;
        }
        xVar.f191032h = true;
        boolean z19 = this.f191331J;
        xVar.f191033i = z19;
        if (z19) {
            xVar.f191035n = true;
        }
        if (this.K) {
            xVar.f191034m = true;
        }
        if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
            z18 = false;
        } else {
            int size = queryIntentActivities.size();
            z18 = false;
            for (int i18 = 0; i18 < size; i18++) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppChooserUI", "cpan name:%s", queryIntentActivities.get(i18).activityInfo.name);
                android.content.pm.ResolveInfo resolveInfo = queryIntentActivities.get(i18);
                if (resolveInfo != null) {
                    java.lang.String str = resolveInfo.activityInfo.packageName;
                    if (arrayList == null || arrayList.isEmpty() || arrayList.contains(str)) {
                        if (this.f191349w.h(str)) {
                            xVar.f191028d = resolveInfo;
                            xVar.f191035n = true;
                            if ((!z17 && this.f191331J) || !z17) {
                                arrayList2.add(0, xVar);
                                z18 = true;
                            }
                        } else {
                            com.tencent.mm.pluginsdk.ui.otherway.x xVar2 = new com.tencent.mm.pluginsdk.ui.otherway.x(resolveInfo, this.f191349w.a(getContext(), resolveInfo), false, true, false);
                            arrayList2.add(xVar2);
                            if (!this.f191349w.h(xVar2.f191028d.activityInfo.packageName)) {
                            }
                            z18 = true;
                        }
                    }
                }
            }
        }
        if (z17 && !z18) {
            if (this.f191346t != 0 || this.G == null) {
                arrayList2.add(0, xVar);
            } else {
                arrayList2.add(0, xVar);
                if (this.K) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11168, 2, java.lang.Integer.valueOf(this.f191351y));
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11168, 1, java.lang.Integer.valueOf(this.f191351y));
                }
            }
        }
        int i19 = this.f191351y;
        if ((i19 == 4 || i19 == 8) && xVar.f191028d == null) {
            xVar.f191028d = new android.content.pm.ResolveInfo();
            xVar.f191028d.activityInfo = new android.content.pm.ActivityInfo();
            xVar.f191028d.activityInfo.packageName = "com.tencent.mtt";
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            android.content.pm.ResolveInfo resolveInfo2 = ((com.tencent.mm.pluginsdk.ui.otherway.x) arrayList2.get(size2)).f191028d;
            if (resolveInfo2 != null) {
                java.lang.String str2 = resolveInfo2.activityInfo.packageName;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && !hashSet.add(str2)) {
                    arrayList2.remove(size2);
                }
            }
        }
        return arrayList2;
    }

    public final boolean W6() {
        com.tencent.mm.sdk.platformtools.t8.P0(this);
        return this.L && this.H < this.I && !com.tencent.mm.sdk.platformtools.t8.P0(this) && com.tencent.mm.sdk.platformtools.a0.f192439b != 1;
    }

    public final void X6(int i17, java.lang.String str, boolean z17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("selectpkg", str);
        intent.putExtra("isalways", z17);
        intent.putExtra("transferback", this.f191348v);
        setResult(i17, intent);
        finish();
    }

    public void Y6(com.tencent.mm.pluginsdk.ui.tools.e0 e0Var) {
        if (Z6()) {
            this.N = e0Var;
            return;
        }
        com.tencent.mm.pluginsdk.ui.tools.a0 a0Var = this.f191333e;
        if (a0Var != null) {
            a0Var.f191500e = e0Var;
        }
    }

    public final boolean Z6() {
        return this.f191342p0.contains(java.lang.Integer.valueOf(this.f191351y));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        X6(0, null, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x021b A[EDGE_INSN: B:131:0x021b->B:63:0x021b BREAK  A[LOOP:1: B:54:0x01ef->B:129:0x01ef], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02ca  */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r17) {
        /*
            Method dump skipped, instructions count: 1057
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.ui.tools.AppChooserUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.tencent.mm.plugin.downloader.model.r0.i().s(this.Z);
        com.tencent.mm.pluginsdk.ui.tools.d0 d0Var = this.P;
        if (d0Var != null) {
            d0Var.f191551b.dismiss();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        android.content.Intent intent;
        super.onResume();
        boolean z17 = this.K;
        com.tencent.mm.pluginsdk.ui.otherway.x xVar = this.B;
        if (z17 && (intent = this.f191345s) != null && this.f191349w.i(this, intent)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppChooserUI", "user installed lasted recommend app");
            this.K = false;
            xVar.f191034m = false;
        }
        this.f191331J = this.f191349w.g(getContext());
        java.util.ArrayList arrayList = this.C;
        arrayList.clear();
        arrayList.addAll(V6(this.f191345s, W6(), this.f191350x));
        java.util.ArrayList arrayList2 = this.D;
        arrayList2.clear();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.pluginsdk.ui.otherway.x xVar2 = (com.tencent.mm.pluginsdk.ui.otherway.x) it.next();
            if (xVar2.f191033i) {
                arrayList2.add(xVar2);
            }
        }
        com.tencent.mm.pluginsdk.ui.tools.d0 d0Var = this.P;
        if (d0Var != null && this.f191331J && this.A == null && !this.E) {
            this.A = xVar;
            d0Var.a(true);
        }
        com.tencent.mm.pluginsdk.ui.tools.a0 a0Var = this.f191333e;
        if (a0Var != null) {
            a0Var.f191499d = arrayList;
            a0Var.notifyDataSetChanged();
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f191336h;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.notifyDataSetChanged();
        }
    }
}
