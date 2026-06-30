package ym5;

/* loaded from: classes5.dex */
public class d5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.FragmentActivity f463252d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.SmileyPanelImpl f463253e;

    public d5(com.tencent.mm.view.SmileyPanelImpl smileyPanelImpl, androidx.fragment.app.FragmentActivity fragmentActivity) {
        this.f463253e = smileyPanelImpl;
        this.f463252d = fragmentActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f463252d.mo133getLifecycle().a(this.f463253e);
    }
}
