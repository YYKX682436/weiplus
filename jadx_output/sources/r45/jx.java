package r45;

/* loaded from: classes8.dex */
public class jx extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378179d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378180e;

    /* renamed from: f, reason: collision with root package name */
    public int f378181f;

    /* renamed from: g, reason: collision with root package name */
    public r45.jv3 f378182g;

    /* renamed from: h, reason: collision with root package name */
    public r45.mu5 f378183h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jx)) {
            return false;
        }
        r45.jx jxVar = (r45.jx) fVar;
        return n51.f.a(this.BaseResponse, jxVar.BaseResponse) && n51.f.a(this.f378179d, jxVar.f378179d) && n51.f.a(this.f378180e, jxVar.f378180e) && n51.f.a(java.lang.Integer.valueOf(this.f378181f), java.lang.Integer.valueOf(jxVar.f378181f)) && n51.f.a(this.f378182g, jxVar.f378182g) && n51.f.a(this.f378183h, jxVar.f378183h);
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
            java.lang.String str = this.f378179d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f378180e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f378181f);
            r45.jv3 jv3Var = this.f378182g;
            if (jv3Var != null) {
                fVar.i(5, jv3Var.computeSize());
                this.f378182g.writeFields(fVar);
            }
            r45.mu5 mu5Var = this.f378183h;
            if (mu5Var != null) {
                fVar.i(6, mu5Var.computeSize());
                this.f378183h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str3 = this.f378179d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f378180e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            int e17 = i18 + b36.f.e(4, this.f378181f);
            r45.jv3 jv3Var2 = this.f378182g;
            if (jv3Var2 != null) {
                e17 += b36.f.i(5, jv3Var2.computeSize());
            }
            r45.mu5 mu5Var2 = this.f378183h;
            return mu5Var2 != null ? e17 + b36.f.i(6, mu5Var2.computeSize()) : e17;
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
        r45.jx jxVar = (r45.jx) objArr[1];
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
                    jxVar.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                jxVar.f378179d = aVar2.k(intValue);
                return 0;
            case 3:
                jxVar.f378180e = aVar2.k(intValue);
                return 0;
            case 4:
                jxVar.f378181f = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.jv3 jv3Var3 = new r45.jv3();
                    if (bArr2 != null && bArr2.length > 0) {
                        jv3Var3.parseFrom(bArr2);
                    }
                    jxVar.f378182g = jv3Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.mu5 mu5Var3 = new r45.mu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        mu5Var3.parseFrom(bArr3);
                    }
                    jxVar.f378183h = mu5Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
