package dc2;

/* loaded from: classes3.dex */
public final class f implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f228698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.edit.FinderLiveFixRatioPhoneEditPluginLayout f228699e;

    public f(android.widget.Button button, com.tencent.mm.plugin.finder.edit.FinderLiveFixRatioPhoneEditPluginLayout finderLiveFixRatioPhoneEditPluginLayout) {
        this.f228698d = button;
        this.f228699e = finderLiveFixRatioPhoneEditPluginLayout;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/edit/FinderLiveFixRatioPhoneEditPluginLayout$setLiveEditLayout$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.EditPhotoPluginLayout", "action " + motionEvent.getAction());
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            this.f228698d.setVisibility(0);
        }
        int i17 = com.tencent.mm.plugin.finder.edit.FinderLiveFixRatioPhoneEditPluginLayout.f105304x;
        boolean onTouchEvent = this.f228699e.onTouchEvent(motionEvent);
        yj0.a.i(onTouchEvent, this, "com/tencent/mm/plugin/finder/edit/FinderLiveFixRatioPhoneEditPluginLayout$setLiveEditLayout$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return onTouchEvent;
    }
}
