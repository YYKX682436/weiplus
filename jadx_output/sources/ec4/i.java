package ec4;

/* loaded from: classes4.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec4.j f251159d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ec4.j jVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f251159d = jVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader$clearFakeVideo$1");
        ec4.i iVar = new ec4.i(this.f251159d, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader$clearFakeVideo$1");
        return iVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader$clearFakeVideo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader$clearFakeVideo$1");
        ec4.i iVar = (ec4.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        iVar.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader$clearFakeVideo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader$clearFakeVideo$1");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader$clearFakeVideo$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ec4.j jVar = this.f251159d;
        int parseInt = java.lang.Integer.parseInt(r26.i0.v(ec4.j.a(jVar), "Locall_path", "", false, 4, null));
        com.tencent.mars.xlog.Log.i("MicroMag.BackgroundVideoFinishUploader", "clearFakeVideo: " + ec4.j.a(jVar) + ", " + parseInt);
        com.tencent.mm.plugin.sns.storage.m2 Hj = com.tencent.mm.plugin.sns.model.l4.Hj();
        java.lang.String X = ca4.z0.X(ec4.j.a(jVar));
        java.lang.String b07 = ca4.z0.b0(ec4.j.a(jVar));
        java.lang.String c07 = ca4.z0.c0(ec4.j.a(jVar));
        java.lang.String Z = ca4.z0.Z(ec4.j.a(jVar));
        java.lang.String u17 = Hj.u1(ec4.j.a(jVar));
        kotlin.jvm.internal.o.f(u17, "getMediaPath(...)");
        com.tencent.mm.vfs.w6.h(u17 + X);
        com.tencent.mm.vfs.w6.h(u17 + b07);
        com.tencent.mm.vfs.w6.h(u17 + c07);
        com.tencent.mm.vfs.w6.h(u17 + Z);
        com.tencent.mars.xlog.Log.i("MicroMag.BackgroundVideoFinishUploader", "clearFakeVideo >> cntPath: " + u17 + ", newMediaName: " + X + ", newThumbMediaName: " + b07 + ", newGridMediaName: " + c07 + ", newSightMediaName: " + Z);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deleteByLocalMediaId", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        sb6.append((long) parseInt);
        Hj.f166065d.delete("SnsMedia", "local_id=?", new java.lang.String[]{sb6.toString()});
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteByLocalMediaId", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader$clearFakeVideo$1");
        return f0Var;
    }
}
