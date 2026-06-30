package yh5;

/* loaded from: classes3.dex */
public final class d implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yh5.e f462424a;

    public d(yh5.e eVar) {
        this.f462424a = eVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        yh5.g gVar;
        java.lang.Integer S;
        kotlin.jvm.internal.o.g(compoundButton, "<anonymous parameter 0>");
        yh5.e eVar = this.f462424a;
        if (eVar.f462430i) {
            return;
        }
        com.tencent.mars.xlog.Log.i("CleanGalleryToolbarComponent", "select changed position=" + eVar.f462431m + " checked=" + z17);
        eVar.f462428g = z17;
        int i17 = eVar.f462431m;
        if (i17 >= 0 && (gVar = eVar.f462429h) != null && i17 >= 0 && (S = kz5.z.S(gVar.f462433e, i17)) != null) {
            int intValue = S.intValue();
            com.tencent.mars.xlog.Log.i("CleanMediaDataProvider", "setSelectedAt position=" + i17 + " originIndex=" + intValue + " selected=" + z17);
            gVar.f462434f.set(intValue, z17);
        }
        eVar.X6(eVar.f462428g);
    }
}
