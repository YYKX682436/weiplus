package r45;

/* loaded from: classes2.dex */
public class m25 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.rl6 f380100d;

    /* renamed from: e, reason: collision with root package name */
    public r45.rl6 f380101e;

    /* renamed from: f, reason: collision with root package name */
    public r45.zi6 f380102f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f380103g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f380104h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m25)) {
            return false;
        }
        r45.m25 m25Var = (r45.m25) fVar;
        return n51.f.a(this.f380100d, m25Var.f380100d) && n51.f.a(this.f380101e, m25Var.f380101e) && n51.f.a(this.f380102f, m25Var.f380102f) && n51.f.a(java.lang.Boolean.valueOf(this.f380103g), java.lang.Boolean.valueOf(m25Var.f380103g)) && n51.f.a(java.lang.Boolean.valueOf(this.f380104h), java.lang.Boolean.valueOf(m25Var.f380104h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.rl6 rl6Var = this.f380100d;
            if (rl6Var != null) {
                fVar.i(1, rl6Var.computeSize());
                this.f380100d.writeFields(fVar);
            }
            r45.rl6 rl6Var2 = this.f380101e;
            if (rl6Var2 != null) {
                fVar.i(2, rl6Var2.computeSize());
                this.f380101e.writeFields(fVar);
            }
            r45.zi6 zi6Var = this.f380102f;
            if (zi6Var != null) {
                fVar.i(3, zi6Var.computeSize());
                this.f380102f.writeFields(fVar);
            }
            fVar.a(4, this.f380103g);
            fVar.a(5, this.f380104h);
            return 0;
        }
        if (i17 == 1) {
            r45.rl6 rl6Var3 = this.f380100d;
            int i18 = rl6Var3 != null ? 0 + b36.f.i(1, rl6Var3.computeSize()) : 0;
            r45.rl6 rl6Var4 = this.f380101e;
            if (rl6Var4 != null) {
                i18 += b36.f.i(2, rl6Var4.computeSize());
            }
            r45.zi6 zi6Var2 = this.f380102f;
            if (zi6Var2 != null) {
                i18 += b36.f.i(3, zi6Var2.computeSize());
            }
            return i18 + b36.f.a(4, this.f380103g) + b36.f.a(5, this.f380104h);
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
        r45.m25 m25Var = (r45.m25) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.rl6 rl6Var5 = new r45.rl6();
                if (bArr != null && bArr.length > 0) {
                    rl6Var5.parseFrom(bArr);
                }
                m25Var.f380100d = rl6Var5;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.rl6 rl6Var6 = new r45.rl6();
                if (bArr2 != null && bArr2.length > 0) {
                    rl6Var6.parseFrom(bArr2);
                }
                m25Var.f380101e = rl6Var6;
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                m25Var.f380103g = aVar2.c(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            m25Var.f380104h = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.zi6 zi6Var3 = new r45.zi6();
            if (bArr3 != null && bArr3.length > 0) {
                zi6Var3.parseFrom(bArr3);
            }
            m25Var.f380102f = zi6Var3;
        }
        return 0;
    }
}
