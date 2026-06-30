package sp5;

/* loaded from: classes4.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f411326d;

    public b(android.widget.TextView textView) {
        this.f411326d = textView;
    }

    @Override // java.lang.Runnable
    public void run() {
        float j17 = i65.a.j(com.tencent.mm.sdk.platformtools.x2.f193071a);
        android.widget.TextView textView = this.f411326d;
        textView.setTextSize(0, textView.getTextSize() / j17);
    }
}
