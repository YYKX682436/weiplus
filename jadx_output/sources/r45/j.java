package r45;

/* loaded from: classes9.dex */
public class j extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f377426d = 268513600;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f377427e = "请求不成功，请稍候再试";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f377428f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f377429g;

    /* renamed from: h, reason: collision with root package name */
    public r45.g0 f377430h;

    /* renamed from: i, reason: collision with root package name */
    public r45.a f377431i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j)) {
            return false;
        }
        r45.j jVar = (r45.j) fVar;
        return n51.f.a(this.BaseResponse, jVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f377426d), java.lang.Integer.valueOf(jVar.f377426d)) && n51.f.a(this.f377427e, jVar.f377427e) && n51.f.a(this.f377428f, jVar.f377428f) && n51.f.a(this.f377429g, jVar.f377429g) && n51.f.a(this.f377430h, jVar.f377430h) && n51.f.a(this.f377431i, jVar.f377431i);
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
            fVar.e(2, this.f377426d);
            java.lang.String str = this.f377427e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f377428f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f377429g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            r45.g0 g0Var = this.f377430h;
            if (g0Var != null) {
                fVar.i(6, g0Var.computeSize());
                this.f377430h.writeFields(fVar);
            }
            r45.a aVar = this.f377431i;
            if (aVar != null) {
                fVar.i(7, aVar.computeSize());
                this.f377431i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f377426d);
            java.lang.String str4 = this.f377427e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f377428f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f377429g;
            if (str6 != null) {
                i18 += b36.f.j(5, str6);
            }
            r45.g0 g0Var2 = this.f377430h;
            if (g0Var2 != null) {
                i18 += b36.f.i(6, g0Var2.computeSize());
            }
            r45.a aVar2 = this.f377431i;
            return aVar2 != null ? i18 + b36.f.i(7, aVar2.computeSize()) : i18;
        }
        if (i17 == 2) {
            c36.a aVar3 = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar3); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar3)) {
                if (!super.populateBuilderWithField(aVar3, this, nextFieldNumber)) {
                    aVar3.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar4 = (c36.a) objArr[0];
        r45.j jVar = (r45.j) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar4.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    jVar.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                jVar.f377426d = aVar4.g(intValue);
                return 0;
            case 3:
                jVar.f377427e = aVar4.k(intValue);
                return 0;
            case 4:
                jVar.f377428f = aVar4.k(intValue);
                return 0;
            case 5:
                jVar.f377429g = aVar4.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar4.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.g0 g0Var3 = new r45.g0();
                    if (bArr2 != null && bArr2.length > 0) {
                        g0Var3.parseFrom(bArr2);
                    }
                    jVar.f377430h = g0Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar4.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.a aVar5 = new r45.a();
                    if (bArr3 != null && bArr3.length > 0) {
                        aVar5.parseFrom(bArr3);
                    }
                    jVar.f377431i = aVar5;
                }
                return 0;
            default:
                return -1;
        }
    }
}
