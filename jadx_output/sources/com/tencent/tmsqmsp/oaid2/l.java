package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes16.dex */
public abstract /* synthetic */ class l {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f215605a;

    /* loaded from: classes8.dex */
    public class b extends com.tencent.tmsqmsp.oaid2.i.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.tmsqmsp.oaid2.n1 f215606a;

        public b(com.tencent.tmsqmsp.oaid2.n1 n1Var) {
            this.f215606a = n1Var;
        }

        @Override // com.tencent.tmsqmsp.oaid2.i
        public void a(int i17, long j17, boolean z17, float f17, double d17, java.lang.String str) {
        }

        @Override // com.tencent.tmsqmsp.oaid2.i
        public void a(int i17, android.os.Bundle bundle) {
            if (bundle == null) {
                com.tencent.tmsqmsp.oaid2.t0.a("honor get oaid,bundle is null");
            } else {
                java.lang.String string = bundle.getString("oa_id_flag");
                this.f215606a.f215623e.f215617a = string;
                com.tencent.tmsqmsp.oaid2.t0.b("honor got oaid is ".concat(java.lang.String.valueOf(string)));
            }
            this.f215606a.f215622d.countDown();
        }
    }

    /* loaded from: classes8.dex */
    public class c extends com.tencent.tmsqmsp.oaid2.i.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.tmsqmsp.oaid2.n1 f215607a;

        public c(com.tencent.tmsqmsp.oaid2.n1 n1Var) {
            this.f215607a = n1Var;
        }

        @Override // com.tencent.tmsqmsp.oaid2.i
        public void a(int i17, long j17, boolean z17, float f17, double d17, java.lang.String str) {
        }

        @Override // com.tencent.tmsqmsp.oaid2.i
        public void a(int i17, android.os.Bundle bundle) {
            if (bundle == null) {
                com.tencent.tmsqmsp.oaid2.t0.a("honor get oaid_limit_state,bundle is null");
            } else {
                boolean z17 = bundle.getBoolean("oa_id_limit_state");
                this.f215607a.f215623e.f215618b = z17;
                com.tencent.tmsqmsp.oaid2.t0.b("honor got oaid_limit_state is ".concat(java.lang.String.valueOf(z17)));
            }
            this.f215607a.f215622d.countDown();
        }
    }

    static {
        int[] iArr = new int[com.tencent.tmsqmsp.oaid2.d.c().length];
        f215605a = iArr;
        try {
            iArr[com.tencent.tmsqmsp.oaid2.d.f215562b.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f215605a[com.tencent.tmsqmsp.oaid2.d.f215563c.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            f215605a[com.tencent.tmsqmsp.oaid2.d.f215564d.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            f215605a[com.tencent.tmsqmsp.oaid2.d.f215565e.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            f215605a[com.tencent.tmsqmsp.oaid2.d.f215566f.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            f215605a[com.tencent.tmsqmsp.oaid2.d.f215567g.ordinal()] = 6;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        try {
            f215605a[com.tencent.tmsqmsp.oaid2.d.f215568h.ordinal()] = 7;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
        try {
            f215605a[com.tencent.tmsqmsp.oaid2.d.f215569i.ordinal()] = 8;
        } catch (java.lang.NoSuchFieldError unused8) {
        }
        try {
            f215605a[com.tencent.tmsqmsp.oaid2.d.f215570j.ordinal()] = 9;
        } catch (java.lang.NoSuchFieldError unused9) {
        }
        try {
            f215605a[com.tencent.tmsqmsp.oaid2.d.f215571k.ordinal()] = 10;
        } catch (java.lang.NoSuchFieldError unused10) {
        }
        try {
            f215605a[com.tencent.tmsqmsp.oaid2.d.f215572l.ordinal()] = 11;
        } catch (java.lang.NoSuchFieldError unused11) {
        }
        try {
            f215605a[com.tencent.tmsqmsp.oaid2.d.f215561a.ordinal()] = 12;
        } catch (java.lang.NoSuchFieldError unused12) {
        }
    }
}
