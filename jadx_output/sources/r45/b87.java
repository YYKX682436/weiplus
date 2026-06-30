package r45;

/* loaded from: classes7.dex */
public class b87 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.k87 f370634d;

    /* renamed from: f, reason: collision with root package name */
    public long f370636f;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f370635e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f370637g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.b87)) {
            return false;
        }
        r45.b87 b87Var = (r45.b87) fVar;
        return n51.f.a(this.f370634d, b87Var.f370634d) && n51.f.a(this.f370635e, b87Var.f370635e) && n51.f.a(java.lang.Long.valueOf(this.f370636f), java.lang.Long.valueOf(b87Var.f370636f)) && n51.f.a(this.f370637g, b87Var.f370637g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f370637g;
        java.util.LinkedList linkedList2 = this.f370635e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.k87 k87Var = this.f370634d;
            if (k87Var != null) {
                fVar.i(1, k87Var.computeSize());
                this.f370634d.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList2);
            fVar.h(3, this.f370636f);
            fVar.g(4, 6, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.k87 k87Var2 = this.f370634d;
            return (k87Var2 != null ? 0 + b36.f.i(1, k87Var2.computeSize()) : 0) + b36.f.g(2, 8, linkedList2) + b36.f.h(3, this.f370636f) + b36.f.g(4, 6, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        r45.b87 b87Var = (r45.b87) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.k87 k87Var3 = new r45.k87();
                if (bArr2 != null && bArr2.length > 0) {
                    k87Var3.parseFrom(bArr2);
                }
                b87Var.f370634d = k87Var3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                b87Var.f370636f = aVar2.i(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            b87Var.f370637g.add(aVar2.d(intValue));
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.y77 y77Var = new r45.y77();
            if (bArr3 != null && bArr3.length > 0) {
                y77Var.parseFrom(bArr3);
            }
            b87Var.f370635e.add(y77Var);
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.k87 k87Var = this.f370634d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "user_info", k87Var, false);
            eVar.d(jSONObject, "content_infos", this.f370635e, false);
            eVar.d(jSONObject, "total_file_size", java.lang.Long.valueOf(this.f370636f), false);
            eVar.d(jSONObject, "thumbnails", this.f370637g, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
