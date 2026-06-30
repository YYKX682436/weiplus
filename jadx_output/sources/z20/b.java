package z20;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public z20.e f469537a = z20.e.f469543e;

    /* renamed from: b, reason: collision with root package name */
    public bw5.q9 f469538b;

    static {
        new z20.a(null);
    }

    public b() {
        bw5.q9 q9Var = bw5.q9.f31998v;
        kotlin.jvm.internal.o.f(q9Var, "getDefaultInstance(...)");
        this.f469538b = q9Var;
    }

    public final void a() {
        int i17 = y02.d1.f458598d;
        y02.b1 b1Var = (y02.b1) urgen.ur_E2DE.UR_4FCA.UR_1332();
        if (b1Var == null) {
            com.tencent.mars.xlog.Log.w("ECS.Tracker", "EcsTracker_UrCpp.sharedInstance() is null");
            return;
        }
        int ordinal = this.f469537a.ordinal();
        if (ordinal == 0) {
            bw5.q9 info = this.f469538b;
            kotlin.jvm.internal.o.g(info, "info");
            byte[] byteArray = info.toByteArray();
            long cppPointer = ((y02.d1) b1Var).getCppPointer();
            kotlin.jvm.internal.o.d(byteArray);
            urgen.ur_E2DE.UR_4FCA.UR_6B92(cppPointer, byteArray);
            return;
        }
        if (ordinal == 2) {
            bw5.q9 info2 = this.f469538b;
            kotlin.jvm.internal.o.g(info2, "info");
            byte[] byteArray2 = info2.toByteArray();
            long cppPointer2 = ((y02.d1) b1Var).getCppPointer();
            kotlin.jvm.internal.o.d(byteArray2);
            urgen.ur_E2DE.UR_4FCA.UR_AE53(cppPointer2, byteArray2, 1);
            return;
        }
        if (ordinal != 3) {
            bw5.q9 info3 = this.f469538b;
            kotlin.jvm.internal.o.g(info3, "info");
            byte[] byteArray3 = info3.toByteArray();
            long cppPointer3 = ((y02.d1) b1Var).getCppPointer();
            kotlin.jvm.internal.o.d(byteArray3);
            urgen.ur_E2DE.UR_4FCA.UR_433B(cppPointer3, byteArray3);
            return;
        }
        bw5.q9 info4 = this.f469538b;
        kotlin.jvm.internal.o.g(info4, "info");
        byte[] byteArray4 = info4.toByteArray();
        long cppPointer4 = ((y02.d1) b1Var).getCppPointer();
        kotlin.jvm.internal.o.d(byteArray4);
        urgen.ur_E2DE.UR_4FCA.UR_AE53(cppPointer4, byteArray4, 2);
    }

    public final z20.b b(java.lang.String str) {
        if (str != null) {
            this.f469538b.f32011s.add(str);
        }
        return this;
    }

    public final z20.b c(java.lang.String str) {
        if (str != null) {
            bw5.q9 q9Var = this.f469538b;
            q9Var.f32002g = str;
            q9Var.f32013u[4] = true;
        }
        return this;
    }

    public final void d() {
        a();
        int i17 = y02.d1.f458598d;
        y02.b1 b1Var = (y02.b1) urgen.ur_E2DE.UR_4FCA.UR_1332();
        if (b1Var == null) {
            com.tencent.mars.xlog.Log.w("ECS.Tracker", "EcsTracker_UrCpp.sharedInstance() is null");
            return;
        }
        bw5.q9 q9Var = this.f469538b;
        boolean[] zArr = q9Var.f32013u;
        boolean z17 = zArr[1];
        java.lang.String str = "";
        java.lang.String str2 = (z17 && z17) ? q9Var.f31999d : "";
        boolean z18 = zArr[2];
        if (z18 && z18) {
            str = q9Var.f32000e;
        }
        kotlin.jvm.internal.o.d(str2);
        kotlin.jvm.internal.o.d(str);
        urgen.ur_E2DE.UR_4FCA.UR_A772(((y02.d1) b1Var).getCppPointer(), str2, str, 1);
    }

    public final z20.b e(java.util.Map map) {
        if (map != null) {
            bw5.q9 q9Var = this.f469538b;
            q9Var.f32009q = new org.json.JSONObject(map).toString();
            q9Var.f32013u[12] = true;
        }
        return this;
    }

    public final z20.b f(java.lang.String str) {
        if (str != null) {
            bw5.q9 q9Var = this.f469538b;
            q9Var.f32000e = str;
            q9Var.f32013u[2] = true;
        }
        return this;
    }
}
