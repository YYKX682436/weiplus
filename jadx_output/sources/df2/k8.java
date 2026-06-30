package df2;

/* loaded from: classes3.dex */
public final class k8 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.s8 f230558d;

    public k8(df2.s8 s8Var) {
        this.f230558d = s8Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Boolean bool;
        java.util.LinkedList list;
        r45.nz3 nz3Var;
        java.util.LinkedList list2;
        r45.nz3 nz3Var2;
        r45.e84 e84Var;
        df2.a9 a9Var;
        java.util.LinkedList list3;
        java.lang.Object obj2;
        byte[] j17;
        df2.a9 a9Var2;
        java.util.LinkedList list4;
        r45.nz3 nz3Var3;
        mm2.y0 y0Var = (mm2.y0) obj;
        if (y0Var.f329549b == 7) {
            df2.s8 s8Var = this.f230558d;
            s8Var.getClass();
            boolean z17 = false;
            java.lang.Integer[] numArr = {1, 2};
            r45.e84 e84Var2 = s8Var.f231307s;
            boolean G = kz5.z.G(numArr, (e84Var2 == null || (list4 = e84Var2.getList(2)) == null || (nz3Var3 = (r45.nz3) kz5.n0.Z(list4)) == null) ? null : java.lang.Integer.valueOf(nz3Var3.getInteger(3)));
            r45.e84 e84Var3 = s8Var.f231307s;
            if (e84Var3 == null || (a9Var2 = (df2.a9) s8Var.controller(df2.a9.class)) == null) {
                bool = null;
            } else {
                java.lang.String string = e84Var3.getString(5);
                if (string == null) {
                    string = "";
                }
                bool = java.lang.Boolean.valueOf(a9Var2.Z6(string));
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click send fund gift result = ");
            qs5.m mVar = y0Var.f329548a;
            sb6.append(mVar);
            sb6.append(", isUvTask = ");
            sb6.append(G);
            sb6.append(", isTaskSend = ");
            sb6.append(bool);
            java.lang.String sb7 = sb6.toString();
            java.lang.String str = s8Var.f231299m;
            com.tencent.mars.xlog.Log.i(str, sb7);
            if (mVar == qs5.m.f366438d) {
                if (G && (e84Var = s8Var.f231307s) != null && (a9Var = (df2.a9) s8Var.controller(df2.a9.class)) != null) {
                    if (a9Var.f229694t == null) {
                        com.tencent.mm.sdk.platformtools.o4 a76 = a9Var.a7();
                        kotlin.jvm.internal.o.f(a76, "<get-mmkv>(...)");
                        java.lang.String str2 = a9Var.f229691q;
                        if (a76.f(str2) && (j17 = a76.j(str2)) != null) {
                            if (!(j17.length == 0)) {
                                try {
                                    java.lang.Object newInstance = r45.yb4.class.newInstance();
                                    ((com.tencent.mm.protobuf.f) newInstance).parseFrom(j17);
                                    obj2 = (com.tencent.mm.protobuf.f) newInstance;
                                } catch (java.lang.Exception e17) {
                                    com.tencent.mars.xlog.Log.printErrStackTrace("MultiProcessMMKV.decodeProtoBuffer", e17, "decode ProtoBuffer", new java.lang.Object[0]);
                                }
                                a9Var.f229694t = (r45.yb4) obj2;
                            }
                        }
                        obj2 = null;
                        a9Var.f229694t = (r45.yb4) obj2;
                    }
                    if (a9Var.f229694t == null) {
                        r45.yb4 yb4Var = new r45.yb4();
                        yb4Var.set(0, new java.util.LinkedList());
                        a9Var.f229694t = yb4Var;
                    }
                    r45.yb4 yb4Var2 = a9Var.f229694t;
                    if (yb4Var2 != null && (list3 = yb4Var2.getList(0)) != null) {
                        r45.cd4 cd4Var = new r45.cd4();
                        cd4Var.set(1, e84Var.getString(5));
                        cd4Var.set(0, java.lang.Integer.valueOf(e84Var.getInteger(1)));
                        list3.add(cd4Var);
                    }
                    ((ku5.t0) ku5.t0.f312615d).q(new df2.y8(false, a9Var));
                }
                r45.e84 e84Var4 = s8Var.f231307s;
                if (e84Var4 != null && (list2 = e84Var4.getList(2)) != null && (nz3Var2 = (r45.nz3) kz5.n0.Z(list2)) != null && nz3Var2.getInteger(3) == 2) {
                    z17 = true;
                }
                if (!z17) {
                    s8Var.k7(2);
                }
                df2.a9 a9Var3 = (df2.a9) s8Var.controller(df2.a9.class);
                if (a9Var3 != null) {
                    a9Var3.c7(c01.id.e());
                }
                if (!G || kotlin.jvm.internal.o.b(bool, java.lang.Boolean.FALSE)) {
                    r45.e84 e84Var5 = s8Var.f231307s;
                    if (e84Var5 != null && (list = e84Var5.getList(2)) != null && (nz3Var = (r45.nz3) kz5.n0.Z(list)) != null) {
                        nz3Var.set(2, java.lang.Integer.valueOf(nz3Var.getInteger(2) + 1));
                        android.widget.TextView textView = s8Var.F;
                        if (textView != null) {
                            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                            sb8.append(nz3Var.getInteger(2));
                            sb8.append(' ');
                            textView.setText(sb8.toString());
                        }
                    }
                } else {
                    com.tencent.mars.xlog.Log.i(str, "task already send, not plus local data");
                }
                df2.s8.Z6(s8Var, "onGiftSendInstantClick");
                df2.h7 h7Var = df2.h7.f230301d;
                df2.h7 h7Var2 = df2.h7.f230302e;
                if (kz5.z.G(new df2.h7[]{h7Var, h7Var2}, s8Var.B1)) {
                    s8Var.m7(h7Var2);
                }
            }
        }
    }
}
