package com.tencent.mm.plugin.profile;

/* loaded from: classes11.dex */
public class s0 implements vh0.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f153605a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f153606b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153607c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f153608d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153609e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.e0 f153610f;

    public s0(com.tencent.mm.plugin.profile.e0 e0Var, com.tencent.mm.storage.z3 z3Var, int i17, java.lang.String str, java.util.LinkedList linkedList, java.lang.String str2) {
        this.f153610f = e0Var;
        this.f153605a = z3Var;
        this.f153606b = i17;
        this.f153607c = str;
        this.f153608d = linkedList;
        this.f153609e = str2;
    }

    @Override // vh0.i1
    public void onResult(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            com.tencent.mm.plugin.profile.e0 e0Var = this.f153610f;
            final r35.a aVar = new r35.a(e0Var.f153420d, new com.tencent.mm.plugin.profile.t0(this));
            java.lang.String str = this.f153607c;
            boolean isEmpty = android.text.TextUtils.isEmpty(str);
            final com.tencent.mm.storage.z3 z3Var = this.f153605a;
            if (isEmpty) {
                str = z3Var.F1;
            }
            boolean isEmpty2 = android.text.TextUtils.isEmpty(str);
            final java.util.LinkedList linkedList = this.f153608d;
            if (!isEmpty2) {
                aVar.m(str);
                aVar.b(z3Var.d1(), linkedList, false, "");
                return;
            }
            ((c01.k7) c01.n8.a()).e(z3Var.d1());
            ((java.util.LinkedList) e0Var.f153435v).add(z3Var.d1());
            c01.p8 a17 = c01.n8.a();
            java.lang.String d17 = z3Var.d1();
            int a18 = r35.s.a(java.lang.Integer.valueOf(e0Var.f153423g));
            final java.lang.String str2 = this.f153609e;
            ((c01.k7) a17).g(d17, str2, a18, new c01.o8() { // from class: com.tencent.mm.plugin.profile.s0$$a
                @Override // c01.o8
                public final void a(java.lang.String str3, boolean z17) {
                    java.lang.String str4;
                    com.tencent.mm.storage.e8 q17 = c01.d9.b().q();
                    com.tencent.mm.storage.z3 z3Var2 = com.tencent.mm.storage.z3.this;
                    com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) q17).n(z3Var2.d1(), true);
                    if (n17 == null || (str4 = n17.F1) == null) {
                        str4 = "";
                    }
                    if (android.text.TextUtils.isEmpty(str4)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.NewContactWidgetNormal", "[-] yuanbao: getContact during addContact still get empty antispam ticket.");
                    }
                    r35.a aVar2 = aVar;
                    aVar2.m(str4);
                    aVar2.a(z3Var2.d1(), str2, linkedList);
                }
            });
        }
    }
}
