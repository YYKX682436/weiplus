package r45;

/* loaded from: classes8.dex */
public class o65 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f381986d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381987e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f381988f;

    /* renamed from: g, reason: collision with root package name */
    public int f381989g;

    /* renamed from: h, reason: collision with root package name */
    public long f381990h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o65)) {
            return false;
        }
        r45.o65 o65Var = (r45.o65) fVar;
        return n51.f.a(this.BaseResponse, o65Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f381986d), java.lang.Integer.valueOf(o65Var.f381986d)) && n51.f.a(this.f381987e, o65Var.f381987e) && n51.f.a(this.f381988f, o65Var.f381988f) && n51.f.a(java.lang.Integer.valueOf(this.f381989g), java.lang.Integer.valueOf(o65Var.f381989g)) && n51.f.a(java.lang.Long.valueOf(this.f381990h), java.lang.Long.valueOf(o65Var.f381990h));
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
            fVar.e(2, this.f381986d);
            java.lang.String str = this.f381987e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f381988f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f381989g);
            fVar.h(100, this.f381990h);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f381986d);
            java.lang.String str3 = this.f381987e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f381988f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            return i18 + b36.f.e(5, this.f381989g) + b36.f.h(100, this.f381990h);
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
        r45.o65 o65Var = (r45.o65) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.parseFrom(bArr);
                }
                o65Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            o65Var.f381986d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            o65Var.f381987e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            o65Var.f381988f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 5) {
            o65Var.f381989g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 100) {
            return -1;
        }
        o65Var.f381990h = aVar2.i(intValue);
        return 0;
    }
}
