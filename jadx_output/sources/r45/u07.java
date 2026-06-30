package r45;

/* loaded from: classes8.dex */
public class u07 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f386916d;

    /* renamed from: e, reason: collision with root package name */
    public r45.y07 f386917e;

    /* renamed from: f, reason: collision with root package name */
    public long f386918f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f386919g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f386920h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u07)) {
            return false;
        }
        r45.u07 u07Var = (r45.u07) fVar;
        return n51.f.a(this.BaseRequest, u07Var.BaseRequest) && n51.f.a(this.f386916d, u07Var.f386916d) && n51.f.a(this.f386917e, u07Var.f386917e) && n51.f.a(java.lang.Long.valueOf(this.f386918f), java.lang.Long.valueOf(u07Var.f386918f)) && n51.f.a(this.f386919g, u07Var.f386919g) && n51.f.a(this.f386920h, u07Var.f386920h);
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
            java.lang.String str = this.f386916d;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.y07 y07Var = this.f386917e;
            if (y07Var != null) {
                fVar.i(3, y07Var.computeSize());
                this.f386917e.writeFields(fVar);
            }
            fVar.h(4, this.f386918f);
            java.lang.String str2 = this.f386919g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f386920h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str4 = this.f386916d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            r45.y07 y07Var2 = this.f386917e;
            if (y07Var2 != null) {
                i18 += b36.f.i(3, y07Var2.computeSize());
            }
            int h17 = i18 + b36.f.h(4, this.f386918f);
            java.lang.String str5 = this.f386919g;
            if (str5 != null) {
                h17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f386920h;
            return str6 != null ? h17 + b36.f.j(6, str6) : h17;
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
        r45.u07 u07Var = (r45.u07) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    u07Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                u07Var.f386916d = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.y07 y07Var3 = new r45.y07();
                    if (bArr2 != null && bArr2.length > 0) {
                        y07Var3.parseFrom(bArr2);
                    }
                    u07Var.f386917e = y07Var3;
                }
                return 0;
            case 4:
                u07Var.f386918f = aVar2.i(intValue);
                return 0;
            case 5:
                u07Var.f386919g = aVar2.k(intValue);
                return 0;
            case 6:
                u07Var.f386920h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
