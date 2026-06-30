package r45;

/* loaded from: classes7.dex */
public class bf extends r45.mr5 {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f370716f;

    /* renamed from: g, reason: collision with root package name */
    public long f370717g;

    /* renamed from: h, reason: collision with root package name */
    public int f370718h;

    /* renamed from: i, reason: collision with root package name */
    public int f370719i;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f370714d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f370715e = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f370720m = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bf)) {
            return false;
        }
        r45.bf bfVar = (r45.bf) fVar;
        return n51.f.a(this.BaseRequest, bfVar.BaseRequest) && n51.f.a(this.f370714d, bfVar.f370714d) && n51.f.a(this.f370715e, bfVar.f370715e) && n51.f.a(this.f370716f, bfVar.f370716f) && n51.f.a(java.lang.Long.valueOf(this.f370717g), java.lang.Long.valueOf(bfVar.f370717g)) && n51.f.a(java.lang.Integer.valueOf(this.f370718h), java.lang.Integer.valueOf(bfVar.f370718h)) && n51.f.a(java.lang.Integer.valueOf(this.f370719i), java.lang.Integer.valueOf(bfVar.f370719i)) && n51.f.a(this.f370720m, bfVar.f370720m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f370714d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.g(2, 1, linkedList);
            fVar.g(3, 8, this.f370715e);
            java.lang.String str = this.f370716f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.h(5, this.f370717g);
            fVar.e(6, this.f370718h);
            fVar.e(7, this.f370719i);
            fVar.g(8, 8, this.f370720m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.g(2, 1, linkedList) + b36.f.g(3, 8, this.f370715e);
            java.lang.String str2 = this.f370716f;
            if (str2 != null) {
                i18 += b36.f.j(4, str2);
            }
            return i18 + b36.f.h(5, this.f370717g) + b36.f.e(6, this.f370718h) + b36.f.e(7, this.f370719i) + b36.f.g(8, 8, this.f370720m);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            this.f370715e.clear();
            this.f370720m.clear();
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
        r45.bf bfVar = (r45.bf) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    bfVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                bfVar.f370714d.add(aVar2.k(intValue));
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.gr5 gr5Var = new r45.gr5();
                    if (bArr3 != null && bArr3.length > 0) {
                        gr5Var.parseFrom(bArr3);
                    }
                    bfVar.f370715e.add(gr5Var);
                }
                return 0;
            case 4:
                bfVar.f370716f = aVar2.k(intValue);
                return 0;
            case 5:
                bfVar.f370717g = aVar2.i(intValue);
                return 0;
            case 6:
                bfVar.f370718h = aVar2.g(intValue);
                return 0;
            case 7:
                bfVar.f370719i = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.p20 p20Var = new r45.p20();
                    if (bArr4 != null && bArr4.length > 0) {
                        p20Var.parseFrom(bArr4);
                    }
                    bfVar.f370720m.add(p20Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
