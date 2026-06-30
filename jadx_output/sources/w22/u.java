package w22;

/* loaded from: classes10.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w22.v f442578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f442579e;

    public u(w22.v vVar, kotlin.jvm.internal.h0 h0Var) {
        this.f442578d = vVar;
        this.f442579e = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emojicapture/presenter/EditorPresenter$updateTextWithoutCheck$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        w22.v vVar = this.f442578d;
        r22.d dVar = vVar.f442581b;
        kotlin.jvm.internal.h0 h0Var = this.f442579e;
        ((com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer) dVar).b(true, ((com.tencent.mm.plugin.emojicapture.ui.editor.TextEditorItemView) h0Var.f310123d).getText(), ((com.tencent.mm.plugin.emojicapture.ui.editor.TextEditorItemView) h0Var.f310123d).getTextColor());
        com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter emojiCaptureReporter = vVar.f442584e;
        com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter.b(13, emojiCaptureReporter.f98583d, 0L, 0L, 0L, 0L, 0L, 0, 0, emojiCaptureReporter.G);
        yj0.a.h(this, "com/tencent/mm/plugin/emojicapture/presenter/EditorPresenter$updateTextWithoutCheck$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
