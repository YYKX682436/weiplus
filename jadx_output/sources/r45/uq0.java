package r45;

/* loaded from: classes9.dex */
public class uq0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387564d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f387565e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public long f387566f;

    /* renamed from: g, reason: collision with root package name */
    public long f387567g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f387568h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f387569i;

    /* renamed from: m, reason: collision with root package name */
    public long f387570m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f387571n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uq0)) {
            return false;
        }
        r45.uq0 uq0Var = (r45.uq0) fVar;
        return n51.f.a(this.f387564d, uq0Var.f387564d) && n51.f.a(this.f387565e, uq0Var.f387565e) && n51.f.a(java.lang.Long.valueOf(this.f387566f), java.lang.Long.valueOf(uq0Var.f387566f)) && n51.f.a(java.lang.Long.valueOf(this.f387567g), java.lang.Long.valueOf(uq0Var.f387567g)) && n51.f.a(this.f387568h, uq0Var.f387568h) && n51.f.a(this.f387569i, uq0Var.f387569i) && n51.f.a(java.lang.Long.valueOf(this.f387570m), java.lang.Long.valueOf(uq0Var.f387570m)) && n51.f.a(this.f387571n, uq0Var.f387571n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f387564d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, this.f387565e);
            fVar.h(3, this.f387566f);
            fVar.h(4, this.f387567g);
            java.lang.String str2 = this.f387568h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f387569i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.h(7, this.f387570m);
            java.lang.String str4 = this.f387571n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f387564d;
            int j17 = (str5 != null ? 0 + b36.f.j(1, str5) : 0) + b36.f.g(2, 8, this.f387565e) + b36.f.h(3, this.f387566f) + b36.f.h(4, this.f387567g);
            java.lang.String str6 = this.f387568h;
            if (str6 != null) {
                j17 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f387569i;
            if (str7 != null) {
                j17 += b36.f.j(6, str7);
            }
            int h17 = j17 + b36.f.h(7, this.f387570m);
            java.lang.String str8 = this.f387571n;
            return str8 != null ? h17 + b36.f.j(8, str8) : h17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f387565e.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.uq0 uq0Var = (r45.uq0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                uq0Var.f387564d = aVar2.k(intValue);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.vq0 vq0Var = new r45.vq0();
                    if (bArr2 != null && bArr2.length > 0) {
                        vq0Var.parseFrom(bArr2);
                    }
                    uq0Var.f387565e.add(vq0Var);
                }
                return 0;
            case 3:
                uq0Var.f387566f = aVar2.i(intValue);
                return 0;
            case 4:
                uq0Var.f387567g = aVar2.i(intValue);
                return 0;
            case 5:
                uq0Var.f387568h = aVar2.k(intValue);
                return 0;
            case 6:
                uq0Var.f387569i = aVar2.k(intValue);
                return 0;
            case 7:
                uq0Var.f387570m = aVar2.i(intValue);
                return 0;
            case 8:
                uq0Var.f387571n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
