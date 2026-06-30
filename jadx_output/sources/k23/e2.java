package k23;

/* loaded from: classes12.dex */
public final class e2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k23.j2 f303560d;

    public e2(k23.j2 j2Var) {
        this.f303560d = j2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/voice/FTSStartRecognizeBtnModeSwitch$setupThreeButtonMode$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSStartRecognizeBtnModeSwitch", "uploadButton clicked");
        k23.k1 k1Var = this.f303560d.f303596n;
        if (k1Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FTSStartRecognizeBtnModeSwitch", "uploadButton clicked but modeSwitchListener is null, ignored");
            yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/voice/FTSStartRecognizeBtnModeSwitch$setupThreeButtonMode$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            if (k1Var != null) {
                k1Var.f();
            }
            yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/voice/FTSStartRecognizeBtnModeSwitch$setupThreeButtonMode$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
