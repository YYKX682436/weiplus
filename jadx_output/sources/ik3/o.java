package ik3;

/* loaded from: classes8.dex */
public final class o implements com.tencent.wechat.aff.star.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ik3.c f291906a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ik3.q f291907b;

    public o(ik3.c cVar, ik3.q qVar) {
        this.f291906a = cVar;
        this.f291907b = qVar;
    }

    @Override // com.tencent.wechat.aff.star.a
    public final void complete(boolean z17) {
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo;
        lk3.b U6;
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskAffFsc", "deleteByIdAndTypeAsync result: " + z17);
        if (!z17 || (multiTaskInfo = this.f291906a.f291889b) == null || (U6 = this.f291907b.U6()) == null) {
            return;
        }
        o75.b bVar = o75.b.f343584e;
        java.lang.String field_id = multiTaskInfo.field_id;
        kotlin.jvm.internal.o.f(field_id, "field_id");
        o75.c cVar = new o75.c(bVar, field_id, "MicroMsg.MultiTask.MultiTaskLiveStorage");
        cVar.f343590d = multiTaskInfo;
        U6.P6().notify(cVar);
    }
}
