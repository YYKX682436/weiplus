package wk5;

/* loaded from: classes4.dex */
public final class a extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public boolean f446983d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f446983d = true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (this.f446983d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NotifyFirstOnResumeUIC", "first onResume() called send broadcast");
            getActivity().sendBroadcast(new android.content.Intent("com.tencent.mm.Intent.ACTION_ACT_ON_RESUME"));
        }
        this.f446983d = false;
    }
}
