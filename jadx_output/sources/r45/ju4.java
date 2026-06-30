package r45;

/* loaded from: classes8.dex */
public class ju4 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f378111d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f378112e;

    /* renamed from: f, reason: collision with root package name */
    public int f378113f;

    /* renamed from: g, reason: collision with root package name */
    public int f378114g;

    /* renamed from: h, reason: collision with root package name */
    public int f378115h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f378116i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public int f378117m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ju4)) {
            return false;
        }
        r45.ju4 ju4Var = (r45.ju4) fVar;
        return n51.f.a(this.BaseResponse, ju4Var.BaseResponse) && n51.f.a(this.f378111d, ju4Var.f378111d) && n51.f.a(this.f378112e, ju4Var.f378112e) && n51.f.a(java.lang.Integer.valueOf(this.f378113f), java.lang.Integer.valueOf(ju4Var.f378113f)) && n51.f.a(java.lang.Integer.valueOf(this.f378114g), java.lang.Integer.valueOf(ju4Var.f378114g)) && n51.f.a(java.lang.Integer.valueOf(this.f378115h), java.lang.Integer.valueOf(ju4Var.f378115h)) && n51.f.a(this.f378116i, ju4Var.f378116i) && n51.f.a(java.lang.Integer.valueOf(this.f378117m), java.lang.Integer.valueOf(ju4Var.f378117m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f378116i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            r45.cu5 cu5Var = this.f378111d;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.computeSize());
                this.f378111d.writeFields(fVar);
            }
            r45.cu5 cu5Var2 = this.f378112e;
            if (cu5Var2 != null) {
                fVar.i(3, cu5Var2.computeSize());
                this.f378112e.writeFields(fVar);
            }
            fVar.e(4, this.f378113f);
            fVar.e(5, this.f378114g);
            fVar.e(6, this.f378115h);
            fVar.g(7, 8, linkedList);
            fVar.e(8, this.f378117m);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.cu5 cu5Var3 = this.f378111d;
            if (cu5Var3 != null) {
                i18 += b36.f.i(2, cu5Var3.computeSize());
            }
            r45.cu5 cu5Var4 = this.f378112e;
            if (cu5Var4 != null) {
                i18 += b36.f.i(3, cu5Var4.computeSize());
            }
            return i18 + b36.f.e(4, this.f378113f) + b36.f.e(5, this.f378114g) + b36.f.e(6, this.f378115h) + b36.f.g(7, 8, linkedList) + b36.f.e(8, this.f378117m);
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
        r45.ju4 ju4Var = (r45.ju4) objArr[1];
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
                    ju4Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var5.b(bArr3);
                    }
                    ju4Var.f378111d = cu5Var5;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var6.b(bArr4);
                    }
                    ju4Var.f378112e = cu5Var6;
                }
                return 0;
            case 4:
                ju4Var.f378113f = aVar2.g(intValue);
                return 0;
            case 5:
                ju4Var.f378114g = aVar2.g(intValue);
                return 0;
            case 6:
                ju4Var.f378115h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.b50 b50Var = new r45.b50();
                    if (bArr5 != null && bArr5.length > 0) {
                        b50Var.parseFrom(bArr5);
                    }
                    ju4Var.f378116i.add(b50Var);
                }
                return 0;
            case 8:
                ju4Var.f378117m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
