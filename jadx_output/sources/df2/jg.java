package df2;

/* loaded from: classes3.dex */
public final class jg implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ug f230477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jz5.g f230478e;

    public jg(df2.ug ugVar, jz5.g gVar) {
        this.f230477d = ugVar;
        this.f230478e = gVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        boolean z17 = obj instanceof dk2.zf;
        jz5.f0 f0Var = jz5.f0.f302826a;
        df2.ug ugVar = this.f230477d;
        if (z17 && (obj instanceof dk2.cg)) {
            jz5.g gVar = this.f230478e;
            df2.tf tfVar = (df2.tf) gVar.getValue();
            dk2.zf zfVar = (dk2.zf) obj;
            java.lang.String f17 = zfVar.f();
            if (f17 == null) {
                f17 = "";
            }
            dk2.cg msg = (dk2.cg) obj;
            tfVar.getClass();
            kotlin.jvm.internal.o.g(msg, "msg");
            if (kotlin.jvm.internal.o.b(tfVar.f231436a, f17) && tfVar.f231438c == msg.o() && tfVar.f231437b == msg.s() && tfVar.f231439d == msg.g()) {
                java.lang.String str = ugVar.f231522m;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LiveDanmaku_step3_0 updateCommentDanmakuMsg ");
                sb6.append(obj.hashCode());
                sb6.append(", ");
                dk2.zf zfVar2 = (dk2.zf) obj;
                sb6.append(zfVar2.j());
                sb6.append(",seq:");
                sb6.append(zfVar2.m());
                sb6.append(" same with last!");
                com.tencent.mars.xlog.Log.i(str, sb6.toString());
                df2.tf tfVar2 = (df2.tf) gVar.getValue();
                java.lang.String f18 = zfVar2.f();
                tfVar2.a(f18 != null ? f18 : "", (dk2.cg) obj);
                return f0Var;
            }
            df2.tf tfVar3 = (df2.tf) gVar.getValue();
            java.lang.String f19 = zfVar.f();
            tfVar3.a(f19 != null ? f19 : "", msg);
            java.lang.String str2 = ugVar.f231522m;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("LiveDanmaku_step3_0 updateCommentDanmakuMsg ");
            sb7.append(obj.hashCode());
            sb7.append(',');
            dk2.zf zfVar3 = (dk2.zf) obj;
            sb7.append(zfVar3.j());
            sb7.append(",seq:");
            sb7.append(zfVar3.m());
            com.tencent.mars.xlog.Log.i(str2, sb7.toString());
            xs2.u uVar = ugVar.f231526q;
            if (uVar != null) {
                uVar.c(obj);
            }
        } else if (obj instanceof lm2.c) {
            java.lang.String str3 = ugVar.f231522m;
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("LiveDanmaku_step3_0 updateBoxDanmakuMsg ");
            lm2.c cVar = (lm2.c) obj;
            sb8.append(cVar.hashCode());
            sb8.append(',');
            sb8.append(cVar.j());
            sb8.append(",seq:");
            sb8.append(cVar.e());
            com.tencent.mars.xlog.Log.i(str3, sb8.toString());
            xs2.u uVar2 = ugVar.f231526q;
            if (uVar2 != null) {
                uVar2.c(obj);
            }
        }
        return f0Var;
    }
}
