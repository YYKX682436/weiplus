package cq4;

/* loaded from: classes5.dex */
public final class a implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.widget.PagInputView f221461d;

    public a(com.tencent.mm.plugin.vlog.ui.widget.PagInputView pagInputView) {
        this.f221461d = pagInputView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z17) {
        this.f221461d.setImeVisibility(z17);
    }
}
