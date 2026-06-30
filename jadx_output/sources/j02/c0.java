package j02;

/* loaded from: classes8.dex */
public final class c0 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public static final j02.c0 f296981a = new j02.c0();

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.downloader.game.dl.protobuf.SetCloudGameRetainRecordResponse");
        if (i17 == 0 && i18 == 0) {
            com.tencent.mars.xlog.Log.i("GameDetainManager.GameCloudAppDownloadUI", "SetCloudGameRetainRecordResponse response  ok ");
        }
    }
}
