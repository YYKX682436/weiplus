package r45;

/* loaded from: classes7.dex */
public class dt3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.bc7 f372740d;

    /* renamed from: g, reason: collision with root package name */
    public int f372743g;

    /* renamed from: i, reason: collision with root package name */
    public r45.z50 f372745i;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f372741e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f372742f = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f372744h = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dt3)) {
            return false;
        }
        r45.dt3 dt3Var = (r45.dt3) fVar;
        return n51.f.a(this.BaseResponse, dt3Var.BaseResponse) && n51.f.a(this.f372740d, dt3Var.f372740d) && n51.f.a(this.f372741e, dt3Var.f372741e) && n51.f.a(this.f372742f, dt3Var.f372742f) && n51.f.a(java.lang.Integer.valueOf(this.f372743g), java.lang.Integer.valueOf(dt3Var.f372743g)) && n51.f.a(this.f372744h, dt3Var.f372744h) && n51.f.a(this.f372745i, dt3Var.f372745i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f372744h;
        java.util.LinkedList linkedList2 = this.f372742f;
        java.util.LinkedList linkedList3 = this.f372741e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            r45.bc7 bc7Var = this.f372740d;
            if (bc7Var != null) {
                fVar.i(2, bc7Var.computeSize());
                this.f372740d.writeFields(fVar);
            }
            fVar.g(3, 8, linkedList3);
            fVar.g(4, 8, linkedList2);
            fVar.e(5, this.f372743g);
            fVar.g(6, 8, linkedList);
            r45.z50 z50Var = this.f372745i;
            if (z50Var != null) {
                fVar.i(7, z50Var.computeSize());
                this.f372745i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.bc7 bc7Var2 = this.f372740d;
            if (bc7Var2 != null) {
                i18 += b36.f.i(2, bc7Var2.computeSize());
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList3) + b36.f.g(4, 8, linkedList2) + b36.f.e(5, this.f372743g) + b36.f.g(6, 8, linkedList);
            r45.z50 z50Var2 = this.f372745i;
            return z50Var2 != null ? g17 + b36.f.i(7, z50Var2.computeSize()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
            linkedList2.clear();
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
        r45.dt3 dt3Var = (r45.dt3) objArr[1];
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
                    dt3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.bc7 bc7Var3 = new r45.bc7();
                    if (bArr3 != null && bArr3.length > 0) {
                        bc7Var3.parseFrom(bArr3);
                    }
                    dt3Var.f372740d = bc7Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.pc7 pc7Var = new r45.pc7();
                    if (bArr4 != null && bArr4.length > 0) {
                        pc7Var.parseFrom(bArr4);
                    }
                    dt3Var.f372741e.add(pc7Var);
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.pc7 pc7Var2 = new r45.pc7();
                    if (bArr5 != null && bArr5.length > 0) {
                        pc7Var2.parseFrom(bArr5);
                    }
                    dt3Var.f372742f.add(pc7Var2);
                }
                return 0;
            case 5:
                dt3Var.f372743g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.pc7 pc7Var3 = new r45.pc7();
                    if (bArr6 != null && bArr6.length > 0) {
                        pc7Var3.parseFrom(bArr6);
                    }
                    dt3Var.f372744h.add(pc7Var3);
                }
                return 0;
            case 7:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.z50 z50Var3 = new r45.z50();
                    if (bArr7 != null && bArr7.length > 0) {
                        z50Var3.parseFrom(bArr7);
                    }
                    dt3Var.f372745i = z50Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
