package r45;

/* loaded from: classes8.dex */
public class xk0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f390175d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f390176e;

    /* renamed from: f, reason: collision with root package name */
    public int f390177f;

    /* renamed from: g, reason: collision with root package name */
    public r45.vk0 f390178g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xk0)) {
            return false;
        }
        r45.xk0 xk0Var = (r45.xk0) fVar;
        return n51.f.a(this.BaseRequest, xk0Var.BaseRequest) && n51.f.a(this.f390175d, xk0Var.f390175d) && n51.f.a(this.f390176e, xk0Var.f390176e) && n51.f.a(java.lang.Integer.valueOf(this.f390177f), java.lang.Integer.valueOf(xk0Var.f390177f)) && n51.f.a(this.f390178g, xk0Var.f390178g);
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
            java.lang.String str = this.f390175d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f390176e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f390177f);
            r45.vk0 vk0Var = this.f390178g;
            if (vk0Var != null) {
                fVar.i(5, vk0Var.computeSize());
                this.f390178g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f390175d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f390176e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            int e17 = i18 + b36.f.e(4, this.f390177f);
            r45.vk0 vk0Var2 = this.f390178g;
            return vk0Var2 != null ? e17 + b36.f.i(5, vk0Var2.computeSize()) : e17;
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
        r45.xk0 xk0Var = (r45.xk0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.parseFrom(bArr);
                }
                xk0Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            xk0Var.f390175d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            xk0Var.f390176e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            xk0Var.f390177f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.vk0 vk0Var3 = new r45.vk0();
            if (bArr2 != null && bArr2.length > 0) {
                vk0Var3.parseFrom(bArr2);
            }
            xk0Var.f390178g = vk0Var3;
        }
        return 0;
    }
}
