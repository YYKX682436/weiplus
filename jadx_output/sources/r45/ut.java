package r45;

/* loaded from: classes8.dex */
public class ut extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387626d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387627e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f387628f;

    /* renamed from: g, reason: collision with root package name */
    public int f387629g;

    /* renamed from: h, reason: collision with root package name */
    public r45.iu f387630h;

    /* renamed from: i, reason: collision with root package name */
    public int f387631i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ut)) {
            return false;
        }
        r45.ut utVar = (r45.ut) fVar;
        return n51.f.a(this.f387626d, utVar.f387626d) && n51.f.a(this.f387627e, utVar.f387627e) && n51.f.a(this.f387628f, utVar.f387628f) && n51.f.a(java.lang.Integer.valueOf(this.f387629g), java.lang.Integer.valueOf(utVar.f387629g)) && n51.f.a(this.f387630h, utVar.f387630h) && n51.f.a(java.lang.Integer.valueOf(this.f387631i), java.lang.Integer.valueOf(utVar.f387631i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f387626d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f387627e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f387628f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f387629g);
            r45.iu iuVar = this.f387630h;
            if (iuVar != null) {
                fVar.i(5, iuVar.computeSize());
                this.f387630h.writeFields(fVar);
            }
            fVar.e(6, this.f387631i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f387626d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f387627e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f387628f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            int e17 = j17 + b36.f.e(4, this.f387629g);
            r45.iu iuVar2 = this.f387630h;
            if (iuVar2 != null) {
                e17 += b36.f.i(5, iuVar2.computeSize());
            }
            return e17 + b36.f.e(6, this.f387631i);
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
        r45.ut utVar = (r45.ut) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                utVar.f387626d = aVar2.k(intValue);
                return 0;
            case 2:
                utVar.f387627e = aVar2.k(intValue);
                return 0;
            case 3:
                utVar.f387628f = aVar2.k(intValue);
                return 0;
            case 4:
                utVar.f387629g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.iu iuVar3 = new r45.iu();
                    if (bArr != null && bArr.length > 0) {
                        iuVar3.parseFrom(bArr);
                    }
                    utVar.f387630h = iuVar3;
                }
                return 0;
            case 6:
                utVar.f387631i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
