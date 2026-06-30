package r45;

/* loaded from: classes4.dex */
public class im3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f377148d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f377149e;

    /* renamed from: f, reason: collision with root package name */
    public int f377150f;

    /* renamed from: g, reason: collision with root package name */
    public int f377151g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.im3)) {
            return false;
        }
        r45.im3 im3Var = (r45.im3) fVar;
        return n51.f.a(this.BaseRequest, im3Var.BaseRequest) && n51.f.a(this.f377148d, im3Var.f377148d) && n51.f.a(this.f377149e, im3Var.f377149e) && n51.f.a(java.lang.Integer.valueOf(this.f377150f), java.lang.Integer.valueOf(im3Var.f377150f)) && n51.f.a(java.lang.Integer.valueOf(this.f377151g), java.lang.Integer.valueOf(im3Var.f377151g));
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
            java.lang.String str = this.f377148d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f377149e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f377150f);
            fVar.e(5, this.f377151g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f377148d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f377149e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            return i18 + b36.f.e(4, this.f377150f) + b36.f.e(5, this.f377151g);
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
        r45.im3 im3Var = (r45.im3) objArr[1];
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
                im3Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            im3Var.f377148d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            im3Var.f377149e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            im3Var.f377150f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        im3Var.f377151g = aVar2.g(intValue);
        return 0;
    }
}
