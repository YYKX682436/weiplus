package r45;

/* loaded from: classes4.dex */
public class wh5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.yj6 f389165d;

    /* renamed from: e, reason: collision with root package name */
    public r45.yt5 f389166e;

    /* renamed from: f, reason: collision with root package name */
    public r45.s77 f389167f;

    /* renamed from: g, reason: collision with root package name */
    public long f389168g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wh5)) {
            return false;
        }
        r45.wh5 wh5Var = (r45.wh5) fVar;
        return n51.f.a(this.BaseResponse, wh5Var.BaseResponse) && n51.f.a(this.f389165d, wh5Var.f389165d) && n51.f.a(this.f389166e, wh5Var.f389166e) && n51.f.a(this.f389167f, wh5Var.f389167f) && n51.f.a(java.lang.Long.valueOf(this.f389168g), java.lang.Long.valueOf(wh5Var.f389168g));
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
            r45.yj6 yj6Var = this.f389165d;
            if (yj6Var != null) {
                fVar.i(2, yj6Var.computeSize());
                this.f389165d.writeFields(fVar);
            }
            r45.yt5 yt5Var = this.f389166e;
            if (yt5Var != null) {
                fVar.i(3, yt5Var.computeSize());
                this.f389166e.writeFields(fVar);
            }
            r45.s77 s77Var = this.f389167f;
            if (s77Var != null) {
                fVar.i(4, s77Var.computeSize());
                this.f389167f.writeFields(fVar);
            }
            fVar.h(5, this.f389168g);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.yj6 yj6Var2 = this.f389165d;
            if (yj6Var2 != null) {
                i18 += b36.f.i(2, yj6Var2.computeSize());
            }
            r45.yt5 yt5Var2 = this.f389166e;
            if (yt5Var2 != null) {
                i18 += b36.f.i(3, yt5Var2.computeSize());
            }
            r45.s77 s77Var2 = this.f389167f;
            if (s77Var2 != null) {
                i18 += b36.f.i(4, s77Var2.computeSize());
            }
            return i18 + b36.f.h(5, this.f389168g);
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
        r45.wh5 wh5Var = (r45.wh5) objArr[1];
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
                wh5Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.yj6 yj6Var3 = new r45.yj6();
                if (bArr2 != null && bArr2.length > 0) {
                    yj6Var3.parseFrom(bArr2);
                }
                wh5Var.f389165d = yj6Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                r45.yt5 yt5Var3 = new r45.yt5();
                if (bArr3 != null && bArr3.length > 0) {
                    yt5Var3.parseFrom(bArr3);
                }
                wh5Var.f389166e = yt5Var3;
            }
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            wh5Var.f389168g = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i29 = 0; i29 < size4; i29++) {
            byte[] bArr4 = (byte[]) j27.get(i29);
            r45.s77 s77Var3 = new r45.s77();
            if (bArr4 != null && bArr4.length > 0) {
                s77Var3.parseFrom(bArr4);
            }
            wh5Var.f389167f = s77Var3;
        }
        return 0;
    }
}
