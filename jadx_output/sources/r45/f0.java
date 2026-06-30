package r45;

/* loaded from: classes9.dex */
public class f0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f373861d = 268513600;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f373862e = "请求不成功，请稍候再试";

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f373863f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f373864g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f373865h;

    /* renamed from: i, reason: collision with root package name */
    public int f373866i;

    /* renamed from: m, reason: collision with root package name */
    public int f373867m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f373868n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f0)) {
            return false;
        }
        r45.f0 f0Var = (r45.f0) fVar;
        return n51.f.a(this.BaseResponse, f0Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f373861d), java.lang.Integer.valueOf(f0Var.f373861d)) && n51.f.a(this.f373862e, f0Var.f373862e) && n51.f.a(this.f373863f, f0Var.f373863f) && n51.f.a(this.f373864g, f0Var.f373864g) && n51.f.a(this.f373865h, f0Var.f373865h) && n51.f.a(java.lang.Integer.valueOf(this.f373866i), java.lang.Integer.valueOf(f0Var.f373866i)) && n51.f.a(java.lang.Integer.valueOf(this.f373867m), java.lang.Integer.valueOf(f0Var.f373867m)) && n51.f.a(this.f373868n, f0Var.f373868n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f373863f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f373861d);
            java.lang.String str = this.f373862e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.g(4, 8, linkedList);
            java.lang.String str2 = this.f373864g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f373865h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.e(7, this.f373866i);
            fVar.e(8, this.f373867m);
            java.lang.String str4 = this.f373868n;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f373861d);
            java.lang.String str5 = this.f373862e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int g17 = i18 + b36.f.g(4, 8, linkedList);
            java.lang.String str6 = this.f373864g;
            if (str6 != null) {
                g17 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f373865h;
            if (str7 != null) {
                g17 += b36.f.j(6, str7);
            }
            int e17 = g17 + b36.f.e(7, this.f373866i) + b36.f.e(8, this.f373867m);
            java.lang.String str8 = this.f373868n;
            return str8 != null ? e17 + b36.f.j(9, str8) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.f0 f0Var = (r45.f0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    f0Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                f0Var.f373861d = aVar2.g(intValue);
                return 0;
            case 3:
                f0Var.f373862e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.p pVar = new r45.p();
                    if (bArr3 != null && bArr3.length > 0) {
                        pVar.parseFrom(bArr3);
                    }
                    f0Var.f373863f.add(pVar);
                }
                return 0;
            case 5:
                f0Var.f373864g = aVar2.k(intValue);
                return 0;
            case 6:
                f0Var.f373865h = aVar2.k(intValue);
                return 0;
            case 7:
                f0Var.f373866i = aVar2.g(intValue);
                return 0;
            case 8:
                f0Var.f373867m = aVar2.g(intValue);
                return 0;
            case 9:
                f0Var.f373868n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
