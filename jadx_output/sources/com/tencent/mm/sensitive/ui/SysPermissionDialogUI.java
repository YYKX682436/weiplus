package com.tencent.mm.sensitive.ui;

@db5.a(7)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/sensitive/ui/SysPermissionDialogUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "sensitive_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class SysPermissionDialogUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: h, reason: collision with root package name */
    public static yz5.q f193193h;

    /* renamed from: d, reason: collision with root package name */
    public int f193194d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f193195e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.ArrayList f193196f;

    /* renamed from: g, reason: collision with root package name */
    public int f193197g = -1;

    public final void T6(d85.g0 g0Var, yz5.l lVar) {
        j85.h.b(j85.h.f298258a, 101L, java.lang.Long.valueOf(g0Var.f227193e), null, null, 12, null);
        k85.t tVar = k85.t.f305439a;
        int i17 = this.f193197g;
        tVar.j(this, g0Var, (i17 == 1001 || i17 == 1002) ? d85.f0.U : null, new k85.v(g0Var, this, lVar));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        int i17 = getContext().getResources().getConfiguration().orientation;
        vj5.o.e(getWindow());
        java.util.ArrayList<java.lang.String> stringArrayListExtra = getIntent().getStringArrayListExtra("KEY_PERMISSION_LIST");
        jz5.f0 f0Var = null;
        java.lang.String[] strArr = stringArrayListExtra != null ? (java.lang.String[]) stringArrayListExtra.toArray(new java.lang.String[0]) : null;
        this.f193197g = getIntent().getIntExtra("KEY_PERMISSION_REQUEST_CODE", -1);
        if (strArr != null) {
            this.f193195e = new java.util.ArrayList();
            for (java.lang.String str : strArr) {
                java.util.HashMap hashMap = e85.i.f250315a;
                d85.g0 g0Var = (d85.g0) e85.i.f250316b.get(str);
                if (g0Var != null) {
                    java.util.ArrayList arrayList = this.f193195e;
                    kotlin.jvm.internal.o.d(arrayList);
                    if (!(true ^ arrayList.contains(g0Var))) {
                        g0Var = null;
                    }
                    if (g0Var != null) {
                        java.util.ArrayList arrayList2 = this.f193195e;
                        kotlin.jvm.internal.o.d(arrayList2);
                        arrayList2.add(g0Var);
                    }
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.ArrayList arrayList4 = this.f193195e;
            kotlin.jvm.internal.o.d(arrayList4);
            arrayList3.addAll(arrayList4);
            this.f193196f = arrayList3;
            yz5.q qVar = f193193h;
            this.f193194d = qVar != null ? qVar.hashCode() : 0;
            java.util.ArrayList arrayList5 = this.f193196f;
            kotlin.jvm.internal.o.d(arrayList5);
            if (!(!arrayList5.isEmpty())) {
                arrayList5 = null;
            }
            jz5.f0 f0Var2 = jz5.f0.f302826a;
            if (arrayList5 != null) {
                T6((d85.g0) kz5.n0.X(arrayList5), new k85.u(this, strArr));
                f0Var = f0Var2;
            }
            if (f0Var == null) {
                getIntent().putExtra("IS_FROM_DELEGATE", true);
                java.util.ArrayList arrayList6 = this.f193195e;
                if (arrayList6 != null) {
                    java.util.Iterator it = arrayList6.iterator();
                    while (it.hasNext()) {
                        j85.h.b(j85.h.f298258a, 151L, java.lang.Long.valueOf(((d85.g0) it.next()).f227193e), null, null, 12, null);
                    }
                }
                z2.h.a(this, strArr, this.f193197g);
            }
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            finish();
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        java.util.HashMap hashMap;
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        int length = grantResults.length;
        int i18 = 0;
        int i19 = 0;
        while (i18 < length) {
            int i27 = grantResults[i18];
            int i28 = i19 + 1;
            java.util.HashMap hashMap2 = e85.i.f250315a;
            d85.g0 g0Var = (d85.g0) e85.i.f250316b.get(permissions[i19]);
            if (g0Var != null) {
                int i29 = grantResults[i19];
                j85.h hVar = j85.h.f298258a;
                int i37 = g0Var.f227193e;
                if (i29 != -1) {
                    e85.h hVar2 = (e85.h) e85.i.f250315a.get(g0Var);
                    if (hVar2 != null && (hashMap = hVar2.f250314c) != null) {
                        for (java.util.Map.Entry entry : hashMap.entrySet()) {
                            ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).sj(g0Var.f227192d, ((d85.f0) entry.getKey()).f227176d, !r9.mj(g0Var, (d85.f0) entry.getKey()));
                        }
                    }
                    j85.h.b(hVar, 162L, java.lang.Long.valueOf(i37), null, java.lang.Boolean.TRUE, 4, null);
                } else if (z2.h.b(getContext(), permissions[i19])) {
                    j85.h.b(hVar, 163L, java.lang.Long.valueOf(i37), null, java.lang.Boolean.TRUE, 4, null);
                } else {
                    j85.h.b(hVar, 164L, java.lang.Long.valueOf(i37), null, java.lang.Boolean.TRUE, 4, null);
                }
            }
            i18++;
            i19 = i28;
        }
        finish();
        yz5.q qVar = f193193h;
        if (qVar != null) {
            qVar.invoke(java.lang.Integer.valueOf(i17), permissions, grantResults);
        }
        yz5.q qVar2 = f193193h;
        if ((qVar2 != null ? qVar2.hashCode() : 0) == this.f193194d) {
            f193193h = null;
        }
    }
}
