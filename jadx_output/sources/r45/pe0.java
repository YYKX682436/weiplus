package r45;

/* loaded from: classes2.dex */
public class pe0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.rl6 f382975d;

    /* renamed from: e, reason: collision with root package name */
    public r45.rl6 f382976e;

    /* renamed from: f, reason: collision with root package name */
    public r45.gq f382977f;

    /* renamed from: g, reason: collision with root package name */
    public r45.gq f382978g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f382979h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pe0)) {
            return false;
        }
        r45.pe0 pe0Var = (r45.pe0) fVar;
        return n51.f.a(this.f382975d, pe0Var.f382975d) && n51.f.a(this.f382976e, pe0Var.f382976e) && n51.f.a(this.f382977f, pe0Var.f382977f) && n51.f.a(this.f382978g, pe0Var.f382978g) && n51.f.a(this.f382979h, pe0Var.f382979h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.rl6 rl6Var = this.f382975d;
            if (rl6Var != null) {
                fVar.i(1, rl6Var.computeSize());
                this.f382975d.writeFields(fVar);
            }
            r45.rl6 rl6Var2 = this.f382976e;
            if (rl6Var2 != null) {
                fVar.i(2, rl6Var2.computeSize());
                this.f382976e.writeFields(fVar);
            }
            r45.gq gqVar = this.f382977f;
            if (gqVar != null) {
                fVar.i(3, gqVar.computeSize());
                this.f382977f.writeFields(fVar);
            }
            r45.gq gqVar2 = this.f382978g;
            if (gqVar2 != null) {
                fVar.i(4, gqVar2.computeSize());
                this.f382978g.writeFields(fVar);
            }
            java.lang.String str = this.f382979h;
            if (str != null) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.rl6 rl6Var3 = this.f382975d;
            int i18 = rl6Var3 != null ? 0 + b36.f.i(1, rl6Var3.computeSize()) : 0;
            r45.rl6 rl6Var4 = this.f382976e;
            if (rl6Var4 != null) {
                i18 += b36.f.i(2, rl6Var4.computeSize());
            }
            r45.gq gqVar3 = this.f382977f;
            if (gqVar3 != null) {
                i18 += b36.f.i(3, gqVar3.computeSize());
            }
            r45.gq gqVar4 = this.f382978g;
            if (gqVar4 != null) {
                i18 += b36.f.i(4, gqVar4.computeSize());
            }
            java.lang.String str2 = this.f382979h;
            return str2 != null ? i18 + b36.f.j(5, str2) : i18;
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
        r45.pe0 pe0Var = (r45.pe0) objArr[1];
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
                pe0Var.f382975d = rl6Var5;
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
                pe0Var.f382976e = rl6Var6;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                r45.gq gqVar5 = new r45.gq();
                if (bArr3 != null && bArr3.length > 0) {
                    gqVar5.parseFrom(bArr3);
                }
                pe0Var.f382977f = gqVar5;
            }
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            pe0Var.f382979h = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i29 = 0; i29 < size4; i29++) {
            byte[] bArr4 = (byte[]) j27.get(i29);
            r45.gq gqVar6 = new r45.gq();
            if (bArr4 != null && bArr4.length > 0) {
                gqVar6.parseFrom(bArr4);
            }
            pe0Var.f382978g = gqVar6;
        }
        return 0;
    }
}
