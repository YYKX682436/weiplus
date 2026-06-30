package r45;

/* loaded from: classes11.dex */
public class xq6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f390342d;

    /* renamed from: e, reason: collision with root package name */
    public int f390343e;

    /* renamed from: f, reason: collision with root package name */
    public int f390344f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f390345g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f390346h;

    /* renamed from: i, reason: collision with root package name */
    public r45.qk0 f390347i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xq6)) {
            return false;
        }
        r45.xq6 xq6Var = (r45.xq6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f390342d), java.lang.Integer.valueOf(xq6Var.f390342d)) && n51.f.a(java.lang.Integer.valueOf(this.f390343e), java.lang.Integer.valueOf(xq6Var.f390343e)) && n51.f.a(java.lang.Integer.valueOf(this.f390344f), java.lang.Integer.valueOf(xq6Var.f390344f)) && n51.f.a(this.f390345g, xq6Var.f390345g) && n51.f.a(this.f390346h, xq6Var.f390346h) && n51.f.a(this.f390347i, xq6Var.f390347i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f390342d);
            fVar.e(2, this.f390343e);
            fVar.e(3, this.f390344f);
            java.lang.String str = this.f390345g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f390346h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            r45.qk0 qk0Var = this.f390347i;
            if (qk0Var != null) {
                fVar.i(6, qk0Var.computeSize());
                this.f390347i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f390342d) + 0 + b36.f.e(2, this.f390343e) + b36.f.e(3, this.f390344f);
            java.lang.String str3 = this.f390345g;
            if (str3 != null) {
                e17 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f390346h;
            if (str4 != null) {
                e17 += b36.f.j(5, str4);
            }
            r45.qk0 qk0Var2 = this.f390347i;
            return qk0Var2 != null ? e17 + b36.f.i(6, qk0Var2.computeSize()) : e17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        r45.xq6 xq6Var = (r45.xq6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                xq6Var.f390342d = aVar2.g(intValue);
                return 0;
            case 2:
                xq6Var.f390343e = aVar2.g(intValue);
                return 0;
            case 3:
                xq6Var.f390344f = aVar2.g(intValue);
                return 0;
            case 4:
                xq6Var.f390345g = aVar2.k(intValue);
                return 0;
            case 5:
                xq6Var.f390346h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.qk0 qk0Var3 = new r45.qk0();
                    if (bArr != null && bArr.length > 0) {
                        qk0Var3.parseFrom(bArr);
                    }
                    xq6Var.f390347i = qk0Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
