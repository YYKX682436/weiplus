package du3;

/* loaded from: classes3.dex */
public final class c4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f243553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ du3.h4 f243554e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(java.util.ArrayList arrayList, du3.h4 h4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f243553d = arrayList;
        this.f243554e = h4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new du3.c4(this.f243553d, this.f243554e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        du3.c4 c4Var = (du3.c4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        c4Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        for (hk0.j jVar : this.f243553d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoUndoPlugin", "collect event >> " + jVar.f281752a);
            du3.h4 h4Var = this.f243554e;
            android.os.Bundle bundle = jVar.f281753b;
            int i17 = jVar.f281752a;
            if (i17 == 1) {
                h4Var.z(h4Var.D(), bundle.getBoolean("BUNDLE_KEY_BOOLEAN_1"));
            } else if (i17 == 2) {
                h4Var.z(h4Var.B(), bundle.getBoolean("BUNDLE_KEY_BOOLEAN_1"));
            }
        }
        return jz5.f0.f302826a;
    }
}
