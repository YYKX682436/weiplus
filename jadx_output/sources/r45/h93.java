package r45;

/* loaded from: classes2.dex */
public class h93 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f375955d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f375956e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f375957f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f375958g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f375959h;

    /* renamed from: i, reason: collision with root package name */
    public long f375960i;

    /* renamed from: m, reason: collision with root package name */
    public long f375961m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f375962n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h93)) {
            return false;
        }
        r45.h93 h93Var = (r45.h93) fVar;
        return n51.f.a(this.BaseResponse, h93Var.BaseResponse) && n51.f.a(this.f375955d, h93Var.f375955d) && n51.f.a(this.f375956e, h93Var.f375956e) && n51.f.a(this.f375957f, h93Var.f375957f) && n51.f.a(java.lang.Boolean.valueOf(this.f375958g), java.lang.Boolean.valueOf(h93Var.f375958g)) && n51.f.a(java.lang.Boolean.valueOf(this.f375959h), java.lang.Boolean.valueOf(h93Var.f375959h)) && n51.f.a(java.lang.Long.valueOf(this.f375960i), java.lang.Long.valueOf(h93Var.f375960i)) && n51.f.a(java.lang.Long.valueOf(this.f375961m), java.lang.Long.valueOf(h93Var.f375961m)) && n51.f.a(java.lang.Boolean.valueOf(this.f375962n), java.lang.Boolean.valueOf(h93Var.f375962n));
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
            java.lang.String str = this.f375955d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f375956e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f375957f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.a(5, this.f375958g);
            fVar.a(6, this.f375959h);
            fVar.h(7, this.f375960i);
            fVar.h(8, this.f375961m);
            fVar.a(9, this.f375962n);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str4 = this.f375955d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f375956e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f375957f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            return i18 + b36.f.a(5, this.f375958g) + b36.f.a(6, this.f375959h) + b36.f.h(7, this.f375960i) + b36.f.h(8, this.f375961m) + b36.f.a(9, this.f375962n);
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
        r45.h93 h93Var = (r45.h93) objArr[1];
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
                    h93Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                h93Var.f375955d = aVar2.k(intValue);
                return 0;
            case 3:
                h93Var.f375956e = aVar2.k(intValue);
                return 0;
            case 4:
                h93Var.f375957f = aVar2.k(intValue);
                return 0;
            case 5:
                h93Var.f375958g = aVar2.c(intValue);
                return 0;
            case 6:
                h93Var.f375959h = aVar2.c(intValue);
                return 0;
            case 7:
                h93Var.f375960i = aVar2.i(intValue);
                return 0;
            case 8:
                h93Var.f375961m = aVar2.i(intValue);
                return 0;
            case 9:
                h93Var.f375962n = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
