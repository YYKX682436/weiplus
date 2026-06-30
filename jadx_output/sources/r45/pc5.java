package r45;

/* loaded from: classes2.dex */
public class pc5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f382939d;

    /* renamed from: e, reason: collision with root package name */
    public r45.o66 f382940e;

    /* renamed from: f, reason: collision with root package name */
    public r45.o66 f382941f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f382942g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f382943h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pc5)) {
            return false;
        }
        r45.pc5 pc5Var = (r45.pc5) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f382939d), java.lang.Boolean.valueOf(pc5Var.f382939d)) && n51.f.a(this.f382940e, pc5Var.f382940e) && n51.f.a(this.f382941f, pc5Var.f382941f) && n51.f.a(this.f382942g, pc5Var.f382942g) && n51.f.a(this.f382943h, pc5Var.f382943h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f382939d);
            r45.o66 o66Var = this.f382940e;
            if (o66Var != null) {
                fVar.i(2, o66Var.computeSize());
                this.f382940e.writeFields(fVar);
            }
            r45.o66 o66Var2 = this.f382941f;
            if (o66Var2 != null) {
                fVar.i(3, o66Var2.computeSize());
                this.f382941f.writeFields(fVar);
            }
            java.lang.String str = this.f382942g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f382943h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f382939d) + 0;
            r45.o66 o66Var3 = this.f382940e;
            if (o66Var3 != null) {
                a17 += b36.f.i(2, o66Var3.computeSize());
            }
            r45.o66 o66Var4 = this.f382941f;
            if (o66Var4 != null) {
                a17 += b36.f.i(3, o66Var4.computeSize());
            }
            java.lang.String str3 = this.f382942g;
            if (str3 != null) {
                a17 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f382943h;
            return str4 != null ? a17 + b36.f.j(5, str4) : a17;
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
        r45.pc5 pc5Var = (r45.pc5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            pc5Var.f382939d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.o66 o66Var5 = new r45.o66();
                if (bArr != null && bArr.length > 0) {
                    o66Var5.parseFrom(bArr);
                }
                pc5Var.f382940e = o66Var5;
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                pc5Var.f382942g = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            pc5Var.f382943h = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.o66 o66Var6 = new r45.o66();
            if (bArr2 != null && bArr2.length > 0) {
                o66Var6.parseFrom(bArr2);
            }
            pc5Var.f382941f = o66Var6;
        }
        return 0;
    }
}
