package r45;

/* loaded from: classes2.dex */
public class ok extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f382313d;

    /* renamed from: e, reason: collision with root package name */
    public int f382314e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f382315f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f382316g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ok)) {
            return false;
        }
        r45.ok okVar = (r45.ok) fVar;
        return n51.f.a(this.BaseResponse, okVar.BaseResponse) && n51.f.a(java.lang.Boolean.valueOf(this.f382313d), java.lang.Boolean.valueOf(okVar.f382313d)) && n51.f.a(java.lang.Integer.valueOf(this.f382314e), java.lang.Integer.valueOf(okVar.f382314e)) && n51.f.a(this.f382315f, okVar.f382315f) && n51.f.a(this.f382316g, okVar.f382316g);
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
            fVar.a(2, this.f382313d);
            fVar.e(3, this.f382314e);
            java.lang.String str = this.f382315f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f382316g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.a(2, this.f382313d) + b36.f.e(3, this.f382314e);
            java.lang.String str3 = this.f382315f;
            if (str3 != null) {
                i18 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f382316g;
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
        r45.ok okVar = (r45.ok) objArr[1];
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
                okVar.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            okVar.f382313d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 3) {
            okVar.f382314e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            okVar.f382315f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        okVar.f382316g = aVar2.k(intValue);
        return 0;
    }
}
