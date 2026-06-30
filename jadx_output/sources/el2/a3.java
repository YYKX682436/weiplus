package el2;

/* loaded from: classes3.dex */
public final class a3 implements el2.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.qy1 f253746a;

    public a3(r45.qy1 item) {
        kotlin.jvm.internal.o.g(item, "item");
        this.f253746a = item;
    }

    @Override // el2.v2
    public java.lang.String a() {
        bw5.mb0 P0 = zl2.r4.f473950a.P0(this.f253746a);
        if (P0 != null) {
            return P0.b();
        }
        return null;
    }

    @Override // el2.v2
    public java.lang.String b() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.Object[] objArr = new java.lang.Object[2];
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        r45.qy1 qy1Var = this.f253746a;
        objArr[0] = r4Var.d1(context2, r4Var.P0(qy1Var));
        bw5.mb0 P0 = r4Var.P0(qy1Var);
        objArr[1] = java.lang.Integer.valueOf(P0 != null ? P0.f30156m : 0);
        return context.getString(com.tencent.mm.R.string.m5q, objArr);
    }

    @Override // el2.v2
    public java.lang.String c() {
        return "";
    }

    @Override // el2.v2
    public java.lang.String d() {
        bw5.mb0 P0 = zl2.r4.f473950a.P0(this.f253746a);
        if (P0 != null) {
            return P0.c();
        }
        return null;
    }

    @Override // el2.v2
    public r45.a52 e() {
        r45.a52 a52Var = new r45.a52();
        a52Var.set(0, 19);
        a52Var.set(2, new com.tencent.mm.protobuf.g(this.f253746a.toByteArray()));
        return a52Var;
    }

    @Override // el2.v2
    public jz5.l f() {
        return null;
    }

    @Override // el2.v2
    public java.lang.Object getData() {
        return this.f253746a;
    }

    @Override // el2.v2
    public java.lang.String getTitle() {
        bw5.mb0 P0 = zl2.r4.f473950a.P0(this.f253746a);
        if (P0 != null) {
            return P0.getName();
        }
        return null;
    }

    @Override // el2.v2
    public int getType() {
        return 19;
    }
}
