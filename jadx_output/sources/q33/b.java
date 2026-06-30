package q33;

/* loaded from: classes2.dex */
public class b extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f359934d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f359935e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f359936f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f359937g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof q33.b)) {
            return false;
        }
        q33.b bVar = (q33.b) fVar;
        return n51.f.a(this.BaseResponse, bVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f359934d), java.lang.Integer.valueOf(bVar.f359934d)) && n51.f.a(this.f359935e, bVar.f359935e) && n51.f.a(this.f359936f, bVar.f359936f) && n51.f.a(this.f359937g, bVar.f359937g);
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
            fVar.e(2, this.f359934d);
            java.lang.String str = this.f359935e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f359936f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f359937g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f359934d);
            java.lang.String str4 = this.f359935e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f359936f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f359937g;
            return str6 != null ? i18 + b36.f.j(5, str6) : i18;
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
        q33.b bVar = (q33.b) objArr[1];
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
                bVar.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            bVar.f359934d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            bVar.f359935e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            bVar.f359936f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        bVar.f359937g = aVar2.k(intValue);
        return 0;
    }
}
