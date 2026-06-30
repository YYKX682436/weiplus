package ig3;

/* loaded from: classes3.dex */
public final class j implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f291433d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f291434e;

    public j(android.view.View view, yz5.a aVar) {
        this.f291433d = view;
        this.f291434e = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f291433d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f291434e.invoke();
    }
}
