package r45;

/* loaded from: classes9.dex */
public class av3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f370271d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370272e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f370273f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f370274g;

    /* renamed from: h, reason: collision with root package name */
    public int f370275h;

    /* renamed from: i, reason: collision with root package name */
    public r45.zu3 f370276i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.av3)) {
            return false;
        }
        r45.av3 av3Var = (r45.av3) fVar;
        return n51.f.a(this.f370271d, av3Var.f370271d) && n51.f.a(this.f370272e, av3Var.f370272e) && n51.f.a(this.f370273f, av3Var.f370273f) && n51.f.a(java.lang.Boolean.valueOf(this.f370274g), java.lang.Boolean.valueOf(av3Var.f370274g)) && n51.f.a(java.lang.Integer.valueOf(this.f370275h), java.lang.Integer.valueOf(av3Var.f370275h)) && n51.f.a(this.f370276i, av3Var.f370276i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f370271d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f370272e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f370273f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.a(4, this.f370274g);
            fVar.e(5, this.f370275h);
            r45.zu3 zu3Var = this.f370276i;
            if (zu3Var != null) {
                fVar.i(6, zu3Var.computeSize());
                this.f370276i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f370271d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f370272e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f370273f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            int a17 = j17 + b36.f.a(4, this.f370274g) + b36.f.e(5, this.f370275h);
            r45.zu3 zu3Var2 = this.f370276i;
            return zu3Var2 != null ? a17 + b36.f.i(6, zu3Var2.computeSize()) : a17;
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
        r45.av3 av3Var = (r45.av3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                av3Var.f370271d = aVar2.k(intValue);
                return 0;
            case 2:
                av3Var.f370272e = aVar2.k(intValue);
                return 0;
            case 3:
                av3Var.f370273f = aVar2.k(intValue);
                return 0;
            case 4:
                av3Var.f370274g = aVar2.c(intValue);
                return 0;
            case 5:
                av3Var.f370275h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.zu3 zu3Var3 = new r45.zu3();
                    if (bArr != null && bArr.length > 0) {
                        zu3Var3.parseFrom(bArr);
                    }
                    av3Var.f370276i = zu3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
