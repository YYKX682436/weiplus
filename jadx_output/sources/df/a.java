package df;

/* loaded from: classes15.dex */
public final class a implements io.flutter.plugin.editing.WxKeyboardAction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df.d f229420a;

    public a(df.d dVar) {
        this.f229420a = dVar;
    }

    @Override // io.flutter.plugin.editing.WxKeyboardAction
    public boolean hideKeyboard() {
        df.d dVar = this.f229420a;
        if (dVar == null) {
            return false;
        }
        dVar.hideKeyboard();
        return false;
    }

    @Override // io.flutter.plugin.editing.WxKeyboardAction
    public boolean showKeyboard(android.view.View view, io.flutter.embedding.engine.systemchannels.TextInputChannel.WxInputConfiguration wxInputConfiguration) {
        df.d dVar = this.f229420a;
        if (dVar == null) {
            return true;
        }
        dVar.showKeyboard(view, wxInputConfiguration);
        return true;
    }
}
