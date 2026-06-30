package ht2;

/* loaded from: classes2.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f284856d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f284857e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f284858f;

    public m(yz5.p pVar, android.widget.TextView textView, com.tencent.mm.ui.widget.imageview.WeImageView weImageView) {
        this.f284856d = pVar;
        this.f284857e = textView;
        this.f284858f = weImageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f284856d.invoke(this.f284857e, this.f284858f);
    }
}
