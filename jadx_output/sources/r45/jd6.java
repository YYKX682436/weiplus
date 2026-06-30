package r45;

/* loaded from: classes7.dex */
public class jd6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.id6 f377726d;

    /* renamed from: e, reason: collision with root package name */
    public r45.id6 f377727e;

    /* renamed from: f, reason: collision with root package name */
    public r45.id6 f377728f;

    /* renamed from: g, reason: collision with root package name */
    public int f377729g;

    /* renamed from: h, reason: collision with root package name */
    public int f377730h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jd6)) {
            return false;
        }
        r45.jd6 jd6Var = (r45.jd6) fVar;
        return n51.f.a(this.f377726d, jd6Var.f377726d) && n51.f.a(this.f377727e, jd6Var.f377727e) && n51.f.a(this.f377728f, jd6Var.f377728f) && n51.f.a(java.lang.Integer.valueOf(this.f377729g), java.lang.Integer.valueOf(jd6Var.f377729g)) && n51.f.a(java.lang.Integer.valueOf(this.f377730h), java.lang.Integer.valueOf(jd6Var.f377730h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.id6 id6Var = this.f377726d;
            if (id6Var != null) {
                fVar.i(1, id6Var.computeSize());
                this.f377726d.writeFields(fVar);
            }
            r45.id6 id6Var2 = this.f377727e;
            if (id6Var2 != null) {
                fVar.i(2, id6Var2.computeSize());
                this.f377727e.writeFields(fVar);
            }
            r45.id6 id6Var3 = this.f377728f;
            if (id6Var3 != null) {
                fVar.i(3, id6Var3.computeSize());
                this.f377728f.writeFields(fVar);
            }
            fVar.e(4, this.f377729g);
            fVar.e(5, this.f377730h);
            return 0;
        }
        if (i17 == 1) {
            r45.id6 id6Var4 = this.f377726d;
            int i18 = id6Var4 != null ? 0 + b36.f.i(1, id6Var4.computeSize()) : 0;
            r45.id6 id6Var5 = this.f377727e;
            if (id6Var5 != null) {
                i18 += b36.f.i(2, id6Var5.computeSize());
            }
            r45.id6 id6Var6 = this.f377728f;
            if (id6Var6 != null) {
                i18 += b36.f.i(3, id6Var6.computeSize());
            }
            return i18 + b36.f.e(4, this.f377729g) + b36.f.e(5, this.f377730h);
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
        r45.jd6 jd6Var = (r45.jd6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.id6 id6Var7 = new r45.id6();
                if (bArr != null && bArr.length > 0) {
                    id6Var7.parseFrom(bArr);
                }
                jd6Var.f377726d = id6Var7;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.id6 id6Var8 = new r45.id6();
                if (bArr2 != null && bArr2.length > 0) {
                    id6Var8.parseFrom(bArr2);
                }
                jd6Var.f377727e = id6Var8;
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                jd6Var.f377729g = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            jd6Var.f377730h = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.id6 id6Var9 = new r45.id6();
            if (bArr3 != null && bArr3.length > 0) {
                id6Var9.parseFrom(bArr3);
            }
            jd6Var.f377728f = id6Var9;
        }
        return 0;
    }
}
