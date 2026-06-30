package r45;

/* loaded from: classes7.dex */
public class e24 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372924d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f372925e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f372926f;

    /* renamed from: g, reason: collision with root package name */
    public int f372927g;

    /* renamed from: h, reason: collision with root package name */
    public r45.nd7 f372928h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f372929i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e24)) {
            return false;
        }
        r45.e24 e24Var = (r45.e24) fVar;
        return n51.f.a(this.BaseRequest, e24Var.BaseRequest) && n51.f.a(this.f372924d, e24Var.f372924d) && n51.f.a(this.f372925e, e24Var.f372925e) && n51.f.a(java.lang.Integer.valueOf(this.f372926f), java.lang.Integer.valueOf(e24Var.f372926f)) && n51.f.a(java.lang.Integer.valueOf(this.f372927g), java.lang.Integer.valueOf(e24Var.f372927g)) && n51.f.a(this.f372928h, e24Var.f372928h) && n51.f.a(java.lang.Boolean.valueOf(this.f372929i), java.lang.Boolean.valueOf(e24Var.f372929i));
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
            java.lang.String str = this.f372924d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 1, this.f372925e);
            fVar.e(4, this.f372926f);
            fVar.e(5, this.f372927g);
            r45.nd7 nd7Var = this.f372928h;
            if (nd7Var != null) {
                fVar.i(6, nd7Var.computeSize());
                this.f372928h.writeFields(fVar);
            }
            fVar.a(7, this.f372929i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.f372924d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            int g17 = i18 + b36.f.g(3, 1, this.f372925e) + b36.f.e(4, this.f372926f) + b36.f.e(5, this.f372927g);
            r45.nd7 nd7Var2 = this.f372928h;
            if (nd7Var2 != null) {
                g17 += b36.f.i(6, nd7Var2.computeSize());
            }
            return g17 + b36.f.a(7, this.f372929i);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f372925e.clear();
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
        r45.e24 e24Var = (r45.e24) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    e24Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                e24Var.f372924d = aVar2.k(intValue);
                return 0;
            case 3:
                e24Var.f372925e.add(aVar2.k(intValue));
                return 0;
            case 4:
                e24Var.f372926f = aVar2.g(intValue);
                return 0;
            case 5:
                e24Var.f372927g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.nd7 nd7Var3 = new r45.nd7();
                    if (bArr3 != null && bArr3.length > 0) {
                        nd7Var3.parseFrom(bArr3);
                    }
                    e24Var.f372928h = nd7Var3;
                }
                return 0;
            case 7:
                e24Var.f372929i = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
