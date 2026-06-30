package r45;

/* loaded from: classes2.dex */
public class oj6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382306d;

    /* renamed from: e, reason: collision with root package name */
    public r45.qj6 f382307e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f382308f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f382309g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f382310h;

    /* renamed from: i, reason: collision with root package name */
    public long f382311i;

    /* renamed from: m, reason: collision with root package name */
    public r45.rj6 f382312m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.oj6)) {
            return false;
        }
        r45.oj6 oj6Var = (r45.oj6) fVar;
        return n51.f.a(this.f382306d, oj6Var.f382306d) && n51.f.a(this.f382307e, oj6Var.f382307e) && n51.f.a(this.f382308f, oj6Var.f382308f) && n51.f.a(this.f382309g, oj6Var.f382309g) && n51.f.a(this.f382310h, oj6Var.f382310h) && n51.f.a(java.lang.Long.valueOf(this.f382311i), java.lang.Long.valueOf(oj6Var.f382311i)) && n51.f.a(this.f382312m, oj6Var.f382312m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f382309g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f382306d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.qj6 qj6Var = this.f382307e;
            if (qj6Var != null) {
                fVar.i(2, qj6Var.computeSize());
                this.f382307e.writeFields(fVar);
            }
            java.lang.String str2 = this.f382308f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.g(4, 8, linkedList);
            java.lang.String str3 = this.f382310h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.h(6, this.f382311i);
            r45.rj6 rj6Var = this.f382312m;
            if (rj6Var != null) {
                fVar.i(7, rj6Var.computeSize());
                this.f382312m.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f382306d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            r45.qj6 qj6Var2 = this.f382307e;
            if (qj6Var2 != null) {
                j17 += b36.f.i(2, qj6Var2.computeSize());
            }
            java.lang.String str5 = this.f382308f;
            if (str5 != null) {
                j17 += b36.f.j(3, str5);
            }
            int g17 = j17 + b36.f.g(4, 8, linkedList);
            java.lang.String str6 = this.f382310h;
            if (str6 != null) {
                g17 += b36.f.j(5, str6);
            }
            int h17 = g17 + b36.f.h(6, this.f382311i);
            r45.rj6 rj6Var2 = this.f382312m;
            return rj6Var2 != null ? h17 + b36.f.i(7, rj6Var2.computeSize()) : h17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        r45.oj6 oj6Var = (r45.oj6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                oj6Var.f382306d = aVar2.k(intValue);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.qj6 qj6Var3 = new r45.qj6();
                    if (bArr2 != null && bArr2.length > 0) {
                        qj6Var3.parseFrom(bArr2);
                    }
                    oj6Var.f382307e = qj6Var3;
                }
                return 0;
            case 3:
                oj6Var.f382308f = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.pj6 pj6Var = new r45.pj6();
                    if (bArr3 != null && bArr3.length > 0) {
                        pj6Var.parseFrom(bArr3);
                    }
                    oj6Var.f382309g.add(pj6Var);
                }
                return 0;
            case 5:
                oj6Var.f382310h = aVar2.k(intValue);
                return 0;
            case 6:
                oj6Var.f382311i = aVar2.i(intValue);
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    r45.rj6 rj6Var3 = new r45.rj6();
                    if (bArr4 != null && bArr4.length > 0) {
                        rj6Var3.parseFrom(bArr4);
                    }
                    oj6Var.f382312m = rj6Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
