package r45;

/* loaded from: classes8.dex */
public class id extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f376941d;

    /* renamed from: e, reason: collision with root package name */
    public int f376942e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f376943f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f376944g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f376945h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.id)) {
            return false;
        }
        r45.id idVar = (r45.id) fVar;
        return n51.f.a(this.f376941d, idVar.f376941d) && n51.f.a(java.lang.Integer.valueOf(this.f376942e), java.lang.Integer.valueOf(idVar.f376942e)) && n51.f.a(this.f376943f, idVar.f376943f) && n51.f.a(this.f376944g, idVar.f376944g) && n51.f.a(this.f376945h, idVar.f376945h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f376941d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f376942e);
            java.lang.String str2 = this.f376943f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f376944g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f376945h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f376941d;
            int j17 = (str5 != null ? 0 + b36.f.j(1, str5) : 0) + b36.f.e(2, this.f376942e);
            java.lang.String str6 = this.f376943f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f376944g;
            if (str7 != null) {
                j17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f376945h;
            return str8 != null ? j17 + b36.f.j(5, str8) : j17;
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
        r45.id idVar = (r45.id) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            idVar.f376941d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            idVar.f376942e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            idVar.f376943f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            idVar.f376944g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        idVar.f376945h = aVar2.k(intValue);
        return 0;
    }
}
