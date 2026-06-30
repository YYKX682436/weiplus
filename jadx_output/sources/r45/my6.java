package r45;

/* loaded from: classes8.dex */
public class my6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380930d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380931e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ny6 f380932f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f380933g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f380934h;

    /* renamed from: i, reason: collision with root package name */
    public long f380935i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.my6)) {
            return false;
        }
        r45.my6 my6Var = (r45.my6) fVar;
        return n51.f.a(this.BaseResponse, my6Var.BaseResponse) && n51.f.a(this.f380930d, my6Var.f380930d) && n51.f.a(this.f380931e, my6Var.f380931e) && n51.f.a(this.f380932f, my6Var.f380932f) && n51.f.a(this.f380933g, my6Var.f380933g) && n51.f.a(this.f380934h, my6Var.f380934h) && n51.f.a(java.lang.Long.valueOf(this.f380935i), java.lang.Long.valueOf(my6Var.f380935i));
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
            java.lang.String str = this.f380930d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f380931e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            r45.ny6 ny6Var = this.f380932f;
            if (ny6Var != null) {
                fVar.i(4, ny6Var.computeSize());
                this.f380932f.writeFields(fVar);
            }
            java.lang.String str3 = this.f380933g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f380934h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.h(7, this.f380935i);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str5 = this.f380930d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f380931e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            r45.ny6 ny6Var2 = this.f380932f;
            if (ny6Var2 != null) {
                i18 += b36.f.i(4, ny6Var2.computeSize());
            }
            java.lang.String str7 = this.f380933g;
            if (str7 != null) {
                i18 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f380934h;
            if (str8 != null) {
                i18 += b36.f.j(6, str8);
            }
            return i18 + b36.f.h(7, this.f380935i);
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
        r45.my6 my6Var = (r45.my6) objArr[1];
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
                    my6Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                my6Var.f380930d = aVar2.k(intValue);
                return 0;
            case 3:
                my6Var.f380931e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.ny6 ny6Var3 = new r45.ny6();
                    if (bArr2 != null && bArr2.length > 0) {
                        ny6Var3.parseFrom(bArr2);
                    }
                    my6Var.f380932f = ny6Var3;
                }
                return 0;
            case 5:
                my6Var.f380933g = aVar2.k(intValue);
                return 0;
            case 6:
                my6Var.f380934h = aVar2.k(intValue);
                return 0;
            case 7:
                my6Var.f380935i = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
