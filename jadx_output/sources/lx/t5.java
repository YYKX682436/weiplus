package lx;

/* loaded from: classes11.dex */
public final class t5 implements com.tencent.pigeon.biz.BizTextCoverApi, io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f321954d;

    /* renamed from: e, reason: collision with root package name */
    public rv.f3 f321955e;

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f321954d = binding.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.biz.BizTextCoverApi.Companion companion = com.tencent.pigeon.biz.BizTextCoverApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz.BizTextCoverApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // com.tencent.pigeon.biz.BizTextCoverApi
    public void onCancelCreateTextCover() {
        rv.f3 f3Var = this.f321955e;
        if (f3Var != null) {
            f3Var.onCancel();
        }
        android.app.Activity activity = this.f321954d;
        if (activity != null) {
            activity.setResult(-1);
        }
        android.app.Activity activity2 = this.f321954d;
        if (activity2 != null) {
            activity2.finish();
        }
    }

    @Override // com.tencent.pigeon.biz.BizTextCoverApi
    public void onConfirmCreateTextCover(com.tencent.pigeon.biz.BizTextCoverInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        if (this.f321954d == null) {
            return;
        }
        java.lang.String coverUrl = info.getCoverUrl();
        if (coverUrl == null || coverUrl.length() == 0) {
            return;
        }
        rv.f3 f3Var = this.f321955e;
        if (f3Var != null) {
            f3Var.a(info.getCoverUrl(), info.getCoverId(), info.getPrompt(), 2L, info.getTemplateId(), info.getDataBuf(), info.getStyle());
        }
        android.app.Activity activity = this.f321954d;
        kotlin.jvm.internal.o.d(activity);
        android.content.Intent intent = activity.getIntent();
        intent.putExtra("BizTextCoverEditorUI_kEditorResultPath", info.getCoverUrl());
        intent.putExtra("BizTextCoverEditorUI_kEditorResultPicId", info.getCoverId());
        intent.putExtra("BizTextCoverEditorUI_kEditorResultPrompt", info.getPrompt());
        intent.putExtra("BizTextCoverEditorUI_kEditorResultSource", 2L);
        intent.putExtra("BizTextCoverEditorUI_kEditorResultTemplateId", info.getTemplateId());
        intent.putExtra("BizTextCoverEditorUI_kEditorResultDataBuf", info.getDataBuf());
        intent.putExtra("BizTextCoverEditorUI_kEditorResultStyle", info.getStyle());
        android.app.Activity activity2 = this.f321954d;
        if (activity2 != null) {
            activity2.setResult(0, intent);
        }
        android.app.Activity activity3 = this.f321954d;
        if (activity3 != null) {
            activity3.finish();
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f321954d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f321954d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.biz.BizTextCoverApi.Companion companion = com.tencent.pigeon.biz.BizTextCoverApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz.BizTextCoverApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }

    @Override // com.tencent.pigeon.biz.BizTextCoverApi
    public void onEmoticonBoardVisibilityChanged(boolean z17) {
        rv.f3 f3Var = this.f321955e;
        if (f3Var != null) {
            f3Var.b(!z17);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f321954d = binding.getActivity();
    }

    @Override // com.tencent.pigeon.biz.BizTextCoverApi
    public void showAgreeTermsDialog(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        if (this.f321954d == null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE)));
            return;
        }
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(this.f321954d);
        j0Var.f211845z.setVisibility(0);
        j0Var.f211833n.setVisibility(0);
        j0Var.f211833n.setText(com.tencent.mm.R.string.ng6);
        j0Var.z(com.tencent.mm.R.string.ng7, new lx.r5(callback));
        j0Var.u(com.tencent.mm.R.string.ng8, new lx.s5(callback));
        j0Var.show();
    }
}
