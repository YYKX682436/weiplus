package r45;

/* loaded from: classes9.dex */
public class m65 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f380163d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380164e;

    /* renamed from: f, reason: collision with root package name */
    public r45.p65 f380165f;

    /* renamed from: g, reason: collision with root package name */
    public r45.b65 f380166g;

    /* renamed from: i, reason: collision with root package name */
    public int f380168i;

    /* renamed from: n, reason: collision with root package name */
    public int f380170n;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f380167h = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f380169m = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m65)) {
            return false;
        }
        r45.m65 m65Var = (r45.m65) fVar;
        return n51.f.a(this.BaseResponse, m65Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f380163d), java.lang.Integer.valueOf(m65Var.f380163d)) && n51.f.a(this.f380164e, m65Var.f380164e) && n51.f.a(this.f380165f, m65Var.f380165f) && n51.f.a(this.f380166g, m65Var.f380166g) && n51.f.a(this.f380167h, m65Var.f380167h) && n51.f.a(java.lang.Integer.valueOf(this.f380168i), java.lang.Integer.valueOf(m65Var.f380168i)) && n51.f.a(this.f380169m, m65Var.f380169m) && n51.f.a(java.lang.Integer.valueOf(this.f380170n), java.lang.Integer.valueOf(m65Var.f380170n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f380169m;
        java.util.LinkedList linkedList2 = this.f380167h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f380163d);
            java.lang.String str = this.f380164e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.p65 p65Var = this.f380165f;
            if (p65Var != null) {
                fVar.i(4, p65Var.computeSize());
                this.f380165f.writeFields(fVar);
            }
            r45.b65 b65Var = this.f380166g;
            if (b65Var != null) {
                fVar.i(5, b65Var.computeSize());
                this.f380166g.writeFields(fVar);
            }
            fVar.g(6, 8, linkedList2);
            fVar.e(7, this.f380168i);
            fVar.g(8, 8, linkedList);
            fVar.e(9, this.f380170n);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f380163d);
            java.lang.String str2 = this.f380164e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            r45.p65 p65Var2 = this.f380165f;
            if (p65Var2 != null) {
                i18 += b36.f.i(4, p65Var2.computeSize());
            }
            r45.b65 b65Var2 = this.f380166g;
            if (b65Var2 != null) {
                i18 += b36.f.i(5, b65Var2.computeSize());
            }
            return i18 + b36.f.g(6, 8, linkedList2) + b36.f.e(7, this.f380168i) + b36.f.g(8, 8, linkedList) + b36.f.e(9, this.f380170n);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.m65 m65Var = (r45.m65) objArr[1];
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
                    m65Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                m65Var.f380163d = aVar2.g(intValue);
                return 0;
            case 3:
                m65Var.f380164e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.p65 p65Var3 = new r45.p65();
                    if (bArr3 != null && bArr3.length > 0) {
                        p65Var3.parseFrom(bArr3);
                    }
                    m65Var.f380165f = p65Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.b65 b65Var3 = new r45.b65();
                    if (bArr4 != null && bArr4.length > 0) {
                        b65Var3.parseFrom(bArr4);
                    }
                    m65Var.f380166g = b65Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.a65 a65Var = new r45.a65();
                    if (bArr5 != null && bArr5.length > 0) {
                        a65Var.parseFrom(bArr5);
                    }
                    m65Var.f380167h.add(a65Var);
                }
                return 0;
            case 7:
                m65Var.f380168i = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.t56 t56Var = new r45.t56();
                    if (bArr6 != null && bArr6.length > 0) {
                        t56Var.parseFrom(bArr6);
                    }
                    m65Var.f380169m.add(t56Var);
                }
                return 0;
            case 9:
                m65Var.f380170n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
