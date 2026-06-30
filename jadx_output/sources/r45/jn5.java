package r45;

/* loaded from: classes4.dex */
public class jn5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f377971d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f377972e;

    /* renamed from: f, reason: collision with root package name */
    public int f377973f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f377974g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jn5)) {
            return false;
        }
        r45.jn5 jn5Var = (r45.jn5) fVar;
        return n51.f.a(this.BaseResponse, jn5Var.BaseResponse) && n51.f.a(this.f377971d, jn5Var.f377971d) && n51.f.a(this.f377972e, jn5Var.f377972e) && n51.f.a(java.lang.Integer.valueOf(this.f377973f), java.lang.Integer.valueOf(jn5Var.f377973f)) && n51.f.a(this.f377974g, jn5Var.f377974g);
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
            java.lang.String str = this.f377971d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f377972e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f377973f);
            r45.cu5 cu5Var = this.f377974g;
            if (cu5Var != null) {
                fVar.i(5, cu5Var.computeSize());
                this.f377974g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str3 = this.f377971d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f377972e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            int e17 = i18 + b36.f.e(4, this.f377973f);
            r45.cu5 cu5Var2 = this.f377974g;
            return cu5Var2 != null ? e17 + b36.f.i(5, cu5Var2.computeSize()) : e17;
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
        r45.jn5 jn5Var = (r45.jn5) objArr[1];
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
                jn5Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            jn5Var.f377971d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            jn5Var.f377972e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            jn5Var.f377973f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr2 != null && bArr2.length > 0) {
                cu5Var3.b(bArr2);
            }
            jn5Var.f377974g = cu5Var3;
        }
        return 0;
    }
}
