package in4;

/* loaded from: classes8.dex */
public class c0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f292951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.widget.TopStoryTipsPopupWindow f292952e;

    public c0(com.tencent.mm.plugin.topstory.ui.widget.TopStoryTipsPopupWindow topStoryTipsPopupWindow, android.view.View view) {
        this.f292952e = topStoryTipsPopupWindow;
        this.f292951d = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f292951d.postDelayed(new in4.b0(this), 175L);
    }
}
