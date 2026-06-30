package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public abstract class i00 {
    public static final java.lang.String a(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null) {
            return "null";
        }
        if (fVar instanceof bw5.gg) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{FinderGetOftenReadAuthorReq with finderUsername=");
            bw5.gg ggVar = (bw5.gg) fVar;
            boolean[] zArr = ggVar.f27839i;
            sb6.append(zArr[3] ? ggVar.f27835e : "");
            sb6.append(", lastBuffer=");
            com.tencent.mm.protobuf.g gVar = zArr[6] ? ggVar.f27838h : com.tencent.mm.protobuf.g.f192155b;
            sb6.append(gVar != null ? gVar.f192156a.length : -1);
            sb6.append(" bytes, location=(");
            sb6.append(ggVar.f27836f);
            sb6.append(", ");
            sb6.append(ggVar.f27837g);
            sb6.append(") }");
            return sb6.toString();
        }
        if (!(fVar instanceof bw5.ig)) {
            java.lang.String jSONObject = pm0.b0.g(fVar).toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            return jSONObject;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("{FinderGetOftenReadAuthorResp with ");
        bw5.ig igVar = (bw5.ig) fVar;
        java.util.LinkedList linkedList = igVar.f28571d;
        sb7.append(linkedList.size());
        sb7.append(" items [");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            bw5.ae b17 = ((bw5.hg) it.next()).b();
            arrayList.add(b17.Z[2] ? b17.f25145e : "");
        }
        sb7.append(arrayList);
        sb7.append("], continueFlag=");
        sb7.append(igVar.f28572e);
        sb7.append(", lastBuffer=");
        com.tencent.mm.protobuf.g lastBuffer = igVar.getLastBuffer();
        sb7.append(lastBuffer != null ? lastBuffer.f192156a.length : -1);
        sb7.append(" bytes, fromSessionId=");
        sb7.append((igVar.f28576i[5] ? igVar.f28574g : "").length());
        sb7.append(" }");
        return sb7.toString();
    }
}
