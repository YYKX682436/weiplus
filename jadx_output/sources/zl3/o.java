package zl3;

/* loaded from: classes11.dex */
public final class o implements com.tencent.pigeon.flutter_music_chat.FlutterSendMusicToChatAction, io.flutter.embedding.engine.plugins.FlutterPlugin {
    @Override // com.tencent.pigeon.flutter_music_chat.FlutterSendMusicToChatAction
    public com.tencent.pigeon.flutter_music_chat.SendMusicResponse getChatUserName() {
        yl3.f fVar = ((ma0.h) ((ka0.i0) i95.n0.c(ka0.i0.class))).f325140e;
        java.lang.String str = fVar != null ? ((com.tencent.mm.pluginsdk.model.app.v0) fVar).f189102a : null;
        if (str == null) {
            str = "";
        }
        return new com.tencent.pigeon.flutter_music_chat.SendMusicResponse(str);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.flutter_music_chat.FlutterSendMusicToChatAction.Companion companion = com.tencent.pigeon.flutter_music_chat.FlutterSendMusicToChatAction.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.flutter_music_chat.FlutterSendMusicToChatAction.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.flutter_music_chat.FlutterSendMusicToChatAction.Companion companion = com.tencent.pigeon.flutter_music_chat.FlutterSendMusicToChatAction.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.flutter_music_chat.FlutterSendMusicToChatAction.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }

    @Override // com.tencent.pigeon.flutter_music_chat.FlutterSendMusicToChatAction
    public void sendMusicToChat(com.tencent.pigeon.flutter_music_chat.SendMusicRequest request) {
        kotlin.jvm.internal.o.g(request, "request");
        ot0.q qVar = new ot0.q();
        qVar.f348666i = 76;
        qVar.f348654f = request.getSongName();
        qVar.f348658g = request.getSinger();
        java.lang.String webUrl = request.getWebUrl();
        if (webUrl == null) {
            webUrl = "";
        }
        qVar.f348674k = webUrl;
        qVar.f348678l = "";
        java.lang.String dataUrl = request.getDataUrl();
        if (dataUrl == null) {
            dataUrl = "";
        }
        qVar.V = dataUrl;
        qVar.W = "";
        qVar.f348646d = request.getAppid();
        com.tencent.mm.pluginsdk.ui.tools.i0 i0Var = new com.tencent.mm.pluginsdk.ui.tools.i0();
        i0Var.f191690b = request.getCoverUrl();
        i0Var.f191691c = request.getLyric();
        i0Var.f191704p = request.getMid();
        i0Var.f191696h = request.getSinger();
        i0Var.f191694f = request.getCoverUrl();
        qVar.f(i0Var);
        yl3.f fVar = ((ma0.h) ((ka0.i0) i95.n0.c(ka0.i0.class))).f325140e;
        if (fVar != null) {
            com.tencent.mm.pluginsdk.model.app.k0.I(ot0.q.i(qVar), qVar.f348646d, qVar.H, ((com.tencent.mm.pluginsdk.model.app.v0) fVar).f189102a, "", null);
        }
    }
}
