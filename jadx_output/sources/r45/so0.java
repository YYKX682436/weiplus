package r45;

/* loaded from: classes4.dex */
public class so0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385878d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f385879e = true;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f385880f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f385881g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.so0)) {
            return false;
        }
        r45.so0 so0Var = (r45.so0) fVar;
        return n51.f.a(this.BaseResponse, so0Var.BaseResponse) && n51.f.a(this.f385878d, so0Var.f385878d) && n51.f.a(java.lang.Boolean.valueOf(this.f385879e), java.lang.Boolean.valueOf(so0Var.f385879e)) && n51.f.a(this.f385880f, so0Var.f385880f) && n51.f.a(this.f385881g, so0Var.f385881g);
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
            java.lang.String str = this.f385878d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.a(3, this.f385879e);
            java.lang.String str2 = this.f385880f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f385881g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str4 = this.f385878d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            int a17 = i18 + b36.f.a(3, this.f385879e);
            java.lang.String str5 = this.f385880f;
            if (str5 != null) {
                a17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f385881g;
            return str6 != null ? a17 + b36.f.j(5, str6) : a17;
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
        r45.so0 so0Var = (r45.so0) objArr[1];
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
                so0Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            so0Var.f385878d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            so0Var.f385879e = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 4) {
            so0Var.f385880f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        so0Var.f385881g = aVar2.k(intValue);
        return 0;
    }
}
