package r45;

/* loaded from: classes11.dex */
public class fa extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f374119d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374120e;

    /* renamed from: f, reason: collision with root package name */
    public int f374121f;

    /* renamed from: g, reason: collision with root package name */
    public int f374122g;

    /* renamed from: h, reason: collision with root package name */
    public r45.ka f374123h;

    /* renamed from: i, reason: collision with root package name */
    public r45.ea f374124i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fa)) {
            return false;
        }
        r45.fa faVar = (r45.fa) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f374119d), java.lang.Integer.valueOf(faVar.f374119d)) && n51.f.a(this.f374120e, faVar.f374120e) && n51.f.a(java.lang.Integer.valueOf(this.f374121f), java.lang.Integer.valueOf(faVar.f374121f)) && n51.f.a(java.lang.Integer.valueOf(this.f374122g), java.lang.Integer.valueOf(faVar.f374122g)) && n51.f.a(this.f374123h, faVar.f374123h) && n51.f.a(this.f374124i, faVar.f374124i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f374119d);
            java.lang.String str = this.f374120e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f374121f);
            fVar.e(4, this.f374122g);
            r45.ka kaVar = this.f374123h;
            if (kaVar != null) {
                fVar.i(5, kaVar.computeSize());
                this.f374123h.writeFields(fVar);
            }
            r45.ea eaVar = this.f374124i;
            if (eaVar != null) {
                fVar.i(6, eaVar.computeSize());
                this.f374124i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f374119d) + 0;
            java.lang.String str2 = this.f374120e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            int e18 = e17 + b36.f.e(3, this.f374121f) + b36.f.e(4, this.f374122g);
            r45.ka kaVar2 = this.f374123h;
            if (kaVar2 != null) {
                e18 += b36.f.i(5, kaVar2.computeSize());
            }
            r45.ea eaVar2 = this.f374124i;
            return eaVar2 != null ? e18 + b36.f.i(6, eaVar2.computeSize()) : e18;
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
        r45.fa faVar = (r45.fa) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                faVar.f374119d = aVar2.g(intValue);
                return 0;
            case 2:
                faVar.f374120e = aVar2.k(intValue);
                return 0;
            case 3:
                faVar.f374121f = aVar2.g(intValue);
                return 0;
            case 4:
                faVar.f374122g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.ka kaVar3 = new r45.ka();
                    if (bArr != null && bArr.length > 0) {
                        kaVar3.parseFrom(bArr);
                    }
                    faVar.f374123h = kaVar3;
                }
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.ea eaVar3 = new r45.ea();
                    if (bArr2 != null && bArr2.length > 0) {
                        eaVar3.parseFrom(bArr2);
                    }
                    faVar.f374124i = eaVar3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
