package cq2;

/* loaded from: classes2.dex */
public final class c implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f221377d;

    public c(yz5.l lVar) {
        this.f221377d = lVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        gm0.j1.d().q(6479, this);
        yz5.l lVar = this.f221377d;
        if (i17 == 0 && i18 == 0 && (scene instanceof db2.q5)) {
            java.util.LinkedList M = ((db2.q5) scene).M();
            com.tencent.mars.xlog.Log.i("KtvStreamDataRequester", "requestKtvStreamData: 请求成功，获取到 " + M.size() + " 个直播间");
            com.tencent.mm.sdk.platformtools.u3.h(new cq2.a(lVar, M));
            return;
        }
        com.tencent.mars.xlog.Log.e("KtvStreamDataRequester", "requestKtvStreamData: 请求失败 errType=" + i17 + ", errCode=" + i18);
        com.tencent.mm.sdk.platformtools.u3.h(new cq2.b(lVar));
    }
}
