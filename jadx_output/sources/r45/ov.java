package r45;

/* loaded from: classes7.dex */
public class ov extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382533d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f382534e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f382535f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public r45.wf5 f382536g;

    /* renamed from: h, reason: collision with root package name */
    public r45.wf5 f382537h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ov)) {
            return false;
        }
        r45.ov ovVar = (r45.ov) fVar;
        return n51.f.a(this.BaseResponse, ovVar.BaseResponse) && n51.f.a(this.f382533d, ovVar.f382533d) && n51.f.a(java.lang.Boolean.valueOf(this.f382534e), java.lang.Boolean.valueOf(ovVar.f382534e)) && n51.f.a(this.f382535f, ovVar.f382535f) && n51.f.a(this.f382536g, ovVar.f382536g) && n51.f.a(this.f382537h, ovVar.f382537h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f382535f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            java.lang.String str = this.f382533d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.a(3, this.f382534e);
            fVar.g(4, 8, linkedList);
            r45.wf5 wf5Var = this.f382536g;
            if (wf5Var != null) {
                fVar.i(5, wf5Var.computeSize());
                this.f382536g.writeFields(fVar);
            }
            r45.wf5 wf5Var2 = this.f382537h;
            if (wf5Var2 != null) {
                fVar.i(6, wf5Var2.computeSize());
                this.f382537h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str2 = this.f382533d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            int a17 = i18 + b36.f.a(3, this.f382534e) + b36.f.g(4, 8, linkedList);
            r45.wf5 wf5Var3 = this.f382536g;
            if (wf5Var3 != null) {
                a17 += b36.f.i(5, wf5Var3.computeSize());
            }
            r45.wf5 wf5Var4 = this.f382537h;
            return wf5Var4 != null ? a17 + b36.f.i(6, wf5Var4.computeSize()) : a17;
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
        r45.ov ovVar = (r45.ov) objArr[1];
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
                    ovVar.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                ovVar.f382533d = aVar2.k(intValue);
                return 0;
            case 3:
                ovVar.f382534e = aVar2.c(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.hg5 hg5Var = new r45.hg5();
                    if (bArr3 != null && bArr3.length > 0) {
                        hg5Var.parseFrom(bArr3);
                    }
                    ovVar.f382535f.add(hg5Var);
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.wf5 wf5Var5 = new r45.wf5();
                    if (bArr4 != null && bArr4.length > 0) {
                        wf5Var5.parseFrom(bArr4);
                    }
                    ovVar.f382536g = wf5Var5;
                }
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.wf5 wf5Var6 = new r45.wf5();
                    if (bArr5 != null && bArr5.length > 0) {
                        wf5Var6.parseFrom(bArr5);
                    }
                    ovVar.f382537h = wf5Var6;
                }
                return 0;
            default:
                return -1;
        }
    }
}
