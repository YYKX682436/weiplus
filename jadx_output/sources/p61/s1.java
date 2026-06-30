package p61;

/* loaded from: classes5.dex */
public class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindMContactUI f352369d;

    public s1(com.tencent.mm.plugin.account.bind.ui.BindMContactUI bindMContactUI) {
        this.f352369d = bindMContactUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Object[] objArr = {com.tencent.mm.sdk.platformtools.m2.d()};
        com.tencent.mm.plugin.account.bind.ui.BindMContactUI bindMContactUI = this.f352369d;
        c71.b.c(bindMContactUI, bindMContactUI.getString(com.tencent.mm.R.string.f492238fr0, objArr), 30765, true);
        db5.f.h(bindMContactUI);
    }
}
