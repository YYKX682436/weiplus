package r45;

/* loaded from: classes8.dex */
public class wf5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f389135d;

    /* renamed from: e, reason: collision with root package name */
    public int f389136e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f389137f;

    /* renamed from: g, reason: collision with root package name */
    public r45.sm4 f389138g;

    /* renamed from: h, reason: collision with root package name */
    public r45.o90 f389139h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wf5)) {
            return false;
        }
        r45.wf5 wf5Var = (r45.wf5) fVar;
        return n51.f.a(this.f389135d, wf5Var.f389135d) && n51.f.a(java.lang.Integer.valueOf(this.f389136e), java.lang.Integer.valueOf(wf5Var.f389136e)) && n51.f.a(this.f389137f, wf5Var.f389137f) && n51.f.a(this.f389138g, wf5Var.f389138g) && n51.f.a(this.f389139h, wf5Var.f389139h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f389135d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f389136e);
            java.lang.String str2 = this.f389137f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            r45.sm4 sm4Var = this.f389138g;
            if (sm4Var != null) {
                fVar.i(4, sm4Var.computeSize());
                this.f389138g.writeFields(fVar);
            }
            r45.o90 o90Var = this.f389139h;
            if (o90Var != null) {
                fVar.i(5, o90Var.computeSize());
                this.f389139h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f389135d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f389136e);
            java.lang.String str4 = this.f389137f;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            r45.sm4 sm4Var2 = this.f389138g;
            if (sm4Var2 != null) {
                j17 += b36.f.i(4, sm4Var2.computeSize());
            }
            r45.o90 o90Var2 = this.f389139h;
            return o90Var2 != null ? j17 + b36.f.i(5, o90Var2.computeSize()) : j17;
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
        r45.wf5 wf5Var = (r45.wf5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            wf5Var.f389135d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            wf5Var.f389136e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            wf5Var.f389137f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j18.get(i18);
                r45.sm4 sm4Var3 = new r45.sm4();
                if (bArr != null && bArr.length > 0) {
                    sm4Var3.parseFrom(bArr);
                }
                wf5Var.f389138g = sm4Var3;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size2 = j19.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j19.get(i19);
            r45.o90 o90Var3 = new r45.o90();
            if (bArr2 != null && bArr2.length > 0) {
                o90Var3.parseFrom(bArr2);
            }
            wf5Var.f389139h = o90Var3;
        }
        return 0;
    }
}
