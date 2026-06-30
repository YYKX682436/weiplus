package r45;

/* loaded from: classes8.dex */
public class kw extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378991d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378992e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f378993f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f378994g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f378995h;

    /* renamed from: i, reason: collision with root package name */
    public int f378996i;

    /* renamed from: m, reason: collision with root package name */
    public long f378997m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kw)) {
            return false;
        }
        r45.kw kwVar = (r45.kw) fVar;
        return n51.f.a(this.BaseRequest, kwVar.BaseRequest) && n51.f.a(this.f378991d, kwVar.f378991d) && n51.f.a(this.f378992e, kwVar.f378992e) && n51.f.a(this.f378993f, kwVar.f378993f) && n51.f.a(java.lang.Boolean.valueOf(this.f378994g), java.lang.Boolean.valueOf(kwVar.f378994g)) && n51.f.a(this.f378995h, kwVar.f378995h) && n51.f.a(java.lang.Integer.valueOf(this.f378996i), java.lang.Integer.valueOf(kwVar.f378996i)) && n51.f.a(java.lang.Long.valueOf(this.f378997m), java.lang.Long.valueOf(kwVar.f378997m));
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
            java.lang.String str = this.f378991d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f378992e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f378993f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.a(5, this.f378994g);
            java.lang.String str4 = this.f378995h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f378996i);
            fVar.h(8, this.f378997m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str5 = this.f378991d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f378992e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f378993f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            int a17 = i18 + b36.f.a(5, this.f378994g);
            java.lang.String str8 = this.f378995h;
            if (str8 != null) {
                a17 += b36.f.j(6, str8);
            }
            return a17 + b36.f.e(7, this.f378996i) + b36.f.h(8, this.f378997m);
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
        r45.kw kwVar = (r45.kw) objArr[1];
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
                    kwVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                kwVar.f378991d = aVar2.k(intValue);
                return 0;
            case 3:
                kwVar.f378992e = aVar2.k(intValue);
                return 0;
            case 4:
                kwVar.f378993f = aVar2.k(intValue);
                return 0;
            case 5:
                kwVar.f378994g = aVar2.c(intValue);
                return 0;
            case 6:
                kwVar.f378995h = aVar2.k(intValue);
                return 0;
            case 7:
                kwVar.f378996i = aVar2.g(intValue);
                return 0;
            case 8:
                kwVar.f378997m = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
