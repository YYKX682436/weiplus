package r45;

/* loaded from: classes4.dex */
public class za extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f391841d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f391842e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f391843f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f391844g;

    /* renamed from: h, reason: collision with root package name */
    public r45.ab f391845h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.za)) {
            return false;
        }
        r45.za zaVar = (r45.za) fVar;
        return n51.f.a(this.f391841d, zaVar.f391841d) && n51.f.a(this.f391842e, zaVar.f391842e) && n51.f.a(this.f391843f, zaVar.f391843f) && n51.f.a(this.f391844g, zaVar.f391844g) && n51.f.a(this.f391845h, zaVar.f391845h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f391841d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f391842e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f391843f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f391844g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            r45.ab abVar = this.f391845h;
            if (abVar != null) {
                fVar.i(5, abVar.computeSize());
                this.f391845h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f391841d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f391842e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f391843f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f391844g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            r45.ab abVar2 = this.f391845h;
            return abVar2 != null ? j17 + b36.f.i(5, abVar2.computeSize()) : j17;
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
        r45.za zaVar = (r45.za) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            zaVar.f391841d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            zaVar.f391842e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            zaVar.f391843f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            zaVar.f391844g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.ab abVar3 = new r45.ab();
            if (bArr != null && bArr.length > 0) {
                abVar3.parseFrom(bArr);
            }
            zaVar.f391845h = abVar3;
        }
        return 0;
    }
}
