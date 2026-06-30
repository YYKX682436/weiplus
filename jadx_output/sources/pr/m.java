package pr;

/* loaded from: classes10.dex */
public final class m implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pr.o f357746a;

    public m(pr.o oVar) {
        this.f357746a = oVar;
    }

    @Override // fp0.p
    public void a(fp0.d dVar, fp0.u status) {
        pr.f task = (pr.f) dVar;
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(status, "status");
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPackSyncManager", "onLoaderFin: " + task.f357703f + ", " + status);
        pr.o oVar = this.f357746a;
        int i17 = oVar.f357753c + 1;
        oVar.f357753c = i17;
        if (i17 >= oVar.f357752b) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPackSyncManager", "onDesignerEnd: ");
            int i18 = (int) com.tencent.mm.sdk.platformtools.t8.i1();
            gr.v vVar = gr.v.f274696a;
            vVar.a(false);
            vVar.b().putInt("designer_sync_time", i18);
            pr.o oVar2 = pr.o.f357750e;
            if (oVar2 != null) {
                fp0.o oVar3 = oVar2.f357751a;
                oVar3.getClass();
                pm0.v.X(new fp0.i(oVar3));
                pr.m callback = oVar2.f357754d;
                kotlin.jvm.internal.o.g(callback, "callback");
                pm0.v.X(new fp0.n(oVar3, callback));
            }
            pr.o.f357750e = null;
        }
    }
}
