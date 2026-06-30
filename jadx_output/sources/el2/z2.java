package el2;

/* loaded from: classes3.dex */
public final class z2 implements el2.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f253958a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.wd5 f253959b;

    public z2(int i17, r45.wd5 item) {
        kotlin.jvm.internal.o.g(item, "item");
        this.f253958a = i17;
        this.f253959b = item;
    }

    @Override // el2.v2
    public java.lang.String a() {
        return this.f253959b.getString(5);
    }

    @Override // el2.v2
    public java.lang.String b() {
        r45.wd5 wd5Var = this.f253959b;
        if (wd5Var.getInteger(6) == 0) {
            java.lang.String string = wd5Var.getString(7);
            return !(string == null || string.length() == 0) ? wd5Var.getString(7) : com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.e8p);
        }
        java.lang.String string2 = wd5Var.getString(7);
        if (string2 == null || string2.length() == 0) {
            string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.otr);
        }
        if (wd5Var.getInteger(8) <= 0) {
            return string2;
        }
        return string2 + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LOG + com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.ots, java.lang.Integer.valueOf(wd5Var.getInteger(8)));
    }

    @Override // el2.v2
    public java.lang.String c() {
        return "";
    }

    @Override // el2.v2
    public java.lang.String d() {
        return this.f253959b.getString(1);
    }

    @Override // el2.v2
    public r45.a52 e() {
        r45.a52 a52Var = new r45.a52();
        a52Var.set(0, java.lang.Integer.valueOf(this.f253958a));
        r45.e52 e52Var = new r45.e52();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(this.f253959b);
        e52Var.set(0, linkedList);
        a52Var.set(2, new com.tencent.mm.protobuf.g(e52Var.toByteArray()));
        return a52Var;
    }

    @Override // el2.v2
    public jz5.l f() {
        return null;
    }

    @Override // el2.v2
    public java.lang.Object getData() {
        return this.f253959b;
    }

    @Override // el2.v2
    public java.lang.String getTitle() {
        return this.f253959b.getString(0);
    }

    @Override // el2.v2
    public int getType() {
        return this.f253958a;
    }
}
