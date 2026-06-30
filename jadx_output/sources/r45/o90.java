package r45;

/* loaded from: classes8.dex */
public class o90 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382043d;

    /* renamed from: e, reason: collision with root package name */
    public r45.wf5 f382044e;

    /* renamed from: f, reason: collision with root package name */
    public r45.wf5 f382045f;

    /* renamed from: g, reason: collision with root package name */
    public int f382046g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f382047h = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o90)) {
            return false;
        }
        r45.o90 o90Var = (r45.o90) fVar;
        return n51.f.a(this.f382043d, o90Var.f382043d) && n51.f.a(this.f382044e, o90Var.f382044e) && n51.f.a(this.f382045f, o90Var.f382045f) && n51.f.a(java.lang.Integer.valueOf(this.f382046g), java.lang.Integer.valueOf(o90Var.f382046g)) && n51.f.a(this.f382047h, o90Var.f382047h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f382047h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f382043d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.wf5 wf5Var = this.f382044e;
            if (wf5Var != null) {
                fVar.i(2, wf5Var.computeSize());
                this.f382044e.writeFields(fVar);
            }
            r45.wf5 wf5Var2 = this.f382045f;
            if (wf5Var2 != null) {
                fVar.i(3, wf5Var2.computeSize());
                this.f382045f.writeFields(fVar);
            }
            fVar.e(4, this.f382046g);
            fVar.g(5, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f382043d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            r45.wf5 wf5Var3 = this.f382044e;
            if (wf5Var3 != null) {
                j17 += b36.f.i(2, wf5Var3.computeSize());
            }
            r45.wf5 wf5Var4 = this.f382045f;
            if (wf5Var4 != null) {
                j17 += b36.f.i(3, wf5Var4.computeSize());
            }
            return j17 + b36.f.e(4, this.f382046g) + b36.f.g(5, 1, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.o90 o90Var = (r45.o90) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            o90Var.f382043d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j18.get(i18);
                r45.wf5 wf5Var5 = new r45.wf5();
                if (bArr2 != null && bArr2.length > 0) {
                    wf5Var5.parseFrom(bArr2);
                }
                o90Var.f382044e = wf5Var5;
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                o90Var.f382046g = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            o90Var.f382047h.add(aVar2.k(intValue));
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size2 = j19.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j19.get(i19);
            r45.wf5 wf5Var6 = new r45.wf5();
            if (bArr3 != null && bArr3.length > 0) {
                wf5Var6.parseFrom(bArr3);
            }
            o90Var.f382045f = wf5Var6;
        }
        return 0;
    }
}
