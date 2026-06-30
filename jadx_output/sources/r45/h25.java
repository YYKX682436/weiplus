package r45;

/* loaded from: classes9.dex */
public class h25 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.c50 f375784d;

    public com.tencent.mm.modelbase.i b() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.pay.x.CTRL_INDEX;
        lVar.f70666c = "/cgi-bin/micromsg-bin/oplog";
        lVar.f70664a = this;
        lVar.f70665b = new r45.i25();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
        iVar.p(a17);
        return iVar;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof r45.h25) && n51.f.a(this.f375784d, ((r45.h25) fVar).f375784d);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.c50 c50Var = this.f375784d;
            if (c50Var != null) {
                fVar.i(1, c50Var.computeSize());
                this.f375784d.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.c50 c50Var2 = this.f375784d;
            if (c50Var2 != null) {
                return 0 + b36.f.i(1, c50Var2.computeSize());
            }
            return 0;
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
        r45.h25 h25Var = (r45.h25) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.c50 c50Var3 = new r45.c50();
            if (bArr != null && bArr.length > 0) {
                c50Var3.parseFrom(bArr);
            }
            h25Var.f375784d = c50Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.f335114a.d(jSONObject, "Oplog", this.f375784d, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
