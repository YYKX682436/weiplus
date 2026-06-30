package i33;

/* loaded from: classes10.dex */
public final class g extends i33.c implements i33.n1 {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f288188f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f288189g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f288190h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f288188f = "MicroMsg.AlbumConfirmButtonUIC";
        this.f288190h = jz5.h.b(new i33.f(activity));
    }

    @Override // i33.n1
    public android.widget.TextView Y2() {
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f288190h).getValue();
        kotlin.jvm.internal.o.f(textView, "<get-btnConfirm>(...)");
        return textView;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity != null) {
            mMActivity.makeActionBarOperationAreaToCenter();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateBefore(android.os.Bundle bundle) {
        super.onCreateBefore(bundle);
    }

    @Override // i33.n1
    public void q6(java.lang.String btnString, yz5.a aVar, com.tencent.mm.ui.fb style) {
        kotlin.jvm.internal.o.g(btnString, "btnString");
        kotlin.jvm.internal.o.g(style, "style");
        super.q6(btnString, aVar, style);
        this.f288189g = true;
    }
}
