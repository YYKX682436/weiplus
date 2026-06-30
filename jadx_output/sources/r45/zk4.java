package r45;

/* loaded from: classes9.dex */
public class zk4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f392167d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f392168e;

    /* renamed from: f, reason: collision with root package name */
    public int f392169f;

    /* renamed from: g, reason: collision with root package name */
    public int f392170g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f392171h;

    /* renamed from: i, reason: collision with root package name */
    public long f392172i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f392173m;

    /* renamed from: n, reason: collision with root package name */
    public int f392174n;

    /* renamed from: o, reason: collision with root package name */
    public int f392175o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zk4)) {
            return false;
        }
        r45.zk4 zk4Var = (r45.zk4) fVar;
        return n51.f.a(this.BaseRequest, zk4Var.BaseRequest) && n51.f.a(this.f392167d, zk4Var.f392167d) && n51.f.a(this.f392168e, zk4Var.f392168e) && n51.f.a(java.lang.Integer.valueOf(this.f392169f), java.lang.Integer.valueOf(zk4Var.f392169f)) && n51.f.a(java.lang.Integer.valueOf(this.f392170g), java.lang.Integer.valueOf(zk4Var.f392170g)) && n51.f.a(this.f392171h, zk4Var.f392171h) && n51.f.a(java.lang.Long.valueOf(this.f392172i), java.lang.Long.valueOf(zk4Var.f392172i)) && n51.f.a(this.f392173m, zk4Var.f392173m) && n51.f.a(java.lang.Integer.valueOf(this.f392174n), java.lang.Integer.valueOf(zk4Var.f392174n)) && n51.f.a(java.lang.Integer.valueOf(this.f392175o), java.lang.Integer.valueOf(zk4Var.f392175o));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            java.lang.String str = this.f392167d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f392168e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f392169f);
            fVar.e(5, this.f392170g);
            java.lang.String str3 = this.f392171h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.h(7, this.f392172i);
            java.lang.String str4 = this.f392173m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            fVar.e(9, this.f392174n);
            fVar.e(11, this.f392175o);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str5 = this.f392167d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f392168e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            int e17 = i18 + b36.f.e(4, this.f392169f) + b36.f.e(5, this.f392170g);
            java.lang.String str7 = this.f392171h;
            if (str7 != null) {
                e17 += b36.f.j(6, str7);
            }
            int h17 = e17 + b36.f.h(7, this.f392172i);
            java.lang.String str8 = this.f392173m;
            if (str8 != null) {
                h17 += b36.f.j(8, str8);
            }
            return h17 + b36.f.e(9, this.f392174n) + b36.f.e(11, this.f392175o);
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
        r45.zk4 zk4Var = (r45.zk4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    zk4Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                zk4Var.f392167d = aVar2.k(intValue);
                return 0;
            case 3:
                zk4Var.f392168e = aVar2.k(intValue);
                return 0;
            case 4:
                zk4Var.f392169f = aVar2.g(intValue);
                return 0;
            case 5:
                zk4Var.f392170g = aVar2.g(intValue);
                return 0;
            case 6:
                zk4Var.f392171h = aVar2.k(intValue);
                return 0;
            case 7:
                zk4Var.f392172i = aVar2.i(intValue);
                return 0;
            case 8:
                zk4Var.f392173m = aVar2.k(intValue);
                return 0;
            case 9:
                zk4Var.f392174n = aVar2.g(intValue);
                return 0;
            case 10:
            default:
                return -1;
            case 11:
                zk4Var.f392175o = aVar2.g(intValue);
                return 0;
        }
    }
}
