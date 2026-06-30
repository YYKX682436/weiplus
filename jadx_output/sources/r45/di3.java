package r45;

/* loaded from: classes2.dex */
public class di3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f372504d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f372505e;

    /* renamed from: f, reason: collision with root package name */
    public a36.c f372506f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f372507g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.di3)) {
            return false;
        }
        r45.di3 di3Var = (r45.di3) fVar;
        return n51.f.a(this.BaseResponse, di3Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f372504d), java.lang.Integer.valueOf(di3Var.f372504d)) && n51.f.a(this.f372505e, di3Var.f372505e) && n51.f.a(this.f372506f, di3Var.f372506f) && n51.f.a(this.f372507g, di3Var.f372507g);
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
            fVar.e(2, this.f372504d);
            java.lang.String str = this.f372505e;
            if (str != null) {
                fVar.j(3, str);
            }
            a36.c cVar = this.f372506f;
            if (cVar != null) {
                fVar.i(4, cVar.computeSize());
                this.f372506f.writeFields(fVar);
            }
            java.lang.String str2 = this.f372507g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f372504d);
            java.lang.String str3 = this.f372505e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            a36.c cVar2 = this.f372506f;
            if (cVar2 != null) {
                i18 += b36.f.i(4, cVar2.computeSize());
            }
            java.lang.String str4 = this.f372507g;
            return str4 != null ? i18 + b36.f.j(5, str4) : i18;
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
        r45.di3 di3Var = (r45.di3) objArr[1];
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
                di3Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            di3Var.f372504d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            di3Var.f372505e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            di3Var.f372507g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            a36.c cVar3 = new a36.c();
            if (bArr2 != null && bArr2.length > 0) {
                cVar3.parseFrom(bArr2);
            }
            di3Var.f372506f = cVar3;
        }
        return 0;
    }
}
