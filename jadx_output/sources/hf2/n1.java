package hf2;

/* loaded from: classes10.dex */
public final class n1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.p1 f281123d;

    public n1(hf2.p1 p1Var) {
        this.f281123d = p1Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.util.LinkedList linkedList = (java.util.LinkedList) obj;
        hf2.p1 p1Var = this.f281123d;
        java.lang.String str = p1Var.f281137b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("observe dropStickerInfo dropInfo:$");
        sb6.append(linkedList);
        sb6.append(",editing:");
        hf2.x xVar = p1Var.f281136a;
        sb6.append(xVar.F);
        sb6.append('!');
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (!(linkedList == null || linkedList.isEmpty())) {
            hf2.h1 h1Var = new hf2.h1(p1Var, linkedList);
            if (xVar.F) {
                p1Var.a().add(h1Var);
            } else {
                h1Var.run();
            }
        }
        return jz5.f0.f302826a;
    }
}
