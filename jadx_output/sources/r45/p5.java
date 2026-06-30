package r45;

/* loaded from: classes8.dex */
public class p5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.l5 f382753d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f382754e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f382755f;

    static {
        new r45.p5();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.p5 parseFrom(byte[] bArr) {
        return (r45.p5) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p5)) {
            return false;
        }
        r45.p5 p5Var = (r45.p5) fVar;
        return n51.f.a(this.f382753d, p5Var.f382753d) && n51.f.a(this.f382754e, p5Var.f382754e) && n51.f.a(this.f382755f, p5Var.f382755f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.p5();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.l5 l5Var = this.f382753d;
            if (l5Var != null) {
                fVar.i(1, l5Var.computeSize());
                this.f382753d.writeFields(fVar);
            }
            fVar.g(2, 8, this.f382754e);
            java.lang.String str = this.f382755f;
            if (str != null) {
                fVar.j(6, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.l5 l5Var2 = this.f382753d;
            int i18 = (l5Var2 != null ? 0 + b36.f.i(1, l5Var2.computeSize()) : 0) + b36.f.g(2, 8, this.f382754e);
            java.lang.String str2 = this.f382755f;
            return str2 != null ? i18 + b36.f.j(6, str2) : i18;
        }
        if (i17 == 2) {
            this.f382754e.clear();
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.l5 l5Var3 = new r45.l5();
                if (bArr != null && bArr.length > 0) {
                    l5Var3.parseFrom(bArr);
                }
                this.f382753d = l5Var3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 6) {
                return -1;
            }
            this.f382755f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.o5 o5Var = new r45.o5();
            if (bArr2 != null && bArr2.length > 0) {
                o5Var.parseFrom(bArr2);
            }
            this.f382754e.add(o5Var);
        }
        return 0;
    }
}
