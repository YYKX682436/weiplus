package r45;

/* loaded from: classes8.dex */
public class hs3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public long f376416d;

    /* renamed from: e, reason: collision with root package name */
    public long f376417e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f376418f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f376419g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f376421i;

    /* renamed from: m, reason: collision with root package name */
    public r45.i50 f376422m;

    /* renamed from: n, reason: collision with root package name */
    public r45.ia7 f376423n;

    /* renamed from: p, reason: collision with root package name */
    public r45.la7 f376425p;

    /* renamed from: h, reason: collision with root package name */
    public boolean f376420h = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f376424o = false;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hs3)) {
            return false;
        }
        r45.hs3 hs3Var = (r45.hs3) fVar;
        return n51.f.a(this.BaseResponse, hs3Var.BaseResponse) && n51.f.a(java.lang.Long.valueOf(this.f376416d), java.lang.Long.valueOf(hs3Var.f376416d)) && n51.f.a(java.lang.Long.valueOf(this.f376417e), java.lang.Long.valueOf(hs3Var.f376417e)) && n51.f.a(this.f376418f, hs3Var.f376418f) && n51.f.a(this.f376419g, hs3Var.f376419g) && n51.f.a(java.lang.Boolean.valueOf(this.f376420h), java.lang.Boolean.valueOf(hs3Var.f376420h)) && n51.f.a(this.f376421i, hs3Var.f376421i) && n51.f.a(this.f376422m, hs3Var.f376422m) && n51.f.a(this.f376423n, hs3Var.f376423n) && n51.f.a(java.lang.Boolean.valueOf(this.f376424o), java.lang.Boolean.valueOf(hs3Var.f376424o)) && n51.f.a(this.f376425p, hs3Var.f376425p);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.h(2, this.f376416d);
            fVar.h(3, this.f376417e);
            java.lang.String str = this.f376418f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f376419g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.a(6, this.f376420h);
            java.lang.String str3 = this.f376421i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            r45.i50 i50Var = this.f376422m;
            if (i50Var != null) {
                fVar.i(8, i50Var.computeSize());
                this.f376422m.writeFields(fVar);
            }
            r45.ia7 ia7Var = this.f376423n;
            if (ia7Var != null) {
                fVar.i(9, ia7Var.computeSize());
                this.f376423n.writeFields(fVar);
            }
            fVar.a(10, this.f376424o);
            r45.la7 la7Var = this.f376425p;
            if (la7Var != null) {
                fVar.i(11, la7Var.computeSize());
                this.f376425p.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.h(2, this.f376416d) + b36.f.h(3, this.f376417e);
            java.lang.String str4 = this.f376418f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f376419g;
            if (str5 != null) {
                i18 += b36.f.j(5, str5);
            }
            int a17 = i18 + b36.f.a(6, this.f376420h);
            java.lang.String str6 = this.f376421i;
            if (str6 != null) {
                a17 += b36.f.j(7, str6);
            }
            r45.i50 i50Var2 = this.f376422m;
            if (i50Var2 != null) {
                a17 += b36.f.i(8, i50Var2.computeSize());
            }
            r45.ia7 ia7Var2 = this.f376423n;
            if (ia7Var2 != null) {
                a17 += b36.f.i(9, ia7Var2.computeSize());
            }
            int a18 = a17 + b36.f.a(10, this.f376424o);
            r45.la7 la7Var2 = this.f376425p;
            return la7Var2 != null ? a18 + b36.f.i(11, la7Var2.computeSize()) : a18;
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
        r45.hs3 hs3Var = (r45.hs3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    hs3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                hs3Var.f376416d = aVar2.i(intValue);
                return 0;
            case 3:
                hs3Var.f376417e = aVar2.i(intValue);
                return 0;
            case 4:
                hs3Var.f376418f = aVar2.k(intValue);
                return 0;
            case 5:
                hs3Var.f376419g = aVar2.k(intValue);
                return 0;
            case 6:
                hs3Var.f376420h = aVar2.c(intValue);
                return 0;
            case 7:
                hs3Var.f376421i = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.i50 i50Var3 = new r45.i50();
                    if (bArr2 != null && bArr2.length > 0) {
                        i50Var3.parseFrom(bArr2);
                    }
                    hs3Var.f376422m = i50Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.ia7 ia7Var3 = new r45.ia7();
                    if (bArr3 != null && bArr3.length > 0) {
                        ia7Var3.parseFrom(bArr3);
                    }
                    hs3Var.f376423n = ia7Var3;
                }
                return 0;
            case 10:
                hs3Var.f376424o = aVar2.c(intValue);
                return 0;
            case 11:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.la7 la7Var3 = new r45.la7();
                    if (bArr4 != null && bArr4.length > 0) {
                        la7Var3.parseFrom(bArr4);
                    }
                    hs3Var.f376425p = la7Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
