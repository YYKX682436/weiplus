package s53;

/* loaded from: classes5.dex */
public class a implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.widget.AutoScrollTextView f403167d;

    public a(com.tencent.mm.plugin.game.widget.AutoScrollTextView autoScrollTextView) {
        this.f403167d = autoScrollTextView;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        java.lang.String str;
        com.tencent.mm.plugin.game.widget.AutoScrollTextView autoScrollTextView = this.f403167d;
        java.util.ArrayList arrayList = autoScrollTextView.f141924d;
        if (arrayList.size() >= 2) {
            if (autoScrollTextView.f141925e < arrayList.size() - 1) {
                int i17 = autoScrollTextView.f141925e + 1;
                autoScrollTextView.f141925e = i17;
                str = (java.lang.String) arrayList.get(i17);
            } else {
                autoScrollTextView.f141925e = 0;
                str = (java.lang.String) arrayList.get(0);
            }
            autoScrollTextView.a(autoScrollTextView.f141927g, str);
            autoScrollTextView.f141926f.startAnimation(autoScrollTextView.f141929i);
            autoScrollTextView.f141926f.setVisibility(8);
            autoScrollTextView.f141927g.startAnimation(autoScrollTextView.f141928h);
            autoScrollTextView.f141927g.setVisibility(0);
            android.widget.TextView textView = autoScrollTextView.f141926f;
            autoScrollTextView.f141926f = autoScrollTextView.f141927g;
            autoScrollTextView.f141927g = textView;
        }
        return true;
    }
}
