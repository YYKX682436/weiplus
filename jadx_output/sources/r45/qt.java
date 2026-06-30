package r45;

/* loaded from: classes8.dex */
public class qt extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f384249d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384250e;

    /* renamed from: f, reason: collision with root package name */
    public int f384251f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f384252g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f384253h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qt)) {
            return false;
        }
        r45.qt qtVar = (r45.qt) fVar;
        return n51.f.a(this.f384249d, qtVar.f384249d) && n51.f.a(this.f384250e, qtVar.f384250e) && n51.f.a(java.lang.Integer.valueOf(this.f384251f), java.lang.Integer.valueOf(qtVar.f384251f)) && n51.f.a(this.f384252g, qtVar.f384252g) && n51.f.a(this.f384253h, qtVar.f384253h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f384249d);
            java.lang.String str = this.f384250e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f384251f);
            java.lang.String str2 = this.f384252g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f384253h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, this.f384249d) + 0;
            java.lang.String str4 = this.f384250e;
            if (str4 != null) {
                g17 += b36.f.j(2, str4);
            }
            int e17 = g17 + b36.f.e(3, this.f384251f);
            java.lang.String str5 = this.f384252g;
            if (str5 != null) {
                e17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f384253h;
            return str6 != null ? e17 + b36.f.j(5, str6) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f384249d.clear();
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
        r45.qt qtVar = (r45.qt) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.s90 s90Var = new r45.s90();
                if (bArr2 != null && bArr2.length > 0) {
                    s90Var.parseFrom(bArr2);
                }
                qtVar.f384249d.add(s90Var);
            }
            return 0;
        }
        if (intValue == 2) {
            qtVar.f384250e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            qtVar.f384251f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            qtVar.f384252g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        qtVar.f384253h = aVar2.k(intValue);
        return 0;
    }
}
