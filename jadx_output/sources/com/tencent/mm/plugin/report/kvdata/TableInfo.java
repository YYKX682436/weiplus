package com.tencent.mm.plugin.report.kvdata;

/* loaded from: classes8.dex */
public class TableInfo extends com.tencent.mm.protobuf.f {
    public long count_;
    public java.lang.String name_;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.report.kvdata.TableInfo)) {
            return false;
        }
        com.tencent.mm.plugin.report.kvdata.TableInfo tableInfo = (com.tencent.mm.plugin.report.kvdata.TableInfo) fVar;
        return n51.f.a(this.name_, tableInfo.name_) && n51.f.a(java.lang.Long.valueOf(this.count_), java.lang.Long.valueOf(tableInfo.count_));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.name_;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.count_);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.name_;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.count_);
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
        com.tencent.mm.plugin.report.kvdata.TableInfo tableInfo = (com.tencent.mm.plugin.report.kvdata.TableInfo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            tableInfo.name_ = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        tableInfo.count_ = aVar2.i(intValue);
        return 0;
    }
}
